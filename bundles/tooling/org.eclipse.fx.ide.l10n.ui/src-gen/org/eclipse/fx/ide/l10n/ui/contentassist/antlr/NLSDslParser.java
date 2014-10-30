/*
* generated by Xtext
*/
package org.eclipse.fx.ide.l10n.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.fx.ide.l10n.services.NLSDslGrammarAccess;

public class NLSDslParser extends AbstractContentAssistParser {
	
	@Inject
	private NLSDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.fx.ide.l10n.ui.contentassist.antlr.internal.InternalNLSDslParser createParser() {
		org.eclipse.fx.ide.l10n.ui.contentassist.antlr.internal.InternalNLSDslParser result = new org.eclipse.fx.ide.l10n.ui.contentassist.antlr.internal.InternalNLSDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMessageEntryAccess().getAlternatives_3(), "rule__MessageEntry__Alternatives_3");
					put(grammarAccess.getRichStringAccess().getAlternatives(), "rule__RichString__Alternatives");
					put(grammarAccess.getPredefinedTypesAccess().getAlternatives(), "rule__PredefinedTypes__Alternatives");
					put(grammarAccess.getNLSAccess().getGroup(), "rule__NLS__Group__0");
					put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
					put(grammarAccess.getNLSBundleAccess().getGroup(), "rule__NLSBundle__Group__0");
					put(grammarAccess.getNLSFormatterAccess().getGroup(), "rule__NLSFormatter__Group__0");
					put(grammarAccess.getMessageEntryAccess().getGroup(), "rule__MessageEntry__Group__0");
					put(grammarAccess.getMessageEntryAccess().getGroup_1(), "rule__MessageEntry__Group_1__0");
					put(grammarAccess.getMessageEntryAccess().getGroup_1_2(), "rule__MessageEntry__Group_1_2__0");
					put(grammarAccess.getMessageEntryAccess().getGroup_3_0(), "rule__MessageEntry__Group_3_0__0");
					put(grammarAccess.getMessageEntryAccess().getGroup_3_0_2(), "rule__MessageEntry__Group_3_0_2__0");
					put(grammarAccess.getMessageEntryAccess().getGroup_3_1(), "rule__MessageEntry__Group_3_1__0");
					put(grammarAccess.getMessageParamAccess().getGroup(), "rule__MessageParam__Group__0");
					put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
					put(grammarAccess.getRichStringAccess().getGroup_1(), "rule__RichString__Group_1__0");
					put(grammarAccess.getRichStringAccess().getGroup_1_2(), "rule__RichString__Group_1_2__0");
					put(grammarAccess.getRichVarPartAccess().getGroup(), "rule__RichVarPart__Group__0");
					put(grammarAccess.getRichVarPartAccess().getGroup_1(), "rule__RichVarPart__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getNLSAccess().getPackageAssignment_0(), "rule__NLS__PackageAssignment_0");
					put(grammarAccess.getNLSAccess().getBundleListAssignment_2(), "rule__NLS__BundleListAssignment_2");
					put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1(), "rule__PackageDeclaration__NameAssignment_1");
					put(grammarAccess.getNLSBundleAccess().getNameAssignment_1(), "rule__NLSBundle__NameAssignment_1");
					put(grammarAccess.getNLSBundleAccess().getLangAssignment_3(), "rule__NLSBundle__LangAssignment_3");
					put(grammarAccess.getNLSBundleAccess().getFormatterListAssignment_5(), "rule__NLSBundle__FormatterListAssignment_5");
					put(grammarAccess.getNLSBundleAccess().getMessageEntryListAssignment_6(), "rule__NLSBundle__MessageEntryListAssignment_6");
					put(grammarAccess.getNLSFormatterAccess().getNameAssignment_1(), "rule__NLSFormatter__NameAssignment_1");
					put(grammarAccess.getNLSFormatterAccess().getClassRefAssignment_2(), "rule__NLSFormatter__ClassRefAssignment_2");
					put(grammarAccess.getMessageEntryAccess().getNameAssignment_0(), "rule__MessageEntry__NameAssignment_0");
					put(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_1(), "rule__MessageEntry__ParamListAssignment_1_1");
					put(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_2_1(), "rule__MessageEntry__ParamListAssignment_1_2_1");
					put(grammarAccess.getMessageEntryAccess().getMessageListAssignment_3_0_1(), "rule__MessageEntry__MessageListAssignment_3_0_1");
					put(grammarAccess.getMessageEntryAccess().getMessageListAssignment_3_0_2_1(), "rule__MessageEntry__MessageListAssignment_3_0_2_1");
					put(grammarAccess.getMessageEntryAccess().getEntryRefAssignment_3_1_1(), "rule__MessageEntry__EntryRefAssignment_3_1_1");
					put(grammarAccess.getMessageParamAccess().getPredefinedAssignment_0(), "rule__MessageParam__PredefinedAssignment_0");
					put(grammarAccess.getMessageParamAccess().getVarAssignment_1(), "rule__MessageParam__VarAssignment_1");
					put(grammarAccess.getMessageAccess().getNameAssignment_0(), "rule__Message__NameAssignment_0");
					put(grammarAccess.getMessageAccess().getMessageAssignment_2(), "rule__Message__MessageAssignment_2");
					put(grammarAccess.getRichStringAccess().getExpressionsAssignment_0(), "rule__RichString__ExpressionsAssignment_0");
					put(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_0(), "rule__RichString__ExpressionsAssignment_1_0");
					put(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_1(), "rule__RichString__ExpressionsAssignment_1_1");
					put(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_0(), "rule__RichString__ExpressionsAssignment_1_2_0");
					put(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_1(), "rule__RichString__ExpressionsAssignment_1_2_1");
					put(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_3(), "rule__RichString__ExpressionsAssignment_1_3");
					put(grammarAccess.getRichStringLiteralAccess().getValueAssignment(), "rule__RichStringLiteral__ValueAssignment");
					put(grammarAccess.getRichStringLiteralStartAccess().getValueAssignment(), "rule__RichStringLiteralStart__ValueAssignment");
					put(grammarAccess.getRichStringLiteralEndAccess().getValueAssignment(), "rule__RichStringLiteralEnd__ValueAssignment");
					put(grammarAccess.getRichStringLiteralInbetweenAccess().getValueAssignment(), "rule__RichStringLiteralInbetween__ValueAssignment");
					put(grammarAccess.getRichVarPartAccess().getKeyAssignment_0(), "rule__RichVarPart__KeyAssignment_0");
					put(grammarAccess.getRichVarPartAccess().getFormatAssignment_1_0(), "rule__RichVarPart__FormatAssignment_1_0");
					put(grammarAccess.getRichVarPartAccess().getFormatterClassAssignment_1_1(), "rule__RichVarPart__FormatterClassAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.fx.ide.l10n.ui.contentassist.antlr.internal.InternalNLSDslParser typedParser = (org.eclipse.fx.ide.l10n.ui.contentassist.antlr.internal.InternalNLSDslParser) parser;
			typedParser.entryRuleNLS();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public NLSDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(NLSDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}