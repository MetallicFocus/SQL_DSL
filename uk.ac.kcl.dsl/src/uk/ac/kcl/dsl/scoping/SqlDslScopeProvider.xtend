package uk.ac.kcl.dsl.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static org.eclipse.xtext.scoping.Scopes.*
import uk.ac.kcl.dsl.sql_dsl.Model
import uk.ac.kcl.dsl.sql_dsl.CD
import uk.ac.kcl.dsl.sql_dsl.VariableDeclarationStatement
import uk.ac.kcl.dsl.sql_dsl.WhereDec

class SqlDslScopeProvider extends AbstractDeclarativeScopeProvider {
	/*
	def IScope scope_IntVarExpression_var(IntVarExpression context, EReference ref) {
		context.visibleVariablesScope
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
	} */
	
}