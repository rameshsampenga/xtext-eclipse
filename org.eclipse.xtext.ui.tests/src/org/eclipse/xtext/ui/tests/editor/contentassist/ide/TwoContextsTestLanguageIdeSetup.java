/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.tests.editor.contentassist.TwoContextsTestLanguageRuntimeModule;
import org.eclipse.xtext.ui.tests.editor.contentassist.TwoContextsTestLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class TwoContextsTestLanguageIdeSetup extends TwoContextsTestLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new TwoContextsTestLanguageRuntimeModule(), new TwoContextsTestLanguageIdeModule());
	}
}
