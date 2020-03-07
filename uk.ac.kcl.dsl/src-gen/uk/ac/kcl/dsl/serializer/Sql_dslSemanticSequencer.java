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
import uk.ac.kcl.dsl.sql_dsl.CD;
import uk.ac.kcl.dsl.sql_dsl.CreateTableStatement;
import uk.ac.kcl.dsl.sql_dsl.DatabaseDeclarationStatement;
import uk.ac.kcl.dsl.sql_dsl.DropTableDeclaration;
import uk.ac.kcl.dsl.sql_dsl.DropTableStatement;
import uk.ac.kcl.dsl.sql_dsl.ForeignKey;
import uk.ac.kcl.dsl.sql_dsl.IntLiteral;
import uk.ac.kcl.dsl.sql_dsl.IntVarExpression;
import uk.ac.kcl.dsl.sql_dsl.Model;
import uk.ac.kcl.dsl.sql_dsl.PrimaryKey;
import uk.ac.kcl.dsl.sql_dsl.RealLiteral;
import uk.ac.kcl.dsl.sql_dsl.SelectStatement;
import uk.ac.kcl.dsl.sql_dsl.Sql_dslPackage;
import uk.ac.kcl.dsl.sql_dsl.TableDeclaration;
import uk.ac.kcl.dsl.sql_dsl.TruncateTableDeclaration;
import uk.ac.kcl.dsl.sql_dsl.TruncateTableStatement;
import uk.ac.kcl.dsl.sql_dsl.VariableDeclarationStatement;

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
			case Sql_dslPackage.CD:
				sequence_ColumnDeclaration(context, (CD) semanticObject); 
				return; 
			case Sql_dslPackage.CREATE_TABLE_STATEMENT:
				sequence_CreateTableStatement(context, (CreateTableStatement) semanticObject); 
				return; 
			case Sql_dslPackage.DATABASE_DECLARATION_STATEMENT:
				sequence_DatabaseDeclarationStatement(context, (DatabaseDeclarationStatement) semanticObject); 
				return; 
			case Sql_dslPackage.DROP_TABLE_DECLARATION:
				sequence_DropTableDeclaration(context, (DropTableDeclaration) semanticObject); 
				return; 
			case Sql_dslPackage.DROP_TABLE_STATEMENT:
				sequence_DropTableStatement(context, (DropTableStatement) semanticObject); 
				return; 
			case Sql_dslPackage.FOREIGN_KEY:
				sequence_ForeignKey(context, (ForeignKey) semanticObject); 
				return; 
			case Sql_dslPackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case Sql_dslPackage.INT_VAR_EXPRESSION:
				sequence_IntVarExpression(context, (IntVarExpression) semanticObject); 
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
			case Sql_dslPackage.SELECT_STATEMENT:
				sequence_SelectStatement(context, (SelectStatement) semanticObject); 
				return; 
			case Sql_dslPackage.TABLE_DECLARATION:
				sequence_TableDeclaration(context, (TableDeclaration) semanticObject); 
				return; 
			case Sql_dslPackage.TRUNCATE_TABLE_DECLARATION:
				sequence_TruncateTableDeclaration(context, (TruncateTableDeclaration) semanticObject); 
				return; 
			case Sql_dslPackage.TRUNCATE_TABLE_STATEMENT:
				sequence_TruncateTableStatement(context, (TruncateTableStatement) semanticObject); 
				return; 
			case Sql_dslPackage.VARIABLE_DECLARATION_STATEMENT:
				sequence_VariableDeclarationStatement(context, (VariableDeclarationStatement) semanticObject); 
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
	 *     name=ID
	 */
	protected void sequence_AlterDropStatement(ISerializationContext context, AlterDropStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.ALTER_DROP_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.ALTER_DROP_STATEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlterDropStatementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns AlterTableStatement
	 *     AlterTableStatement returns AlterTableStatement
	 *
	 * Constraint:
	 *     (name=ID (addDropUpdate=AlterDropStatement | addDropUpdate=AlterAddStatement | addDropUpdate=AlterUpdateStatement))
	 */
	protected void sequence_AlterTableStatement(ISerializationContext context, AlterTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AlterUpdateStatement returns AlterUpdateStatement
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AlterUpdateStatement(ISerializationContext context, AlterUpdateStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.ALTER_UPDATE_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.ALTER_UPDATE_STATEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlterUpdateStatementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
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
	 *     DropTableDeclaration returns DropTableDeclaration
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DropTableDeclaration(ISerializationContext context, DropTableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.DROP_TABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.DROP_TABLE_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDropTableDeclarationAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DropTableStatement
	 *     DropTableStatement returns DropTableStatement
	 *
	 * Constraint:
	 *     tables+=DropTableDeclaration+
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
	 *     Model returns Model
	 *
	 * Constraint:
	 *     statements+=Statement
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
	 *     Statement returns SelectStatement
	 *     SelectStatement returns SelectStatement
	 *
	 * Constraint:
	 *     (name=ID column+=[CD|ID])
	 */
	protected void sequence_SelectStatement(ISerializationContext context, SelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TableDeclaration returns TableDeclaration
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
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
	 *     TruncateTableDeclaration returns TruncateTableDeclaration
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TruncateTableDeclaration(ISerializationContext context, TruncateTableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Sql_dslPackage.Literals.TRUNCATE_TABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Sql_dslPackage.Literals.TRUNCATE_TABLE_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTruncateTableDeclarationAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns TruncateTableStatement
	 *     TruncateTableStatement returns TruncateTableStatement
	 *
	 * Constraint:
	 *     tables+=TruncateTableDeclaration+
	 */
	protected void sequence_TruncateTableStatement(ISerializationContext context, TruncateTableStatement semanticObject) {
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
	
	
}
