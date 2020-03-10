/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.sql_dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.dsl.sql_dsl.DropTableStatement#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getDropTableStatement()
 * @model
 * @generated
 */
public interface DropTableStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Table</b></em>' reference list.
   * The list contents are of type {@link uk.ac.kcl.dsl.sql_dsl.TableName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference list.
   * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage#getDropTableStatement_Table()
   * @model
   * @generated
   */
  EList<TableName> getTable();

} // DropTableStatement
