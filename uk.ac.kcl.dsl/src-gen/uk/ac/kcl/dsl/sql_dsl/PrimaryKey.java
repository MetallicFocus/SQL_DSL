/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.sql_dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.PrimaryKey#getColumnAsPK <em>Column As PK</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Column As PK</b></em>' reference list.
   * The list contents are of type {@link uk.ac.kcl.dsl.sql_dsl.CD}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column As PK</em>' reference list.
   * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getPrimaryKey_ColumnAsPK()
   * @model
   * @generated
   */
  EList<CD> getColumnAsPK();

} // PrimaryKey
