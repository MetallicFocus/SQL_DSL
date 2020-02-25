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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CREATE'", "'DATABASE'", "'TABLE'", "'('", "','", "')'", "'NOT NULL'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'DROP'", "'TRUNCATE'", "'ALTER'", "'COLUMN'", "'ADD'", "'varchar'", "'char'", "'date'", "'int'", "'float'", "'time'", "'text'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    // InternalSql_dsl.g:108:1: ruleStatement returns [EObject current=null] : (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DatabaseDeclarationStatement_0 = null;

        EObject this_CreateTableStatement_1 = null;

        EObject this_DropTableStatement_2 = null;

        EObject this_TruncateTableStatement_3 = null;

        EObject this_AlterTableStatement_4 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:114:2: ( (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement ) )
            // InternalSql_dsl.g:115:2: (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement )
            {
            // InternalSql_dsl.g:115:2: (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==13) ) {
                    alt1=2;
                }
                else if ( (LA1_1==12) ) {
                    alt1=1;
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
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 24:
                {
                alt1=5;
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


    // $ANTLR start "entryRuleDatabaseDeclarationStatement"
    // InternalSql_dsl.g:164:1: entryRuleDatabaseDeclarationStatement returns [EObject current=null] : iv_ruleDatabaseDeclarationStatement= ruleDatabaseDeclarationStatement EOF ;
    public final EObject entryRuleDatabaseDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseDeclarationStatement = null;


        try {
            // InternalSql_dsl.g:164:69: (iv_ruleDatabaseDeclarationStatement= ruleDatabaseDeclarationStatement EOF )
            // InternalSql_dsl.g:165:2: iv_ruleDatabaseDeclarationStatement= ruleDatabaseDeclarationStatement EOF
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
    // InternalSql_dsl.g:171:1: ruleDatabaseDeclarationStatement returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDatabaseDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:177:2: ( (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:178:2: (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:178:2: (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:179:3: otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseDeclarationStatementAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseDeclarationStatementAccess().getDATABASEKeyword_1());
            		
            // InternalSql_dsl.g:187:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:188:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:188:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:189:5: lv_name_2_0= RULE_ID
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
    // InternalSql_dsl.g:209:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // InternalSql_dsl.g:209:61: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // InternalSql_dsl.g:210:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
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
    // InternalSql_dsl.g:216:1: ruleCreateTableStatement returns [EObject current=null] : ( (lv_tables_0_0= ruleTableDeclaration ) )* ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:222:2: ( ( (lv_tables_0_0= ruleTableDeclaration ) )* )
            // InternalSql_dsl.g:223:2: ( (lv_tables_0_0= ruleTableDeclaration ) )*
            {
            // InternalSql_dsl.g:223:2: ( (lv_tables_0_0= ruleTableDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSql_dsl.g:224:3: (lv_tables_0_0= ruleTableDeclaration )
            	    {
            	    // InternalSql_dsl.g:224:3: (lv_tables_0_0= ruleTableDeclaration )
            	    // InternalSql_dsl.g:225:4: lv_tables_0_0= ruleTableDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getCreateTableStatementAccess().getTablesTableDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_5);
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
    // InternalSql_dsl.g:245:1: entryRuleTableDeclaration returns [EObject current=null] : iv_ruleTableDeclaration= ruleTableDeclaration EOF ;
    public final EObject entryRuleTableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDeclaration = null;


        try {
            // InternalSql_dsl.g:245:57: (iv_ruleTableDeclaration= ruleTableDeclaration EOF )
            // InternalSql_dsl.g:246:2: iv_ruleTableDeclaration= ruleTableDeclaration EOF
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
    // InternalSql_dsl.g:252:1: ruleTableDeclaration returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) ;
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
            // InternalSql_dsl.g:258:2: ( (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) )
            // InternalSql_dsl.g:259:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            {
            // InternalSql_dsl.g:259:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            // InternalSql_dsl.g:260:3: otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTableDeclarationAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTableDeclarationAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:268:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:269:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:269:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:270:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getTableDeclarationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSql_dsl.g:290:3: ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==18||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSql_dsl.g:291:4: ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) )
            	    {
            	    // InternalSql_dsl.g:291:4: ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) )
            	    // InternalSql_dsl.g:292:5: (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey )
            	    {
            	    // InternalSql_dsl.g:292:5: (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 20:
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
            	            // InternalSql_dsl.g:293:6: lv_attributes_4_1= ruleColumnDeclaration
            	            {

            	            						newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_9);
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
            	            // InternalSql_dsl.g:309:6: lv_attributes_4_2= rulePrimaryKey
            	            {

            	            						newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_9);
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
            	            // InternalSql_dsl.g:325:6: lv_attributes_4_3= ruleForeignKey
            	            {

            	            						newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_9);
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

            // InternalSql_dsl.g:343:3: (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSql_dsl.g:344:4: otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTableDeclarationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSql_dsl.g:348:4: ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) )
            	    // InternalSql_dsl.g:349:5: ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) )
            	    {
            	    // InternalSql_dsl.g:349:5: ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) )
            	    // InternalSql_dsl.g:350:6: (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey )
            	    {
            	    // InternalSql_dsl.g:350:6: (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey )
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 20:
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
            	            // InternalSql_dsl.g:351:7: lv_attributes_6_1= ruleColumnDeclaration
            	            {

            	            							newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_5_1_0_0());
            	            						
            	            pushFollow(FOLLOW_10);
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
            	            // InternalSql_dsl.g:367:7: lv_attributes_6_2= rulePrimaryKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_5_1_0_1());
            	            						
            	            pushFollow(FOLLOW_10);
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
            	            // InternalSql_dsl.g:383:7: lv_attributes_6_3= ruleForeignKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_5_1_0_2());
            	            						
            	            pushFollow(FOLLOW_10);
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSql_dsl.g:410:1: entryRuleColumnDeclaration returns [EObject current=null] : iv_ruleColumnDeclaration= ruleColumnDeclaration EOF ;
    public final EObject entryRuleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDeclaration = null;


        try {
            // InternalSql_dsl.g:410:58: (iv_ruleColumnDeclaration= ruleColumnDeclaration EOF )
            // InternalSql_dsl.g:411:2: iv_ruleColumnDeclaration= ruleColumnDeclaration EOF
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
    // InternalSql_dsl.g:417:1: ruleColumnDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? ) ;
    public final EObject ruleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_notNull_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:423:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? ) )
            // InternalSql_dsl.g:424:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? )
            {
            // InternalSql_dsl.g:424:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? )
            // InternalSql_dsl.g:425:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )?
            {
            // InternalSql_dsl.g:425:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSql_dsl.g:426:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSql_dsl.g:426:4: (lv_name_0_0= RULE_ID )
            // InternalSql_dsl.g:427:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalSql_dsl.g:443:3: ( (lv_type_1_0= ruleDataStructureType ) )
            // InternalSql_dsl.g:444:4: (lv_type_1_0= ruleDataStructureType )
            {
            // InternalSql_dsl.g:444:4: (lv_type_1_0= ruleDataStructureType )
            // InternalSql_dsl.g:445:5: lv_type_1_0= ruleDataStructureType
            {

            					newCompositeNode(grammarAccess.getColumnDeclarationAccess().getTypeDataStructureTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalSql_dsl.g:462:3: ( (lv_notNull_2_0= 'NOT NULL' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSql_dsl.g:463:4: (lv_notNull_2_0= 'NOT NULL' )
                    {
                    // InternalSql_dsl.g:463:4: (lv_notNull_2_0= 'NOT NULL' )
                    // InternalSql_dsl.g:464:5: lv_notNull_2_0= 'NOT NULL'
                    {
                    lv_notNull_2_0=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSql_dsl.g:480:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalSql_dsl.g:480:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalSql_dsl.g:481:2: iv_rulePrimaryKey= rulePrimaryKey EOF
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
    // InternalSql_dsl.g:487:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) ;
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
            // InternalSql_dsl.g:493:2: ( (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) )
            // InternalSql_dsl.g:494:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // InternalSql_dsl.g:494:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            // InternalSql_dsl.g:495:3: otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:507:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:508:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:508:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:509:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationCrossReference_3_0());
            				

            }


            }

            // InternalSql_dsl.g:520:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSql_dsl.g:521:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSql_dsl.g:525:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSql_dsl.g:526:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:526:5: (otherlv_5= RULE_ID )
            	    // InternalSql_dsl.g:527:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSql_dsl.g:547:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSql_dsl.g:547:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSql_dsl.g:548:2: iv_ruleForeignKey= ruleForeignKey EOF
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
    // InternalSql_dsl.g:554:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) ;
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
            // InternalSql_dsl.g:560:2: ( (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) )
            // InternalSql_dsl.g:561:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            {
            // InternalSql_dsl.g:561:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            // InternalSql_dsl.g:562:3: otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:574:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:575:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:575:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:576:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationCrossReference_3_0());
            				

            }


            }

            // InternalSql_dsl.g:587:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSql_dsl.g:588:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSql_dsl.g:592:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSql_dsl.g:593:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:593:5: (otherlv_5= RULE_ID )
            	    // InternalSql_dsl.g:594:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6());
            		
            // InternalSql_dsl.g:614:3: ( (otherlv_8= RULE_ID ) )
            // InternalSql_dsl.g:615:4: (otherlv_8= RULE_ID )
            {
            // InternalSql_dsl.g:615:4: (otherlv_8= RULE_ID )
            // InternalSql_dsl.g:616:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationCrossReference_7_0());
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSql_dsl.g:631:3: ( (otherlv_10= RULE_ID ) )
            // InternalSql_dsl.g:632:4: (otherlv_10= RULE_ID )
            {
            // InternalSql_dsl.g:632:4: (otherlv_10= RULE_ID )
            // InternalSql_dsl.g:633:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_10, grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationCrossReference_9_0());
            				

            }


            }

            // InternalSql_dsl.g:644:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSql_dsl.g:645:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_11, grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalSql_dsl.g:649:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalSql_dsl.g:650:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:650:5: (otherlv_12= RULE_ID )
            	    // InternalSql_dsl.g:651:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_12, grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

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
    // InternalSql_dsl.g:671:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // InternalSql_dsl.g:671:59: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // InternalSql_dsl.g:672:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
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
    // InternalSql_dsl.g:678:1: ruleDropTableStatement returns [EObject current=null] : ( (lv_tables_0_0= ruleDropTableDeclaration ) )* ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:684:2: ( ( (lv_tables_0_0= ruleDropTableDeclaration ) )* )
            // InternalSql_dsl.g:685:2: ( (lv_tables_0_0= ruleDropTableDeclaration ) )*
            {
            // InternalSql_dsl.g:685:2: ( (lv_tables_0_0= ruleDropTableDeclaration ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSql_dsl.g:686:3: (lv_tables_0_0= ruleDropTableDeclaration )
            	    {
            	    // InternalSql_dsl.g:686:3: (lv_tables_0_0= ruleDropTableDeclaration )
            	    // InternalSql_dsl.g:687:4: lv_tables_0_0= ruleDropTableDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getDropTableStatementAccess().getTablesDropTableDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_15);
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
    // InternalSql_dsl.g:707:1: entryRuleDropTableDeclaration returns [EObject current=null] : iv_ruleDropTableDeclaration= ruleDropTableDeclaration EOF ;
    public final EObject entryRuleDropTableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableDeclaration = null;


        try {
            // InternalSql_dsl.g:707:61: (iv_ruleDropTableDeclaration= ruleDropTableDeclaration EOF )
            // InternalSql_dsl.g:708:2: iv_ruleDropTableDeclaration= ruleDropTableDeclaration EOF
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
    // InternalSql_dsl.g:714:1: ruleDropTableDeclaration returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDropTableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:720:2: ( (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:721:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:721:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:722:3: otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDropTableDeclarationAccess().getDROPKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDropTableDeclarationAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:730:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:731:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:731:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:732:5: lv_name_2_0= RULE_ID
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
    // InternalSql_dsl.g:752:1: entryRuleTruncateTableStatement returns [EObject current=null] : iv_ruleTruncateTableStatement= ruleTruncateTableStatement EOF ;
    public final EObject entryRuleTruncateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTruncateTableStatement = null;


        try {
            // InternalSql_dsl.g:752:63: (iv_ruleTruncateTableStatement= ruleTruncateTableStatement EOF )
            // InternalSql_dsl.g:753:2: iv_ruleTruncateTableStatement= ruleTruncateTableStatement EOF
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
    // InternalSql_dsl.g:759:1: ruleTruncateTableStatement returns [EObject current=null] : ( (lv_tables_0_0= ruleTruncateTableDeclaration ) )* ;
    public final EObject ruleTruncateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:765:2: ( ( (lv_tables_0_0= ruleTruncateTableDeclaration ) )* )
            // InternalSql_dsl.g:766:2: ( (lv_tables_0_0= ruleTruncateTableDeclaration ) )*
            {
            // InternalSql_dsl.g:766:2: ( (lv_tables_0_0= ruleTruncateTableDeclaration ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSql_dsl.g:767:3: (lv_tables_0_0= ruleTruncateTableDeclaration )
            	    {
            	    // InternalSql_dsl.g:767:3: (lv_tables_0_0= ruleTruncateTableDeclaration )
            	    // InternalSql_dsl.g:768:4: lv_tables_0_0= ruleTruncateTableDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getTruncateTableStatementAccess().getTablesTruncateTableDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_16);
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
    // InternalSql_dsl.g:788:1: entryRuleTruncateTableDeclaration returns [EObject current=null] : iv_ruleTruncateTableDeclaration= ruleTruncateTableDeclaration EOF ;
    public final EObject entryRuleTruncateTableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTruncateTableDeclaration = null;


        try {
            // InternalSql_dsl.g:788:65: (iv_ruleTruncateTableDeclaration= ruleTruncateTableDeclaration EOF )
            // InternalSql_dsl.g:789:2: iv_ruleTruncateTableDeclaration= ruleTruncateTableDeclaration EOF
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
    // InternalSql_dsl.g:795:1: ruleTruncateTableDeclaration returns [EObject current=null] : (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTruncateTableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:801:2: ( (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:802:2: (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:802:2: (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:803:3: otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTruncateTableDeclarationAccess().getTRUNCATEKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTruncateTableDeclarationAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:811:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:812:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:812:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:813:5: lv_name_2_0= RULE_ID
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
    // InternalSql_dsl.g:833:1: entryRuleAlterTableStatement returns [EObject current=null] : iv_ruleAlterTableStatement= ruleAlterTableStatement EOF ;
    public final EObject entryRuleAlterTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableStatement = null;


        try {
            // InternalSql_dsl.g:833:60: (iv_ruleAlterTableStatement= ruleAlterTableStatement EOF )
            // InternalSql_dsl.g:834:2: iv_ruleAlterTableStatement= ruleAlterTableStatement EOF
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
    // InternalSql_dsl.g:840:1: ruleAlterTableStatement returns [EObject current=null] : (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) ) ;
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
            // InternalSql_dsl.g:846:2: ( (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) ) )
            // InternalSql_dsl.g:847:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) )
            {
            // InternalSql_dsl.g:847:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) )
            // InternalSql_dsl.g:848:3: otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterTableStatementAccess().getALTERKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterTableStatementAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:856:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:857:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:857:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:858:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            // InternalSql_dsl.g:874:3: ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) )
            // InternalSql_dsl.g:875:4: ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) )
            {
            // InternalSql_dsl.g:875:4: ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) )
            // InternalSql_dsl.g:876:5: (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement )
            {
            // InternalSql_dsl.g:876:5: (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 24:
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
                    // InternalSql_dsl.g:877:6: lv_addDropUpdate_3_1= ruleAlterDropStatement
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
                    // InternalSql_dsl.g:893:6: lv_addDropUpdate_3_2= ruleAlterAddStatement
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
                    // InternalSql_dsl.g:909:6: lv_addDropUpdate_3_3= ruleAlterUpdateStatement
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
    // InternalSql_dsl.g:931:1: entryRuleAlterDropStatement returns [EObject current=null] : iv_ruleAlterDropStatement= ruleAlterDropStatement EOF ;
    public final EObject entryRuleAlterDropStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDropStatement = null;


        try {
            // InternalSql_dsl.g:931:59: (iv_ruleAlterDropStatement= ruleAlterDropStatement EOF )
            // InternalSql_dsl.g:932:2: iv_ruleAlterDropStatement= ruleAlterDropStatement EOF
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
    // InternalSql_dsl.g:938:1: ruleAlterDropStatement returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterDropStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:944:2: ( (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:945:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:945:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:946:3: otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterDropStatementAccess().getDROPKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterDropStatementAccess().getCOLUMNKeyword_1());
            		
            // InternalSql_dsl.g:954:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:955:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:955:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:956:5: lv_name_2_0= RULE_ID
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
    // InternalSql_dsl.g:976:1: entryRuleAlterAddStatement returns [EObject current=null] : iv_ruleAlterAddStatement= ruleAlterAddStatement EOF ;
    public final EObject entryRuleAlterAddStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterAddStatement = null;


        try {
            // InternalSql_dsl.g:976:58: (iv_ruleAlterAddStatement= ruleAlterAddStatement EOF )
            // InternalSql_dsl.g:977:2: iv_ruleAlterAddStatement= ruleAlterAddStatement EOF
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
    // InternalSql_dsl.g:983:1: ruleAlterAddStatement returns [EObject current=null] : (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAlterAddStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:989:2: ( (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSql_dsl.g:990:2: (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:990:2: (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) )
            // InternalSql_dsl.g:991:3: otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterAddStatementAccess().getADDKeyword_0());
            		
            // InternalSql_dsl.g:995:3: ( (otherlv_1= RULE_ID ) )
            // InternalSql_dsl.g:996:4: (otherlv_1= RULE_ID )
            {
            // InternalSql_dsl.g:996:4: (otherlv_1= RULE_ID )
            // InternalSql_dsl.g:997:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterAddStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getAlterAddStatementAccess().getColumnColumnDeclarationCrossReference_1_0());
            				

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
    // InternalSql_dsl.g:1012:1: entryRuleAlterUpdateStatement returns [EObject current=null] : iv_ruleAlterUpdateStatement= ruleAlterUpdateStatement EOF ;
    public final EObject entryRuleAlterUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterUpdateStatement = null;


        try {
            // InternalSql_dsl.g:1012:61: (iv_ruleAlterUpdateStatement= ruleAlterUpdateStatement EOF )
            // InternalSql_dsl.g:1013:2: iv_ruleAlterUpdateStatement= ruleAlterUpdateStatement EOF
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
    // InternalSql_dsl.g:1019:1: ruleAlterUpdateStatement returns [EObject current=null] : (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1025:2: ( (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:1026:2: (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:1026:2: (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:1027:3: otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterUpdateStatementAccess().getALTERKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterUpdateStatementAccess().getCOLUMNKeyword_1());
            		
            // InternalSql_dsl.g:1035:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:1036:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:1036:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:1037:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "ruleDataStructureType"
    // InternalSql_dsl.g:1057:1: ruleDataStructureType returns [Enumerator current=null] : ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) ) ;
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
            // InternalSql_dsl.g:1063:2: ( ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) ) )
            // InternalSql_dsl.g:1064:2: ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) )
            {
            // InternalSql_dsl.g:1064:2: ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            case 31:
                {
                alt14=5;
                }
                break;
            case 32:
                {
                alt14=6;
                }
                break;
            case 33:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSql_dsl.g:1065:3: (enumLiteral_0= 'varchar' )
                    {
                    // InternalSql_dsl.g:1065:3: (enumLiteral_0= 'varchar' )
                    // InternalSql_dsl.g:1066:4: enumLiteral_0= 'varchar'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1073:3: (enumLiteral_1= 'char' )
                    {
                    // InternalSql_dsl.g:1073:3: (enumLiteral_1= 'char' )
                    // InternalSql_dsl.g:1074:4: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1081:3: (enumLiteral_2= 'date' )
                    {
                    // InternalSql_dsl.g:1081:3: (enumLiteral_2= 'date' )
                    // InternalSql_dsl.g:1082:4: enumLiteral_2= 'date'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:1089:3: (enumLiteral_3= 'int' )
                    {
                    // InternalSql_dsl.g:1089:3: (enumLiteral_3= 'int' )
                    // InternalSql_dsl.g:1090:4: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:1097:3: (enumLiteral_4= 'float' )
                    {
                    // InternalSql_dsl.g:1097:3: (enumLiteral_4= 'float' )
                    // InternalSql_dsl.g:1098:4: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:1105:3: (enumLiteral_5= 'time' )
                    {
                    // InternalSql_dsl.g:1105:3: (enumLiteral_5= 'time' )
                    // InternalSql_dsl.g:1106:4: enumLiteral_5= 'time'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:1113:3: (enumLiteral_6= 'text' )
                    {
                    // InternalSql_dsl.g:1113:3: (enumLiteral_6= 'text' )
                    // InternalSql_dsl.g:1114:4: enumLiteral_6= 'text'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000140010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000158010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});

}