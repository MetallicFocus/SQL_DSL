package uk.ac.kcl.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.dsl.services.Sql_dslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSql_dslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'AND'", "'OR'", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'LIKE'", "'varchar'", "'char'", "'date'", "'int'", "'float'", "'time'", "'text'", "'SELECT'", "','", "'FROM'", "'WHERE'", "'#'", "'CREATE'", "'DATABASE'", "'TABLE'", "'('", "')'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'DROP'", "'TRUNCATE'", "'DELETE'", "'UPDATE'", "'SET'", "'ALTER'", "'COLUMN'", "'ADD'", "'var'", "'.'", "'COUNT'", "'AVG'", "'SUM'", "'MIN'", "'MAX'", "'NOT NULL'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(Sql_dslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSql_dsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSql_dsl.g:54:1: ( ruleModel EOF )
            // InternalSql_dsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSql_dsl.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:66:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // InternalSql_dsl.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            {
            // InternalSql_dsl.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            // InternalSql_dsl.g:68:3: ( rule__Model__StatementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalSql_dsl.g:69:3: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28||LA1_0==33||(LA1_0>=42 && LA1_0<=45)||LA1_0==47||LA1_0==50) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSql_dsl.g:69:4: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalSql_dsl.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:79:1: ( ruleStatement EOF )
            // InternalSql_dsl.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalSql_dsl.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalSql_dsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalSql_dsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalSql_dsl.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalSql_dsl.g:94:3: ( rule__Statement__Alternatives )
            // InternalSql_dsl.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalSql_dsl.g:103:1: entryRuleSelectStatement : ruleSelectStatement EOF ;
    public final void entryRuleSelectStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:104:1: ( ruleSelectStatement EOF )
            // InternalSql_dsl.g:105:1: ruleSelectStatement EOF
            {
             before(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectStatement();

            state._fsp--;

             after(grammarAccess.getSelectStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalSql_dsl.g:112:1: ruleSelectStatement : ( ( rule__SelectStatement__Group__0 ) ) ;
    public final void ruleSelectStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:116:2: ( ( ( rule__SelectStatement__Group__0 ) ) )
            // InternalSql_dsl.g:117:2: ( ( rule__SelectStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:117:2: ( ( rule__SelectStatement__Group__0 ) )
            // InternalSql_dsl.g:118:3: ( rule__SelectStatement__Group__0 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroup()); 
            // InternalSql_dsl.g:119:3: ( rule__SelectStatement__Group__0 )
            // InternalSql_dsl.g:119:4: rule__SelectStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleFromAndWhereClauses"
    // InternalSql_dsl.g:128:1: entryRuleFromAndWhereClauses : ruleFromAndWhereClauses EOF ;
    public final void entryRuleFromAndWhereClauses() throws RecognitionException {
        try {
            // InternalSql_dsl.g:129:1: ( ruleFromAndWhereClauses EOF )
            // InternalSql_dsl.g:130:1: ruleFromAndWhereClauses EOF
            {
             before(grammarAccess.getFromAndWhereClausesRule()); 
            pushFollow(FOLLOW_1);
            ruleFromAndWhereClauses();

            state._fsp--;

             after(grammarAccess.getFromAndWhereClausesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFromAndWhereClauses"


    // $ANTLR start "ruleFromAndWhereClauses"
    // InternalSql_dsl.g:137:1: ruleFromAndWhereClauses : ( ( rule__FromAndWhereClauses__Group__0 ) ) ;
    public final void ruleFromAndWhereClauses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:141:2: ( ( ( rule__FromAndWhereClauses__Group__0 ) ) )
            // InternalSql_dsl.g:142:2: ( ( rule__FromAndWhereClauses__Group__0 ) )
            {
            // InternalSql_dsl.g:142:2: ( ( rule__FromAndWhereClauses__Group__0 ) )
            // InternalSql_dsl.g:143:3: ( rule__FromAndWhereClauses__Group__0 )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getGroup()); 
            // InternalSql_dsl.g:144:3: ( rule__FromAndWhereClauses__Group__0 )
            // InternalSql_dsl.g:144:4: rule__FromAndWhereClauses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromAndWhereClausesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFromAndWhereClauses"


    // $ANTLR start "entryRuleWhereDec"
    // InternalSql_dsl.g:153:1: entryRuleWhereDec : ruleWhereDec EOF ;
    public final void entryRuleWhereDec() throws RecognitionException {
        try {
            // InternalSql_dsl.g:154:1: ( ruleWhereDec EOF )
            // InternalSql_dsl.g:155:1: ruleWhereDec EOF
            {
             before(grammarAccess.getWhereDecRule()); 
            pushFollow(FOLLOW_1);
            ruleWhereDec();

            state._fsp--;

             after(grammarAccess.getWhereDecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhereDec"


    // $ANTLR start "ruleWhereDec"
    // InternalSql_dsl.g:162:1: ruleWhereDec : ( ( rule__WhereDec__Group__0 ) ) ;
    public final void ruleWhereDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:166:2: ( ( ( rule__WhereDec__Group__0 ) ) )
            // InternalSql_dsl.g:167:2: ( ( rule__WhereDec__Group__0 ) )
            {
            // InternalSql_dsl.g:167:2: ( ( rule__WhereDec__Group__0 ) )
            // InternalSql_dsl.g:168:3: ( rule__WhereDec__Group__0 )
            {
             before(grammarAccess.getWhereDecAccess().getGroup()); 
            // InternalSql_dsl.g:169:3: ( rule__WhereDec__Group__0 )
            // InternalSql_dsl.g:169:4: rule__WhereDec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereDecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhereDec"


    // $ANTLR start "entryRuleRightOperandOne"
    // InternalSql_dsl.g:178:1: entryRuleRightOperandOne : ruleRightOperandOne EOF ;
    public final void entryRuleRightOperandOne() throws RecognitionException {
        try {
            // InternalSql_dsl.g:179:1: ( ruleRightOperandOne EOF )
            // InternalSql_dsl.g:180:1: ruleRightOperandOne EOF
            {
             before(grammarAccess.getRightOperandOneRule()); 
            pushFollow(FOLLOW_1);
            ruleRightOperandOne();

            state._fsp--;

             after(grammarAccess.getRightOperandOneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightOperandOne"


    // $ANTLR start "ruleRightOperandOne"
    // InternalSql_dsl.g:187:1: ruleRightOperandOne : ( ( rule__RightOperandOne__Group__0 ) ) ;
    public final void ruleRightOperandOne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:191:2: ( ( ( rule__RightOperandOne__Group__0 ) ) )
            // InternalSql_dsl.g:192:2: ( ( rule__RightOperandOne__Group__0 ) )
            {
            // InternalSql_dsl.g:192:2: ( ( rule__RightOperandOne__Group__0 ) )
            // InternalSql_dsl.g:193:3: ( rule__RightOperandOne__Group__0 )
            {
             before(grammarAccess.getRightOperandOneAccess().getGroup()); 
            // InternalSql_dsl.g:194:3: ( rule__RightOperandOne__Group__0 )
            // InternalSql_dsl.g:194:4: rule__RightOperandOne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightOperandOne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightOperandOneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightOperandOne"


    // $ANTLR start "entryRuleRightOperandTwo"
    // InternalSql_dsl.g:203:1: entryRuleRightOperandTwo : ruleRightOperandTwo EOF ;
    public final void entryRuleRightOperandTwo() throws RecognitionException {
        try {
            // InternalSql_dsl.g:204:1: ( ruleRightOperandTwo EOF )
            // InternalSql_dsl.g:205:1: ruleRightOperandTwo EOF
            {
             before(grammarAccess.getRightOperandTwoRule()); 
            pushFollow(FOLLOW_1);
            ruleRightOperandTwo();

            state._fsp--;

             after(grammarAccess.getRightOperandTwoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightOperandTwo"


    // $ANTLR start "ruleRightOperandTwo"
    // InternalSql_dsl.g:212:1: ruleRightOperandTwo : ( ( rule__RightOperandTwo__ColumnAssignment ) ) ;
    public final void ruleRightOperandTwo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:216:2: ( ( ( rule__RightOperandTwo__ColumnAssignment ) ) )
            // InternalSql_dsl.g:217:2: ( ( rule__RightOperandTwo__ColumnAssignment ) )
            {
            // InternalSql_dsl.g:217:2: ( ( rule__RightOperandTwo__ColumnAssignment ) )
            // InternalSql_dsl.g:218:3: ( rule__RightOperandTwo__ColumnAssignment )
            {
             before(grammarAccess.getRightOperandTwoAccess().getColumnAssignment()); 
            // InternalSql_dsl.g:219:3: ( rule__RightOperandTwo__ColumnAssignment )
            // InternalSql_dsl.g:219:4: rule__RightOperandTwo__ColumnAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RightOperandTwo__ColumnAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRightOperandTwoAccess().getColumnAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightOperandTwo"


    // $ANTLR start "entryRuleRightOperandThree"
    // InternalSql_dsl.g:228:1: entryRuleRightOperandThree : ruleRightOperandThree EOF ;
    public final void entryRuleRightOperandThree() throws RecognitionException {
        try {
            // InternalSql_dsl.g:229:1: ( ruleRightOperandThree EOF )
            // InternalSql_dsl.g:230:1: ruleRightOperandThree EOF
            {
             before(grammarAccess.getRightOperandThreeRule()); 
            pushFollow(FOLLOW_1);
            ruleRightOperandThree();

            state._fsp--;

             after(grammarAccess.getRightOperandThreeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightOperandThree"


    // $ANTLR start "ruleRightOperandThree"
    // InternalSql_dsl.g:237:1: ruleRightOperandThree : ( ( rule__RightOperandThree__ValAssignment ) ) ;
    public final void ruleRightOperandThree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:241:2: ( ( ( rule__RightOperandThree__ValAssignment ) ) )
            // InternalSql_dsl.g:242:2: ( ( rule__RightOperandThree__ValAssignment ) )
            {
            // InternalSql_dsl.g:242:2: ( ( rule__RightOperandThree__ValAssignment ) )
            // InternalSql_dsl.g:243:3: ( rule__RightOperandThree__ValAssignment )
            {
             before(grammarAccess.getRightOperandThreeAccess().getValAssignment()); 
            // InternalSql_dsl.g:244:3: ( rule__RightOperandThree__ValAssignment )
            // InternalSql_dsl.g:244:4: rule__RightOperandThree__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RightOperandThree__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRightOperandThreeAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightOperandThree"


    // $ANTLR start "entryRuleDatabaseDeclarationStatement"
    // InternalSql_dsl.g:253:1: entryRuleDatabaseDeclarationStatement : ruleDatabaseDeclarationStatement EOF ;
    public final void entryRuleDatabaseDeclarationStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:254:1: ( ruleDatabaseDeclarationStatement EOF )
            // InternalSql_dsl.g:255:1: ruleDatabaseDeclarationStatement EOF
            {
             before(grammarAccess.getDatabaseDeclarationStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabaseDeclarationStatement();

            state._fsp--;

             after(grammarAccess.getDatabaseDeclarationStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabaseDeclarationStatement"


    // $ANTLR start "ruleDatabaseDeclarationStatement"
    // InternalSql_dsl.g:262:1: ruleDatabaseDeclarationStatement : ( ( rule__DatabaseDeclarationStatement__Group__0 ) ) ;
    public final void ruleDatabaseDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:266:2: ( ( ( rule__DatabaseDeclarationStatement__Group__0 ) ) )
            // InternalSql_dsl.g:267:2: ( ( rule__DatabaseDeclarationStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:267:2: ( ( rule__DatabaseDeclarationStatement__Group__0 ) )
            // InternalSql_dsl.g:268:3: ( rule__DatabaseDeclarationStatement__Group__0 )
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getGroup()); 
            // InternalSql_dsl.g:269:3: ( rule__DatabaseDeclarationStatement__Group__0 )
            // InternalSql_dsl.g:269:4: rule__DatabaseDeclarationStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseDeclarationStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseDeclarationStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabaseDeclarationStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // InternalSql_dsl.g:278:1: entryRuleCreateTableStatement : ruleCreateTableStatement EOF ;
    public final void entryRuleCreateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:279:1: ( ruleCreateTableStatement EOF )
            // InternalSql_dsl.g:280:1: ruleCreateTableStatement EOF
            {
             before(grammarAccess.getCreateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateTableStatement();

            state._fsp--;

             after(grammarAccess.getCreateTableStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // InternalSql_dsl.g:287:1: ruleCreateTableStatement : ( ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* ) ) ;
    public final void ruleCreateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:291:2: ( ( ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* ) ) )
            // InternalSql_dsl.g:292:2: ( ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* ) )
            {
            // InternalSql_dsl.g:292:2: ( ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* ) )
            // InternalSql_dsl.g:293:3: ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* )
            {
            // InternalSql_dsl.g:293:3: ( ( rule__CreateTableStatement__TablesAssignment ) )
            // InternalSql_dsl.g:294:4: ( rule__CreateTableStatement__TablesAssignment )
            {
             before(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:295:4: ( rule__CreateTableStatement__TablesAssignment )
            // InternalSql_dsl.g:295:5: rule__CreateTableStatement__TablesAssignment
            {
            pushFollow(FOLLOW_4);
            rule__CreateTableStatement__TablesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 

            }

            // InternalSql_dsl.g:298:3: ( ( rule__CreateTableStatement__TablesAssignment )* )
            // InternalSql_dsl.g:299:4: ( rule__CreateTableStatement__TablesAssignment )*
            {
             before(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:300:4: ( rule__CreateTableStatement__TablesAssignment )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalSql_dsl.g:300:5: rule__CreateTableStatement__TablesAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CreateTableStatement__TablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleTableDeclaration"
    // InternalSql_dsl.g:310:1: entryRuleTableDeclaration : ruleTableDeclaration EOF ;
    public final void entryRuleTableDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:311:1: ( ruleTableDeclaration EOF )
            // InternalSql_dsl.g:312:1: ruleTableDeclaration EOF
            {
             before(grammarAccess.getTableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleTableDeclaration();

            state._fsp--;

             after(grammarAccess.getTableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableDeclaration"


    // $ANTLR start "ruleTableDeclaration"
    // InternalSql_dsl.g:319:1: ruleTableDeclaration : ( ( rule__TableDeclaration__Group__0 ) ) ;
    public final void ruleTableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:323:2: ( ( ( rule__TableDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:324:2: ( ( rule__TableDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:324:2: ( ( rule__TableDeclaration__Group__0 ) )
            // InternalSql_dsl.g:325:3: ( rule__TableDeclaration__Group__0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:326:3: ( rule__TableDeclaration__Group__0 )
            // InternalSql_dsl.g:326:4: rule__TableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableDeclaration"


    // $ANTLR start "entryRuletableName"
    // InternalSql_dsl.g:335:1: entryRuletableName : ruletableName EOF ;
    public final void entryRuletableName() throws RecognitionException {
        try {
            // InternalSql_dsl.g:336:1: ( ruletableName EOF )
            // InternalSql_dsl.g:337:1: ruletableName EOF
            {
             before(grammarAccess.getTableNameRule()); 
            pushFollow(FOLLOW_1);
            ruletableName();

            state._fsp--;

             after(grammarAccess.getTableNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletableName"


    // $ANTLR start "ruletableName"
    // InternalSql_dsl.g:344:1: ruletableName : ( ( rule__TableName__NameAssignment ) ) ;
    public final void ruletableName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:348:2: ( ( ( rule__TableName__NameAssignment ) ) )
            // InternalSql_dsl.g:349:2: ( ( rule__TableName__NameAssignment ) )
            {
            // InternalSql_dsl.g:349:2: ( ( rule__TableName__NameAssignment ) )
            // InternalSql_dsl.g:350:3: ( rule__TableName__NameAssignment )
            {
             before(grammarAccess.getTableNameAccess().getNameAssignment()); 
            // InternalSql_dsl.g:351:3: ( rule__TableName__NameAssignment )
            // InternalSql_dsl.g:351:4: rule__TableName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TableName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletableName"


    // $ANTLR start "entryRuleColumnDeclaration"
    // InternalSql_dsl.g:360:1: entryRuleColumnDeclaration : ruleColumnDeclaration EOF ;
    public final void entryRuleColumnDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:361:1: ( ruleColumnDeclaration EOF )
            // InternalSql_dsl.g:362:1: ruleColumnDeclaration EOF
            {
             before(grammarAccess.getColumnDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnDeclaration();

            state._fsp--;

             after(grammarAccess.getColumnDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnDeclaration"


    // $ANTLR start "ruleColumnDeclaration"
    // InternalSql_dsl.g:369:1: ruleColumnDeclaration : ( ( rule__ColumnDeclaration__Group__0 ) ) ;
    public final void ruleColumnDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:373:2: ( ( ( rule__ColumnDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:374:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:374:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            // InternalSql_dsl.g:375:3: ( rule__ColumnDeclaration__Group__0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:376:3: ( rule__ColumnDeclaration__Group__0 )
            // InternalSql_dsl.g:376:4: rule__ColumnDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnDeclaration"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalSql_dsl.g:385:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalSql_dsl.g:386:1: ( rulePrimaryKey EOF )
            // InternalSql_dsl.g:387:1: rulePrimaryKey EOF
            {
             before(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryKey();

            state._fsp--;

             after(grammarAccess.getPrimaryKeyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // InternalSql_dsl.g:394:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:398:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalSql_dsl.g:399:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalSql_dsl.g:399:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalSql_dsl.g:400:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalSql_dsl.g:401:3: ( rule__PrimaryKey__Group__0 )
            // InternalSql_dsl.g:401:4: rule__PrimaryKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleForeignKey"
    // InternalSql_dsl.g:410:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalSql_dsl.g:411:1: ( ruleForeignKey EOF )
            // InternalSql_dsl.g:412:1: ruleForeignKey EOF
            {
             before(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleForeignKey();

            state._fsp--;

             after(grammarAccess.getForeignKeyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalSql_dsl.g:419:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:423:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalSql_dsl.g:424:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalSql_dsl.g:424:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalSql_dsl.g:425:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalSql_dsl.g:426:3: ( rule__ForeignKey__Group__0 )
            // InternalSql_dsl.g:426:4: rule__ForeignKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleDropTableStatement"
    // InternalSql_dsl.g:435:1: entryRuleDropTableStatement : ruleDropTableStatement EOF ;
    public final void entryRuleDropTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:436:1: ( ruleDropTableStatement EOF )
            // InternalSql_dsl.g:437:1: ruleDropTableStatement EOF
            {
             before(grammarAccess.getDropTableStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDropTableStatement();

            state._fsp--;

             after(grammarAccess.getDropTableStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDropTableStatement"


    // $ANTLR start "ruleDropTableStatement"
    // InternalSql_dsl.g:444:1: ruleDropTableStatement : ( ( rule__DropTableStatement__Group__0 ) ) ;
    public final void ruleDropTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:448:2: ( ( ( rule__DropTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:449:2: ( ( rule__DropTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:449:2: ( ( rule__DropTableStatement__Group__0 ) )
            // InternalSql_dsl.g:450:3: ( rule__DropTableStatement__Group__0 )
            {
             before(grammarAccess.getDropTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:451:3: ( rule__DropTableStatement__Group__0 )
            // InternalSql_dsl.g:451:4: rule__DropTableStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DropTableStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropTableStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDropTableStatement"


    // $ANTLR start "entryRuleTruncateTableStatement"
    // InternalSql_dsl.g:460:1: entryRuleTruncateTableStatement : ruleTruncateTableStatement EOF ;
    public final void entryRuleTruncateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:461:1: ( ruleTruncateTableStatement EOF )
            // InternalSql_dsl.g:462:1: ruleTruncateTableStatement EOF
            {
             before(grammarAccess.getTruncateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTruncateTableStatement();

            state._fsp--;

             after(grammarAccess.getTruncateTableStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTruncateTableStatement"


    // $ANTLR start "ruleTruncateTableStatement"
    // InternalSql_dsl.g:469:1: ruleTruncateTableStatement : ( ( rule__TruncateTableStatement__Group__0 ) ) ;
    public final void ruleTruncateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:473:2: ( ( ( rule__TruncateTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:474:2: ( ( rule__TruncateTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:474:2: ( ( rule__TruncateTableStatement__Group__0 ) )
            // InternalSql_dsl.g:475:3: ( rule__TruncateTableStatement__Group__0 )
            {
             before(grammarAccess.getTruncateTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:476:3: ( rule__TruncateTableStatement__Group__0 )
            // InternalSql_dsl.g:476:4: rule__TruncateTableStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTruncateTableStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTruncateTableStatement"


    // $ANTLR start "entryRuleDeleteTableStatement"
    // InternalSql_dsl.g:485:1: entryRuleDeleteTableStatement : ruleDeleteTableStatement EOF ;
    public final void entryRuleDeleteTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:486:1: ( ruleDeleteTableStatement EOF )
            // InternalSql_dsl.g:487:1: ruleDeleteTableStatement EOF
            {
             before(grammarAccess.getDeleteTableStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteTableStatement();

            state._fsp--;

             after(grammarAccess.getDeleteTableStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeleteTableStatement"


    // $ANTLR start "ruleDeleteTableStatement"
    // InternalSql_dsl.g:494:1: ruleDeleteTableStatement : ( ( rule__DeleteTableStatement__Group__0 ) ) ;
    public final void ruleDeleteTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:498:2: ( ( ( rule__DeleteTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:499:2: ( ( rule__DeleteTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:499:2: ( ( rule__DeleteTableStatement__Group__0 ) )
            // InternalSql_dsl.g:500:3: ( rule__DeleteTableStatement__Group__0 )
            {
             before(grammarAccess.getDeleteTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:501:3: ( rule__DeleteTableStatement__Group__0 )
            // InternalSql_dsl.g:501:4: rule__DeleteTableStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteTableStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteTableStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeleteTableStatement"


    // $ANTLR start "entryRuleUpdateTableStatement"
    // InternalSql_dsl.g:510:1: entryRuleUpdateTableStatement : ruleUpdateTableStatement EOF ;
    public final void entryRuleUpdateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:511:1: ( ruleUpdateTableStatement EOF )
            // InternalSql_dsl.g:512:1: ruleUpdateTableStatement EOF
            {
             before(grammarAccess.getUpdateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateTableStatement();

            state._fsp--;

             after(grammarAccess.getUpdateTableStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpdateTableStatement"


    // $ANTLR start "ruleUpdateTableStatement"
    // InternalSql_dsl.g:519:1: ruleUpdateTableStatement : ( ( rule__UpdateTableStatement__Group__0 ) ) ;
    public final void ruleUpdateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:523:2: ( ( ( rule__UpdateTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:524:2: ( ( rule__UpdateTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:524:2: ( ( rule__UpdateTableStatement__Group__0 ) )
            // InternalSql_dsl.g:525:3: ( rule__UpdateTableStatement__Group__0 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:526:3: ( rule__UpdateTableStatement__Group__0 )
            // InternalSql_dsl.g:526:4: rule__UpdateTableStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateTableStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdateTableStatement"


    // $ANTLR start "entryRuleSetClause"
    // InternalSql_dsl.g:535:1: entryRuleSetClause : ruleSetClause EOF ;
    public final void entryRuleSetClause() throws RecognitionException {
        try {
            // InternalSql_dsl.g:536:1: ( ruleSetClause EOF )
            // InternalSql_dsl.g:537:1: ruleSetClause EOF
            {
             before(grammarAccess.getSetClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleSetClause();

            state._fsp--;

             after(grammarAccess.getSetClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetClause"


    // $ANTLR start "ruleSetClause"
    // InternalSql_dsl.g:544:1: ruleSetClause : ( ( rule__SetClause__Group__0 ) ) ;
    public final void ruleSetClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:548:2: ( ( ( rule__SetClause__Group__0 ) ) )
            // InternalSql_dsl.g:549:2: ( ( rule__SetClause__Group__0 ) )
            {
            // InternalSql_dsl.g:549:2: ( ( rule__SetClause__Group__0 ) )
            // InternalSql_dsl.g:550:3: ( rule__SetClause__Group__0 )
            {
             before(grammarAccess.getSetClauseAccess().getGroup()); 
            // InternalSql_dsl.g:551:3: ( rule__SetClause__Group__0 )
            // InternalSql_dsl.g:551:4: rule__SetClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetClause"


    // $ANTLR start "entryRuleAlterTableStatement"
    // InternalSql_dsl.g:560:1: entryRuleAlterTableStatement : ruleAlterTableStatement EOF ;
    public final void entryRuleAlterTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:561:1: ( ruleAlterTableStatement EOF )
            // InternalSql_dsl.g:562:1: ruleAlterTableStatement EOF
            {
             before(grammarAccess.getAlterTableStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAlterTableStatement();

            state._fsp--;

             after(grammarAccess.getAlterTableStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlterTableStatement"


    // $ANTLR start "ruleAlterTableStatement"
    // InternalSql_dsl.g:569:1: ruleAlterTableStatement : ( ( rule__AlterTableStatement__Group__0 ) ) ;
    public final void ruleAlterTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:573:2: ( ( ( rule__AlterTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:574:2: ( ( rule__AlterTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:574:2: ( ( rule__AlterTableStatement__Group__0 ) )
            // InternalSql_dsl.g:575:3: ( rule__AlterTableStatement__Group__0 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:576:3: ( rule__AlterTableStatement__Group__0 )
            // InternalSql_dsl.g:576:4: rule__AlterTableStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlterTableStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlterTableStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlterTableStatement"


    // $ANTLR start "entryRuleAlterDropStatement"
    // InternalSql_dsl.g:585:1: entryRuleAlterDropStatement : ruleAlterDropStatement EOF ;
    public final void entryRuleAlterDropStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:586:1: ( ruleAlterDropStatement EOF )
            // InternalSql_dsl.g:587:1: ruleAlterDropStatement EOF
            {
             before(grammarAccess.getAlterDropStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAlterDropStatement();

            state._fsp--;

             after(grammarAccess.getAlterDropStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlterDropStatement"


    // $ANTLR start "ruleAlterDropStatement"
    // InternalSql_dsl.g:594:1: ruleAlterDropStatement : ( ( rule__AlterDropStatement__Group__0 ) ) ;
    public final void ruleAlterDropStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:598:2: ( ( ( rule__AlterDropStatement__Group__0 ) ) )
            // InternalSql_dsl.g:599:2: ( ( rule__AlterDropStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:599:2: ( ( rule__AlterDropStatement__Group__0 ) )
            // InternalSql_dsl.g:600:3: ( rule__AlterDropStatement__Group__0 )
            {
             before(grammarAccess.getAlterDropStatementAccess().getGroup()); 
            // InternalSql_dsl.g:601:3: ( rule__AlterDropStatement__Group__0 )
            // InternalSql_dsl.g:601:4: rule__AlterDropStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlterDropStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlterDropStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlterDropStatement"


    // $ANTLR start "entryRuleAlterAddStatement"
    // InternalSql_dsl.g:610:1: entryRuleAlterAddStatement : ruleAlterAddStatement EOF ;
    public final void entryRuleAlterAddStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:611:1: ( ruleAlterAddStatement EOF )
            // InternalSql_dsl.g:612:1: ruleAlterAddStatement EOF
            {
             before(grammarAccess.getAlterAddStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAlterAddStatement();

            state._fsp--;

             after(grammarAccess.getAlterAddStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlterAddStatement"


    // $ANTLR start "ruleAlterAddStatement"
    // InternalSql_dsl.g:619:1: ruleAlterAddStatement : ( ( rule__AlterAddStatement__Group__0 ) ) ;
    public final void ruleAlterAddStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:623:2: ( ( ( rule__AlterAddStatement__Group__0 ) ) )
            // InternalSql_dsl.g:624:2: ( ( rule__AlterAddStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:624:2: ( ( rule__AlterAddStatement__Group__0 ) )
            // InternalSql_dsl.g:625:3: ( rule__AlterAddStatement__Group__0 )
            {
             before(grammarAccess.getAlterAddStatementAccess().getGroup()); 
            // InternalSql_dsl.g:626:3: ( rule__AlterAddStatement__Group__0 )
            // InternalSql_dsl.g:626:4: rule__AlterAddStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlterAddStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlterAddStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlterAddStatement"


    // $ANTLR start "entryRuleAlterUpdateStatement"
    // InternalSql_dsl.g:635:1: entryRuleAlterUpdateStatement : ruleAlterUpdateStatement EOF ;
    public final void entryRuleAlterUpdateStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:636:1: ( ruleAlterUpdateStatement EOF )
            // InternalSql_dsl.g:637:1: ruleAlterUpdateStatement EOF
            {
             before(grammarAccess.getAlterUpdateStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAlterUpdateStatement();

            state._fsp--;

             after(grammarAccess.getAlterUpdateStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlterUpdateStatement"


    // $ANTLR start "ruleAlterUpdateStatement"
    // InternalSql_dsl.g:644:1: ruleAlterUpdateStatement : ( ( rule__AlterUpdateStatement__Group__0 ) ) ;
    public final void ruleAlterUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:648:2: ( ( ( rule__AlterUpdateStatement__Group__0 ) ) )
            // InternalSql_dsl.g:649:2: ( ( rule__AlterUpdateStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:649:2: ( ( rule__AlterUpdateStatement__Group__0 ) )
            // InternalSql_dsl.g:650:3: ( rule__AlterUpdateStatement__Group__0 )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getGroup()); 
            // InternalSql_dsl.g:651:3: ( rule__AlterUpdateStatement__Group__0 )
            // InternalSql_dsl.g:651:4: rule__AlterUpdateStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlterUpdateStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlterUpdateStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlterUpdateStatement"


    // $ANTLR start "entryRuleVariableDeclarationStatement"
    // InternalSql_dsl.g:660:1: entryRuleVariableDeclarationStatement : ruleVariableDeclarationStatement EOF ;
    public final void entryRuleVariableDeclarationStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:661:1: ( ruleVariableDeclarationStatement EOF )
            // InternalSql_dsl.g:662:1: ruleVariableDeclarationStatement EOF
            {
             before(grammarAccess.getVariableDeclarationStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclarationStatement();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclarationStatement"


    // $ANTLR start "ruleVariableDeclarationStatement"
    // InternalSql_dsl.g:669:1: ruleVariableDeclarationStatement : ( ( rule__VariableDeclarationStatement__Group__0 ) ) ;
    public final void ruleVariableDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:673:2: ( ( ( rule__VariableDeclarationStatement__Group__0 ) ) )
            // InternalSql_dsl.g:674:2: ( ( rule__VariableDeclarationStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:674:2: ( ( rule__VariableDeclarationStatement__Group__0 ) )
            // InternalSql_dsl.g:675:3: ( rule__VariableDeclarationStatement__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getGroup()); 
            // InternalSql_dsl.g:676:3: ( rule__VariableDeclarationStatement__Group__0 )
            // InternalSql_dsl.g:676:4: rule__VariableDeclarationStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclarationStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclarationStatement"


    // $ANTLR start "entryRuleREAL"
    // InternalSql_dsl.g:685:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql_dsl.g:689:1: ( ruleREAL EOF )
            // InternalSql_dsl.g:690:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalSql_dsl.g:700:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:705:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalSql_dsl.g:706:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalSql_dsl.g:706:2: ( ( rule__REAL__Group__0 ) )
            // InternalSql_dsl.g:707:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalSql_dsl.g:708:3: ( rule__REAL__Group__0 )
            // InternalSql_dsl.g:708:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleFunctions"
    // InternalSql_dsl.g:718:1: entryRuleFunctions : ruleFunctions EOF ;
    public final void entryRuleFunctions() throws RecognitionException {
        try {
            // InternalSql_dsl.g:719:1: ( ruleFunctions EOF )
            // InternalSql_dsl.g:720:1: ruleFunctions EOF
            {
             before(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctions();

            state._fsp--;

             after(grammarAccess.getFunctionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalSql_dsl.g:727:1: ruleFunctions : ( ( rule__Functions__Alternatives ) ) ;
    public final void ruleFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:731:2: ( ( ( rule__Functions__Alternatives ) ) )
            // InternalSql_dsl.g:732:2: ( ( rule__Functions__Alternatives ) )
            {
            // InternalSql_dsl.g:732:2: ( ( rule__Functions__Alternatives ) )
            // InternalSql_dsl.g:733:3: ( rule__Functions__Alternatives )
            {
             before(grammarAccess.getFunctionsAccess().getAlternatives()); 
            // InternalSql_dsl.g:734:3: ( rule__Functions__Alternatives )
            // InternalSql_dsl.g:734:4: rule__Functions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Functions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleCountFunction"
    // InternalSql_dsl.g:743:1: entryRuleCountFunction : ruleCountFunction EOF ;
    public final void entryRuleCountFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:744:1: ( ruleCountFunction EOF )
            // InternalSql_dsl.g:745:1: ruleCountFunction EOF
            {
             before(grammarAccess.getCountFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleCountFunction();

            state._fsp--;

             after(grammarAccess.getCountFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCountFunction"


    // $ANTLR start "ruleCountFunction"
    // InternalSql_dsl.g:752:1: ruleCountFunction : ( ( rule__CountFunction__Group__0 ) ) ;
    public final void ruleCountFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:756:2: ( ( ( rule__CountFunction__Group__0 ) ) )
            // InternalSql_dsl.g:757:2: ( ( rule__CountFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:757:2: ( ( rule__CountFunction__Group__0 ) )
            // InternalSql_dsl.g:758:3: ( rule__CountFunction__Group__0 )
            {
             before(grammarAccess.getCountFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:759:3: ( rule__CountFunction__Group__0 )
            // InternalSql_dsl.g:759:4: rule__CountFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountFunction"


    // $ANTLR start "entryRuleAvgFunction"
    // InternalSql_dsl.g:768:1: entryRuleAvgFunction : ruleAvgFunction EOF ;
    public final void entryRuleAvgFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:769:1: ( ruleAvgFunction EOF )
            // InternalSql_dsl.g:770:1: ruleAvgFunction EOF
            {
             before(grammarAccess.getAvgFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleAvgFunction();

            state._fsp--;

             after(grammarAccess.getAvgFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAvgFunction"


    // $ANTLR start "ruleAvgFunction"
    // InternalSql_dsl.g:777:1: ruleAvgFunction : ( ( rule__AvgFunction__Group__0 ) ) ;
    public final void ruleAvgFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:781:2: ( ( ( rule__AvgFunction__Group__0 ) ) )
            // InternalSql_dsl.g:782:2: ( ( rule__AvgFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:782:2: ( ( rule__AvgFunction__Group__0 ) )
            // InternalSql_dsl.g:783:3: ( rule__AvgFunction__Group__0 )
            {
             before(grammarAccess.getAvgFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:784:3: ( rule__AvgFunction__Group__0 )
            // InternalSql_dsl.g:784:4: rule__AvgFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvgFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAvgFunction"


    // $ANTLR start "entryRuleSumFunction"
    // InternalSql_dsl.g:793:1: entryRuleSumFunction : ruleSumFunction EOF ;
    public final void entryRuleSumFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:794:1: ( ruleSumFunction EOF )
            // InternalSql_dsl.g:795:1: ruleSumFunction EOF
            {
             before(grammarAccess.getSumFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleSumFunction();

            state._fsp--;

             after(grammarAccess.getSumFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSumFunction"


    // $ANTLR start "ruleSumFunction"
    // InternalSql_dsl.g:802:1: ruleSumFunction : ( ( rule__SumFunction__Group__0 ) ) ;
    public final void ruleSumFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:806:2: ( ( ( rule__SumFunction__Group__0 ) ) )
            // InternalSql_dsl.g:807:2: ( ( rule__SumFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:807:2: ( ( rule__SumFunction__Group__0 ) )
            // InternalSql_dsl.g:808:3: ( rule__SumFunction__Group__0 )
            {
             before(grammarAccess.getSumFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:809:3: ( rule__SumFunction__Group__0 )
            // InternalSql_dsl.g:809:4: rule__SumFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSumFunction"


    // $ANTLR start "entryRuleMinFunction"
    // InternalSql_dsl.g:818:1: entryRuleMinFunction : ruleMinFunction EOF ;
    public final void entryRuleMinFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:819:1: ( ruleMinFunction EOF )
            // InternalSql_dsl.g:820:1: ruleMinFunction EOF
            {
             before(grammarAccess.getMinFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleMinFunction();

            state._fsp--;

             after(grammarAccess.getMinFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinFunction"


    // $ANTLR start "ruleMinFunction"
    // InternalSql_dsl.g:827:1: ruleMinFunction : ( ( rule__MinFunction__Group__0 ) ) ;
    public final void ruleMinFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:831:2: ( ( ( rule__MinFunction__Group__0 ) ) )
            // InternalSql_dsl.g:832:2: ( ( rule__MinFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:832:2: ( ( rule__MinFunction__Group__0 ) )
            // InternalSql_dsl.g:833:3: ( rule__MinFunction__Group__0 )
            {
             before(grammarAccess.getMinFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:834:3: ( rule__MinFunction__Group__0 )
            // InternalSql_dsl.g:834:4: rule__MinFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinFunction"


    // $ANTLR start "entryRuleMaxFunction"
    // InternalSql_dsl.g:843:1: entryRuleMaxFunction : ruleMaxFunction EOF ;
    public final void entryRuleMaxFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:844:1: ( ruleMaxFunction EOF )
            // InternalSql_dsl.g:845:1: ruleMaxFunction EOF
            {
             before(grammarAccess.getMaxFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxFunction();

            state._fsp--;

             after(grammarAccess.getMaxFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaxFunction"


    // $ANTLR start "ruleMaxFunction"
    // InternalSql_dsl.g:852:1: ruleMaxFunction : ( ( rule__MaxFunction__Group__0 ) ) ;
    public final void ruleMaxFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:856:2: ( ( ( rule__MaxFunction__Group__0 ) ) )
            // InternalSql_dsl.g:857:2: ( ( rule__MaxFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:857:2: ( ( rule__MaxFunction__Group__0 ) )
            // InternalSql_dsl.g:858:3: ( rule__MaxFunction__Group__0 )
            {
             before(grammarAccess.getMaxFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:859:3: ( rule__MaxFunction__Group__0 )
            // InternalSql_dsl.g:859:4: rule__MaxFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxFunction"


    // $ANTLR start "ruleDataStructureType"
    // InternalSql_dsl.g:868:1: ruleDataStructureType : ( ( rule__DataStructureType__Alternatives ) ) ;
    public final void ruleDataStructureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:872:1: ( ( ( rule__DataStructureType__Alternatives ) ) )
            // InternalSql_dsl.g:873:2: ( ( rule__DataStructureType__Alternatives ) )
            {
            // InternalSql_dsl.g:873:2: ( ( rule__DataStructureType__Alternatives ) )
            // InternalSql_dsl.g:874:3: ( rule__DataStructureType__Alternatives )
            {
             before(grammarAccess.getDataStructureTypeAccess().getAlternatives()); 
            // InternalSql_dsl.g:875:3: ( rule__DataStructureType__Alternatives )
            // InternalSql_dsl.g:875:4: rule__DataStructureType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataStructureType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataStructureTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataStructureType"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalSql_dsl.g:883:1: rule__Statement__Alternatives : ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) | ( ruleVariableDeclarationStatement ) | ( ruleSelectStatement ) | ( ruleDeleteTableStatement ) | ( ruleUpdateTableStatement ) | ( ruleFunctions ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:887:1: ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) | ( ruleVariableDeclarationStatement ) | ( ruleSelectStatement ) | ( ruleDeleteTableStatement ) | ( ruleUpdateTableStatement ) | ( ruleFunctions ) )
            int alt3=10;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSql_dsl.g:888:2: ( ruleDatabaseDeclarationStatement )
                    {
                    // InternalSql_dsl.g:888:2: ( ruleDatabaseDeclarationStatement )
                    // InternalSql_dsl.g:889:3: ruleDatabaseDeclarationStatement
                    {
                     before(grammarAccess.getStatementAccess().getDatabaseDeclarationStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDatabaseDeclarationStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDatabaseDeclarationStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:894:2: ( ruleCreateTableStatement )
                    {
                    // InternalSql_dsl.g:894:2: ( ruleCreateTableStatement )
                    // InternalSql_dsl.g:895:3: ruleCreateTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:900:2: ( ruleDropTableStatement )
                    {
                    // InternalSql_dsl.g:900:2: ( ruleDropTableStatement )
                    // InternalSql_dsl.g:901:3: ruleDropTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getDropTableStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDropTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDropTableStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:906:2: ( ruleTruncateTableStatement )
                    {
                    // InternalSql_dsl.g:906:2: ( ruleTruncateTableStatement )
                    // InternalSql_dsl.g:907:3: ruleTruncateTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getTruncateTableStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTruncateTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTruncateTableStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:912:2: ( ruleAlterTableStatement )
                    {
                    // InternalSql_dsl.g:912:2: ( ruleAlterTableStatement )
                    // InternalSql_dsl.g:913:3: ruleAlterTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getAlterTableStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAlterTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAlterTableStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:918:2: ( ruleVariableDeclarationStatement )
                    {
                    // InternalSql_dsl.g:918:2: ( ruleVariableDeclarationStatement )
                    // InternalSql_dsl.g:919:3: ruleVariableDeclarationStatement
                    {
                     before(grammarAccess.getStatementAccess().getVariableDeclarationStatementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclarationStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableDeclarationStatementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:924:2: ( ruleSelectStatement )
                    {
                    // InternalSql_dsl.g:924:2: ( ruleSelectStatement )
                    // InternalSql_dsl.g:925:3: ruleSelectStatement
                    {
                     before(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSql_dsl.g:930:2: ( ruleDeleteTableStatement )
                    {
                    // InternalSql_dsl.g:930:2: ( ruleDeleteTableStatement )
                    // InternalSql_dsl.g:931:3: ruleDeleteTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getDeleteTableStatementParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDeleteTableStatementParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSql_dsl.g:936:2: ( ruleUpdateTableStatement )
                    {
                    // InternalSql_dsl.g:936:2: ( ruleUpdateTableStatement )
                    // InternalSql_dsl.g:937:3: ruleUpdateTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getUpdateTableStatementParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdateTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getUpdateTableStatementParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSql_dsl.g:942:2: ( ruleFunctions )
                    {
                    // InternalSql_dsl.g:942:2: ( ruleFunctions )
                    // InternalSql_dsl.g:943:3: ruleFunctions
                    {
                     before(grammarAccess.getStatementAccess().getFunctionsParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctions();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionsParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__SelectStatement__Alternatives_1"
    // InternalSql_dsl.g:952:1: rule__SelectStatement__Alternatives_1 : ( ( '*' ) | ( ( rule__SelectStatement__Group_1_1__0 )* ) );
    public final void rule__SelectStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:956:1: ( ( '*' ) | ( ( rule__SelectStatement__Group_1_1__0 )* ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSql_dsl.g:957:2: ( '*' )
                    {
                    // InternalSql_dsl.g:957:2: ( '*' )
                    // InternalSql_dsl.g:958:3: '*'
                    {
                     before(grammarAccess.getSelectStatementAccess().getAsteriskKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSelectStatementAccess().getAsteriskKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:963:2: ( ( rule__SelectStatement__Group_1_1__0 )* )
                    {
                    // InternalSql_dsl.g:963:2: ( ( rule__SelectStatement__Group_1_1__0 )* )
                    // InternalSql_dsl.g:964:3: ( rule__SelectStatement__Group_1_1__0 )*
                    {
                     before(grammarAccess.getSelectStatementAccess().getGroup_1_1()); 
                    // InternalSql_dsl.g:965:3: ( rule__SelectStatement__Group_1_1__0 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSql_dsl.g:965:4: rule__SelectStatement__Group_1_1__0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__SelectStatement__Group_1_1__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getSelectStatementAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Alternatives_1"


    // $ANTLR start "rule__FromAndWhereClauses__Alternatives_2_2_0"
    // InternalSql_dsl.g:973:1: rule__FromAndWhereClauses__Alternatives_2_2_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__FromAndWhereClauses__Alternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:977:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSql_dsl.g:978:2: ( 'AND' )
                    {
                    // InternalSql_dsl.g:978:2: ( 'AND' )
                    // InternalSql_dsl.g:979:3: 'AND'
                    {
                     before(grammarAccess.getFromAndWhereClausesAccess().getANDKeyword_2_2_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFromAndWhereClausesAccess().getANDKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:984:2: ( 'OR' )
                    {
                    // InternalSql_dsl.g:984:2: ( 'OR' )
                    // InternalSql_dsl.g:985:3: 'OR'
                    {
                     before(grammarAccess.getFromAndWhereClausesAccess().getORKeyword_2_2_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getFromAndWhereClausesAccess().getORKeyword_2_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Alternatives_2_2_0"


    // $ANTLR start "rule__WhereDec__SignAlternatives_1_0"
    // InternalSql_dsl.g:994:1: rule__WhereDec__SignAlternatives_1_0 : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '!=' ) | ( 'LIKE' ) );
    public final void rule__WhereDec__SignAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:998:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '!=' ) | ( 'LIKE' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
                }
                break;
            case 20:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSql_dsl.g:999:2: ( '=' )
                    {
                    // InternalSql_dsl.g:999:2: ( '=' )
                    // InternalSql_dsl.g:1000:3: '='
                    {
                     before(grammarAccess.getWhereDecAccess().getSignEqualsSignKeyword_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getSignEqualsSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1005:2: ( '<' )
                    {
                    // InternalSql_dsl.g:1005:2: ( '<' )
                    // InternalSql_dsl.g:1006:3: '<'
                    {
                     before(grammarAccess.getWhereDecAccess().getSignLessThanSignKeyword_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getSignLessThanSignKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1011:2: ( '<=' )
                    {
                    // InternalSql_dsl.g:1011:2: ( '<=' )
                    // InternalSql_dsl.g:1012:3: '<='
                    {
                     before(grammarAccess.getWhereDecAccess().getSignLessThanSignEqualsSignKeyword_1_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getSignLessThanSignEqualsSignKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:1017:2: ( '>' )
                    {
                    // InternalSql_dsl.g:1017:2: ( '>' )
                    // InternalSql_dsl.g:1018:3: '>'
                    {
                     before(grammarAccess.getWhereDecAccess().getSignGreaterThanSignKeyword_1_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getSignGreaterThanSignKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:1023:2: ( '>=' )
                    {
                    // InternalSql_dsl.g:1023:2: ( '>=' )
                    // InternalSql_dsl.g:1024:3: '>='
                    {
                     before(grammarAccess.getWhereDecAccess().getSignGreaterThanSignEqualsSignKeyword_1_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getSignGreaterThanSignEqualsSignKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:1029:2: ( '!=' )
                    {
                    // InternalSql_dsl.g:1029:2: ( '!=' )
                    // InternalSql_dsl.g:1030:3: '!='
                    {
                     before(grammarAccess.getWhereDecAccess().getSignExclamationMarkEqualsSignKeyword_1_0_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getSignExclamationMarkEqualsSignKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:1035:2: ( 'LIKE' )
                    {
                    // InternalSql_dsl.g:1035:2: ( 'LIKE' )
                    // InternalSql_dsl.g:1036:3: 'LIKE'
                    {
                     before(grammarAccess.getWhereDecAccess().getSignLIKEKeyword_1_0_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getSignLIKEKeyword_1_0_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__SignAlternatives_1_0"


    // $ANTLR start "rule__WhereDec__RightOperandAlternatives_2_0"
    // InternalSql_dsl.g:1045:1: rule__WhereDec__RightOperandAlternatives_2_0 : ( ( ruleRightOperandOne ) | ( ruleRightOperandTwo ) | ( ruleRightOperandThree ) );
    public final void rule__WhereDec__RightOperandAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1049:1: ( ( ruleRightOperandOne ) | ( ruleRightOperandTwo ) | ( ruleRightOperandThree ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSql_dsl.g:1050:2: ( ruleRightOperandOne )
                    {
                    // InternalSql_dsl.g:1050:2: ( ruleRightOperandOne )
                    // InternalSql_dsl.g:1051:3: ruleRightOperandOne
                    {
                     before(grammarAccess.getWhereDecAccess().getRightOperandRightOperandOneParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRightOperandOne();

                    state._fsp--;

                     after(grammarAccess.getWhereDecAccess().getRightOperandRightOperandOneParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1056:2: ( ruleRightOperandTwo )
                    {
                    // InternalSql_dsl.g:1056:2: ( ruleRightOperandTwo )
                    // InternalSql_dsl.g:1057:3: ruleRightOperandTwo
                    {
                     before(grammarAccess.getWhereDecAccess().getRightOperandRightOperandTwoParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightOperandTwo();

                    state._fsp--;

                     after(grammarAccess.getWhereDecAccess().getRightOperandRightOperandTwoParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1062:2: ( ruleRightOperandThree )
                    {
                    // InternalSql_dsl.g:1062:2: ( ruleRightOperandThree )
                    // InternalSql_dsl.g:1063:3: ruleRightOperandThree
                    {
                     before(grammarAccess.getWhereDecAccess().getRightOperandRightOperandThreeParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRightOperandThree();

                    state._fsp--;

                     after(grammarAccess.getWhereDecAccess().getRightOperandRightOperandThreeParserRuleCall_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__RightOperandAlternatives_2_0"


    // $ANTLR start "rule__TableDeclaration__AttributesAlternatives_4_0"
    // InternalSql_dsl.g:1072:1: rule__TableDeclaration__AttributesAlternatives_4_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TableDeclaration__AttributesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1076:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case 40:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSql_dsl.g:1077:2: ( ruleColumnDeclaration )
                    {
                    // InternalSql_dsl.g:1077:2: ( ruleColumnDeclaration )
                    // InternalSql_dsl.g:1078:3: ruleColumnDeclaration
                    {
                     before(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1083:2: ( rulePrimaryKey )
                    {
                    // InternalSql_dsl.g:1083:2: ( rulePrimaryKey )
                    // InternalSql_dsl.g:1084:3: rulePrimaryKey
                    {
                     before(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryKey();

                    state._fsp--;

                     after(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1089:2: ( ruleForeignKey )
                    {
                    // InternalSql_dsl.g:1089:2: ( ruleForeignKey )
                    // InternalSql_dsl.g:1090:3: ruleForeignKey
                    {
                     before(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForeignKey();

                    state._fsp--;

                     after(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_4_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__AttributesAlternatives_4_0"


    // $ANTLR start "rule__TableDeclaration__AttributesAlternatives_5_1_0"
    // InternalSql_dsl.g:1099:1: rule__TableDeclaration__AttributesAlternatives_5_1_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TableDeclaration__AttributesAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1103:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 40:
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
                    // InternalSql_dsl.g:1104:2: ( ruleColumnDeclaration )
                    {
                    // InternalSql_dsl.g:1104:2: ( ruleColumnDeclaration )
                    // InternalSql_dsl.g:1105:3: ruleColumnDeclaration
                    {
                     before(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_5_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTableDeclarationAccess().getAttributesColumnDeclarationParserRuleCall_5_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1110:2: ( rulePrimaryKey )
                    {
                    // InternalSql_dsl.g:1110:2: ( rulePrimaryKey )
                    // InternalSql_dsl.g:1111:3: rulePrimaryKey
                    {
                     before(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_5_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryKey();

                    state._fsp--;

                     after(grammarAccess.getTableDeclarationAccess().getAttributesPrimaryKeyParserRuleCall_5_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1116:2: ( ruleForeignKey )
                    {
                    // InternalSql_dsl.g:1116:2: ( ruleForeignKey )
                    // InternalSql_dsl.g:1117:3: ruleForeignKey
                    {
                     before(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_5_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForeignKey();

                    state._fsp--;

                     after(grammarAccess.getTableDeclarationAccess().getAttributesForeignKeyParserRuleCall_5_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__AttributesAlternatives_5_1_0"


    // $ANTLR start "rule__UpdateTableStatement__Alternatives_5_2_0"
    // InternalSql_dsl.g:1126:1: rule__UpdateTableStatement__Alternatives_5_2_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__UpdateTableStatement__Alternatives_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1130:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            else if ( (LA11_0==13) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSql_dsl.g:1131:2: ( 'AND' )
                    {
                    // InternalSql_dsl.g:1131:2: ( 'AND' )
                    // InternalSql_dsl.g:1132:3: 'AND'
                    {
                     before(grammarAccess.getUpdateTableStatementAccess().getANDKeyword_5_2_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getUpdateTableStatementAccess().getANDKeyword_5_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1137:2: ( 'OR' )
                    {
                    // InternalSql_dsl.g:1137:2: ( 'OR' )
                    // InternalSql_dsl.g:1138:3: 'OR'
                    {
                     before(grammarAccess.getUpdateTableStatementAccess().getORKeyword_5_2_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getUpdateTableStatementAccess().getORKeyword_5_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Alternatives_5_2_0"


    // $ANTLR start "rule__SetClause__Alternatives_2"
    // InternalSql_dsl.g:1147:1: rule__SetClause__Alternatives_2 : ( ( ( rule__SetClause__Group_2_0__0 ) ) | ( ( rule__SetClause__ValAssignment_2_1 ) ) );
    public final void rule__SetClause__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1151:1: ( ( ( rule__SetClause__Group_2_0__0 ) ) | ( ( rule__SetClause__ValAssignment_2_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSql_dsl.g:1152:2: ( ( rule__SetClause__Group_2_0__0 ) )
                    {
                    // InternalSql_dsl.g:1152:2: ( ( rule__SetClause__Group_2_0__0 ) )
                    // InternalSql_dsl.g:1153:3: ( rule__SetClause__Group_2_0__0 )
                    {
                     before(grammarAccess.getSetClauseAccess().getGroup_2_0()); 
                    // InternalSql_dsl.g:1154:3: ( rule__SetClause__Group_2_0__0 )
                    // InternalSql_dsl.g:1154:4: rule__SetClause__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetClause__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetClauseAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1158:2: ( ( rule__SetClause__ValAssignment_2_1 ) )
                    {
                    // InternalSql_dsl.g:1158:2: ( ( rule__SetClause__ValAssignment_2_1 ) )
                    // InternalSql_dsl.g:1159:3: ( rule__SetClause__ValAssignment_2_1 )
                    {
                     before(grammarAccess.getSetClauseAccess().getValAssignment_2_1()); 
                    // InternalSql_dsl.g:1160:3: ( rule__SetClause__ValAssignment_2_1 )
                    // InternalSql_dsl.g:1160:4: rule__SetClause__ValAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetClause__ValAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetClauseAccess().getValAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Alternatives_2"


    // $ANTLR start "rule__AlterTableStatement__AddDropUpdateAlternatives_3_0"
    // InternalSql_dsl.g:1168:1: rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 : ( ( ruleAlterDropStatement ) | ( ruleAlterAddStatement ) | ( ruleAlterUpdateStatement ) );
    public final void rule__AlterTableStatement__AddDropUpdateAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1172:1: ( ( ruleAlterDropStatement ) | ( ruleAlterAddStatement ) | ( ruleAlterUpdateStatement ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 49:
                {
                alt13=2;
                }
                break;
            case 47:
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
                    // InternalSql_dsl.g:1173:2: ( ruleAlterDropStatement )
                    {
                    // InternalSql_dsl.g:1173:2: ( ruleAlterDropStatement )
                    // InternalSql_dsl.g:1174:3: ruleAlterDropStatement
                    {
                     before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlterDropStatementParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAlterDropStatement();

                    state._fsp--;

                     after(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlterDropStatementParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1179:2: ( ruleAlterAddStatement )
                    {
                    // InternalSql_dsl.g:1179:2: ( ruleAlterAddStatement )
                    // InternalSql_dsl.g:1180:3: ruleAlterAddStatement
                    {
                     before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlterAddStatementParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAlterAddStatement();

                    state._fsp--;

                     after(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlterAddStatementParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1185:2: ( ruleAlterUpdateStatement )
                    {
                    // InternalSql_dsl.g:1185:2: ( ruleAlterUpdateStatement )
                    // InternalSql_dsl.g:1186:3: ruleAlterUpdateStatement
                    {
                     before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlterUpdateStatementParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAlterUpdateStatement();

                    state._fsp--;

                     after(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlterUpdateStatementParserRuleCall_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__AddDropUpdateAlternatives_3_0"


    // $ANTLR start "rule__Functions__Alternatives"
    // InternalSql_dsl.g:1195:1: rule__Functions__Alternatives : ( ( ruleCountFunction ) | ( ruleAvgFunction ) | ( ruleSumFunction ) | ( ruleMinFunction ) | ( ruleMaxFunction ) );
    public final void rule__Functions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1199:1: ( ( ruleCountFunction ) | ( ruleAvgFunction ) | ( ruleSumFunction ) | ( ruleMinFunction ) | ( ruleMaxFunction ) )
            int alt14=5;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                switch ( input.LA(2) ) {
                case 52:
                    {
                    alt14=1;
                    }
                    break;
                case 55:
                    {
                    alt14=4;
                    }
                    break;
                case 53:
                    {
                    alt14=2;
                    }
                    break;
                case 56:
                    {
                    alt14=5;
                    }
                    break;
                case 54:
                    {
                    alt14=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSql_dsl.g:1200:2: ( ruleCountFunction )
                    {
                    // InternalSql_dsl.g:1200:2: ( ruleCountFunction )
                    // InternalSql_dsl.g:1201:3: ruleCountFunction
                    {
                     before(grammarAccess.getFunctionsAccess().getCountFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCountFunction();

                    state._fsp--;

                     after(grammarAccess.getFunctionsAccess().getCountFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1206:2: ( ruleAvgFunction )
                    {
                    // InternalSql_dsl.g:1206:2: ( ruleAvgFunction )
                    // InternalSql_dsl.g:1207:3: ruleAvgFunction
                    {
                     before(grammarAccess.getFunctionsAccess().getAvgFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAvgFunction();

                    state._fsp--;

                     after(grammarAccess.getFunctionsAccess().getAvgFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1212:2: ( ruleSumFunction )
                    {
                    // InternalSql_dsl.g:1212:2: ( ruleSumFunction )
                    // InternalSql_dsl.g:1213:3: ruleSumFunction
                    {
                     before(grammarAccess.getFunctionsAccess().getSumFunctionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSumFunction();

                    state._fsp--;

                     after(grammarAccess.getFunctionsAccess().getSumFunctionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:1218:2: ( ruleMinFunction )
                    {
                    // InternalSql_dsl.g:1218:2: ( ruleMinFunction )
                    // InternalSql_dsl.g:1219:3: ruleMinFunction
                    {
                     before(grammarAccess.getFunctionsAccess().getMinFunctionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMinFunction();

                    state._fsp--;

                     after(grammarAccess.getFunctionsAccess().getMinFunctionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:1224:2: ( ruleMaxFunction )
                    {
                    // InternalSql_dsl.g:1224:2: ( ruleMaxFunction )
                    // InternalSql_dsl.g:1225:3: ruleMaxFunction
                    {
                     before(grammarAccess.getFunctionsAccess().getMaxFunctionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMaxFunction();

                    state._fsp--;

                     after(grammarAccess.getFunctionsAccess().getMaxFunctionParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functions__Alternatives"


    // $ANTLR start "rule__DataStructureType__Alternatives"
    // InternalSql_dsl.g:1234:1: rule__DataStructureType__Alternatives : ( ( ( 'varchar' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) );
    public final void rule__DataStructureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1238:1: ( ( ( 'varchar' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt15=1;
                }
                break;
            case 22:
                {
                alt15=2;
                }
                break;
            case 23:
                {
                alt15=3;
                }
                break;
            case 24:
                {
                alt15=4;
                }
                break;
            case 25:
                {
                alt15=5;
                }
                break;
            case 26:
                {
                alt15=6;
                }
                break;
            case 27:
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
                    // InternalSql_dsl.g:1239:2: ( ( 'varchar' ) )
                    {
                    // InternalSql_dsl.g:1239:2: ( ( 'varchar' ) )
                    // InternalSql_dsl.g:1240:3: ( 'varchar' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 
                    // InternalSql_dsl.g:1241:3: ( 'varchar' )
                    // InternalSql_dsl.g:1241:4: 'varchar'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1245:2: ( ( 'char' ) )
                    {
                    // InternalSql_dsl.g:1245:2: ( ( 'char' ) )
                    // InternalSql_dsl.g:1246:3: ( 'char' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // InternalSql_dsl.g:1247:3: ( 'char' )
                    // InternalSql_dsl.g:1247:4: 'char'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1251:2: ( ( 'date' ) )
                    {
                    // InternalSql_dsl.g:1251:2: ( ( 'date' ) )
                    // InternalSql_dsl.g:1252:3: ( 'date' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2()); 
                    // InternalSql_dsl.g:1253:3: ( 'date' )
                    // InternalSql_dsl.g:1253:4: 'date'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:1257:2: ( ( 'int' ) )
                    {
                    // InternalSql_dsl.g:1257:2: ( ( 'int' ) )
                    // InternalSql_dsl.g:1258:3: ( 'int' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    // InternalSql_dsl.g:1259:3: ( 'int' )
                    // InternalSql_dsl.g:1259:4: 'int'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:1263:2: ( ( 'float' ) )
                    {
                    // InternalSql_dsl.g:1263:2: ( ( 'float' ) )
                    // InternalSql_dsl.g:1264:3: ( 'float' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // InternalSql_dsl.g:1265:3: ( 'float' )
                    // InternalSql_dsl.g:1265:4: 'float'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:1269:2: ( ( 'time' ) )
                    {
                    // InternalSql_dsl.g:1269:2: ( ( 'time' ) )
                    // InternalSql_dsl.g:1270:3: ( 'time' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5()); 
                    // InternalSql_dsl.g:1271:3: ( 'time' )
                    // InternalSql_dsl.g:1271:4: 'time'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:1275:2: ( ( 'text' ) )
                    {
                    // InternalSql_dsl.g:1275:2: ( ( 'text' ) )
                    // InternalSql_dsl.g:1276:3: ( 'text' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getTEXTEnumLiteralDeclaration_6()); 
                    // InternalSql_dsl.g:1277:3: ( 'text' )
                    // InternalSql_dsl.g:1277:4: 'text'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getTEXTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructureType__Alternatives"


    // $ANTLR start "rule__SelectStatement__Group__0"
    // InternalSql_dsl.g:1285:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1289:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalSql_dsl.g:1290:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SelectStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__0"


    // $ANTLR start "rule__SelectStatement__Group__0__Impl"
    // InternalSql_dsl.g:1297:1: rule__SelectStatement__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1301:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:1302:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:1302:1: ( 'SELECT' )
            // InternalSql_dsl.g:1303:2: 'SELECT'
            {
             before(grammarAccess.getSelectStatementAccess().getSELECTKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group__1"
    // InternalSql_dsl.g:1312:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1316:1: ( rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 )
            // InternalSql_dsl.g:1317:2: rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SelectStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__1"


    // $ANTLR start "rule__SelectStatement__Group__1__Impl"
    // InternalSql_dsl.g:1324:1: rule__SelectStatement__Group__1__Impl : ( ( rule__SelectStatement__Alternatives_1 ) ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1328:1: ( ( ( rule__SelectStatement__Alternatives_1 ) ) )
            // InternalSql_dsl.g:1329:1: ( ( rule__SelectStatement__Alternatives_1 ) )
            {
            // InternalSql_dsl.g:1329:1: ( ( rule__SelectStatement__Alternatives_1 ) )
            // InternalSql_dsl.g:1330:2: ( rule__SelectStatement__Alternatives_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getAlternatives_1()); 
            // InternalSql_dsl.g:1331:2: ( rule__SelectStatement__Alternatives_1 )
            // InternalSql_dsl.g:1331:3: rule__SelectStatement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group__2"
    // InternalSql_dsl.g:1339:1: rule__SelectStatement__Group__2 : rule__SelectStatement__Group__2__Impl ;
    public final void rule__SelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1343:1: ( rule__SelectStatement__Group__2__Impl )
            // InternalSql_dsl.g:1344:2: rule__SelectStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__2"


    // $ANTLR start "rule__SelectStatement__Group__2__Impl"
    // InternalSql_dsl.g:1350:1: rule__SelectStatement__Group__2__Impl : ( ( rule__SelectStatement__XAssignment_2 ) ) ;
    public final void rule__SelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1354:1: ( ( ( rule__SelectStatement__XAssignment_2 ) ) )
            // InternalSql_dsl.g:1355:1: ( ( rule__SelectStatement__XAssignment_2 ) )
            {
            // InternalSql_dsl.g:1355:1: ( ( rule__SelectStatement__XAssignment_2 ) )
            // InternalSql_dsl.g:1356:2: ( rule__SelectStatement__XAssignment_2 )
            {
             before(grammarAccess.getSelectStatementAccess().getXAssignment_2()); 
            // InternalSql_dsl.g:1357:2: ( rule__SelectStatement__XAssignment_2 )
            // InternalSql_dsl.g:1357:3: rule__SelectStatement__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1_1__0"
    // InternalSql_dsl.g:1366:1: rule__SelectStatement__Group_1_1__0 : rule__SelectStatement__Group_1_1__0__Impl rule__SelectStatement__Group_1_1__1 ;
    public final void rule__SelectStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1370:1: ( rule__SelectStatement__Group_1_1__0__Impl rule__SelectStatement__Group_1_1__1 )
            // InternalSql_dsl.g:1371:2: rule__SelectStatement__Group_1_1__0__Impl rule__SelectStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectStatement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1_1__0"


    // $ANTLR start "rule__SelectStatement__Group_1_1__0__Impl"
    // InternalSql_dsl.g:1378:1: rule__SelectStatement__Group_1_1__0__Impl : ( ( rule__SelectStatement__ColumnAssignment_1_1_0 ) ) ;
    public final void rule__SelectStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1382:1: ( ( ( rule__SelectStatement__ColumnAssignment_1_1_0 ) ) )
            // InternalSql_dsl.g:1383:1: ( ( rule__SelectStatement__ColumnAssignment_1_1_0 ) )
            {
            // InternalSql_dsl.g:1383:1: ( ( rule__SelectStatement__ColumnAssignment_1_1_0 ) )
            // InternalSql_dsl.g:1384:2: ( rule__SelectStatement__ColumnAssignment_1_1_0 )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnAssignment_1_1_0()); 
            // InternalSql_dsl.g:1385:2: ( rule__SelectStatement__ColumnAssignment_1_1_0 )
            // InternalSql_dsl.g:1385:3: rule__SelectStatement__ColumnAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__ColumnAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getColumnAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1_1__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1_1__1"
    // InternalSql_dsl.g:1393:1: rule__SelectStatement__Group_1_1__1 : rule__SelectStatement__Group_1_1__1__Impl ;
    public final void rule__SelectStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1397:1: ( rule__SelectStatement__Group_1_1__1__Impl )
            // InternalSql_dsl.g:1398:2: rule__SelectStatement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1_1__1"


    // $ANTLR start "rule__SelectStatement__Group_1_1__1__Impl"
    // InternalSql_dsl.g:1404:1: rule__SelectStatement__Group_1_1__1__Impl : ( ( rule__SelectStatement__Group_1_1_1__0 )* ) ;
    public final void rule__SelectStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1408:1: ( ( ( rule__SelectStatement__Group_1_1_1__0 )* ) )
            // InternalSql_dsl.g:1409:1: ( ( rule__SelectStatement__Group_1_1_1__0 )* )
            {
            // InternalSql_dsl.g:1409:1: ( ( rule__SelectStatement__Group_1_1_1__0 )* )
            // InternalSql_dsl.g:1410:2: ( rule__SelectStatement__Group_1_1_1__0 )*
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_1_1_1()); 
            // InternalSql_dsl.g:1411:2: ( rule__SelectStatement__Group_1_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSql_dsl.g:1411:3: rule__SelectStatement__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SelectStatement__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSelectStatementAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1_1__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1_1_1__0"
    // InternalSql_dsl.g:1420:1: rule__SelectStatement__Group_1_1_1__0 : rule__SelectStatement__Group_1_1_1__0__Impl rule__SelectStatement__Group_1_1_1__1 ;
    public final void rule__SelectStatement__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1424:1: ( rule__SelectStatement__Group_1_1_1__0__Impl rule__SelectStatement__Group_1_1_1__1 )
            // InternalSql_dsl.g:1425:2: rule__SelectStatement__Group_1_1_1__0__Impl rule__SelectStatement__Group_1_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__SelectStatement__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1_1_1__0"


    // $ANTLR start "rule__SelectStatement__Group_1_1_1__0__Impl"
    // InternalSql_dsl.g:1432:1: rule__SelectStatement__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__SelectStatement__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1436:1: ( ( ',' ) )
            // InternalSql_dsl.g:1437:1: ( ',' )
            {
            // InternalSql_dsl.g:1437:1: ( ',' )
            // InternalSql_dsl.g:1438:2: ','
            {
             before(grammarAccess.getSelectStatementAccess().getCommaKeyword_1_1_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getCommaKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1_1_1__1"
    // InternalSql_dsl.g:1447:1: rule__SelectStatement__Group_1_1_1__1 : rule__SelectStatement__Group_1_1_1__1__Impl ;
    public final void rule__SelectStatement__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1451:1: ( rule__SelectStatement__Group_1_1_1__1__Impl )
            // InternalSql_dsl.g:1452:2: rule__SelectStatement__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1_1_1__1"


    // $ANTLR start "rule__SelectStatement__Group_1_1_1__1__Impl"
    // InternalSql_dsl.g:1458:1: rule__SelectStatement__Group_1_1_1__1__Impl : ( ( rule__SelectStatement__ColumnAssignment_1_1_1_1 ) ) ;
    public final void rule__SelectStatement__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1462:1: ( ( ( rule__SelectStatement__ColumnAssignment_1_1_1_1 ) ) )
            // InternalSql_dsl.g:1463:1: ( ( rule__SelectStatement__ColumnAssignment_1_1_1_1 ) )
            {
            // InternalSql_dsl.g:1463:1: ( ( rule__SelectStatement__ColumnAssignment_1_1_1_1 ) )
            // InternalSql_dsl.g:1464:2: ( rule__SelectStatement__ColumnAssignment_1_1_1_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnAssignment_1_1_1_1()); 
            // InternalSql_dsl.g:1465:2: ( rule__SelectStatement__ColumnAssignment_1_1_1_1 )
            // InternalSql_dsl.g:1465:3: rule__SelectStatement__ColumnAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__ColumnAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getColumnAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group__0"
    // InternalSql_dsl.g:1474:1: rule__FromAndWhereClauses__Group__0 : rule__FromAndWhereClauses__Group__0__Impl rule__FromAndWhereClauses__Group__1 ;
    public final void rule__FromAndWhereClauses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1478:1: ( rule__FromAndWhereClauses__Group__0__Impl rule__FromAndWhereClauses__Group__1 )
            // InternalSql_dsl.g:1479:2: rule__FromAndWhereClauses__Group__0__Impl rule__FromAndWhereClauses__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FromAndWhereClauses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group__0"


    // $ANTLR start "rule__FromAndWhereClauses__Group__0__Impl"
    // InternalSql_dsl.g:1486:1: rule__FromAndWhereClauses__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__FromAndWhereClauses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1490:1: ( ( 'FROM' ) )
            // InternalSql_dsl.g:1491:1: ( 'FROM' )
            {
            // InternalSql_dsl.g:1491:1: ( 'FROM' )
            // InternalSql_dsl.g:1492:2: 'FROM'
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getFROMKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFromAndWhereClausesAccess().getFROMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group__0__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group__1"
    // InternalSql_dsl.g:1501:1: rule__FromAndWhereClauses__Group__1 : rule__FromAndWhereClauses__Group__1__Impl rule__FromAndWhereClauses__Group__2 ;
    public final void rule__FromAndWhereClauses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1505:1: ( rule__FromAndWhereClauses__Group__1__Impl rule__FromAndWhereClauses__Group__2 )
            // InternalSql_dsl.g:1506:2: rule__FromAndWhereClauses__Group__1__Impl rule__FromAndWhereClauses__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__FromAndWhereClauses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group__1"


    // $ANTLR start "rule__FromAndWhereClauses__Group__1__Impl"
    // InternalSql_dsl.g:1513:1: rule__FromAndWhereClauses__Group__1__Impl : ( ( rule__FromAndWhereClauses__TableAssignment_1 ) ) ;
    public final void rule__FromAndWhereClauses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1517:1: ( ( ( rule__FromAndWhereClauses__TableAssignment_1 ) ) )
            // InternalSql_dsl.g:1518:1: ( ( rule__FromAndWhereClauses__TableAssignment_1 ) )
            {
            // InternalSql_dsl.g:1518:1: ( ( rule__FromAndWhereClauses__TableAssignment_1 ) )
            // InternalSql_dsl.g:1519:2: ( rule__FromAndWhereClauses__TableAssignment_1 )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getTableAssignment_1()); 
            // InternalSql_dsl.g:1520:2: ( rule__FromAndWhereClauses__TableAssignment_1 )
            // InternalSql_dsl.g:1520:3: rule__FromAndWhereClauses__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__TableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAndWhereClausesAccess().getTableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group__1__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group__2"
    // InternalSql_dsl.g:1528:1: rule__FromAndWhereClauses__Group__2 : rule__FromAndWhereClauses__Group__2__Impl ;
    public final void rule__FromAndWhereClauses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1532:1: ( rule__FromAndWhereClauses__Group__2__Impl )
            // InternalSql_dsl.g:1533:2: rule__FromAndWhereClauses__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group__2"


    // $ANTLR start "rule__FromAndWhereClauses__Group__2__Impl"
    // InternalSql_dsl.g:1539:1: rule__FromAndWhereClauses__Group__2__Impl : ( ( rule__FromAndWhereClauses__Group_2__0 )? ) ;
    public final void rule__FromAndWhereClauses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1543:1: ( ( ( rule__FromAndWhereClauses__Group_2__0 )? ) )
            // InternalSql_dsl.g:1544:1: ( ( rule__FromAndWhereClauses__Group_2__0 )? )
            {
            // InternalSql_dsl.g:1544:1: ( ( rule__FromAndWhereClauses__Group_2__0 )? )
            // InternalSql_dsl.g:1545:2: ( rule__FromAndWhereClauses__Group_2__0 )?
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getGroup_2()); 
            // InternalSql_dsl.g:1546:2: ( rule__FromAndWhereClauses__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSql_dsl.g:1546:3: rule__FromAndWhereClauses__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FromAndWhereClauses__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFromAndWhereClausesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group__2__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__0"
    // InternalSql_dsl.g:1555:1: rule__FromAndWhereClauses__Group_2__0 : rule__FromAndWhereClauses__Group_2__0__Impl rule__FromAndWhereClauses__Group_2__1 ;
    public final void rule__FromAndWhereClauses__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1559:1: ( rule__FromAndWhereClauses__Group_2__0__Impl rule__FromAndWhereClauses__Group_2__1 )
            // InternalSql_dsl.g:1560:2: rule__FromAndWhereClauses__Group_2__0__Impl rule__FromAndWhereClauses__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__FromAndWhereClauses__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__0"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__0__Impl"
    // InternalSql_dsl.g:1567:1: rule__FromAndWhereClauses__Group_2__0__Impl : ( 'WHERE' ) ;
    public final void rule__FromAndWhereClauses__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1571:1: ( ( 'WHERE' ) )
            // InternalSql_dsl.g:1572:1: ( 'WHERE' )
            {
            // InternalSql_dsl.g:1572:1: ( 'WHERE' )
            // InternalSql_dsl.g:1573:2: 'WHERE'
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getWHEREKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFromAndWhereClausesAccess().getWHEREKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__0__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__1"
    // InternalSql_dsl.g:1582:1: rule__FromAndWhereClauses__Group_2__1 : rule__FromAndWhereClauses__Group_2__1__Impl rule__FromAndWhereClauses__Group_2__2 ;
    public final void rule__FromAndWhereClauses__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1586:1: ( rule__FromAndWhereClauses__Group_2__1__Impl rule__FromAndWhereClauses__Group_2__2 )
            // InternalSql_dsl.g:1587:2: rule__FromAndWhereClauses__Group_2__1__Impl rule__FromAndWhereClauses__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__FromAndWhereClauses__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__1"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__1__Impl"
    // InternalSql_dsl.g:1594:1: rule__FromAndWhereClauses__Group_2__1__Impl : ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) ) ;
    public final void rule__FromAndWhereClauses__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1598:1: ( ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) ) )
            // InternalSql_dsl.g:1599:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) )
            {
            // InternalSql_dsl.g:1599:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) )
            // InternalSql_dsl.g:1600:2: ( rule__FromAndWhereClauses__ZAssignment_2_1 )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_1()); 
            // InternalSql_dsl.g:1601:2: ( rule__FromAndWhereClauses__ZAssignment_2_1 )
            // InternalSql_dsl.g:1601:3: rule__FromAndWhereClauses__ZAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__ZAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__1__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__2"
    // InternalSql_dsl.g:1609:1: rule__FromAndWhereClauses__Group_2__2 : rule__FromAndWhereClauses__Group_2__2__Impl ;
    public final void rule__FromAndWhereClauses__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1613:1: ( rule__FromAndWhereClauses__Group_2__2__Impl )
            // InternalSql_dsl.g:1614:2: rule__FromAndWhereClauses__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__2"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2__2__Impl"
    // InternalSql_dsl.g:1620:1: rule__FromAndWhereClauses__Group_2__2__Impl : ( ( rule__FromAndWhereClauses__Group_2_2__0 )* ) ;
    public final void rule__FromAndWhereClauses__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1624:1: ( ( ( rule__FromAndWhereClauses__Group_2_2__0 )* ) )
            // InternalSql_dsl.g:1625:1: ( ( rule__FromAndWhereClauses__Group_2_2__0 )* )
            {
            // InternalSql_dsl.g:1625:1: ( ( rule__FromAndWhereClauses__Group_2_2__0 )* )
            // InternalSql_dsl.g:1626:2: ( rule__FromAndWhereClauses__Group_2_2__0 )*
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getGroup_2_2()); 
            // InternalSql_dsl.g:1627:2: ( rule__FromAndWhereClauses__Group_2_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=13)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSql_dsl.g:1627:3: rule__FromAndWhereClauses__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FromAndWhereClauses__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFromAndWhereClausesAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2__2__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2_2__0"
    // InternalSql_dsl.g:1636:1: rule__FromAndWhereClauses__Group_2_2__0 : rule__FromAndWhereClauses__Group_2_2__0__Impl rule__FromAndWhereClauses__Group_2_2__1 ;
    public final void rule__FromAndWhereClauses__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1640:1: ( rule__FromAndWhereClauses__Group_2_2__0__Impl rule__FromAndWhereClauses__Group_2_2__1 )
            // InternalSql_dsl.g:1641:2: rule__FromAndWhereClauses__Group_2_2__0__Impl rule__FromAndWhereClauses__Group_2_2__1
            {
            pushFollow(FOLLOW_10);
            rule__FromAndWhereClauses__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2_2__0"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2_2__0__Impl"
    // InternalSql_dsl.g:1648:1: rule__FromAndWhereClauses__Group_2_2__0__Impl : ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) ) ;
    public final void rule__FromAndWhereClauses__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1652:1: ( ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) ) )
            // InternalSql_dsl.g:1653:1: ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) )
            {
            // InternalSql_dsl.g:1653:1: ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) )
            // InternalSql_dsl.g:1654:2: ( rule__FromAndWhereClauses__Alternatives_2_2_0 )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getAlternatives_2_2_0()); 
            // InternalSql_dsl.g:1655:2: ( rule__FromAndWhereClauses__Alternatives_2_2_0 )
            // InternalSql_dsl.g:1655:3: rule__FromAndWhereClauses__Alternatives_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Alternatives_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFromAndWhereClausesAccess().getAlternatives_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2_2__0__Impl"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2_2__1"
    // InternalSql_dsl.g:1663:1: rule__FromAndWhereClauses__Group_2_2__1 : rule__FromAndWhereClauses__Group_2_2__1__Impl ;
    public final void rule__FromAndWhereClauses__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1667:1: ( rule__FromAndWhereClauses__Group_2_2__1__Impl )
            // InternalSql_dsl.g:1668:2: rule__FromAndWhereClauses__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2_2__1"


    // $ANTLR start "rule__FromAndWhereClauses__Group_2_2__1__Impl"
    // InternalSql_dsl.g:1674:1: rule__FromAndWhereClauses__Group_2_2__1__Impl : ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) ) ;
    public final void rule__FromAndWhereClauses__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1678:1: ( ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) ) )
            // InternalSql_dsl.g:1679:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) )
            {
            // InternalSql_dsl.g:1679:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) )
            // InternalSql_dsl.g:1680:2: ( rule__FromAndWhereClauses__ZAssignment_2_2_1 )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_2_1()); 
            // InternalSql_dsl.g:1681:2: ( rule__FromAndWhereClauses__ZAssignment_2_2_1 )
            // InternalSql_dsl.g:1681:3: rule__FromAndWhereClauses__ZAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FromAndWhereClauses__ZAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__Group_2_2__1__Impl"


    // $ANTLR start "rule__WhereDec__Group__0"
    // InternalSql_dsl.g:1690:1: rule__WhereDec__Group__0 : rule__WhereDec__Group__0__Impl rule__WhereDec__Group__1 ;
    public final void rule__WhereDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1694:1: ( rule__WhereDec__Group__0__Impl rule__WhereDec__Group__1 )
            // InternalSql_dsl.g:1695:2: rule__WhereDec__Group__0__Impl rule__WhereDec__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__WhereDec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereDec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__Group__0"


    // $ANTLR start "rule__WhereDec__Group__0__Impl"
    // InternalSql_dsl.g:1702:1: rule__WhereDec__Group__0__Impl : ( ( rule__WhereDec__ColumnAssignment_0 ) ) ;
    public final void rule__WhereDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1706:1: ( ( ( rule__WhereDec__ColumnAssignment_0 ) ) )
            // InternalSql_dsl.g:1707:1: ( ( rule__WhereDec__ColumnAssignment_0 ) )
            {
            // InternalSql_dsl.g:1707:1: ( ( rule__WhereDec__ColumnAssignment_0 ) )
            // InternalSql_dsl.g:1708:2: ( rule__WhereDec__ColumnAssignment_0 )
            {
             before(grammarAccess.getWhereDecAccess().getColumnAssignment_0()); 
            // InternalSql_dsl.g:1709:2: ( rule__WhereDec__ColumnAssignment_0 )
            // InternalSql_dsl.g:1709:3: rule__WhereDec__ColumnAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__ColumnAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWhereDecAccess().getColumnAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__Group__0__Impl"


    // $ANTLR start "rule__WhereDec__Group__1"
    // InternalSql_dsl.g:1717:1: rule__WhereDec__Group__1 : rule__WhereDec__Group__1__Impl rule__WhereDec__Group__2 ;
    public final void rule__WhereDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1721:1: ( rule__WhereDec__Group__1__Impl rule__WhereDec__Group__2 )
            // InternalSql_dsl.g:1722:2: rule__WhereDec__Group__1__Impl rule__WhereDec__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__WhereDec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereDec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__Group__1"


    // $ANTLR start "rule__WhereDec__Group__1__Impl"
    // InternalSql_dsl.g:1729:1: rule__WhereDec__Group__1__Impl : ( ( rule__WhereDec__SignAssignment_1 ) ) ;
    public final void rule__WhereDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1733:1: ( ( ( rule__WhereDec__SignAssignment_1 ) ) )
            // InternalSql_dsl.g:1734:1: ( ( rule__WhereDec__SignAssignment_1 ) )
            {
            // InternalSql_dsl.g:1734:1: ( ( rule__WhereDec__SignAssignment_1 ) )
            // InternalSql_dsl.g:1735:2: ( rule__WhereDec__SignAssignment_1 )
            {
             before(grammarAccess.getWhereDecAccess().getSignAssignment_1()); 
            // InternalSql_dsl.g:1736:2: ( rule__WhereDec__SignAssignment_1 )
            // InternalSql_dsl.g:1736:3: rule__WhereDec__SignAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__SignAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereDecAccess().getSignAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__Group__1__Impl"


    // $ANTLR start "rule__WhereDec__Group__2"
    // InternalSql_dsl.g:1744:1: rule__WhereDec__Group__2 : rule__WhereDec__Group__2__Impl ;
    public final void rule__WhereDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1748:1: ( rule__WhereDec__Group__2__Impl )
            // InternalSql_dsl.g:1749:2: rule__WhereDec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__Group__2"


    // $ANTLR start "rule__WhereDec__Group__2__Impl"
    // InternalSql_dsl.g:1755:1: rule__WhereDec__Group__2__Impl : ( ( rule__WhereDec__RightOperandAssignment_2 ) ) ;
    public final void rule__WhereDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1759:1: ( ( ( rule__WhereDec__RightOperandAssignment_2 ) ) )
            // InternalSql_dsl.g:1760:1: ( ( rule__WhereDec__RightOperandAssignment_2 ) )
            {
            // InternalSql_dsl.g:1760:1: ( ( rule__WhereDec__RightOperandAssignment_2 ) )
            // InternalSql_dsl.g:1761:2: ( rule__WhereDec__RightOperandAssignment_2 )
            {
             before(grammarAccess.getWhereDecAccess().getRightOperandAssignment_2()); 
            // InternalSql_dsl.g:1762:2: ( rule__WhereDec__RightOperandAssignment_2 )
            // InternalSql_dsl.g:1762:3: rule__WhereDec__RightOperandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__RightOperandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereDecAccess().getRightOperandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__Group__2__Impl"


    // $ANTLR start "rule__RightOperandOne__Group__0"
    // InternalSql_dsl.g:1771:1: rule__RightOperandOne__Group__0 : rule__RightOperandOne__Group__0__Impl rule__RightOperandOne__Group__1 ;
    public final void rule__RightOperandOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1775:1: ( rule__RightOperandOne__Group__0__Impl rule__RightOperandOne__Group__1 )
            // InternalSql_dsl.g:1776:2: rule__RightOperandOne__Group__0__Impl rule__RightOperandOne__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RightOperandOne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightOperandOne__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightOperandOne__Group__0"


    // $ANTLR start "rule__RightOperandOne__Group__0__Impl"
    // InternalSql_dsl.g:1783:1: rule__RightOperandOne__Group__0__Impl : ( '#' ) ;
    public final void rule__RightOperandOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1787:1: ( ( '#' ) )
            // InternalSql_dsl.g:1788:1: ( '#' )
            {
            // InternalSql_dsl.g:1788:1: ( '#' )
            // InternalSql_dsl.g:1789:2: '#'
            {
             before(grammarAccess.getRightOperandOneAccess().getNumberSignKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRightOperandOneAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightOperandOne__Group__0__Impl"


    // $ANTLR start "rule__RightOperandOne__Group__1"
    // InternalSql_dsl.g:1798:1: rule__RightOperandOne__Group__1 : rule__RightOperandOne__Group__1__Impl rule__RightOperandOne__Group__2 ;
    public final void rule__RightOperandOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1802:1: ( rule__RightOperandOne__Group__1__Impl rule__RightOperandOne__Group__2 )
            // InternalSql_dsl.g:1803:2: rule__RightOperandOne__Group__1__Impl rule__RightOperandOne__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RightOperandOne__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightOperandOne__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightOperandOne__Group__1"


    // $ANTLR start "rule__RightOperandOne__Group__1__Impl"
    // InternalSql_dsl.g:1810:1: rule__RightOperandOne__Group__1__Impl : ( ( rule__RightOperandOne__NameAssignment_1 ) ) ;
    public final void rule__RightOperandOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1814:1: ( ( ( rule__RightOperandOne__NameAssignment_1 ) ) )
            // InternalSql_dsl.g:1815:1: ( ( rule__RightOperandOne__NameAssignment_1 ) )
            {
            // InternalSql_dsl.g:1815:1: ( ( rule__RightOperandOne__NameAssignment_1 ) )
            // InternalSql_dsl.g:1816:2: ( rule__RightOperandOne__NameAssignment_1 )
            {
             before(grammarAccess.getRightOperandOneAccess().getNameAssignment_1()); 
            // InternalSql_dsl.g:1817:2: ( rule__RightOperandOne__NameAssignment_1 )
            // InternalSql_dsl.g:1817:3: rule__RightOperandOne__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RightOperandOne__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRightOperandOneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightOperandOne__Group__1__Impl"


    // $ANTLR start "rule__RightOperandOne__Group__2"
    // InternalSql_dsl.g:1825:1: rule__RightOperandOne__Group__2 : rule__RightOperandOne__Group__2__Impl ;
    public final void rule__RightOperandOne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1829:1: ( rule__RightOperandOne__Group__2__Impl )
            // InternalSql_dsl.g:1830:2: rule__RightOperandOne__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightOperandOne__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightOperandOne__Group__2"


    // $ANTLR start "rule__RightOperandOne__Group__2__Impl"
    // InternalSql_dsl.g:1836:1: rule__RightOperandOne__Group__2__Impl : ( '#' ) ;
    public final void rule__RightOperandOne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1840:1: ( ( '#' ) )
            // InternalSql_dsl.g:1841:1: ( '#' )
            {
            // InternalSql_dsl.g:1841:1: ( '#' )
            // InternalSql_dsl.g:1842:2: '#'
            {
             before(grammarAccess.getRightOperandOneAccess().getNumberSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRightOperandOneAccess().getNumberSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightOperandOne__Group__2__Impl"


    // $ANTLR start "rule__DatabaseDeclarationStatement__Group__0"
    // InternalSql_dsl.g:1852:1: rule__DatabaseDeclarationStatement__Group__0 : rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1 ;
    public final void rule__DatabaseDeclarationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1856:1: ( rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1 )
            // InternalSql_dsl.g:1857:2: rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DatabaseDeclarationStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseDeclarationStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseDeclarationStatement__Group__0"


    // $ANTLR start "rule__DatabaseDeclarationStatement__Group__0__Impl"
    // InternalSql_dsl.g:1864:1: rule__DatabaseDeclarationStatement__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__DatabaseDeclarationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1868:1: ( ( 'CREATE' ) )
            // InternalSql_dsl.g:1869:1: ( 'CREATE' )
            {
            // InternalSql_dsl.g:1869:1: ( 'CREATE' )
            // InternalSql_dsl.g:1870:2: 'CREATE'
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getCREATEKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDatabaseDeclarationStatementAccess().getCREATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseDeclarationStatement__Group__0__Impl"


    // $ANTLR start "rule__DatabaseDeclarationStatement__Group__1"
    // InternalSql_dsl.g:1879:1: rule__DatabaseDeclarationStatement__Group__1 : rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2 ;
    public final void rule__DatabaseDeclarationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1883:1: ( rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2 )
            // InternalSql_dsl.g:1884:2: rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DatabaseDeclarationStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseDeclarationStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseDeclarationStatement__Group__1"


    // $ANTLR start "rule__DatabaseDeclarationStatement__Group__1__Impl"
    // InternalSql_dsl.g:1891:1: rule__DatabaseDeclarationStatement__Group__1__Impl : ( 'DATABASE' ) ;
    public final void rule__DatabaseDeclarationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1895:1: ( ( 'DATABASE' ) )
            // InternalSql_dsl.g:1896:1: ( 'DATABASE' )
            {
            // InternalSql_dsl.g:1896:1: ( 'DATABASE' )
            // InternalSql_dsl.g:1897:2: 'DATABASE'
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getDATABASEKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDatabaseDeclarationStatementAccess().getDATABASEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseDeclarationStatement__Group__1__Impl"


    // $ANTLR start "rule__DatabaseDeclarationStatement__Group__2"
    // InternalSql_dsl.g:1906:1: rule__DatabaseDeclarationStatement__Group__2 : rule__DatabaseDeclarationStatement__Group__2__Impl ;
    public final void rule__DatabaseDeclarationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1910:1: ( rule__DatabaseDeclarationStatement__Group__2__Impl )
            // InternalSql_dsl.g:1911:2: rule__DatabaseDeclarationStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseDeclarationStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseDeclarationStatement__Group__2"


    // $ANTLR start "rule__DatabaseDeclarationStatement__Group__2__Impl"
    // InternalSql_dsl.g:1917:1: rule__DatabaseDeclarationStatement__Group__2__Impl : ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) ) ;
    public final void rule__DatabaseDeclarationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1921:1: ( ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:1922:1: ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:1922:1: ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:1923:2: ( rule__DatabaseDeclarationStatement__NameAssignment_2 )
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:1924:2: ( rule__DatabaseDeclarationStatement__NameAssignment_2 )
            // InternalSql_dsl.g:1924:3: rule__DatabaseDeclarationStatement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseDeclarationStatement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseDeclarationStatementAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseDeclarationStatement__Group__2__Impl"


    // $ANTLR start "rule__TableDeclaration__Group__0"
    // InternalSql_dsl.g:1933:1: rule__TableDeclaration__Group__0 : rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 ;
    public final void rule__TableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1937:1: ( rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 )
            // InternalSql_dsl.g:1938:2: rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__TableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__0"


    // $ANTLR start "rule__TableDeclaration__Group__0__Impl"
    // InternalSql_dsl.g:1945:1: rule__TableDeclaration__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__TableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1949:1: ( ( 'CREATE' ) )
            // InternalSql_dsl.g:1950:1: ( 'CREATE' )
            {
            // InternalSql_dsl.g:1950:1: ( 'CREATE' )
            // InternalSql_dsl.g:1951:2: 'CREATE'
            {
             before(grammarAccess.getTableDeclarationAccess().getCREATEKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTableDeclarationAccess().getCREATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TableDeclaration__Group__1"
    // InternalSql_dsl.g:1960:1: rule__TableDeclaration__Group__1 : rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2 ;
    public final void rule__TableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1964:1: ( rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2 )
            // InternalSql_dsl.g:1965:2: rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__TableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__1"


    // $ANTLR start "rule__TableDeclaration__Group__1__Impl"
    // InternalSql_dsl.g:1972:1: rule__TableDeclaration__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1976:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:1977:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:1977:1: ( 'TABLE' )
            // InternalSql_dsl.g:1978:2: 'TABLE'
            {
             before(grammarAccess.getTableDeclarationAccess().getTABLEKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTableDeclarationAccess().getTABLEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TableDeclaration__Group__2"
    // InternalSql_dsl.g:1987:1: rule__TableDeclaration__Group__2 : rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3 ;
    public final void rule__TableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1991:1: ( rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3 )
            // InternalSql_dsl.g:1992:2: rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__TableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__2"


    // $ANTLR start "rule__TableDeclaration__Group__2__Impl"
    // InternalSql_dsl.g:1999:1: rule__TableDeclaration__Group__2__Impl : ( ( rule__TableDeclaration__TableAssignment_2 ) ) ;
    public final void rule__TableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2003:1: ( ( ( rule__TableDeclaration__TableAssignment_2 ) ) )
            // InternalSql_dsl.g:2004:1: ( ( rule__TableDeclaration__TableAssignment_2 ) )
            {
            // InternalSql_dsl.g:2004:1: ( ( rule__TableDeclaration__TableAssignment_2 ) )
            // InternalSql_dsl.g:2005:2: ( rule__TableDeclaration__TableAssignment_2 )
            {
             before(grammarAccess.getTableDeclarationAccess().getTableAssignment_2()); 
            // InternalSql_dsl.g:2006:2: ( rule__TableDeclaration__TableAssignment_2 )
            // InternalSql_dsl.g:2006:3: rule__TableDeclaration__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TableDeclaration__Group__3"
    // InternalSql_dsl.g:2014:1: rule__TableDeclaration__Group__3 : rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4 ;
    public final void rule__TableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2018:1: ( rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4 )
            // InternalSql_dsl.g:2019:2: rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__TableDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__3"


    // $ANTLR start "rule__TableDeclaration__Group__3__Impl"
    // InternalSql_dsl.g:2026:1: rule__TableDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__TableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2030:1: ( ( '(' ) )
            // InternalSql_dsl.g:2031:1: ( '(' )
            {
            // InternalSql_dsl.g:2031:1: ( '(' )
            // InternalSql_dsl.g:2032:2: '('
            {
             before(grammarAccess.getTableDeclarationAccess().getLeftParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTableDeclarationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TableDeclaration__Group__4"
    // InternalSql_dsl.g:2041:1: rule__TableDeclaration__Group__4 : rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5 ;
    public final void rule__TableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2045:1: ( rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5 )
            // InternalSql_dsl.g:2046:2: rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__TableDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__4"


    // $ANTLR start "rule__TableDeclaration__Group__4__Impl"
    // InternalSql_dsl.g:2053:1: rule__TableDeclaration__Group__4__Impl : ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) ) ;
    public final void rule__TableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2057:1: ( ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) ) )
            // InternalSql_dsl.g:2058:1: ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) )
            {
            // InternalSql_dsl.g:2058:1: ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) )
            // InternalSql_dsl.g:2059:2: ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* )
            {
            // InternalSql_dsl.g:2059:2: ( ( rule__TableDeclaration__AttributesAssignment_4 ) )
            // InternalSql_dsl.g:2060:3: ( rule__TableDeclaration__AttributesAssignment_4 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 
            // InternalSql_dsl.g:2061:3: ( rule__TableDeclaration__AttributesAssignment_4 )
            // InternalSql_dsl.g:2061:4: rule__TableDeclaration__AttributesAssignment_4
            {
            pushFollow(FOLLOW_22);
            rule__TableDeclaration__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 

            }

            // InternalSql_dsl.g:2064:2: ( ( rule__TableDeclaration__AttributesAssignment_4 )* )
            // InternalSql_dsl.g:2065:3: ( rule__TableDeclaration__AttributesAssignment_4 )*
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 
            // InternalSql_dsl.g:2066:3: ( rule__TableDeclaration__AttributesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==38||LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSql_dsl.g:2066:4: rule__TableDeclaration__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TableDeclaration__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__4__Impl"


    // $ANTLR start "rule__TableDeclaration__Group__5"
    // InternalSql_dsl.g:2075:1: rule__TableDeclaration__Group__5 : rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6 ;
    public final void rule__TableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2079:1: ( rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6 )
            // InternalSql_dsl.g:2080:2: rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__TableDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__5"


    // $ANTLR start "rule__TableDeclaration__Group__5__Impl"
    // InternalSql_dsl.g:2087:1: rule__TableDeclaration__Group__5__Impl : ( ( rule__TableDeclaration__Group_5__0 )* ) ;
    public final void rule__TableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2091:1: ( ( ( rule__TableDeclaration__Group_5__0 )* ) )
            // InternalSql_dsl.g:2092:1: ( ( rule__TableDeclaration__Group_5__0 )* )
            {
            // InternalSql_dsl.g:2092:1: ( ( rule__TableDeclaration__Group_5__0 )* )
            // InternalSql_dsl.g:2093:2: ( rule__TableDeclaration__Group_5__0 )*
            {
             before(grammarAccess.getTableDeclarationAccess().getGroup_5()); 
            // InternalSql_dsl.g:2094:2: ( rule__TableDeclaration__Group_5__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSql_dsl.g:2094:3: rule__TableDeclaration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TableDeclaration__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTableDeclarationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__5__Impl"


    // $ANTLR start "rule__TableDeclaration__Group__6"
    // InternalSql_dsl.g:2102:1: rule__TableDeclaration__Group__6 : rule__TableDeclaration__Group__6__Impl ;
    public final void rule__TableDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2106:1: ( rule__TableDeclaration__Group__6__Impl )
            // InternalSql_dsl.g:2107:2: rule__TableDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__6"


    // $ANTLR start "rule__TableDeclaration__Group__6__Impl"
    // InternalSql_dsl.g:2113:1: rule__TableDeclaration__Group__6__Impl : ( ')' ) ;
    public final void rule__TableDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2117:1: ( ( ')' ) )
            // InternalSql_dsl.g:2118:1: ( ')' )
            {
            // InternalSql_dsl.g:2118:1: ( ')' )
            // InternalSql_dsl.g:2119:2: ')'
            {
             before(grammarAccess.getTableDeclarationAccess().getRightParenthesisKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTableDeclarationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group__6__Impl"


    // $ANTLR start "rule__TableDeclaration__Group_5__0"
    // InternalSql_dsl.g:2129:1: rule__TableDeclaration__Group_5__0 : rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1 ;
    public final void rule__TableDeclaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2133:1: ( rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1 )
            // InternalSql_dsl.g:2134:2: rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__TableDeclaration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group_5__0"


    // $ANTLR start "rule__TableDeclaration__Group_5__0__Impl"
    // InternalSql_dsl.g:2141:1: rule__TableDeclaration__Group_5__0__Impl : ( ',' ) ;
    public final void rule__TableDeclaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2145:1: ( ( ',' ) )
            // InternalSql_dsl.g:2146:1: ( ',' )
            {
            // InternalSql_dsl.g:2146:1: ( ',' )
            // InternalSql_dsl.g:2147:2: ','
            {
             before(grammarAccess.getTableDeclarationAccess().getCommaKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTableDeclarationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group_5__0__Impl"


    // $ANTLR start "rule__TableDeclaration__Group_5__1"
    // InternalSql_dsl.g:2156:1: rule__TableDeclaration__Group_5__1 : rule__TableDeclaration__Group_5__1__Impl ;
    public final void rule__TableDeclaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2160:1: ( rule__TableDeclaration__Group_5__1__Impl )
            // InternalSql_dsl.g:2161:2: rule__TableDeclaration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group_5__1"


    // $ANTLR start "rule__TableDeclaration__Group_5__1__Impl"
    // InternalSql_dsl.g:2167:1: rule__TableDeclaration__Group_5__1__Impl : ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) ) ;
    public final void rule__TableDeclaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2171:1: ( ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) ) )
            // InternalSql_dsl.g:2172:1: ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) )
            {
            // InternalSql_dsl.g:2172:1: ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) )
            // InternalSql_dsl.g:2173:2: ( rule__TableDeclaration__AttributesAssignment_5_1 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_5_1()); 
            // InternalSql_dsl.g:2174:2: ( rule__TableDeclaration__AttributesAssignment_5_1 )
            // InternalSql_dsl.g:2174:3: rule__TableDeclaration__AttributesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__AttributesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__Group_5__1__Impl"


    // $ANTLR start "rule__ColumnDeclaration__Group__0"
    // InternalSql_dsl.g:2183:1: rule__ColumnDeclaration__Group__0 : rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 ;
    public final void rule__ColumnDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2187:1: ( rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 )
            // InternalSql_dsl.g:2188:2: rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ColumnDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__Group__0"


    // $ANTLR start "rule__ColumnDeclaration__Group__0__Impl"
    // InternalSql_dsl.g:2195:1: rule__ColumnDeclaration__Group__0__Impl : ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ColumnDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2199:1: ( ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) )
            // InternalSql_dsl.g:2200:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            {
            // InternalSql_dsl.g:2200:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            // InternalSql_dsl.g:2201:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getNameAssignment_0()); 
            // InternalSql_dsl.g:2202:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            // InternalSql_dsl.g:2202:3: rule__ColumnDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ColumnDeclaration__Group__1"
    // InternalSql_dsl.g:2210:1: rule__ColumnDeclaration__Group__1 : rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 ;
    public final void rule__ColumnDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2214:1: ( rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 )
            // InternalSql_dsl.g:2215:2: rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ColumnDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__Group__1"


    // $ANTLR start "rule__ColumnDeclaration__Group__1__Impl"
    // InternalSql_dsl.g:2222:1: rule__ColumnDeclaration__Group__1__Impl : ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__ColumnDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2226:1: ( ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) )
            // InternalSql_dsl.g:2227:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            {
            // InternalSql_dsl.g:2227:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            // InternalSql_dsl.g:2228:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getTypeAssignment_1()); 
            // InternalSql_dsl.g:2229:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            // InternalSql_dsl.g:2229:3: rule__ColumnDeclaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnDeclarationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ColumnDeclaration__Group__2"
    // InternalSql_dsl.g:2237:1: rule__ColumnDeclaration__Group__2 : rule__ColumnDeclaration__Group__2__Impl ;
    public final void rule__ColumnDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2241:1: ( rule__ColumnDeclaration__Group__2__Impl )
            // InternalSql_dsl.g:2242:2: rule__ColumnDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__Group__2"


    // $ANTLR start "rule__ColumnDeclaration__Group__2__Impl"
    // InternalSql_dsl.g:2248:1: rule__ColumnDeclaration__Group__2__Impl : ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) ;
    public final void rule__ColumnDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2252:1: ( ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) )
            // InternalSql_dsl.g:2253:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            {
            // InternalSql_dsl.g:2253:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            // InternalSql_dsl.g:2254:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullAssignment_2()); 
            // InternalSql_dsl.g:2255:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSql_dsl.g:2255:3: rule__ColumnDeclaration__NotNullAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnDeclaration__NotNullAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnDeclarationAccess().getNotNullAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__0"
    // InternalSql_dsl.g:2264:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2268:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalSql_dsl.g:2269:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__PrimaryKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__0"


    // $ANTLR start "rule__PrimaryKey__Group__0__Impl"
    // InternalSql_dsl.g:2276:1: rule__PrimaryKey__Group__0__Impl : ( 'PRIMARY' ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2280:1: ( ( 'PRIMARY' ) )
            // InternalSql_dsl.g:2281:1: ( 'PRIMARY' )
            {
            // InternalSql_dsl.g:2281:1: ( 'PRIMARY' )
            // InternalSql_dsl.g:2282:2: 'PRIMARY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__0__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__1"
    // InternalSql_dsl.g:2291:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2295:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalSql_dsl.g:2296:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__PrimaryKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__1"


    // $ANTLR start "rule__PrimaryKey__Group__1__Impl"
    // InternalSql_dsl.g:2303:1: rule__PrimaryKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2307:1: ( ( 'KEY' ) )
            // InternalSql_dsl.g:2308:1: ( 'KEY' )
            {
            // InternalSql_dsl.g:2308:1: ( 'KEY' )
            // InternalSql_dsl.g:2309:2: 'KEY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__1__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__2"
    // InternalSql_dsl.g:2318:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2322:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalSql_dsl.g:2323:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__PrimaryKey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__2"


    // $ANTLR start "rule__PrimaryKey__Group__2__Impl"
    // InternalSql_dsl.g:2330:1: rule__PrimaryKey__Group__2__Impl : ( '(' ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2334:1: ( ( '(' ) )
            // InternalSql_dsl.g:2335:1: ( '(' )
            {
            // InternalSql_dsl.g:2335:1: ( '(' )
            // InternalSql_dsl.g:2336:2: '('
            {
             before(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__2__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__3"
    // InternalSql_dsl.g:2345:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2349:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalSql_dsl.g:2350:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__PrimaryKey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__3"


    // $ANTLR start "rule__PrimaryKey__Group__3__Impl"
    // InternalSql_dsl.g:2357:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2361:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) )
            // InternalSql_dsl.g:2362:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            {
            // InternalSql_dsl.g:2362:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            // InternalSql_dsl.g:2363:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_3()); 
            // InternalSql_dsl.g:2364:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            // InternalSql_dsl.g:2364:3: rule__PrimaryKey__ColumnAsPKAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColumnAsPKAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__3__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__4"
    // InternalSql_dsl.g:2372:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2376:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalSql_dsl.g:2377:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__PrimaryKey__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__4"


    // $ANTLR start "rule__PrimaryKey__Group__4__Impl"
    // InternalSql_dsl.g:2384:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2388:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalSql_dsl.g:2389:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalSql_dsl.g:2389:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalSql_dsl.g:2390:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalSql_dsl.g:2391:2: ( rule__PrimaryKey__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSql_dsl.g:2391:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PrimaryKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__4__Impl"


    // $ANTLR start "rule__PrimaryKey__Group__5"
    // InternalSql_dsl.g:2399:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2403:1: ( rule__PrimaryKey__Group__5__Impl )
            // InternalSql_dsl.g:2404:2: rule__PrimaryKey__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__5"


    // $ANTLR start "rule__PrimaryKey__Group__5__Impl"
    // InternalSql_dsl.g:2410:1: rule__PrimaryKey__Group__5__Impl : ( ')' ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2414:1: ( ( ')' ) )
            // InternalSql_dsl.g:2415:1: ( ')' )
            {
            // InternalSql_dsl.g:2415:1: ( ')' )
            // InternalSql_dsl.g:2416:2: ')'
            {
             before(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group__5__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__0"
    // InternalSql_dsl.g:2426:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2430:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalSql_dsl.g:2431:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__PrimaryKey__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__0"


    // $ANTLR start "rule__PrimaryKey__Group_4__0__Impl"
    // InternalSql_dsl.g:2438:1: rule__PrimaryKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2442:1: ( ( ',' ) )
            // InternalSql_dsl.g:2443:1: ( ',' )
            {
            // InternalSql_dsl.g:2443:1: ( ',' )
            // InternalSql_dsl.g:2444:2: ','
            {
             before(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryKey__Group_4__1"
    // InternalSql_dsl.g:2453:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2457:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalSql_dsl.g:2458:2: rule__PrimaryKey__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__1"


    // $ANTLR start "rule__PrimaryKey__Group_4__1__Impl"
    // InternalSql_dsl.g:2464:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2468:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) )
            // InternalSql_dsl.g:2469:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:2469:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            // InternalSql_dsl.g:2470:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_4_1()); 
            // InternalSql_dsl.g:2471:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            // InternalSql_dsl.g:2471:3: rule__PrimaryKey__ColumnAsPKAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryKey__ColumnAsPKAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__Group_4__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__0"
    // InternalSql_dsl.g:2480:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2484:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalSql_dsl.g:2485:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ForeignKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__0"


    // $ANTLR start "rule__ForeignKey__Group__0__Impl"
    // InternalSql_dsl.g:2492:1: rule__ForeignKey__Group__0__Impl : ( 'FOREIGN' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2496:1: ( ( 'FOREIGN' ) )
            // InternalSql_dsl.g:2497:1: ( 'FOREIGN' )
            {
            // InternalSql_dsl.g:2497:1: ( 'FOREIGN' )
            // InternalSql_dsl.g:2498:2: 'FOREIGN'
            {
             before(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group__1"
    // InternalSql_dsl.g:2507:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2511:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalSql_dsl.g:2512:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ForeignKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__1"


    // $ANTLR start "rule__ForeignKey__Group__1__Impl"
    // InternalSql_dsl.g:2519:1: rule__ForeignKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2523:1: ( ( 'KEY' ) )
            // InternalSql_dsl.g:2524:1: ( 'KEY' )
            {
            // InternalSql_dsl.g:2524:1: ( 'KEY' )
            // InternalSql_dsl.g:2525:2: 'KEY'
            {
             before(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__2"
    // InternalSql_dsl.g:2534:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2538:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalSql_dsl.g:2539:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ForeignKey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__2"


    // $ANTLR start "rule__ForeignKey__Group__2__Impl"
    // InternalSql_dsl.g:2546:1: rule__ForeignKey__Group__2__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2550:1: ( ( '(' ) )
            // InternalSql_dsl.g:2551:1: ( '(' )
            {
            // InternalSql_dsl.g:2551:1: ( '(' )
            // InternalSql_dsl.g:2552:2: '('
            {
             before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__2__Impl"


    // $ANTLR start "rule__ForeignKey__Group__3"
    // InternalSql_dsl.g:2561:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2565:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalSql_dsl.g:2566:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__ForeignKey__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__3"


    // $ANTLR start "rule__ForeignKey__Group__3__Impl"
    // InternalSql_dsl.g:2573:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2577:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) )
            // InternalSql_dsl.g:2578:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            {
            // InternalSql_dsl.g:2578:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            // InternalSql_dsl.g:2579:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_3()); 
            // InternalSql_dsl.g:2580:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            // InternalSql_dsl.g:2580:3: rule__ForeignKey__ColumnAsFKAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnAsFKAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__3__Impl"


    // $ANTLR start "rule__ForeignKey__Group__4"
    // InternalSql_dsl.g:2588:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2592:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalSql_dsl.g:2593:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__ForeignKey__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__4"


    // $ANTLR start "rule__ForeignKey__Group__4__Impl"
    // InternalSql_dsl.g:2600:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2604:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalSql_dsl.g:2605:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalSql_dsl.g:2605:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalSql_dsl.g:2606:2: ( rule__ForeignKey__Group_4__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            // InternalSql_dsl.g:2607:2: ( rule__ForeignKey__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSql_dsl.g:2607:3: rule__ForeignKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ForeignKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getForeignKeyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__4__Impl"


    // $ANTLR start "rule__ForeignKey__Group__5"
    // InternalSql_dsl.g:2615:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2619:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalSql_dsl.g:2620:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__ForeignKey__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__5"


    // $ANTLR start "rule__ForeignKey__Group__5__Impl"
    // InternalSql_dsl.g:2627:1: rule__ForeignKey__Group__5__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2631:1: ( ( ')' ) )
            // InternalSql_dsl.g:2632:1: ( ')' )
            {
            // InternalSql_dsl.g:2632:1: ( ')' )
            // InternalSql_dsl.g:2633:2: ')'
            {
             before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__5__Impl"


    // $ANTLR start "rule__ForeignKey__Group__6"
    // InternalSql_dsl.g:2642:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2646:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalSql_dsl.g:2647:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__ForeignKey__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__6"


    // $ANTLR start "rule__ForeignKey__Group__6__Impl"
    // InternalSql_dsl.g:2654:1: rule__ForeignKey__Group__6__Impl : ( 'REFERENCES' ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2658:1: ( ( 'REFERENCES' ) )
            // InternalSql_dsl.g:2659:1: ( 'REFERENCES' )
            {
            // InternalSql_dsl.g:2659:1: ( 'REFERENCES' )
            // InternalSql_dsl.g:2660:2: 'REFERENCES'
            {
             before(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__6__Impl"


    // $ANTLR start "rule__ForeignKey__Group__7"
    // InternalSql_dsl.g:2669:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2673:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalSql_dsl.g:2674:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__ForeignKey__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__7"


    // $ANTLR start "rule__ForeignKey__Group__7__Impl"
    // InternalSql_dsl.g:2681:1: rule__ForeignKey__Group__7__Impl : ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2685:1: ( ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) )
            // InternalSql_dsl.g:2686:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            {
            // InternalSql_dsl.g:2686:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            // InternalSql_dsl.g:2687:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); 
            // InternalSql_dsl.g:2688:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            // InternalSql_dsl.g:2688:3: rule__ForeignKey__ForeignTableAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ForeignTableAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__7__Impl"


    // $ANTLR start "rule__ForeignKey__Group__8"
    // InternalSql_dsl.g:2696:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2700:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalSql_dsl.g:2701:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__ForeignKey__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__8"


    // $ANTLR start "rule__ForeignKey__Group__8__Impl"
    // InternalSql_dsl.g:2708:1: rule__ForeignKey__Group__8__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2712:1: ( ( '(' ) )
            // InternalSql_dsl.g:2713:1: ( '(' )
            {
            // InternalSql_dsl.g:2713:1: ( '(' )
            // InternalSql_dsl.g:2714:2: '('
            {
             before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__8__Impl"


    // $ANTLR start "rule__ForeignKey__Group__9"
    // InternalSql_dsl.g:2723:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2727:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalSql_dsl.g:2728:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__ForeignKey__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__9"


    // $ANTLR start "rule__ForeignKey__Group__9__Impl"
    // InternalSql_dsl.g:2735:1: rule__ForeignKey__Group__9__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2739:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) )
            // InternalSql_dsl.g:2740:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            {
            // InternalSql_dsl.g:2740:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            // InternalSql_dsl.g:2741:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); 
            // InternalSql_dsl.g:2742:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            // InternalSql_dsl.g:2742:3: rule__ForeignKey__ForeignColumnsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ForeignColumnsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__9__Impl"


    // $ANTLR start "rule__ForeignKey__Group__10"
    // InternalSql_dsl.g:2750:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2754:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalSql_dsl.g:2755:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__ForeignKey__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__10"


    // $ANTLR start "rule__ForeignKey__Group__10__Impl"
    // InternalSql_dsl.g:2762:1: rule__ForeignKey__Group__10__Impl : ( ( rule__ForeignKey__Group_10__0 )* ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2766:1: ( ( ( rule__ForeignKey__Group_10__0 )* ) )
            // InternalSql_dsl.g:2767:1: ( ( rule__ForeignKey__Group_10__0 )* )
            {
            // InternalSql_dsl.g:2767:1: ( ( rule__ForeignKey__Group_10__0 )* )
            // InternalSql_dsl.g:2768:2: ( rule__ForeignKey__Group_10__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_10()); 
            // InternalSql_dsl.g:2769:2: ( rule__ForeignKey__Group_10__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSql_dsl.g:2769:3: rule__ForeignKey__Group_10__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ForeignKey__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getForeignKeyAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__10__Impl"


    // $ANTLR start "rule__ForeignKey__Group__11"
    // InternalSql_dsl.g:2777:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2781:1: ( rule__ForeignKey__Group__11__Impl )
            // InternalSql_dsl.g:2782:2: rule__ForeignKey__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__11"


    // $ANTLR start "rule__ForeignKey__Group__11__Impl"
    // InternalSql_dsl.g:2788:1: rule__ForeignKey__Group__11__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2792:1: ( ( ')' ) )
            // InternalSql_dsl.g:2793:1: ( ')' )
            {
            // InternalSql_dsl.g:2793:1: ( ')' )
            // InternalSql_dsl.g:2794:2: ')'
            {
             before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__11__Impl"


    // $ANTLR start "rule__ForeignKey__Group_4__0"
    // InternalSql_dsl.g:2804:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2808:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalSql_dsl.g:2809:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__ForeignKey__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_4__0"


    // $ANTLR start "rule__ForeignKey__Group_4__0__Impl"
    // InternalSql_dsl.g:2816:1: rule__ForeignKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2820:1: ( ( ',' ) )
            // InternalSql_dsl.g:2821:1: ( ',' )
            {
            // InternalSql_dsl.g:2821:1: ( ',' )
            // InternalSql_dsl.g:2822:2: ','
            {
             before(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_4__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group_4__1"
    // InternalSql_dsl.g:2831:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2835:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalSql_dsl.g:2836:2: rule__ForeignKey__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_4__1"


    // $ANTLR start "rule__ForeignKey__Group_4__1__Impl"
    // InternalSql_dsl.g:2842:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2846:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) )
            // InternalSql_dsl.g:2847:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:2847:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            // InternalSql_dsl.g:2848:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_4_1()); 
            // InternalSql_dsl.g:2849:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            // InternalSql_dsl.g:2849:3: rule__ForeignKey__ColumnAsFKAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ColumnAsFKAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_4__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group_10__0"
    // InternalSql_dsl.g:2858:1: rule__ForeignKey__Group_10__0 : rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 ;
    public final void rule__ForeignKey__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2862:1: ( rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 )
            // InternalSql_dsl.g:2863:2: rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1
            {
            pushFollow(FOLLOW_10);
            rule__ForeignKey__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_10__0"


    // $ANTLR start "rule__ForeignKey__Group_10__0__Impl"
    // InternalSql_dsl.g:2870:1: rule__ForeignKey__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2874:1: ( ( ',' ) )
            // InternalSql_dsl.g:2875:1: ( ',' )
            {
            // InternalSql_dsl.g:2875:1: ( ',' )
            // InternalSql_dsl.g:2876:2: ','
            {
             before(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_10__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group_10__1"
    // InternalSql_dsl.g:2885:1: rule__ForeignKey__Group_10__1 : rule__ForeignKey__Group_10__1__Impl ;
    public final void rule__ForeignKey__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2889:1: ( rule__ForeignKey__Group_10__1__Impl )
            // InternalSql_dsl.g:2890:2: rule__ForeignKey__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_10__1"


    // $ANTLR start "rule__ForeignKey__Group_10__1__Impl"
    // InternalSql_dsl.g:2896:1: rule__ForeignKey__Group_10__1__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) ;
    public final void rule__ForeignKey__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2900:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) )
            // InternalSql_dsl.g:2901:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            {
            // InternalSql_dsl.g:2901:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            // InternalSql_dsl.g:2902:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); 
            // InternalSql_dsl.g:2903:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            // InternalSql_dsl.g:2903:3: rule__ForeignKey__ForeignColumnsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeignKey__ForeignColumnsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group_10__1__Impl"


    // $ANTLR start "rule__DropTableStatement__Group__0"
    // InternalSql_dsl.g:2912:1: rule__DropTableStatement__Group__0 : rule__DropTableStatement__Group__0__Impl rule__DropTableStatement__Group__1 ;
    public final void rule__DropTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2916:1: ( rule__DropTableStatement__Group__0__Impl rule__DropTableStatement__Group__1 )
            // InternalSql_dsl.g:2917:2: rule__DropTableStatement__Group__0__Impl rule__DropTableStatement__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__DropTableStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTableStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group__0"


    // $ANTLR start "rule__DropTableStatement__Group__0__Impl"
    // InternalSql_dsl.g:2924:1: rule__DropTableStatement__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DropTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2928:1: ( ( 'DROP' ) )
            // InternalSql_dsl.g:2929:1: ( 'DROP' )
            {
            // InternalSql_dsl.g:2929:1: ( 'DROP' )
            // InternalSql_dsl.g:2930:2: 'DROP'
            {
             before(grammarAccess.getDropTableStatementAccess().getDROPKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDropTableStatementAccess().getDROPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group__0__Impl"


    // $ANTLR start "rule__DropTableStatement__Group__1"
    // InternalSql_dsl.g:2939:1: rule__DropTableStatement__Group__1 : rule__DropTableStatement__Group__1__Impl rule__DropTableStatement__Group__2 ;
    public final void rule__DropTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2943:1: ( rule__DropTableStatement__Group__1__Impl rule__DropTableStatement__Group__2 )
            // InternalSql_dsl.g:2944:2: rule__DropTableStatement__Group__1__Impl rule__DropTableStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DropTableStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTableStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group__1"


    // $ANTLR start "rule__DropTableStatement__Group__1__Impl"
    // InternalSql_dsl.g:2951:1: rule__DropTableStatement__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__DropTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2955:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:2956:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:2956:1: ( 'TABLE' )
            // InternalSql_dsl.g:2957:2: 'TABLE'
            {
             before(grammarAccess.getDropTableStatementAccess().getTABLEKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDropTableStatementAccess().getTABLEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group__1__Impl"


    // $ANTLR start "rule__DropTableStatement__Group__2"
    // InternalSql_dsl.g:2966:1: rule__DropTableStatement__Group__2 : rule__DropTableStatement__Group__2__Impl rule__DropTableStatement__Group__3 ;
    public final void rule__DropTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2970:1: ( rule__DropTableStatement__Group__2__Impl rule__DropTableStatement__Group__3 )
            // InternalSql_dsl.g:2971:2: rule__DropTableStatement__Group__2__Impl rule__DropTableStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DropTableStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTableStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group__2"


    // $ANTLR start "rule__DropTableStatement__Group__2__Impl"
    // InternalSql_dsl.g:2978:1: rule__DropTableStatement__Group__2__Impl : ( ( rule__DropTableStatement__TableAssignment_2 ) ) ;
    public final void rule__DropTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2982:1: ( ( ( rule__DropTableStatement__TableAssignment_2 ) ) )
            // InternalSql_dsl.g:2983:1: ( ( rule__DropTableStatement__TableAssignment_2 ) )
            {
            // InternalSql_dsl.g:2983:1: ( ( rule__DropTableStatement__TableAssignment_2 ) )
            // InternalSql_dsl.g:2984:2: ( rule__DropTableStatement__TableAssignment_2 )
            {
             before(grammarAccess.getDropTableStatementAccess().getTableAssignment_2()); 
            // InternalSql_dsl.g:2985:2: ( rule__DropTableStatement__TableAssignment_2 )
            // InternalSql_dsl.g:2985:3: rule__DropTableStatement__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DropTableStatement__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropTableStatementAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group__2__Impl"


    // $ANTLR start "rule__DropTableStatement__Group__3"
    // InternalSql_dsl.g:2993:1: rule__DropTableStatement__Group__3 : rule__DropTableStatement__Group__3__Impl ;
    public final void rule__DropTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2997:1: ( rule__DropTableStatement__Group__3__Impl )
            // InternalSql_dsl.g:2998:2: rule__DropTableStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropTableStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group__3"


    // $ANTLR start "rule__DropTableStatement__Group__3__Impl"
    // InternalSql_dsl.g:3004:1: rule__DropTableStatement__Group__3__Impl : ( ( rule__DropTableStatement__Group_3__0 )* ) ;
    public final void rule__DropTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3008:1: ( ( ( rule__DropTableStatement__Group_3__0 )* ) )
            // InternalSql_dsl.g:3009:1: ( ( rule__DropTableStatement__Group_3__0 )* )
            {
            // InternalSql_dsl.g:3009:1: ( ( rule__DropTableStatement__Group_3__0 )* )
            // InternalSql_dsl.g:3010:2: ( rule__DropTableStatement__Group_3__0 )*
            {
             before(grammarAccess.getDropTableStatementAccess().getGroup_3()); 
            // InternalSql_dsl.g:3011:2: ( rule__DropTableStatement__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSql_dsl.g:3011:3: rule__DropTableStatement__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DropTableStatement__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDropTableStatementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group__3__Impl"


    // $ANTLR start "rule__DropTableStatement__Group_3__0"
    // InternalSql_dsl.g:3020:1: rule__DropTableStatement__Group_3__0 : rule__DropTableStatement__Group_3__0__Impl rule__DropTableStatement__Group_3__1 ;
    public final void rule__DropTableStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3024:1: ( rule__DropTableStatement__Group_3__0__Impl rule__DropTableStatement__Group_3__1 )
            // InternalSql_dsl.g:3025:2: rule__DropTableStatement__Group_3__0__Impl rule__DropTableStatement__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__DropTableStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTableStatement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group_3__0"


    // $ANTLR start "rule__DropTableStatement__Group_3__0__Impl"
    // InternalSql_dsl.g:3032:1: rule__DropTableStatement__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DropTableStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3036:1: ( ( ',' ) )
            // InternalSql_dsl.g:3037:1: ( ',' )
            {
            // InternalSql_dsl.g:3037:1: ( ',' )
            // InternalSql_dsl.g:3038:2: ','
            {
             before(grammarAccess.getDropTableStatementAccess().getCommaKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDropTableStatementAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group_3__0__Impl"


    // $ANTLR start "rule__DropTableStatement__Group_3__1"
    // InternalSql_dsl.g:3047:1: rule__DropTableStatement__Group_3__1 : rule__DropTableStatement__Group_3__1__Impl ;
    public final void rule__DropTableStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3051:1: ( rule__DropTableStatement__Group_3__1__Impl )
            // InternalSql_dsl.g:3052:2: rule__DropTableStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropTableStatement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group_3__1"


    // $ANTLR start "rule__DropTableStatement__Group_3__1__Impl"
    // InternalSql_dsl.g:3058:1: rule__DropTableStatement__Group_3__1__Impl : ( ( rule__DropTableStatement__TableAssignment_3_1 ) ) ;
    public final void rule__DropTableStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3062:1: ( ( ( rule__DropTableStatement__TableAssignment_3_1 ) ) )
            // InternalSql_dsl.g:3063:1: ( ( rule__DropTableStatement__TableAssignment_3_1 ) )
            {
            // InternalSql_dsl.g:3063:1: ( ( rule__DropTableStatement__TableAssignment_3_1 ) )
            // InternalSql_dsl.g:3064:2: ( rule__DropTableStatement__TableAssignment_3_1 )
            {
             before(grammarAccess.getDropTableStatementAccess().getTableAssignment_3_1()); 
            // InternalSql_dsl.g:3065:2: ( rule__DropTableStatement__TableAssignment_3_1 )
            // InternalSql_dsl.g:3065:3: rule__DropTableStatement__TableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DropTableStatement__TableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDropTableStatementAccess().getTableAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__Group_3__1__Impl"


    // $ANTLR start "rule__TruncateTableStatement__Group__0"
    // InternalSql_dsl.g:3074:1: rule__TruncateTableStatement__Group__0 : rule__TruncateTableStatement__Group__0__Impl rule__TruncateTableStatement__Group__1 ;
    public final void rule__TruncateTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3078:1: ( rule__TruncateTableStatement__Group__0__Impl rule__TruncateTableStatement__Group__1 )
            // InternalSql_dsl.g:3079:2: rule__TruncateTableStatement__Group__0__Impl rule__TruncateTableStatement__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__TruncateTableStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group__0"


    // $ANTLR start "rule__TruncateTableStatement__Group__0__Impl"
    // InternalSql_dsl.g:3086:1: rule__TruncateTableStatement__Group__0__Impl : ( 'TRUNCATE' ) ;
    public final void rule__TruncateTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3090:1: ( ( 'TRUNCATE' ) )
            // InternalSql_dsl.g:3091:1: ( 'TRUNCATE' )
            {
            // InternalSql_dsl.g:3091:1: ( 'TRUNCATE' )
            // InternalSql_dsl.g:3092:2: 'TRUNCATE'
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTRUNCATEKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTruncateTableStatementAccess().getTRUNCATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group__0__Impl"


    // $ANTLR start "rule__TruncateTableStatement__Group__1"
    // InternalSql_dsl.g:3101:1: rule__TruncateTableStatement__Group__1 : rule__TruncateTableStatement__Group__1__Impl rule__TruncateTableStatement__Group__2 ;
    public final void rule__TruncateTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3105:1: ( rule__TruncateTableStatement__Group__1__Impl rule__TruncateTableStatement__Group__2 )
            // InternalSql_dsl.g:3106:2: rule__TruncateTableStatement__Group__1__Impl rule__TruncateTableStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__TruncateTableStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group__1"


    // $ANTLR start "rule__TruncateTableStatement__Group__1__Impl"
    // InternalSql_dsl.g:3113:1: rule__TruncateTableStatement__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TruncateTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3117:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:3118:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:3118:1: ( 'TABLE' )
            // InternalSql_dsl.g:3119:2: 'TABLE'
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTABLEKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTruncateTableStatementAccess().getTABLEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group__1__Impl"


    // $ANTLR start "rule__TruncateTableStatement__Group__2"
    // InternalSql_dsl.g:3128:1: rule__TruncateTableStatement__Group__2 : rule__TruncateTableStatement__Group__2__Impl rule__TruncateTableStatement__Group__3 ;
    public final void rule__TruncateTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3132:1: ( rule__TruncateTableStatement__Group__2__Impl rule__TruncateTableStatement__Group__3 )
            // InternalSql_dsl.g:3133:2: rule__TruncateTableStatement__Group__2__Impl rule__TruncateTableStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TruncateTableStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group__2"


    // $ANTLR start "rule__TruncateTableStatement__Group__2__Impl"
    // InternalSql_dsl.g:3140:1: rule__TruncateTableStatement__Group__2__Impl : ( ( rule__TruncateTableStatement__TableAssignment_2 ) ) ;
    public final void rule__TruncateTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3144:1: ( ( ( rule__TruncateTableStatement__TableAssignment_2 ) ) )
            // InternalSql_dsl.g:3145:1: ( ( rule__TruncateTableStatement__TableAssignment_2 ) )
            {
            // InternalSql_dsl.g:3145:1: ( ( rule__TruncateTableStatement__TableAssignment_2 ) )
            // InternalSql_dsl.g:3146:2: ( rule__TruncateTableStatement__TableAssignment_2 )
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTableAssignment_2()); 
            // InternalSql_dsl.g:3147:2: ( rule__TruncateTableStatement__TableAssignment_2 )
            // InternalSql_dsl.g:3147:3: rule__TruncateTableStatement__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTruncateTableStatementAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group__2__Impl"


    // $ANTLR start "rule__TruncateTableStatement__Group__3"
    // InternalSql_dsl.g:3155:1: rule__TruncateTableStatement__Group__3 : rule__TruncateTableStatement__Group__3__Impl ;
    public final void rule__TruncateTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3159:1: ( rule__TruncateTableStatement__Group__3__Impl )
            // InternalSql_dsl.g:3160:2: rule__TruncateTableStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group__3"


    // $ANTLR start "rule__TruncateTableStatement__Group__3__Impl"
    // InternalSql_dsl.g:3166:1: rule__TruncateTableStatement__Group__3__Impl : ( ( rule__TruncateTableStatement__Group_3__0 )* ) ;
    public final void rule__TruncateTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3170:1: ( ( ( rule__TruncateTableStatement__Group_3__0 )* ) )
            // InternalSql_dsl.g:3171:1: ( ( rule__TruncateTableStatement__Group_3__0 )* )
            {
            // InternalSql_dsl.g:3171:1: ( ( rule__TruncateTableStatement__Group_3__0 )* )
            // InternalSql_dsl.g:3172:2: ( rule__TruncateTableStatement__Group_3__0 )*
            {
             before(grammarAccess.getTruncateTableStatementAccess().getGroup_3()); 
            // InternalSql_dsl.g:3173:2: ( rule__TruncateTableStatement__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==29) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSql_dsl.g:3173:3: rule__TruncateTableStatement__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TruncateTableStatement__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getTruncateTableStatementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group__3__Impl"


    // $ANTLR start "rule__TruncateTableStatement__Group_3__0"
    // InternalSql_dsl.g:3182:1: rule__TruncateTableStatement__Group_3__0 : rule__TruncateTableStatement__Group_3__0__Impl rule__TruncateTableStatement__Group_3__1 ;
    public final void rule__TruncateTableStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3186:1: ( rule__TruncateTableStatement__Group_3__0__Impl rule__TruncateTableStatement__Group_3__1 )
            // InternalSql_dsl.g:3187:2: rule__TruncateTableStatement__Group_3__0__Impl rule__TruncateTableStatement__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__TruncateTableStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group_3__0"


    // $ANTLR start "rule__TruncateTableStatement__Group_3__0__Impl"
    // InternalSql_dsl.g:3194:1: rule__TruncateTableStatement__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TruncateTableStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3198:1: ( ( ',' ) )
            // InternalSql_dsl.g:3199:1: ( ',' )
            {
            // InternalSql_dsl.g:3199:1: ( ',' )
            // InternalSql_dsl.g:3200:2: ','
            {
             before(grammarAccess.getTruncateTableStatementAccess().getCommaKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTruncateTableStatementAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group_3__0__Impl"


    // $ANTLR start "rule__TruncateTableStatement__Group_3__1"
    // InternalSql_dsl.g:3209:1: rule__TruncateTableStatement__Group_3__1 : rule__TruncateTableStatement__Group_3__1__Impl ;
    public final void rule__TruncateTableStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3213:1: ( rule__TruncateTableStatement__Group_3__1__Impl )
            // InternalSql_dsl.g:3214:2: rule__TruncateTableStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group_3__1"


    // $ANTLR start "rule__TruncateTableStatement__Group_3__1__Impl"
    // InternalSql_dsl.g:3220:1: rule__TruncateTableStatement__Group_3__1__Impl : ( ( rule__TruncateTableStatement__TableAssignment_3_1 ) ) ;
    public final void rule__TruncateTableStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3224:1: ( ( ( rule__TruncateTableStatement__TableAssignment_3_1 ) ) )
            // InternalSql_dsl.g:3225:1: ( ( rule__TruncateTableStatement__TableAssignment_3_1 ) )
            {
            // InternalSql_dsl.g:3225:1: ( ( rule__TruncateTableStatement__TableAssignment_3_1 ) )
            // InternalSql_dsl.g:3226:2: ( rule__TruncateTableStatement__TableAssignment_3_1 )
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTableAssignment_3_1()); 
            // InternalSql_dsl.g:3227:2: ( rule__TruncateTableStatement__TableAssignment_3_1 )
            // InternalSql_dsl.g:3227:3: rule__TruncateTableStatement__TableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__TableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTruncateTableStatementAccess().getTableAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__Group_3__1__Impl"


    // $ANTLR start "rule__DeleteTableStatement__Group__0"
    // InternalSql_dsl.g:3236:1: rule__DeleteTableStatement__Group__0 : rule__DeleteTableStatement__Group__0__Impl rule__DeleteTableStatement__Group__1 ;
    public final void rule__DeleteTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3240:1: ( rule__DeleteTableStatement__Group__0__Impl rule__DeleteTableStatement__Group__1 )
            // InternalSql_dsl.g:3241:2: rule__DeleteTableStatement__Group__0__Impl rule__DeleteTableStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DeleteTableStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteTableStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteTableStatement__Group__0"


    // $ANTLR start "rule__DeleteTableStatement__Group__0__Impl"
    // InternalSql_dsl.g:3248:1: rule__DeleteTableStatement__Group__0__Impl : ( 'DELETE' ) ;
    public final void rule__DeleteTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3252:1: ( ( 'DELETE' ) )
            // InternalSql_dsl.g:3253:1: ( 'DELETE' )
            {
            // InternalSql_dsl.g:3253:1: ( 'DELETE' )
            // InternalSql_dsl.g:3254:2: 'DELETE'
            {
             before(grammarAccess.getDeleteTableStatementAccess().getDELETEKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDeleteTableStatementAccess().getDELETEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteTableStatement__Group__0__Impl"


    // $ANTLR start "rule__DeleteTableStatement__Group__1"
    // InternalSql_dsl.g:3263:1: rule__DeleteTableStatement__Group__1 : rule__DeleteTableStatement__Group__1__Impl ;
    public final void rule__DeleteTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3267:1: ( rule__DeleteTableStatement__Group__1__Impl )
            // InternalSql_dsl.g:3268:2: rule__DeleteTableStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteTableStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteTableStatement__Group__1"


    // $ANTLR start "rule__DeleteTableStatement__Group__1__Impl"
    // InternalSql_dsl.g:3274:1: rule__DeleteTableStatement__Group__1__Impl : ( ( rule__DeleteTableStatement__XAssignment_1 ) ) ;
    public final void rule__DeleteTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3278:1: ( ( ( rule__DeleteTableStatement__XAssignment_1 ) ) )
            // InternalSql_dsl.g:3279:1: ( ( rule__DeleteTableStatement__XAssignment_1 ) )
            {
            // InternalSql_dsl.g:3279:1: ( ( rule__DeleteTableStatement__XAssignment_1 ) )
            // InternalSql_dsl.g:3280:2: ( rule__DeleteTableStatement__XAssignment_1 )
            {
             before(grammarAccess.getDeleteTableStatementAccess().getXAssignment_1()); 
            // InternalSql_dsl.g:3281:2: ( rule__DeleteTableStatement__XAssignment_1 )
            // InternalSql_dsl.g:3281:3: rule__DeleteTableStatement__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeleteTableStatement__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteTableStatementAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteTableStatement__Group__1__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group__0"
    // InternalSql_dsl.g:3290:1: rule__UpdateTableStatement__Group__0 : rule__UpdateTableStatement__Group__0__Impl rule__UpdateTableStatement__Group__1 ;
    public final void rule__UpdateTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3294:1: ( rule__UpdateTableStatement__Group__0__Impl rule__UpdateTableStatement__Group__1 )
            // InternalSql_dsl.g:3295:2: rule__UpdateTableStatement__Group__0__Impl rule__UpdateTableStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__UpdateTableStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__0"


    // $ANTLR start "rule__UpdateTableStatement__Group__0__Impl"
    // InternalSql_dsl.g:3302:1: rule__UpdateTableStatement__Group__0__Impl : ( 'UPDATE' ) ;
    public final void rule__UpdateTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3306:1: ( ( 'UPDATE' ) )
            // InternalSql_dsl.g:3307:1: ( 'UPDATE' )
            {
            // InternalSql_dsl.g:3307:1: ( 'UPDATE' )
            // InternalSql_dsl.g:3308:2: 'UPDATE'
            {
             before(grammarAccess.getUpdateTableStatementAccess().getUPDATEKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUpdateTableStatementAccess().getUPDATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__0__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group__1"
    // InternalSql_dsl.g:3317:1: rule__UpdateTableStatement__Group__1 : rule__UpdateTableStatement__Group__1__Impl rule__UpdateTableStatement__Group__2 ;
    public final void rule__UpdateTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3321:1: ( rule__UpdateTableStatement__Group__1__Impl rule__UpdateTableStatement__Group__2 )
            // InternalSql_dsl.g:3322:2: rule__UpdateTableStatement__Group__1__Impl rule__UpdateTableStatement__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__UpdateTableStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__1"


    // $ANTLR start "rule__UpdateTableStatement__Group__1__Impl"
    // InternalSql_dsl.g:3329:1: rule__UpdateTableStatement__Group__1__Impl : ( ( rule__UpdateTableStatement__TableAssignment_1 ) ) ;
    public final void rule__UpdateTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3333:1: ( ( ( rule__UpdateTableStatement__TableAssignment_1 ) ) )
            // InternalSql_dsl.g:3334:1: ( ( rule__UpdateTableStatement__TableAssignment_1 ) )
            {
            // InternalSql_dsl.g:3334:1: ( ( rule__UpdateTableStatement__TableAssignment_1 ) )
            // InternalSql_dsl.g:3335:2: ( rule__UpdateTableStatement__TableAssignment_1 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getTableAssignment_1()); 
            // InternalSql_dsl.g:3336:2: ( rule__UpdateTableStatement__TableAssignment_1 )
            // InternalSql_dsl.g:3336:3: rule__UpdateTableStatement__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__TableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateTableStatementAccess().getTableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__1__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group__2"
    // InternalSql_dsl.g:3344:1: rule__UpdateTableStatement__Group__2 : rule__UpdateTableStatement__Group__2__Impl rule__UpdateTableStatement__Group__3 ;
    public final void rule__UpdateTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3348:1: ( rule__UpdateTableStatement__Group__2__Impl rule__UpdateTableStatement__Group__3 )
            // InternalSql_dsl.g:3349:2: rule__UpdateTableStatement__Group__2__Impl rule__UpdateTableStatement__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__UpdateTableStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__2"


    // $ANTLR start "rule__UpdateTableStatement__Group__2__Impl"
    // InternalSql_dsl.g:3356:1: rule__UpdateTableStatement__Group__2__Impl : ( 'SET' ) ;
    public final void rule__UpdateTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3360:1: ( ( 'SET' ) )
            // InternalSql_dsl.g:3361:1: ( 'SET' )
            {
            // InternalSql_dsl.g:3361:1: ( 'SET' )
            // InternalSql_dsl.g:3362:2: 'SET'
            {
             before(grammarAccess.getUpdateTableStatementAccess().getSETKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUpdateTableStatementAccess().getSETKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__2__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group__3"
    // InternalSql_dsl.g:3371:1: rule__UpdateTableStatement__Group__3 : rule__UpdateTableStatement__Group__3__Impl rule__UpdateTableStatement__Group__4 ;
    public final void rule__UpdateTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3375:1: ( rule__UpdateTableStatement__Group__3__Impl rule__UpdateTableStatement__Group__4 )
            // InternalSql_dsl.g:3376:2: rule__UpdateTableStatement__Group__3__Impl rule__UpdateTableStatement__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__UpdateTableStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__3"


    // $ANTLR start "rule__UpdateTableStatement__Group__3__Impl"
    // InternalSql_dsl.g:3383:1: rule__UpdateTableStatement__Group__3__Impl : ( ( rule__UpdateTableStatement__ScAssignment_3 ) ) ;
    public final void rule__UpdateTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3387:1: ( ( ( rule__UpdateTableStatement__ScAssignment_3 ) ) )
            // InternalSql_dsl.g:3388:1: ( ( rule__UpdateTableStatement__ScAssignment_3 ) )
            {
            // InternalSql_dsl.g:3388:1: ( ( rule__UpdateTableStatement__ScAssignment_3 ) )
            // InternalSql_dsl.g:3389:2: ( rule__UpdateTableStatement__ScAssignment_3 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getScAssignment_3()); 
            // InternalSql_dsl.g:3390:2: ( rule__UpdateTableStatement__ScAssignment_3 )
            // InternalSql_dsl.g:3390:3: rule__UpdateTableStatement__ScAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__ScAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateTableStatementAccess().getScAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__3__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group__4"
    // InternalSql_dsl.g:3398:1: rule__UpdateTableStatement__Group__4 : rule__UpdateTableStatement__Group__4__Impl rule__UpdateTableStatement__Group__5 ;
    public final void rule__UpdateTableStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3402:1: ( rule__UpdateTableStatement__Group__4__Impl rule__UpdateTableStatement__Group__5 )
            // InternalSql_dsl.g:3403:2: rule__UpdateTableStatement__Group__4__Impl rule__UpdateTableStatement__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__UpdateTableStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__4"


    // $ANTLR start "rule__UpdateTableStatement__Group__4__Impl"
    // InternalSql_dsl.g:3410:1: rule__UpdateTableStatement__Group__4__Impl : ( ( rule__UpdateTableStatement__Group_4__0 )* ) ;
    public final void rule__UpdateTableStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3414:1: ( ( ( rule__UpdateTableStatement__Group_4__0 )* ) )
            // InternalSql_dsl.g:3415:1: ( ( rule__UpdateTableStatement__Group_4__0 )* )
            {
            // InternalSql_dsl.g:3415:1: ( ( rule__UpdateTableStatement__Group_4__0 )* )
            // InternalSql_dsl.g:3416:2: ( rule__UpdateTableStatement__Group_4__0 )*
            {
             before(grammarAccess.getUpdateTableStatementAccess().getGroup_4()); 
            // InternalSql_dsl.g:3417:2: ( rule__UpdateTableStatement__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==29) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSql_dsl.g:3417:3: rule__UpdateTableStatement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__UpdateTableStatement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getUpdateTableStatementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__4__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group__5"
    // InternalSql_dsl.g:3425:1: rule__UpdateTableStatement__Group__5 : rule__UpdateTableStatement__Group__5__Impl ;
    public final void rule__UpdateTableStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3429:1: ( rule__UpdateTableStatement__Group__5__Impl )
            // InternalSql_dsl.g:3430:2: rule__UpdateTableStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__5"


    // $ANTLR start "rule__UpdateTableStatement__Group__5__Impl"
    // InternalSql_dsl.g:3436:1: rule__UpdateTableStatement__Group__5__Impl : ( ( rule__UpdateTableStatement__Group_5__0 )? ) ;
    public final void rule__UpdateTableStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3440:1: ( ( ( rule__UpdateTableStatement__Group_5__0 )? ) )
            // InternalSql_dsl.g:3441:1: ( ( rule__UpdateTableStatement__Group_5__0 )? )
            {
            // InternalSql_dsl.g:3441:1: ( ( rule__UpdateTableStatement__Group_5__0 )? )
            // InternalSql_dsl.g:3442:2: ( rule__UpdateTableStatement__Group_5__0 )?
            {
             before(grammarAccess.getUpdateTableStatementAccess().getGroup_5()); 
            // InternalSql_dsl.g:3443:2: ( rule__UpdateTableStatement__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSql_dsl.g:3443:3: rule__UpdateTableStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateTableStatement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateTableStatementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group__5__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group_4__0"
    // InternalSql_dsl.g:3452:1: rule__UpdateTableStatement__Group_4__0 : rule__UpdateTableStatement__Group_4__0__Impl rule__UpdateTableStatement__Group_4__1 ;
    public final void rule__UpdateTableStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3456:1: ( rule__UpdateTableStatement__Group_4__0__Impl rule__UpdateTableStatement__Group_4__1 )
            // InternalSql_dsl.g:3457:2: rule__UpdateTableStatement__Group_4__0__Impl rule__UpdateTableStatement__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__UpdateTableStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_4__0"


    // $ANTLR start "rule__UpdateTableStatement__Group_4__0__Impl"
    // InternalSql_dsl.g:3464:1: rule__UpdateTableStatement__Group_4__0__Impl : ( ',' ) ;
    public final void rule__UpdateTableStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3468:1: ( ( ',' ) )
            // InternalSql_dsl.g:3469:1: ( ',' )
            {
            // InternalSql_dsl.g:3469:1: ( ',' )
            // InternalSql_dsl.g:3470:2: ','
            {
             before(grammarAccess.getUpdateTableStatementAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getUpdateTableStatementAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_4__0__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group_4__1"
    // InternalSql_dsl.g:3479:1: rule__UpdateTableStatement__Group_4__1 : rule__UpdateTableStatement__Group_4__1__Impl ;
    public final void rule__UpdateTableStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3483:1: ( rule__UpdateTableStatement__Group_4__1__Impl )
            // InternalSql_dsl.g:3484:2: rule__UpdateTableStatement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_4__1"


    // $ANTLR start "rule__UpdateTableStatement__Group_4__1__Impl"
    // InternalSql_dsl.g:3490:1: rule__UpdateTableStatement__Group_4__1__Impl : ( ( rule__UpdateTableStatement__ScAssignment_4_1 ) ) ;
    public final void rule__UpdateTableStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3494:1: ( ( ( rule__UpdateTableStatement__ScAssignment_4_1 ) ) )
            // InternalSql_dsl.g:3495:1: ( ( rule__UpdateTableStatement__ScAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:3495:1: ( ( rule__UpdateTableStatement__ScAssignment_4_1 ) )
            // InternalSql_dsl.g:3496:2: ( rule__UpdateTableStatement__ScAssignment_4_1 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getScAssignment_4_1()); 
            // InternalSql_dsl.g:3497:2: ( rule__UpdateTableStatement__ScAssignment_4_1 )
            // InternalSql_dsl.g:3497:3: rule__UpdateTableStatement__ScAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__ScAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateTableStatementAccess().getScAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_4__1__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group_5__0"
    // InternalSql_dsl.g:3506:1: rule__UpdateTableStatement__Group_5__0 : rule__UpdateTableStatement__Group_5__0__Impl rule__UpdateTableStatement__Group_5__1 ;
    public final void rule__UpdateTableStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3510:1: ( rule__UpdateTableStatement__Group_5__0__Impl rule__UpdateTableStatement__Group_5__1 )
            // InternalSql_dsl.g:3511:2: rule__UpdateTableStatement__Group_5__0__Impl rule__UpdateTableStatement__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__UpdateTableStatement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5__0"


    // $ANTLR start "rule__UpdateTableStatement__Group_5__0__Impl"
    // InternalSql_dsl.g:3518:1: rule__UpdateTableStatement__Group_5__0__Impl : ( 'WHERE' ) ;
    public final void rule__UpdateTableStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3522:1: ( ( 'WHERE' ) )
            // InternalSql_dsl.g:3523:1: ( 'WHERE' )
            {
            // InternalSql_dsl.g:3523:1: ( 'WHERE' )
            // InternalSql_dsl.g:3524:2: 'WHERE'
            {
             before(grammarAccess.getUpdateTableStatementAccess().getWHEREKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUpdateTableStatementAccess().getWHEREKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5__0__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group_5__1"
    // InternalSql_dsl.g:3533:1: rule__UpdateTableStatement__Group_5__1 : rule__UpdateTableStatement__Group_5__1__Impl rule__UpdateTableStatement__Group_5__2 ;
    public final void rule__UpdateTableStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3537:1: ( rule__UpdateTableStatement__Group_5__1__Impl rule__UpdateTableStatement__Group_5__2 )
            // InternalSql_dsl.g:3538:2: rule__UpdateTableStatement__Group_5__1__Impl rule__UpdateTableStatement__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__UpdateTableStatement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5__1"


    // $ANTLR start "rule__UpdateTableStatement__Group_5__1__Impl"
    // InternalSql_dsl.g:3545:1: rule__UpdateTableStatement__Group_5__1__Impl : ( ( rule__UpdateTableStatement__ZAssignment_5_1 ) ) ;
    public final void rule__UpdateTableStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3549:1: ( ( ( rule__UpdateTableStatement__ZAssignment_5_1 ) ) )
            // InternalSql_dsl.g:3550:1: ( ( rule__UpdateTableStatement__ZAssignment_5_1 ) )
            {
            // InternalSql_dsl.g:3550:1: ( ( rule__UpdateTableStatement__ZAssignment_5_1 ) )
            // InternalSql_dsl.g:3551:2: ( rule__UpdateTableStatement__ZAssignment_5_1 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getZAssignment_5_1()); 
            // InternalSql_dsl.g:3552:2: ( rule__UpdateTableStatement__ZAssignment_5_1 )
            // InternalSql_dsl.g:3552:3: rule__UpdateTableStatement__ZAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__ZAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateTableStatementAccess().getZAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5__1__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group_5__2"
    // InternalSql_dsl.g:3560:1: rule__UpdateTableStatement__Group_5__2 : rule__UpdateTableStatement__Group_5__2__Impl ;
    public final void rule__UpdateTableStatement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3564:1: ( rule__UpdateTableStatement__Group_5__2__Impl )
            // InternalSql_dsl.g:3565:2: rule__UpdateTableStatement__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5__2"


    // $ANTLR start "rule__UpdateTableStatement__Group_5__2__Impl"
    // InternalSql_dsl.g:3571:1: rule__UpdateTableStatement__Group_5__2__Impl : ( ( rule__UpdateTableStatement__Group_5_2__0 )* ) ;
    public final void rule__UpdateTableStatement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3575:1: ( ( ( rule__UpdateTableStatement__Group_5_2__0 )* ) )
            // InternalSql_dsl.g:3576:1: ( ( rule__UpdateTableStatement__Group_5_2__0 )* )
            {
            // InternalSql_dsl.g:3576:1: ( ( rule__UpdateTableStatement__Group_5_2__0 )* )
            // InternalSql_dsl.g:3577:2: ( rule__UpdateTableStatement__Group_5_2__0 )*
            {
             before(grammarAccess.getUpdateTableStatementAccess().getGroup_5_2()); 
            // InternalSql_dsl.g:3578:2: ( rule__UpdateTableStatement__Group_5_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=12 && LA29_0<=13)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSql_dsl.g:3578:3: rule__UpdateTableStatement__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UpdateTableStatement__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getUpdateTableStatementAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5__2__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group_5_2__0"
    // InternalSql_dsl.g:3587:1: rule__UpdateTableStatement__Group_5_2__0 : rule__UpdateTableStatement__Group_5_2__0__Impl rule__UpdateTableStatement__Group_5_2__1 ;
    public final void rule__UpdateTableStatement__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3591:1: ( rule__UpdateTableStatement__Group_5_2__0__Impl rule__UpdateTableStatement__Group_5_2__1 )
            // InternalSql_dsl.g:3592:2: rule__UpdateTableStatement__Group_5_2__0__Impl rule__UpdateTableStatement__Group_5_2__1
            {
            pushFollow(FOLLOW_10);
            rule__UpdateTableStatement__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5_2__0"


    // $ANTLR start "rule__UpdateTableStatement__Group_5_2__0__Impl"
    // InternalSql_dsl.g:3599:1: rule__UpdateTableStatement__Group_5_2__0__Impl : ( ( rule__UpdateTableStatement__Alternatives_5_2_0 ) ) ;
    public final void rule__UpdateTableStatement__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3603:1: ( ( ( rule__UpdateTableStatement__Alternatives_5_2_0 ) ) )
            // InternalSql_dsl.g:3604:1: ( ( rule__UpdateTableStatement__Alternatives_5_2_0 ) )
            {
            // InternalSql_dsl.g:3604:1: ( ( rule__UpdateTableStatement__Alternatives_5_2_0 ) )
            // InternalSql_dsl.g:3605:2: ( rule__UpdateTableStatement__Alternatives_5_2_0 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getAlternatives_5_2_0()); 
            // InternalSql_dsl.g:3606:2: ( rule__UpdateTableStatement__Alternatives_5_2_0 )
            // InternalSql_dsl.g:3606:3: rule__UpdateTableStatement__Alternatives_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Alternatives_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateTableStatementAccess().getAlternatives_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5_2__0__Impl"


    // $ANTLR start "rule__UpdateTableStatement__Group_5_2__1"
    // InternalSql_dsl.g:3614:1: rule__UpdateTableStatement__Group_5_2__1 : rule__UpdateTableStatement__Group_5_2__1__Impl ;
    public final void rule__UpdateTableStatement__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3618:1: ( rule__UpdateTableStatement__Group_5_2__1__Impl )
            // InternalSql_dsl.g:3619:2: rule__UpdateTableStatement__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5_2__1"


    // $ANTLR start "rule__UpdateTableStatement__Group_5_2__1__Impl"
    // InternalSql_dsl.g:3625:1: rule__UpdateTableStatement__Group_5_2__1__Impl : ( ( rule__UpdateTableStatement__ZAssignment_5_2_1 ) ) ;
    public final void rule__UpdateTableStatement__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3629:1: ( ( ( rule__UpdateTableStatement__ZAssignment_5_2_1 ) ) )
            // InternalSql_dsl.g:3630:1: ( ( rule__UpdateTableStatement__ZAssignment_5_2_1 ) )
            {
            // InternalSql_dsl.g:3630:1: ( ( rule__UpdateTableStatement__ZAssignment_5_2_1 ) )
            // InternalSql_dsl.g:3631:2: ( rule__UpdateTableStatement__ZAssignment_5_2_1 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getZAssignment_5_2_1()); 
            // InternalSql_dsl.g:3632:2: ( rule__UpdateTableStatement__ZAssignment_5_2_1 )
            // InternalSql_dsl.g:3632:3: rule__UpdateTableStatement__ZAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateTableStatement__ZAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateTableStatementAccess().getZAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__Group_5_2__1__Impl"


    // $ANTLR start "rule__SetClause__Group__0"
    // InternalSql_dsl.g:3641:1: rule__SetClause__Group__0 : rule__SetClause__Group__0__Impl rule__SetClause__Group__1 ;
    public final void rule__SetClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3645:1: ( rule__SetClause__Group__0__Impl rule__SetClause__Group__1 )
            // InternalSql_dsl.g:3646:2: rule__SetClause__Group__0__Impl rule__SetClause__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__SetClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group__0"


    // $ANTLR start "rule__SetClause__Group__0__Impl"
    // InternalSql_dsl.g:3653:1: rule__SetClause__Group__0__Impl : ( ( rule__SetClause__ColumnAssignment_0 ) ) ;
    public final void rule__SetClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3657:1: ( ( ( rule__SetClause__ColumnAssignment_0 ) ) )
            // InternalSql_dsl.g:3658:1: ( ( rule__SetClause__ColumnAssignment_0 ) )
            {
            // InternalSql_dsl.g:3658:1: ( ( rule__SetClause__ColumnAssignment_0 ) )
            // InternalSql_dsl.g:3659:2: ( rule__SetClause__ColumnAssignment_0 )
            {
             before(grammarAccess.getSetClauseAccess().getColumnAssignment_0()); 
            // InternalSql_dsl.g:3660:2: ( rule__SetClause__ColumnAssignment_0 )
            // InternalSql_dsl.g:3660:3: rule__SetClause__ColumnAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__ColumnAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetClauseAccess().getColumnAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group__0__Impl"


    // $ANTLR start "rule__SetClause__Group__1"
    // InternalSql_dsl.g:3668:1: rule__SetClause__Group__1 : rule__SetClause__Group__1__Impl rule__SetClause__Group__2 ;
    public final void rule__SetClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3672:1: ( rule__SetClause__Group__1__Impl rule__SetClause__Group__2 )
            // InternalSql_dsl.g:3673:2: rule__SetClause__Group__1__Impl rule__SetClause__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__SetClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group__1"


    // $ANTLR start "rule__SetClause__Group__1__Impl"
    // InternalSql_dsl.g:3680:1: rule__SetClause__Group__1__Impl : ( '=' ) ;
    public final void rule__SetClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3684:1: ( ( '=' ) )
            // InternalSql_dsl.g:3685:1: ( '=' )
            {
            // InternalSql_dsl.g:3685:1: ( '=' )
            // InternalSql_dsl.g:3686:2: '='
            {
             before(grammarAccess.getSetClauseAccess().getEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSetClauseAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group__1__Impl"


    // $ANTLR start "rule__SetClause__Group__2"
    // InternalSql_dsl.g:3695:1: rule__SetClause__Group__2 : rule__SetClause__Group__2__Impl ;
    public final void rule__SetClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3699:1: ( rule__SetClause__Group__2__Impl )
            // InternalSql_dsl.g:3700:2: rule__SetClause__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group__2"


    // $ANTLR start "rule__SetClause__Group__2__Impl"
    // InternalSql_dsl.g:3706:1: rule__SetClause__Group__2__Impl : ( ( rule__SetClause__Alternatives_2 ) ) ;
    public final void rule__SetClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3710:1: ( ( ( rule__SetClause__Alternatives_2 ) ) )
            // InternalSql_dsl.g:3711:1: ( ( rule__SetClause__Alternatives_2 ) )
            {
            // InternalSql_dsl.g:3711:1: ( ( rule__SetClause__Alternatives_2 ) )
            // InternalSql_dsl.g:3712:2: ( rule__SetClause__Alternatives_2 )
            {
             before(grammarAccess.getSetClauseAccess().getAlternatives_2()); 
            // InternalSql_dsl.g:3713:2: ( rule__SetClause__Alternatives_2 )
            // InternalSql_dsl.g:3713:3: rule__SetClause__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSetClauseAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group__2__Impl"


    // $ANTLR start "rule__SetClause__Group_2_0__0"
    // InternalSql_dsl.g:3722:1: rule__SetClause__Group_2_0__0 : rule__SetClause__Group_2_0__0__Impl rule__SetClause__Group_2_0__1 ;
    public final void rule__SetClause__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3726:1: ( rule__SetClause__Group_2_0__0__Impl rule__SetClause__Group_2_0__1 )
            // InternalSql_dsl.g:3727:2: rule__SetClause__Group_2_0__0__Impl rule__SetClause__Group_2_0__1
            {
            pushFollow(FOLLOW_10);
            rule__SetClause__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetClause__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group_2_0__0"


    // $ANTLR start "rule__SetClause__Group_2_0__0__Impl"
    // InternalSql_dsl.g:3734:1: rule__SetClause__Group_2_0__0__Impl : ( '#' ) ;
    public final void rule__SetClause__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3738:1: ( ( '#' ) )
            // InternalSql_dsl.g:3739:1: ( '#' )
            {
            // InternalSql_dsl.g:3739:1: ( '#' )
            // InternalSql_dsl.g:3740:2: '#'
            {
             before(grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group_2_0__0__Impl"


    // $ANTLR start "rule__SetClause__Group_2_0__1"
    // InternalSql_dsl.g:3749:1: rule__SetClause__Group_2_0__1 : rule__SetClause__Group_2_0__1__Impl rule__SetClause__Group_2_0__2 ;
    public final void rule__SetClause__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3753:1: ( rule__SetClause__Group_2_0__1__Impl rule__SetClause__Group_2_0__2 )
            // InternalSql_dsl.g:3754:2: rule__SetClause__Group_2_0__1__Impl rule__SetClause__Group_2_0__2
            {
            pushFollow(FOLLOW_16);
            rule__SetClause__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetClause__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group_2_0__1"


    // $ANTLR start "rule__SetClause__Group_2_0__1__Impl"
    // InternalSql_dsl.g:3761:1: rule__SetClause__Group_2_0__1__Impl : ( ( rule__SetClause__NameAssignment_2_0_1 ) ) ;
    public final void rule__SetClause__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3765:1: ( ( ( rule__SetClause__NameAssignment_2_0_1 ) ) )
            // InternalSql_dsl.g:3766:1: ( ( rule__SetClause__NameAssignment_2_0_1 ) )
            {
            // InternalSql_dsl.g:3766:1: ( ( rule__SetClause__NameAssignment_2_0_1 ) )
            // InternalSql_dsl.g:3767:2: ( rule__SetClause__NameAssignment_2_0_1 )
            {
             before(grammarAccess.getSetClauseAccess().getNameAssignment_2_0_1()); 
            // InternalSql_dsl.g:3768:2: ( rule__SetClause__NameAssignment_2_0_1 )
            // InternalSql_dsl.g:3768:3: rule__SetClause__NameAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__NameAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSetClauseAccess().getNameAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group_2_0__1__Impl"


    // $ANTLR start "rule__SetClause__Group_2_0__2"
    // InternalSql_dsl.g:3776:1: rule__SetClause__Group_2_0__2 : rule__SetClause__Group_2_0__2__Impl ;
    public final void rule__SetClause__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3780:1: ( rule__SetClause__Group_2_0__2__Impl )
            // InternalSql_dsl.g:3781:2: rule__SetClause__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetClause__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group_2_0__2"


    // $ANTLR start "rule__SetClause__Group_2_0__2__Impl"
    // InternalSql_dsl.g:3787:1: rule__SetClause__Group_2_0__2__Impl : ( '#' ) ;
    public final void rule__SetClause__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3791:1: ( ( '#' ) )
            // InternalSql_dsl.g:3792:1: ( '#' )
            {
            // InternalSql_dsl.g:3792:1: ( '#' )
            // InternalSql_dsl.g:3793:2: '#'
            {
             before(grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSetClauseAccess().getNumberSignKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group_2_0__2__Impl"


    // $ANTLR start "rule__AlterTableStatement__Group__0"
    // InternalSql_dsl.g:3803:1: rule__AlterTableStatement__Group__0 : rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1 ;
    public final void rule__AlterTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3807:1: ( rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1 )
            // InternalSql_dsl.g:3808:2: rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__AlterTableStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlterTableStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__Group__0"


    // $ANTLR start "rule__AlterTableStatement__Group__0__Impl"
    // InternalSql_dsl.g:3815:1: rule__AlterTableStatement__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__AlterTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3819:1: ( ( 'ALTER' ) )
            // InternalSql_dsl.g:3820:1: ( 'ALTER' )
            {
            // InternalSql_dsl.g:3820:1: ( 'ALTER' )
            // InternalSql_dsl.g:3821:2: 'ALTER'
            {
             before(grammarAccess.getAlterTableStatementAccess().getALTERKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAlterTableStatementAccess().getALTERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__Group__0__Impl"


    // $ANTLR start "rule__AlterTableStatement__Group__1"
    // InternalSql_dsl.g:3830:1: rule__AlterTableStatement__Group__1 : rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2 ;
    public final void rule__AlterTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3834:1: ( rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2 )
            // InternalSql_dsl.g:3835:2: rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AlterTableStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlterTableStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__Group__1"


    // $ANTLR start "rule__AlterTableStatement__Group__1__Impl"
    // InternalSql_dsl.g:3842:1: rule__AlterTableStatement__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__AlterTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3846:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:3847:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:3847:1: ( 'TABLE' )
            // InternalSql_dsl.g:3848:2: 'TABLE'
            {
             before(grammarAccess.getAlterTableStatementAccess().getTABLEKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAlterTableStatementAccess().getTABLEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__Group__1__Impl"


    // $ANTLR start "rule__AlterTableStatement__Group__2"
    // InternalSql_dsl.g:3857:1: rule__AlterTableStatement__Group__2 : rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3 ;
    public final void rule__AlterTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3861:1: ( rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3 )
            // InternalSql_dsl.g:3862:2: rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__AlterTableStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlterTableStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__Group__2"


    // $ANTLR start "rule__AlterTableStatement__Group__2__Impl"
    // InternalSql_dsl.g:3869:1: rule__AlterTableStatement__Group__2__Impl : ( ( rule__AlterTableStatement__TableAssignment_2 ) ) ;
    public final void rule__AlterTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3873:1: ( ( ( rule__AlterTableStatement__TableAssignment_2 ) ) )
            // InternalSql_dsl.g:3874:1: ( ( rule__AlterTableStatement__TableAssignment_2 ) )
            {
            // InternalSql_dsl.g:3874:1: ( ( rule__AlterTableStatement__TableAssignment_2 ) )
            // InternalSql_dsl.g:3875:2: ( rule__AlterTableStatement__TableAssignment_2 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getTableAssignment_2()); 
            // InternalSql_dsl.g:3876:2: ( rule__AlterTableStatement__TableAssignment_2 )
            // InternalSql_dsl.g:3876:3: rule__AlterTableStatement__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AlterTableStatement__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlterTableStatementAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__Group__2__Impl"


    // $ANTLR start "rule__AlterTableStatement__Group__3"
    // InternalSql_dsl.g:3884:1: rule__AlterTableStatement__Group__3 : rule__AlterTableStatement__Group__3__Impl ;
    public final void rule__AlterTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3888:1: ( rule__AlterTableStatement__Group__3__Impl )
            // InternalSql_dsl.g:3889:2: rule__AlterTableStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlterTableStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__Group__3"


    // $ANTLR start "rule__AlterTableStatement__Group__3__Impl"
    // InternalSql_dsl.g:3895:1: rule__AlterTableStatement__Group__3__Impl : ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) ) ;
    public final void rule__AlterTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3899:1: ( ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) ) )
            // InternalSql_dsl.g:3900:1: ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) )
            {
            // InternalSql_dsl.g:3900:1: ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) )
            // InternalSql_dsl.g:3901:2: ( rule__AlterTableStatement__AddDropUpdateAssignment_3 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAssignment_3()); 
            // InternalSql_dsl.g:3902:2: ( rule__AlterTableStatement__AddDropUpdateAssignment_3 )
            // InternalSql_dsl.g:3902:3: rule__AlterTableStatement__AddDropUpdateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AlterTableStatement__AddDropUpdateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__Group__3__Impl"


    // $ANTLR start "rule__AlterDropStatement__Group__0"
    // InternalSql_dsl.g:3911:1: rule__AlterDropStatement__Group__0 : rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1 ;
    public final void rule__AlterDropStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3915:1: ( rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1 )
            // InternalSql_dsl.g:3916:2: rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__AlterDropStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlterDropStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterDropStatement__Group__0"


    // $ANTLR start "rule__AlterDropStatement__Group__0__Impl"
    // InternalSql_dsl.g:3923:1: rule__AlterDropStatement__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__AlterDropStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3927:1: ( ( 'DROP' ) )
            // InternalSql_dsl.g:3928:1: ( 'DROP' )
            {
            // InternalSql_dsl.g:3928:1: ( 'DROP' )
            // InternalSql_dsl.g:3929:2: 'DROP'
            {
             before(grammarAccess.getAlterDropStatementAccess().getDROPKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAlterDropStatementAccess().getDROPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterDropStatement__Group__0__Impl"


    // $ANTLR start "rule__AlterDropStatement__Group__1"
    // InternalSql_dsl.g:3938:1: rule__AlterDropStatement__Group__1 : rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2 ;
    public final void rule__AlterDropStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3942:1: ( rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2 )
            // InternalSql_dsl.g:3943:2: rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AlterDropStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlterDropStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterDropStatement__Group__1"


    // $ANTLR start "rule__AlterDropStatement__Group__1__Impl"
    // InternalSql_dsl.g:3950:1: rule__AlterDropStatement__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__AlterDropStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3954:1: ( ( 'COLUMN' ) )
            // InternalSql_dsl.g:3955:1: ( 'COLUMN' )
            {
            // InternalSql_dsl.g:3955:1: ( 'COLUMN' )
            // InternalSql_dsl.g:3956:2: 'COLUMN'
            {
             before(grammarAccess.getAlterDropStatementAccess().getCOLUMNKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAlterDropStatementAccess().getCOLUMNKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterDropStatement__Group__1__Impl"


    // $ANTLR start "rule__AlterDropStatement__Group__2"
    // InternalSql_dsl.g:3965:1: rule__AlterDropStatement__Group__2 : rule__AlterDropStatement__Group__2__Impl ;
    public final void rule__AlterDropStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3969:1: ( rule__AlterDropStatement__Group__2__Impl )
            // InternalSql_dsl.g:3970:2: rule__AlterDropStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlterDropStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterDropStatement__Group__2"


    // $ANTLR start "rule__AlterDropStatement__Group__2__Impl"
    // InternalSql_dsl.g:3976:1: rule__AlterDropStatement__Group__2__Impl : ( ( rule__AlterDropStatement__ColumnAssignment_2 ) ) ;
    public final void rule__AlterDropStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3980:1: ( ( ( rule__AlterDropStatement__ColumnAssignment_2 ) ) )
            // InternalSql_dsl.g:3981:1: ( ( rule__AlterDropStatement__ColumnAssignment_2 ) )
            {
            // InternalSql_dsl.g:3981:1: ( ( rule__AlterDropStatement__ColumnAssignment_2 ) )
            // InternalSql_dsl.g:3982:2: ( rule__AlterDropStatement__ColumnAssignment_2 )
            {
             before(grammarAccess.getAlterDropStatementAccess().getColumnAssignment_2()); 
            // InternalSql_dsl.g:3983:2: ( rule__AlterDropStatement__ColumnAssignment_2 )
            // InternalSql_dsl.g:3983:3: rule__AlterDropStatement__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AlterDropStatement__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlterDropStatementAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterDropStatement__Group__2__Impl"


    // $ANTLR start "rule__AlterAddStatement__Group__0"
    // InternalSql_dsl.g:3992:1: rule__AlterAddStatement__Group__0 : rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1 ;
    public final void rule__AlterAddStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3996:1: ( rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1 )
            // InternalSql_dsl.g:3997:2: rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AlterAddStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlterAddStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterAddStatement__Group__0"


    // $ANTLR start "rule__AlterAddStatement__Group__0__Impl"
    // InternalSql_dsl.g:4004:1: rule__AlterAddStatement__Group__0__Impl : ( 'ADD' ) ;
    public final void rule__AlterAddStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4008:1: ( ( 'ADD' ) )
            // InternalSql_dsl.g:4009:1: ( 'ADD' )
            {
            // InternalSql_dsl.g:4009:1: ( 'ADD' )
            // InternalSql_dsl.g:4010:2: 'ADD'
            {
             before(grammarAccess.getAlterAddStatementAccess().getADDKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAlterAddStatementAccess().getADDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterAddStatement__Group__0__Impl"


    // $ANTLR start "rule__AlterAddStatement__Group__1"
    // InternalSql_dsl.g:4019:1: rule__AlterAddStatement__Group__1 : rule__AlterAddStatement__Group__1__Impl ;
    public final void rule__AlterAddStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4023:1: ( rule__AlterAddStatement__Group__1__Impl )
            // InternalSql_dsl.g:4024:2: rule__AlterAddStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlterAddStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterAddStatement__Group__1"


    // $ANTLR start "rule__AlterAddStatement__Group__1__Impl"
    // InternalSql_dsl.g:4030:1: rule__AlterAddStatement__Group__1__Impl : ( ( rule__AlterAddStatement__ColumnAssignment_1 ) ) ;
    public final void rule__AlterAddStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4034:1: ( ( ( rule__AlterAddStatement__ColumnAssignment_1 ) ) )
            // InternalSql_dsl.g:4035:1: ( ( rule__AlterAddStatement__ColumnAssignment_1 ) )
            {
            // InternalSql_dsl.g:4035:1: ( ( rule__AlterAddStatement__ColumnAssignment_1 ) )
            // InternalSql_dsl.g:4036:2: ( rule__AlterAddStatement__ColumnAssignment_1 )
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnAssignment_1()); 
            // InternalSql_dsl.g:4037:2: ( rule__AlterAddStatement__ColumnAssignment_1 )
            // InternalSql_dsl.g:4037:3: rule__AlterAddStatement__ColumnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AlterAddStatement__ColumnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlterAddStatementAccess().getColumnAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterAddStatement__Group__1__Impl"


    // $ANTLR start "rule__AlterUpdateStatement__Group__0"
    // InternalSql_dsl.g:4046:1: rule__AlterUpdateStatement__Group__0 : rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1 ;
    public final void rule__AlterUpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4050:1: ( rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1 )
            // InternalSql_dsl.g:4051:2: rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__AlterUpdateStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlterUpdateStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterUpdateStatement__Group__0"


    // $ANTLR start "rule__AlterUpdateStatement__Group__0__Impl"
    // InternalSql_dsl.g:4058:1: rule__AlterUpdateStatement__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__AlterUpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4062:1: ( ( 'ALTER' ) )
            // InternalSql_dsl.g:4063:1: ( 'ALTER' )
            {
            // InternalSql_dsl.g:4063:1: ( 'ALTER' )
            // InternalSql_dsl.g:4064:2: 'ALTER'
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getALTERKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAlterUpdateStatementAccess().getALTERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterUpdateStatement__Group__0__Impl"


    // $ANTLR start "rule__AlterUpdateStatement__Group__1"
    // InternalSql_dsl.g:4073:1: rule__AlterUpdateStatement__Group__1 : rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2 ;
    public final void rule__AlterUpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4077:1: ( rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2 )
            // InternalSql_dsl.g:4078:2: rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AlterUpdateStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlterUpdateStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterUpdateStatement__Group__1"


    // $ANTLR start "rule__AlterUpdateStatement__Group__1__Impl"
    // InternalSql_dsl.g:4085:1: rule__AlterUpdateStatement__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__AlterUpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4089:1: ( ( 'COLUMN' ) )
            // InternalSql_dsl.g:4090:1: ( 'COLUMN' )
            {
            // InternalSql_dsl.g:4090:1: ( 'COLUMN' )
            // InternalSql_dsl.g:4091:2: 'COLUMN'
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getCOLUMNKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAlterUpdateStatementAccess().getCOLUMNKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterUpdateStatement__Group__1__Impl"


    // $ANTLR start "rule__AlterUpdateStatement__Group__2"
    // InternalSql_dsl.g:4100:1: rule__AlterUpdateStatement__Group__2 : rule__AlterUpdateStatement__Group__2__Impl ;
    public final void rule__AlterUpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4104:1: ( rule__AlterUpdateStatement__Group__2__Impl )
            // InternalSql_dsl.g:4105:2: rule__AlterUpdateStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlterUpdateStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterUpdateStatement__Group__2"


    // $ANTLR start "rule__AlterUpdateStatement__Group__2__Impl"
    // InternalSql_dsl.g:4111:1: rule__AlterUpdateStatement__Group__2__Impl : ( ( rule__AlterUpdateStatement__ColumnAssignment_2 ) ) ;
    public final void rule__AlterUpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4115:1: ( ( ( rule__AlterUpdateStatement__ColumnAssignment_2 ) ) )
            // InternalSql_dsl.g:4116:1: ( ( rule__AlterUpdateStatement__ColumnAssignment_2 ) )
            {
            // InternalSql_dsl.g:4116:1: ( ( rule__AlterUpdateStatement__ColumnAssignment_2 ) )
            // InternalSql_dsl.g:4117:2: ( rule__AlterUpdateStatement__ColumnAssignment_2 )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getColumnAssignment_2()); 
            // InternalSql_dsl.g:4118:2: ( rule__AlterUpdateStatement__ColumnAssignment_2 )
            // InternalSql_dsl.g:4118:3: rule__AlterUpdateStatement__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AlterUpdateStatement__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlterUpdateStatementAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterUpdateStatement__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclarationStatement__Group__0"
    // InternalSql_dsl.g:4127:1: rule__VariableDeclarationStatement__Group__0 : rule__VariableDeclarationStatement__Group__0__Impl rule__VariableDeclarationStatement__Group__1 ;
    public final void rule__VariableDeclarationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4131:1: ( rule__VariableDeclarationStatement__Group__0__Impl rule__VariableDeclarationStatement__Group__1 )
            // InternalSql_dsl.g:4132:2: rule__VariableDeclarationStatement__Group__0__Impl rule__VariableDeclarationStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__VariableDeclarationStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclarationStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__Group__0"


    // $ANTLR start "rule__VariableDeclarationStatement__Group__0__Impl"
    // InternalSql_dsl.g:4139:1: rule__VariableDeclarationStatement__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclarationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4143:1: ( ( 'var' ) )
            // InternalSql_dsl.g:4144:1: ( 'var' )
            {
            // InternalSql_dsl.g:4144:1: ( 'var' )
            // InternalSql_dsl.g:4145:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getVarKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationStatementAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclarationStatement__Group__1"
    // InternalSql_dsl.g:4154:1: rule__VariableDeclarationStatement__Group__1 : rule__VariableDeclarationStatement__Group__1__Impl rule__VariableDeclarationStatement__Group__2 ;
    public final void rule__VariableDeclarationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4158:1: ( rule__VariableDeclarationStatement__Group__1__Impl rule__VariableDeclarationStatement__Group__2 )
            // InternalSql_dsl.g:4159:2: rule__VariableDeclarationStatement__Group__1__Impl rule__VariableDeclarationStatement__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__VariableDeclarationStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclarationStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__Group__1"


    // $ANTLR start "rule__VariableDeclarationStatement__Group__1__Impl"
    // InternalSql_dsl.g:4166:1: rule__VariableDeclarationStatement__Group__1__Impl : ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclarationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4170:1: ( ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) ) )
            // InternalSql_dsl.g:4171:1: ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) )
            {
            // InternalSql_dsl.g:4171:1: ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) )
            // InternalSql_dsl.g:4172:2: ( rule__VariableDeclarationStatement__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getNameAssignment_1()); 
            // InternalSql_dsl.g:4173:2: ( rule__VariableDeclarationStatement__NameAssignment_1 )
            // InternalSql_dsl.g:4173:3: rule__VariableDeclarationStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclarationStatement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclarationStatement__Group__2"
    // InternalSql_dsl.g:4181:1: rule__VariableDeclarationStatement__Group__2 : rule__VariableDeclarationStatement__Group__2__Impl rule__VariableDeclarationStatement__Group__3 ;
    public final void rule__VariableDeclarationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4185:1: ( rule__VariableDeclarationStatement__Group__2__Impl rule__VariableDeclarationStatement__Group__3 )
            // InternalSql_dsl.g:4186:2: rule__VariableDeclarationStatement__Group__2__Impl rule__VariableDeclarationStatement__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__VariableDeclarationStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclarationStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__Group__2"


    // $ANTLR start "rule__VariableDeclarationStatement__Group__2__Impl"
    // InternalSql_dsl.g:4193:1: rule__VariableDeclarationStatement__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclarationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4197:1: ( ( '=' ) )
            // InternalSql_dsl.g:4198:1: ( '=' )
            {
            // InternalSql_dsl.g:4198:1: ( '=' )
            // InternalSql_dsl.g:4199:2: '='
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationStatementAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclarationStatement__Group__3"
    // InternalSql_dsl.g:4208:1: rule__VariableDeclarationStatement__Group__3 : rule__VariableDeclarationStatement__Group__3__Impl ;
    public final void rule__VariableDeclarationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4212:1: ( rule__VariableDeclarationStatement__Group__3__Impl )
            // InternalSql_dsl.g:4213:2: rule__VariableDeclarationStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclarationStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__Group__3"


    // $ANTLR start "rule__VariableDeclarationStatement__Group__3__Impl"
    // InternalSql_dsl.g:4219:1: rule__VariableDeclarationStatement__Group__3__Impl : ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclarationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4223:1: ( ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) ) )
            // InternalSql_dsl.g:4224:1: ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) )
            {
            // InternalSql_dsl.g:4224:1: ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) )
            // InternalSql_dsl.g:4225:2: ( rule__VariableDeclarationStatement__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getValueAssignment_3()); 
            // InternalSql_dsl.g:4226:2: ( rule__VariableDeclarationStatement__ValueAssignment_3 )
            // InternalSql_dsl.g:4226:3: rule__VariableDeclarationStatement__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclarationStatement__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationStatementAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__Group__3__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalSql_dsl.g:4235:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4239:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalSql_dsl.g:4240:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalSql_dsl.g:4247:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4251:1: ( ( ( RULE_INT )? ) )
            // InternalSql_dsl.g:4252:1: ( ( RULE_INT )? )
            {
            // InternalSql_dsl.g:4252:1: ( ( RULE_INT )? )
            // InternalSql_dsl.g:4253:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalSql_dsl.g:4254:2: ( RULE_INT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSql_dsl.g:4254:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalSql_dsl.g:4262:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4266:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalSql_dsl.g:4267:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalSql_dsl.g:4274:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4278:1: ( ( '.' ) )
            // InternalSql_dsl.g:4279:1: ( '.' )
            {
            // InternalSql_dsl.g:4279:1: ( '.' )
            // InternalSql_dsl.g:4280:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalSql_dsl.g:4289:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4293:1: ( rule__REAL__Group__2__Impl )
            // InternalSql_dsl.g:4294:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalSql_dsl.g:4300:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4304:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:4305:1: ( RULE_INT )
            {
            // InternalSql_dsl.g:4305:1: ( RULE_INT )
            // InternalSql_dsl.g:4306:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__CountFunction__Group__0"
    // InternalSql_dsl.g:4316:1: rule__CountFunction__Group__0 : rule__CountFunction__Group__0__Impl rule__CountFunction__Group__1 ;
    public final void rule__CountFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4320:1: ( rule__CountFunction__Group__0__Impl rule__CountFunction__Group__1 )
            // InternalSql_dsl.g:4321:2: rule__CountFunction__Group__0__Impl rule__CountFunction__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__CountFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__0"


    // $ANTLR start "rule__CountFunction__Group__0__Impl"
    // InternalSql_dsl.g:4328:1: rule__CountFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__CountFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4332:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4333:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4333:1: ( 'SELECT' )
            // InternalSql_dsl.g:4334:2: 'SELECT'
            {
             before(grammarAccess.getCountFunctionAccess().getSELECTKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCountFunctionAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__0__Impl"


    // $ANTLR start "rule__CountFunction__Group__1"
    // InternalSql_dsl.g:4343:1: rule__CountFunction__Group__1 : rule__CountFunction__Group__1__Impl rule__CountFunction__Group__2 ;
    public final void rule__CountFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4347:1: ( rule__CountFunction__Group__1__Impl rule__CountFunction__Group__2 )
            // InternalSql_dsl.g:4348:2: rule__CountFunction__Group__1__Impl rule__CountFunction__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__CountFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__1"


    // $ANTLR start "rule__CountFunction__Group__1__Impl"
    // InternalSql_dsl.g:4355:1: rule__CountFunction__Group__1__Impl : ( 'COUNT' ) ;
    public final void rule__CountFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4359:1: ( ( 'COUNT' ) )
            // InternalSql_dsl.g:4360:1: ( 'COUNT' )
            {
            // InternalSql_dsl.g:4360:1: ( 'COUNT' )
            // InternalSql_dsl.g:4361:2: 'COUNT'
            {
             before(grammarAccess.getCountFunctionAccess().getCOUNTKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCountFunctionAccess().getCOUNTKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__1__Impl"


    // $ANTLR start "rule__CountFunction__Group__2"
    // InternalSql_dsl.g:4370:1: rule__CountFunction__Group__2 : rule__CountFunction__Group__2__Impl rule__CountFunction__Group__3 ;
    public final void rule__CountFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4374:1: ( rule__CountFunction__Group__2__Impl rule__CountFunction__Group__3 )
            // InternalSql_dsl.g:4375:2: rule__CountFunction__Group__2__Impl rule__CountFunction__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__CountFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__2"


    // $ANTLR start "rule__CountFunction__Group__2__Impl"
    // InternalSql_dsl.g:4382:1: rule__CountFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__CountFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4386:1: ( ( '(' ) )
            // InternalSql_dsl.g:4387:1: ( '(' )
            {
            // InternalSql_dsl.g:4387:1: ( '(' )
            // InternalSql_dsl.g:4388:2: '('
            {
             before(grammarAccess.getCountFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCountFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__2__Impl"


    // $ANTLR start "rule__CountFunction__Group__3"
    // InternalSql_dsl.g:4397:1: rule__CountFunction__Group__3 : rule__CountFunction__Group__3__Impl rule__CountFunction__Group__4 ;
    public final void rule__CountFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4401:1: ( rule__CountFunction__Group__3__Impl rule__CountFunction__Group__4 )
            // InternalSql_dsl.g:4402:2: rule__CountFunction__Group__3__Impl rule__CountFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__CountFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__3"


    // $ANTLR start "rule__CountFunction__Group__3__Impl"
    // InternalSql_dsl.g:4409:1: rule__CountFunction__Group__3__Impl : ( ( rule__CountFunction__ColumnAssignment_3 ) ) ;
    public final void rule__CountFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4413:1: ( ( ( rule__CountFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:4414:1: ( ( rule__CountFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:4414:1: ( ( rule__CountFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:4415:2: ( rule__CountFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getCountFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:4416:2: ( rule__CountFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:4416:3: rule__CountFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CountFunction__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCountFunctionAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__3__Impl"


    // $ANTLR start "rule__CountFunction__Group__4"
    // InternalSql_dsl.g:4424:1: rule__CountFunction__Group__4 : rule__CountFunction__Group__4__Impl rule__CountFunction__Group__5 ;
    public final void rule__CountFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4428:1: ( rule__CountFunction__Group__4__Impl rule__CountFunction__Group__5 )
            // InternalSql_dsl.g:4429:2: rule__CountFunction__Group__4__Impl rule__CountFunction__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__CountFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__4"


    // $ANTLR start "rule__CountFunction__Group__4__Impl"
    // InternalSql_dsl.g:4436:1: rule__CountFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__CountFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4440:1: ( ( ')' ) )
            // InternalSql_dsl.g:4441:1: ( ')' )
            {
            // InternalSql_dsl.g:4441:1: ( ')' )
            // InternalSql_dsl.g:4442:2: ')'
            {
             before(grammarAccess.getCountFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCountFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__4__Impl"


    // $ANTLR start "rule__CountFunction__Group__5"
    // InternalSql_dsl.g:4451:1: rule__CountFunction__Group__5 : rule__CountFunction__Group__5__Impl ;
    public final void rule__CountFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4455:1: ( rule__CountFunction__Group__5__Impl )
            // InternalSql_dsl.g:4456:2: rule__CountFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountFunction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__5"


    // $ANTLR start "rule__CountFunction__Group__5__Impl"
    // InternalSql_dsl.g:4462:1: rule__CountFunction__Group__5__Impl : ( ( rule__CountFunction__XAssignment_5 ) ) ;
    public final void rule__CountFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4466:1: ( ( ( rule__CountFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:4467:1: ( ( rule__CountFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:4467:1: ( ( rule__CountFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:4468:2: ( rule__CountFunction__XAssignment_5 )
            {
             before(grammarAccess.getCountFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:4469:2: ( rule__CountFunction__XAssignment_5 )
            // InternalSql_dsl.g:4469:3: rule__CountFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CountFunction__XAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCountFunctionAccess().getXAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__Group__5__Impl"


    // $ANTLR start "rule__AvgFunction__Group__0"
    // InternalSql_dsl.g:4478:1: rule__AvgFunction__Group__0 : rule__AvgFunction__Group__0__Impl rule__AvgFunction__Group__1 ;
    public final void rule__AvgFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4482:1: ( rule__AvgFunction__Group__0__Impl rule__AvgFunction__Group__1 )
            // InternalSql_dsl.g:4483:2: rule__AvgFunction__Group__0__Impl rule__AvgFunction__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__AvgFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__0"


    // $ANTLR start "rule__AvgFunction__Group__0__Impl"
    // InternalSql_dsl.g:4490:1: rule__AvgFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__AvgFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4494:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4495:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4495:1: ( 'SELECT' )
            // InternalSql_dsl.g:4496:2: 'SELECT'
            {
             before(grammarAccess.getAvgFunctionAccess().getSELECTKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAvgFunctionAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__0__Impl"


    // $ANTLR start "rule__AvgFunction__Group__1"
    // InternalSql_dsl.g:4505:1: rule__AvgFunction__Group__1 : rule__AvgFunction__Group__1__Impl rule__AvgFunction__Group__2 ;
    public final void rule__AvgFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4509:1: ( rule__AvgFunction__Group__1__Impl rule__AvgFunction__Group__2 )
            // InternalSql_dsl.g:4510:2: rule__AvgFunction__Group__1__Impl rule__AvgFunction__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__AvgFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__1"


    // $ANTLR start "rule__AvgFunction__Group__1__Impl"
    // InternalSql_dsl.g:4517:1: rule__AvgFunction__Group__1__Impl : ( 'AVG' ) ;
    public final void rule__AvgFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4521:1: ( ( 'AVG' ) )
            // InternalSql_dsl.g:4522:1: ( 'AVG' )
            {
            // InternalSql_dsl.g:4522:1: ( 'AVG' )
            // InternalSql_dsl.g:4523:2: 'AVG'
            {
             before(grammarAccess.getAvgFunctionAccess().getAVGKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAvgFunctionAccess().getAVGKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__1__Impl"


    // $ANTLR start "rule__AvgFunction__Group__2"
    // InternalSql_dsl.g:4532:1: rule__AvgFunction__Group__2 : rule__AvgFunction__Group__2__Impl rule__AvgFunction__Group__3 ;
    public final void rule__AvgFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4536:1: ( rule__AvgFunction__Group__2__Impl rule__AvgFunction__Group__3 )
            // InternalSql_dsl.g:4537:2: rule__AvgFunction__Group__2__Impl rule__AvgFunction__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__AvgFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__2"


    // $ANTLR start "rule__AvgFunction__Group__2__Impl"
    // InternalSql_dsl.g:4544:1: rule__AvgFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__AvgFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4548:1: ( ( '(' ) )
            // InternalSql_dsl.g:4549:1: ( '(' )
            {
            // InternalSql_dsl.g:4549:1: ( '(' )
            // InternalSql_dsl.g:4550:2: '('
            {
             before(grammarAccess.getAvgFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAvgFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__2__Impl"


    // $ANTLR start "rule__AvgFunction__Group__3"
    // InternalSql_dsl.g:4559:1: rule__AvgFunction__Group__3 : rule__AvgFunction__Group__3__Impl rule__AvgFunction__Group__4 ;
    public final void rule__AvgFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4563:1: ( rule__AvgFunction__Group__3__Impl rule__AvgFunction__Group__4 )
            // InternalSql_dsl.g:4564:2: rule__AvgFunction__Group__3__Impl rule__AvgFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__AvgFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__3"


    // $ANTLR start "rule__AvgFunction__Group__3__Impl"
    // InternalSql_dsl.g:4571:1: rule__AvgFunction__Group__3__Impl : ( ( rule__AvgFunction__ColumnAssignment_3 ) ) ;
    public final void rule__AvgFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4575:1: ( ( ( rule__AvgFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:4576:1: ( ( rule__AvgFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:4576:1: ( ( rule__AvgFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:4577:2: ( rule__AvgFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getAvgFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:4578:2: ( rule__AvgFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:4578:3: rule__AvgFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AvgFunction__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAvgFunctionAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__3__Impl"


    // $ANTLR start "rule__AvgFunction__Group__4"
    // InternalSql_dsl.g:4586:1: rule__AvgFunction__Group__4 : rule__AvgFunction__Group__4__Impl rule__AvgFunction__Group__5 ;
    public final void rule__AvgFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4590:1: ( rule__AvgFunction__Group__4__Impl rule__AvgFunction__Group__5 )
            // InternalSql_dsl.g:4591:2: rule__AvgFunction__Group__4__Impl rule__AvgFunction__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AvgFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__4"


    // $ANTLR start "rule__AvgFunction__Group__4__Impl"
    // InternalSql_dsl.g:4598:1: rule__AvgFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__AvgFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4602:1: ( ( ')' ) )
            // InternalSql_dsl.g:4603:1: ( ')' )
            {
            // InternalSql_dsl.g:4603:1: ( ')' )
            // InternalSql_dsl.g:4604:2: ')'
            {
             before(grammarAccess.getAvgFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAvgFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__4__Impl"


    // $ANTLR start "rule__AvgFunction__Group__5"
    // InternalSql_dsl.g:4613:1: rule__AvgFunction__Group__5 : rule__AvgFunction__Group__5__Impl ;
    public final void rule__AvgFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4617:1: ( rule__AvgFunction__Group__5__Impl )
            // InternalSql_dsl.g:4618:2: rule__AvgFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AvgFunction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__5"


    // $ANTLR start "rule__AvgFunction__Group__5__Impl"
    // InternalSql_dsl.g:4624:1: rule__AvgFunction__Group__5__Impl : ( ( rule__AvgFunction__XAssignment_5 ) ) ;
    public final void rule__AvgFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4628:1: ( ( ( rule__AvgFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:4629:1: ( ( rule__AvgFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:4629:1: ( ( rule__AvgFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:4630:2: ( rule__AvgFunction__XAssignment_5 )
            {
             before(grammarAccess.getAvgFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:4631:2: ( rule__AvgFunction__XAssignment_5 )
            // InternalSql_dsl.g:4631:3: rule__AvgFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AvgFunction__XAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAvgFunctionAccess().getXAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__Group__5__Impl"


    // $ANTLR start "rule__SumFunction__Group__0"
    // InternalSql_dsl.g:4640:1: rule__SumFunction__Group__0 : rule__SumFunction__Group__0__Impl rule__SumFunction__Group__1 ;
    public final void rule__SumFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4644:1: ( rule__SumFunction__Group__0__Impl rule__SumFunction__Group__1 )
            // InternalSql_dsl.g:4645:2: rule__SumFunction__Group__0__Impl rule__SumFunction__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__SumFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__0"


    // $ANTLR start "rule__SumFunction__Group__0__Impl"
    // InternalSql_dsl.g:4652:1: rule__SumFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SumFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4656:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4657:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4657:1: ( 'SELECT' )
            // InternalSql_dsl.g:4658:2: 'SELECT'
            {
             before(grammarAccess.getSumFunctionAccess().getSELECTKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSumFunctionAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__0__Impl"


    // $ANTLR start "rule__SumFunction__Group__1"
    // InternalSql_dsl.g:4667:1: rule__SumFunction__Group__1 : rule__SumFunction__Group__1__Impl rule__SumFunction__Group__2 ;
    public final void rule__SumFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4671:1: ( rule__SumFunction__Group__1__Impl rule__SumFunction__Group__2 )
            // InternalSql_dsl.g:4672:2: rule__SumFunction__Group__1__Impl rule__SumFunction__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__SumFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__1"


    // $ANTLR start "rule__SumFunction__Group__1__Impl"
    // InternalSql_dsl.g:4679:1: rule__SumFunction__Group__1__Impl : ( 'SUM' ) ;
    public final void rule__SumFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4683:1: ( ( 'SUM' ) )
            // InternalSql_dsl.g:4684:1: ( 'SUM' )
            {
            // InternalSql_dsl.g:4684:1: ( 'SUM' )
            // InternalSql_dsl.g:4685:2: 'SUM'
            {
             before(grammarAccess.getSumFunctionAccess().getSUMKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSumFunctionAccess().getSUMKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__1__Impl"


    // $ANTLR start "rule__SumFunction__Group__2"
    // InternalSql_dsl.g:4694:1: rule__SumFunction__Group__2 : rule__SumFunction__Group__2__Impl rule__SumFunction__Group__3 ;
    public final void rule__SumFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4698:1: ( rule__SumFunction__Group__2__Impl rule__SumFunction__Group__3 )
            // InternalSql_dsl.g:4699:2: rule__SumFunction__Group__2__Impl rule__SumFunction__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SumFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__2"


    // $ANTLR start "rule__SumFunction__Group__2__Impl"
    // InternalSql_dsl.g:4706:1: rule__SumFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__SumFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4710:1: ( ( '(' ) )
            // InternalSql_dsl.g:4711:1: ( '(' )
            {
            // InternalSql_dsl.g:4711:1: ( '(' )
            // InternalSql_dsl.g:4712:2: '('
            {
             before(grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__2__Impl"


    // $ANTLR start "rule__SumFunction__Group__3"
    // InternalSql_dsl.g:4721:1: rule__SumFunction__Group__3 : rule__SumFunction__Group__3__Impl rule__SumFunction__Group__4 ;
    public final void rule__SumFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4725:1: ( rule__SumFunction__Group__3__Impl rule__SumFunction__Group__4 )
            // InternalSql_dsl.g:4726:2: rule__SumFunction__Group__3__Impl rule__SumFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__SumFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__3"


    // $ANTLR start "rule__SumFunction__Group__3__Impl"
    // InternalSql_dsl.g:4733:1: rule__SumFunction__Group__3__Impl : ( ( rule__SumFunction__ColumnAssignment_3 ) ) ;
    public final void rule__SumFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4737:1: ( ( ( rule__SumFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:4738:1: ( ( rule__SumFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:4738:1: ( ( rule__SumFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:4739:2: ( rule__SumFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getSumFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:4740:2: ( rule__SumFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:4740:3: rule__SumFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SumFunction__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSumFunctionAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__3__Impl"


    // $ANTLR start "rule__SumFunction__Group__4"
    // InternalSql_dsl.g:4748:1: rule__SumFunction__Group__4 : rule__SumFunction__Group__4__Impl rule__SumFunction__Group__5 ;
    public final void rule__SumFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4752:1: ( rule__SumFunction__Group__4__Impl rule__SumFunction__Group__5 )
            // InternalSql_dsl.g:4753:2: rule__SumFunction__Group__4__Impl rule__SumFunction__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SumFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__4"


    // $ANTLR start "rule__SumFunction__Group__4__Impl"
    // InternalSql_dsl.g:4760:1: rule__SumFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__SumFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4764:1: ( ( ')' ) )
            // InternalSql_dsl.g:4765:1: ( ')' )
            {
            // InternalSql_dsl.g:4765:1: ( ')' )
            // InternalSql_dsl.g:4766:2: ')'
            {
             before(grammarAccess.getSumFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSumFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__4__Impl"


    // $ANTLR start "rule__SumFunction__Group__5"
    // InternalSql_dsl.g:4775:1: rule__SumFunction__Group__5 : rule__SumFunction__Group__5__Impl ;
    public final void rule__SumFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4779:1: ( rule__SumFunction__Group__5__Impl )
            // InternalSql_dsl.g:4780:2: rule__SumFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SumFunction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__5"


    // $ANTLR start "rule__SumFunction__Group__5__Impl"
    // InternalSql_dsl.g:4786:1: rule__SumFunction__Group__5__Impl : ( ( rule__SumFunction__XAssignment_5 ) ) ;
    public final void rule__SumFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4790:1: ( ( ( rule__SumFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:4791:1: ( ( rule__SumFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:4791:1: ( ( rule__SumFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:4792:2: ( rule__SumFunction__XAssignment_5 )
            {
             before(grammarAccess.getSumFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:4793:2: ( rule__SumFunction__XAssignment_5 )
            // InternalSql_dsl.g:4793:3: rule__SumFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SumFunction__XAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSumFunctionAccess().getXAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__Group__5__Impl"


    // $ANTLR start "rule__MinFunction__Group__0"
    // InternalSql_dsl.g:4802:1: rule__MinFunction__Group__0 : rule__MinFunction__Group__0__Impl rule__MinFunction__Group__1 ;
    public final void rule__MinFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4806:1: ( rule__MinFunction__Group__0__Impl rule__MinFunction__Group__1 )
            // InternalSql_dsl.g:4807:2: rule__MinFunction__Group__0__Impl rule__MinFunction__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__MinFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__0"


    // $ANTLR start "rule__MinFunction__Group__0__Impl"
    // InternalSql_dsl.g:4814:1: rule__MinFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__MinFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4818:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4819:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4819:1: ( 'SELECT' )
            // InternalSql_dsl.g:4820:2: 'SELECT'
            {
             before(grammarAccess.getMinFunctionAccess().getSELECTKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMinFunctionAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__0__Impl"


    // $ANTLR start "rule__MinFunction__Group__1"
    // InternalSql_dsl.g:4829:1: rule__MinFunction__Group__1 : rule__MinFunction__Group__1__Impl rule__MinFunction__Group__2 ;
    public final void rule__MinFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4833:1: ( rule__MinFunction__Group__1__Impl rule__MinFunction__Group__2 )
            // InternalSql_dsl.g:4834:2: rule__MinFunction__Group__1__Impl rule__MinFunction__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__MinFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__1"


    // $ANTLR start "rule__MinFunction__Group__1__Impl"
    // InternalSql_dsl.g:4841:1: rule__MinFunction__Group__1__Impl : ( 'MIN' ) ;
    public final void rule__MinFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4845:1: ( ( 'MIN' ) )
            // InternalSql_dsl.g:4846:1: ( 'MIN' )
            {
            // InternalSql_dsl.g:4846:1: ( 'MIN' )
            // InternalSql_dsl.g:4847:2: 'MIN'
            {
             before(grammarAccess.getMinFunctionAccess().getMINKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMinFunctionAccess().getMINKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__1__Impl"


    // $ANTLR start "rule__MinFunction__Group__2"
    // InternalSql_dsl.g:4856:1: rule__MinFunction__Group__2 : rule__MinFunction__Group__2__Impl rule__MinFunction__Group__3 ;
    public final void rule__MinFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4860:1: ( rule__MinFunction__Group__2__Impl rule__MinFunction__Group__3 )
            // InternalSql_dsl.g:4861:2: rule__MinFunction__Group__2__Impl rule__MinFunction__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MinFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__2"


    // $ANTLR start "rule__MinFunction__Group__2__Impl"
    // InternalSql_dsl.g:4868:1: rule__MinFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__MinFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4872:1: ( ( '(' ) )
            // InternalSql_dsl.g:4873:1: ( '(' )
            {
            // InternalSql_dsl.g:4873:1: ( '(' )
            // InternalSql_dsl.g:4874:2: '('
            {
             before(grammarAccess.getMinFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMinFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__2__Impl"


    // $ANTLR start "rule__MinFunction__Group__3"
    // InternalSql_dsl.g:4883:1: rule__MinFunction__Group__3 : rule__MinFunction__Group__3__Impl rule__MinFunction__Group__4 ;
    public final void rule__MinFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4887:1: ( rule__MinFunction__Group__3__Impl rule__MinFunction__Group__4 )
            // InternalSql_dsl.g:4888:2: rule__MinFunction__Group__3__Impl rule__MinFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__MinFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__3"


    // $ANTLR start "rule__MinFunction__Group__3__Impl"
    // InternalSql_dsl.g:4895:1: rule__MinFunction__Group__3__Impl : ( ( rule__MinFunction__ColumnAssignment_3 ) ) ;
    public final void rule__MinFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4899:1: ( ( ( rule__MinFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:4900:1: ( ( rule__MinFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:4900:1: ( ( rule__MinFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:4901:2: ( rule__MinFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getMinFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:4902:2: ( rule__MinFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:4902:3: rule__MinFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MinFunction__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMinFunctionAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__3__Impl"


    // $ANTLR start "rule__MinFunction__Group__4"
    // InternalSql_dsl.g:4910:1: rule__MinFunction__Group__4 : rule__MinFunction__Group__4__Impl rule__MinFunction__Group__5 ;
    public final void rule__MinFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4914:1: ( rule__MinFunction__Group__4__Impl rule__MinFunction__Group__5 )
            // InternalSql_dsl.g:4915:2: rule__MinFunction__Group__4__Impl rule__MinFunction__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MinFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__4"


    // $ANTLR start "rule__MinFunction__Group__4__Impl"
    // InternalSql_dsl.g:4922:1: rule__MinFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__MinFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4926:1: ( ( ')' ) )
            // InternalSql_dsl.g:4927:1: ( ')' )
            {
            // InternalSql_dsl.g:4927:1: ( ')' )
            // InternalSql_dsl.g:4928:2: ')'
            {
             before(grammarAccess.getMinFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMinFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__4__Impl"


    // $ANTLR start "rule__MinFunction__Group__5"
    // InternalSql_dsl.g:4937:1: rule__MinFunction__Group__5 : rule__MinFunction__Group__5__Impl ;
    public final void rule__MinFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4941:1: ( rule__MinFunction__Group__5__Impl )
            // InternalSql_dsl.g:4942:2: rule__MinFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinFunction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__5"


    // $ANTLR start "rule__MinFunction__Group__5__Impl"
    // InternalSql_dsl.g:4948:1: rule__MinFunction__Group__5__Impl : ( ( rule__MinFunction__XAssignment_5 ) ) ;
    public final void rule__MinFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4952:1: ( ( ( rule__MinFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:4953:1: ( ( rule__MinFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:4953:1: ( ( rule__MinFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:4954:2: ( rule__MinFunction__XAssignment_5 )
            {
             before(grammarAccess.getMinFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:4955:2: ( rule__MinFunction__XAssignment_5 )
            // InternalSql_dsl.g:4955:3: rule__MinFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MinFunction__XAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMinFunctionAccess().getXAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__Group__5__Impl"


    // $ANTLR start "rule__MaxFunction__Group__0"
    // InternalSql_dsl.g:4964:1: rule__MaxFunction__Group__0 : rule__MaxFunction__Group__0__Impl rule__MaxFunction__Group__1 ;
    public final void rule__MaxFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4968:1: ( rule__MaxFunction__Group__0__Impl rule__MaxFunction__Group__1 )
            // InternalSql_dsl.g:4969:2: rule__MaxFunction__Group__0__Impl rule__MaxFunction__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__MaxFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__0"


    // $ANTLR start "rule__MaxFunction__Group__0__Impl"
    // InternalSql_dsl.g:4976:1: rule__MaxFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__MaxFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4980:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4981:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4981:1: ( 'SELECT' )
            // InternalSql_dsl.g:4982:2: 'SELECT'
            {
             before(grammarAccess.getMaxFunctionAccess().getSELECTKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMaxFunctionAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__0__Impl"


    // $ANTLR start "rule__MaxFunction__Group__1"
    // InternalSql_dsl.g:4991:1: rule__MaxFunction__Group__1 : rule__MaxFunction__Group__1__Impl rule__MaxFunction__Group__2 ;
    public final void rule__MaxFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4995:1: ( rule__MaxFunction__Group__1__Impl rule__MaxFunction__Group__2 )
            // InternalSql_dsl.g:4996:2: rule__MaxFunction__Group__1__Impl rule__MaxFunction__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__MaxFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__1"


    // $ANTLR start "rule__MaxFunction__Group__1__Impl"
    // InternalSql_dsl.g:5003:1: rule__MaxFunction__Group__1__Impl : ( 'MAX' ) ;
    public final void rule__MaxFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5007:1: ( ( 'MAX' ) )
            // InternalSql_dsl.g:5008:1: ( 'MAX' )
            {
            // InternalSql_dsl.g:5008:1: ( 'MAX' )
            // InternalSql_dsl.g:5009:2: 'MAX'
            {
             before(grammarAccess.getMaxFunctionAccess().getMAXKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMaxFunctionAccess().getMAXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__1__Impl"


    // $ANTLR start "rule__MaxFunction__Group__2"
    // InternalSql_dsl.g:5018:1: rule__MaxFunction__Group__2 : rule__MaxFunction__Group__2__Impl rule__MaxFunction__Group__3 ;
    public final void rule__MaxFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5022:1: ( rule__MaxFunction__Group__2__Impl rule__MaxFunction__Group__3 )
            // InternalSql_dsl.g:5023:2: rule__MaxFunction__Group__2__Impl rule__MaxFunction__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MaxFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__2"


    // $ANTLR start "rule__MaxFunction__Group__2__Impl"
    // InternalSql_dsl.g:5030:1: rule__MaxFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__MaxFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5034:1: ( ( '(' ) )
            // InternalSql_dsl.g:5035:1: ( '(' )
            {
            // InternalSql_dsl.g:5035:1: ( '(' )
            // InternalSql_dsl.g:5036:2: '('
            {
             before(grammarAccess.getMaxFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMaxFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__2__Impl"


    // $ANTLR start "rule__MaxFunction__Group__3"
    // InternalSql_dsl.g:5045:1: rule__MaxFunction__Group__3 : rule__MaxFunction__Group__3__Impl rule__MaxFunction__Group__4 ;
    public final void rule__MaxFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5049:1: ( rule__MaxFunction__Group__3__Impl rule__MaxFunction__Group__4 )
            // InternalSql_dsl.g:5050:2: rule__MaxFunction__Group__3__Impl rule__MaxFunction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__MaxFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__3"


    // $ANTLR start "rule__MaxFunction__Group__3__Impl"
    // InternalSql_dsl.g:5057:1: rule__MaxFunction__Group__3__Impl : ( ( rule__MaxFunction__ColumnAssignment_3 ) ) ;
    public final void rule__MaxFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5061:1: ( ( ( rule__MaxFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:5062:1: ( ( rule__MaxFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:5062:1: ( ( rule__MaxFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:5063:2: ( rule__MaxFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getMaxFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:5064:2: ( rule__MaxFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:5064:3: rule__MaxFunction__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MaxFunction__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMaxFunctionAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__3__Impl"


    // $ANTLR start "rule__MaxFunction__Group__4"
    // InternalSql_dsl.g:5072:1: rule__MaxFunction__Group__4 : rule__MaxFunction__Group__4__Impl rule__MaxFunction__Group__5 ;
    public final void rule__MaxFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5076:1: ( rule__MaxFunction__Group__4__Impl rule__MaxFunction__Group__5 )
            // InternalSql_dsl.g:5077:2: rule__MaxFunction__Group__4__Impl rule__MaxFunction__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MaxFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__4"


    // $ANTLR start "rule__MaxFunction__Group__4__Impl"
    // InternalSql_dsl.g:5084:1: rule__MaxFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__MaxFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5088:1: ( ( ')' ) )
            // InternalSql_dsl.g:5089:1: ( ')' )
            {
            // InternalSql_dsl.g:5089:1: ( ')' )
            // InternalSql_dsl.g:5090:2: ')'
            {
             before(grammarAccess.getMaxFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMaxFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__4__Impl"


    // $ANTLR start "rule__MaxFunction__Group__5"
    // InternalSql_dsl.g:5099:1: rule__MaxFunction__Group__5 : rule__MaxFunction__Group__5__Impl ;
    public final void rule__MaxFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5103:1: ( rule__MaxFunction__Group__5__Impl )
            // InternalSql_dsl.g:5104:2: rule__MaxFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxFunction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__5"


    // $ANTLR start "rule__MaxFunction__Group__5__Impl"
    // InternalSql_dsl.g:5110:1: rule__MaxFunction__Group__5__Impl : ( ( rule__MaxFunction__XAssignment_5 ) ) ;
    public final void rule__MaxFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5114:1: ( ( ( rule__MaxFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:5115:1: ( ( rule__MaxFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:5115:1: ( ( rule__MaxFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:5116:2: ( rule__MaxFunction__XAssignment_5 )
            {
             before(grammarAccess.getMaxFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:5117:2: ( rule__MaxFunction__XAssignment_5 )
            // InternalSql_dsl.g:5117:3: rule__MaxFunction__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MaxFunction__XAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMaxFunctionAccess().getXAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__Group__5__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalSql_dsl.g:5126:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5130:1: ( ( ruleStatement ) )
            // InternalSql_dsl.g:5131:2: ( ruleStatement )
            {
            // InternalSql_dsl.g:5131:2: ( ruleStatement )
            // InternalSql_dsl.g:5132:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__SelectStatement__ColumnAssignment_1_1_0"
    // InternalSql_dsl.g:5141:1: rule__SelectStatement__ColumnAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__SelectStatement__ColumnAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5145:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5146:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5146:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5147:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_1_1_0_0()); 
            // InternalSql_dsl.g:5148:3: ( RULE_ID )
            // InternalSql_dsl.g:5149:4: RULE_ID
            {
             before(grammarAccess.getSelectStatementAccess().getColumnCDIDTerminalRuleCall_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getColumnCDIDTerminalRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__ColumnAssignment_1_1_0"


    // $ANTLR start "rule__SelectStatement__ColumnAssignment_1_1_1_1"
    // InternalSql_dsl.g:5160:1: rule__SelectStatement__ColumnAssignment_1_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectStatement__ColumnAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5164:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5165:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5165:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5166:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_1_1_1_1_0()); 
            // InternalSql_dsl.g:5167:3: ( RULE_ID )
            // InternalSql_dsl.g:5168:4: RULE_ID
            {
             before(grammarAccess.getSelectStatementAccess().getColumnCDIDTerminalRuleCall_1_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getColumnCDIDTerminalRuleCall_1_1_1_1_0_1()); 

            }

             after(grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__ColumnAssignment_1_1_1_1"


    // $ANTLR start "rule__SelectStatement__XAssignment_2"
    // InternalSql_dsl.g:5179:1: rule__SelectStatement__XAssignment_2 : ( ruleFromAndWhereClauses ) ;
    public final void rule__SelectStatement__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5183:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:5184:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:5184:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:5185:3: ruleFromAndWhereClauses
            {
             before(grammarAccess.getSelectStatementAccess().getXFromAndWhereClausesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getXFromAndWhereClausesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__XAssignment_2"


    // $ANTLR start "rule__FromAndWhereClauses__TableAssignment_1"
    // InternalSql_dsl.g:5194:1: rule__FromAndWhereClauses__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FromAndWhereClauses__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5198:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5199:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5199:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5200:3: ( RULE_ID )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getTableTableNameCrossReference_1_0()); 
            // InternalSql_dsl.g:5201:3: ( RULE_ID )
            // InternalSql_dsl.g:5202:4: RULE_ID
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getTableTableNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFromAndWhereClausesAccess().getTableTableNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFromAndWhereClausesAccess().getTableTableNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__TableAssignment_1"


    // $ANTLR start "rule__FromAndWhereClauses__ZAssignment_2_1"
    // InternalSql_dsl.g:5213:1: rule__FromAndWhereClauses__ZAssignment_2_1 : ( ruleWhereDec ) ;
    public final void rule__FromAndWhereClauses__ZAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5217:1: ( ( ruleWhereDec ) )
            // InternalSql_dsl.g:5218:2: ( ruleWhereDec )
            {
            // InternalSql_dsl.g:5218:2: ( ruleWhereDec )
            // InternalSql_dsl.g:5219:3: ruleWhereDec
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getZWhereDecParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereDec();

            state._fsp--;

             after(grammarAccess.getFromAndWhereClausesAccess().getZWhereDecParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__ZAssignment_2_1"


    // $ANTLR start "rule__FromAndWhereClauses__ZAssignment_2_2_1"
    // InternalSql_dsl.g:5228:1: rule__FromAndWhereClauses__ZAssignment_2_2_1 : ( ruleWhereDec ) ;
    public final void rule__FromAndWhereClauses__ZAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5232:1: ( ( ruleWhereDec ) )
            // InternalSql_dsl.g:5233:2: ( ruleWhereDec )
            {
            // InternalSql_dsl.g:5233:2: ( ruleWhereDec )
            // InternalSql_dsl.g:5234:3: ruleWhereDec
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getZWhereDecParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereDec();

            state._fsp--;

             after(grammarAccess.getFromAndWhereClausesAccess().getZWhereDecParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromAndWhereClauses__ZAssignment_2_2_1"


    // $ANTLR start "rule__WhereDec__ColumnAssignment_0"
    // InternalSql_dsl.g:5243:1: rule__WhereDec__ColumnAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WhereDec__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5247:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5248:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5248:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5249:3: ( RULE_ID )
            {
             before(grammarAccess.getWhereDecAccess().getColumnCDCrossReference_0_0()); 
            // InternalSql_dsl.g:5250:3: ( RULE_ID )
            // InternalSql_dsl.g:5251:4: RULE_ID
            {
             before(grammarAccess.getWhereDecAccess().getColumnCDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWhereDecAccess().getColumnCDIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWhereDecAccess().getColumnCDCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__ColumnAssignment_0"


    // $ANTLR start "rule__WhereDec__SignAssignment_1"
    // InternalSql_dsl.g:5262:1: rule__WhereDec__SignAssignment_1 : ( ( rule__WhereDec__SignAlternatives_1_0 ) ) ;
    public final void rule__WhereDec__SignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5266:1: ( ( ( rule__WhereDec__SignAlternatives_1_0 ) ) )
            // InternalSql_dsl.g:5267:2: ( ( rule__WhereDec__SignAlternatives_1_0 ) )
            {
            // InternalSql_dsl.g:5267:2: ( ( rule__WhereDec__SignAlternatives_1_0 ) )
            // InternalSql_dsl.g:5268:3: ( rule__WhereDec__SignAlternatives_1_0 )
            {
             before(grammarAccess.getWhereDecAccess().getSignAlternatives_1_0()); 
            // InternalSql_dsl.g:5269:3: ( rule__WhereDec__SignAlternatives_1_0 )
            // InternalSql_dsl.g:5269:4: rule__WhereDec__SignAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__SignAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getWhereDecAccess().getSignAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__SignAssignment_1"


    // $ANTLR start "rule__WhereDec__RightOperandAssignment_2"
    // InternalSql_dsl.g:5277:1: rule__WhereDec__RightOperandAssignment_2 : ( ( rule__WhereDec__RightOperandAlternatives_2_0 ) ) ;
    public final void rule__WhereDec__RightOperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5281:1: ( ( ( rule__WhereDec__RightOperandAlternatives_2_0 ) ) )
            // InternalSql_dsl.g:5282:2: ( ( rule__WhereDec__RightOperandAlternatives_2_0 ) )
            {
            // InternalSql_dsl.g:5282:2: ( ( rule__WhereDec__RightOperandAlternatives_2_0 ) )
            // InternalSql_dsl.g:5283:3: ( rule__WhereDec__RightOperandAlternatives_2_0 )
            {
             before(grammarAccess.getWhereDecAccess().getRightOperandAlternatives_2_0()); 
            // InternalSql_dsl.g:5284:3: ( rule__WhereDec__RightOperandAlternatives_2_0 )
            // InternalSql_dsl.g:5284:4: rule__WhereDec__RightOperandAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__RightOperandAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWhereDecAccess().getRightOperandAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereDec__RightOperandAssignment_2"


    // $ANTLR start "rule__RightOperandOne__NameAssignment_1"
    // InternalSql_dsl.g:5292:1: rule__RightOperandOne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RightOperandOne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5296:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5297:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5297:2: ( RULE_ID )
            // InternalSql_dsl.g:5298:3: RULE_ID
            {
             before(grammarAccess.getRightOperandOneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightOperandOneAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightOperandOne__NameAssignment_1"


    // $ANTLR start "rule__RightOperandTwo__ColumnAssignment"
    // InternalSql_dsl.g:5307:1: rule__RightOperandTwo__ColumnAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RightOperandTwo__ColumnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5311:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5312:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5312:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5313:3: ( RULE_ID )
            {
             before(grammarAccess.getRightOperandTwoAccess().getColumnCDCrossReference_0()); 
            // InternalSql_dsl.g:5314:3: ( RULE_ID )
            // InternalSql_dsl.g:5315:4: RULE_ID
            {
             before(grammarAccess.getRightOperandTwoAccess().getColumnCDIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightOperandTwoAccess().getColumnCDIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRightOperandTwoAccess().getColumnCDCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightOperandTwo__ColumnAssignment"


    // $ANTLR start "rule__RightOperandThree__ValAssignment"
    // InternalSql_dsl.g:5326:1: rule__RightOperandThree__ValAssignment : ( RULE_INT ) ;
    public final void rule__RightOperandThree__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5330:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:5331:2: ( RULE_INT )
            {
            // InternalSql_dsl.g:5331:2: ( RULE_INT )
            // InternalSql_dsl.g:5332:3: RULE_INT
            {
             before(grammarAccess.getRightOperandThreeAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRightOperandThreeAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightOperandThree__ValAssignment"


    // $ANTLR start "rule__DatabaseDeclarationStatement__NameAssignment_2"
    // InternalSql_dsl.g:5341:1: rule__DatabaseDeclarationStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DatabaseDeclarationStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5345:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5346:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5346:2: ( RULE_ID )
            // InternalSql_dsl.g:5347:3: RULE_ID
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatabaseDeclarationStatementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseDeclarationStatement__NameAssignment_2"


    // $ANTLR start "rule__CreateTableStatement__TablesAssignment"
    // InternalSql_dsl.g:5356:1: rule__CreateTableStatement__TablesAssignment : ( ruleTableDeclaration ) ;
    public final void rule__CreateTableStatement__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5360:1: ( ( ruleTableDeclaration ) )
            // InternalSql_dsl.g:5361:2: ( ruleTableDeclaration )
            {
            // InternalSql_dsl.g:5361:2: ( ruleTableDeclaration )
            // InternalSql_dsl.g:5362:3: ruleTableDeclaration
            {
             before(grammarAccess.getCreateTableStatementAccess().getTablesTableDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTableDeclaration();

            state._fsp--;

             after(grammarAccess.getCreateTableStatementAccess().getTablesTableDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableStatement__TablesAssignment"


    // $ANTLR start "rule__TableDeclaration__TableAssignment_2"
    // InternalSql_dsl.g:5371:1: rule__TableDeclaration__TableAssignment_2 : ( ruletableName ) ;
    public final void rule__TableDeclaration__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5375:1: ( ( ruletableName ) )
            // InternalSql_dsl.g:5376:2: ( ruletableName )
            {
            // InternalSql_dsl.g:5376:2: ( ruletableName )
            // InternalSql_dsl.g:5377:3: ruletableName
            {
             before(grammarAccess.getTableDeclarationAccess().getTableTableNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletableName();

            state._fsp--;

             after(grammarAccess.getTableDeclarationAccess().getTableTableNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__TableAssignment_2"


    // $ANTLR start "rule__TableDeclaration__AttributesAssignment_4"
    // InternalSql_dsl.g:5386:1: rule__TableDeclaration__AttributesAssignment_4 : ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) ) ;
    public final void rule__TableDeclaration__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5390:1: ( ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) ) )
            // InternalSql_dsl.g:5391:2: ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) )
            {
            // InternalSql_dsl.g:5391:2: ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) )
            // InternalSql_dsl.g:5392:3: ( rule__TableDeclaration__AttributesAlternatives_4_0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_4_0()); 
            // InternalSql_dsl.g:5393:3: ( rule__TableDeclaration__AttributesAlternatives_4_0 )
            // InternalSql_dsl.g:5393:4: rule__TableDeclaration__AttributesAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__AttributesAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__AttributesAssignment_4"


    // $ANTLR start "rule__TableDeclaration__AttributesAssignment_5_1"
    // InternalSql_dsl.g:5401:1: rule__TableDeclaration__AttributesAssignment_5_1 : ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) ) ;
    public final void rule__TableDeclaration__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5405:1: ( ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) ) )
            // InternalSql_dsl.g:5406:2: ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) )
            {
            // InternalSql_dsl.g:5406:2: ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) )
            // InternalSql_dsl.g:5407:3: ( rule__TableDeclaration__AttributesAlternatives_5_1_0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_5_1_0()); 
            // InternalSql_dsl.g:5408:3: ( rule__TableDeclaration__AttributesAlternatives_5_1_0 )
            // InternalSql_dsl.g:5408:4: rule__TableDeclaration__AttributesAlternatives_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__AttributesAlternatives_5_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__AttributesAssignment_5_1"


    // $ANTLR start "rule__TableName__NameAssignment"
    // InternalSql_dsl.g:5416:1: rule__TableName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TableName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5420:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5421:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5421:2: ( RULE_ID )
            // InternalSql_dsl.g:5422:3: RULE_ID
            {
             before(grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableName__NameAssignment"


    // $ANTLR start "rule__ColumnDeclaration__NameAssignment_0"
    // InternalSql_dsl.g:5431:1: rule__ColumnDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ColumnDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5435:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5436:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5436:2: ( RULE_ID )
            // InternalSql_dsl.g:5437:3: RULE_ID
            {
             before(grammarAccess.getColumnDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__NameAssignment_0"


    // $ANTLR start "rule__ColumnDeclaration__TypeAssignment_1"
    // InternalSql_dsl.g:5446:1: rule__ColumnDeclaration__TypeAssignment_1 : ( ruleDataStructureType ) ;
    public final void rule__ColumnDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5450:1: ( ( ruleDataStructureType ) )
            // InternalSql_dsl.g:5451:2: ( ruleDataStructureType )
            {
            // InternalSql_dsl.g:5451:2: ( ruleDataStructureType )
            // InternalSql_dsl.g:5452:3: ruleDataStructureType
            {
             before(grammarAccess.getColumnDeclarationAccess().getTypeDataStructureTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataStructureType();

            state._fsp--;

             after(grammarAccess.getColumnDeclarationAccess().getTypeDataStructureTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__TypeAssignment_1"


    // $ANTLR start "rule__ColumnDeclaration__NotNullAssignment_2"
    // InternalSql_dsl.g:5461:1: rule__ColumnDeclaration__NotNullAssignment_2 : ( ( 'NOT NULL' ) ) ;
    public final void rule__ColumnDeclaration__NotNullAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5465:1: ( ( ( 'NOT NULL' ) ) )
            // InternalSql_dsl.g:5466:2: ( ( 'NOT NULL' ) )
            {
            // InternalSql_dsl.g:5466:2: ( ( 'NOT NULL' ) )
            // InternalSql_dsl.g:5467:3: ( 'NOT NULL' )
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0()); 
            // InternalSql_dsl.g:5468:3: ( 'NOT NULL' )
            // InternalSql_dsl.g:5469:4: 'NOT NULL'
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0()); 

            }

             after(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDeclaration__NotNullAssignment_2"


    // $ANTLR start "rule__PrimaryKey__ColumnAsPKAssignment_3"
    // InternalSql_dsl.g:5480:1: rule__PrimaryKey__ColumnAsPKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5484:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5485:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5485:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5486:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5487:3: ( RULE_ID )
            // InternalSql_dsl.g:5488:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__ColumnAsPKAssignment_3"


    // $ANTLR start "rule__PrimaryKey__ColumnAsPKAssignment_4_1"
    // InternalSql_dsl.g:5499:1: rule__PrimaryKey__ColumnAsPKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5503:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5504:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5504:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5505:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_4_1_0()); 
            // InternalSql_dsl.g:5506:3: ( RULE_ID )
            // InternalSql_dsl.g:5507:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__ColumnAsPKAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__ColumnAsFKAssignment_3"
    // InternalSql_dsl.g:5518:1: rule__ForeignKey__ColumnAsFKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5522:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5523:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5523:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5524:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5525:3: ( RULE_ID )
            // InternalSql_dsl.g:5526:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnAsFKCDIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__ColumnAsFKAssignment_3"


    // $ANTLR start "rule__ForeignKey__ColumnAsFKAssignment_4_1"
    // InternalSql_dsl.g:5537:1: rule__ForeignKey__ColumnAsFKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5541:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5542:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5542:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5543:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_4_1_0()); 
            // InternalSql_dsl.g:5544:3: ( RULE_ID )
            // InternalSql_dsl.g:5545:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnAsFKCDIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__ColumnAsFKAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__ForeignTableAssignment_7"
    // InternalSql_dsl.g:5556:1: rule__ForeignKey__ForeignTableAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignTableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5560:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5561:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5561:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5562:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationCrossReference_7_0()); 
            // InternalSql_dsl.g:5563:3: ( RULE_ID )
            // InternalSql_dsl.g:5564:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__ForeignTableAssignment_7"


    // $ANTLR start "rule__ForeignKey__ForeignColumnsAssignment_9"
    // InternalSql_dsl.g:5575:1: rule__ForeignKey__ForeignColumnsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5579:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5580:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5580:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5581:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_9_0()); 
            // InternalSql_dsl.g:5582:3: ( RULE_ID )
            // InternalSql_dsl.g:5583:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getForeignColumnsCDIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__ForeignColumnsAssignment_9"


    // $ANTLR start "rule__ForeignKey__ForeignColumnsAssignment_10_1"
    // InternalSql_dsl.g:5594:1: rule__ForeignKey__ForeignColumnsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5598:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5599:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5599:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5600:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_10_1_0()); 
            // InternalSql_dsl.g:5601:3: ( RULE_ID )
            // InternalSql_dsl.g:5602:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getForeignColumnsCDIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__ForeignColumnsAssignment_10_1"


    // $ANTLR start "rule__DropTableStatement__TableAssignment_2"
    // InternalSql_dsl.g:5613:1: rule__DropTableStatement__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DropTableStatement__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5617:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5618:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5618:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5619:3: ( RULE_ID )
            {
             before(grammarAccess.getDropTableStatementAccess().getTableTableNameCrossReference_2_0()); 
            // InternalSql_dsl.g:5620:3: ( RULE_ID )
            // InternalSql_dsl.g:5621:4: RULE_ID
            {
             before(grammarAccess.getDropTableStatementAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropTableStatementAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDropTableStatementAccess().getTableTableNameCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__TableAssignment_2"


    // $ANTLR start "rule__DropTableStatement__TableAssignment_3_1"
    // InternalSql_dsl.g:5632:1: rule__DropTableStatement__TableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DropTableStatement__TableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5636:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5637:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5637:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5638:3: ( RULE_ID )
            {
             before(grammarAccess.getDropTableStatementAccess().getTableTableNameCrossReference_3_1_0()); 
            // InternalSql_dsl.g:5639:3: ( RULE_ID )
            // InternalSql_dsl.g:5640:4: RULE_ID
            {
             before(grammarAccess.getDropTableStatementAccess().getTableTableNameIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropTableStatementAccess().getTableTableNameIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDropTableStatementAccess().getTableTableNameCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__TableAssignment_3_1"


    // $ANTLR start "rule__TruncateTableStatement__TableAssignment_2"
    // InternalSql_dsl.g:5651:1: rule__TruncateTableStatement__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TruncateTableStatement__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5655:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5656:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5656:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5657:3: ( RULE_ID )
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTableTableNameCrossReference_2_0()); 
            // InternalSql_dsl.g:5658:3: ( RULE_ID )
            // InternalSql_dsl.g:5659:4: RULE_ID
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTruncateTableStatementAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTruncateTableStatementAccess().getTableTableNameCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__TableAssignment_2"


    // $ANTLR start "rule__TruncateTableStatement__TableAssignment_3_1"
    // InternalSql_dsl.g:5670:1: rule__TruncateTableStatement__TableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__TruncateTableStatement__TableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5674:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5675:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5675:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5676:3: ( RULE_ID )
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTableTableNameCrossReference_3_1_0()); 
            // InternalSql_dsl.g:5677:3: ( RULE_ID )
            // InternalSql_dsl.g:5678:4: RULE_ID
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTableTableNameIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTruncateTableStatementAccess().getTableTableNameIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getTruncateTableStatementAccess().getTableTableNameCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__TableAssignment_3_1"


    // $ANTLR start "rule__DeleteTableStatement__XAssignment_1"
    // InternalSql_dsl.g:5689:1: rule__DeleteTableStatement__XAssignment_1 : ( ruleFromAndWhereClauses ) ;
    public final void rule__DeleteTableStatement__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5693:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:5694:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:5694:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:5695:3: ruleFromAndWhereClauses
            {
             before(grammarAccess.getDeleteTableStatementAccess().getXFromAndWhereClausesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;

             after(grammarAccess.getDeleteTableStatementAccess().getXFromAndWhereClausesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteTableStatement__XAssignment_1"


    // $ANTLR start "rule__UpdateTableStatement__TableAssignment_1"
    // InternalSql_dsl.g:5704:1: rule__UpdateTableStatement__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UpdateTableStatement__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5708:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5709:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5709:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5710:3: ( RULE_ID )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getTableTableNameCrossReference_1_0()); 
            // InternalSql_dsl.g:5711:3: ( RULE_ID )
            // InternalSql_dsl.g:5712:4: RULE_ID
            {
             before(grammarAccess.getUpdateTableStatementAccess().getTableTableNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUpdateTableStatementAccess().getTableTableNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUpdateTableStatementAccess().getTableTableNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__TableAssignment_1"


    // $ANTLR start "rule__UpdateTableStatement__ScAssignment_3"
    // InternalSql_dsl.g:5723:1: rule__UpdateTableStatement__ScAssignment_3 : ( ruleSetClause ) ;
    public final void rule__UpdateTableStatement__ScAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5727:1: ( ( ruleSetClause ) )
            // InternalSql_dsl.g:5728:2: ( ruleSetClause )
            {
            // InternalSql_dsl.g:5728:2: ( ruleSetClause )
            // InternalSql_dsl.g:5729:3: ruleSetClause
            {
             before(grammarAccess.getUpdateTableStatementAccess().getScSetClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSetClause();

            state._fsp--;

             after(grammarAccess.getUpdateTableStatementAccess().getScSetClauseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__ScAssignment_3"


    // $ANTLR start "rule__UpdateTableStatement__ScAssignment_4_1"
    // InternalSql_dsl.g:5738:1: rule__UpdateTableStatement__ScAssignment_4_1 : ( ruleSetClause ) ;
    public final void rule__UpdateTableStatement__ScAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5742:1: ( ( ruleSetClause ) )
            // InternalSql_dsl.g:5743:2: ( ruleSetClause )
            {
            // InternalSql_dsl.g:5743:2: ( ruleSetClause )
            // InternalSql_dsl.g:5744:3: ruleSetClause
            {
             before(grammarAccess.getUpdateTableStatementAccess().getScSetClauseParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSetClause();

            state._fsp--;

             after(grammarAccess.getUpdateTableStatementAccess().getScSetClauseParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__ScAssignment_4_1"


    // $ANTLR start "rule__UpdateTableStatement__ZAssignment_5_1"
    // InternalSql_dsl.g:5753:1: rule__UpdateTableStatement__ZAssignment_5_1 : ( ruleWhereDec ) ;
    public final void rule__UpdateTableStatement__ZAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5757:1: ( ( ruleWhereDec ) )
            // InternalSql_dsl.g:5758:2: ( ruleWhereDec )
            {
            // InternalSql_dsl.g:5758:2: ( ruleWhereDec )
            // InternalSql_dsl.g:5759:3: ruleWhereDec
            {
             before(grammarAccess.getUpdateTableStatementAccess().getZWhereDecParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereDec();

            state._fsp--;

             after(grammarAccess.getUpdateTableStatementAccess().getZWhereDecParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__ZAssignment_5_1"


    // $ANTLR start "rule__UpdateTableStatement__ZAssignment_5_2_1"
    // InternalSql_dsl.g:5768:1: rule__UpdateTableStatement__ZAssignment_5_2_1 : ( ruleWhereDec ) ;
    public final void rule__UpdateTableStatement__ZAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5772:1: ( ( ruleWhereDec ) )
            // InternalSql_dsl.g:5773:2: ( ruleWhereDec )
            {
            // InternalSql_dsl.g:5773:2: ( ruleWhereDec )
            // InternalSql_dsl.g:5774:3: ruleWhereDec
            {
             before(grammarAccess.getUpdateTableStatementAccess().getZWhereDecParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereDec();

            state._fsp--;

             after(grammarAccess.getUpdateTableStatementAccess().getZWhereDecParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateTableStatement__ZAssignment_5_2_1"


    // $ANTLR start "rule__SetClause__ColumnAssignment_0"
    // InternalSql_dsl.g:5783:1: rule__SetClause__ColumnAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SetClause__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5787:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5788:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5788:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5789:3: ( RULE_ID )
            {
             before(grammarAccess.getSetClauseAccess().getColumnCDCrossReference_0_0()); 
            // InternalSql_dsl.g:5790:3: ( RULE_ID )
            // InternalSql_dsl.g:5791:4: RULE_ID
            {
             before(grammarAccess.getSetClauseAccess().getColumnCDIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetClauseAccess().getColumnCDIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSetClauseAccess().getColumnCDCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__ColumnAssignment_0"


    // $ANTLR start "rule__SetClause__NameAssignment_2_0_1"
    // InternalSql_dsl.g:5802:1: rule__SetClause__NameAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__SetClause__NameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5806:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5807:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5807:2: ( RULE_ID )
            // InternalSql_dsl.g:5808:3: RULE_ID
            {
             before(grammarAccess.getSetClauseAccess().getNameIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetClauseAccess().getNameIDTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__NameAssignment_2_0_1"


    // $ANTLR start "rule__SetClause__ValAssignment_2_1"
    // InternalSql_dsl.g:5817:1: rule__SetClause__ValAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SetClause__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5821:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:5822:2: ( RULE_INT )
            {
            // InternalSql_dsl.g:5822:2: ( RULE_INT )
            // InternalSql_dsl.g:5823:3: RULE_INT
            {
             before(grammarAccess.getSetClauseAccess().getValINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetClauseAccess().getValINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__ValAssignment_2_1"


    // $ANTLR start "rule__AlterTableStatement__TableAssignment_2"
    // InternalSql_dsl.g:5832:1: rule__AlterTableStatement__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AlterTableStatement__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5836:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5837:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5837:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5838:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterTableStatementAccess().getTableTableNameCrossReference_2_0()); 
            // InternalSql_dsl.g:5839:3: ( RULE_ID )
            // InternalSql_dsl.g:5840:4: RULE_ID
            {
             before(grammarAccess.getAlterTableStatementAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlterTableStatementAccess().getTableTableNameIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAlterTableStatementAccess().getTableTableNameCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__TableAssignment_2"


    // $ANTLR start "rule__AlterTableStatement__AddDropUpdateAssignment_3"
    // InternalSql_dsl.g:5851:1: rule__AlterTableStatement__AddDropUpdateAssignment_3 : ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) ) ;
    public final void rule__AlterTableStatement__AddDropUpdateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5855:1: ( ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) ) )
            // InternalSql_dsl.g:5856:2: ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) )
            {
            // InternalSql_dsl.g:5856:2: ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) )
            // InternalSql_dsl.g:5857:3: ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlternatives_3_0()); 
            // InternalSql_dsl.g:5858:3: ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 )
            // InternalSql_dsl.g:5858:4: rule__AlterTableStatement__AddDropUpdateAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AlterTableStatement__AddDropUpdateAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__AddDropUpdateAssignment_3"


    // $ANTLR start "rule__AlterDropStatement__ColumnAssignment_2"
    // InternalSql_dsl.g:5866:1: rule__AlterDropStatement__ColumnAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AlterDropStatement__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5870:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5871:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5871:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5872:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterDropStatementAccess().getColumnCDCrossReference_2_0()); 
            // InternalSql_dsl.g:5873:3: ( RULE_ID )
            // InternalSql_dsl.g:5874:4: RULE_ID
            {
             before(grammarAccess.getAlterDropStatementAccess().getColumnCDIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlterDropStatementAccess().getColumnCDIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAlterDropStatementAccess().getColumnCDCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterDropStatement__ColumnAssignment_2"


    // $ANTLR start "rule__AlterAddStatement__ColumnAssignment_1"
    // InternalSql_dsl.g:5885:1: rule__AlterAddStatement__ColumnAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AlterAddStatement__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5889:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5890:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5890:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5891:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnCDCrossReference_1_0()); 
            // InternalSql_dsl.g:5892:3: ( RULE_ID )
            // InternalSql_dsl.g:5893:4: RULE_ID
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnCDIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlterAddStatementAccess().getColumnCDIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAlterAddStatementAccess().getColumnCDCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterAddStatement__ColumnAssignment_1"


    // $ANTLR start "rule__AlterUpdateStatement__ColumnAssignment_2"
    // InternalSql_dsl.g:5904:1: rule__AlterUpdateStatement__ColumnAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AlterUpdateStatement__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5908:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5909:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5909:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5910:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getColumnCDCrossReference_2_0()); 
            // InternalSql_dsl.g:5911:3: ( RULE_ID )
            // InternalSql_dsl.g:5912:4: RULE_ID
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getColumnCDIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlterUpdateStatementAccess().getColumnCDIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAlterUpdateStatementAccess().getColumnCDCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterUpdateStatement__ColumnAssignment_2"


    // $ANTLR start "rule__VariableDeclarationStatement__NameAssignment_1"
    // InternalSql_dsl.g:5923:1: rule__VariableDeclarationStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclarationStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5927:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5928:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5928:2: ( RULE_ID )
            // InternalSql_dsl.g:5929:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclarationStatement__ValueAssignment_3"
    // InternalSql_dsl.g:5938:1: rule__VariableDeclarationStatement__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclarationStatement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5942:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:5943:2: ( RULE_INT )
            {
            // InternalSql_dsl.g:5943:2: ( RULE_INT )
            // InternalSql_dsl.g:5944:3: RULE_INT
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationStatementAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclarationStatement__ValueAssignment_3"


    // $ANTLR start "rule__CountFunction__ColumnAssignment_3"
    // InternalSql_dsl.g:5953:1: rule__CountFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CountFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5957:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5958:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5958:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5959:3: ( RULE_ID )
            {
             before(grammarAccess.getCountFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5960:3: ( RULE_ID )
            // InternalSql_dsl.g:5961:4: RULE_ID
            {
             before(grammarAccess.getCountFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCountFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCountFunctionAccess().getColumnCDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__ColumnAssignment_3"


    // $ANTLR start "rule__CountFunction__XAssignment_5"
    // InternalSql_dsl.g:5972:1: rule__CountFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__CountFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5976:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:5977:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:5977:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:5978:3: ruleFromAndWhereClauses
            {
             before(grammarAccess.getCountFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;

             after(grammarAccess.getCountFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountFunction__XAssignment_5"


    // $ANTLR start "rule__AvgFunction__ColumnAssignment_3"
    // InternalSql_dsl.g:5987:1: rule__AvgFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AvgFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5991:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5992:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5992:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5993:3: ( RULE_ID )
            {
             before(grammarAccess.getAvgFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5994:3: ( RULE_ID )
            // InternalSql_dsl.g:5995:4: RULE_ID
            {
             before(grammarAccess.getAvgFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAvgFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAvgFunctionAccess().getColumnCDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__ColumnAssignment_3"


    // $ANTLR start "rule__AvgFunction__XAssignment_5"
    // InternalSql_dsl.g:6006:1: rule__AvgFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__AvgFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:6010:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:6011:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:6011:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:6012:3: ruleFromAndWhereClauses
            {
             before(grammarAccess.getAvgFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;

             after(grammarAccess.getAvgFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AvgFunction__XAssignment_5"


    // $ANTLR start "rule__SumFunction__ColumnAssignment_3"
    // InternalSql_dsl.g:6021:1: rule__SumFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SumFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:6025:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:6026:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:6026:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:6027:3: ( RULE_ID )
            {
             before(grammarAccess.getSumFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:6028:3: ( RULE_ID )
            // InternalSql_dsl.g:6029:4: RULE_ID
            {
             before(grammarAccess.getSumFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSumFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSumFunctionAccess().getColumnCDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__ColumnAssignment_3"


    // $ANTLR start "rule__SumFunction__XAssignment_5"
    // InternalSql_dsl.g:6040:1: rule__SumFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__SumFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:6044:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:6045:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:6045:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:6046:3: ruleFromAndWhereClauses
            {
             before(grammarAccess.getSumFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;

             after(grammarAccess.getSumFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumFunction__XAssignment_5"


    // $ANTLR start "rule__MinFunction__ColumnAssignment_3"
    // InternalSql_dsl.g:6055:1: rule__MinFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MinFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:6059:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:6060:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:6060:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:6061:3: ( RULE_ID )
            {
             before(grammarAccess.getMinFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:6062:3: ( RULE_ID )
            // InternalSql_dsl.g:6063:4: RULE_ID
            {
             before(grammarAccess.getMinFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMinFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMinFunctionAccess().getColumnCDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__ColumnAssignment_3"


    // $ANTLR start "rule__MinFunction__XAssignment_5"
    // InternalSql_dsl.g:6074:1: rule__MinFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__MinFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:6078:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:6079:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:6079:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:6080:3: ruleFromAndWhereClauses
            {
             before(grammarAccess.getMinFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;

             after(grammarAccess.getMinFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinFunction__XAssignment_5"


    // $ANTLR start "rule__MaxFunction__ColumnAssignment_3"
    // InternalSql_dsl.g:6089:1: rule__MaxFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MaxFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:6093:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:6094:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:6094:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:6095:3: ( RULE_ID )
            {
             before(grammarAccess.getMaxFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:6096:3: ( RULE_ID )
            // InternalSql_dsl.g:6097:4: RULE_ID
            {
             before(grammarAccess.getMaxFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMaxFunctionAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMaxFunctionAccess().getColumnCDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__ColumnAssignment_3"


    // $ANTLR start "rule__MaxFunction__XAssignment_5"
    // InternalSql_dsl.g:6108:1: rule__MaxFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__MaxFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:6112:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:6113:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:6113:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:6114:3: ruleFromAndWhereClauses
            {
             before(grammarAccess.getMaxFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFromAndWhereClauses();

            state._fsp--;

             after(grammarAccess.getMaxFunctionAccess().getXFromAndWhereClausesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFunction__XAssignment_5"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\142\uffff";
    static final String dfa_2s = "\1\1\141\uffff";
    static final String dfa_3s = "\1\34\1\uffff\1\42\1\5\1\44\1\5\1\25\2\47\7\5\2\44\1\5\1\25\2\47\1\5\1\uffff\11\5\2\44\1\25\2\47\2\35\3\5\7\35\2\44\3\5\1\51\3\35\2\5\2\35\4\5\1\51\2\35\1\44\2\35\2\5\1\35\1\5\1\51\1\5\1\44\2\35\1\5\1\35\1\5\1\44\2\5\1\35\1\5\1\35\2\5\2\35\1\5\2\35";
    static final String dfa_4s = "\1\62\1\uffff\1\43\1\5\1\44\1\50\1\33\2\47\7\71\2\44\1\50\1\33\2\47\1\50\1\uffff\2\5\7\71\2\44\1\33\2\47\2\45\1\50\2\5\7\71\2\44\1\5\1\50\1\5\1\51\3\45\2\5\2\45\2\5\1\50\1\5\1\51\2\45\1\44\2\45\2\5\1\45\1\5\1\51\1\5\1\44\2\45\1\5\1\45\1\5\1\44\1\5\1\50\1\45\1\5\1\45\1\5\1\50\2\45\1\5\2\45";
    static final String dfa_5s = "\1\uffff\1\2\25\uffff\1\1\112\uffff";
    static final String dfa_6s = "\142\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\2\10\uffff\4\1\1\uffff\1\1\2\uffff\1\1",
            "",
            "\1\1\1\3",
            "\1\4",
            "\1\5",
            "\1\6\40\uffff\1\7\1\uffff\1\10",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\20",
            "\1\21",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\22",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\22",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\22",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\22",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\22",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\22",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\22",
            "\1\30",
            "\1\31",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40",
            "\1\41",
            "\1\42",
            "\1\43\40\uffff\1\44\1\uffff\1\45",
            "",
            "\1\46",
            "\1\47",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\50",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\50",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\50",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\50",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\50",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\50",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25\20\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
            "\1\62",
            "\1\63",
            "\1\64\7\uffff\1\65",
            "\1\66\7\uffff\1\67",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\70",
            "\1\71",
            "\1\26\7\uffff\1\27\23\uffff\1\72",
            "\1\26\7\uffff\1\27\23\uffff\1\72",
            "\1\26\7\uffff\1\27\23\uffff\1\72",
            "\1\26\7\uffff\1\27\23\uffff\1\72",
            "\1\26\7\uffff\1\27\23\uffff\1\72",
            "\1\26\7\uffff\1\27\23\uffff\1\72",
            "\1\26\7\uffff\1\27\23\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\76",
            "\1\77",
            "\1\100\7\uffff\1\101",
            "\1\102\7\uffff\1\103",
            "\1\26\7\uffff\1\27",
            "\1\104",
            "\1\105",
            "\1\64\7\uffff\1\65",
            "\1\66\7\uffff\1\67",
            "\1\106",
            "\1\107",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\110",
            "\1\111",
            "\1\112\7\uffff\1\113",
            "\1\114\7\uffff\1\115",
            "\1\116",
            "\1\100\7\uffff\1\101",
            "\1\102\7\uffff\1\103",
            "\1\117",
            "\1\120",
            "\1\26\7\uffff\1\27",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\112\7\uffff\1\113",
            "\1\114\7\uffff\1\115",
            "\1\125",
            "\1\126\7\uffff\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\133\7\uffff\1\134",
            "\1\135",
            "\1\126\7\uffff\1\127",
            "\1\136",
            "\1\23\27\uffff\1\26\7\uffff\1\27\1\24\1\uffff\1\25",
            "\1\137\7\uffff\1\140",
            "\1\133\7\uffff\1\134",
            "\1\141",
            "\1\26\7\uffff\1\27",
            "\1\137\7\uffff\1\140"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 300:4: ( rule__CreateTableStatement__TablesAssignment )*";
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\34\1\42\4\uffff\1\5\6\uffff";
    static final String dfa_10s = "\1\62\1\43\4\uffff\1\70\6\uffff";
    static final String dfa_11s = "\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\2\1\1\1\12\1\7";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\4\uffff\1\1\10\uffff\1\2\1\3\1\7\1\10\1\uffff\1\4\2\uffff\1\5",
            "\1\12\1\11",
            "",
            "",
            "",
            "",
            "\1\14\5\uffff\1\14\22\uffff\1\14\25\uffff\5\13",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "883:1: rule__Statement__Alternatives : ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) | ( ruleVariableDeclarationStatement ) | ( ruleSelectStatement ) | ( ruleDeleteTableStatement ) | ( ruleUpdateTableStatement ) | ( ruleFunctions ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0004BC0210000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000014000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000014000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000FE00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002840000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});

}