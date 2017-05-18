/*
 * generated by Xtext
 */
package org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.fx.code.editor.ldef.services.LDefGrammarAccess;

public class LDefParser extends AbstractContentAssistParser {
	
	@Inject
	private LDefGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser createParser() {
		org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser result = new org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCodegenerationAccess().getAlternatives(), "rule__Codegeneration__Alternatives");
					put(grammarAccess.getConfigValueAccess().getAlternatives_2(), "rule__ConfigValue__Alternatives_2");
					put(grammarAccess.getPartitionerAccess().getAlternatives(), "rule__Partitioner__Alternatives");
					put(grammarAccess.getPartition_RuleAccess().getAlternatives(), "rule__Partition_Rule__Alternatives");
					put(grammarAccess.getLexicalPartitionHighlightingAccess().getAlternatives(), "rule__LexicalPartitionHighlighting__Alternatives");
					put(grammarAccess.getScannerAccess().getAlternatives(), "rule__Scanner__Alternatives");
					put(grammarAccess.getScanner_RuleAccess().getAlternatives(), "rule__Scanner_Rule__Alternatives");
					put(grammarAccess.getScannerConditionAccess().getAlternatives(), "rule__ScannerCondition__Alternatives");
					put(grammarAccess.getScannerConditionCompositeAccess().getOpAlternatives_0_0(), "rule__ScannerConditionComposite__OpAlternatives_0_0");
					put(grammarAccess.getCheckAccess().getAlternatives(), "rule__Check__Alternatives");
					put(grammarAccess.getRangeAccess().getLtInclAlternatives_1_0(), "rule__Range__LtInclAlternatives_1_0");
					put(grammarAccess.getRangeAccess().getGtInclAlternatives_5_0(), "rule__Range__GtInclAlternatives_5_0");
					put(grammarAccess.getWhitespaceRuleAccess().getAlternatives_1(), "rule__WhitespaceRule__Alternatives_1");
					put(grammarAccess.getRootAccess().getGroup(), "rule__Root__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup(), "rule__QualifiedNameWithWildCard__Group__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1(), "rule__QualifiedNameWithWildCard__Group_1__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getLanguageDefAccess().getGroup(), "rule__LanguageDef__Group__0");
					put(grammarAccess.getIntegrationAccess().getGroup(), "rule__Integration__Group__0");
					put(grammarAccess.getJavaFXIntegrationAccess().getGroup(), "rule__JavaFXIntegration__Group__0");
					put(grammarAccess.getJavaCodeGenerationAccess().getGroup(), "rule__JavaCodeGeneration__Group__0");
					put(grammarAccess.getJavaCodeGenerationAccess().getGroup_2(), "rule__JavaCodeGeneration__Group_2__0");
					put(grammarAccess.getE4CodeGenerationAccess().getGroup(), "rule__E4CodeGeneration__Group__0");
					put(grammarAccess.getE4CodeGenerationAccess().getGroup_2(), "rule__E4CodeGeneration__Group_2__0");
					put(grammarAccess.getConfigValueAccess().getGroup(), "rule__ConfigValue__Group__0");
					put(grammarAccess.getConfigValueAccess().getGroup_2_1(), "rule__ConfigValue__Group_2_1__0");
					put(grammarAccess.getParitioningAccess().getGroup(), "rule__Paritioning__Group__0");
					put(grammarAccess.getPartitionAccess().getGroup(), "rule__Partition__Group__0");
					put(grammarAccess.getParitioner_JSAccess().getGroup(), "rule__Paritioner_JS__Group__0");
					put(grammarAccess.getPartitioner_RuleAccess().getGroup(), "rule__Partitioner_Rule__Group__0");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getGroup(), "rule__Partition_SingleLineRule__Group__0");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getGroup_3(), "rule__Partition_SingleLineRule__Group_3__0");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getGroup_4(), "rule__Partition_SingleLineRule__Group_4__0");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getGroup_5(), "rule__Partition_SingleLineRule__Group_5__0");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getGroup_6(), "rule__Partition_SingleLineRule__Group_6__0");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getGroup(), "rule__Partition_MultiLineRule__Group__0");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getGroup_3(), "rule__Partition_MultiLineRule__Group_3__0");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getGroup_4(), "rule__Partition_MultiLineRule__Group_4__0");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getGroup_7(), "rule__Partition_MultiLineRule__Group_7__0");
					put(grammarAccess.getPartition_JSRuleAccess().getGroup(), "rule__Partition_JSRule__Group__0");
					put(grammarAccess.getPartition_JSRuleAccess().getGroup_3(), "rule__Partition_JSRule__Group_3__0");
					put(grammarAccess.getLexicalHighlightingAccess().getGroup(), "rule__LexicalHighlighting__Group__0");
					put(grammarAccess.getTokenVisualsAccess().getGroup(), "rule__TokenVisuals__Group__0");
					put(grammarAccess.getTokenVisualsAccess().getGroup_2(), "rule__TokenVisuals__Group_2__0");
					put(grammarAccess.getTokenVisualAccess().getGroup(), "rule__TokenVisual__Group__0");
					put(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getGroup(), "rule__LexicalPartitionHighlighting_JS__Group__0");
					put(grammarAccess.getLexicalPartitionHighlighting_RuleAccess().getGroup(), "rule__LexicalPartitionHighlighting_Rule__Group__0");
					put(grammarAccess.getTokenAccess().getGroup(), "rule__Token__Group__0");
					put(grammarAccess.getTokenAccess().getGroup_2(), "rule__Token__Group_2__0");
					put(grammarAccess.getScanner_KeywordAccess().getGroup(), "rule__Scanner_Keyword__Group__0");
					put(grammarAccess.getScanner_KeywordAccess().getGroup_3(), "rule__Scanner_Keyword__Group_3__0");
					put(grammarAccess.getScanner_KeywordAccess().getGroup_5(), "rule__Scanner_Keyword__Group_5__0");
					put(grammarAccess.getKeywordAccess().getGroup(), "rule__Keyword__Group__0");
					put(grammarAccess.getKeywordAccess().getGroup_1(), "rule__Keyword__Group_1__0");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getGroup(), "rule__Scanner_SingleLineRule__Group__0");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getGroup_2(), "rule__Scanner_SingleLineRule__Group_2__0");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getGroup_3(), "rule__Scanner_SingleLineRule__Group_3__0");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getGroup_4(), "rule__Scanner_SingleLineRule__Group_4__0");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getGroup_5(), "rule__Scanner_SingleLineRule__Group_5__0");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getGroup_6(), "rule__Scanner_SingleLineRule__Group_6__0");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getGroup(), "rule__Scanner_MultiLineRule__Group__0");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getGroup_2(), "rule__Scanner_MultiLineRule__Group_2__0");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getGroup_3(), "rule__Scanner_MultiLineRule__Group_3__0");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getGroup_6(), "rule__Scanner_MultiLineRule__Group_6__0");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getGroup_7(), "rule__Scanner_MultiLineRule__Group_7__0");
					put(grammarAccess.getScanner_PatternRuleAccess().getGroup(), "rule__Scanner_PatternRule__Group__0");
					put(grammarAccess.getScanner_PatternRuleAccess().getGroup_3(), "rule__Scanner_PatternRule__Group_3__0");
					put(grammarAccess.getScanner_PatternRuleAccess().getGroup_6(), "rule__Scanner_PatternRule__Group_6__0");
					put(grammarAccess.getScanner_CharacterRuleAccess().getGroup(), "rule__Scanner_CharacterRule__Group__0");
					put(grammarAccess.getScanner_CharacterRuleAccess().getGroup_3(), "rule__Scanner_CharacterRule__Group_3__0");
					put(grammarAccess.getScanner_CharacterRuleAccess().getGroup_5(), "rule__Scanner_CharacterRule__Group_5__0");
					put(grammarAccess.getScanner_CharacterRuleAccess().getGroup_6(), "rule__Scanner_CharacterRule__Group_6__0");
					put(grammarAccess.getScanner_JSRuleAccess().getGroup(), "rule__Scanner_JSRule__Group__0");
					put(grammarAccess.getScanner_JSRuleAccess().getGroup_2(), "rule__Scanner_JSRule__Group_2__0");
					put(grammarAccess.getScanner_JSRuleAccess().getGroup_3(), "rule__Scanner_JSRule__Group_3__0");
					put(grammarAccess.getScannerConditionCompositeAccess().getGroup(), "rule__ScannerConditionComposite__Group__0");
					put(grammarAccess.getScannerConditionExistsAccess().getGroup(), "rule__ScannerConditionExists__Group__0");
					put(grammarAccess.getScannerConditionEqualsAccess().getGroup(), "rule__ScannerConditionEquals__Group__0");
					put(grammarAccess.getScannerConditionJsAccess().getGroup(), "rule__ScannerConditionJs__Group__0");
					put(grammarAccess.getEqualsAccess().getGroup(), "rule__Equals__Group__0");
					put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
					put(grammarAccess.getWhitespaceRuleAccess().getGroup(), "rule__WhitespaceRule__Group__0");
					put(grammarAccess.getWhitespaceRuleAccess().getGroup_1_0(), "rule__WhitespaceRule__Group_1_0__0");
					put(grammarAccess.getWhitespaceRuleAccess().getGroup_1_0_2(), "rule__WhitespaceRule__Group_1_0_2__0");
					put(grammarAccess.getRootAccess().getNameAssignment_1(), "rule__Root__NameAssignment_1");
					put(grammarAccess.getRootAccess().getImportsAssignment_2(), "rule__Root__ImportsAssignment_2");
					put(grammarAccess.getRootAccess().getLanguageDefinitionAssignment_3(), "rule__Root__LanguageDefinitionAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getLanguageDefAccess().getNameAssignment_0(), "rule__LanguageDef__NameAssignment_0");
					put(grammarAccess.getLanguageDefAccess().getParitioningAssignment_2(), "rule__LanguageDef__ParitioningAssignment_2");
					put(grammarAccess.getLanguageDefAccess().getLexicalHighlightingAssignment_3(), "rule__LanguageDef__LexicalHighlightingAssignment_3");
					put(grammarAccess.getLanguageDefAccess().getIntegrationAssignment_4(), "rule__LanguageDef__IntegrationAssignment_4");
					put(grammarAccess.getIntegrationAccess().getCodeIntegrationListAssignment_2(), "rule__Integration__CodeIntegrationListAssignment_2");
					put(grammarAccess.getJavaFXIntegrationAccess().getCodegenerationListAssignment_2(), "rule__JavaFXIntegration__CodegenerationListAssignment_2");
					put(grammarAccess.getJavaCodeGenerationAccess().getNameAssignment_1(), "rule__JavaCodeGeneration__NameAssignment_1");
					put(grammarAccess.getJavaCodeGenerationAccess().getConfigValueAssignment_2_1(), "rule__JavaCodeGeneration__ConfigValueAssignment_2_1");
					put(grammarAccess.getE4CodeGenerationAccess().getNameAssignment_1(), "rule__E4CodeGeneration__NameAssignment_1");
					put(grammarAccess.getE4CodeGenerationAccess().getConfigValueAssignment_2_1(), "rule__E4CodeGeneration__ConfigValueAssignment_2_1");
					put(grammarAccess.getConfigValueAccess().getKeyAssignment_0(), "rule__ConfigValue__KeyAssignment_0");
					put(grammarAccess.getConfigValueAccess().getSimpleValueAssignment_2_0(), "rule__ConfigValue__SimpleValueAssignment_2_0");
					put(grammarAccess.getConfigValueAccess().getChildrenAssignment_2_1_1(), "rule__ConfigValue__ChildrenAssignment_2_1_1");
					put(grammarAccess.getParitioningAccess().getPartitionsAssignment_2(), "rule__Paritioning__PartitionsAssignment_2");
					put(grammarAccess.getParitioningAccess().getPartitionerAssignment_3(), "rule__Paritioning__PartitionerAssignment_3");
					put(grammarAccess.getPartitionAccess().getNameAssignment_1(), "rule__Partition__NameAssignment_1");
					put(grammarAccess.getParitioner_JSAccess().getScriptURIAssignment_1(), "rule__Paritioner_JS__ScriptURIAssignment_1");
					put(grammarAccess.getPartitioner_RuleAccess().getRuleListAssignment_2(), "rule__Partitioner_Rule__RuleListAssignment_2");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getParitionAssignment_1(), "rule__Partition_SingleLineRule__ParitionAssignment_1");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getStartSeqAssignment_2(), "rule__Partition_SingleLineRule__StartSeqAssignment_2");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getStartPatternAssignment_3_1(), "rule__Partition_SingleLineRule__StartPatternAssignment_3_1");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getStartSuffixAssignment_3_2(), "rule__Partition_SingleLineRule__StartSuffixAssignment_3_2");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getCheckAssignment_4_1(), "rule__Partition_SingleLineRule__CheckAssignment_4_1");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getEndSeqAssignment_5_1(), "rule__Partition_SingleLineRule__EndSeqAssignment_5_1");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getEscapeSeqAssignment_6_2(), "rule__Partition_SingleLineRule__EscapeSeqAssignment_6_2");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getParitionAssignment_1(), "rule__Partition_MultiLineRule__ParitionAssignment_1");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getStartSeqAssignment_2(), "rule__Partition_MultiLineRule__StartSeqAssignment_2");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getStartPatternAssignment_3_1(), "rule__Partition_MultiLineRule__StartPatternAssignment_3_1");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getStartSuffixAssignment_3_2(), "rule__Partition_MultiLineRule__StartSuffixAssignment_3_2");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getCheckAssignment_4_1(), "rule__Partition_MultiLineRule__CheckAssignment_4_1");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getEndSeqAssignment_6(), "rule__Partition_MultiLineRule__EndSeqAssignment_6");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getEscapeSeqAssignment_7_2(), "rule__Partition_MultiLineRule__EscapeSeqAssignment_7_2");
					put(grammarAccess.getPartition_JSRuleAccess().getParitionAssignment_1(), "rule__Partition_JSRule__ParitionAssignment_1");
					put(grammarAccess.getPartition_JSRuleAccess().getFileURIAssignment_2(), "rule__Partition_JSRule__FileURIAssignment_2");
					put(grammarAccess.getPartition_JSRuleAccess().getCheckAssignment_3_1(), "rule__Partition_JSRule__CheckAssignment_3_1");
					put(grammarAccess.getLexicalHighlightingAccess().getListAssignment_2(), "rule__LexicalHighlighting__ListAssignment_2");
					put(grammarAccess.getLexicalHighlightingAccess().getVistualAssignment_3(), "rule__LexicalHighlighting__VistualAssignment_3");
					put(grammarAccess.getTokenVisualsAccess().getTokenVisualsAssignment_2_0(), "rule__TokenVisuals__TokenVisualsAssignment_2_0");
					put(grammarAccess.getTokenVisualAccess().getTokenAssignment_0(), "rule__TokenVisual__TokenAssignment_0");
					put(grammarAccess.getTokenVisualAccess().getColorSpecAssignment_1(), "rule__TokenVisual__ColorSpecAssignment_1");
					put(grammarAccess.getTokenVisualAccess().getBoldAssignment_2(), "rule__TokenVisual__BoldAssignment_2");
					put(grammarAccess.getTokenVisualAccess().getItalicAssignment_3(), "rule__TokenVisual__ItalicAssignment_3");
					put(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getPartitionAssignment_1(), "rule__LexicalPartitionHighlighting_JS__PartitionAssignment_1");
					put(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getScriptURIAssignment_2(), "rule__LexicalPartitionHighlighting_JS__ScriptURIAssignment_2");
					put(grammarAccess.getLexicalPartitionHighlighting_RuleAccess().getPartitionAssignment_1(), "rule__LexicalPartitionHighlighting_Rule__PartitionAssignment_1");
					put(grammarAccess.getLexicalPartitionHighlighting_RuleAccess().getWhitespaceAssignment_2(), "rule__LexicalPartitionHighlighting_Rule__WhitespaceAssignment_2");
					put(grammarAccess.getLexicalPartitionHighlighting_RuleAccess().getTokenListAssignment_4(), "rule__LexicalPartitionHighlighting_Rule__TokenListAssignment_4");
					put(grammarAccess.getTokenAccess().getDefaultAssignment_0(), "rule__Token__DefaultAssignment_0");
					put(grammarAccess.getTokenAccess().getNameAssignment_1(), "rule__Token__NameAssignment_1");
					put(grammarAccess.getTokenAccess().getScannerListAssignment_2_1(), "rule__Token__ScannerListAssignment_2_1");
					put(grammarAccess.getScanner_KeywordAccess().getKeywordsAssignment_2(), "rule__Scanner_Keyword__KeywordsAssignment_2");
					put(grammarAccess.getScanner_KeywordAccess().getKeywordsAssignment_3_1(), "rule__Scanner_Keyword__KeywordsAssignment_3_1");
					put(grammarAccess.getScanner_KeywordAccess().getEnabledIfAssignment_5_1(), "rule__Scanner_Keyword__EnabledIfAssignment_5_1");
					put(grammarAccess.getKeywordAccess().getNameAssignment_0(), "rule__Keyword__NameAssignment_0");
					put(grammarAccess.getKeywordAccess().getVersionAssignment_1_1(), "rule__Keyword__VersionAssignment_1_1");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getStartSeqAssignment_1(), "rule__Scanner_SingleLineRule__StartSeqAssignment_1");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getStartPatternAssignment_2_1(), "rule__Scanner_SingleLineRule__StartPatternAssignment_2_1");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getStartSuffixAssignment_2_2(), "rule__Scanner_SingleLineRule__StartSuffixAssignment_2_2");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getCheckAssignment_3_1(), "rule__Scanner_SingleLineRule__CheckAssignment_3_1");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getEndSeqAssignment_4_1(), "rule__Scanner_SingleLineRule__EndSeqAssignment_4_1");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getEscapeSeqAssignment_5_2(), "rule__Scanner_SingleLineRule__EscapeSeqAssignment_5_2");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getEnabledIfAssignment_6_1(), "rule__Scanner_SingleLineRule__EnabledIfAssignment_6_1");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getStartSeqAssignment_1(), "rule__Scanner_MultiLineRule__StartSeqAssignment_1");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getStartPatternAssignment_2_1(), "rule__Scanner_MultiLineRule__StartPatternAssignment_2_1");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getStartSuffixAssignment_2_2(), "rule__Scanner_MultiLineRule__StartSuffixAssignment_2_2");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getCheckAssignment_3_1(), "rule__Scanner_MultiLineRule__CheckAssignment_3_1");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getEndSeqAssignment_5(), "rule__Scanner_MultiLineRule__EndSeqAssignment_5");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getEscapeSeqAssignment_6_2(), "rule__Scanner_MultiLineRule__EscapeSeqAssignment_6_2");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getEnabledIfAssignment_7_1(), "rule__Scanner_MultiLineRule__EnabledIfAssignment_7_1");
					put(grammarAccess.getScanner_PatternRuleAccess().getStartPatternAssignment_1(), "rule__Scanner_PatternRule__StartPatternAssignment_1");
					put(grammarAccess.getScanner_PatternRuleAccess().getLengthAssignment_2(), "rule__Scanner_PatternRule__LengthAssignment_2");
					put(grammarAccess.getScanner_PatternRuleAccess().getCheckAssignment_3_1(), "rule__Scanner_PatternRule__CheckAssignment_3_1");
					put(grammarAccess.getScanner_PatternRuleAccess().getContentPatternAssignment_5(), "rule__Scanner_PatternRule__ContentPatternAssignment_5");
					put(grammarAccess.getScanner_PatternRuleAccess().getEnabledIfAssignment_6_1(), "rule__Scanner_PatternRule__EnabledIfAssignment_6_1");
					put(grammarAccess.getScanner_CharacterRuleAccess().getCharactersAssignment_2(), "rule__Scanner_CharacterRule__CharactersAssignment_2");
					put(grammarAccess.getScanner_CharacterRuleAccess().getCharactersAssignment_3_1(), "rule__Scanner_CharacterRule__CharactersAssignment_3_1");
					put(grammarAccess.getScanner_CharacterRuleAccess().getCheckAssignment_5_1(), "rule__Scanner_CharacterRule__CheckAssignment_5_1");
					put(grammarAccess.getScanner_CharacterRuleAccess().getEnabledIfAssignment_6_1(), "rule__Scanner_CharacterRule__EnabledIfAssignment_6_1");
					put(grammarAccess.getScanner_JSRuleAccess().getFileURIAssignment_1(), "rule__Scanner_JSRule__FileURIAssignment_1");
					put(grammarAccess.getScanner_JSRuleAccess().getCheckAssignment_2_1(), "rule__Scanner_JSRule__CheckAssignment_2_1");
					put(grammarAccess.getScanner_JSRuleAccess().getConditionAssignment_3_1(), "rule__Scanner_JSRule__ConditionAssignment_3_1");
					put(grammarAccess.getScannerConditionCompositeAccess().getOpAssignment_0(), "rule__ScannerConditionComposite__OpAssignment_0");
					put(grammarAccess.getScannerConditionCompositeAccess().getElementsAssignment_2(), "rule__ScannerConditionComposite__ElementsAssignment_2");
					put(grammarAccess.getScannerConditionExistsAccess().getKeyAssignment_0(), "rule__ScannerConditionExists__KeyAssignment_0");
					put(grammarAccess.getScannerConditionEqualsAccess().getKeyAssignment_0(), "rule__ScannerConditionEquals__KeyAssignment_0");
					put(grammarAccess.getScannerConditionEqualsAccess().getValueAssignment_2(), "rule__ScannerConditionEquals__ValueAssignment_2");
					put(grammarAccess.getScannerConditionJsAccess().getValueAssignment_1(), "rule__ScannerConditionJs__ValueAssignment_1");
					put(grammarAccess.getEqualsAccess().getValueAssignment_1(), "rule__Equals__ValueAssignment_1");
					put(grammarAccess.getRangeAccess().getLtInclAssignment_1(), "rule__Range__LtInclAssignment_1");
					put(grammarAccess.getRangeAccess().getMinValueAssignment_2(), "rule__Range__MinValueAssignment_2");
					put(grammarAccess.getRangeAccess().getMaxValueAssignment_4(), "rule__Range__MaxValueAssignment_4");
					put(grammarAccess.getRangeAccess().getGtInclAssignment_5(), "rule__Range__GtInclAssignment_5");
					put(grammarAccess.getWhitespaceRuleAccess().getCharactersAssignment_1_0_1(), "rule__WhitespaceRule__CharactersAssignment_1_0_1");
					put(grammarAccess.getWhitespaceRuleAccess().getCharactersAssignment_1_0_2_1(), "rule__WhitespaceRule__CharactersAssignment_1_0_2_1");
					put(grammarAccess.getWhitespaceRuleAccess().getJavawhitespaceAssignment_1_1(), "rule__WhitespaceRule__JavawhitespaceAssignment_1_1");
					put(grammarAccess.getWhitespaceRuleAccess().getFileURIAssignment_1_2(), "rule__WhitespaceRule__FileURIAssignment_1_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser typedParser = (org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser) parser;
			typedParser.entryRuleRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LDefGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LDefGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}