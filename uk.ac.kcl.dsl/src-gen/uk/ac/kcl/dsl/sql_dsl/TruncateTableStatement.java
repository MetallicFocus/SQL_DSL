/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.sql_dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Truncate Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.TruncateTableStatement#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getTruncateTableStatement()
 * @model
 * @generated
 */
public interface TruncateTableStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.dsl.sql_dsl.TruncateTableDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getTruncateTableStatement_Tables()
   * @model containment="true"
   * @generated
   */
  EList<TruncateTableDeclaration> getTables();

} // TruncateTableStatement