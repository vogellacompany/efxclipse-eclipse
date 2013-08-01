/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxml.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fx.ide.fxgraph.converter.FXGraphConverter;
import org.eclipse.fx.ide.fxgraph.converter.FXMLLoader;
import org.eclipse.fx.ide.fxgraph.converter.IFXMLFile;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.xml.sax.SAXException;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class FXGraphCompiler {
	
	@Inject 
	private Provider<ResourceSet> resourceSetProvider;
	
	public static void main(String[] args) {
		Injector injector = new org.eclipse.fx.ide.fxgraph.FXGraphStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		FXGraphCompiler main = injector.getInstance(FXGraphCompiler.class);
		try {
			main.compile(injector, args[0], args[1],null);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void compile(Injector injector, final String string, final String sourcePrefix, String outputPrefix) throws SAXException, IOException, ParserConfigurationException {
		Model m;
		String fxgraph = string;
		if( string.endsWith("fxml") ) {
			SAXParserFactory f = SAXParserFactory.newInstance();
			f.setNamespaceAware(true);
			SAXParser p = f.newSAXParser();
			
			FXMLSaxHandler h = injector.getInstance(FXMLSaxHandler.class);
			IFXMLFile fi = new IFXMLFile() {
				
				@Override
				public String getPackagename() {
					if( sourcePrefix == null) {
						return "dummy";
					} else {
						String filePath = new File(string).getParent();
						String packagename = filePath.substring(sourcePrefix.length());
						return packagename.replace('/', '.');
					}
				}
				
				@Override
				public String getName() {
					return new File(string).getName();
				}
				
				@Override
				public InputStream getContent() {
					try {
						return new FileInputStream(string);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
				}
			};
			h.setFile(fi);
			p.parse(fi.getContent(), h);
			
			fxgraph = "/tmp/"+UUID.randomUUID().toString()+".fxgraph";
			
			File out = new File(fxgraph);
			System.err.println(out);
//			out.deleteOnExit();
			try {
				FileOutputStream outStream = new FileOutputStream(out);
				outStream.write(new FXGraphGenerator().generate(h.model).toString().getBytes());
				outStream.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createURI(fxgraph), true);
		
		m = (Model)resource.getContents().get(0);	
		
		FXGraphJavaGenerator c = new FXGraphJavaGenerator();
		
		try {
			String outFile = string.replaceAll("fxgraph$", "java").replaceAll("fxml$", "java");
			
			if( outputPrefix != null ) {
				String filePath = new File(outFile).getAbsolutePath();
				String packagename = filePath.substring(sourcePrefix.length()+1);
				File f = new File(outputPrefix,packagename);
				f.getParentFile().mkdirs();
				outFile = f.getAbsolutePath();
			}
			
			FileOutputStream out = new FileOutputStream(outFile);
			out.write(c.generate(m).toString().getBytes());
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
