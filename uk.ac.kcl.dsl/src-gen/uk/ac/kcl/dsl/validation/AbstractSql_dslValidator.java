/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSql_dslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage.eINSTANCE);
		return result;
	}
}