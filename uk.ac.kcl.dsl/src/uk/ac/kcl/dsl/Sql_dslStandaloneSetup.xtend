/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class Sql_dslStandaloneSetup extends Sql_dslStandaloneSetupGenerated {

	def static void doSetup() {
		new Sql_dslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}