/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.outline.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.ui.tests.ui.internal.TestsActivator;

public class OutlineTestLanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TestsActivator.getInstance().getInjector("org.eclipse.xtext.ui.tests.editor.outline.OutlineTestLanguage");
	}

}
