/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.kcl.dsl.ui.internal.DslActivator;

public class Sql_dslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("uk.ac.kcl.dsl.Sql_dsl");
	}

}
