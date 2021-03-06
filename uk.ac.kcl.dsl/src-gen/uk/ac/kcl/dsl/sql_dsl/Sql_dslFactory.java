/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.sql_dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage
 * @generated
 */
public interface Sql_dslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Sql_dslFactory eINSTANCE = uk.ac.kcl.dsl.sql_dsl.impl.Sql_dslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Statement</em>'.
   * @generated
   */
  SelectStatement createSelectStatement();

  /**
   * Returns a new object of class '<em>From And Where Clauses</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From And Where Clauses</em>'.
   * @generated
   */
  FromAndWhereClauses createFromAndWhereClauses();

  /**
   * Returns a new object of class '<em>Where Dec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Dec</em>'.
   * @generated
   */
  WhereDec createWhereDec();

  /**
   * Returns a new object of class '<em>Right Operand One</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Operand One</em>'.
   * @generated
   */
  RightOperandOne createRightOperandOne();

  /**
   * Returns a new object of class '<em>Right Operand Two</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Operand Two</em>'.
   * @generated
   */
  RightOperandTwo createRightOperandTwo();

  /**
   * Returns a new object of class '<em>Right Operand Three</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Operand Three</em>'.
   * @generated
   */
  RightOperandThree createRightOperandThree();

  /**
   * Returns a new object of class '<em>Database Declaration Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Declaration Statement</em>'.
   * @generated
   */
  DatabaseDeclarationStatement createDatabaseDeclarationStatement();

  /**
   * Returns a new object of class '<em>Create Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Table Statement</em>'.
   * @generated
   */
  CreateTableStatement createCreateTableStatement();

  /**
   * Returns a new object of class '<em>Table Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Declaration</em>'.
   * @generated
   */
  TableDeclaration createTableDeclaration();

  /**
   * Returns a new object of class '<em>Table Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Name</em>'.
   * @generated
   */
  TableName createTableName();

  /**
   * Returns a new object of class '<em>CD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CD</em>'.
   * @generated
   */
  CD createCD();

  /**
   * Returns a new object of class '<em>Column Referencing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Referencing</em>'.
   * @generated
   */
  ColumnReferencing createColumnReferencing();

  /**
   * Returns a new object of class '<em>Primary Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Key</em>'.
   * @generated
   */
  PrimaryKey createPrimaryKey();

  /**
   * Returns a new object of class '<em>Foreign Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreign Key</em>'.
   * @generated
   */
  ForeignKey createForeignKey();

  /**
   * Returns a new object of class '<em>Drop Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Table Statement</em>'.
   * @generated
   */
  DropTableStatement createDropTableStatement();

  /**
   * Returns a new object of class '<em>Truncate Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Truncate Table Statement</em>'.
   * @generated
   */
  TruncateTableStatement createTruncateTableStatement();

  /**
   * Returns a new object of class '<em>Delete Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Table Statement</em>'.
   * @generated
   */
  DeleteTableStatement createDeleteTableStatement();

  /**
   * Returns a new object of class '<em>Update Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Table Statement</em>'.
   * @generated
   */
  UpdateTableStatement createUpdateTableStatement();

  /**
   * Returns a new object of class '<em>Set Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Clause</em>'.
   * @generated
   */
  SetClause createSetClause();

  /**
   * Returns a new object of class '<em>Alter Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Table Statement</em>'.
   * @generated
   */
  AlterTableStatement createAlterTableStatement();

  /**
   * Returns a new object of class '<em>Alter Drop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Drop Statement</em>'.
   * @generated
   */
  AlterDropStatement createAlterDropStatement();

  /**
   * Returns a new object of class '<em>Alter Add Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Add Statement</em>'.
   * @generated
   */
  AlterAddStatement createAlterAddStatement();

  /**
   * Returns a new object of class '<em>Alter Update Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alter Update Statement</em>'.
   * @generated
   */
  AlterUpdateStatement createAlterUpdateStatement();

  /**
   * Returns a new object of class '<em>Variable Declaration Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration Statement</em>'.
   * @generated
   */
  VariableDeclarationStatement createVariableDeclarationStatement();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns a new object of class '<em>Int Var Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Var Expression</em>'.
   * @generated
   */
  IntVarExpression createIntVarExpression();

  /**
   * Returns a new object of class '<em>Functions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functions</em>'.
   * @generated
   */
  Functions createFunctions();

  /**
   * Returns a new object of class '<em>Count Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count Function</em>'.
   * @generated
   */
  CountFunction createCountFunction();

  /**
   * Returns a new object of class '<em>Avg Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Avg Function</em>'.
   * @generated
   */
  AvgFunction createAvgFunction();

  /**
   * Returns a new object of class '<em>Sum Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Function</em>'.
   * @generated
   */
  SumFunction createSumFunction();

  /**
   * Returns a new object of class '<em>Min Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min Function</em>'.
   * @generated
   */
  MinFunction createMinFunction();

  /**
   * Returns a new object of class '<em>Max Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max Function</em>'.
   * @generated
   */
  MaxFunction createMaxFunction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Sql_dslPackage getSql_dslPackage();

} //Sql_dslFactory
