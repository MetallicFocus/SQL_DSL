/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.dsl.services.Sql_dslGrammarAccess;
import uk.ac.kcl.dsl.sql_dsl.AlterAddStatement;
import uk.ac.kcl.dsl.sql_dsl.AlterDropStatement;
import uk.ac.kcl.dsl.sql_dsl.AlterTableStatement;
import uk.ac.kcl.dsl.sql_dsl.AlterUpdateStatement;
import uk.ac.kcl.dsl.sql_dsl.AvgFunction;
import uk.ac.kcl.dsl.sql_dsl.CD;
import uk.ac.kcl.dsl.sql_dsl.ColumnReferencing;
import uk.ac.kcl.dsl.sql_dsl.CountFunction;
import uk.ac.kcl.dsl.sql_dsl.CreateTableStatement;
import uk.ac.kcl.dsl.sql_dsl.DatabaseDeclarationStatement;
import uk.ac.kcl.dsl.sql_dsl.DeleteTableStatement;
import uk.ac.kcl.dsl.sql_dsl.DropTableStatement;
import uk.ac.kcl.dsl.sql_dsl.ForeignKey;
import uk.ac.kcl.dsl.sql_dsl.FromAndWhereClauses;
import uk.ac.kcl.dsl.sql_dsl.IntLiteral;
import uk.ac.kcl.dsl.sql_dsl.IntVarExpression;
import uk.ac.kcl.dsl.sql_dsl.MaxFunction;
import uk.ac.kcl.dsl.sql_dsl.MinFunction;
import uk.ac.kcl.dsl.sql_dsl.Model;
import uk.ac.kcl.dsl.sql_dsl.PrimaryKey;
import uk.ac.kcl.dsl.sql_dsl.RealLiteral;
import uk.ac.kcl.dsl.sql_dsl.RightOperandOne;
import uk.ac.kcl.dsl.sql_dsl.RightOperandThree;
import uk.ac.kcl.dsl.sql_dsl.RightOperandTwo;
import uk.ac.kcl.dsl.sql_dsl.SelectStatement;
import uk.ac.kcl.dsl.sql_dsl.SetClause;
import uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage;
import uk.ac.kcl.dsl.sql_dsl.SumFunction;
import uk.ac.kcl.dsl.sql_dsl.TableDeclaration;
import uk.ac.kcl.dsl.sql_dsl.TableName;
import uk.ac.kcl.dsl.sql_dsl.TruncateTableStatement;
import uk.ac.kcl.dsl.sql_dsl.UpdateTableStatement;
import uk.ac.kcl.dsl.sql_dsl.VariableDeclarationStatement;
import uk.ac.kcl.dsl.sql_dsl.WhereDec;

