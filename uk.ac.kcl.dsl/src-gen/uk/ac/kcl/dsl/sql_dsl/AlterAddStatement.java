/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.sql_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alter Add Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.AlterAddStatement#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getAlterAddStatement()
 * @model
 * @generated
 */
public interface AlterAddStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' reference list.
   * The list contents are of type {@link uk.ac.kcl.dsl.sql_dsl.ColumnDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' reference list.
   * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getAlterAddStatement_Column()
   * @model
   * @generated
   */
  EList<ColumnDeclaration> getColumn();

} // AlterAddStatement