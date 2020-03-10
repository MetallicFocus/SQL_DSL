/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.sql_dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.DeleteTableStatement#getX <em>X</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getDeleteTableStatement()
 * @model
 * @generated
 */
public interface DeleteTableStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' containment reference.
   * @see #setX(FromAndWhereClauses)
   * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getDeleteTableStatement_X()
   * @model containment="true"
   * @generated
   */
  FromAndWhereClauses getX();

  /**
   * Sets the value of the '{@link uk.ac.kcl.dsl.sql_dsl.DeleteTableStatement#getX <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' containment reference.
   * @see #getX()
   * @generated
   */
  void setX(FromAndWhereClauses value);

} // DeleteTableStatement