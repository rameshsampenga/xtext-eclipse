/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.tests.editor.contentassist.LookAheadContentAssistTestLanguageRuntimeModule;
import org.eclipse.xtext.ui.tests.editor.contentassist.LookAheadContentAssistTestLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class LookAheadContentAssistTestLanguageIdeSetup extends LookAheadContentAssistTestLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new LookAheadContentAssistTestLanguageRuntimeModule(), new LookAheadContentAssistTestLanguageIdeModule());
	}
}
