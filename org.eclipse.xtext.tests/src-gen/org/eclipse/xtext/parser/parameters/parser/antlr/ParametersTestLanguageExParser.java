/*
 * generated by Xtext
 */
package org.eclipse.xtext.parser.parameters.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.parameters.services.ParametersTestLanguageExGrammarAccess;

public class ParametersTestLanguageExParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ParametersTestLanguageExGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.parser.parameters.parser.antlr.internal.InternalParametersTestLanguageExParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.parser.parameters.parser.antlr.internal.InternalParametersTestLanguageExParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ParserRuleParameters";
	}
	
	public ParametersTestLanguageExGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ParametersTestLanguageExGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}