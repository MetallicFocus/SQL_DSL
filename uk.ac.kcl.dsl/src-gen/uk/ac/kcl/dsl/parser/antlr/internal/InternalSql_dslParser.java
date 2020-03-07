package uk.ac.kcl.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.dsl.services.Sql_dslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSql_dslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECT'", "'FROM'", "'CREATE'", "'DATABASE'", "'TABLE'", "'('", "','", "')'", "'NOT NULL'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'DROP'", "'TRUNCATE'", "'ALTER'", "'COLUMN'", "'ADD'", "'var'", "'='", "'.'", "'varchar'", "'char'", "'date'", "'int'", "'float'", "'time'", "'text'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSql_dslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSql_dslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSql_dslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSql_dsl.g"; }



     	private Sql_dslGrammarAccess grammarAccess;

        public InternalSql_dslParser(TokenStream input, Sql_dslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Sql_dslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSql_dsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSql_dsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSql_dsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSql_dsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) ) )
            // InternalSql_dsl.g:79:2: ( (lv_statements_0_0= ruleStatement ) )
            {
            // InternalSql_dsl.g:79:2: ( (lv_statements_0_0= ruleStatement ) )
            // InternalSql_dsl.g:80:3: (lv_statements_0_0= ruleStatement )
            {
            // InternalSql_dsl.g:80:3: (lv_statements_0_0= ruleStatement )
            // InternalSql_dsl.g:81:4: lv_statements_0_0= ruleStatement
            {

            				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_statements_0_0=ruleStatement();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"statements",
            					lv_statements_0_0,
            					"uk.ac.kcl.dsl.Sql_dsl.Statement");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalSql_dsl.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSql_dsl.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSql_dsl.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalSql_dsl.g:108:1: ruleStatement returns [EObject current=null] : (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement | this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement | this_SelectStatement_6= ruleSelectStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DatabaseDeclarationStatement_0 = null;

        EObject this_CreateTableStatement_1 = null;

        EObject this_DropTableStatement_2 = null;

        EObject this_TruncateTableStatement_3 = null;

        EObject this_AlterTableStatement_4 = null;

        EObject this_VariableDeclarationStatement_5 = null;

        EObject this_SelectStatement_6 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:114:2: ( (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement | this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement | this_SelectStatement_6= ruleSelectStatement ) )
            // InternalSql_dsl.g:115:2: (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement | this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement | this_SelectStatement_6= ruleSelectStatement )
            {
            // InternalSql_dsl.g:115:2: (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement | this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement | this_SelectStatement_6= ruleSelectStatement )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==14) ) {
                    alt1=1;
                }
                else if ( (LA1_1==15) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case 29:
                {
                alt1=6;
                }
                break;
            case 11:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSql_dsl.g:116:3: this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDatabaseDeclarationStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatabaseDeclarationStatement_0=ruleDatabaseDeclarationStatement();

                    state._fsp--;


                    			current = this_DatabaseDeclarationStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:125:3: this_CreateTableStatement_1= ruleCreateTableStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateTableStatement_1=ruleCreateTableStatement();

                    state._fsp--;


                    			current = this_CreateTableStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:134:3: this_DropTableStatement_2= ruleDropTableStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDropTableStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropTableStatement_2=ruleDropTableStatement();

                    state._fsp--;


                    			current = this_DropTableStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:143:3: this_TruncateTableStatement_3= ruleTruncateTableStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTruncateTableStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TruncateTableStatement_3=ruleTruncateTableStatement();

                    state._fsp--;


                    			current = this_TruncateTableStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:152:3: this_AlterTableStatement_4= ruleAlterTableStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAlterTableStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlterTableStatement_4=ruleAlterTableStatement();

                    state._fsp--;


                    			current = this_AlterTableStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:161:3: this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclarationStatement_5=ruleVariableDeclarationStatement();

                    state._fsp--;


                    			current = this_VariableDeclarationStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:170:3: this_SelectStatement_6= ruleSelectStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectStatement_6=ruleSelectStatement();

                    state._fsp--;


                    			current = this_SelectStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalSql_dsl.g:182:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalSql_dsl.g:182:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalSql_dsl.g:183:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalSql_dsl.g:189:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:195:2: ( (otherlv_0= 'SELECT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSql_dsl.g:196:2: (otherlv_0= 'SELECT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:196:2: (otherlv_0= 'SELECT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) ) )
            // InternalSql_dsl.g:197:3: otherlv_0= 'SELECT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getSELECTKeyword_0());
            		
            // InternalSql_dsl.g:201:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSql_dsl.g:202:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSql_dsl.g:202:4: (lv_name_1_0= RULE_ID )
            // InternalSql_dsl.g:203:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSelectStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getFROMKeyword_2());
            		
            // InternalSql_dsl.g:223:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:224:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:224:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:225:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectStatementRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleDatabaseDeclarationStatement"
    // InternalSql_dsl.g:240:1: entryRuleDatabaseDeclarationStatement returns [EObject current=null] : iv_ruleDatabaseDeclarationStatement= ruleDatabaseDeclarationStatement EOF ;
    public final EObject entryRuleDatabaseDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseDeclarationStatement = null;


        try {
            // InternalSql_dsl.g:240:69: (iv_ruleDatabaseDeclarationStatement= ruleDatabaseDeclarationStatement EOF )
            // InternalSql_dsl.g:241:2: iv_ruleDatabaseDeclarationStatement= ruleDatabaseDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getDatabaseDeclarationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabaseDeclarationStatement=ruleDatabaseDeclarationStatement();

            state._fsp--;

             current =iv_ruleDatabaseDeclarationStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabaseDeclarationStatement"


    // $ANTLR start "ruleDatabaseDeclarationStatement"
    // InternalSql_dsl.g:247:1: ruleDatabaseDeclarationStatement returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDatabaseDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:253:2: ( (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:254:2: (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:254:2: (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:255:3: otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseDeclarationStatementAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseDeclarationStatementAccess().getDATABASEKeyword_1());
            		
            // InternalSql_dsl.g:263:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:264:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:264:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:265:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDatabaseDeclarationStatementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseDeclarationStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabaseDeclarationStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // InternalSql_dsl.g:285:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // InternalSql_dsl.g:285:61: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // InternalSql_dsl.g:286:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;

             current =iv_ruleCreateTableStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // InternalSql_dsl.g:292:1: ruleCreateTableStatement returns [EObject current=null] : ( (lv_tables_0_0= ruleTableDeclaration ) )* ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:298:2: ( ( (lv_tables_0_0= ruleTableDeclaration ) )* )
            // InternalSql_dsl.g:299:2: ( (lv_tables_0_0= ruleTableDeclaration ) )*
            {
            // InternalSql_dsl.g:299:2: ( (lv_tables_0_0= ruleTableDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSql_dsl.g:300:3: (lv_tables_0_0= ruleTableDeclaration )
            	    {
            	    // InternalSql_dsl.g:300:3: (lv_tables_0_0= ruleTableDeclaration )
            	    // InternalSql_dsl.g:301:4: lv_tables_0_0= ruleTableDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getCreateTableStatementAccess().getTablesTableDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_6);
            	    lv_tables_0_0=ruleTableDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	    				}
            	    				add(
            	    					current,
            	    					"tables",
            	    					lv_tables_0_0,
            	    					"uk.ac.kcl.dsl.Sql_dsl.TableDeclaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleTableDeclaration"
    // InternalSql_dsl.g:321:1: entryRuleTableDeclaration returns [EObject current=null] : iv_ruleTableDeclaration= ruleTableDeclaration EOF ;
    public final EObject entryRuleTableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDeclaration = null;


        try {
            // InternalSql_dsl.g:321:57: (iv_ruleTableDeclaration= ruleTableDeclaration EOF )
            // InternalSql_dsl.g:322:2: iv_ruleTableDeclaration= ruleTableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableDeclaration=ruleTableDeclaration();

            state._fsp--;

             current =iv_ruleTableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableDeclaration"


    // $ANTLR start "ruleTableDeclaration"
    // InternalSql_dsl.g:328:1: ruleTableDeclaration returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleTableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_4_1 = null;

        EObject lv_attributes_4_2 = null;

        EObject lv_attributes_4_3 = null;

        EObject lv_attributes_6_1 = null;

        EObject lv_attributes_6_2 = null;

        EObject lv_attributes_6_3 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:334:2: ( (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) )
            // InternalSql_dsl.g:335:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            {
            // InternalSql_dsl.g:335:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            // InternalSql_dsl.g:336:3: otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTableDeclarationAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTableDeclarationAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:344:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:345:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:345:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:346:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTableDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTableDeclarationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSql_dsl.g:366:3: ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==20||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSql_dsl.g:367:4: ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) )
            	    {
            	    // InternalSql_dsl.g:367:4: ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) )
            	    // InternalSql_dsl.g:368:5: (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey )
            	    {
            	    // InternalSql_dsl.g:368:5: (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // InternalSql_dsl.g:369:6: lv_attributes_4_1= ruleColumnDeclaration
            	            {

            	            						newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_attributes_4_1=ruleColumnDeclaration();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTableDeclarationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"attributes",
            	            							lv_attributes_4_1,
            	            							"uk.ac.kcl.dsl.Sql_dsl.ColumnDeclaration");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalSql_dsl.g:385:6: lv_attributes_4_2= rulePrimaryKey
            	            {

            	            						newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_attributes_4_2=rulePrimaryKey();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTableDeclarationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"attributes",
            	            							lv_attributes_4_2,
            	            							"uk.ac.kcl.dsl.Sql_dsl.PrimaryKey");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalSql_dsl.g:401:6: lv_attributes_4_3= ruleForeignKey
            	            {

            	            						newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_attributes_4_3=ruleForeignKey();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTableDeclarationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"attributes",
            	            							lv_attributes_4_3,
            	            							"uk.ac.kcl.dsl.Sql_dsl.ForeignKey");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalSql_dsl.g:419:3: (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSql_dsl.g:420:4: otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTableDeclarationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSql_dsl.g:424:4: ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) )
            	    // InternalSql_dsl.g:425:5: ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) )
            	    {
            	    // InternalSql_dsl.g:425:5: ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) )
            	    // InternalSql_dsl.g:426:6: (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey )
            	    {
            	    // InternalSql_dsl.g:426:6: (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey )
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // InternalSql_dsl.g:427:7: lv_attributes_6_1= ruleColumnDeclaration
            	            {

            	            							newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_5_1_0_0());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_attributes_6_1=ruleColumnDeclaration();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTableDeclarationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"attributes",
            	            								lv_attributes_6_1,
            	            								"uk.ac.kcl.dsl.Sql_dsl.ColumnDeclaration");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSql_dsl.g:443:7: lv_attributes_6_2= rulePrimaryKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_5_1_0_1());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_attributes_6_2=rulePrimaryKey();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTableDeclarationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"attributes",
            	            								lv_attributes_6_2,
            	            								"uk.ac.kcl.dsl.Sql_dsl.PrimaryKey");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalSql_dsl.g:459:7: lv_attributes_6_3= ruleForeignKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_5_1_0_2());
            	            						
            	            pushFollow(FOLLOW_11);
            	            lv_attributes_6_3=ruleForeignKey();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTableDeclarationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"attributes",
            	            								lv_attributes_6_3,
            	            								"uk.ac.kcl.dsl.Sql_dsl.ForeignKey");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTableDeclarationAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableDeclaration"


    // $ANTLR start "entryRuleColumnDeclaration"
    // InternalSql_dsl.g:486:1: entryRuleColumnDeclaration returns [EObject current=null] : iv_ruleColumnDeclaration= ruleColumnDeclaration EOF ;
    public final EObject entryRuleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDeclaration = null;


        try {
            // InternalSql_dsl.g:486:58: (iv_ruleColumnDeclaration= ruleColumnDeclaration EOF )
            // InternalSql_dsl.g:487:2: iv_ruleColumnDeclaration= ruleColumnDeclaration EOF
            {
             newCompositeNode(grammarAccess.getColumnDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnDeclaration=ruleColumnDeclaration();

            state._fsp--;

             current =iv_ruleColumnDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnDeclaration"


    // $ANTLR start "ruleColumnDeclaration"
    // InternalSql_dsl.g:493:1: ruleColumnDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? ) ;
    public final EObject ruleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_notNull_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:499:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? ) )
            // InternalSql_dsl.g:500:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? )
            {
            // InternalSql_dsl.g:500:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? )
            // InternalSql_dsl.g:501:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )?
            {
            // InternalSql_dsl.g:501:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSql_dsl.g:502:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSql_dsl.g:502:4: (lv_name_0_0= RULE_ID )
            // InternalSql_dsl.g:503:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColumnDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSql_dsl.g:519:3: ( (lv_type_1_0= ruleDataStructureType ) )
            // InternalSql_dsl.g:520:4: (lv_type_1_0= ruleDataStructureType )
            {
            // InternalSql_dsl.g:520:4: (lv_type_1_0= ruleDataStructureType )
            // InternalSql_dsl.g:521:5: lv_type_1_0= ruleDataStructureType
            {

            					newCompositeNode(grammarAccess.getColumnDeclarationAccess().getTypeDataStructureTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_1_0=ruleDataStructureType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"uk.ac.kcl.dsl.Sql_dsl.DataStructureType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSql_dsl.g:538:3: ( (lv_notNull_2_0= 'NOT NULL' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSql_dsl.g:539:4: (lv_notNull_2_0= 'NOT NULL' )
                    {
                    // InternalSql_dsl.g:539:4: (lv_notNull_2_0= 'NOT NULL' )
                    // InternalSql_dsl.g:540:5: lv_notNull_2_0= 'NOT NULL'
                    {
                    lv_notNull_2_0=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_notNull_2_0, grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "notNull", true, "NOT NULL");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnDeclaration"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalSql_dsl.g:556:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalSql_dsl.g:556:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalSql_dsl.g:557:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;

             current =iv_rulePrimaryKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // InternalSql_dsl.g:563:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:569:2: ( (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) )
            // InternalSql_dsl.g:570:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // InternalSql_dsl.g:570:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            // InternalSql_dsl.g:571:3: otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:583:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:584:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:584:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:585:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_3_0());
            				

            }


            }

            // InternalSql_dsl.g:596:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSql_dsl.g:597:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSql_dsl.g:601:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSql_dsl.g:602:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:602:5: (otherlv_5= RULE_ID )
            	    // InternalSql_dsl.g:603:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleForeignKey"
    // InternalSql_dsl.g:623:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSql_dsl.g:623:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSql_dsl.g:624:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalSql_dsl.g:630:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:636:2: ( (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) )
            // InternalSql_dsl.g:637:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            {
            // InternalSql_dsl.g:637:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            // InternalSql_dsl.g:638:3: otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:650:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:651:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:651:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:652:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_3_0());
            				

            }


            }

            // InternalSql_dsl.g:663:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSql_dsl.g:664:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSql_dsl.g:668:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSql_dsl.g:669:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:669:5: (otherlv_5= RULE_ID )
            	    // InternalSql_dsl.g:670:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6());
            		
            // InternalSql_dsl.g:690:3: ( (otherlv_8= RULE_ID ) )
            // InternalSql_dsl.g:691:4: (otherlv_8= RULE_ID )
            {
            // InternalSql_dsl.g:691:4: (otherlv_8= RULE_ID )
            // InternalSql_dsl.g:692:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationCrossReference_7_0());
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSql_dsl.g:707:3: ( (otherlv_10= RULE_ID ) )
            // InternalSql_dsl.g:708:4: (otherlv_10= RULE_ID )
            {
            // InternalSql_dsl.g:708:4: (otherlv_10= RULE_ID )
            // InternalSql_dsl.g:709:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_10, grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_9_0());
            				

            }


            }

            // InternalSql_dsl.g:720:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSql_dsl.g:721:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalSql_dsl.g:725:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalSql_dsl.g:726:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:726:5: (otherlv_12= RULE_ID )
            	    // InternalSql_dsl.g:727:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_12, grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleDropTableStatement"
    // InternalSql_dsl.g:747:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // InternalSql_dsl.g:747:59: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // InternalSql_dsl.g:748:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
             newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;

             current =iv_ruleDropTableStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropTableStatement"


    // $ANTLR start "ruleDropTableStatement"
    // InternalSql_dsl.g:754:1: ruleDropTableStatement returns [EObject current=null] : ( (lv_tables_0_0= ruleDropTableDeclaration ) )* ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:760:2: ( ( (lv_tables_0_0= ruleDropTableDeclaration ) )* )
            // InternalSql_dsl.g:761:2: ( (lv_tables_0_0= ruleDropTableDeclaration ) )*
            {
            // InternalSql_dsl.g:761:2: ( (lv_tables_0_0= ruleDropTableDeclaration ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSql_dsl.g:762:3: (lv_tables_0_0= ruleDropTableDeclaration )
            	    {
            	    // InternalSql_dsl.g:762:3: (lv_tables_0_0= ruleDropTableDeclaration )
            	    // InternalSql_dsl.g:763:4: lv_tables_0_0= ruleDropTableDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getDropTableStatementAccess().getTablesDropTableDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_16);
            	    lv_tables_0_0=ruleDropTableDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDropTableStatementRule());
            	    				}
            	    				add(
            	    					current,
            	    					"tables",
            	    					lv_tables_0_0,
            	    					"uk.ac.kcl.dsl.Sql_dsl.DropTableDeclaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropTableStatement"


    // $ANTLR start "entryRuleDropTableDeclaration"
    // InternalSql_dsl.g:783:1: entryRuleDropTableDeclaration returns [EObject current=null] : iv_ruleDropTableDeclaration= ruleDropTableDeclaration EOF ;
    public final EObject entryRuleDropTableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableDeclaration = null;


        try {
            // InternalSql_dsl.g:783:61: (iv_ruleDropTableDeclaration= ruleDropTableDeclaration EOF )
            // InternalSql_dsl.g:784:2: iv_ruleDropTableDeclaration= ruleDropTableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDropTableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropTableDeclaration=ruleDropTableDeclaration();

            state._fsp--;

             current =iv_ruleDropTableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropTableDeclaration"


    // $ANTLR start "ruleDropTableDeclaration"
    // InternalSql_dsl.g:790:1: ruleDropTableDeclaration returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDropTableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:796:2: ( (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:797:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:797:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:798:3: otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDropTableDeclarationAccess().getDROPKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDropTableDeclarationAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:806:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:807:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:807:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:808:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDropTableDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropTableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropTableDeclaration"


    // $ANTLR start "entryRuleTruncateTableStatement"
    // InternalSql_dsl.g:828:1: entryRuleTruncateTableStatement returns [EObject current=null] : iv_ruleTruncateTableStatement= ruleTruncateTableStatement EOF ;
    public final EObject entryRuleTruncateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTruncateTableStatement = null;


        try {
            // InternalSql_dsl.g:828:63: (iv_ruleTruncateTableStatement= ruleTruncateTableStatement EOF )
            // InternalSql_dsl.g:829:2: iv_ruleTruncateTableStatement= ruleTruncateTableStatement EOF
            {
             newCompositeNode(grammarAccess.getTruncateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTruncateTableStatement=ruleTruncateTableStatement();

            state._fsp--;

             current =iv_ruleTruncateTableStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTruncateTableStatement"


    // $ANTLR start "ruleTruncateTableStatement"
    // InternalSql_dsl.g:835:1: ruleTruncateTableStatement returns [EObject current=null] : ( (lv_tables_0_0= ruleTruncateTableDeclaration ) )* ;
    public final EObject ruleTruncateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:841:2: ( ( (lv_tables_0_0= ruleTruncateTableDeclaration ) )* )
            // InternalSql_dsl.g:842:2: ( (lv_tables_0_0= ruleTruncateTableDeclaration ) )*
            {
            // InternalSql_dsl.g:842:2: ( (lv_tables_0_0= ruleTruncateTableDeclaration ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSql_dsl.g:843:3: (lv_tables_0_0= ruleTruncateTableDeclaration )
            	    {
            	    // InternalSql_dsl.g:843:3: (lv_tables_0_0= ruleTruncateTableDeclaration )
            	    // InternalSql_dsl.g:844:4: lv_tables_0_0= ruleTruncateTableDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getTruncateTableStatementAccess().getTablesTruncateTableDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    lv_tables_0_0=ruleTruncateTableDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTruncateTableStatementRule());
            	    				}
            	    				add(
            	    					current,
            	    					"tables",
            	    					lv_tables_0_0,
            	    					"uk.ac.kcl.dsl.Sql_dsl.TruncateTableDeclaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTruncateTableStatement"


    // $ANTLR start "entryRuleTruncateTableDeclaration"
    // InternalSql_dsl.g:864:1: entryRuleTruncateTableDeclaration returns [EObject current=null] : iv_ruleTruncateTableDeclaration= ruleTruncateTableDeclaration EOF ;
    public final EObject entryRuleTruncateTableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTruncateTableDeclaration = null;


        try {
            // InternalSql_dsl.g:864:65: (iv_ruleTruncateTableDeclaration= ruleTruncateTableDeclaration EOF )
            // InternalSql_dsl.g:865:2: iv_ruleTruncateTableDeclaration= ruleTruncateTableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTruncateTableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTruncateTableDeclaration=ruleTruncateTableDeclaration();

            state._fsp--;

             current =iv_ruleTruncateTableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTruncateTableDeclaration"


    // $ANTLR start "ruleTruncateTableDeclaration"
    // InternalSql_dsl.g:871:1: ruleTruncateTableDeclaration returns [EObject current=null] : (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTruncateTableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:877:2: ( (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:878:2: (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:878:2: (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:879:3: otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTruncateTableDeclarationAccess().getTRUNCATEKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTruncateTableDeclarationAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:887:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:888:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:888:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:889:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTruncateTableDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTruncateTableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTruncateTableDeclaration"


    // $ANTLR start "entryRuleAlterTableStatement"
    // InternalSql_dsl.g:909:1: entryRuleAlterTableStatement returns [EObject current=null] : iv_ruleAlterTableStatement= ruleAlterTableStatement EOF ;
    public final EObject entryRuleAlterTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableStatement = null;


        try {
            // InternalSql_dsl.g:909:60: (iv_ruleAlterTableStatement= ruleAlterTableStatement EOF )
            // InternalSql_dsl.g:910:2: iv_ruleAlterTableStatement= ruleAlterTableStatement EOF
            {
             newCompositeNode(grammarAccess.getAlterTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlterTableStatement=ruleAlterTableStatement();

            state._fsp--;

             current =iv_ruleAlterTableStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlterTableStatement"


    // $ANTLR start "ruleAlterTableStatement"
    // InternalSql_dsl.g:916:1: ruleAlterTableStatement returns [EObject current=null] : (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) ) ;
    public final EObject ruleAlterTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_addDropUpdate_3_1 = null;

        EObject lv_addDropUpdate_3_2 = null;

        EObject lv_addDropUpdate_3_3 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:922:2: ( (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) ) )
            // InternalSql_dsl.g:923:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) )
            {
            // InternalSql_dsl.g:923:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) )
            // InternalSql_dsl.g:924:3: otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterTableStatementAccess().getALTERKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterTableStatementAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:932:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:933:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:933:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:934:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAlterTableStatementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterTableStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSql_dsl.g:950:3: ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) )
            // InternalSql_dsl.g:951:4: ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) )
            {
            // InternalSql_dsl.g:951:4: ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) )
            // InternalSql_dsl.g:952:5: (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement )
            {
            // InternalSql_dsl.g:952:5: (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSql_dsl.g:953:6: lv_addDropUpdate_3_1= ruleAlterDropStatement
                    {

                    						newCompositeNode(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlterDropStatementParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_addDropUpdate_3_1=ruleAlterDropStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlterTableStatementRule());
                    						}
                    						set(
                    							current,
                    							"addDropUpdate",
                    							lv_addDropUpdate_3_1,
                    							"uk.ac.kcl.dsl.Sql_dsl.AlterDropStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:969:6: lv_addDropUpdate_3_2= ruleAlterAddStatement
                    {

                    						newCompositeNode(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlterAddStatementParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_addDropUpdate_3_2=ruleAlterAddStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlterTableStatementRule());
                    						}
                    						set(
                    							current,
                    							"addDropUpdate",
                    							lv_addDropUpdate_3_2,
                    							"uk.ac.kcl.dsl.Sql_dsl.AlterAddStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:985:6: lv_addDropUpdate_3_3= ruleAlterUpdateStatement
                    {

                    						newCompositeNode(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlterUpdateStatementParserRuleCall_3_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_addDropUpdate_3_3=ruleAlterUpdateStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlterTableStatementRule());
                    						}
                    						set(
                    							current,
                    							"addDropUpdate",
                    							lv_addDropUpdate_3_3,
                    							"uk.ac.kcl.dsl.Sql_dsl.AlterUpdateStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlterTableStatement"


    // $ANTLR start "entryRuleAlterDropStatement"
    // InternalSql_dsl.g:1007:1: entryRuleAlterDropStatement returns [EObject current=null] : iv_ruleAlterDropStatement= ruleAlterDropStatement EOF ;
    public final EObject entryRuleAlterDropStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDropStatement = null;


        try {
            // InternalSql_dsl.g:1007:59: (iv_ruleAlterDropStatement= ruleAlterDropStatement EOF )
            // InternalSql_dsl.g:1008:2: iv_ruleAlterDropStatement= ruleAlterDropStatement EOF
            {
             newCompositeNode(grammarAccess.getAlterDropStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlterDropStatement=ruleAlterDropStatement();

            state._fsp--;

             current =iv_ruleAlterDropStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlterDropStatement"


    // $ANTLR start "ruleAlterDropStatement"
    // InternalSql_dsl.g:1014:1: ruleAlterDropStatement returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterDropStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1020:2: ( (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:1021:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:1021:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:1022:3: otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterDropStatementAccess().getDROPKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterDropStatementAccess().getCOLUMNKeyword_1());
            		
            // InternalSql_dsl.g:1030:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:1031:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:1031:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:1032:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAlterDropStatementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterDropStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlterDropStatement"


    // $ANTLR start "entryRuleAlterAddStatement"
    // InternalSql_dsl.g:1052:1: entryRuleAlterAddStatement returns [EObject current=null] : iv_ruleAlterAddStatement= ruleAlterAddStatement EOF ;
    public final EObject entryRuleAlterAddStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterAddStatement = null;


        try {
            // InternalSql_dsl.g:1052:58: (iv_ruleAlterAddStatement= ruleAlterAddStatement EOF )
            // InternalSql_dsl.g:1053:2: iv_ruleAlterAddStatement= ruleAlterAddStatement EOF
            {
             newCompositeNode(grammarAccess.getAlterAddStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlterAddStatement=ruleAlterAddStatement();

            state._fsp--;

             current =iv_ruleAlterAddStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlterAddStatement"


    // $ANTLR start "ruleAlterAddStatement"
    // InternalSql_dsl.g:1059:1: ruleAlterAddStatement returns [EObject current=null] : (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAlterAddStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1065:2: ( (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSql_dsl.g:1066:2: (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:1066:2: (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) )
            // InternalSql_dsl.g:1067:3: otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterAddStatementAccess().getADDKeyword_0());
            		
            // InternalSql_dsl.g:1071:3: ( (otherlv_1= RULE_ID ) )
            // InternalSql_dsl.g:1072:4: (otherlv_1= RULE_ID )
            {
            // InternalSql_dsl.g:1072:4: (otherlv_1= RULE_ID )
            // InternalSql_dsl.g:1073:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterAddStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getAlterAddStatementAccess().getColumnCDCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlterAddStatement"


    // $ANTLR start "entryRuleAlterUpdateStatement"
    // InternalSql_dsl.g:1088:1: entryRuleAlterUpdateStatement returns [EObject current=null] : iv_ruleAlterUpdateStatement= ruleAlterUpdateStatement EOF ;
    public final EObject entryRuleAlterUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterUpdateStatement = null;


        try {
            // InternalSql_dsl.g:1088:61: (iv_ruleAlterUpdateStatement= ruleAlterUpdateStatement EOF )
            // InternalSql_dsl.g:1089:2: iv_ruleAlterUpdateStatement= ruleAlterUpdateStatement EOF
            {
             newCompositeNode(grammarAccess.getAlterUpdateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlterUpdateStatement=ruleAlterUpdateStatement();

            state._fsp--;

             current =iv_ruleAlterUpdateStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlterUpdateStatement"


    // $ANTLR start "ruleAlterUpdateStatement"
    // InternalSql_dsl.g:1095:1: ruleAlterUpdateStatement returns [EObject current=null] : (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1101:2: ( (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:1102:2: (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:1102:2: (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:1103:3: otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterUpdateStatementAccess().getALTERKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterUpdateStatementAccess().getCOLUMNKeyword_1());
            		
            // InternalSql_dsl.g:1111:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:1112:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:1112:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:1113:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAlterUpdateStatementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterUpdateStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlterUpdateStatement"


    // $ANTLR start "entryRuleVariableDeclarationStatement"
    // InternalSql_dsl.g:1133:1: entryRuleVariableDeclarationStatement returns [EObject current=null] : iv_ruleVariableDeclarationStatement= ruleVariableDeclarationStatement EOF ;
    public final EObject entryRuleVariableDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationStatement = null;


        try {
            // InternalSql_dsl.g:1133:69: (iv_ruleVariableDeclarationStatement= ruleVariableDeclarationStatement EOF )
            // InternalSql_dsl.g:1134:2: iv_ruleVariableDeclarationStatement= ruleVariableDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclarationStatement=ruleVariableDeclarationStatement();

            state._fsp--;

             current =iv_ruleVariableDeclarationStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationStatement"


    // $ANTLR start "ruleVariableDeclarationStatement"
    // InternalSql_dsl.g:1140:1: ruleVariableDeclarationStatement returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1146:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalSql_dsl.g:1147:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalSql_dsl.g:1147:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalSql_dsl.g:1148:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationStatementAccess().getVarKeyword_0());
            		
            // InternalSql_dsl.g:1152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSql_dsl.g:1153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSql_dsl.g:1153:4: (lv_name_1_0= RULE_ID )
            // InternalSql_dsl.g:1154:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationStatementAccess().getEqualsSignKeyword_2());
            		
            // InternalSql_dsl.g:1174:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalSql_dsl.g:1175:4: (lv_value_3_0= RULE_INT )
            {
            // InternalSql_dsl.g:1175:4: (lv_value_3_0= RULE_INT )
            // InternalSql_dsl.g:1176:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationStatementAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclarationStatement"


    // $ANTLR start "entryRuleREAL"
    // InternalSql_dsl.g:1196:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql_dsl.g:1198:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalSql_dsl.g:1199:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalSql_dsl.g:1208:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql_dsl.g:1215:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalSql_dsl.g:1216:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalSql_dsl.g:1216:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalSql_dsl.g:1217:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalSql_dsl.g:1217:3: (this_INT_0= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSql_dsl.g:1218:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleDataStructureType"
    // InternalSql_dsl.g:1245:1: ruleDataStructureType returns [Enumerator current=null] : ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) ) ;
    public final Enumerator ruleDataStructureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1251:2: ( ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) ) )
            // InternalSql_dsl.g:1252:2: ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) )
            {
            // InternalSql_dsl.g:1252:2: ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            case 35:
                {
                alt15=4;
                }
                break;
            case 36:
                {
                alt15=5;
                }
                break;
            case 37:
                {
                alt15=6;
                }
                break;
            case 38:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSql_dsl.g:1253:3: (enumLiteral_0= 'varchar' )
                    {
                    // InternalSql_dsl.g:1253:3: (enumLiteral_0= 'varchar' )
                    // InternalSql_dsl.g:1254:4: enumLiteral_0= 'varchar'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1261:3: (enumLiteral_1= 'char' )
                    {
                    // InternalSql_dsl.g:1261:3: (enumLiteral_1= 'char' )
                    // InternalSql_dsl.g:1262:4: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1269:3: (enumLiteral_2= 'date' )
                    {
                    // InternalSql_dsl.g:1269:3: (enumLiteral_2= 'date' )
                    // InternalSql_dsl.g:1270:4: enumLiteral_2= 'date'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:1277:3: (enumLiteral_3= 'int' )
                    {
                    // InternalSql_dsl.g:1277:3: (enumLiteral_3= 'int' )
                    // InternalSql_dsl.g:1278:4: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:1285:3: (enumLiteral_4= 'float' )
                    {
                    // InternalSql_dsl.g:1285:3: (enumLiteral_4= 'float' )
                    // InternalSql_dsl.g:1286:4: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:1293:3: (enumLiteral_5= 'time' )
                    {
                    // InternalSql_dsl.g:1293:3: (enumLiteral_5= 'time' )
                    // InternalSql_dsl.g:1294:4: enumLiteral_5= 'time'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:1301:3: (enumLiteral_6= 'text' )
                    {
                    // InternalSql_dsl.g:1301:3: (enumLiteral_6= 'text' )
                    // InternalSql_dsl.g:1302:4: enumLiteral_6= 'text'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getTEXTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataStructureTypeAccess().getTEXTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataStructureType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000500010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000560010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});

}