/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.quickfix.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.ui.tests.quickfix.parser.antlr.internal.InternalQuickfixCrossrefTestLanguageParser;
import org.eclipse.xtext.ui.tests.quickfix.services.QuickfixCrossrefTestLanguageGrammarAccess;

public class QuickfixCrossrefTestLanguageParser extends AbstractAntlrParser {

	@Inject
	private QuickfixCrossrefTestLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalQuickfixCrossrefTestLanguageParser createParser(XtextTokenStream stream) {
		return new InternalQuickfixCrossrefTestLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Main";
	}

	public QuickfixCrossrefTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QuickfixCrossrefTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
