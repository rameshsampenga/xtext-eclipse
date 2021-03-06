/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.tests.editor.contentassist.Bug360834TestLanguageRuntimeModule;
import org.eclipse.xtext.ui.tests.editor.contentassist.Bug360834TestLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Bug360834TestLanguageIdeSetup extends Bug360834TestLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new Bug360834TestLanguageRuntimeModule(), new Bug360834TestLanguageIdeModule());
	}
}