@SuppressWarnings("all")
public class Sql_dslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Sql_dslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Sql_dslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Sql_dslPackage.ALTER_ADD_STATEMENT:
				sequence_AlterAddStatement(context, (AlterAddStatement) semanticObject); 
				return; 
			case Sql_dslPackage.ALTER_DROP_STATEMENT:
				sequence_AlterDropStatement(context, (AlterDropStatement) semanticObject); 
				return; 
			case Sql_dslPackage.ALTER_TABLE_STATEMENT:
				sequence_AlterTableStatement(context, (AlterTableStatement) semanticObject); 
				return; 
			case Sql_dslPackage.ALTER_UPDATE_STATEMENT:
				sequence_AlterUpdateStatement(context, (AlterUpdateStatement) semanticObject); 
				return; 
			case Sql_dslPackage.AVG_FUNCTION:
				sequence_AvgFunction(context, (AvgFunction) semanticObject); 
				return; 
			case Sql_dslPackage.CD:
				sequence_ColumnDeclaration(context, (CD) semanticObject); 
				return; 
			case Sql_dslPackage.COLUMN_REFERENCING:
				sequence_ColumnReferencing(context, (ColumnReferencing) semanticObject); 
				return; 
			case Sql_dslPackage.COUNT_FUNCTION:
				sequence_CountFunction(context, (CountFunction) semanticObject); 
				return; 
			case Sql_dslPackage.CREATE_TABLE_STATEMENT:
				sequence_CreateTableStatement(context, (CreateTableStatement) semanticObject); 
				return; 
			case Sql_dslPackage.DATABASE_DECLARATION_STATEMENT:
				sequence_DatabaseDeclarationStatement(context, (DatabaseDeclarationStatement) semanticObject); 
				return; 
			case Sql_dslPackage.DELETE_TABLE_STATEMENT:
				sequence_DeleteTableStatement(context, (DeleteTableStatement) semanticObject); 
				return; 
			case Sql_dslPackage.DROP_TABLE_STATEMENT:
				sequence_DropTableStatement(context, (DropTableStatement) semanticObject); 
				return; 
			case Sql_dslPackage.FOREIGN_KEY:
				sequence_ForeignKey(context, (ForeignKey) semanticObject); 
				return; 
			case Sql_dslPackage.FROM_AND_WHERE_CLAUSES:
				sequence_FromAndWhereClauses(context, (FromAndWhereClauses) semanticObject); 
				return; 
			case Sql_dslPackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case Sql_dslPackage.INT_VAR_EXPRESSION:
				sequence_IntVarExpression(context, (IntVarExpression) semanticObject); 
				return; 
			case Sql_dslPackage.MAX_FUNCTION:
				sequence_MaxFunction(context, (MaxFunction) semanticObject); 
				return; 
			case Sql_dslPackage.MIN_FUNCTION:
				sequence_MinFunction(context, (MinFunction) semanticObject); 
				return; 
			case Sql_dslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Sql_dslPackage.PRIMARY_KEY:
				sequence_PrimaryKey(context, (PrimaryKey) semanticObject); 
				return; 
			case Sql_dslPackage.REAL_LITERAL:
				sequence_RealLiteral(context, (RealLiteral) semanticObject); 
				return; 
			case Sql_dslPackage.RIGHT_OPERAND_ONE:
				sequence_RightOperandOne(context, (RightOperandOne) semanticObject); 
				return; 
			case Sql_dslPackage.RIGHT_OPERAND_THREE:
				sequence_RightOperandThree(context, (RightOperandThree) semanticObject); 
				return; 
			case Sql_dslPackage.RIGHT_OPERAND_TWO:
				sequence_RightOperandTwo(context, (RightOperandTwo) semanticObject); 
				return; 
			case Sql_dslPackage.SELECT_STATEMENT:
				sequence_SelectStatement(context, (SelectStatement) semanticObject); 
				return; 
			case Sql_dslPackage.SET_CLAUSE:
				sequence_SetClause(context, (SetClause) semanticObject); 
				return; 
			case Sql_dslPackage.SUM_FUNCTION:
				sequence_SumFunction(context, (SumFunction) semanticObject); 
				return; 
			case Sql_dslPackage.TABLE_DECLARATION:
				sequence_TableDeclaration(context, (TableDeclaration) semanticObject); 
				return; 
			case Sql_dslPackage.TABLE_NAME:
				sequence_tableName(context, (TableName) semanticObject); 
				return; 
			case Sql_dslPackage.TRUNCATE_TABLE_STATEMENT:
				sequence_TruncateTableStatement(context, (TruncateTableStatement) semanticObject); 
				return; 
			case Sql_dslPackage.UPDATE_TABLE_STATEMENT:
				sequence_UpdateTableStatement(context, (UpdateTableStatement) semanticObject); 
				return; 
			case Sql_dslPackage.VARIABLE_DECLARATION_STATEMENT:
				sequence_VariableDeclarationStatement(context, (VariableDeclarationStatement) semanticObject); 
				return; 
			case Sql_dslPackage.WHERE_DEC:
				sequence_WhereDec(context, (WhereDec) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AlterAddStatement returns AlterAddStatement
	 *
	 * Constraint:
	 *     column+=[CD|ID]
	 */
	protected void sequence_AlterAddStatement(ISerializationContext context, AlterAddStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AlterDropStatement returns AlterDropStatement
	 *
	 * Constraint:
	 *     column+=[CD|ID]
	 */
	protected void sequence_AlterDropStatement(ISerializationContext context, AlterDropStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns AlterTableStatement
	 *     AlterTableStatement returns AlterTableStatement
	 *
	 * Constraint:
	 *     (table+=[TableName|ID] (addDropUpdate=AlterDropStatement | addDropUpdate=AlterAddStatement | addDropUpdate=AlterUpdateStatement))
	 */
	protected void sequence_AlterTableStatement(ISerializationContext context, AlterTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AlterUpdateStatement returns AlterUpdateStatement
	 *
	 * Constraint:
	 *     column+=[CD|ID]
	 */
	protected void sequence_AlterUpdateStatement(ISerializationContext context, AlterUpdateStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns AvgFunction
	 *     Functions returns AvgFunction
	 *     AvgFunction returns AvgFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_AvgFunction(ISerializationContext context, AvgFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ColumnDeclaration returns CD
	 *
	 * Constraint:
	 *     (name=ID type=DataStructureType notNull?='NOT NULL'?)
	 */
	protected void sequence_ColumnDeclaration(ISerializationContext context, CD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ColumnReferencing returns ColumnReferencing
	 *
	 * Constraint:
	 *     var=[CD|ID]
	 */
	protected void sequence_ColumnReferencing(ISerializationContext context, ColumnReferencing semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.COLUMN_REFERENCING__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.COLUMN_REFERENCING__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColumnReferencingAccess().getVarCDIDTerminalRuleCall_0_1(), semanticObject.eGet(Sql_dslPackage.Literals.COLUMN_REFERENCING__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns CountFunction
	 *     Functions returns CountFunction
	 *     CountFunction returns CountFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_CountFunction(ISerializationContext context, CountFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns CreateTableStatement
	 *     CreateTableStatement returns CreateTableStatement
	 *
	 * Constraint:
	 *     tables+=TableDeclaration+
	 */
	protected void sequence_CreateTableStatement(ISerializationContext context, CreateTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DatabaseDeclarationStatement
	 *     DatabaseDeclarationStatement returns DatabaseDeclarationStatement
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DatabaseDeclarationStatement(ISerializationContext context, DatabaseDeclarationStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.DATABASE_DECLARATION_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.DATABASE_DECLARATION_STATEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDatabaseDeclarationStatementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DeleteTableStatement
	 *     DeleteTableStatement returns DeleteTableStatement
	 *
	 * Constraint:
	 *     x=FromAndWhereClauses
	 */
	protected void sequence_DeleteTableStatement(ISerializationContext context, DeleteTableStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.DELETE_TABLE_STATEMENT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.DELETE_TABLE_STATEMENT__X));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeleteTableStatementAccess().getXFromAndWhereClausesParserRuleCall_1_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DropTableStatement
	 *     DropTableStatement returns DropTableStatement
	 *
	 * Constraint:
	 *     (table+=[TableName|ID] table+=[TableName|ID]*)
	 */
	protected void sequence_DropTableStatement(ISerializationContext context, DropTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ForeignKey returns ForeignKey
	 *
	 * Constraint:
	 *     (columnAsFK+=[CD|ID] columnAsFK+=[CD|ID]* foreignTable=[TableDeclaration|ID] foreignColumns+=[CD|ID] foreignColumns+=[CD|ID]*)
	 */
	protected void sequence_ForeignKey(ISerializationContext context, ForeignKey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FromAndWhereClauses returns FromAndWhereClauses
	 *
	 * Constraint:
	 *     (table=[TableName|ID] (z+=WhereDec z+=WhereDec*)?)
	 */
	protected void sequence_FromAndWhereClauses(ISerializationContext context, FromAndWhereClauses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntLiteral returns IntLiteral
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_IntLiteral(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.INT_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.INT_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IntVarExpression returns IntVarExpression
	 *
	 * Constraint:
	 *     var=[VariableDeclarationStatement|ID]
	 */
	protected void sequence_IntVarExpression(ISerializationContext context, IntVarExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.INT_VAR_EXPRESSION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.INT_VAR_EXPRESSION__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationStatementIDTerminalRuleCall_0_1(), semanticObject.eGet(Sql_dslPackage.Literals.INT_VAR_EXPRESSION__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns MaxFunction
	 *     Functions returns MaxFunction
	 *     MaxFunction returns MaxFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_MaxFunction(ISerializationContext context, MaxFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns MinFunction
	 *     Functions returns MinFunction
	 *     MinFunction returns MinFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_MinFunction(ISerializationContext context, MinFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryKey returns PrimaryKey
	 *
	 * Constraint:
	 *     (columnAsPK+=[CD|ID] columnAsPK+=[CD|ID]*)
	 */
	protected void sequence_PrimaryKey(ISerializationContext context, PrimaryKey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RealLiteral returns RealLiteral
	 *
	 * Constraint:
	 *     val=REAL
	 */
	protected void sequence_RealLiteral(ISerializationContext context, RealLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.REAL_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.REAL_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RightOperandOne returns RightOperandOne
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RightOperandOne(ISerializationContext context, RightOperandOne semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.RIGHT_OPERAND_ONE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.RIGHT_OPERAND_ONE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRightOperandOneAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RightOperandThree returns RightOperandThree
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_RightOperandThree(ISerializationContext context, RightOperandThree semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.RIGHT_OPERAND_THREE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.RIGHT_OPERAND_THREE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRightOperandThreeAccess().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RightOperandTwo returns RightOperandTwo
	 *
	 * Constraint:
	 *     column+=[CD|ID]
	 */
	protected void sequence_RightOperandTwo(ISerializationContext context, RightOperandTwo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SelectStatement
	 *     SelectStatement returns SelectStatement
	 *
	 * Constraint:
	 *     ((column+=[CD|ID] column+=[CD|ID]*)* x=FromAndWhereClauses)
	 */
	protected void sequence_SelectStatement(ISerializationContext context, SelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SetClause returns SetClause
	 *
	 * Constraint:
	 *     (column+=[CD|ID] (name=ID | val=INT))
	 */
	protected void sequence_SetClause(ISerializationContext context, SetClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SumFunction
	 *     Functions returns SumFunction
	 *     SumFunction returns SumFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_SumFunction(ISerializationContext context, SumFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TableDeclaration returns TableDeclaration
	 *
	 * Constraint:
	 *     (
	 *         table+=tableName 
	 *         (attributes+=ColumnDeclaration | attributes+=PrimaryKey | attributes+=ForeignKey)+ 
	 *         attributes+=ColumnDeclaration? 
	 *         ((attributes+=PrimaryKey | attributes+=ForeignKey)? attributes+=ColumnDeclaration?)*
	 *     )
	 */
	protected void sequence_TableDeclaration(ISerializationContext context, TableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns TruncateTableStatement
	 *     TruncateTableStatement returns TruncateTableStatement
	 *
	 * Constraint:
	 *     (table+=[TableName|ID] table+=[TableName|ID]*)
	 */
	protected void sequence_TruncateTableStatement(ISerializationContext context, TruncateTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns UpdateTableStatement
	 *     UpdateTableStatement returns UpdateTableStatement
	 *
	 * Constraint:
	 *     (table+=[TableName|ID] sc+=SetClause sc+=SetClause* (z+=WhereDec z+=WhereDec*)?)
	 */
	protected void sequence_UpdateTableStatement(ISerializationContext context, UpdateTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns VariableDeclarationStatement
	 *     VariableDeclarationStatement returns VariableDeclarationStatement
	 *
	 * Constraint:
	 *     (name=ID value=INT)
	 */
	protected void sequence_VariableDeclarationStatement(ISerializationContext context, VariableDeclarationStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.VARIABLE_DECLARATION_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.VARIABLE_DECLARATION_STATEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.VARIABLE_DECLARATION_STATEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.VARIABLE_DECLARATION_STATEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableDeclarationStatementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDeclarationStatementAccess().getValueINTTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WhereDec returns WhereDec
	 *
	 * Constraint:
	 *     (
	 *         column+=[CD|ID] 
	 *         (
	 *             sign='=' | 
	 *             sign='<' | 
	 *             sign='<=' | 
	 *             sign='>' | 
	 *             sign='>=' | 
	 *             sign='!=' | 
	 *             sign='LIKE'
	 *         ) 
	 *         (rightOperand=RightOperandOne | rightOperand=RightOperandTwo | rightOperand=RightOperandThree)
	 *     )
	 */
	protected void sequence_WhereDec(ISerializationContext context, WhereDec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     tableName returns TableName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_tableName(ISerializationContext context, TableName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.TABLE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.TABLE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
