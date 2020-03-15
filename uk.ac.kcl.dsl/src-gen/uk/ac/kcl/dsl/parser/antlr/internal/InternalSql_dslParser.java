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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECT'", "'*'", "','", "'FROM'", "'WHERE'", "'AND'", "'OR'", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'LIKE'", "'#'", "'CREATE'", "'DATABASE'", "'TABLE'", "'('", "')'", "'NOT NULL'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'DROP'", "'TRUNCATE'", "'DELETE'", "'UPDATE'", "'SET'", "'ALTER'", "'COLUMN'", "'ADD'", "'var'", "'.'", "'COUNT'", "'AVG'", "'SUM'", "'MIN'", "'MAX'", "'varchar'", "'char'", "'date'", "'int'", "'float'", "'time'", "'text'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalSql_dsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalSql_dsl.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalSql_dsl.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==26||(LA1_0>=36 && LA1_0<=39)||LA1_0==41||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSql_dsl.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalSql_dsl.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalSql_dsl.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
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
            	    break;

            	default :
            	    break loop1;
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
    // InternalSql_dsl.g:108:1: ruleStatement returns [EObject current=null] : (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement | this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement | this_SelectStatement_6= ruleSelectStatement | this_DeleteTableStatement_7= ruleDeleteTableStatement | this_UpdateTableStatement_8= ruleUpdateTableStatement | this_Functions_9= ruleFunctions ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DatabaseDeclarationStatement_0 = null;

        EObject this_CreateTableStatement_1 = null;

        EObject this_DropTableStatement_2 = null;

        EObject this_TruncateTableStatement_3 = null;

        EObject this_AlterTableStatement_4 = null;

        EObject this_VariableDeclarationStatement_5 = null;

        EObject this_SelectStatement_6 = null;

        EObject this_DeleteTableStatement_7 = null;

        EObject this_UpdateTableStatement_8 = null;

        EObject this_Functions_9 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:114:2: ( (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement | this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement | this_SelectStatement_6= ruleSelectStatement | this_DeleteTableStatement_7= ruleDeleteTableStatement | this_UpdateTableStatement_8= ruleUpdateTableStatement | this_Functions_9= ruleFunctions ) )
            // InternalSql_dsl.g:115:2: (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement | this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement | this_SelectStatement_6= ruleSelectStatement | this_DeleteTableStatement_7= ruleDeleteTableStatement | this_UpdateTableStatement_8= ruleUpdateTableStatement | this_Functions_9= ruleFunctions )
            {
            // InternalSql_dsl.g:115:2: (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement | this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement | this_SelectStatement_6= ruleSelectStatement | this_DeleteTableStatement_7= ruleDeleteTableStatement | this_UpdateTableStatement_8= ruleUpdateTableStatement | this_Functions_9= ruleFunctions )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
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
                case 8 :
                    // InternalSql_dsl.g:179:3: this_DeleteTableStatement_7= ruleDeleteTableStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDeleteTableStatementParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteTableStatement_7=ruleDeleteTableStatement();

                    state._fsp--;


                    			current = this_DeleteTableStatement_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSql_dsl.g:188:3: this_UpdateTableStatement_8= ruleUpdateTableStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getUpdateTableStatementParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpdateTableStatement_8=ruleUpdateTableStatement();

                    state._fsp--;


                    			current = this_UpdateTableStatement_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSql_dsl.g:197:3: this_Functions_9= ruleFunctions
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunctionsParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Functions_9=ruleFunctions();

                    state._fsp--;


                    			current = this_Functions_9;
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
    // InternalSql_dsl.g:209:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalSql_dsl.g:209:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalSql_dsl.g:210:2: iv_ruleSelectStatement= ruleSelectStatement EOF
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
    // InternalSql_dsl.g:216:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:222:2: ( (otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalSql_dsl.g:223:2: (otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalSql_dsl.g:223:2: (otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalSql_dsl.g:224:3: otherlv_0= 'SELECT' (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* ) ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getSELECTKeyword_0());
            		
            // InternalSql_dsl.g:228:3: (otherlv_1= '*' | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSql_dsl.g:229:4: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getAsteriskKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:234:4: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )*
                    {
                    // InternalSql_dsl.g:234:4: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSql_dsl.g:235:5: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    	    {
                    	    // InternalSql_dsl.g:235:5: ( (otherlv_2= RULE_ID ) )
                    	    // InternalSql_dsl.g:236:6: (otherlv_2= RULE_ID )
                    	    {
                    	    // InternalSql_dsl.g:236:6: (otherlv_2= RULE_ID )
                    	    // InternalSql_dsl.g:237:7: otherlv_2= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSelectStatementRule());
                    	    							}
                    	    						
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    							newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_1_1_0_0());
                    	    						

                    	    }


                    	    }

                    	    // InternalSql_dsl.g:248:5: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    	    loop3:
                    	    do {
                    	        int alt3=2;
                    	        int LA3_0 = input.LA(1);

                    	        if ( (LA3_0==13) ) {
                    	            alt3=1;
                    	        }


                    	        switch (alt3) {
                    	    	case 1 :
                    	    	    // InternalSql_dsl.g:249:6: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    	    {
                    	    	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    	    	    						newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getCommaKeyword_1_1_1_0());
                    	    	    					
                    	    	    // InternalSql_dsl.g:253:6: ( (otherlv_4= RULE_ID ) )
                    	    	    // InternalSql_dsl.g:254:7: (otherlv_4= RULE_ID )
                    	    	    {
                    	    	    // InternalSql_dsl.g:254:7: (otherlv_4= RULE_ID )
                    	    	    // InternalSql_dsl.g:255:8: otherlv_4= RULE_ID
                    	    	    {

                    	    	    								if (current==null) {
                    	    	    									current = createModelElement(grammarAccess.getSelectStatementRule());
                    	    	    								}
                    	    	    							
                    	    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    	    								newLeafNode(otherlv_4, grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_1_1_1_1_0());
                    	    	    							

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop3;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSql_dsl.g:269:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:270:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:270:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalSql_dsl.g:271:5: lv_x_5_0= ruleFromAndWhereClauses
            {

            					newCompositeNode(grammarAccess.getSelectStatementAccess().getXFromAndWhereClausesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_5_0,
            						"uk.ac.kcl.dsl.Sql_dsl.FromAndWhereClauses");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "entryRuleFromAndWhereClauses"
    // InternalSql_dsl.g:292:1: entryRuleFromAndWhereClauses returns [EObject current=null] : iv_ruleFromAndWhereClauses= ruleFromAndWhereClauses EOF ;
    public final EObject entryRuleFromAndWhereClauses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromAndWhereClauses = null;


        try {
            // InternalSql_dsl.g:292:60: (iv_ruleFromAndWhereClauses= ruleFromAndWhereClauses EOF )
            // InternalSql_dsl.g:293:2: iv_ruleFromAndWhereClauses= ruleFromAndWhereClauses EOF
            {
             newCompositeNode(grammarAccess.getFromAndWhereClausesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFromAndWhereClauses=ruleFromAndWhereClauses();

            state._fsp--;

             current =iv_ruleFromAndWhereClauses; 
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
    // $ANTLR end "entryRuleFromAndWhereClauses"


    // $ANTLR start "ruleFromAndWhereClauses"
    // InternalSql_dsl.g:299:1: ruleFromAndWhereClauses returns [EObject current=null] : (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWhereDec ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWhereDec ) ) )* )? ) ;
    public final EObject ruleFromAndWhereClauses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_z_3_0 = null;

        EObject lv_z_6_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:305:2: ( (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWhereDec ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWhereDec ) ) )* )? ) )
            // InternalSql_dsl.g:306:2: (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWhereDec ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWhereDec ) ) )* )? )
            {
            // InternalSql_dsl.g:306:2: (otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWhereDec ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWhereDec ) ) )* )? )
            // InternalSql_dsl.g:307:3: otherlv_0= 'FROM' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWhereDec ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWhereDec ) ) )* )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFromAndWhereClausesAccess().getFROMKeyword_0());
            		
            // InternalSql_dsl.g:311:3: ( (otherlv_1= RULE_ID ) )
            // InternalSql_dsl.g:312:4: (otherlv_1= RULE_ID )
            {
            // InternalSql_dsl.g:312:4: (otherlv_1= RULE_ID )
            // InternalSql_dsl.g:313:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromAndWhereClausesRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getFromAndWhereClausesAccess().getTableTableNameCrossReference_1_0());
            				

            }


            }

            // InternalSql_dsl.g:324:3: (otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWhereDec ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWhereDec ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSql_dsl.g:325:4: otherlv_2= 'WHERE' ( (lv_z_3_0= ruleWhereDec ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWhereDec ) ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getFromAndWhereClausesAccess().getWHEREKeyword_2_0());
                    			
                    // InternalSql_dsl.g:329:4: ( (lv_z_3_0= ruleWhereDec ) )
                    // InternalSql_dsl.g:330:5: (lv_z_3_0= ruleWhereDec )
                    {
                    // InternalSql_dsl.g:330:5: (lv_z_3_0= ruleWhereDec )
                    // InternalSql_dsl.g:331:6: lv_z_3_0= ruleWhereDec
                    {

                    						newCompositeNode(grammarAccess.getFromAndWhereClausesAccess().getZWhereDecParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_z_3_0=ruleWhereDec();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFromAndWhereClausesRule());
                    						}
                    						add(
                    							current,
                    							"z",
                    							lv_z_3_0,
                    							"uk.ac.kcl.dsl.Sql_dsl.WhereDec");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSql_dsl.g:348:4: ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWhereDec ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSql_dsl.g:349:5: (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_z_6_0= ruleWhereDec ) )
                    	    {
                    	    // InternalSql_dsl.g:349:5: (otherlv_4= 'AND' | otherlv_5= 'OR' )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==16) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==17) ) {
                    	        alt6=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 6, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalSql_dsl.g:350:6: otherlv_4= 'AND'
                    	            {
                    	            otherlv_4=(Token)match(input,16,FOLLOW_6); 

                    	            						newLeafNode(otherlv_4, grammarAccess.getFromAndWhereClausesAccess().getANDKeyword_2_2_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalSql_dsl.g:355:6: otherlv_5= 'OR'
                    	            {
                    	            otherlv_5=(Token)match(input,17,FOLLOW_6); 

                    	            						newLeafNode(otherlv_5, grammarAccess.getFromAndWhereClausesAccess().getORKeyword_2_2_0_1());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalSql_dsl.g:360:5: ( (lv_z_6_0= ruleWhereDec ) )
                    	    // InternalSql_dsl.g:361:6: (lv_z_6_0= ruleWhereDec )
                    	    {
                    	    // InternalSql_dsl.g:361:6: (lv_z_6_0= ruleWhereDec )
                    	    // InternalSql_dsl.g:362:7: lv_z_6_0= ruleWhereDec
                    	    {

                    	    							newCompositeNode(grammarAccess.getFromAndWhereClausesAccess().getZWhereDecParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_z_6_0=ruleWhereDec();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFromAndWhereClausesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"z",
                    	    								lv_z_6_0,
                    	    								"uk.ac.kcl.dsl.Sql_dsl.WhereDec");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


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
    // $ANTLR end "ruleFromAndWhereClauses"


    // $ANTLR start "entryRuleWhereDec"
    // InternalSql_dsl.g:385:1: entryRuleWhereDec returns [EObject current=null] : iv_ruleWhereDec= ruleWhereDec EOF ;
    public final EObject entryRuleWhereDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereDec = null;


        try {
            // InternalSql_dsl.g:385:49: (iv_ruleWhereDec= ruleWhereDec EOF )
            // InternalSql_dsl.g:386:2: iv_ruleWhereDec= ruleWhereDec EOF
            {
             newCompositeNode(grammarAccess.getWhereDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhereDec=ruleWhereDec();

            state._fsp--;

             current =iv_ruleWhereDec; 
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
    // $ANTLR end "entryRuleWhereDec"


    // $ANTLR start "ruleWhereDec"
    // InternalSql_dsl.g:392:1: ruleWhereDec returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree ) ) ) ) ;
    public final EObject ruleWhereDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sign_1_1=null;
        Token lv_sign_1_2=null;
        Token lv_sign_1_3=null;
        Token lv_sign_1_4=null;
        Token lv_sign_1_5=null;
        Token lv_sign_1_6=null;
        Token lv_sign_1_7=null;
        EObject lv_rightOperand_2_1 = null;

        EObject lv_rightOperand_2_2 = null;

        EObject lv_rightOperand_2_3 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:398:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree ) ) ) ) )
            // InternalSql_dsl.g:399:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree ) ) ) )
            {
            // InternalSql_dsl.g:399:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree ) ) ) )
            // InternalSql_dsl.g:400:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) ) ( ( (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree ) ) )
            {
            // InternalSql_dsl.g:400:3: ( (otherlv_0= RULE_ID ) )
            // InternalSql_dsl.g:401:4: (otherlv_0= RULE_ID )
            {
            // InternalSql_dsl.g:401:4: (otherlv_0= RULE_ID )
            // InternalSql_dsl.g:402:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereDecRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getWhereDecAccess().getColumnCDCrossReference_0_0());
            				

            }


            }

            // InternalSql_dsl.g:413:3: ( ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) ) )
            // InternalSql_dsl.g:414:4: ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) )
            {
            // InternalSql_dsl.g:414:4: ( (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' ) )
            // InternalSql_dsl.g:415:5: (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' )
            {
            // InternalSql_dsl.g:415:5: (lv_sign_1_1= '=' | lv_sign_1_2= '<' | lv_sign_1_3= '<=' | lv_sign_1_4= '>' | lv_sign_1_5= '>=' | lv_sign_1_6= '!=' | lv_sign_1_7= 'LIKE' )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                alt9=4;
                }
                break;
            case 22:
                {
                alt9=5;
                }
                break;
            case 23:
                {
                alt9=6;
                }
                break;
            case 24:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSql_dsl.g:416:6: lv_sign_1_1= '='
                    {
                    lv_sign_1_1=(Token)match(input,18,FOLLOW_10); 

                    						newLeafNode(lv_sign_1_1, grammarAccess.getWhereDecAccess().getSignEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereDecRule());
                    						}
                    						setWithLastConsumed(current, "sign", lv_sign_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:427:6: lv_sign_1_2= '<'
                    {
                    lv_sign_1_2=(Token)match(input,19,FOLLOW_10); 

                    						newLeafNode(lv_sign_1_2, grammarAccess.getWhereDecAccess().getSignLessThanSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereDecRule());
                    						}
                    						setWithLastConsumed(current, "sign", lv_sign_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:438:6: lv_sign_1_3= '<='
                    {
                    lv_sign_1_3=(Token)match(input,20,FOLLOW_10); 

                    						newLeafNode(lv_sign_1_3, grammarAccess.getWhereDecAccess().getSignLessThanSignEqualsSignKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereDecRule());
                    						}
                    						setWithLastConsumed(current, "sign", lv_sign_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:449:6: lv_sign_1_4= '>'
                    {
                    lv_sign_1_4=(Token)match(input,21,FOLLOW_10); 

                    						newLeafNode(lv_sign_1_4, grammarAccess.getWhereDecAccess().getSignGreaterThanSignKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereDecRule());
                    						}
                    						setWithLastConsumed(current, "sign", lv_sign_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:460:6: lv_sign_1_5= '>='
                    {
                    lv_sign_1_5=(Token)match(input,22,FOLLOW_10); 

                    						newLeafNode(lv_sign_1_5, grammarAccess.getWhereDecAccess().getSignGreaterThanSignEqualsSignKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereDecRule());
                    						}
                    						setWithLastConsumed(current, "sign", lv_sign_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:471:6: lv_sign_1_6= '!='
                    {
                    lv_sign_1_6=(Token)match(input,23,FOLLOW_10); 

                    						newLeafNode(lv_sign_1_6, grammarAccess.getWhereDecAccess().getSignExclamationMarkEqualsSignKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereDecRule());
                    						}
                    						setWithLastConsumed(current, "sign", lv_sign_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:482:6: lv_sign_1_7= 'LIKE'
                    {
                    lv_sign_1_7=(Token)match(input,24,FOLLOW_10); 

                    						newLeafNode(lv_sign_1_7, grammarAccess.getWhereDecAccess().getSignLIKEKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereDecRule());
                    						}
                    						setWithLastConsumed(current, "sign", lv_sign_1_7, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSql_dsl.g:495:3: ( ( (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree ) ) )
            // InternalSql_dsl.g:496:4: ( (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree ) )
            {
            // InternalSql_dsl.g:496:4: ( (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree ) )
            // InternalSql_dsl.g:497:5: (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree )
            {
            // InternalSql_dsl.g:497:5: (lv_rightOperand_2_1= ruleRightOperandOne | lv_rightOperand_2_2= ruleRightOperandTwo | lv_rightOperand_2_3= ruleRightOperandThree )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSql_dsl.g:498:6: lv_rightOperand_2_1= ruleRightOperandOne
                    {

                    						newCompositeNode(grammarAccess.getWhereDecAccess().getRightOperandRightOperandOneParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightOperand_2_1=ruleRightOperandOne();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhereDecRule());
                    						}
                    						set(
                    							current,
                    							"rightOperand",
                    							lv_rightOperand_2_1,
                    							"uk.ac.kcl.dsl.Sql_dsl.RightOperandOne");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:514:6: lv_rightOperand_2_2= ruleRightOperandTwo
                    {

                    						newCompositeNode(grammarAccess.getWhereDecAccess().getRightOperandRightOperandTwoParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightOperand_2_2=ruleRightOperandTwo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhereDecRule());
                    						}
                    						set(
                    							current,
                    							"rightOperand",
                    							lv_rightOperand_2_2,
                    							"uk.ac.kcl.dsl.Sql_dsl.RightOperandTwo");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:530:6: lv_rightOperand_2_3= ruleRightOperandThree
                    {

                    						newCompositeNode(grammarAccess.getWhereDecAccess().getRightOperandRightOperandThreeParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightOperand_2_3=ruleRightOperandThree();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhereDecRule());
                    						}
                    						set(
                    							current,
                    							"rightOperand",
                    							lv_rightOperand_2_3,
                    							"uk.ac.kcl.dsl.Sql_dsl.RightOperandThree");
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
    // $ANTLR end "ruleWhereDec"


    // $ANTLR start "entryRuleRightOperandOne"
    // InternalSql_dsl.g:552:1: entryRuleRightOperandOne returns [EObject current=null] : iv_ruleRightOperandOne= ruleRightOperandOne EOF ;
    public final EObject entryRuleRightOperandOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightOperandOne = null;


        try {
            // InternalSql_dsl.g:552:56: (iv_ruleRightOperandOne= ruleRightOperandOne EOF )
            // InternalSql_dsl.g:553:2: iv_ruleRightOperandOne= ruleRightOperandOne EOF
            {
             newCompositeNode(grammarAccess.getRightOperandOneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightOperandOne=ruleRightOperandOne();

            state._fsp--;

             current =iv_ruleRightOperandOne; 
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
    // $ANTLR end "entryRuleRightOperandOne"


    // $ANTLR start "ruleRightOperandOne"
    // InternalSql_dsl.g:559:1: ruleRightOperandOne returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#' ) ;
    public final EObject ruleRightOperandOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:565:2: ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#' ) )
            // InternalSql_dsl.g:566:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#' )
            {
            // InternalSql_dsl.g:566:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#' )
            // InternalSql_dsl.g:567:3: otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '#'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRightOperandOneAccess().getNumberSignKeyword_0());
            		
            // InternalSql_dsl.g:571:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSql_dsl.g:572:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSql_dsl.g:572:4: (lv_name_1_0= RULE_ID )
            // InternalSql_dsl.g:573:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRightOperandOneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRightOperandOneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRightOperandOneAccess().getNumberSignKeyword_2());
            		

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
    // $ANTLR end "ruleRightOperandOne"


    // $ANTLR start "entryRuleRightOperandTwo"
    // InternalSql_dsl.g:597:1: entryRuleRightOperandTwo returns [EObject current=null] : iv_ruleRightOperandTwo= ruleRightOperandTwo EOF ;
    public final EObject entryRuleRightOperandTwo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightOperandTwo = null;


        try {
            // InternalSql_dsl.g:597:56: (iv_ruleRightOperandTwo= ruleRightOperandTwo EOF )
            // InternalSql_dsl.g:598:2: iv_ruleRightOperandTwo= ruleRightOperandTwo EOF
            {
             newCompositeNode(grammarAccess.getRightOperandTwoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightOperandTwo=ruleRightOperandTwo();

            state._fsp--;

             current =iv_ruleRightOperandTwo; 
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
    // $ANTLR end "entryRuleRightOperandTwo"


    // $ANTLR start "ruleRightOperandTwo"
    // InternalSql_dsl.g:604:1: ruleRightOperandTwo returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRightOperandTwo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:610:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSql_dsl.g:611:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSql_dsl.g:611:2: ( (otherlv_0= RULE_ID ) )
            // InternalSql_dsl.g:612:3: (otherlv_0= RULE_ID )
            {
            // InternalSql_dsl.g:612:3: (otherlv_0= RULE_ID )
            // InternalSql_dsl.g:613:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRightOperandTwoRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRightOperandTwoAccess().getColumnCDCrossReference_0());
            			

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
    // $ANTLR end "ruleRightOperandTwo"


    // $ANTLR start "entryRuleRightOperandThree"
    // InternalSql_dsl.g:627:1: entryRuleRightOperandThree returns [EObject current=null] : iv_ruleRightOperandThree= ruleRightOperandThree EOF ;
    public final EObject entryRuleRightOperandThree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightOperandThree = null;


        try {
            // InternalSql_dsl.g:627:58: (iv_ruleRightOperandThree= ruleRightOperandThree EOF )
            // InternalSql_dsl.g:628:2: iv_ruleRightOperandThree= ruleRightOperandThree EOF
            {
             newCompositeNode(grammarAccess.getRightOperandThreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightOperandThree=ruleRightOperandThree();

            state._fsp--;

             current =iv_ruleRightOperandThree; 
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
    // $ANTLR end "entryRuleRightOperandThree"


    // $ANTLR start "ruleRightOperandThree"
    // InternalSql_dsl.g:634:1: ruleRightOperandThree returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleRightOperandThree() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:640:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalSql_dsl.g:641:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalSql_dsl.g:641:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalSql_dsl.g:642:3: (lv_val_0_0= RULE_INT )
            {
            // InternalSql_dsl.g:642:3: (lv_val_0_0= RULE_INT )
            // InternalSql_dsl.g:643:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getRightOperandThreeAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRightOperandThreeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleRightOperandThree"


    // $ANTLR start "entryRuleDatabaseDeclarationStatement"
    // InternalSql_dsl.g:662:1: entryRuleDatabaseDeclarationStatement returns [EObject current=null] : iv_ruleDatabaseDeclarationStatement= ruleDatabaseDeclarationStatement EOF ;
    public final EObject entryRuleDatabaseDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseDeclarationStatement = null;


        try {
            // InternalSql_dsl.g:662:69: (iv_ruleDatabaseDeclarationStatement= ruleDatabaseDeclarationStatement EOF )
            // InternalSql_dsl.g:663:2: iv_ruleDatabaseDeclarationStatement= ruleDatabaseDeclarationStatement EOF
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
    // InternalSql_dsl.g:669:1: ruleDatabaseDeclarationStatement returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDatabaseDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:675:2: ( (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalSql_dsl.g:676:2: (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:676:2: (otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalSql_dsl.g:677:3: otherlv_0= 'CREATE' otherlv_1= 'DATABASE' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseDeclarationStatementAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseDeclarationStatementAccess().getDATABASEKeyword_1());
            		
            // InternalSql_dsl.g:685:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSql_dsl.g:686:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSql_dsl.g:686:4: (lv_name_2_0= RULE_ID )
            // InternalSql_dsl.g:687:5: lv_name_2_0= RULE_ID
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
    // InternalSql_dsl.g:707:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // InternalSql_dsl.g:707:61: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // InternalSql_dsl.g:708:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
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
    // InternalSql_dsl.g:714:1: ruleCreateTableStatement returns [EObject current=null] : ( (lv_tables_0_0= ruleTableDeclaration ) )+ ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_tables_0_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:720:2: ( ( (lv_tables_0_0= ruleTableDeclaration ) )+ )
            // InternalSql_dsl.g:721:2: ( (lv_tables_0_0= ruleTableDeclaration ) )+
            {
            // InternalSql_dsl.g:721:2: ( (lv_tables_0_0= ruleTableDeclaration ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSql_dsl.g:722:3: (lv_tables_0_0= ruleTableDeclaration )
            	    {
            	    // InternalSql_dsl.g:722:3: (lv_tables_0_0= ruleTableDeclaration )
            	    // InternalSql_dsl.g:723:4: lv_tables_0_0= ruleTableDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getCreateTableStatementAccess().getTablesTableDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalSql_dsl.g:743:1: entryRuleTableDeclaration returns [EObject current=null] : iv_ruleTableDeclaration= ruleTableDeclaration EOF ;
    public final EObject entryRuleTableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDeclaration = null;


        try {
            // InternalSql_dsl.g:743:57: (iv_ruleTableDeclaration= ruleTableDeclaration EOF )
            // InternalSql_dsl.g:744:2: iv_ruleTableDeclaration= ruleTableDeclaration EOF
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
    // InternalSql_dsl.g:750:1: ruleTableDeclaration returns [EObject current=null] : (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleTableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_table_2_0 = null;

        EObject lv_attributes_4_1 = null;

        EObject lv_attributes_4_2 = null;

        EObject lv_attributes_4_3 = null;

        EObject lv_attributes_6_1 = null;

        EObject lv_attributes_6_2 = null;

        EObject lv_attributes_6_3 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:756:2: ( (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' ) )
            // InternalSql_dsl.g:757:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            {
            // InternalSql_dsl.g:757:2: (otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')' )
            // InternalSql_dsl.g:758:3: otherlv_0= 'CREATE' otherlv_1= 'TABLE' ( (lv_table_2_0= ruletableName ) ) otherlv_3= '(' ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+ (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTableDeclarationAccess().getCREATEKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTableDeclarationAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:766:3: ( (lv_table_2_0= ruletableName ) )
            // InternalSql_dsl.g:767:4: (lv_table_2_0= ruletableName )
            {
            // InternalSql_dsl.g:767:4: (lv_table_2_0= ruletableName )
            // InternalSql_dsl.g:768:5: lv_table_2_0= ruletableName
            {

            					newCompositeNode(grammarAccess.getTableDeclarationAccess().getTableTableNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_table_2_0=ruletableName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableDeclarationRule());
            					}
            					add(
            						current,
            						"table",
            						lv_table_2_0,
            						"uk.ac.kcl.dsl.Sql_dsl.tableName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getTableDeclarationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSql_dsl.g:789:3: ( ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==32||LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSql_dsl.g:790:4: ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) )
            	    {
            	    // InternalSql_dsl.g:790:4: ( (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey ) )
            	    // InternalSql_dsl.g:791:5: (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey )
            	    {
            	    // InternalSql_dsl.g:791:5: (lv_attributes_4_1= ruleColumnDeclaration | lv_attributes_4_2= rulePrimaryKey | lv_attributes_4_3= ruleForeignKey )
            	    int alt12=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // InternalSql_dsl.g:792:6: lv_attributes_4_1= ruleColumnDeclaration
            	            {

            	            						newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_17);
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
            	            // InternalSql_dsl.g:808:6: lv_attributes_4_2= rulePrimaryKey
            	            {

            	            						newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_17);
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
            	            // InternalSql_dsl.g:824:6: lv_attributes_4_3= ruleForeignKey
            	            {

            	            						newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_17);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // InternalSql_dsl.g:842:3: (otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSql_dsl.g:843:4: otherlv_5= ',' ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_16); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTableDeclarationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSql_dsl.g:847:4: ( ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) ) )
            	    // InternalSql_dsl.g:848:5: ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) )
            	    {
            	    // InternalSql_dsl.g:848:5: ( (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey ) )
            	    // InternalSql_dsl.g:849:6: (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey )
            	    {
            	    // InternalSql_dsl.g:849:6: (lv_attributes_6_1= ruleColumnDeclaration | lv_attributes_6_2= rulePrimaryKey | lv_attributes_6_3= ruleForeignKey )
            	    int alt14=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // InternalSql_dsl.g:850:7: lv_attributes_6_1= ruleColumnDeclaration
            	            {

            	            							newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_5_1_0_0());
            	            						
            	            pushFollow(FOLLOW_18);
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
            	            // InternalSql_dsl.g:866:7: lv_attributes_6_2= rulePrimaryKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_5_1_0_1());
            	            						
            	            pushFollow(FOLLOW_18);
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
            	            // InternalSql_dsl.g:882:7: lv_attributes_6_3= ruleForeignKey
            	            {

            	            							newCompositeNode(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_5_1_0_2());
            	            						
            	            pushFollow(FOLLOW_18);
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
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuletableName"
    // InternalSql_dsl.g:909:1: entryRuletableName returns [EObject current=null] : iv_ruletableName= ruletableName EOF ;
    public final EObject entryRuletableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletableName = null;


        try {
            // InternalSql_dsl.g:909:50: (iv_ruletableName= ruletableName EOF )
            // InternalSql_dsl.g:910:2: iv_ruletableName= ruletableName EOF
            {
             newCompositeNode(grammarAccess.getTableNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletableName=ruletableName();

            state._fsp--;

             current =iv_ruletableName; 
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
    // $ANTLR end "entryRuletableName"


    // $ANTLR start "ruletableName"
    // InternalSql_dsl.g:916:1: ruletableName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruletableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:922:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSql_dsl.g:923:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSql_dsl.g:923:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSql_dsl.g:924:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSql_dsl.g:924:3: (lv_name_0_0= RULE_ID )
            // InternalSql_dsl.g:925:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTableNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruletableName"


    // $ANTLR start "entryRuleColumnDeclaration"
    // InternalSql_dsl.g:944:1: entryRuleColumnDeclaration returns [EObject current=null] : iv_ruleColumnDeclaration= ruleColumnDeclaration EOF ;
    public final EObject entryRuleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDeclaration = null;


        try {
            // InternalSql_dsl.g:944:58: (iv_ruleColumnDeclaration= ruleColumnDeclaration EOF )
            // InternalSql_dsl.g:945:2: iv_ruleColumnDeclaration= ruleColumnDeclaration EOF
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
    // InternalSql_dsl.g:951:1: ruleColumnDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? ) ;
    public final EObject ruleColumnDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_notNull_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:957:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? ) )
            // InternalSql_dsl.g:958:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? )
            {
            // InternalSql_dsl.g:958:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )? )
            // InternalSql_dsl.g:959:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataStructureType ) ) ( (lv_notNull_2_0= 'NOT NULL' ) )?
            {
            // InternalSql_dsl.g:959:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSql_dsl.g:960:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSql_dsl.g:960:4: (lv_name_0_0= RULE_ID )
            // InternalSql_dsl.g:961:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalSql_dsl.g:977:3: ( (lv_type_1_0= ruleDataStructureType ) )
            // InternalSql_dsl.g:978:4: (lv_type_1_0= ruleDataStructureType )
            {
            // InternalSql_dsl.g:978:4: (lv_type_1_0= ruleDataStructureType )
            // InternalSql_dsl.g:979:5: lv_type_1_0= ruleDataStructureType
            {

            					newCompositeNode(grammarAccess.getColumnDeclarationAccess().getTypeDataStructureTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalSql_dsl.g:996:3: ( (lv_notNull_2_0= 'NOT NULL' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSql_dsl.g:997:4: (lv_notNull_2_0= 'NOT NULL' )
                    {
                    // InternalSql_dsl.g:997:4: (lv_notNull_2_0= 'NOT NULL' )
                    // InternalSql_dsl.g:998:5: lv_notNull_2_0= 'NOT NULL'
                    {
                    lv_notNull_2_0=(Token)match(input,31,FOLLOW_2); 

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
    // InternalSql_dsl.g:1014:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalSql_dsl.g:1014:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalSql_dsl.g:1015:2: iv_rulePrimaryKey= rulePrimaryKey EOF
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
    // InternalSql_dsl.g:1021:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) ;
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
            // InternalSql_dsl.g:1027:2: ( (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' ) )
            // InternalSql_dsl.g:1028:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // InternalSql_dsl.g:1028:2: (otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )
            // InternalSql_dsl.g:1029:3: otherlv_0= 'PRIMARY' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:1041:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:1042:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:1042:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:1043:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_3_0());
            				

            }


            }

            // InternalSql_dsl.g:1054:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSql_dsl.g:1055:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSql_dsl.g:1059:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSql_dsl.g:1060:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:1060:5: (otherlv_5= RULE_ID )
            	    // InternalSql_dsl.g:1061:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    						newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalSql_dsl.g:1081:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalSql_dsl.g:1081:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalSql_dsl.g:1082:2: iv_ruleForeignKey= ruleForeignKey EOF
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
    // InternalSql_dsl.g:1088:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) ;
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
            // InternalSql_dsl.g:1094:2: ( (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' ) )
            // InternalSql_dsl.g:1095:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            {
            // InternalSql_dsl.g:1095:2: (otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )
            // InternalSql_dsl.g:1096:3: otherlv_0= 'FOREIGN' otherlv_1= 'KEY' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'REFERENCES' ( (otherlv_8= RULE_ID ) ) otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getForeignKeyAccess().getKEYKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:1108:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:1109:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:1109:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:1110:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_3_0());
            				

            }


            }

            // InternalSql_dsl.g:1121:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSql_dsl.g:1122:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSql_dsl.g:1126:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSql_dsl.g:1127:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:1127:5: (otherlv_5= RULE_ID )
            	    // InternalSql_dsl.g:1128:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    						newLeafNode(otherlv_5, grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6());
            		
            // InternalSql_dsl.g:1148:3: ( (otherlv_8= RULE_ID ) )
            // InternalSql_dsl.g:1149:4: (otherlv_8= RULE_ID )
            {
            // InternalSql_dsl.g:1149:4: (otherlv_8= RULE_ID )
            // InternalSql_dsl.g:1150:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_8, grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationCrossReference_7_0());
            				

            }


            }

            otherlv_9=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSql_dsl.g:1165:3: ( (otherlv_10= RULE_ID ) )
            // InternalSql_dsl.g:1166:4: (otherlv_10= RULE_ID )
            {
            // InternalSql_dsl.g:1166:4: (otherlv_10= RULE_ID )
            // InternalSql_dsl.g:1167:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_10, grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_9_0());
            				

            }


            }

            // InternalSql_dsl.g:1178:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSql_dsl.g:1179:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_11, grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalSql_dsl.g:1183:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalSql_dsl.g:1184:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:1184:5: (otherlv_12= RULE_ID )
            	    // InternalSql_dsl.g:1185:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    						newLeafNode(otherlv_12, grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_13=(Token)match(input,30,FOLLOW_2); 

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
    // InternalSql_dsl.g:1205:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // InternalSql_dsl.g:1205:59: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // InternalSql_dsl.g:1206:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
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
    // InternalSql_dsl.g:1212:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1218:2: ( (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalSql_dsl.g:1219:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalSql_dsl.g:1219:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalSql_dsl.g:1220:3: otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDROPKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:1228:3: ( (otherlv_2= RULE_ID ) )
            // InternalSql_dsl.g:1229:4: (otherlv_2= RULE_ID )
            {
            // InternalSql_dsl.g:1229:4: (otherlv_2= RULE_ID )
            // InternalSql_dsl.g:1230:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropTableStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getDropTableStatementAccess().getTableTableNameCrossReference_2_0());
            				

            }


            }

            // InternalSql_dsl.g:1241:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSql_dsl.g:1242:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDropTableStatementAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSql_dsl.g:1246:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSql_dsl.g:1247:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:1247:5: (otherlv_4= RULE_ID )
            	    // InternalSql_dsl.g:1248:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDropTableStatementRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_4, grammarAccess.getDropTableStatementAccess().getTableTableNameCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "ruleDropTableStatement"


    // $ANTLR start "entryRuleTruncateTableStatement"
    // InternalSql_dsl.g:1264:1: entryRuleTruncateTableStatement returns [EObject current=null] : iv_ruleTruncateTableStatement= ruleTruncateTableStatement EOF ;
    public final EObject entryRuleTruncateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTruncateTableStatement = null;


        try {
            // InternalSql_dsl.g:1264:63: (iv_ruleTruncateTableStatement= ruleTruncateTableStatement EOF )
            // InternalSql_dsl.g:1265:2: iv_ruleTruncateTableStatement= ruleTruncateTableStatement EOF
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
    // InternalSql_dsl.g:1271:1: ruleTruncateTableStatement returns [EObject current=null] : (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleTruncateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1277:2: ( (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalSql_dsl.g:1278:2: (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalSql_dsl.g:1278:2: (otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalSql_dsl.g:1279:3: otherlv_0= 'TRUNCATE' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTruncateTableStatementAccess().getTRUNCATEKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTruncateTableStatementAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:1287:3: ( (otherlv_2= RULE_ID ) )
            // InternalSql_dsl.g:1288:4: (otherlv_2= RULE_ID )
            {
            // InternalSql_dsl.g:1288:4: (otherlv_2= RULE_ID )
            // InternalSql_dsl.g:1289:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTruncateTableStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getTruncateTableStatementAccess().getTableTableNameCrossReference_2_0());
            				

            }


            }

            // InternalSql_dsl.g:1300:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSql_dsl.g:1301:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTruncateTableStatementAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSql_dsl.g:1305:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSql_dsl.g:1306:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSql_dsl.g:1306:5: (otherlv_4= RULE_ID )
            	    // InternalSql_dsl.g:1307:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTruncateTableStatementRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_4, grammarAccess.getTruncateTableStatementAccess().getTableTableNameCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleTruncateTableStatement"


    // $ANTLR start "entryRuleDeleteTableStatement"
    // InternalSql_dsl.g:1323:1: entryRuleDeleteTableStatement returns [EObject current=null] : iv_ruleDeleteTableStatement= ruleDeleteTableStatement EOF ;
    public final EObject entryRuleDeleteTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteTableStatement = null;


        try {
            // InternalSql_dsl.g:1323:61: (iv_ruleDeleteTableStatement= ruleDeleteTableStatement EOF )
            // InternalSql_dsl.g:1324:2: iv_ruleDeleteTableStatement= ruleDeleteTableStatement EOF
            {
             newCompositeNode(grammarAccess.getDeleteTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteTableStatement=ruleDeleteTableStatement();

            state._fsp--;

             current =iv_ruleDeleteTableStatement; 
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
    // $ANTLR end "entryRuleDeleteTableStatement"


    // $ANTLR start "ruleDeleteTableStatement"
    // InternalSql_dsl.g:1330:1: ruleDeleteTableStatement returns [EObject current=null] : (otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleDeleteTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_x_1_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:1336:2: ( (otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) ) ) )
            // InternalSql_dsl.g:1337:2: (otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalSql_dsl.g:1337:2: (otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) ) )
            // InternalSql_dsl.g:1338:3: otherlv_0= 'DELETE' ( (lv_x_1_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteTableStatementAccess().getDELETEKeyword_0());
            		
            // InternalSql_dsl.g:1342:3: ( (lv_x_1_0= ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:1343:4: (lv_x_1_0= ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:1343:4: (lv_x_1_0= ruleFromAndWhereClauses )
            // InternalSql_dsl.g:1344:5: lv_x_1_0= ruleFromAndWhereClauses
            {

            					newCompositeNode(grammarAccess.getDeleteTableStatementAccess().getXFromAndWhereClausesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_1_0=ruleFromAndWhereClauses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteTableStatementRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"uk.ac.kcl.dsl.Sql_dsl.FromAndWhereClauses");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDeleteTableStatement"


    // $ANTLR start "entryRuleUpdateTableStatement"
    // InternalSql_dsl.g:1365:1: entryRuleUpdateTableStatement returns [EObject current=null] : iv_ruleUpdateTableStatement= ruleUpdateTableStatement EOF ;
    public final EObject entryRuleUpdateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateTableStatement = null;


        try {
            // InternalSql_dsl.g:1365:61: (iv_ruleUpdateTableStatement= ruleUpdateTableStatement EOF )
            // InternalSql_dsl.g:1366:2: iv_ruleUpdateTableStatement= ruleUpdateTableStatement EOF
            {
             newCompositeNode(grammarAccess.getUpdateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateTableStatement=ruleUpdateTableStatement();

            state._fsp--;

             current =iv_ruleUpdateTableStatement; 
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
    // $ANTLR end "entryRuleUpdateTableStatement"


    // $ANTLR start "ruleUpdateTableStatement"
    // InternalSql_dsl.g:1372:1: ruleUpdateTableStatement returns [EObject current=null] : (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWhereDec ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWhereDec ) ) )* )? ) ;
    public final EObject ruleUpdateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_sc_3_0 = null;

        EObject lv_sc_5_0 = null;

        EObject lv_z_7_0 = null;

        EObject lv_z_10_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:1378:2: ( (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWhereDec ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWhereDec ) ) )* )? ) )
            // InternalSql_dsl.g:1379:2: (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWhereDec ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWhereDec ) ) )* )? )
            {
            // InternalSql_dsl.g:1379:2: (otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWhereDec ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWhereDec ) ) )* )? )
            // InternalSql_dsl.g:1380:3: otherlv_0= 'UPDATE' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'SET' ( (lv_sc_3_0= ruleSetClause ) ) (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )* (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWhereDec ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWhereDec ) ) )* )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateTableStatementAccess().getUPDATEKeyword_0());
            		
            // InternalSql_dsl.g:1384:3: ( (otherlv_1= RULE_ID ) )
            // InternalSql_dsl.g:1385:4: (otherlv_1= RULE_ID )
            {
            // InternalSql_dsl.g:1385:4: (otherlv_1= RULE_ID )
            // InternalSql_dsl.g:1386:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateTableStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getUpdateTableStatementAccess().getTableTableNameCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateTableStatementAccess().getSETKeyword_2());
            		
            // InternalSql_dsl.g:1401:3: ( (lv_sc_3_0= ruleSetClause ) )
            // InternalSql_dsl.g:1402:4: (lv_sc_3_0= ruleSetClause )
            {
            // InternalSql_dsl.g:1402:4: (lv_sc_3_0= ruleSetClause )
            // InternalSql_dsl.g:1403:5: lv_sc_3_0= ruleSetClause
            {

            					newCompositeNode(grammarAccess.getUpdateTableStatementAccess().getScSetClauseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_sc_3_0=ruleSetClause();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateTableStatementRule());
            					}
            					add(
            						current,
            						"sc",
            						lv_sc_3_0,
            						"uk.ac.kcl.dsl.Sql_dsl.SetClause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSql_dsl.g:1420:3: (otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSql_dsl.g:1421:4: otherlv_4= ',' ( (lv_sc_5_0= ruleSetClause ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getUpdateTableStatementAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSql_dsl.g:1425:4: ( (lv_sc_5_0= ruleSetClause ) )
            	    // InternalSql_dsl.g:1426:5: (lv_sc_5_0= ruleSetClause )
            	    {
            	    // InternalSql_dsl.g:1426:5: (lv_sc_5_0= ruleSetClause )
            	    // InternalSql_dsl.g:1427:6: lv_sc_5_0= ruleSetClause
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateTableStatementAccess().getScSetClauseParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_sc_5_0=ruleSetClause();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdateTableStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sc",
            	    							lv_sc_5_0,
            	    							"uk.ac.kcl.dsl.Sql_dsl.SetClause");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalSql_dsl.g:1445:3: (otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWhereDec ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWhereDec ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSql_dsl.g:1446:4: otherlv_6= 'WHERE' ( (lv_z_7_0= ruleWhereDec ) ) ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWhereDec ) ) )*
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getUpdateTableStatementAccess().getWHEREKeyword_5_0());
                    			
                    // InternalSql_dsl.g:1450:4: ( (lv_z_7_0= ruleWhereDec ) )
                    // InternalSql_dsl.g:1451:5: (lv_z_7_0= ruleWhereDec )
                    {
                    // InternalSql_dsl.g:1451:5: (lv_z_7_0= ruleWhereDec )
                    // InternalSql_dsl.g:1452:6: lv_z_7_0= ruleWhereDec
                    {

                    						newCompositeNode(grammarAccess.getUpdateTableStatementAccess().getZWhereDecParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_z_7_0=ruleWhereDec();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateTableStatementRule());
                    						}
                    						add(
                    							current,
                    							"z",
                    							lv_z_7_0,
                    							"uk.ac.kcl.dsl.Sql_dsl.WhereDec");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSql_dsl.g:1469:4: ( (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWhereDec ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=16 && LA24_0<=17)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSql_dsl.g:1470:5: (otherlv_8= 'AND' | otherlv_9= 'OR' ) ( (lv_z_10_0= ruleWhereDec ) )
                    	    {
                    	    // InternalSql_dsl.g:1470:5: (otherlv_8= 'AND' | otherlv_9= 'OR' )
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==16) ) {
                    	        alt23=1;
                    	    }
                    	    else if ( (LA23_0==17) ) {
                    	        alt23=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 23, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // InternalSql_dsl.g:1471:6: otherlv_8= 'AND'
                    	            {
                    	            otherlv_8=(Token)match(input,16,FOLLOW_6); 

                    	            						newLeafNode(otherlv_8, grammarAccess.getUpdateTableStatementAccess().getANDKeyword_5_2_0_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalSql_dsl.g:1476:6: otherlv_9= 'OR'
                    	            {
                    	            otherlv_9=(Token)match(input,17,FOLLOW_6); 

                    	            						newLeafNode(otherlv_9, grammarAccess.getUpdateTableStatementAccess().getORKeyword_5_2_0_1());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalSql_dsl.g:1481:5: ( (lv_z_10_0= ruleWhereDec ) )
                    	    // InternalSql_dsl.g:1482:6: (lv_z_10_0= ruleWhereDec )
                    	    {
                    	    // InternalSql_dsl.g:1482:6: (lv_z_10_0= ruleWhereDec )
                    	    // InternalSql_dsl.g:1483:7: lv_z_10_0= ruleWhereDec
                    	    {

                    	    							newCompositeNode(grammarAccess.getUpdateTableStatementAccess().getZWhereDecParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_z_10_0=ruleWhereDec();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUpdateTableStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"z",
                    	    								lv_z_10_0,
                    	    								"uk.ac.kcl.dsl.Sql_dsl.WhereDec");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


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
    // $ANTLR end "ruleUpdateTableStatement"


    // $ANTLR start "entryRuleSetClause"
    // InternalSql_dsl.g:1506:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // InternalSql_dsl.g:1506:50: (iv_ruleSetClause= ruleSetClause EOF )
            // InternalSql_dsl.g:1507:2: iv_ruleSetClause= ruleSetClause EOF
            {
             newCompositeNode(grammarAccess.getSetClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;

             current =iv_ruleSetClause; 
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
    // $ANTLR end "entryRuleSetClause"


    // $ANTLR start "ruleSetClause"
    // InternalSql_dsl.g:1513:1: ruleSetClause returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_val_5_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1519:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) ) ) )
            // InternalSql_dsl.g:1520:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) ) )
            {
            // InternalSql_dsl.g:1520:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) ) )
            // InternalSql_dsl.g:1521:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) )
            {
            // InternalSql_dsl.g:1521:3: ( (otherlv_0= RULE_ID ) )
            // InternalSql_dsl.g:1522:4: (otherlv_0= RULE_ID )
            {
            // InternalSql_dsl.g:1522:4: (otherlv_0= RULE_ID )
            // InternalSql_dsl.g:1523:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetClauseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getSetClauseAccess().getColumnCDCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getSetClauseAccess().getEqualsSignKeyword_1());
            		
            // InternalSql_dsl.g:1538:3: ( (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' ) | ( (lv_val_5_0= RULE_INT ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_INT) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSql_dsl.g:1539:4: (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' )
                    {
                    // InternalSql_dsl.g:1539:4: (otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#' )
                    // InternalSql_dsl.g:1540:5: otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '#'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_0());
                    				
                    // InternalSql_dsl.g:1544:5: ( (lv_name_3_0= RULE_ID ) )
                    // InternalSql_dsl.g:1545:6: (lv_name_3_0= RULE_ID )
                    {
                    // InternalSql_dsl.g:1545:6: (lv_name_3_0= RULE_ID )
                    // InternalSql_dsl.g:1546:7: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(lv_name_3_0, grammarAccess.getSetClauseAccess().getNameIDTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSetClauseRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1568:4: ( (lv_val_5_0= RULE_INT ) )
                    {
                    // InternalSql_dsl.g:1568:4: ( (lv_val_5_0= RULE_INT ) )
                    // InternalSql_dsl.g:1569:5: (lv_val_5_0= RULE_INT )
                    {
                    // InternalSql_dsl.g:1569:5: (lv_val_5_0= RULE_INT )
                    // InternalSql_dsl.g:1570:6: lv_val_5_0= RULE_INT
                    {
                    lv_val_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_val_5_0, grammarAccess.getSetClauseAccess().getValINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetClauseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


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
    // $ANTLR end "ruleSetClause"


    // $ANTLR start "entryRuleAlterTableStatement"
    // InternalSql_dsl.g:1591:1: entryRuleAlterTableStatement returns [EObject current=null] : iv_ruleAlterTableStatement= ruleAlterTableStatement EOF ;
    public final EObject entryRuleAlterTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableStatement = null;


        try {
            // InternalSql_dsl.g:1591:60: (iv_ruleAlterTableStatement= ruleAlterTableStatement EOF )
            // InternalSql_dsl.g:1592:2: iv_ruleAlterTableStatement= ruleAlterTableStatement EOF
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
    // InternalSql_dsl.g:1598:1: ruleAlterTableStatement returns [EObject current=null] : (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) ) ;
    public final EObject ruleAlterTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_addDropUpdate_3_1 = null;

        EObject lv_addDropUpdate_3_2 = null;

        EObject lv_addDropUpdate_3_3 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:1604:2: ( (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) ) )
            // InternalSql_dsl.g:1605:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) )
            {
            // InternalSql_dsl.g:1605:2: (otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) ) )
            // InternalSql_dsl.g:1606:3: otherlv_0= 'ALTER' otherlv_1= 'TABLE' ( (otherlv_2= RULE_ID ) ) ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterTableStatementAccess().getALTERKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterTableStatementAccess().getTABLEKeyword_1());
            		
            // InternalSql_dsl.g:1614:3: ( (otherlv_2= RULE_ID ) )
            // InternalSql_dsl.g:1615:4: (otherlv_2= RULE_ID )
            {
            // InternalSql_dsl.g:1615:4: (otherlv_2= RULE_ID )
            // InternalSql_dsl.g:1616:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterTableStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_2, grammarAccess.getAlterTableStatementAccess().getTableTableNameCrossReference_2_0());
            				

            }


            }

            // InternalSql_dsl.g:1627:3: ( ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) ) )
            // InternalSql_dsl.g:1628:4: ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) )
            {
            // InternalSql_dsl.g:1628:4: ( (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement ) )
            // InternalSql_dsl.g:1629:5: (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement )
            {
            // InternalSql_dsl.g:1629:5: (lv_addDropUpdate_3_1= ruleAlterDropStatement | lv_addDropUpdate_3_2= ruleAlterAddStatement | lv_addDropUpdate_3_3= ruleAlterUpdateStatement )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt27=1;
                }
                break;
            case 43:
                {
                alt27=2;
                }
                break;
            case 41:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSql_dsl.g:1630:6: lv_addDropUpdate_3_1= ruleAlterDropStatement
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
                    // InternalSql_dsl.g:1646:6: lv_addDropUpdate_3_2= ruleAlterAddStatement
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
                    // InternalSql_dsl.g:1662:6: lv_addDropUpdate_3_3= ruleAlterUpdateStatement
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
    // InternalSql_dsl.g:1684:1: entryRuleAlterDropStatement returns [EObject current=null] : iv_ruleAlterDropStatement= ruleAlterDropStatement EOF ;
    public final EObject entryRuleAlterDropStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDropStatement = null;


        try {
            // InternalSql_dsl.g:1684:59: (iv_ruleAlterDropStatement= ruleAlterDropStatement EOF )
            // InternalSql_dsl.g:1685:2: iv_ruleAlterDropStatement= ruleAlterDropStatement EOF
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
    // InternalSql_dsl.g:1691:1: ruleAlterDropStatement returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleAlterDropStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1697:2: ( (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSql_dsl.g:1698:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:1698:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) )
            // InternalSql_dsl.g:1699:3: otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterDropStatementAccess().getDROPKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterDropStatementAccess().getCOLUMNKeyword_1());
            		
            // InternalSql_dsl.g:1707:3: ( (otherlv_2= RULE_ID ) )
            // InternalSql_dsl.g:1708:4: (otherlv_2= RULE_ID )
            {
            // InternalSql_dsl.g:1708:4: (otherlv_2= RULE_ID )
            // InternalSql_dsl.g:1709:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterDropStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getAlterDropStatementAccess().getColumnCDCrossReference_2_0());
            				

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
    // InternalSql_dsl.g:1724:1: entryRuleAlterAddStatement returns [EObject current=null] : iv_ruleAlterAddStatement= ruleAlterAddStatement EOF ;
    public final EObject entryRuleAlterAddStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterAddStatement = null;


        try {
            // InternalSql_dsl.g:1724:58: (iv_ruleAlterAddStatement= ruleAlterAddStatement EOF )
            // InternalSql_dsl.g:1725:2: iv_ruleAlterAddStatement= ruleAlterAddStatement EOF
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
    // InternalSql_dsl.g:1731:1: ruleAlterAddStatement returns [EObject current=null] : (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAlterAddStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1737:2: ( (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSql_dsl.g:1738:2: (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:1738:2: (otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) ) )
            // InternalSql_dsl.g:1739:3: otherlv_0= 'ADD' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterAddStatementAccess().getADDKeyword_0());
            		
            // InternalSql_dsl.g:1743:3: ( (otherlv_1= RULE_ID ) )
            // InternalSql_dsl.g:1744:4: (otherlv_1= RULE_ID )
            {
            // InternalSql_dsl.g:1744:4: (otherlv_1= RULE_ID )
            // InternalSql_dsl.g:1745:5: otherlv_1= RULE_ID
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
    // InternalSql_dsl.g:1760:1: entryRuleAlterUpdateStatement returns [EObject current=null] : iv_ruleAlterUpdateStatement= ruleAlterUpdateStatement EOF ;
    public final EObject entryRuleAlterUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterUpdateStatement = null;


        try {
            // InternalSql_dsl.g:1760:61: (iv_ruleAlterUpdateStatement= ruleAlterUpdateStatement EOF )
            // InternalSql_dsl.g:1761:2: iv_ruleAlterUpdateStatement= ruleAlterUpdateStatement EOF
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
    // InternalSql_dsl.g:1767:1: ruleAlterUpdateStatement returns [EObject current=null] : (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleAlterUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1773:2: ( (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalSql_dsl.g:1774:2: (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalSql_dsl.g:1774:2: (otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) ) )
            // InternalSql_dsl.g:1775:3: otherlv_0= 'ALTER' otherlv_1= 'COLUMN' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterUpdateStatementAccess().getALTERKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterUpdateStatementAccess().getCOLUMNKeyword_1());
            		
            // InternalSql_dsl.g:1783:3: ( (otherlv_2= RULE_ID ) )
            // InternalSql_dsl.g:1784:4: (otherlv_2= RULE_ID )
            {
            // InternalSql_dsl.g:1784:4: (otherlv_2= RULE_ID )
            // InternalSql_dsl.g:1785:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterUpdateStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getAlterUpdateStatementAccess().getColumnCDCrossReference_2_0());
            				

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
    // InternalSql_dsl.g:1800:1: entryRuleVariableDeclarationStatement returns [EObject current=null] : iv_ruleVariableDeclarationStatement= ruleVariableDeclarationStatement EOF ;
    public final EObject entryRuleVariableDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationStatement = null;


        try {
            // InternalSql_dsl.g:1800:69: (iv_ruleVariableDeclarationStatement= ruleVariableDeclarationStatement EOF )
            // InternalSql_dsl.g:1801:2: iv_ruleVariableDeclarationStatement= ruleVariableDeclarationStatement EOF
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
    // InternalSql_dsl.g:1807:1: ruleVariableDeclarationStatement returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalSql_dsl.g:1813:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalSql_dsl.g:1814:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalSql_dsl.g:1814:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalSql_dsl.g:1815:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationStatementAccess().getVarKeyword_0());
            		
            // InternalSql_dsl.g:1819:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSql_dsl.g:1820:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSql_dsl.g:1820:4: (lv_name_1_0= RULE_ID )
            // InternalSql_dsl.g:1821:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationStatementAccess().getEqualsSignKeyword_2());
            		
            // InternalSql_dsl.g:1841:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalSql_dsl.g:1842:4: (lv_value_3_0= RULE_INT )
            {
            // InternalSql_dsl.g:1842:4: (lv_value_3_0= RULE_INT )
            // InternalSql_dsl.g:1843:5: lv_value_3_0= RULE_INT
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
    // InternalSql_dsl.g:1863:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql_dsl.g:1865:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalSql_dsl.g:1866:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalSql_dsl.g:1875:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql_dsl.g:1882:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalSql_dsl.g:1883:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalSql_dsl.g:1883:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalSql_dsl.g:1884:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalSql_dsl.g:1884:3: (this_INT_0= RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSql_dsl.g:1885:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_31); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,45,FOLLOW_30); 

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


    // $ANTLR start "entryRuleFunctions"
    // InternalSql_dsl.g:1912:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalSql_dsl.g:1912:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalSql_dsl.g:1913:2: iv_ruleFunctions= ruleFunctions EOF
            {
             newCompositeNode(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctions=ruleFunctions();

            state._fsp--;

             current =iv_ruleFunctions; 
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
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalSql_dsl.g:1919:1: ruleFunctions returns [EObject current=null] : (this_CountFunction_0= ruleCountFunction | this_AvgFunction_1= ruleAvgFunction | this_SumFunction_2= ruleSumFunction | this_MinFunction_3= ruleMinFunction | this_MaxFunction_4= ruleMaxFunction ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_CountFunction_0 = null;

        EObject this_AvgFunction_1 = null;

        EObject this_SumFunction_2 = null;

        EObject this_MinFunction_3 = null;

        EObject this_MaxFunction_4 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:1925:2: ( (this_CountFunction_0= ruleCountFunction | this_AvgFunction_1= ruleAvgFunction | this_SumFunction_2= ruleSumFunction | this_MinFunction_3= ruleMinFunction | this_MaxFunction_4= ruleMaxFunction ) )
            // InternalSql_dsl.g:1926:2: (this_CountFunction_0= ruleCountFunction | this_AvgFunction_1= ruleAvgFunction | this_SumFunction_2= ruleSumFunction | this_MinFunction_3= ruleMinFunction | this_MaxFunction_4= ruleMaxFunction )
            {
            // InternalSql_dsl.g:1926:2: (this_CountFunction_0= ruleCountFunction | this_AvgFunction_1= ruleAvgFunction | this_SumFunction_2= ruleSumFunction | this_MinFunction_3= ruleMinFunction | this_MaxFunction_4= ruleMaxFunction )
            int alt29=5;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==11) ) {
                switch ( input.LA(2) ) {
                case 46:
                    {
                    alt29=1;
                    }
                    break;
                case 50:
                    {
                    alt29=5;
                    }
                    break;
                case 47:
                    {
                    alt29=2;
                    }
                    break;
                case 48:
                    {
                    alt29=3;
                    }
                    break;
                case 49:
                    {
                    alt29=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSql_dsl.g:1927:3: this_CountFunction_0= ruleCountFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionsAccess().getCountFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountFunction_0=ruleCountFunction();

                    state._fsp--;


                    			current = this_CountFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1936:3: this_AvgFunction_1= ruleAvgFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionsAccess().getAvgFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AvgFunction_1=ruleAvgFunction();

                    state._fsp--;


                    			current = this_AvgFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1945:3: this_SumFunction_2= ruleSumFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionsAccess().getSumFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumFunction_2=ruleSumFunction();

                    state._fsp--;


                    			current = this_SumFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:1954:3: this_MinFunction_3= ruleMinFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionsAccess().getMinFunctionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinFunction_3=ruleMinFunction();

                    state._fsp--;


                    			current = this_MinFunction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:1963:3: this_MaxFunction_4= ruleMaxFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionsAccess().getMaxFunctionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxFunction_4=ruleMaxFunction();

                    state._fsp--;


                    			current = this_MaxFunction_4;
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
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleCountFunction"
    // InternalSql_dsl.g:1975:1: entryRuleCountFunction returns [EObject current=null] : iv_ruleCountFunction= ruleCountFunction EOF ;
    public final EObject entryRuleCountFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountFunction = null;


        try {
            // InternalSql_dsl.g:1975:54: (iv_ruleCountFunction= ruleCountFunction EOF )
            // InternalSql_dsl.g:1976:2: iv_ruleCountFunction= ruleCountFunction EOF
            {
             newCompositeNode(grammarAccess.getCountFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountFunction=ruleCountFunction();

            state._fsp--;

             current =iv_ruleCountFunction; 
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
    // $ANTLR end "entryRuleCountFunction"


    // $ANTLR start "ruleCountFunction"
    // InternalSql_dsl.g:1982:1: ruleCountFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleCountFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:1988:2: ( (otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalSql_dsl.g:1989:2: (otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalSql_dsl.g:1989:2: (otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalSql_dsl.g:1990:3: otherlv_0= 'SELECT' otherlv_1= 'COUNT' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getCountFunctionAccess().getSELECTKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCountFunctionAccess().getCOUNTKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCountFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:2002:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:2003:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:2003:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:2004:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountFunctionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_3, grammarAccess.getCountFunctionAccess().getColumnCDCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getCountFunctionAccess().getRightParenthesisKeyword_4());
            		
            // InternalSql_dsl.g:2019:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:2020:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:2020:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalSql_dsl.g:2021:5: lv_x_5_0= ruleFromAndWhereClauses
            {

            					newCompositeNode(grammarAccess.getCountFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountFunctionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_5_0,
            						"uk.ac.kcl.dsl.Sql_dsl.FromAndWhereClauses");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleCountFunction"


    // $ANTLR start "entryRuleAvgFunction"
    // InternalSql_dsl.g:2042:1: entryRuleAvgFunction returns [EObject current=null] : iv_ruleAvgFunction= ruleAvgFunction EOF ;
    public final EObject entryRuleAvgFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgFunction = null;


        try {
            // InternalSql_dsl.g:2042:52: (iv_ruleAvgFunction= ruleAvgFunction EOF )
            // InternalSql_dsl.g:2043:2: iv_ruleAvgFunction= ruleAvgFunction EOF
            {
             newCompositeNode(grammarAccess.getAvgFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvgFunction=ruleAvgFunction();

            state._fsp--;

             current =iv_ruleAvgFunction; 
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
    // $ANTLR end "entryRuleAvgFunction"


    // $ANTLR start "ruleAvgFunction"
    // InternalSql_dsl.g:2049:1: ruleAvgFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleAvgFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:2055:2: ( (otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalSql_dsl.g:2056:2: (otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalSql_dsl.g:2056:2: (otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalSql_dsl.g:2057:3: otherlv_0= 'SELECT' otherlv_1= 'AVG' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAvgFunctionAccess().getSELECTKeyword_0());
            		
            otherlv_1=(Token)match(input,47,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAvgFunctionAccess().getAVGKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAvgFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:2069:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:2070:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:2070:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:2071:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAvgFunctionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_3, grammarAccess.getAvgFunctionAccess().getColumnCDCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAvgFunctionAccess().getRightParenthesisKeyword_4());
            		
            // InternalSql_dsl.g:2086:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:2087:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:2087:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalSql_dsl.g:2088:5: lv_x_5_0= ruleFromAndWhereClauses
            {

            					newCompositeNode(grammarAccess.getAvgFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvgFunctionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_5_0,
            						"uk.ac.kcl.dsl.Sql_dsl.FromAndWhereClauses");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAvgFunction"


    // $ANTLR start "entryRuleSumFunction"
    // InternalSql_dsl.g:2109:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // InternalSql_dsl.g:2109:52: (iv_ruleSumFunction= ruleSumFunction EOF )
            // InternalSql_dsl.g:2110:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
             newCompositeNode(grammarAccess.getSumFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;

             current =iv_ruleSumFunction; 
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
    // $ANTLR end "entryRuleSumFunction"


    // $ANTLR start "ruleSumFunction"
    // InternalSql_dsl.g:2116:1: ruleSumFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleSumFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:2122:2: ( (otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalSql_dsl.g:2123:2: (otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalSql_dsl.g:2123:2: (otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalSql_dsl.g:2124:3: otherlv_0= 'SELECT' otherlv_1= 'SUM' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSumFunctionAccess().getSELECTKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getSUMKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:2136:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:2137:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:2137:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:2138:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumFunctionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getColumnCDCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSumFunctionAccess().getRightParenthesisKeyword_4());
            		
            // InternalSql_dsl.g:2153:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:2154:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:2154:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalSql_dsl.g:2155:5: lv_x_5_0= ruleFromAndWhereClauses
            {

            					newCompositeNode(grammarAccess.getSumFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumFunctionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_5_0,
            						"uk.ac.kcl.dsl.Sql_dsl.FromAndWhereClauses");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleSumFunction"


    // $ANTLR start "entryRuleMinFunction"
    // InternalSql_dsl.g:2176:1: entryRuleMinFunction returns [EObject current=null] : iv_ruleMinFunction= ruleMinFunction EOF ;
    public final EObject entryRuleMinFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinFunction = null;


        try {
            // InternalSql_dsl.g:2176:52: (iv_ruleMinFunction= ruleMinFunction EOF )
            // InternalSql_dsl.g:2177:2: iv_ruleMinFunction= ruleMinFunction EOF
            {
             newCompositeNode(grammarAccess.getMinFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinFunction=ruleMinFunction();

            state._fsp--;

             current =iv_ruleMinFunction; 
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
    // $ANTLR end "entryRuleMinFunction"


    // $ANTLR start "ruleMinFunction"
    // InternalSql_dsl.g:2183:1: ruleMinFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleMinFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:2189:2: ( (otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalSql_dsl.g:2190:2: (otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalSql_dsl.g:2190:2: (otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalSql_dsl.g:2191:3: otherlv_0= 'SELECT' otherlv_1= 'MIN' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getMinFunctionAccess().getSELECTKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMinFunctionAccess().getMINKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMinFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:2203:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:2204:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:2204:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:2205:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinFunctionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_3, grammarAccess.getMinFunctionAccess().getColumnCDCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMinFunctionAccess().getRightParenthesisKeyword_4());
            		
            // InternalSql_dsl.g:2220:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:2221:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:2221:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalSql_dsl.g:2222:5: lv_x_5_0= ruleFromAndWhereClauses
            {

            					newCompositeNode(grammarAccess.getMinFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinFunctionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_5_0,
            						"uk.ac.kcl.dsl.Sql_dsl.FromAndWhereClauses");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMinFunction"


    // $ANTLR start "entryRuleMaxFunction"
    // InternalSql_dsl.g:2243:1: entryRuleMaxFunction returns [EObject current=null] : iv_ruleMaxFunction= ruleMaxFunction EOF ;
    public final EObject entryRuleMaxFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxFunction = null;


        try {
            // InternalSql_dsl.g:2243:52: (iv_ruleMaxFunction= ruleMaxFunction EOF )
            // InternalSql_dsl.g:2244:2: iv_ruleMaxFunction= ruleMaxFunction EOF
            {
             newCompositeNode(grammarAccess.getMaxFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxFunction=ruleMaxFunction();

            state._fsp--;

             current =iv_ruleMaxFunction; 
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
    // $ANTLR end "entryRuleMaxFunction"


    // $ANTLR start "ruleMaxFunction"
    // InternalSql_dsl.g:2250:1: ruleMaxFunction returns [EObject current=null] : (otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) ;
    public final EObject ruleMaxFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;



        	enterRule();

        try {
            // InternalSql_dsl.g:2256:2: ( (otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) ) )
            // InternalSql_dsl.g:2257:2: (otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            {
            // InternalSql_dsl.g:2257:2: (otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) ) )
            // InternalSql_dsl.g:2258:3: otherlv_0= 'SELECT' otherlv_1= 'MAX' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxFunctionAccess().getSELECTKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxFunctionAccess().getMAXKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSql_dsl.g:2270:3: ( (otherlv_3= RULE_ID ) )
            // InternalSql_dsl.g:2271:4: (otherlv_3= RULE_ID )
            {
            // InternalSql_dsl.g:2271:4: (otherlv_3= RULE_ID )
            // InternalSql_dsl.g:2272:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxFunctionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_3, grammarAccess.getMaxFunctionAccess().getColumnCDCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMaxFunctionAccess().getRightParenthesisKeyword_4());
            		
            // InternalSql_dsl.g:2287:3: ( (lv_x_5_0= ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:2288:4: (lv_x_5_0= ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:2288:4: (lv_x_5_0= ruleFromAndWhereClauses )
            // InternalSql_dsl.g:2289:5: lv_x_5_0= ruleFromAndWhereClauses
            {

            					newCompositeNode(grammarAccess.getMaxFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_5_0=ruleFromAndWhereClauses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxFunctionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_5_0,
            						"uk.ac.kcl.dsl.Sql_dsl.FromAndWhereClauses");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMaxFunction"


    // $ANTLR start "ruleDataStructureType"
    // InternalSql_dsl.g:2310:1: ruleDataStructureType returns [Enumerator current=null] : ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) ) ;
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
            // InternalSql_dsl.g:2316:2: ( ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) ) )
            // InternalSql_dsl.g:2317:2: ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) )
            {
            // InternalSql_dsl.g:2317:2: ( (enumLiteral_0= 'varchar' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'text' ) )
            int alt30=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt30=1;
                }
                break;
            case 52:
                {
                alt30=2;
                }
                break;
            case 53:
                {
                alt30=3;
                }
                break;
            case 54:
                {
                alt30=4;
                }
                break;
            case 55:
                {
                alt30=5;
                }
                break;
            case 56:
                {
                alt30=6;
                }
                break;
            case 57:
                {
                alt30=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSql_dsl.g:2318:3: (enumLiteral_0= 'varchar' )
                    {
                    // InternalSql_dsl.g:2318:3: (enumLiteral_0= 'varchar' )
                    // InternalSql_dsl.g:2319:4: enumLiteral_0= 'varchar'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:2326:3: (enumLiteral_1= 'char' )
                    {
                    // InternalSql_dsl.g:2326:3: (enumLiteral_1= 'char' )
                    // InternalSql_dsl.g:2327:4: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:2334:3: (enumLiteral_2= 'date' )
                    {
                    // InternalSql_dsl.g:2334:3: (enumLiteral_2= 'date' )
                    // InternalSql_dsl.g:2335:4: enumLiteral_2= 'date'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:2342:3: (enumLiteral_3= 'int' )
                    {
                    // InternalSql_dsl.g:2342:3: (enumLiteral_3= 'int' )
                    // InternalSql_dsl.g:2343:4: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:2350:3: (enumLiteral_4= 'float' )
                    {
                    // InternalSql_dsl.g:2350:3: (enumLiteral_4= 'float' )
                    // InternalSql_dsl.g:2351:4: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:2358:3: (enumLiteral_5= 'time' )
                    {
                    // InternalSql_dsl.g:2358:3: (enumLiteral_5= 'time' )
                    // InternalSql_dsl.g:2359:4: enumLiteral_5= 'time'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:2366:3: (enumLiteral_6= 'text' )
                    {
                    // InternalSql_dsl.g:2366:3: (enumLiteral_6= 'text' )
                    // InternalSql_dsl.g:2367:4: enumLiteral_6= 'text'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_2); 

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\13\1\33\4\uffff\1\4\6\uffff";
    static final String dfa_3s = "\1\54\1\34\4\uffff\1\62\6\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\1\1\2\1\7\1\12";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\16\uffff\1\1\11\uffff\1\2\1\3\1\7\1\10\1\uffff\1\4\2\uffff\1\5",
            "\1\11\1\12",
            "",
            "",
            "",
            "",
            "\1\13\7\uffff\1\13\1\uffff\1\13\37\uffff\5\14",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "115:2: (this_DatabaseDeclarationStatement_0= ruleDatabaseDeclarationStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_DropTableStatement_2= ruleDropTableStatement | this_TruncateTableStatement_3= ruleTruncateTableStatement | this_AlterTableStatement_4= ruleAlterTableStatement | this_VariableDeclarationStatement_5= ruleVariableDeclarationStatement | this_SelectStatement_6= ruleSelectStatement | this_DeleteTableStatement_7= ruleDeleteTableStatement | this_UpdateTableStatement_8= ruleUpdateTableStatement | this_Functions_9= ruleFunctions )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000012F004000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000500000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000540002010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x03F8000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000A1000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});

}