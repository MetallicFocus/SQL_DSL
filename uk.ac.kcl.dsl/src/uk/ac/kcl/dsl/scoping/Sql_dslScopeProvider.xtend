/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.scoping

import org.eclipse.xtext.scoping.IScope
import uk.ac.kcl.dsl.sql_dsl.IntVarExpression
import org.eclipse.emf.ecore.EReference
import uk.ac.kcl.dsl.sql_dsl.Model

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class Sql_dslScopeProvider extends AbstractSql_dslScopeProvider {


	/*def IScope scope_IntVarExpression_var(IntVarExpression context, EReference ref) {
		val model = context.eContainer as Model
		scopeFor(model)
	}
	
	dispatch def IScope visibleVariablesScope(CD ip) {
		ip.eContainer.visibleVariablesScope
	} 
	
	dispatch def IScope visibleVariablesScope(Model md) {
		scopeFor(md.statements.filter(VariableDeclarationStatement))
	}
	
	dispatch def IScope visibleVariablesScope(WhereDec wd) {
		wd.eContainer.internalVisibleVariablesScope
	}

	dispatch def IScope internalVisibleVariablesScope(Model tp) {
		scopeFor(tp.statements.filter(CD))
	}
	
	dispatch def IScope internalVisibleVariablesScope(LoopStatement ls) {
		scopeFor(ls.statements.filter(VariableDeclaration), ls.eContainer.internalVisibleVariablesScope)
	}*/

}
