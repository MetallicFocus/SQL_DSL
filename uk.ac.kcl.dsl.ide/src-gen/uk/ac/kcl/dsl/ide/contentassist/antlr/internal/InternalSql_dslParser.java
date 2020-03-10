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


    // $ANTLR start "entryRuleDatabaseDeclarationStatement"
    // InternalSql_dsl.g:178:1: entryRuleDatabaseDeclarationStatement : ruleDatabaseDeclarationStatement EOF ;
    public final void entryRuleDatabaseDeclarationStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:179:1: ( ruleDatabaseDeclarationStatement EOF )
            // InternalSql_dsl.g:180:1: ruleDatabaseDeclarationStatement EOF
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
    // InternalSql_dsl.g:187:1: ruleDatabaseDeclarationStatement : ( ( rule__DatabaseDeclarationStatement__Group__0 ) ) ;
    public final void ruleDatabaseDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:191:2: ( ( ( rule__DatabaseDeclarationStatement__Group__0 ) ) )
            // InternalSql_dsl.g:192:2: ( ( rule__DatabaseDeclarationStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:192:2: ( ( rule__DatabaseDeclarationStatement__Group__0 ) )
            // InternalSql_dsl.g:193:3: ( rule__DatabaseDeclarationStatement__Group__0 )
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getGroup()); 
            // InternalSql_dsl.g:194:3: ( rule__DatabaseDeclarationStatement__Group__0 )
            // InternalSql_dsl.g:194:4: rule__DatabaseDeclarationStatement__Group__0
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
    // InternalSql_dsl.g:203:1: entryRuleCreateTableStatement : ruleCreateTableStatement EOF ;
    public final void entryRuleCreateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:204:1: ( ruleCreateTableStatement EOF )
            // InternalSql_dsl.g:205:1: ruleCreateTableStatement EOF
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
    // InternalSql_dsl.g:212:1: ruleCreateTableStatement : ( ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* ) ) ;
    public final void ruleCreateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:216:2: ( ( ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* ) ) )
            // InternalSql_dsl.g:217:2: ( ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* ) )
            {
            // InternalSql_dsl.g:217:2: ( ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* ) )
            // InternalSql_dsl.g:218:3: ( ( rule__CreateTableStatement__TablesAssignment ) ) ( ( rule__CreateTableStatement__TablesAssignment )* )
            {
            // InternalSql_dsl.g:218:3: ( ( rule__CreateTableStatement__TablesAssignment ) )
            // InternalSql_dsl.g:219:4: ( rule__CreateTableStatement__TablesAssignment )
            {
             before(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:220:4: ( rule__CreateTableStatement__TablesAssignment )
            // InternalSql_dsl.g:220:5: rule__CreateTableStatement__TablesAssignment
            {
            pushFollow(FOLLOW_4);
            rule__CreateTableStatement__TablesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 

            }

            // InternalSql_dsl.g:223:3: ( ( rule__CreateTableStatement__TablesAssignment )* )
            // InternalSql_dsl.g:224:4: ( rule__CreateTableStatement__TablesAssignment )*
            {
             before(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:225:4: ( rule__CreateTableStatement__TablesAssignment )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalSql_dsl.g:225:5: rule__CreateTableStatement__TablesAssignment
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
    // InternalSql_dsl.g:235:1: entryRuleTableDeclaration : ruleTableDeclaration EOF ;
    public final void entryRuleTableDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:236:1: ( ruleTableDeclaration EOF )
            // InternalSql_dsl.g:237:1: ruleTableDeclaration EOF
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
    // InternalSql_dsl.g:244:1: ruleTableDeclaration : ( ( rule__TableDeclaration__Group__0 ) ) ;
    public final void ruleTableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:248:2: ( ( ( rule__TableDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:249:2: ( ( rule__TableDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:249:2: ( ( rule__TableDeclaration__Group__0 ) )
            // InternalSql_dsl.g:250:3: ( rule__TableDeclaration__Group__0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:251:3: ( rule__TableDeclaration__Group__0 )
            // InternalSql_dsl.g:251:4: rule__TableDeclaration__Group__0
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
    // InternalSql_dsl.g:260:1: entryRuletableName : ruletableName EOF ;
    public final void entryRuletableName() throws RecognitionException {
        try {
            // InternalSql_dsl.g:261:1: ( ruletableName EOF )
            // InternalSql_dsl.g:262:1: ruletableName EOF
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
    // InternalSql_dsl.g:269:1: ruletableName : ( ( rule__TableName__NameAssignment ) ) ;
    public final void ruletableName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:273:2: ( ( ( rule__TableName__NameAssignment ) ) )
            // InternalSql_dsl.g:274:2: ( ( rule__TableName__NameAssignment ) )
            {
            // InternalSql_dsl.g:274:2: ( ( rule__TableName__NameAssignment ) )
            // InternalSql_dsl.g:275:3: ( rule__TableName__NameAssignment )
            {
             before(grammarAccess.getTableNameAccess().getNameAssignment()); 
            // InternalSql_dsl.g:276:3: ( rule__TableName__NameAssignment )
            // InternalSql_dsl.g:276:4: rule__TableName__NameAssignment
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
    // InternalSql_dsl.g:285:1: entryRuleColumnDeclaration : ruleColumnDeclaration EOF ;
    public final void entryRuleColumnDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:286:1: ( ruleColumnDeclaration EOF )
            // InternalSql_dsl.g:287:1: ruleColumnDeclaration EOF
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
    // InternalSql_dsl.g:294:1: ruleColumnDeclaration : ( ( rule__ColumnDeclaration__Group__0 ) ) ;
    public final void ruleColumnDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:298:2: ( ( ( rule__ColumnDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:299:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:299:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            // InternalSql_dsl.g:300:3: ( rule__ColumnDeclaration__Group__0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:301:3: ( rule__ColumnDeclaration__Group__0 )
            // InternalSql_dsl.g:301:4: rule__ColumnDeclaration__Group__0
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
    // InternalSql_dsl.g:310:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalSql_dsl.g:311:1: ( rulePrimaryKey EOF )
            // InternalSql_dsl.g:312:1: rulePrimaryKey EOF
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
    // InternalSql_dsl.g:319:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:323:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalSql_dsl.g:324:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalSql_dsl.g:324:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalSql_dsl.g:325:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalSql_dsl.g:326:3: ( rule__PrimaryKey__Group__0 )
            // InternalSql_dsl.g:326:4: rule__PrimaryKey__Group__0
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
    // InternalSql_dsl.g:335:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalSql_dsl.g:336:1: ( ruleForeignKey EOF )
            // InternalSql_dsl.g:337:1: ruleForeignKey EOF
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
    // InternalSql_dsl.g:344:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:348:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalSql_dsl.g:349:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalSql_dsl.g:349:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalSql_dsl.g:350:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalSql_dsl.g:351:3: ( rule__ForeignKey__Group__0 )
            // InternalSql_dsl.g:351:4: rule__ForeignKey__Group__0
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
    // InternalSql_dsl.g:360:1: entryRuleDropTableStatement : ruleDropTableStatement EOF ;
    public final void entryRuleDropTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:361:1: ( ruleDropTableStatement EOF )
            // InternalSql_dsl.g:362:1: ruleDropTableStatement EOF
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
    // InternalSql_dsl.g:369:1: ruleDropTableStatement : ( ( rule__DropTableStatement__Group__0 ) ) ;
    public final void ruleDropTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:373:2: ( ( ( rule__DropTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:374:2: ( ( rule__DropTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:374:2: ( ( rule__DropTableStatement__Group__0 ) )
            // InternalSql_dsl.g:375:3: ( rule__DropTableStatement__Group__0 )
            {
             before(grammarAccess.getDropTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:376:3: ( rule__DropTableStatement__Group__0 )
            // InternalSql_dsl.g:376:4: rule__DropTableStatement__Group__0
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
    // InternalSql_dsl.g:385:1: entryRuleTruncateTableStatement : ruleTruncateTableStatement EOF ;
    public final void entryRuleTruncateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:386:1: ( ruleTruncateTableStatement EOF )
            // InternalSql_dsl.g:387:1: ruleTruncateTableStatement EOF
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
    // InternalSql_dsl.g:394:1: ruleTruncateTableStatement : ( ( rule__TruncateTableStatement__Group__0 ) ) ;
    public final void ruleTruncateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:398:2: ( ( ( rule__TruncateTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:399:2: ( ( rule__TruncateTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:399:2: ( ( rule__TruncateTableStatement__Group__0 ) )
            // InternalSql_dsl.g:400:3: ( rule__TruncateTableStatement__Group__0 )
            {
             before(grammarAccess.getTruncateTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:401:3: ( rule__TruncateTableStatement__Group__0 )
            // InternalSql_dsl.g:401:4: rule__TruncateTableStatement__Group__0
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
    // InternalSql_dsl.g:410:1: entryRuleDeleteTableStatement : ruleDeleteTableStatement EOF ;
    public final void entryRuleDeleteTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:411:1: ( ruleDeleteTableStatement EOF )
            // InternalSql_dsl.g:412:1: ruleDeleteTableStatement EOF
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
    // InternalSql_dsl.g:419:1: ruleDeleteTableStatement : ( ( rule__DeleteTableStatement__Group__0 ) ) ;
    public final void ruleDeleteTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:423:2: ( ( ( rule__DeleteTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:424:2: ( ( rule__DeleteTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:424:2: ( ( rule__DeleteTableStatement__Group__0 ) )
            // InternalSql_dsl.g:425:3: ( rule__DeleteTableStatement__Group__0 )
            {
             before(grammarAccess.getDeleteTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:426:3: ( rule__DeleteTableStatement__Group__0 )
            // InternalSql_dsl.g:426:4: rule__DeleteTableStatement__Group__0
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
    // InternalSql_dsl.g:435:1: entryRuleUpdateTableStatement : ruleUpdateTableStatement EOF ;
    public final void entryRuleUpdateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:436:1: ( ruleUpdateTableStatement EOF )
            // InternalSql_dsl.g:437:1: ruleUpdateTableStatement EOF
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
    // InternalSql_dsl.g:444:1: ruleUpdateTableStatement : ( ( rule__UpdateTableStatement__Group__0 ) ) ;
    public final void ruleUpdateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:448:2: ( ( ( rule__UpdateTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:449:2: ( ( rule__UpdateTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:449:2: ( ( rule__UpdateTableStatement__Group__0 ) )
            // InternalSql_dsl.g:450:3: ( rule__UpdateTableStatement__Group__0 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:451:3: ( rule__UpdateTableStatement__Group__0 )
            // InternalSql_dsl.g:451:4: rule__UpdateTableStatement__Group__0
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
    // InternalSql_dsl.g:460:1: entryRuleSetClause : ruleSetClause EOF ;
    public final void entryRuleSetClause() throws RecognitionException {
        try {
            // InternalSql_dsl.g:461:1: ( ruleSetClause EOF )
            // InternalSql_dsl.g:462:1: ruleSetClause EOF
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
    // InternalSql_dsl.g:469:1: ruleSetClause : ( ( rule__SetClause__Group__0 ) ) ;
    public final void ruleSetClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:473:2: ( ( ( rule__SetClause__Group__0 ) ) )
            // InternalSql_dsl.g:474:2: ( ( rule__SetClause__Group__0 ) )
            {
            // InternalSql_dsl.g:474:2: ( ( rule__SetClause__Group__0 ) )
            // InternalSql_dsl.g:475:3: ( rule__SetClause__Group__0 )
            {
             before(grammarAccess.getSetClauseAccess().getGroup()); 
            // InternalSql_dsl.g:476:3: ( rule__SetClause__Group__0 )
            // InternalSql_dsl.g:476:4: rule__SetClause__Group__0
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
    // InternalSql_dsl.g:485:1: entryRuleAlterTableStatement : ruleAlterTableStatement EOF ;
    public final void entryRuleAlterTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:486:1: ( ruleAlterTableStatement EOF )
            // InternalSql_dsl.g:487:1: ruleAlterTableStatement EOF
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
    // InternalSql_dsl.g:494:1: ruleAlterTableStatement : ( ( rule__AlterTableStatement__Group__0 ) ) ;
    public final void ruleAlterTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:498:2: ( ( ( rule__AlterTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:499:2: ( ( rule__AlterTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:499:2: ( ( rule__AlterTableStatement__Group__0 ) )
            // InternalSql_dsl.g:500:3: ( rule__AlterTableStatement__Group__0 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:501:3: ( rule__AlterTableStatement__Group__0 )
            // InternalSql_dsl.g:501:4: rule__AlterTableStatement__Group__0
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
    // InternalSql_dsl.g:510:1: entryRuleAlterDropStatement : ruleAlterDropStatement EOF ;
    public final void entryRuleAlterDropStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:511:1: ( ruleAlterDropStatement EOF )
            // InternalSql_dsl.g:512:1: ruleAlterDropStatement EOF
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
    // InternalSql_dsl.g:519:1: ruleAlterDropStatement : ( ( rule__AlterDropStatement__Group__0 ) ) ;
    public final void ruleAlterDropStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:523:2: ( ( ( rule__AlterDropStatement__Group__0 ) ) )
            // InternalSql_dsl.g:524:2: ( ( rule__AlterDropStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:524:2: ( ( rule__AlterDropStatement__Group__0 ) )
            // InternalSql_dsl.g:525:3: ( rule__AlterDropStatement__Group__0 )
            {
             before(grammarAccess.getAlterDropStatementAccess().getGroup()); 
            // InternalSql_dsl.g:526:3: ( rule__AlterDropStatement__Group__0 )
            // InternalSql_dsl.g:526:4: rule__AlterDropStatement__Group__0
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
    // InternalSql_dsl.g:535:1: entryRuleAlterAddStatement : ruleAlterAddStatement EOF ;
    public final void entryRuleAlterAddStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:536:1: ( ruleAlterAddStatement EOF )
            // InternalSql_dsl.g:537:1: ruleAlterAddStatement EOF
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
    // InternalSql_dsl.g:544:1: ruleAlterAddStatement : ( ( rule__AlterAddStatement__Group__0 ) ) ;
    public final void ruleAlterAddStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:548:2: ( ( ( rule__AlterAddStatement__Group__0 ) ) )
            // InternalSql_dsl.g:549:2: ( ( rule__AlterAddStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:549:2: ( ( rule__AlterAddStatement__Group__0 ) )
            // InternalSql_dsl.g:550:3: ( rule__AlterAddStatement__Group__0 )
            {
             before(grammarAccess.getAlterAddStatementAccess().getGroup()); 
            // InternalSql_dsl.g:551:3: ( rule__AlterAddStatement__Group__0 )
            // InternalSql_dsl.g:551:4: rule__AlterAddStatement__Group__0
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
    // InternalSql_dsl.g:560:1: entryRuleAlterUpdateStatement : ruleAlterUpdateStatement EOF ;
    public final void entryRuleAlterUpdateStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:561:1: ( ruleAlterUpdateStatement EOF )
            // InternalSql_dsl.g:562:1: ruleAlterUpdateStatement EOF
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
    // InternalSql_dsl.g:569:1: ruleAlterUpdateStatement : ( ( rule__AlterUpdateStatement__Group__0 ) ) ;
    public final void ruleAlterUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:573:2: ( ( ( rule__AlterUpdateStatement__Group__0 ) ) )
            // InternalSql_dsl.g:574:2: ( ( rule__AlterUpdateStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:574:2: ( ( rule__AlterUpdateStatement__Group__0 ) )
            // InternalSql_dsl.g:575:3: ( rule__AlterUpdateStatement__Group__0 )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getGroup()); 
            // InternalSql_dsl.g:576:3: ( rule__AlterUpdateStatement__Group__0 )
            // InternalSql_dsl.g:576:4: rule__AlterUpdateStatement__Group__0
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
    // InternalSql_dsl.g:585:1: entryRuleVariableDeclarationStatement : ruleVariableDeclarationStatement EOF ;
    public final void entryRuleVariableDeclarationStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:586:1: ( ruleVariableDeclarationStatement EOF )
            // InternalSql_dsl.g:587:1: ruleVariableDeclarationStatement EOF
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
    // InternalSql_dsl.g:594:1: ruleVariableDeclarationStatement : ( ( rule__VariableDeclarationStatement__Group__0 ) ) ;
    public final void ruleVariableDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:598:2: ( ( ( rule__VariableDeclarationStatement__Group__0 ) ) )
            // InternalSql_dsl.g:599:2: ( ( rule__VariableDeclarationStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:599:2: ( ( rule__VariableDeclarationStatement__Group__0 ) )
            // InternalSql_dsl.g:600:3: ( rule__VariableDeclarationStatement__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getGroup()); 
            // InternalSql_dsl.g:601:3: ( rule__VariableDeclarationStatement__Group__0 )
            // InternalSql_dsl.g:601:4: rule__VariableDeclarationStatement__Group__0
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
    // InternalSql_dsl.g:610:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql_dsl.g:614:1: ( ruleREAL EOF )
            // InternalSql_dsl.g:615:1: ruleREAL EOF
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
    // InternalSql_dsl.g:625:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:630:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalSql_dsl.g:631:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalSql_dsl.g:631:2: ( ( rule__REAL__Group__0 ) )
            // InternalSql_dsl.g:632:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalSql_dsl.g:633:3: ( rule__REAL__Group__0 )
            // InternalSql_dsl.g:633:4: rule__REAL__Group__0
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
    // InternalSql_dsl.g:643:1: entryRuleFunctions : ruleFunctions EOF ;
    public final void entryRuleFunctions() throws RecognitionException {
        try {
            // InternalSql_dsl.g:644:1: ( ruleFunctions EOF )
            // InternalSql_dsl.g:645:1: ruleFunctions EOF
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
    // InternalSql_dsl.g:652:1: ruleFunctions : ( ( rule__Functions__Alternatives ) ) ;
    public final void ruleFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:656:2: ( ( ( rule__Functions__Alternatives ) ) )
            // InternalSql_dsl.g:657:2: ( ( rule__Functions__Alternatives ) )
            {
            // InternalSql_dsl.g:657:2: ( ( rule__Functions__Alternatives ) )
            // InternalSql_dsl.g:658:3: ( rule__Functions__Alternatives )
            {
             before(grammarAccess.getFunctionsAccess().getAlternatives()); 
            // InternalSql_dsl.g:659:3: ( rule__Functions__Alternatives )
            // InternalSql_dsl.g:659:4: rule__Functions__Alternatives
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
    // InternalSql_dsl.g:668:1: entryRuleCountFunction : ruleCountFunction EOF ;
    public final void entryRuleCountFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:669:1: ( ruleCountFunction EOF )
            // InternalSql_dsl.g:670:1: ruleCountFunction EOF
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
    // InternalSql_dsl.g:677:1: ruleCountFunction : ( ( rule__CountFunction__Group__0 ) ) ;
    public final void ruleCountFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:681:2: ( ( ( rule__CountFunction__Group__0 ) ) )
            // InternalSql_dsl.g:682:2: ( ( rule__CountFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:682:2: ( ( rule__CountFunction__Group__0 ) )
            // InternalSql_dsl.g:683:3: ( rule__CountFunction__Group__0 )
            {
             before(grammarAccess.getCountFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:684:3: ( rule__CountFunction__Group__0 )
            // InternalSql_dsl.g:684:4: rule__CountFunction__Group__0
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
    // InternalSql_dsl.g:693:1: entryRuleAvgFunction : ruleAvgFunction EOF ;
    public final void entryRuleAvgFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:694:1: ( ruleAvgFunction EOF )
            // InternalSql_dsl.g:695:1: ruleAvgFunction EOF
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
    // InternalSql_dsl.g:702:1: ruleAvgFunction : ( ( rule__AvgFunction__Group__0 ) ) ;
    public final void ruleAvgFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:706:2: ( ( ( rule__AvgFunction__Group__0 ) ) )
            // InternalSql_dsl.g:707:2: ( ( rule__AvgFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:707:2: ( ( rule__AvgFunction__Group__0 ) )
            // InternalSql_dsl.g:708:3: ( rule__AvgFunction__Group__0 )
            {
             before(grammarAccess.getAvgFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:709:3: ( rule__AvgFunction__Group__0 )
            // InternalSql_dsl.g:709:4: rule__AvgFunction__Group__0
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
    // InternalSql_dsl.g:718:1: entryRuleSumFunction : ruleSumFunction EOF ;
    public final void entryRuleSumFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:719:1: ( ruleSumFunction EOF )
            // InternalSql_dsl.g:720:1: ruleSumFunction EOF
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
    // InternalSql_dsl.g:727:1: ruleSumFunction : ( ( rule__SumFunction__Group__0 ) ) ;
    public final void ruleSumFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:731:2: ( ( ( rule__SumFunction__Group__0 ) ) )
            // InternalSql_dsl.g:732:2: ( ( rule__SumFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:732:2: ( ( rule__SumFunction__Group__0 ) )
            // InternalSql_dsl.g:733:3: ( rule__SumFunction__Group__0 )
            {
             before(grammarAccess.getSumFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:734:3: ( rule__SumFunction__Group__0 )
            // InternalSql_dsl.g:734:4: rule__SumFunction__Group__0
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
    // InternalSql_dsl.g:743:1: entryRuleMinFunction : ruleMinFunction EOF ;
    public final void entryRuleMinFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:744:1: ( ruleMinFunction EOF )
            // InternalSql_dsl.g:745:1: ruleMinFunction EOF
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
    // InternalSql_dsl.g:752:1: ruleMinFunction : ( ( rule__MinFunction__Group__0 ) ) ;
    public final void ruleMinFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:756:2: ( ( ( rule__MinFunction__Group__0 ) ) )
            // InternalSql_dsl.g:757:2: ( ( rule__MinFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:757:2: ( ( rule__MinFunction__Group__0 ) )
            // InternalSql_dsl.g:758:3: ( rule__MinFunction__Group__0 )
            {
             before(grammarAccess.getMinFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:759:3: ( rule__MinFunction__Group__0 )
            // InternalSql_dsl.g:759:4: rule__MinFunction__Group__0
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
    // InternalSql_dsl.g:768:1: entryRuleMaxFunction : ruleMaxFunction EOF ;
    public final void entryRuleMaxFunction() throws RecognitionException {
        try {
            // InternalSql_dsl.g:769:1: ( ruleMaxFunction EOF )
            // InternalSql_dsl.g:770:1: ruleMaxFunction EOF
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
    // InternalSql_dsl.g:777:1: ruleMaxFunction : ( ( rule__MaxFunction__Group__0 ) ) ;
    public final void ruleMaxFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:781:2: ( ( ( rule__MaxFunction__Group__0 ) ) )
            // InternalSql_dsl.g:782:2: ( ( rule__MaxFunction__Group__0 ) )
            {
            // InternalSql_dsl.g:782:2: ( ( rule__MaxFunction__Group__0 ) )
            // InternalSql_dsl.g:783:3: ( rule__MaxFunction__Group__0 )
            {
             before(grammarAccess.getMaxFunctionAccess().getGroup()); 
            // InternalSql_dsl.g:784:3: ( rule__MaxFunction__Group__0 )
            // InternalSql_dsl.g:784:4: rule__MaxFunction__Group__0
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
    // InternalSql_dsl.g:793:1: ruleDataStructureType : ( ( rule__DataStructureType__Alternatives ) ) ;
    public final void ruleDataStructureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:797:1: ( ( ( rule__DataStructureType__Alternatives ) ) )
            // InternalSql_dsl.g:798:2: ( ( rule__DataStructureType__Alternatives ) )
            {
            // InternalSql_dsl.g:798:2: ( ( rule__DataStructureType__Alternatives ) )
            // InternalSql_dsl.g:799:3: ( rule__DataStructureType__Alternatives )
            {
             before(grammarAccess.getDataStructureTypeAccess().getAlternatives()); 
            // InternalSql_dsl.g:800:3: ( rule__DataStructureType__Alternatives )
            // InternalSql_dsl.g:800:4: rule__DataStructureType__Alternatives
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
    // InternalSql_dsl.g:808:1: rule__Statement__Alternatives : ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) | ( ruleVariableDeclarationStatement ) | ( ruleSelectStatement ) | ( ruleDeleteTableStatement ) | ( ruleUpdateTableStatement ) | ( ruleFunctions ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:812:1: ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) | ( ruleVariableDeclarationStatement ) | ( ruleSelectStatement ) | ( ruleDeleteTableStatement ) | ( ruleUpdateTableStatement ) | ( ruleFunctions ) )
            int alt3=10;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSql_dsl.g:813:2: ( ruleDatabaseDeclarationStatement )
                    {
                    // InternalSql_dsl.g:813:2: ( ruleDatabaseDeclarationStatement )
                    // InternalSql_dsl.g:814:3: ruleDatabaseDeclarationStatement
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
                    // InternalSql_dsl.g:819:2: ( ruleCreateTableStatement )
                    {
                    // InternalSql_dsl.g:819:2: ( ruleCreateTableStatement )
                    // InternalSql_dsl.g:820:3: ruleCreateTableStatement
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
                    // InternalSql_dsl.g:825:2: ( ruleDropTableStatement )
                    {
                    // InternalSql_dsl.g:825:2: ( ruleDropTableStatement )
                    // InternalSql_dsl.g:826:3: ruleDropTableStatement
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
                    // InternalSql_dsl.g:831:2: ( ruleTruncateTableStatement )
                    {
                    // InternalSql_dsl.g:831:2: ( ruleTruncateTableStatement )
                    // InternalSql_dsl.g:832:3: ruleTruncateTableStatement
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
                    // InternalSql_dsl.g:837:2: ( ruleAlterTableStatement )
                    {
                    // InternalSql_dsl.g:837:2: ( ruleAlterTableStatement )
                    // InternalSql_dsl.g:838:3: ruleAlterTableStatement
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
                    // InternalSql_dsl.g:843:2: ( ruleVariableDeclarationStatement )
                    {
                    // InternalSql_dsl.g:843:2: ( ruleVariableDeclarationStatement )
                    // InternalSql_dsl.g:844:3: ruleVariableDeclarationStatement
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
                    // InternalSql_dsl.g:849:2: ( ruleSelectStatement )
                    {
                    // InternalSql_dsl.g:849:2: ( ruleSelectStatement )
                    // InternalSql_dsl.g:850:3: ruleSelectStatement
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
                    // InternalSql_dsl.g:855:2: ( ruleDeleteTableStatement )
                    {
                    // InternalSql_dsl.g:855:2: ( ruleDeleteTableStatement )
                    // InternalSql_dsl.g:856:3: ruleDeleteTableStatement
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
                    // InternalSql_dsl.g:861:2: ( ruleUpdateTableStatement )
                    {
                    // InternalSql_dsl.g:861:2: ( ruleUpdateTableStatement )
                    // InternalSql_dsl.g:862:3: ruleUpdateTableStatement
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
                    // InternalSql_dsl.g:867:2: ( ruleFunctions )
                    {
                    // InternalSql_dsl.g:867:2: ( ruleFunctions )
                    // InternalSql_dsl.g:868:3: ruleFunctions
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
    // InternalSql_dsl.g:877:1: rule__SelectStatement__Alternatives_1 : ( ( '*' ) | ( ( rule__SelectStatement__Group_1_1__0 )* ) );
    public final void rule__SelectStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:881:1: ( ( '*' ) | ( ( rule__SelectStatement__Group_1_1__0 )* ) )
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
                    // InternalSql_dsl.g:882:2: ( '*' )
                    {
                    // InternalSql_dsl.g:882:2: ( '*' )
                    // InternalSql_dsl.g:883:3: '*'
                    {
                     before(grammarAccess.getSelectStatementAccess().getAsteriskKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSelectStatementAccess().getAsteriskKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:888:2: ( ( rule__SelectStatement__Group_1_1__0 )* )
                    {
                    // InternalSql_dsl.g:888:2: ( ( rule__SelectStatement__Group_1_1__0 )* )
                    // InternalSql_dsl.g:889:3: ( rule__SelectStatement__Group_1_1__0 )*
                    {
                     before(grammarAccess.getSelectStatementAccess().getGroup_1_1()); 
                    // InternalSql_dsl.g:890:3: ( rule__SelectStatement__Group_1_1__0 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSql_dsl.g:890:4: rule__SelectStatement__Group_1_1__0
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
    // InternalSql_dsl.g:898:1: rule__FromAndWhereClauses__Alternatives_2_2_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__FromAndWhereClauses__Alternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:902:1: ( ( 'AND' ) | ( 'OR' ) )
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
                    // InternalSql_dsl.g:903:2: ( 'AND' )
                    {
                    // InternalSql_dsl.g:903:2: ( 'AND' )
                    // InternalSql_dsl.g:904:3: 'AND'
                    {
                     before(grammarAccess.getFromAndWhereClausesAccess().getANDKeyword_2_2_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFromAndWhereClausesAccess().getANDKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:909:2: ( 'OR' )
                    {
                    // InternalSql_dsl.g:909:2: ( 'OR' )
                    // InternalSql_dsl.g:910:3: 'OR'
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


    // $ANTLR start "rule__WhereDec__Alternatives_1"
    // InternalSql_dsl.g:919:1: rule__WhereDec__Alternatives_1 : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '!=' ) | ( 'LIKE' ) );
    public final void rule__WhereDec__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:923:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '!=' ) | ( 'LIKE' ) )
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
                    // InternalSql_dsl.g:924:2: ( '=' )
                    {
                    // InternalSql_dsl.g:924:2: ( '=' )
                    // InternalSql_dsl.g:925:3: '='
                    {
                     before(grammarAccess.getWhereDecAccess().getEqualsSignKeyword_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:930:2: ( '<' )
                    {
                    // InternalSql_dsl.g:930:2: ( '<' )
                    // InternalSql_dsl.g:931:3: '<'
                    {
                     before(grammarAccess.getWhereDecAccess().getLessThanSignKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getLessThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:936:2: ( '<=' )
                    {
                    // InternalSql_dsl.g:936:2: ( '<=' )
                    // InternalSql_dsl.g:937:3: '<='
                    {
                     before(grammarAccess.getWhereDecAccess().getLessThanSignEqualsSignKeyword_1_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getLessThanSignEqualsSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:942:2: ( '>' )
                    {
                    // InternalSql_dsl.g:942:2: ( '>' )
                    // InternalSql_dsl.g:943:3: '>'
                    {
                     before(grammarAccess.getWhereDecAccess().getGreaterThanSignKeyword_1_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getGreaterThanSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:948:2: ( '>=' )
                    {
                    // InternalSql_dsl.g:948:2: ( '>=' )
                    // InternalSql_dsl.g:949:3: '>='
                    {
                     before(grammarAccess.getWhereDecAccess().getGreaterThanSignEqualsSignKeyword_1_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getGreaterThanSignEqualsSignKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:954:2: ( '!=' )
                    {
                    // InternalSql_dsl.g:954:2: ( '!=' )
                    // InternalSql_dsl.g:955:3: '!='
                    {
                     before(grammarAccess.getWhereDecAccess().getExclamationMarkEqualsSignKeyword_1_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getExclamationMarkEqualsSignKeyword_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:960:2: ( 'LIKE' )
                    {
                    // InternalSql_dsl.g:960:2: ( 'LIKE' )
                    // InternalSql_dsl.g:961:3: 'LIKE'
                    {
                     before(grammarAccess.getWhereDecAccess().getLIKEKeyword_1_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getWhereDecAccess().getLIKEKeyword_1_6()); 

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
    // $ANTLR end "rule__WhereDec__Alternatives_1"


    // $ANTLR start "rule__WhereDec__Alternatives_2"
    // InternalSql_dsl.g:970:1: rule__WhereDec__Alternatives_2 : ( ( ( rule__WhereDec__Group_2_0__0 ) ) | ( ( rule__WhereDec__ColumnAssignment_2_1 ) ) | ( ( rule__WhereDec__ValAssignment_2_2 ) ) );
    public final void rule__WhereDec__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:974:1: ( ( ( rule__WhereDec__Group_2_0__0 ) ) | ( ( rule__WhereDec__ColumnAssignment_2_1 ) ) | ( ( rule__WhereDec__ValAssignment_2_2 ) ) )
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
                    // InternalSql_dsl.g:975:2: ( ( rule__WhereDec__Group_2_0__0 ) )
                    {
                    // InternalSql_dsl.g:975:2: ( ( rule__WhereDec__Group_2_0__0 ) )
                    // InternalSql_dsl.g:976:3: ( rule__WhereDec__Group_2_0__0 )
                    {
                     before(grammarAccess.getWhereDecAccess().getGroup_2_0()); 
                    // InternalSql_dsl.g:977:3: ( rule__WhereDec__Group_2_0__0 )
                    // InternalSql_dsl.g:977:4: rule__WhereDec__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereDec__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereDecAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:981:2: ( ( rule__WhereDec__ColumnAssignment_2_1 ) )
                    {
                    // InternalSql_dsl.g:981:2: ( ( rule__WhereDec__ColumnAssignment_2_1 ) )
                    // InternalSql_dsl.g:982:3: ( rule__WhereDec__ColumnAssignment_2_1 )
                    {
                     before(grammarAccess.getWhereDecAccess().getColumnAssignment_2_1()); 
                    // InternalSql_dsl.g:983:3: ( rule__WhereDec__ColumnAssignment_2_1 )
                    // InternalSql_dsl.g:983:4: rule__WhereDec__ColumnAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereDec__ColumnAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereDecAccess().getColumnAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:987:2: ( ( rule__WhereDec__ValAssignment_2_2 ) )
                    {
                    // InternalSql_dsl.g:987:2: ( ( rule__WhereDec__ValAssignment_2_2 ) )
                    // InternalSql_dsl.g:988:3: ( rule__WhereDec__ValAssignment_2_2 )
                    {
                     before(grammarAccess.getWhereDecAccess().getValAssignment_2_2()); 
                    // InternalSql_dsl.g:989:3: ( rule__WhereDec__ValAssignment_2_2 )
                    // InternalSql_dsl.g:989:4: rule__WhereDec__ValAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereDec__ValAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereDecAccess().getValAssignment_2_2()); 

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
    // $ANTLR end "rule__WhereDec__Alternatives_2"


    // $ANTLR start "rule__TableDeclaration__AttributesAlternatives_4_0"
    // InternalSql_dsl.g:997:1: rule__TableDeclaration__AttributesAlternatives_4_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TableDeclaration__AttributesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1001:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
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
                    // InternalSql_dsl.g:1002:2: ( ruleColumnDeclaration )
                    {
                    // InternalSql_dsl.g:1002:2: ( ruleColumnDeclaration )
                    // InternalSql_dsl.g:1003:3: ruleColumnDeclaration
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
                    // InternalSql_dsl.g:1008:2: ( rulePrimaryKey )
                    {
                    // InternalSql_dsl.g:1008:2: ( rulePrimaryKey )
                    // InternalSql_dsl.g:1009:3: rulePrimaryKey
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
                    // InternalSql_dsl.g:1014:2: ( ruleForeignKey )
                    {
                    // InternalSql_dsl.g:1014:2: ( ruleForeignKey )
                    // InternalSql_dsl.g:1015:3: ruleForeignKey
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
    // InternalSql_dsl.g:1024:1: rule__TableDeclaration__AttributesAlternatives_5_1_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TableDeclaration__AttributesAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1028:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
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
                    // InternalSql_dsl.g:1029:2: ( ruleColumnDeclaration )
                    {
                    // InternalSql_dsl.g:1029:2: ( ruleColumnDeclaration )
                    // InternalSql_dsl.g:1030:3: ruleColumnDeclaration
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
                    // InternalSql_dsl.g:1035:2: ( rulePrimaryKey )
                    {
                    // InternalSql_dsl.g:1035:2: ( rulePrimaryKey )
                    // InternalSql_dsl.g:1036:3: rulePrimaryKey
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
                    // InternalSql_dsl.g:1041:2: ( ruleForeignKey )
                    {
                    // InternalSql_dsl.g:1041:2: ( ruleForeignKey )
                    // InternalSql_dsl.g:1042:3: ruleForeignKey
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
    // InternalSql_dsl.g:1051:1: rule__UpdateTableStatement__Alternatives_5_2_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__UpdateTableStatement__Alternatives_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1055:1: ( ( 'AND' ) | ( 'OR' ) )
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
                    // InternalSql_dsl.g:1056:2: ( 'AND' )
                    {
                    // InternalSql_dsl.g:1056:2: ( 'AND' )
                    // InternalSql_dsl.g:1057:3: 'AND'
                    {
                     before(grammarAccess.getUpdateTableStatementAccess().getANDKeyword_5_2_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getUpdateTableStatementAccess().getANDKeyword_5_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1062:2: ( 'OR' )
                    {
                    // InternalSql_dsl.g:1062:2: ( 'OR' )
                    // InternalSql_dsl.g:1063:3: 'OR'
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
    // InternalSql_dsl.g:1072:1: rule__SetClause__Alternatives_2 : ( ( ( rule__SetClause__Group_2_0__0 ) ) | ( ( rule__SetClause__ValAssignment_2_1 ) ) );
    public final void rule__SetClause__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1076:1: ( ( ( rule__SetClause__Group_2_0__0 ) ) | ( ( rule__SetClause__ValAssignment_2_1 ) ) )
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
                    // InternalSql_dsl.g:1077:2: ( ( rule__SetClause__Group_2_0__0 ) )
                    {
                    // InternalSql_dsl.g:1077:2: ( ( rule__SetClause__Group_2_0__0 ) )
                    // InternalSql_dsl.g:1078:3: ( rule__SetClause__Group_2_0__0 )
                    {
                     before(grammarAccess.getSetClauseAccess().getGroup_2_0()); 
                    // InternalSql_dsl.g:1079:3: ( rule__SetClause__Group_2_0__0 )
                    // InternalSql_dsl.g:1079:4: rule__SetClause__Group_2_0__0
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
                    // InternalSql_dsl.g:1083:2: ( ( rule__SetClause__ValAssignment_2_1 ) )
                    {
                    // InternalSql_dsl.g:1083:2: ( ( rule__SetClause__ValAssignment_2_1 ) )
                    // InternalSql_dsl.g:1084:3: ( rule__SetClause__ValAssignment_2_1 )
                    {
                     before(grammarAccess.getSetClauseAccess().getValAssignment_2_1()); 
                    // InternalSql_dsl.g:1085:3: ( rule__SetClause__ValAssignment_2_1 )
                    // InternalSql_dsl.g:1085:4: rule__SetClause__ValAssignment_2_1
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
    // InternalSql_dsl.g:1093:1: rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 : ( ( ruleAlterDropStatement ) | ( ruleAlterAddStatement ) | ( ruleAlterUpdateStatement ) );
    public final void rule__AlterTableStatement__AddDropUpdateAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1097:1: ( ( ruleAlterDropStatement ) | ( ruleAlterAddStatement ) | ( ruleAlterUpdateStatement ) )
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
                    // InternalSql_dsl.g:1098:2: ( ruleAlterDropStatement )
                    {
                    // InternalSql_dsl.g:1098:2: ( ruleAlterDropStatement )
                    // InternalSql_dsl.g:1099:3: ruleAlterDropStatement
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
                    // InternalSql_dsl.g:1104:2: ( ruleAlterAddStatement )
                    {
                    // InternalSql_dsl.g:1104:2: ( ruleAlterAddStatement )
                    // InternalSql_dsl.g:1105:3: ruleAlterAddStatement
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
                    // InternalSql_dsl.g:1110:2: ( ruleAlterUpdateStatement )
                    {
                    // InternalSql_dsl.g:1110:2: ( ruleAlterUpdateStatement )
                    // InternalSql_dsl.g:1111:3: ruleAlterUpdateStatement
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
    // InternalSql_dsl.g:1120:1: rule__Functions__Alternatives : ( ( ruleCountFunction ) | ( ruleAvgFunction ) | ( ruleSumFunction ) | ( ruleMinFunction ) | ( ruleMaxFunction ) );
    public final void rule__Functions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1124:1: ( ( ruleCountFunction ) | ( ruleAvgFunction ) | ( ruleSumFunction ) | ( ruleMinFunction ) | ( ruleMaxFunction ) )
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
                    // InternalSql_dsl.g:1125:2: ( ruleCountFunction )
                    {
                    // InternalSql_dsl.g:1125:2: ( ruleCountFunction )
                    // InternalSql_dsl.g:1126:3: ruleCountFunction
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
                    // InternalSql_dsl.g:1131:2: ( ruleAvgFunction )
                    {
                    // InternalSql_dsl.g:1131:2: ( ruleAvgFunction )
                    // InternalSql_dsl.g:1132:3: ruleAvgFunction
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
                    // InternalSql_dsl.g:1137:2: ( ruleSumFunction )
                    {
                    // InternalSql_dsl.g:1137:2: ( ruleSumFunction )
                    // InternalSql_dsl.g:1138:3: ruleSumFunction
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
                    // InternalSql_dsl.g:1143:2: ( ruleMinFunction )
                    {
                    // InternalSql_dsl.g:1143:2: ( ruleMinFunction )
                    // InternalSql_dsl.g:1144:3: ruleMinFunction
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
                    // InternalSql_dsl.g:1149:2: ( ruleMaxFunction )
                    {
                    // InternalSql_dsl.g:1149:2: ( ruleMaxFunction )
                    // InternalSql_dsl.g:1150:3: ruleMaxFunction
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
    // InternalSql_dsl.g:1159:1: rule__DataStructureType__Alternatives : ( ( ( 'varchar' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) );
    public final void rule__DataStructureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1163:1: ( ( ( 'varchar' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) )
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
                    // InternalSql_dsl.g:1164:2: ( ( 'varchar' ) )
                    {
                    // InternalSql_dsl.g:1164:2: ( ( 'varchar' ) )
                    // InternalSql_dsl.g:1165:3: ( 'varchar' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 
                    // InternalSql_dsl.g:1166:3: ( 'varchar' )
                    // InternalSql_dsl.g:1166:4: 'varchar'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:1170:2: ( ( 'char' ) )
                    {
                    // InternalSql_dsl.g:1170:2: ( ( 'char' ) )
                    // InternalSql_dsl.g:1171:3: ( 'char' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // InternalSql_dsl.g:1172:3: ( 'char' )
                    // InternalSql_dsl.g:1172:4: 'char'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:1176:2: ( ( 'date' ) )
                    {
                    // InternalSql_dsl.g:1176:2: ( ( 'date' ) )
                    // InternalSql_dsl.g:1177:3: ( 'date' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2()); 
                    // InternalSql_dsl.g:1178:3: ( 'date' )
                    // InternalSql_dsl.g:1178:4: 'date'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:1182:2: ( ( 'int' ) )
                    {
                    // InternalSql_dsl.g:1182:2: ( ( 'int' ) )
                    // InternalSql_dsl.g:1183:3: ( 'int' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    // InternalSql_dsl.g:1184:3: ( 'int' )
                    // InternalSql_dsl.g:1184:4: 'int'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:1188:2: ( ( 'float' ) )
                    {
                    // InternalSql_dsl.g:1188:2: ( ( 'float' ) )
                    // InternalSql_dsl.g:1189:3: ( 'float' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // InternalSql_dsl.g:1190:3: ( 'float' )
                    // InternalSql_dsl.g:1190:4: 'float'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:1194:2: ( ( 'time' ) )
                    {
                    // InternalSql_dsl.g:1194:2: ( ( 'time' ) )
                    // InternalSql_dsl.g:1195:3: ( 'time' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5()); 
                    // InternalSql_dsl.g:1196:3: ( 'time' )
                    // InternalSql_dsl.g:1196:4: 'time'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:1200:2: ( ( 'text' ) )
                    {
                    // InternalSql_dsl.g:1200:2: ( ( 'text' ) )
                    // InternalSql_dsl.g:1201:3: ( 'text' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getTEXTEnumLiteralDeclaration_6()); 
                    // InternalSql_dsl.g:1202:3: ( 'text' )
                    // InternalSql_dsl.g:1202:4: 'text'
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
    // InternalSql_dsl.g:1210:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1214:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalSql_dsl.g:1215:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
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
    // InternalSql_dsl.g:1222:1: rule__SelectStatement__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1226:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:1227:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:1227:1: ( 'SELECT' )
            // InternalSql_dsl.g:1228:2: 'SELECT'
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
    // InternalSql_dsl.g:1237:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1241:1: ( rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 )
            // InternalSql_dsl.g:1242:2: rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2
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
    // InternalSql_dsl.g:1249:1: rule__SelectStatement__Group__1__Impl : ( ( rule__SelectStatement__Alternatives_1 ) ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1253:1: ( ( ( rule__SelectStatement__Alternatives_1 ) ) )
            // InternalSql_dsl.g:1254:1: ( ( rule__SelectStatement__Alternatives_1 ) )
            {
            // InternalSql_dsl.g:1254:1: ( ( rule__SelectStatement__Alternatives_1 ) )
            // InternalSql_dsl.g:1255:2: ( rule__SelectStatement__Alternatives_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getAlternatives_1()); 
            // InternalSql_dsl.g:1256:2: ( rule__SelectStatement__Alternatives_1 )
            // InternalSql_dsl.g:1256:3: rule__SelectStatement__Alternatives_1
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
    // InternalSql_dsl.g:1264:1: rule__SelectStatement__Group__2 : rule__SelectStatement__Group__2__Impl ;
    public final void rule__SelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1268:1: ( rule__SelectStatement__Group__2__Impl )
            // InternalSql_dsl.g:1269:2: rule__SelectStatement__Group__2__Impl
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
    // InternalSql_dsl.g:1275:1: rule__SelectStatement__Group__2__Impl : ( ( rule__SelectStatement__XAssignment_2 ) ) ;
    public final void rule__SelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1279:1: ( ( ( rule__SelectStatement__XAssignment_2 ) ) )
            // InternalSql_dsl.g:1280:1: ( ( rule__SelectStatement__XAssignment_2 ) )
            {
            // InternalSql_dsl.g:1280:1: ( ( rule__SelectStatement__XAssignment_2 ) )
            // InternalSql_dsl.g:1281:2: ( rule__SelectStatement__XAssignment_2 )
            {
             before(grammarAccess.getSelectStatementAccess().getXAssignment_2()); 
            // InternalSql_dsl.g:1282:2: ( rule__SelectStatement__XAssignment_2 )
            // InternalSql_dsl.g:1282:3: rule__SelectStatement__XAssignment_2
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
    // InternalSql_dsl.g:1291:1: rule__SelectStatement__Group_1_1__0 : rule__SelectStatement__Group_1_1__0__Impl rule__SelectStatement__Group_1_1__1 ;
    public final void rule__SelectStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1295:1: ( rule__SelectStatement__Group_1_1__0__Impl rule__SelectStatement__Group_1_1__1 )
            // InternalSql_dsl.g:1296:2: rule__SelectStatement__Group_1_1__0__Impl rule__SelectStatement__Group_1_1__1
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
    // InternalSql_dsl.g:1303:1: rule__SelectStatement__Group_1_1__0__Impl : ( ( rule__SelectStatement__ColumnAssignment_1_1_0 ) ) ;
    public final void rule__SelectStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1307:1: ( ( ( rule__SelectStatement__ColumnAssignment_1_1_0 ) ) )
            // InternalSql_dsl.g:1308:1: ( ( rule__SelectStatement__ColumnAssignment_1_1_0 ) )
            {
            // InternalSql_dsl.g:1308:1: ( ( rule__SelectStatement__ColumnAssignment_1_1_0 ) )
            // InternalSql_dsl.g:1309:2: ( rule__SelectStatement__ColumnAssignment_1_1_0 )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnAssignment_1_1_0()); 
            // InternalSql_dsl.g:1310:2: ( rule__SelectStatement__ColumnAssignment_1_1_0 )
            // InternalSql_dsl.g:1310:3: rule__SelectStatement__ColumnAssignment_1_1_0
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
    // InternalSql_dsl.g:1318:1: rule__SelectStatement__Group_1_1__1 : rule__SelectStatement__Group_1_1__1__Impl ;
    public final void rule__SelectStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1322:1: ( rule__SelectStatement__Group_1_1__1__Impl )
            // InternalSql_dsl.g:1323:2: rule__SelectStatement__Group_1_1__1__Impl
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
    // InternalSql_dsl.g:1329:1: rule__SelectStatement__Group_1_1__1__Impl : ( ( rule__SelectStatement__Group_1_1_1__0 )* ) ;
    public final void rule__SelectStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1333:1: ( ( ( rule__SelectStatement__Group_1_1_1__0 )* ) )
            // InternalSql_dsl.g:1334:1: ( ( rule__SelectStatement__Group_1_1_1__0 )* )
            {
            // InternalSql_dsl.g:1334:1: ( ( rule__SelectStatement__Group_1_1_1__0 )* )
            // InternalSql_dsl.g:1335:2: ( rule__SelectStatement__Group_1_1_1__0 )*
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_1_1_1()); 
            // InternalSql_dsl.g:1336:2: ( rule__SelectStatement__Group_1_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSql_dsl.g:1336:3: rule__SelectStatement__Group_1_1_1__0
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
    // InternalSql_dsl.g:1345:1: rule__SelectStatement__Group_1_1_1__0 : rule__SelectStatement__Group_1_1_1__0__Impl rule__SelectStatement__Group_1_1_1__1 ;
    public final void rule__SelectStatement__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1349:1: ( rule__SelectStatement__Group_1_1_1__0__Impl rule__SelectStatement__Group_1_1_1__1 )
            // InternalSql_dsl.g:1350:2: rule__SelectStatement__Group_1_1_1__0__Impl rule__SelectStatement__Group_1_1_1__1
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
    // InternalSql_dsl.g:1357:1: rule__SelectStatement__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__SelectStatement__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1361:1: ( ( ',' ) )
            // InternalSql_dsl.g:1362:1: ( ',' )
            {
            // InternalSql_dsl.g:1362:1: ( ',' )
            // InternalSql_dsl.g:1363:2: ','
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
    // InternalSql_dsl.g:1372:1: rule__SelectStatement__Group_1_1_1__1 : rule__SelectStatement__Group_1_1_1__1__Impl ;
    public final void rule__SelectStatement__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1376:1: ( rule__SelectStatement__Group_1_1_1__1__Impl )
            // InternalSql_dsl.g:1377:2: rule__SelectStatement__Group_1_1_1__1__Impl
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
    // InternalSql_dsl.g:1383:1: rule__SelectStatement__Group_1_1_1__1__Impl : ( ( rule__SelectStatement__ColumnAssignment_1_1_1_1 ) ) ;
    public final void rule__SelectStatement__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1387:1: ( ( ( rule__SelectStatement__ColumnAssignment_1_1_1_1 ) ) )
            // InternalSql_dsl.g:1388:1: ( ( rule__SelectStatement__ColumnAssignment_1_1_1_1 ) )
            {
            // InternalSql_dsl.g:1388:1: ( ( rule__SelectStatement__ColumnAssignment_1_1_1_1 ) )
            // InternalSql_dsl.g:1389:2: ( rule__SelectStatement__ColumnAssignment_1_1_1_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnAssignment_1_1_1_1()); 
            // InternalSql_dsl.g:1390:2: ( rule__SelectStatement__ColumnAssignment_1_1_1_1 )
            // InternalSql_dsl.g:1390:3: rule__SelectStatement__ColumnAssignment_1_1_1_1
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
    // InternalSql_dsl.g:1399:1: rule__FromAndWhereClauses__Group__0 : rule__FromAndWhereClauses__Group__0__Impl rule__FromAndWhereClauses__Group__1 ;
    public final void rule__FromAndWhereClauses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1403:1: ( rule__FromAndWhereClauses__Group__0__Impl rule__FromAndWhereClauses__Group__1 )
            // InternalSql_dsl.g:1404:2: rule__FromAndWhereClauses__Group__0__Impl rule__FromAndWhereClauses__Group__1
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
    // InternalSql_dsl.g:1411:1: rule__FromAndWhereClauses__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__FromAndWhereClauses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1415:1: ( ( 'FROM' ) )
            // InternalSql_dsl.g:1416:1: ( 'FROM' )
            {
            // InternalSql_dsl.g:1416:1: ( 'FROM' )
            // InternalSql_dsl.g:1417:2: 'FROM'
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
    // InternalSql_dsl.g:1426:1: rule__FromAndWhereClauses__Group__1 : rule__FromAndWhereClauses__Group__1__Impl rule__FromAndWhereClauses__Group__2 ;
    public final void rule__FromAndWhereClauses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1430:1: ( rule__FromAndWhereClauses__Group__1__Impl rule__FromAndWhereClauses__Group__2 )
            // InternalSql_dsl.g:1431:2: rule__FromAndWhereClauses__Group__1__Impl rule__FromAndWhereClauses__Group__2
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
    // InternalSql_dsl.g:1438:1: rule__FromAndWhereClauses__Group__1__Impl : ( ( rule__FromAndWhereClauses__TableAssignment_1 ) ) ;
    public final void rule__FromAndWhereClauses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1442:1: ( ( ( rule__FromAndWhereClauses__TableAssignment_1 ) ) )
            // InternalSql_dsl.g:1443:1: ( ( rule__FromAndWhereClauses__TableAssignment_1 ) )
            {
            // InternalSql_dsl.g:1443:1: ( ( rule__FromAndWhereClauses__TableAssignment_1 ) )
            // InternalSql_dsl.g:1444:2: ( rule__FromAndWhereClauses__TableAssignment_1 )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getTableAssignment_1()); 
            // InternalSql_dsl.g:1445:2: ( rule__FromAndWhereClauses__TableAssignment_1 )
            // InternalSql_dsl.g:1445:3: rule__FromAndWhereClauses__TableAssignment_1
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
    // InternalSql_dsl.g:1453:1: rule__FromAndWhereClauses__Group__2 : rule__FromAndWhereClauses__Group__2__Impl ;
    public final void rule__FromAndWhereClauses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1457:1: ( rule__FromAndWhereClauses__Group__2__Impl )
            // InternalSql_dsl.g:1458:2: rule__FromAndWhereClauses__Group__2__Impl
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
    // InternalSql_dsl.g:1464:1: rule__FromAndWhereClauses__Group__2__Impl : ( ( rule__FromAndWhereClauses__Group_2__0 )? ) ;
    public final void rule__FromAndWhereClauses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1468:1: ( ( ( rule__FromAndWhereClauses__Group_2__0 )? ) )
            // InternalSql_dsl.g:1469:1: ( ( rule__FromAndWhereClauses__Group_2__0 )? )
            {
            // InternalSql_dsl.g:1469:1: ( ( rule__FromAndWhereClauses__Group_2__0 )? )
            // InternalSql_dsl.g:1470:2: ( rule__FromAndWhereClauses__Group_2__0 )?
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getGroup_2()); 
            // InternalSql_dsl.g:1471:2: ( rule__FromAndWhereClauses__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSql_dsl.g:1471:3: rule__FromAndWhereClauses__Group_2__0
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
    // InternalSql_dsl.g:1480:1: rule__FromAndWhereClauses__Group_2__0 : rule__FromAndWhereClauses__Group_2__0__Impl rule__FromAndWhereClauses__Group_2__1 ;
    public final void rule__FromAndWhereClauses__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1484:1: ( rule__FromAndWhereClauses__Group_2__0__Impl rule__FromAndWhereClauses__Group_2__1 )
            // InternalSql_dsl.g:1485:2: rule__FromAndWhereClauses__Group_2__0__Impl rule__FromAndWhereClauses__Group_2__1
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
    // InternalSql_dsl.g:1492:1: rule__FromAndWhereClauses__Group_2__0__Impl : ( 'WHERE' ) ;
    public final void rule__FromAndWhereClauses__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1496:1: ( ( 'WHERE' ) )
            // InternalSql_dsl.g:1497:1: ( 'WHERE' )
            {
            // InternalSql_dsl.g:1497:1: ( 'WHERE' )
            // InternalSql_dsl.g:1498:2: 'WHERE'
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
    // InternalSql_dsl.g:1507:1: rule__FromAndWhereClauses__Group_2__1 : rule__FromAndWhereClauses__Group_2__1__Impl rule__FromAndWhereClauses__Group_2__2 ;
    public final void rule__FromAndWhereClauses__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1511:1: ( rule__FromAndWhereClauses__Group_2__1__Impl rule__FromAndWhereClauses__Group_2__2 )
            // InternalSql_dsl.g:1512:2: rule__FromAndWhereClauses__Group_2__1__Impl rule__FromAndWhereClauses__Group_2__2
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
    // InternalSql_dsl.g:1519:1: rule__FromAndWhereClauses__Group_2__1__Impl : ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) ) ;
    public final void rule__FromAndWhereClauses__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1523:1: ( ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) ) )
            // InternalSql_dsl.g:1524:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) )
            {
            // InternalSql_dsl.g:1524:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_1 ) )
            // InternalSql_dsl.g:1525:2: ( rule__FromAndWhereClauses__ZAssignment_2_1 )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_1()); 
            // InternalSql_dsl.g:1526:2: ( rule__FromAndWhereClauses__ZAssignment_2_1 )
            // InternalSql_dsl.g:1526:3: rule__FromAndWhereClauses__ZAssignment_2_1
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
    // InternalSql_dsl.g:1534:1: rule__FromAndWhereClauses__Group_2__2 : rule__FromAndWhereClauses__Group_2__2__Impl ;
    public final void rule__FromAndWhereClauses__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1538:1: ( rule__FromAndWhereClauses__Group_2__2__Impl )
            // InternalSql_dsl.g:1539:2: rule__FromAndWhereClauses__Group_2__2__Impl
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
    // InternalSql_dsl.g:1545:1: rule__FromAndWhereClauses__Group_2__2__Impl : ( ( rule__FromAndWhereClauses__Group_2_2__0 )* ) ;
    public final void rule__FromAndWhereClauses__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1549:1: ( ( ( rule__FromAndWhereClauses__Group_2_2__0 )* ) )
            // InternalSql_dsl.g:1550:1: ( ( rule__FromAndWhereClauses__Group_2_2__0 )* )
            {
            // InternalSql_dsl.g:1550:1: ( ( rule__FromAndWhereClauses__Group_2_2__0 )* )
            // InternalSql_dsl.g:1551:2: ( rule__FromAndWhereClauses__Group_2_2__0 )*
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getGroup_2_2()); 
            // InternalSql_dsl.g:1552:2: ( rule__FromAndWhereClauses__Group_2_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=13)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSql_dsl.g:1552:3: rule__FromAndWhereClauses__Group_2_2__0
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
    // InternalSql_dsl.g:1561:1: rule__FromAndWhereClauses__Group_2_2__0 : rule__FromAndWhereClauses__Group_2_2__0__Impl rule__FromAndWhereClauses__Group_2_2__1 ;
    public final void rule__FromAndWhereClauses__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1565:1: ( rule__FromAndWhereClauses__Group_2_2__0__Impl rule__FromAndWhereClauses__Group_2_2__1 )
            // InternalSql_dsl.g:1566:2: rule__FromAndWhereClauses__Group_2_2__0__Impl rule__FromAndWhereClauses__Group_2_2__1
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
    // InternalSql_dsl.g:1573:1: rule__FromAndWhereClauses__Group_2_2__0__Impl : ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) ) ;
    public final void rule__FromAndWhereClauses__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1577:1: ( ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) ) )
            // InternalSql_dsl.g:1578:1: ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) )
            {
            // InternalSql_dsl.g:1578:1: ( ( rule__FromAndWhereClauses__Alternatives_2_2_0 ) )
            // InternalSql_dsl.g:1579:2: ( rule__FromAndWhereClauses__Alternatives_2_2_0 )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getAlternatives_2_2_0()); 
            // InternalSql_dsl.g:1580:2: ( rule__FromAndWhereClauses__Alternatives_2_2_0 )
            // InternalSql_dsl.g:1580:3: rule__FromAndWhereClauses__Alternatives_2_2_0
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
    // InternalSql_dsl.g:1588:1: rule__FromAndWhereClauses__Group_2_2__1 : rule__FromAndWhereClauses__Group_2_2__1__Impl ;
    public final void rule__FromAndWhereClauses__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1592:1: ( rule__FromAndWhereClauses__Group_2_2__1__Impl )
            // InternalSql_dsl.g:1593:2: rule__FromAndWhereClauses__Group_2_2__1__Impl
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
    // InternalSql_dsl.g:1599:1: rule__FromAndWhereClauses__Group_2_2__1__Impl : ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) ) ;
    public final void rule__FromAndWhereClauses__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1603:1: ( ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) ) )
            // InternalSql_dsl.g:1604:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) )
            {
            // InternalSql_dsl.g:1604:1: ( ( rule__FromAndWhereClauses__ZAssignment_2_2_1 ) )
            // InternalSql_dsl.g:1605:2: ( rule__FromAndWhereClauses__ZAssignment_2_2_1 )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getZAssignment_2_2_1()); 
            // InternalSql_dsl.g:1606:2: ( rule__FromAndWhereClauses__ZAssignment_2_2_1 )
            // InternalSql_dsl.g:1606:3: rule__FromAndWhereClauses__ZAssignment_2_2_1
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
    // InternalSql_dsl.g:1615:1: rule__WhereDec__Group__0 : rule__WhereDec__Group__0__Impl rule__WhereDec__Group__1 ;
    public final void rule__WhereDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1619:1: ( rule__WhereDec__Group__0__Impl rule__WhereDec__Group__1 )
            // InternalSql_dsl.g:1620:2: rule__WhereDec__Group__0__Impl rule__WhereDec__Group__1
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
    // InternalSql_dsl.g:1627:1: rule__WhereDec__Group__0__Impl : ( ( rule__WhereDec__ColumnAssignment_0 ) ) ;
    public final void rule__WhereDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1631:1: ( ( ( rule__WhereDec__ColumnAssignment_0 ) ) )
            // InternalSql_dsl.g:1632:1: ( ( rule__WhereDec__ColumnAssignment_0 ) )
            {
            // InternalSql_dsl.g:1632:1: ( ( rule__WhereDec__ColumnAssignment_0 ) )
            // InternalSql_dsl.g:1633:2: ( rule__WhereDec__ColumnAssignment_0 )
            {
             before(grammarAccess.getWhereDecAccess().getColumnAssignment_0()); 
            // InternalSql_dsl.g:1634:2: ( rule__WhereDec__ColumnAssignment_0 )
            // InternalSql_dsl.g:1634:3: rule__WhereDec__ColumnAssignment_0
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
    // InternalSql_dsl.g:1642:1: rule__WhereDec__Group__1 : rule__WhereDec__Group__1__Impl rule__WhereDec__Group__2 ;
    public final void rule__WhereDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1646:1: ( rule__WhereDec__Group__1__Impl rule__WhereDec__Group__2 )
            // InternalSql_dsl.g:1647:2: rule__WhereDec__Group__1__Impl rule__WhereDec__Group__2
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
    // InternalSql_dsl.g:1654:1: rule__WhereDec__Group__1__Impl : ( ( rule__WhereDec__Alternatives_1 ) ) ;
    public final void rule__WhereDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1658:1: ( ( ( rule__WhereDec__Alternatives_1 ) ) )
            // InternalSql_dsl.g:1659:1: ( ( rule__WhereDec__Alternatives_1 ) )
            {
            // InternalSql_dsl.g:1659:1: ( ( rule__WhereDec__Alternatives_1 ) )
            // InternalSql_dsl.g:1660:2: ( rule__WhereDec__Alternatives_1 )
            {
             before(grammarAccess.getWhereDecAccess().getAlternatives_1()); 
            // InternalSql_dsl.g:1661:2: ( rule__WhereDec__Alternatives_1 )
            // InternalSql_dsl.g:1661:3: rule__WhereDec__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereDecAccess().getAlternatives_1()); 

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
    // InternalSql_dsl.g:1669:1: rule__WhereDec__Group__2 : rule__WhereDec__Group__2__Impl ;
    public final void rule__WhereDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1673:1: ( rule__WhereDec__Group__2__Impl )
            // InternalSql_dsl.g:1674:2: rule__WhereDec__Group__2__Impl
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
    // InternalSql_dsl.g:1680:1: rule__WhereDec__Group__2__Impl : ( ( rule__WhereDec__Alternatives_2 ) ) ;
    public final void rule__WhereDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1684:1: ( ( ( rule__WhereDec__Alternatives_2 ) ) )
            // InternalSql_dsl.g:1685:1: ( ( rule__WhereDec__Alternatives_2 ) )
            {
            // InternalSql_dsl.g:1685:1: ( ( rule__WhereDec__Alternatives_2 ) )
            // InternalSql_dsl.g:1686:2: ( rule__WhereDec__Alternatives_2 )
            {
             before(grammarAccess.getWhereDecAccess().getAlternatives_2()); 
            // InternalSql_dsl.g:1687:2: ( rule__WhereDec__Alternatives_2 )
            // InternalSql_dsl.g:1687:3: rule__WhereDec__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereDecAccess().getAlternatives_2()); 

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


    // $ANTLR start "rule__WhereDec__Group_2_0__0"
    // InternalSql_dsl.g:1696:1: rule__WhereDec__Group_2_0__0 : rule__WhereDec__Group_2_0__0__Impl rule__WhereDec__Group_2_0__1 ;
    public final void rule__WhereDec__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1700:1: ( rule__WhereDec__Group_2_0__0__Impl rule__WhereDec__Group_2_0__1 )
            // InternalSql_dsl.g:1701:2: rule__WhereDec__Group_2_0__0__Impl rule__WhereDec__Group_2_0__1
            {
            pushFollow(FOLLOW_10);
            rule__WhereDec__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereDec__Group_2_0__1();

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
    // $ANTLR end "rule__WhereDec__Group_2_0__0"


    // $ANTLR start "rule__WhereDec__Group_2_0__0__Impl"
    // InternalSql_dsl.g:1708:1: rule__WhereDec__Group_2_0__0__Impl : ( '#' ) ;
    public final void rule__WhereDec__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1712:1: ( ( '#' ) )
            // InternalSql_dsl.g:1713:1: ( '#' )
            {
            // InternalSql_dsl.g:1713:1: ( '#' )
            // InternalSql_dsl.g:1714:2: '#'
            {
             before(grammarAccess.getWhereDecAccess().getNumberSignKeyword_2_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getWhereDecAccess().getNumberSignKeyword_2_0_0()); 

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
    // $ANTLR end "rule__WhereDec__Group_2_0__0__Impl"


    // $ANTLR start "rule__WhereDec__Group_2_0__1"
    // InternalSql_dsl.g:1723:1: rule__WhereDec__Group_2_0__1 : rule__WhereDec__Group_2_0__1__Impl rule__WhereDec__Group_2_0__2 ;
    public final void rule__WhereDec__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1727:1: ( rule__WhereDec__Group_2_0__1__Impl rule__WhereDec__Group_2_0__2 )
            // InternalSql_dsl.g:1728:2: rule__WhereDec__Group_2_0__1__Impl rule__WhereDec__Group_2_0__2
            {
            pushFollow(FOLLOW_16);
            rule__WhereDec__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereDec__Group_2_0__2();

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
    // $ANTLR end "rule__WhereDec__Group_2_0__1"


    // $ANTLR start "rule__WhereDec__Group_2_0__1__Impl"
    // InternalSql_dsl.g:1735:1: rule__WhereDec__Group_2_0__1__Impl : ( ( rule__WhereDec__NameAssignment_2_0_1 ) ) ;
    public final void rule__WhereDec__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1739:1: ( ( ( rule__WhereDec__NameAssignment_2_0_1 ) ) )
            // InternalSql_dsl.g:1740:1: ( ( rule__WhereDec__NameAssignment_2_0_1 ) )
            {
            // InternalSql_dsl.g:1740:1: ( ( rule__WhereDec__NameAssignment_2_0_1 ) )
            // InternalSql_dsl.g:1741:2: ( rule__WhereDec__NameAssignment_2_0_1 )
            {
             before(grammarAccess.getWhereDecAccess().getNameAssignment_2_0_1()); 
            // InternalSql_dsl.g:1742:2: ( rule__WhereDec__NameAssignment_2_0_1 )
            // InternalSql_dsl.g:1742:3: rule__WhereDec__NameAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__NameAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereDecAccess().getNameAssignment_2_0_1()); 

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
    // $ANTLR end "rule__WhereDec__Group_2_0__1__Impl"


    // $ANTLR start "rule__WhereDec__Group_2_0__2"
    // InternalSql_dsl.g:1750:1: rule__WhereDec__Group_2_0__2 : rule__WhereDec__Group_2_0__2__Impl ;
    public final void rule__WhereDec__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1754:1: ( rule__WhereDec__Group_2_0__2__Impl )
            // InternalSql_dsl.g:1755:2: rule__WhereDec__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereDec__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__WhereDec__Group_2_0__2"


    // $ANTLR start "rule__WhereDec__Group_2_0__2__Impl"
    // InternalSql_dsl.g:1761:1: rule__WhereDec__Group_2_0__2__Impl : ( '#' ) ;
    public final void rule__WhereDec__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1765:1: ( ( '#' ) )
            // InternalSql_dsl.g:1766:1: ( '#' )
            {
            // InternalSql_dsl.g:1766:1: ( '#' )
            // InternalSql_dsl.g:1767:2: '#'
            {
             before(grammarAccess.getWhereDecAccess().getNumberSignKeyword_2_0_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getWhereDecAccess().getNumberSignKeyword_2_0_2()); 

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
    // $ANTLR end "rule__WhereDec__Group_2_0__2__Impl"


    // $ANTLR start "rule__DatabaseDeclarationStatement__Group__0"
    // InternalSql_dsl.g:1777:1: rule__DatabaseDeclarationStatement__Group__0 : rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1 ;
    public final void rule__DatabaseDeclarationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1781:1: ( rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1 )
            // InternalSql_dsl.g:1782:2: rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1
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
    // InternalSql_dsl.g:1789:1: rule__DatabaseDeclarationStatement__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__DatabaseDeclarationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1793:1: ( ( 'CREATE' ) )
            // InternalSql_dsl.g:1794:1: ( 'CREATE' )
            {
            // InternalSql_dsl.g:1794:1: ( 'CREATE' )
            // InternalSql_dsl.g:1795:2: 'CREATE'
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
    // InternalSql_dsl.g:1804:1: rule__DatabaseDeclarationStatement__Group__1 : rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2 ;
    public final void rule__DatabaseDeclarationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1808:1: ( rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2 )
            // InternalSql_dsl.g:1809:2: rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2
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
    // InternalSql_dsl.g:1816:1: rule__DatabaseDeclarationStatement__Group__1__Impl : ( 'DATABASE' ) ;
    public final void rule__DatabaseDeclarationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1820:1: ( ( 'DATABASE' ) )
            // InternalSql_dsl.g:1821:1: ( 'DATABASE' )
            {
            // InternalSql_dsl.g:1821:1: ( 'DATABASE' )
            // InternalSql_dsl.g:1822:2: 'DATABASE'
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
    // InternalSql_dsl.g:1831:1: rule__DatabaseDeclarationStatement__Group__2 : rule__DatabaseDeclarationStatement__Group__2__Impl ;
    public final void rule__DatabaseDeclarationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1835:1: ( rule__DatabaseDeclarationStatement__Group__2__Impl )
            // InternalSql_dsl.g:1836:2: rule__DatabaseDeclarationStatement__Group__2__Impl
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
    // InternalSql_dsl.g:1842:1: rule__DatabaseDeclarationStatement__Group__2__Impl : ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) ) ;
    public final void rule__DatabaseDeclarationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1846:1: ( ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:1847:1: ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:1847:1: ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:1848:2: ( rule__DatabaseDeclarationStatement__NameAssignment_2 )
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:1849:2: ( rule__DatabaseDeclarationStatement__NameAssignment_2 )
            // InternalSql_dsl.g:1849:3: rule__DatabaseDeclarationStatement__NameAssignment_2
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
    // InternalSql_dsl.g:1858:1: rule__TableDeclaration__Group__0 : rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 ;
    public final void rule__TableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1862:1: ( rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 )
            // InternalSql_dsl.g:1863:2: rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1
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
    // InternalSql_dsl.g:1870:1: rule__TableDeclaration__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__TableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1874:1: ( ( 'CREATE' ) )
            // InternalSql_dsl.g:1875:1: ( 'CREATE' )
            {
            // InternalSql_dsl.g:1875:1: ( 'CREATE' )
            // InternalSql_dsl.g:1876:2: 'CREATE'
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
    // InternalSql_dsl.g:1885:1: rule__TableDeclaration__Group__1 : rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2 ;
    public final void rule__TableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1889:1: ( rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2 )
            // InternalSql_dsl.g:1890:2: rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2
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
    // InternalSql_dsl.g:1897:1: rule__TableDeclaration__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1901:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:1902:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:1902:1: ( 'TABLE' )
            // InternalSql_dsl.g:1903:2: 'TABLE'
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
    // InternalSql_dsl.g:1912:1: rule__TableDeclaration__Group__2 : rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3 ;
    public final void rule__TableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1916:1: ( rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3 )
            // InternalSql_dsl.g:1917:2: rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3
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
    // InternalSql_dsl.g:1924:1: rule__TableDeclaration__Group__2__Impl : ( ( rule__TableDeclaration__TableAssignment_2 ) ) ;
    public final void rule__TableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1928:1: ( ( ( rule__TableDeclaration__TableAssignment_2 ) ) )
            // InternalSql_dsl.g:1929:1: ( ( rule__TableDeclaration__TableAssignment_2 ) )
            {
            // InternalSql_dsl.g:1929:1: ( ( rule__TableDeclaration__TableAssignment_2 ) )
            // InternalSql_dsl.g:1930:2: ( rule__TableDeclaration__TableAssignment_2 )
            {
             before(grammarAccess.getTableDeclarationAccess().getTableAssignment_2()); 
            // InternalSql_dsl.g:1931:2: ( rule__TableDeclaration__TableAssignment_2 )
            // InternalSql_dsl.g:1931:3: rule__TableDeclaration__TableAssignment_2
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
    // InternalSql_dsl.g:1939:1: rule__TableDeclaration__Group__3 : rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4 ;
    public final void rule__TableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1943:1: ( rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4 )
            // InternalSql_dsl.g:1944:2: rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4
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
    // InternalSql_dsl.g:1951:1: rule__TableDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__TableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1955:1: ( ( '(' ) )
            // InternalSql_dsl.g:1956:1: ( '(' )
            {
            // InternalSql_dsl.g:1956:1: ( '(' )
            // InternalSql_dsl.g:1957:2: '('
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
    // InternalSql_dsl.g:1966:1: rule__TableDeclaration__Group__4 : rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5 ;
    public final void rule__TableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1970:1: ( rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5 )
            // InternalSql_dsl.g:1971:2: rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5
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
    // InternalSql_dsl.g:1978:1: rule__TableDeclaration__Group__4__Impl : ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) ) ;
    public final void rule__TableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1982:1: ( ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) ) )
            // InternalSql_dsl.g:1983:1: ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) )
            {
            // InternalSql_dsl.g:1983:1: ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) )
            // InternalSql_dsl.g:1984:2: ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* )
            {
            // InternalSql_dsl.g:1984:2: ( ( rule__TableDeclaration__AttributesAssignment_4 ) )
            // InternalSql_dsl.g:1985:3: ( rule__TableDeclaration__AttributesAssignment_4 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 
            // InternalSql_dsl.g:1986:3: ( rule__TableDeclaration__AttributesAssignment_4 )
            // InternalSql_dsl.g:1986:4: rule__TableDeclaration__AttributesAssignment_4
            {
            pushFollow(FOLLOW_22);
            rule__TableDeclaration__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 

            }

            // InternalSql_dsl.g:1989:2: ( ( rule__TableDeclaration__AttributesAssignment_4 )* )
            // InternalSql_dsl.g:1990:3: ( rule__TableDeclaration__AttributesAssignment_4 )*
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 
            // InternalSql_dsl.g:1991:3: ( rule__TableDeclaration__AttributesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==38||LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSql_dsl.g:1991:4: rule__TableDeclaration__AttributesAssignment_4
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
    // InternalSql_dsl.g:2000:1: rule__TableDeclaration__Group__5 : rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6 ;
    public final void rule__TableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2004:1: ( rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6 )
            // InternalSql_dsl.g:2005:2: rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6
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
    // InternalSql_dsl.g:2012:1: rule__TableDeclaration__Group__5__Impl : ( ( rule__TableDeclaration__Group_5__0 )* ) ;
    public final void rule__TableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2016:1: ( ( ( rule__TableDeclaration__Group_5__0 )* ) )
            // InternalSql_dsl.g:2017:1: ( ( rule__TableDeclaration__Group_5__0 )* )
            {
            // InternalSql_dsl.g:2017:1: ( ( rule__TableDeclaration__Group_5__0 )* )
            // InternalSql_dsl.g:2018:2: ( rule__TableDeclaration__Group_5__0 )*
            {
             before(grammarAccess.getTableDeclarationAccess().getGroup_5()); 
            // InternalSql_dsl.g:2019:2: ( rule__TableDeclaration__Group_5__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSql_dsl.g:2019:3: rule__TableDeclaration__Group_5__0
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
    // InternalSql_dsl.g:2027:1: rule__TableDeclaration__Group__6 : rule__TableDeclaration__Group__6__Impl ;
    public final void rule__TableDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2031:1: ( rule__TableDeclaration__Group__6__Impl )
            // InternalSql_dsl.g:2032:2: rule__TableDeclaration__Group__6__Impl
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
    // InternalSql_dsl.g:2038:1: rule__TableDeclaration__Group__6__Impl : ( ')' ) ;
    public final void rule__TableDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2042:1: ( ( ')' ) )
            // InternalSql_dsl.g:2043:1: ( ')' )
            {
            // InternalSql_dsl.g:2043:1: ( ')' )
            // InternalSql_dsl.g:2044:2: ')'
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
    // InternalSql_dsl.g:2054:1: rule__TableDeclaration__Group_5__0 : rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1 ;
    public final void rule__TableDeclaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2058:1: ( rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1 )
            // InternalSql_dsl.g:2059:2: rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1
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
    // InternalSql_dsl.g:2066:1: rule__TableDeclaration__Group_5__0__Impl : ( ',' ) ;
    public final void rule__TableDeclaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2070:1: ( ( ',' ) )
            // InternalSql_dsl.g:2071:1: ( ',' )
            {
            // InternalSql_dsl.g:2071:1: ( ',' )
            // InternalSql_dsl.g:2072:2: ','
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
    // InternalSql_dsl.g:2081:1: rule__TableDeclaration__Group_5__1 : rule__TableDeclaration__Group_5__1__Impl ;
    public final void rule__TableDeclaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2085:1: ( rule__TableDeclaration__Group_5__1__Impl )
            // InternalSql_dsl.g:2086:2: rule__TableDeclaration__Group_5__1__Impl
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
    // InternalSql_dsl.g:2092:1: rule__TableDeclaration__Group_5__1__Impl : ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) ) ;
    public final void rule__TableDeclaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2096:1: ( ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) ) )
            // InternalSql_dsl.g:2097:1: ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) )
            {
            // InternalSql_dsl.g:2097:1: ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) )
            // InternalSql_dsl.g:2098:2: ( rule__TableDeclaration__AttributesAssignment_5_1 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_5_1()); 
            // InternalSql_dsl.g:2099:2: ( rule__TableDeclaration__AttributesAssignment_5_1 )
            // InternalSql_dsl.g:2099:3: rule__TableDeclaration__AttributesAssignment_5_1
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
    // InternalSql_dsl.g:2108:1: rule__ColumnDeclaration__Group__0 : rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 ;
    public final void rule__ColumnDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2112:1: ( rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 )
            // InternalSql_dsl.g:2113:2: rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1
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
    // InternalSql_dsl.g:2120:1: rule__ColumnDeclaration__Group__0__Impl : ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ColumnDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2124:1: ( ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) )
            // InternalSql_dsl.g:2125:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            {
            // InternalSql_dsl.g:2125:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            // InternalSql_dsl.g:2126:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getNameAssignment_0()); 
            // InternalSql_dsl.g:2127:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            // InternalSql_dsl.g:2127:3: rule__ColumnDeclaration__NameAssignment_0
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
    // InternalSql_dsl.g:2135:1: rule__ColumnDeclaration__Group__1 : rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 ;
    public final void rule__ColumnDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2139:1: ( rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 )
            // InternalSql_dsl.g:2140:2: rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2
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
    // InternalSql_dsl.g:2147:1: rule__ColumnDeclaration__Group__1__Impl : ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__ColumnDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2151:1: ( ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) )
            // InternalSql_dsl.g:2152:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            {
            // InternalSql_dsl.g:2152:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            // InternalSql_dsl.g:2153:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getTypeAssignment_1()); 
            // InternalSql_dsl.g:2154:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            // InternalSql_dsl.g:2154:3: rule__ColumnDeclaration__TypeAssignment_1
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
    // InternalSql_dsl.g:2162:1: rule__ColumnDeclaration__Group__2 : rule__ColumnDeclaration__Group__2__Impl ;
    public final void rule__ColumnDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2166:1: ( rule__ColumnDeclaration__Group__2__Impl )
            // InternalSql_dsl.g:2167:2: rule__ColumnDeclaration__Group__2__Impl
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
    // InternalSql_dsl.g:2173:1: rule__ColumnDeclaration__Group__2__Impl : ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) ;
    public final void rule__ColumnDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2177:1: ( ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) )
            // InternalSql_dsl.g:2178:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            {
            // InternalSql_dsl.g:2178:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            // InternalSql_dsl.g:2179:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullAssignment_2()); 
            // InternalSql_dsl.g:2180:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSql_dsl.g:2180:3: rule__ColumnDeclaration__NotNullAssignment_2
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
    // InternalSql_dsl.g:2189:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2193:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalSql_dsl.g:2194:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
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
    // InternalSql_dsl.g:2201:1: rule__PrimaryKey__Group__0__Impl : ( 'PRIMARY' ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2205:1: ( ( 'PRIMARY' ) )
            // InternalSql_dsl.g:2206:1: ( 'PRIMARY' )
            {
            // InternalSql_dsl.g:2206:1: ( 'PRIMARY' )
            // InternalSql_dsl.g:2207:2: 'PRIMARY'
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
    // InternalSql_dsl.g:2216:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2220:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalSql_dsl.g:2221:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
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
    // InternalSql_dsl.g:2228:1: rule__PrimaryKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2232:1: ( ( 'KEY' ) )
            // InternalSql_dsl.g:2233:1: ( 'KEY' )
            {
            // InternalSql_dsl.g:2233:1: ( 'KEY' )
            // InternalSql_dsl.g:2234:2: 'KEY'
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
    // InternalSql_dsl.g:2243:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2247:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalSql_dsl.g:2248:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
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
    // InternalSql_dsl.g:2255:1: rule__PrimaryKey__Group__2__Impl : ( '(' ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2259:1: ( ( '(' ) )
            // InternalSql_dsl.g:2260:1: ( '(' )
            {
            // InternalSql_dsl.g:2260:1: ( '(' )
            // InternalSql_dsl.g:2261:2: '('
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
    // InternalSql_dsl.g:2270:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2274:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalSql_dsl.g:2275:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
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
    // InternalSql_dsl.g:2282:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2286:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) )
            // InternalSql_dsl.g:2287:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            {
            // InternalSql_dsl.g:2287:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            // InternalSql_dsl.g:2288:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_3()); 
            // InternalSql_dsl.g:2289:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            // InternalSql_dsl.g:2289:3: rule__PrimaryKey__ColumnAsPKAssignment_3
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
    // InternalSql_dsl.g:2297:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2301:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalSql_dsl.g:2302:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
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
    // InternalSql_dsl.g:2309:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2313:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalSql_dsl.g:2314:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalSql_dsl.g:2314:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalSql_dsl.g:2315:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalSql_dsl.g:2316:2: ( rule__PrimaryKey__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSql_dsl.g:2316:3: rule__PrimaryKey__Group_4__0
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
    // InternalSql_dsl.g:2324:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2328:1: ( rule__PrimaryKey__Group__5__Impl )
            // InternalSql_dsl.g:2329:2: rule__PrimaryKey__Group__5__Impl
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
    // InternalSql_dsl.g:2335:1: rule__PrimaryKey__Group__5__Impl : ( ')' ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2339:1: ( ( ')' ) )
            // InternalSql_dsl.g:2340:1: ( ')' )
            {
            // InternalSql_dsl.g:2340:1: ( ')' )
            // InternalSql_dsl.g:2341:2: ')'
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
    // InternalSql_dsl.g:2351:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2355:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalSql_dsl.g:2356:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
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
    // InternalSql_dsl.g:2363:1: rule__PrimaryKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2367:1: ( ( ',' ) )
            // InternalSql_dsl.g:2368:1: ( ',' )
            {
            // InternalSql_dsl.g:2368:1: ( ',' )
            // InternalSql_dsl.g:2369:2: ','
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
    // InternalSql_dsl.g:2378:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2382:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalSql_dsl.g:2383:2: rule__PrimaryKey__Group_4__1__Impl
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
    // InternalSql_dsl.g:2389:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2393:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) )
            // InternalSql_dsl.g:2394:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:2394:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            // InternalSql_dsl.g:2395:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_4_1()); 
            // InternalSql_dsl.g:2396:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            // InternalSql_dsl.g:2396:3: rule__PrimaryKey__ColumnAsPKAssignment_4_1
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
    // InternalSql_dsl.g:2405:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2409:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalSql_dsl.g:2410:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
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
    // InternalSql_dsl.g:2417:1: rule__ForeignKey__Group__0__Impl : ( 'FOREIGN' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2421:1: ( ( 'FOREIGN' ) )
            // InternalSql_dsl.g:2422:1: ( 'FOREIGN' )
            {
            // InternalSql_dsl.g:2422:1: ( 'FOREIGN' )
            // InternalSql_dsl.g:2423:2: 'FOREIGN'
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
    // InternalSql_dsl.g:2432:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2436:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalSql_dsl.g:2437:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
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
    // InternalSql_dsl.g:2444:1: rule__ForeignKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2448:1: ( ( 'KEY' ) )
            // InternalSql_dsl.g:2449:1: ( 'KEY' )
            {
            // InternalSql_dsl.g:2449:1: ( 'KEY' )
            // InternalSql_dsl.g:2450:2: 'KEY'
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
    // InternalSql_dsl.g:2459:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2463:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalSql_dsl.g:2464:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
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
    // InternalSql_dsl.g:2471:1: rule__ForeignKey__Group__2__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2475:1: ( ( '(' ) )
            // InternalSql_dsl.g:2476:1: ( '(' )
            {
            // InternalSql_dsl.g:2476:1: ( '(' )
            // InternalSql_dsl.g:2477:2: '('
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
    // InternalSql_dsl.g:2486:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2490:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalSql_dsl.g:2491:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
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
    // InternalSql_dsl.g:2498:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2502:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) )
            // InternalSql_dsl.g:2503:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            {
            // InternalSql_dsl.g:2503:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            // InternalSql_dsl.g:2504:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_3()); 
            // InternalSql_dsl.g:2505:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            // InternalSql_dsl.g:2505:3: rule__ForeignKey__ColumnAsFKAssignment_3
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
    // InternalSql_dsl.g:2513:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2517:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalSql_dsl.g:2518:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
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
    // InternalSql_dsl.g:2525:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2529:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalSql_dsl.g:2530:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalSql_dsl.g:2530:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalSql_dsl.g:2531:2: ( rule__ForeignKey__Group_4__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            // InternalSql_dsl.g:2532:2: ( rule__ForeignKey__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSql_dsl.g:2532:3: rule__ForeignKey__Group_4__0
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
    // InternalSql_dsl.g:2540:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2544:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalSql_dsl.g:2545:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
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
    // InternalSql_dsl.g:2552:1: rule__ForeignKey__Group__5__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2556:1: ( ( ')' ) )
            // InternalSql_dsl.g:2557:1: ( ')' )
            {
            // InternalSql_dsl.g:2557:1: ( ')' )
            // InternalSql_dsl.g:2558:2: ')'
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
    // InternalSql_dsl.g:2567:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2571:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalSql_dsl.g:2572:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
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
    // InternalSql_dsl.g:2579:1: rule__ForeignKey__Group__6__Impl : ( 'REFERENCES' ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2583:1: ( ( 'REFERENCES' ) )
            // InternalSql_dsl.g:2584:1: ( 'REFERENCES' )
            {
            // InternalSql_dsl.g:2584:1: ( 'REFERENCES' )
            // InternalSql_dsl.g:2585:2: 'REFERENCES'
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
    // InternalSql_dsl.g:2594:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2598:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalSql_dsl.g:2599:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
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
    // InternalSql_dsl.g:2606:1: rule__ForeignKey__Group__7__Impl : ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2610:1: ( ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) )
            // InternalSql_dsl.g:2611:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            {
            // InternalSql_dsl.g:2611:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            // InternalSql_dsl.g:2612:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); 
            // InternalSql_dsl.g:2613:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            // InternalSql_dsl.g:2613:3: rule__ForeignKey__ForeignTableAssignment_7
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
    // InternalSql_dsl.g:2621:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2625:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalSql_dsl.g:2626:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
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
    // InternalSql_dsl.g:2633:1: rule__ForeignKey__Group__8__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2637:1: ( ( '(' ) )
            // InternalSql_dsl.g:2638:1: ( '(' )
            {
            // InternalSql_dsl.g:2638:1: ( '(' )
            // InternalSql_dsl.g:2639:2: '('
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
    // InternalSql_dsl.g:2648:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2652:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalSql_dsl.g:2653:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
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
    // InternalSql_dsl.g:2660:1: rule__ForeignKey__Group__9__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2664:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) )
            // InternalSql_dsl.g:2665:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            {
            // InternalSql_dsl.g:2665:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            // InternalSql_dsl.g:2666:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); 
            // InternalSql_dsl.g:2667:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            // InternalSql_dsl.g:2667:3: rule__ForeignKey__ForeignColumnsAssignment_9
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
    // InternalSql_dsl.g:2675:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2679:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalSql_dsl.g:2680:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
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
    // InternalSql_dsl.g:2687:1: rule__ForeignKey__Group__10__Impl : ( ( rule__ForeignKey__Group_10__0 )* ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2691:1: ( ( ( rule__ForeignKey__Group_10__0 )* ) )
            // InternalSql_dsl.g:2692:1: ( ( rule__ForeignKey__Group_10__0 )* )
            {
            // InternalSql_dsl.g:2692:1: ( ( rule__ForeignKey__Group_10__0 )* )
            // InternalSql_dsl.g:2693:2: ( rule__ForeignKey__Group_10__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_10()); 
            // InternalSql_dsl.g:2694:2: ( rule__ForeignKey__Group_10__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSql_dsl.g:2694:3: rule__ForeignKey__Group_10__0
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
    // InternalSql_dsl.g:2702:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2706:1: ( rule__ForeignKey__Group__11__Impl )
            // InternalSql_dsl.g:2707:2: rule__ForeignKey__Group__11__Impl
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
    // InternalSql_dsl.g:2713:1: rule__ForeignKey__Group__11__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2717:1: ( ( ')' ) )
            // InternalSql_dsl.g:2718:1: ( ')' )
            {
            // InternalSql_dsl.g:2718:1: ( ')' )
            // InternalSql_dsl.g:2719:2: ')'
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
    // InternalSql_dsl.g:2729:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2733:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalSql_dsl.g:2734:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
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
    // InternalSql_dsl.g:2741:1: rule__ForeignKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2745:1: ( ( ',' ) )
            // InternalSql_dsl.g:2746:1: ( ',' )
            {
            // InternalSql_dsl.g:2746:1: ( ',' )
            // InternalSql_dsl.g:2747:2: ','
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
    // InternalSql_dsl.g:2756:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2760:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalSql_dsl.g:2761:2: rule__ForeignKey__Group_4__1__Impl
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
    // InternalSql_dsl.g:2767:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2771:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) )
            // InternalSql_dsl.g:2772:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:2772:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            // InternalSql_dsl.g:2773:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_4_1()); 
            // InternalSql_dsl.g:2774:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            // InternalSql_dsl.g:2774:3: rule__ForeignKey__ColumnAsFKAssignment_4_1
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
    // InternalSql_dsl.g:2783:1: rule__ForeignKey__Group_10__0 : rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 ;
    public final void rule__ForeignKey__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2787:1: ( rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 )
            // InternalSql_dsl.g:2788:2: rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1
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
    // InternalSql_dsl.g:2795:1: rule__ForeignKey__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2799:1: ( ( ',' ) )
            // InternalSql_dsl.g:2800:1: ( ',' )
            {
            // InternalSql_dsl.g:2800:1: ( ',' )
            // InternalSql_dsl.g:2801:2: ','
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
    // InternalSql_dsl.g:2810:1: rule__ForeignKey__Group_10__1 : rule__ForeignKey__Group_10__1__Impl ;
    public final void rule__ForeignKey__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2814:1: ( rule__ForeignKey__Group_10__1__Impl )
            // InternalSql_dsl.g:2815:2: rule__ForeignKey__Group_10__1__Impl
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
    // InternalSql_dsl.g:2821:1: rule__ForeignKey__Group_10__1__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) ;
    public final void rule__ForeignKey__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2825:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) )
            // InternalSql_dsl.g:2826:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            {
            // InternalSql_dsl.g:2826:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            // InternalSql_dsl.g:2827:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); 
            // InternalSql_dsl.g:2828:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            // InternalSql_dsl.g:2828:3: rule__ForeignKey__ForeignColumnsAssignment_10_1
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
    // InternalSql_dsl.g:2837:1: rule__DropTableStatement__Group__0 : rule__DropTableStatement__Group__0__Impl rule__DropTableStatement__Group__1 ;
    public final void rule__DropTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2841:1: ( rule__DropTableStatement__Group__0__Impl rule__DropTableStatement__Group__1 )
            // InternalSql_dsl.g:2842:2: rule__DropTableStatement__Group__0__Impl rule__DropTableStatement__Group__1
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
    // InternalSql_dsl.g:2849:1: rule__DropTableStatement__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DropTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2853:1: ( ( 'DROP' ) )
            // InternalSql_dsl.g:2854:1: ( 'DROP' )
            {
            // InternalSql_dsl.g:2854:1: ( 'DROP' )
            // InternalSql_dsl.g:2855:2: 'DROP'
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
    // InternalSql_dsl.g:2864:1: rule__DropTableStatement__Group__1 : rule__DropTableStatement__Group__1__Impl rule__DropTableStatement__Group__2 ;
    public final void rule__DropTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2868:1: ( rule__DropTableStatement__Group__1__Impl rule__DropTableStatement__Group__2 )
            // InternalSql_dsl.g:2869:2: rule__DropTableStatement__Group__1__Impl rule__DropTableStatement__Group__2
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
    // InternalSql_dsl.g:2876:1: rule__DropTableStatement__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__DropTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2880:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:2881:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:2881:1: ( 'TABLE' )
            // InternalSql_dsl.g:2882:2: 'TABLE'
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
    // InternalSql_dsl.g:2891:1: rule__DropTableStatement__Group__2 : rule__DropTableStatement__Group__2__Impl ;
    public final void rule__DropTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2895:1: ( rule__DropTableStatement__Group__2__Impl )
            // InternalSql_dsl.g:2896:2: rule__DropTableStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropTableStatement__Group__2__Impl();

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
    // InternalSql_dsl.g:2902:1: rule__DropTableStatement__Group__2__Impl : ( ( rule__DropTableStatement__TableAssignment_2 ) ) ;
    public final void rule__DropTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2906:1: ( ( ( rule__DropTableStatement__TableAssignment_2 ) ) )
            // InternalSql_dsl.g:2907:1: ( ( rule__DropTableStatement__TableAssignment_2 ) )
            {
            // InternalSql_dsl.g:2907:1: ( ( rule__DropTableStatement__TableAssignment_2 ) )
            // InternalSql_dsl.g:2908:2: ( rule__DropTableStatement__TableAssignment_2 )
            {
             before(grammarAccess.getDropTableStatementAccess().getTableAssignment_2()); 
            // InternalSql_dsl.g:2909:2: ( rule__DropTableStatement__TableAssignment_2 )
            // InternalSql_dsl.g:2909:3: rule__DropTableStatement__TableAssignment_2
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


    // $ANTLR start "rule__TruncateTableStatement__Group__0"
    // InternalSql_dsl.g:2918:1: rule__TruncateTableStatement__Group__0 : rule__TruncateTableStatement__Group__0__Impl rule__TruncateTableStatement__Group__1 ;
    public final void rule__TruncateTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2922:1: ( rule__TruncateTableStatement__Group__0__Impl rule__TruncateTableStatement__Group__1 )
            // InternalSql_dsl.g:2923:2: rule__TruncateTableStatement__Group__0__Impl rule__TruncateTableStatement__Group__1
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
    // InternalSql_dsl.g:2930:1: rule__TruncateTableStatement__Group__0__Impl : ( 'TRUNCATE' ) ;
    public final void rule__TruncateTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2934:1: ( ( 'TRUNCATE' ) )
            // InternalSql_dsl.g:2935:1: ( 'TRUNCATE' )
            {
            // InternalSql_dsl.g:2935:1: ( 'TRUNCATE' )
            // InternalSql_dsl.g:2936:2: 'TRUNCATE'
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
    // InternalSql_dsl.g:2945:1: rule__TruncateTableStatement__Group__1 : rule__TruncateTableStatement__Group__1__Impl rule__TruncateTableStatement__Group__2 ;
    public final void rule__TruncateTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2949:1: ( rule__TruncateTableStatement__Group__1__Impl rule__TruncateTableStatement__Group__2 )
            // InternalSql_dsl.g:2950:2: rule__TruncateTableStatement__Group__1__Impl rule__TruncateTableStatement__Group__2
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
    // InternalSql_dsl.g:2957:1: rule__TruncateTableStatement__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TruncateTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2961:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:2962:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:2962:1: ( 'TABLE' )
            // InternalSql_dsl.g:2963:2: 'TABLE'
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
    // InternalSql_dsl.g:2972:1: rule__TruncateTableStatement__Group__2 : rule__TruncateTableStatement__Group__2__Impl ;
    public final void rule__TruncateTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2976:1: ( rule__TruncateTableStatement__Group__2__Impl )
            // InternalSql_dsl.g:2977:2: rule__TruncateTableStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TruncateTableStatement__Group__2__Impl();

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
    // InternalSql_dsl.g:2983:1: rule__TruncateTableStatement__Group__2__Impl : ( ( rule__TruncateTableStatement__TableAssignment_2 ) ) ;
    public final void rule__TruncateTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2987:1: ( ( ( rule__TruncateTableStatement__TableAssignment_2 ) ) )
            // InternalSql_dsl.g:2988:1: ( ( rule__TruncateTableStatement__TableAssignment_2 ) )
            {
            // InternalSql_dsl.g:2988:1: ( ( rule__TruncateTableStatement__TableAssignment_2 ) )
            // InternalSql_dsl.g:2989:2: ( rule__TruncateTableStatement__TableAssignment_2 )
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTableAssignment_2()); 
            // InternalSql_dsl.g:2990:2: ( rule__TruncateTableStatement__TableAssignment_2 )
            // InternalSql_dsl.g:2990:3: rule__TruncateTableStatement__TableAssignment_2
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


    // $ANTLR start "rule__DeleteTableStatement__Group__0"
    // InternalSql_dsl.g:2999:1: rule__DeleteTableStatement__Group__0 : rule__DeleteTableStatement__Group__0__Impl rule__DeleteTableStatement__Group__1 ;
    public final void rule__DeleteTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3003:1: ( rule__DeleteTableStatement__Group__0__Impl rule__DeleteTableStatement__Group__1 )
            // InternalSql_dsl.g:3004:2: rule__DeleteTableStatement__Group__0__Impl rule__DeleteTableStatement__Group__1
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
    // InternalSql_dsl.g:3011:1: rule__DeleteTableStatement__Group__0__Impl : ( 'DELETE' ) ;
    public final void rule__DeleteTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3015:1: ( ( 'DELETE' ) )
            // InternalSql_dsl.g:3016:1: ( 'DELETE' )
            {
            // InternalSql_dsl.g:3016:1: ( 'DELETE' )
            // InternalSql_dsl.g:3017:2: 'DELETE'
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
    // InternalSql_dsl.g:3026:1: rule__DeleteTableStatement__Group__1 : rule__DeleteTableStatement__Group__1__Impl ;
    public final void rule__DeleteTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3030:1: ( rule__DeleteTableStatement__Group__1__Impl )
            // InternalSql_dsl.g:3031:2: rule__DeleteTableStatement__Group__1__Impl
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
    // InternalSql_dsl.g:3037:1: rule__DeleteTableStatement__Group__1__Impl : ( ( rule__DeleteTableStatement__XAssignment_1 ) ) ;
    public final void rule__DeleteTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3041:1: ( ( ( rule__DeleteTableStatement__XAssignment_1 ) ) )
            // InternalSql_dsl.g:3042:1: ( ( rule__DeleteTableStatement__XAssignment_1 ) )
            {
            // InternalSql_dsl.g:3042:1: ( ( rule__DeleteTableStatement__XAssignment_1 ) )
            // InternalSql_dsl.g:3043:2: ( rule__DeleteTableStatement__XAssignment_1 )
            {
             before(grammarAccess.getDeleteTableStatementAccess().getXAssignment_1()); 
            // InternalSql_dsl.g:3044:2: ( rule__DeleteTableStatement__XAssignment_1 )
            // InternalSql_dsl.g:3044:3: rule__DeleteTableStatement__XAssignment_1
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
    // InternalSql_dsl.g:3053:1: rule__UpdateTableStatement__Group__0 : rule__UpdateTableStatement__Group__0__Impl rule__UpdateTableStatement__Group__1 ;
    public final void rule__UpdateTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3057:1: ( rule__UpdateTableStatement__Group__0__Impl rule__UpdateTableStatement__Group__1 )
            // InternalSql_dsl.g:3058:2: rule__UpdateTableStatement__Group__0__Impl rule__UpdateTableStatement__Group__1
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
    // InternalSql_dsl.g:3065:1: rule__UpdateTableStatement__Group__0__Impl : ( 'UPDATE' ) ;
    public final void rule__UpdateTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3069:1: ( ( 'UPDATE' ) )
            // InternalSql_dsl.g:3070:1: ( 'UPDATE' )
            {
            // InternalSql_dsl.g:3070:1: ( 'UPDATE' )
            // InternalSql_dsl.g:3071:2: 'UPDATE'
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
    // InternalSql_dsl.g:3080:1: rule__UpdateTableStatement__Group__1 : rule__UpdateTableStatement__Group__1__Impl rule__UpdateTableStatement__Group__2 ;
    public final void rule__UpdateTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3084:1: ( rule__UpdateTableStatement__Group__1__Impl rule__UpdateTableStatement__Group__2 )
            // InternalSql_dsl.g:3085:2: rule__UpdateTableStatement__Group__1__Impl rule__UpdateTableStatement__Group__2
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
    // InternalSql_dsl.g:3092:1: rule__UpdateTableStatement__Group__1__Impl : ( ( rule__UpdateTableStatement__TableAssignment_1 ) ) ;
    public final void rule__UpdateTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3096:1: ( ( ( rule__UpdateTableStatement__TableAssignment_1 ) ) )
            // InternalSql_dsl.g:3097:1: ( ( rule__UpdateTableStatement__TableAssignment_1 ) )
            {
            // InternalSql_dsl.g:3097:1: ( ( rule__UpdateTableStatement__TableAssignment_1 ) )
            // InternalSql_dsl.g:3098:2: ( rule__UpdateTableStatement__TableAssignment_1 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getTableAssignment_1()); 
            // InternalSql_dsl.g:3099:2: ( rule__UpdateTableStatement__TableAssignment_1 )
            // InternalSql_dsl.g:3099:3: rule__UpdateTableStatement__TableAssignment_1
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
    // InternalSql_dsl.g:3107:1: rule__UpdateTableStatement__Group__2 : rule__UpdateTableStatement__Group__2__Impl rule__UpdateTableStatement__Group__3 ;
    public final void rule__UpdateTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3111:1: ( rule__UpdateTableStatement__Group__2__Impl rule__UpdateTableStatement__Group__3 )
            // InternalSql_dsl.g:3112:2: rule__UpdateTableStatement__Group__2__Impl rule__UpdateTableStatement__Group__3
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
    // InternalSql_dsl.g:3119:1: rule__UpdateTableStatement__Group__2__Impl : ( 'SET' ) ;
    public final void rule__UpdateTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3123:1: ( ( 'SET' ) )
            // InternalSql_dsl.g:3124:1: ( 'SET' )
            {
            // InternalSql_dsl.g:3124:1: ( 'SET' )
            // InternalSql_dsl.g:3125:2: 'SET'
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
    // InternalSql_dsl.g:3134:1: rule__UpdateTableStatement__Group__3 : rule__UpdateTableStatement__Group__3__Impl rule__UpdateTableStatement__Group__4 ;
    public final void rule__UpdateTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3138:1: ( rule__UpdateTableStatement__Group__3__Impl rule__UpdateTableStatement__Group__4 )
            // InternalSql_dsl.g:3139:2: rule__UpdateTableStatement__Group__3__Impl rule__UpdateTableStatement__Group__4
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
    // InternalSql_dsl.g:3146:1: rule__UpdateTableStatement__Group__3__Impl : ( ( rule__UpdateTableStatement__ScAssignment_3 ) ) ;
    public final void rule__UpdateTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3150:1: ( ( ( rule__UpdateTableStatement__ScAssignment_3 ) ) )
            // InternalSql_dsl.g:3151:1: ( ( rule__UpdateTableStatement__ScAssignment_3 ) )
            {
            // InternalSql_dsl.g:3151:1: ( ( rule__UpdateTableStatement__ScAssignment_3 ) )
            // InternalSql_dsl.g:3152:2: ( rule__UpdateTableStatement__ScAssignment_3 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getScAssignment_3()); 
            // InternalSql_dsl.g:3153:2: ( rule__UpdateTableStatement__ScAssignment_3 )
            // InternalSql_dsl.g:3153:3: rule__UpdateTableStatement__ScAssignment_3
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
    // InternalSql_dsl.g:3161:1: rule__UpdateTableStatement__Group__4 : rule__UpdateTableStatement__Group__4__Impl rule__UpdateTableStatement__Group__5 ;
    public final void rule__UpdateTableStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3165:1: ( rule__UpdateTableStatement__Group__4__Impl rule__UpdateTableStatement__Group__5 )
            // InternalSql_dsl.g:3166:2: rule__UpdateTableStatement__Group__4__Impl rule__UpdateTableStatement__Group__5
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
    // InternalSql_dsl.g:3173:1: rule__UpdateTableStatement__Group__4__Impl : ( ( rule__UpdateTableStatement__Group_4__0 )* ) ;
    public final void rule__UpdateTableStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3177:1: ( ( ( rule__UpdateTableStatement__Group_4__0 )* ) )
            // InternalSql_dsl.g:3178:1: ( ( rule__UpdateTableStatement__Group_4__0 )* )
            {
            // InternalSql_dsl.g:3178:1: ( ( rule__UpdateTableStatement__Group_4__0 )* )
            // InternalSql_dsl.g:3179:2: ( rule__UpdateTableStatement__Group_4__0 )*
            {
             before(grammarAccess.getUpdateTableStatementAccess().getGroup_4()); 
            // InternalSql_dsl.g:3180:2: ( rule__UpdateTableStatement__Group_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSql_dsl.g:3180:3: rule__UpdateTableStatement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__UpdateTableStatement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalSql_dsl.g:3188:1: rule__UpdateTableStatement__Group__5 : rule__UpdateTableStatement__Group__5__Impl ;
    public final void rule__UpdateTableStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3192:1: ( rule__UpdateTableStatement__Group__5__Impl )
            // InternalSql_dsl.g:3193:2: rule__UpdateTableStatement__Group__5__Impl
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
    // InternalSql_dsl.g:3199:1: rule__UpdateTableStatement__Group__5__Impl : ( ( rule__UpdateTableStatement__Group_5__0 )? ) ;
    public final void rule__UpdateTableStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3203:1: ( ( ( rule__UpdateTableStatement__Group_5__0 )? ) )
            // InternalSql_dsl.g:3204:1: ( ( rule__UpdateTableStatement__Group_5__0 )? )
            {
            // InternalSql_dsl.g:3204:1: ( ( rule__UpdateTableStatement__Group_5__0 )? )
            // InternalSql_dsl.g:3205:2: ( rule__UpdateTableStatement__Group_5__0 )?
            {
             before(grammarAccess.getUpdateTableStatementAccess().getGroup_5()); 
            // InternalSql_dsl.g:3206:2: ( rule__UpdateTableStatement__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSql_dsl.g:3206:3: rule__UpdateTableStatement__Group_5__0
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
    // InternalSql_dsl.g:3215:1: rule__UpdateTableStatement__Group_4__0 : rule__UpdateTableStatement__Group_4__0__Impl rule__UpdateTableStatement__Group_4__1 ;
    public final void rule__UpdateTableStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3219:1: ( rule__UpdateTableStatement__Group_4__0__Impl rule__UpdateTableStatement__Group_4__1 )
            // InternalSql_dsl.g:3220:2: rule__UpdateTableStatement__Group_4__0__Impl rule__UpdateTableStatement__Group_4__1
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
    // InternalSql_dsl.g:3227:1: rule__UpdateTableStatement__Group_4__0__Impl : ( ',' ) ;
    public final void rule__UpdateTableStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3231:1: ( ( ',' ) )
            // InternalSql_dsl.g:3232:1: ( ',' )
            {
            // InternalSql_dsl.g:3232:1: ( ',' )
            // InternalSql_dsl.g:3233:2: ','
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
    // InternalSql_dsl.g:3242:1: rule__UpdateTableStatement__Group_4__1 : rule__UpdateTableStatement__Group_4__1__Impl ;
    public final void rule__UpdateTableStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3246:1: ( rule__UpdateTableStatement__Group_4__1__Impl )
            // InternalSql_dsl.g:3247:2: rule__UpdateTableStatement__Group_4__1__Impl
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
    // InternalSql_dsl.g:3253:1: rule__UpdateTableStatement__Group_4__1__Impl : ( ( rule__UpdateTableStatement__ScAssignment_4_1 ) ) ;
    public final void rule__UpdateTableStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3257:1: ( ( ( rule__UpdateTableStatement__ScAssignment_4_1 ) ) )
            // InternalSql_dsl.g:3258:1: ( ( rule__UpdateTableStatement__ScAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:3258:1: ( ( rule__UpdateTableStatement__ScAssignment_4_1 ) )
            // InternalSql_dsl.g:3259:2: ( rule__UpdateTableStatement__ScAssignment_4_1 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getScAssignment_4_1()); 
            // InternalSql_dsl.g:3260:2: ( rule__UpdateTableStatement__ScAssignment_4_1 )
            // InternalSql_dsl.g:3260:3: rule__UpdateTableStatement__ScAssignment_4_1
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
    // InternalSql_dsl.g:3269:1: rule__UpdateTableStatement__Group_5__0 : rule__UpdateTableStatement__Group_5__0__Impl rule__UpdateTableStatement__Group_5__1 ;
    public final void rule__UpdateTableStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3273:1: ( rule__UpdateTableStatement__Group_5__0__Impl rule__UpdateTableStatement__Group_5__1 )
            // InternalSql_dsl.g:3274:2: rule__UpdateTableStatement__Group_5__0__Impl rule__UpdateTableStatement__Group_5__1
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
    // InternalSql_dsl.g:3281:1: rule__UpdateTableStatement__Group_5__0__Impl : ( 'WHERE' ) ;
    public final void rule__UpdateTableStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3285:1: ( ( 'WHERE' ) )
            // InternalSql_dsl.g:3286:1: ( 'WHERE' )
            {
            // InternalSql_dsl.g:3286:1: ( 'WHERE' )
            // InternalSql_dsl.g:3287:2: 'WHERE'
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
    // InternalSql_dsl.g:3296:1: rule__UpdateTableStatement__Group_5__1 : rule__UpdateTableStatement__Group_5__1__Impl rule__UpdateTableStatement__Group_5__2 ;
    public final void rule__UpdateTableStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3300:1: ( rule__UpdateTableStatement__Group_5__1__Impl rule__UpdateTableStatement__Group_5__2 )
            // InternalSql_dsl.g:3301:2: rule__UpdateTableStatement__Group_5__1__Impl rule__UpdateTableStatement__Group_5__2
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
    // InternalSql_dsl.g:3308:1: rule__UpdateTableStatement__Group_5__1__Impl : ( ( rule__UpdateTableStatement__ZAssignment_5_1 ) ) ;
    public final void rule__UpdateTableStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3312:1: ( ( ( rule__UpdateTableStatement__ZAssignment_5_1 ) ) )
            // InternalSql_dsl.g:3313:1: ( ( rule__UpdateTableStatement__ZAssignment_5_1 ) )
            {
            // InternalSql_dsl.g:3313:1: ( ( rule__UpdateTableStatement__ZAssignment_5_1 ) )
            // InternalSql_dsl.g:3314:2: ( rule__UpdateTableStatement__ZAssignment_5_1 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getZAssignment_5_1()); 
            // InternalSql_dsl.g:3315:2: ( rule__UpdateTableStatement__ZAssignment_5_1 )
            // InternalSql_dsl.g:3315:3: rule__UpdateTableStatement__ZAssignment_5_1
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
    // InternalSql_dsl.g:3323:1: rule__UpdateTableStatement__Group_5__2 : rule__UpdateTableStatement__Group_5__2__Impl ;
    public final void rule__UpdateTableStatement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3327:1: ( rule__UpdateTableStatement__Group_5__2__Impl )
            // InternalSql_dsl.g:3328:2: rule__UpdateTableStatement__Group_5__2__Impl
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
    // InternalSql_dsl.g:3334:1: rule__UpdateTableStatement__Group_5__2__Impl : ( ( rule__UpdateTableStatement__Group_5_2__0 )* ) ;
    public final void rule__UpdateTableStatement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3338:1: ( ( ( rule__UpdateTableStatement__Group_5_2__0 )* ) )
            // InternalSql_dsl.g:3339:1: ( ( rule__UpdateTableStatement__Group_5_2__0 )* )
            {
            // InternalSql_dsl.g:3339:1: ( ( rule__UpdateTableStatement__Group_5_2__0 )* )
            // InternalSql_dsl.g:3340:2: ( rule__UpdateTableStatement__Group_5_2__0 )*
            {
             before(grammarAccess.getUpdateTableStatementAccess().getGroup_5_2()); 
            // InternalSql_dsl.g:3341:2: ( rule__UpdateTableStatement__Group_5_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=12 && LA27_0<=13)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSql_dsl.g:3341:3: rule__UpdateTableStatement__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UpdateTableStatement__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalSql_dsl.g:3350:1: rule__UpdateTableStatement__Group_5_2__0 : rule__UpdateTableStatement__Group_5_2__0__Impl rule__UpdateTableStatement__Group_5_2__1 ;
    public final void rule__UpdateTableStatement__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3354:1: ( rule__UpdateTableStatement__Group_5_2__0__Impl rule__UpdateTableStatement__Group_5_2__1 )
            // InternalSql_dsl.g:3355:2: rule__UpdateTableStatement__Group_5_2__0__Impl rule__UpdateTableStatement__Group_5_2__1
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
    // InternalSql_dsl.g:3362:1: rule__UpdateTableStatement__Group_5_2__0__Impl : ( ( rule__UpdateTableStatement__Alternatives_5_2_0 ) ) ;
    public final void rule__UpdateTableStatement__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3366:1: ( ( ( rule__UpdateTableStatement__Alternatives_5_2_0 ) ) )
            // InternalSql_dsl.g:3367:1: ( ( rule__UpdateTableStatement__Alternatives_5_2_0 ) )
            {
            // InternalSql_dsl.g:3367:1: ( ( rule__UpdateTableStatement__Alternatives_5_2_0 ) )
            // InternalSql_dsl.g:3368:2: ( rule__UpdateTableStatement__Alternatives_5_2_0 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getAlternatives_5_2_0()); 
            // InternalSql_dsl.g:3369:2: ( rule__UpdateTableStatement__Alternatives_5_2_0 )
            // InternalSql_dsl.g:3369:3: rule__UpdateTableStatement__Alternatives_5_2_0
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
    // InternalSql_dsl.g:3377:1: rule__UpdateTableStatement__Group_5_2__1 : rule__UpdateTableStatement__Group_5_2__1__Impl ;
    public final void rule__UpdateTableStatement__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3381:1: ( rule__UpdateTableStatement__Group_5_2__1__Impl )
            // InternalSql_dsl.g:3382:2: rule__UpdateTableStatement__Group_5_2__1__Impl
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
    // InternalSql_dsl.g:3388:1: rule__UpdateTableStatement__Group_5_2__1__Impl : ( ( rule__UpdateTableStatement__ZAssignment_5_2_1 ) ) ;
    public final void rule__UpdateTableStatement__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3392:1: ( ( ( rule__UpdateTableStatement__ZAssignment_5_2_1 ) ) )
            // InternalSql_dsl.g:3393:1: ( ( rule__UpdateTableStatement__ZAssignment_5_2_1 ) )
            {
            // InternalSql_dsl.g:3393:1: ( ( rule__UpdateTableStatement__ZAssignment_5_2_1 ) )
            // InternalSql_dsl.g:3394:2: ( rule__UpdateTableStatement__ZAssignment_5_2_1 )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getZAssignment_5_2_1()); 
            // InternalSql_dsl.g:3395:2: ( rule__UpdateTableStatement__ZAssignment_5_2_1 )
            // InternalSql_dsl.g:3395:3: rule__UpdateTableStatement__ZAssignment_5_2_1
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
    // InternalSql_dsl.g:3404:1: rule__SetClause__Group__0 : rule__SetClause__Group__0__Impl rule__SetClause__Group__1 ;
    public final void rule__SetClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3408:1: ( rule__SetClause__Group__0__Impl rule__SetClause__Group__1 )
            // InternalSql_dsl.g:3409:2: rule__SetClause__Group__0__Impl rule__SetClause__Group__1
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
    // InternalSql_dsl.g:3416:1: rule__SetClause__Group__0__Impl : ( ( rule__SetClause__ColumnAssignment_0 ) ) ;
    public final void rule__SetClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3420:1: ( ( ( rule__SetClause__ColumnAssignment_0 ) ) )
            // InternalSql_dsl.g:3421:1: ( ( rule__SetClause__ColumnAssignment_0 ) )
            {
            // InternalSql_dsl.g:3421:1: ( ( rule__SetClause__ColumnAssignment_0 ) )
            // InternalSql_dsl.g:3422:2: ( rule__SetClause__ColumnAssignment_0 )
            {
             before(grammarAccess.getSetClauseAccess().getColumnAssignment_0()); 
            // InternalSql_dsl.g:3423:2: ( rule__SetClause__ColumnAssignment_0 )
            // InternalSql_dsl.g:3423:3: rule__SetClause__ColumnAssignment_0
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
    // InternalSql_dsl.g:3431:1: rule__SetClause__Group__1 : rule__SetClause__Group__1__Impl rule__SetClause__Group__2 ;
    public final void rule__SetClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3435:1: ( rule__SetClause__Group__1__Impl rule__SetClause__Group__2 )
            // InternalSql_dsl.g:3436:2: rule__SetClause__Group__1__Impl rule__SetClause__Group__2
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
    // InternalSql_dsl.g:3443:1: rule__SetClause__Group__1__Impl : ( '=' ) ;
    public final void rule__SetClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3447:1: ( ( '=' ) )
            // InternalSql_dsl.g:3448:1: ( '=' )
            {
            // InternalSql_dsl.g:3448:1: ( '=' )
            // InternalSql_dsl.g:3449:2: '='
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
    // InternalSql_dsl.g:3458:1: rule__SetClause__Group__2 : rule__SetClause__Group__2__Impl ;
    public final void rule__SetClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3462:1: ( rule__SetClause__Group__2__Impl )
            // InternalSql_dsl.g:3463:2: rule__SetClause__Group__2__Impl
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
    // InternalSql_dsl.g:3469:1: rule__SetClause__Group__2__Impl : ( ( rule__SetClause__Alternatives_2 ) ) ;
    public final void rule__SetClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3473:1: ( ( ( rule__SetClause__Alternatives_2 ) ) )
            // InternalSql_dsl.g:3474:1: ( ( rule__SetClause__Alternatives_2 ) )
            {
            // InternalSql_dsl.g:3474:1: ( ( rule__SetClause__Alternatives_2 ) )
            // InternalSql_dsl.g:3475:2: ( rule__SetClause__Alternatives_2 )
            {
             before(grammarAccess.getSetClauseAccess().getAlternatives_2()); 
            // InternalSql_dsl.g:3476:2: ( rule__SetClause__Alternatives_2 )
            // InternalSql_dsl.g:3476:3: rule__SetClause__Alternatives_2
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
    // InternalSql_dsl.g:3485:1: rule__SetClause__Group_2_0__0 : rule__SetClause__Group_2_0__0__Impl rule__SetClause__Group_2_0__1 ;
    public final void rule__SetClause__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3489:1: ( rule__SetClause__Group_2_0__0__Impl rule__SetClause__Group_2_0__1 )
            // InternalSql_dsl.g:3490:2: rule__SetClause__Group_2_0__0__Impl rule__SetClause__Group_2_0__1
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
    // InternalSql_dsl.g:3497:1: rule__SetClause__Group_2_0__0__Impl : ( '#' ) ;
    public final void rule__SetClause__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3501:1: ( ( '#' ) )
            // InternalSql_dsl.g:3502:1: ( '#' )
            {
            // InternalSql_dsl.g:3502:1: ( '#' )
            // InternalSql_dsl.g:3503:2: '#'
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
    // InternalSql_dsl.g:3512:1: rule__SetClause__Group_2_0__1 : rule__SetClause__Group_2_0__1__Impl rule__SetClause__Group_2_0__2 ;
    public final void rule__SetClause__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3516:1: ( rule__SetClause__Group_2_0__1__Impl rule__SetClause__Group_2_0__2 )
            // InternalSql_dsl.g:3517:2: rule__SetClause__Group_2_0__1__Impl rule__SetClause__Group_2_0__2
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
    // InternalSql_dsl.g:3524:1: rule__SetClause__Group_2_0__1__Impl : ( ( rule__SetClause__NameAssignment_2_0_1 ) ) ;
    public final void rule__SetClause__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3528:1: ( ( ( rule__SetClause__NameAssignment_2_0_1 ) ) )
            // InternalSql_dsl.g:3529:1: ( ( rule__SetClause__NameAssignment_2_0_1 ) )
            {
            // InternalSql_dsl.g:3529:1: ( ( rule__SetClause__NameAssignment_2_0_1 ) )
            // InternalSql_dsl.g:3530:2: ( rule__SetClause__NameAssignment_2_0_1 )
            {
             before(grammarAccess.getSetClauseAccess().getNameAssignment_2_0_1()); 
            // InternalSql_dsl.g:3531:2: ( rule__SetClause__NameAssignment_2_0_1 )
            // InternalSql_dsl.g:3531:3: rule__SetClause__NameAssignment_2_0_1
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
    // InternalSql_dsl.g:3539:1: rule__SetClause__Group_2_0__2 : rule__SetClause__Group_2_0__2__Impl ;
    public final void rule__SetClause__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3543:1: ( rule__SetClause__Group_2_0__2__Impl )
            // InternalSql_dsl.g:3544:2: rule__SetClause__Group_2_0__2__Impl
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
    // InternalSql_dsl.g:3550:1: rule__SetClause__Group_2_0__2__Impl : ( '#' ) ;
    public final void rule__SetClause__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3554:1: ( ( '#' ) )
            // InternalSql_dsl.g:3555:1: ( '#' )
            {
            // InternalSql_dsl.g:3555:1: ( '#' )
            // InternalSql_dsl.g:3556:2: '#'
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
    // InternalSql_dsl.g:3566:1: rule__AlterTableStatement__Group__0 : rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1 ;
    public final void rule__AlterTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3570:1: ( rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1 )
            // InternalSql_dsl.g:3571:2: rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1
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
    // InternalSql_dsl.g:3578:1: rule__AlterTableStatement__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__AlterTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3582:1: ( ( 'ALTER' ) )
            // InternalSql_dsl.g:3583:1: ( 'ALTER' )
            {
            // InternalSql_dsl.g:3583:1: ( 'ALTER' )
            // InternalSql_dsl.g:3584:2: 'ALTER'
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
    // InternalSql_dsl.g:3593:1: rule__AlterTableStatement__Group__1 : rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2 ;
    public final void rule__AlterTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3597:1: ( rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2 )
            // InternalSql_dsl.g:3598:2: rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2
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
    // InternalSql_dsl.g:3605:1: rule__AlterTableStatement__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__AlterTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3609:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:3610:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:3610:1: ( 'TABLE' )
            // InternalSql_dsl.g:3611:2: 'TABLE'
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
    // InternalSql_dsl.g:3620:1: rule__AlterTableStatement__Group__2 : rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3 ;
    public final void rule__AlterTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3624:1: ( rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3 )
            // InternalSql_dsl.g:3625:2: rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3
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
    // InternalSql_dsl.g:3632:1: rule__AlterTableStatement__Group__2__Impl : ( ( rule__AlterTableStatement__TableAssignment_2 ) ) ;
    public final void rule__AlterTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3636:1: ( ( ( rule__AlterTableStatement__TableAssignment_2 ) ) )
            // InternalSql_dsl.g:3637:1: ( ( rule__AlterTableStatement__TableAssignment_2 ) )
            {
            // InternalSql_dsl.g:3637:1: ( ( rule__AlterTableStatement__TableAssignment_2 ) )
            // InternalSql_dsl.g:3638:2: ( rule__AlterTableStatement__TableAssignment_2 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getTableAssignment_2()); 
            // InternalSql_dsl.g:3639:2: ( rule__AlterTableStatement__TableAssignment_2 )
            // InternalSql_dsl.g:3639:3: rule__AlterTableStatement__TableAssignment_2
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
    // InternalSql_dsl.g:3647:1: rule__AlterTableStatement__Group__3 : rule__AlterTableStatement__Group__3__Impl ;
    public final void rule__AlterTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3651:1: ( rule__AlterTableStatement__Group__3__Impl )
            // InternalSql_dsl.g:3652:2: rule__AlterTableStatement__Group__3__Impl
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
    // InternalSql_dsl.g:3658:1: rule__AlterTableStatement__Group__3__Impl : ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) ) ;
    public final void rule__AlterTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3662:1: ( ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) ) )
            // InternalSql_dsl.g:3663:1: ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) )
            {
            // InternalSql_dsl.g:3663:1: ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) )
            // InternalSql_dsl.g:3664:2: ( rule__AlterTableStatement__AddDropUpdateAssignment_3 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAssignment_3()); 
            // InternalSql_dsl.g:3665:2: ( rule__AlterTableStatement__AddDropUpdateAssignment_3 )
            // InternalSql_dsl.g:3665:3: rule__AlterTableStatement__AddDropUpdateAssignment_3
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
    // InternalSql_dsl.g:3674:1: rule__AlterDropStatement__Group__0 : rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1 ;
    public final void rule__AlterDropStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3678:1: ( rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1 )
            // InternalSql_dsl.g:3679:2: rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1
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
    // InternalSql_dsl.g:3686:1: rule__AlterDropStatement__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__AlterDropStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3690:1: ( ( 'DROP' ) )
            // InternalSql_dsl.g:3691:1: ( 'DROP' )
            {
            // InternalSql_dsl.g:3691:1: ( 'DROP' )
            // InternalSql_dsl.g:3692:2: 'DROP'
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
    // InternalSql_dsl.g:3701:1: rule__AlterDropStatement__Group__1 : rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2 ;
    public final void rule__AlterDropStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3705:1: ( rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2 )
            // InternalSql_dsl.g:3706:2: rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2
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
    // InternalSql_dsl.g:3713:1: rule__AlterDropStatement__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__AlterDropStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3717:1: ( ( 'COLUMN' ) )
            // InternalSql_dsl.g:3718:1: ( 'COLUMN' )
            {
            // InternalSql_dsl.g:3718:1: ( 'COLUMN' )
            // InternalSql_dsl.g:3719:2: 'COLUMN'
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
    // InternalSql_dsl.g:3728:1: rule__AlterDropStatement__Group__2 : rule__AlterDropStatement__Group__2__Impl ;
    public final void rule__AlterDropStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3732:1: ( rule__AlterDropStatement__Group__2__Impl )
            // InternalSql_dsl.g:3733:2: rule__AlterDropStatement__Group__2__Impl
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
    // InternalSql_dsl.g:3739:1: rule__AlterDropStatement__Group__2__Impl : ( ( rule__AlterDropStatement__ColumnAssignment_2 ) ) ;
    public final void rule__AlterDropStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3743:1: ( ( ( rule__AlterDropStatement__ColumnAssignment_2 ) ) )
            // InternalSql_dsl.g:3744:1: ( ( rule__AlterDropStatement__ColumnAssignment_2 ) )
            {
            // InternalSql_dsl.g:3744:1: ( ( rule__AlterDropStatement__ColumnAssignment_2 ) )
            // InternalSql_dsl.g:3745:2: ( rule__AlterDropStatement__ColumnAssignment_2 )
            {
             before(grammarAccess.getAlterDropStatementAccess().getColumnAssignment_2()); 
            // InternalSql_dsl.g:3746:2: ( rule__AlterDropStatement__ColumnAssignment_2 )
            // InternalSql_dsl.g:3746:3: rule__AlterDropStatement__ColumnAssignment_2
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
    // InternalSql_dsl.g:3755:1: rule__AlterAddStatement__Group__0 : rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1 ;
    public final void rule__AlterAddStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3759:1: ( rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1 )
            // InternalSql_dsl.g:3760:2: rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1
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
    // InternalSql_dsl.g:3767:1: rule__AlterAddStatement__Group__0__Impl : ( 'ADD' ) ;
    public final void rule__AlterAddStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3771:1: ( ( 'ADD' ) )
            // InternalSql_dsl.g:3772:1: ( 'ADD' )
            {
            // InternalSql_dsl.g:3772:1: ( 'ADD' )
            // InternalSql_dsl.g:3773:2: 'ADD'
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
    // InternalSql_dsl.g:3782:1: rule__AlterAddStatement__Group__1 : rule__AlterAddStatement__Group__1__Impl ;
    public final void rule__AlterAddStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3786:1: ( rule__AlterAddStatement__Group__1__Impl )
            // InternalSql_dsl.g:3787:2: rule__AlterAddStatement__Group__1__Impl
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
    // InternalSql_dsl.g:3793:1: rule__AlterAddStatement__Group__1__Impl : ( ( rule__AlterAddStatement__ColumnAssignment_1 ) ) ;
    public final void rule__AlterAddStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3797:1: ( ( ( rule__AlterAddStatement__ColumnAssignment_1 ) ) )
            // InternalSql_dsl.g:3798:1: ( ( rule__AlterAddStatement__ColumnAssignment_1 ) )
            {
            // InternalSql_dsl.g:3798:1: ( ( rule__AlterAddStatement__ColumnAssignment_1 ) )
            // InternalSql_dsl.g:3799:2: ( rule__AlterAddStatement__ColumnAssignment_1 )
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnAssignment_1()); 
            // InternalSql_dsl.g:3800:2: ( rule__AlterAddStatement__ColumnAssignment_1 )
            // InternalSql_dsl.g:3800:3: rule__AlterAddStatement__ColumnAssignment_1
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
    // InternalSql_dsl.g:3809:1: rule__AlterUpdateStatement__Group__0 : rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1 ;
    public final void rule__AlterUpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3813:1: ( rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1 )
            // InternalSql_dsl.g:3814:2: rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1
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
    // InternalSql_dsl.g:3821:1: rule__AlterUpdateStatement__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__AlterUpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3825:1: ( ( 'ALTER' ) )
            // InternalSql_dsl.g:3826:1: ( 'ALTER' )
            {
            // InternalSql_dsl.g:3826:1: ( 'ALTER' )
            // InternalSql_dsl.g:3827:2: 'ALTER'
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
    // InternalSql_dsl.g:3836:1: rule__AlterUpdateStatement__Group__1 : rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2 ;
    public final void rule__AlterUpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3840:1: ( rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2 )
            // InternalSql_dsl.g:3841:2: rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2
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
    // InternalSql_dsl.g:3848:1: rule__AlterUpdateStatement__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__AlterUpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3852:1: ( ( 'COLUMN' ) )
            // InternalSql_dsl.g:3853:1: ( 'COLUMN' )
            {
            // InternalSql_dsl.g:3853:1: ( 'COLUMN' )
            // InternalSql_dsl.g:3854:2: 'COLUMN'
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
    // InternalSql_dsl.g:3863:1: rule__AlterUpdateStatement__Group__2 : rule__AlterUpdateStatement__Group__2__Impl ;
    public final void rule__AlterUpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3867:1: ( rule__AlterUpdateStatement__Group__2__Impl )
            // InternalSql_dsl.g:3868:2: rule__AlterUpdateStatement__Group__2__Impl
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
    // InternalSql_dsl.g:3874:1: rule__AlterUpdateStatement__Group__2__Impl : ( ( rule__AlterUpdateStatement__ColumnAssignment_2 ) ) ;
    public final void rule__AlterUpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3878:1: ( ( ( rule__AlterUpdateStatement__ColumnAssignment_2 ) ) )
            // InternalSql_dsl.g:3879:1: ( ( rule__AlterUpdateStatement__ColumnAssignment_2 ) )
            {
            // InternalSql_dsl.g:3879:1: ( ( rule__AlterUpdateStatement__ColumnAssignment_2 ) )
            // InternalSql_dsl.g:3880:2: ( rule__AlterUpdateStatement__ColumnAssignment_2 )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getColumnAssignment_2()); 
            // InternalSql_dsl.g:3881:2: ( rule__AlterUpdateStatement__ColumnAssignment_2 )
            // InternalSql_dsl.g:3881:3: rule__AlterUpdateStatement__ColumnAssignment_2
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
    // InternalSql_dsl.g:3890:1: rule__VariableDeclarationStatement__Group__0 : rule__VariableDeclarationStatement__Group__0__Impl rule__VariableDeclarationStatement__Group__1 ;
    public final void rule__VariableDeclarationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3894:1: ( rule__VariableDeclarationStatement__Group__0__Impl rule__VariableDeclarationStatement__Group__1 )
            // InternalSql_dsl.g:3895:2: rule__VariableDeclarationStatement__Group__0__Impl rule__VariableDeclarationStatement__Group__1
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
    // InternalSql_dsl.g:3902:1: rule__VariableDeclarationStatement__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclarationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3906:1: ( ( 'var' ) )
            // InternalSql_dsl.g:3907:1: ( 'var' )
            {
            // InternalSql_dsl.g:3907:1: ( 'var' )
            // InternalSql_dsl.g:3908:2: 'var'
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
    // InternalSql_dsl.g:3917:1: rule__VariableDeclarationStatement__Group__1 : rule__VariableDeclarationStatement__Group__1__Impl rule__VariableDeclarationStatement__Group__2 ;
    public final void rule__VariableDeclarationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3921:1: ( rule__VariableDeclarationStatement__Group__1__Impl rule__VariableDeclarationStatement__Group__2 )
            // InternalSql_dsl.g:3922:2: rule__VariableDeclarationStatement__Group__1__Impl rule__VariableDeclarationStatement__Group__2
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
    // InternalSql_dsl.g:3929:1: rule__VariableDeclarationStatement__Group__1__Impl : ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclarationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3933:1: ( ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) ) )
            // InternalSql_dsl.g:3934:1: ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) )
            {
            // InternalSql_dsl.g:3934:1: ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) )
            // InternalSql_dsl.g:3935:2: ( rule__VariableDeclarationStatement__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getNameAssignment_1()); 
            // InternalSql_dsl.g:3936:2: ( rule__VariableDeclarationStatement__NameAssignment_1 )
            // InternalSql_dsl.g:3936:3: rule__VariableDeclarationStatement__NameAssignment_1
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
    // InternalSql_dsl.g:3944:1: rule__VariableDeclarationStatement__Group__2 : rule__VariableDeclarationStatement__Group__2__Impl rule__VariableDeclarationStatement__Group__3 ;
    public final void rule__VariableDeclarationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3948:1: ( rule__VariableDeclarationStatement__Group__2__Impl rule__VariableDeclarationStatement__Group__3 )
            // InternalSql_dsl.g:3949:2: rule__VariableDeclarationStatement__Group__2__Impl rule__VariableDeclarationStatement__Group__3
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
    // InternalSql_dsl.g:3956:1: rule__VariableDeclarationStatement__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclarationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3960:1: ( ( '=' ) )
            // InternalSql_dsl.g:3961:1: ( '=' )
            {
            // InternalSql_dsl.g:3961:1: ( '=' )
            // InternalSql_dsl.g:3962:2: '='
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
    // InternalSql_dsl.g:3971:1: rule__VariableDeclarationStatement__Group__3 : rule__VariableDeclarationStatement__Group__3__Impl ;
    public final void rule__VariableDeclarationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3975:1: ( rule__VariableDeclarationStatement__Group__3__Impl )
            // InternalSql_dsl.g:3976:2: rule__VariableDeclarationStatement__Group__3__Impl
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
    // InternalSql_dsl.g:3982:1: rule__VariableDeclarationStatement__Group__3__Impl : ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclarationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3986:1: ( ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) ) )
            // InternalSql_dsl.g:3987:1: ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) )
            {
            // InternalSql_dsl.g:3987:1: ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) )
            // InternalSql_dsl.g:3988:2: ( rule__VariableDeclarationStatement__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getValueAssignment_3()); 
            // InternalSql_dsl.g:3989:2: ( rule__VariableDeclarationStatement__ValueAssignment_3 )
            // InternalSql_dsl.g:3989:3: rule__VariableDeclarationStatement__ValueAssignment_3
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
    // InternalSql_dsl.g:3998:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4002:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalSql_dsl.g:4003:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
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
    // InternalSql_dsl.g:4010:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4014:1: ( ( ( RULE_INT )? ) )
            // InternalSql_dsl.g:4015:1: ( ( RULE_INT )? )
            {
            // InternalSql_dsl.g:4015:1: ( ( RULE_INT )? )
            // InternalSql_dsl.g:4016:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalSql_dsl.g:4017:2: ( RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSql_dsl.g:4017:3: RULE_INT
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
    // InternalSql_dsl.g:4025:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4029:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalSql_dsl.g:4030:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
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
    // InternalSql_dsl.g:4037:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4041:1: ( ( '.' ) )
            // InternalSql_dsl.g:4042:1: ( '.' )
            {
            // InternalSql_dsl.g:4042:1: ( '.' )
            // InternalSql_dsl.g:4043:2: '.'
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
    // InternalSql_dsl.g:4052:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4056:1: ( rule__REAL__Group__2__Impl )
            // InternalSql_dsl.g:4057:2: rule__REAL__Group__2__Impl
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
    // InternalSql_dsl.g:4063:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4067:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:4068:1: ( RULE_INT )
            {
            // InternalSql_dsl.g:4068:1: ( RULE_INT )
            // InternalSql_dsl.g:4069:2: RULE_INT
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
    // InternalSql_dsl.g:4079:1: rule__CountFunction__Group__0 : rule__CountFunction__Group__0__Impl rule__CountFunction__Group__1 ;
    public final void rule__CountFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4083:1: ( rule__CountFunction__Group__0__Impl rule__CountFunction__Group__1 )
            // InternalSql_dsl.g:4084:2: rule__CountFunction__Group__0__Impl rule__CountFunction__Group__1
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
    // InternalSql_dsl.g:4091:1: rule__CountFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__CountFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4095:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4096:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4096:1: ( 'SELECT' )
            // InternalSql_dsl.g:4097:2: 'SELECT'
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
    // InternalSql_dsl.g:4106:1: rule__CountFunction__Group__1 : rule__CountFunction__Group__1__Impl rule__CountFunction__Group__2 ;
    public final void rule__CountFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4110:1: ( rule__CountFunction__Group__1__Impl rule__CountFunction__Group__2 )
            // InternalSql_dsl.g:4111:2: rule__CountFunction__Group__1__Impl rule__CountFunction__Group__2
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
    // InternalSql_dsl.g:4118:1: rule__CountFunction__Group__1__Impl : ( 'COUNT' ) ;
    public final void rule__CountFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4122:1: ( ( 'COUNT' ) )
            // InternalSql_dsl.g:4123:1: ( 'COUNT' )
            {
            // InternalSql_dsl.g:4123:1: ( 'COUNT' )
            // InternalSql_dsl.g:4124:2: 'COUNT'
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
    // InternalSql_dsl.g:4133:1: rule__CountFunction__Group__2 : rule__CountFunction__Group__2__Impl rule__CountFunction__Group__3 ;
    public final void rule__CountFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4137:1: ( rule__CountFunction__Group__2__Impl rule__CountFunction__Group__3 )
            // InternalSql_dsl.g:4138:2: rule__CountFunction__Group__2__Impl rule__CountFunction__Group__3
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
    // InternalSql_dsl.g:4145:1: rule__CountFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__CountFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4149:1: ( ( '(' ) )
            // InternalSql_dsl.g:4150:1: ( '(' )
            {
            // InternalSql_dsl.g:4150:1: ( '(' )
            // InternalSql_dsl.g:4151:2: '('
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
    // InternalSql_dsl.g:4160:1: rule__CountFunction__Group__3 : rule__CountFunction__Group__3__Impl rule__CountFunction__Group__4 ;
    public final void rule__CountFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4164:1: ( rule__CountFunction__Group__3__Impl rule__CountFunction__Group__4 )
            // InternalSql_dsl.g:4165:2: rule__CountFunction__Group__3__Impl rule__CountFunction__Group__4
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
    // InternalSql_dsl.g:4172:1: rule__CountFunction__Group__3__Impl : ( ( rule__CountFunction__ColumnAssignment_3 ) ) ;
    public final void rule__CountFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4176:1: ( ( ( rule__CountFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:4177:1: ( ( rule__CountFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:4177:1: ( ( rule__CountFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:4178:2: ( rule__CountFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getCountFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:4179:2: ( rule__CountFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:4179:3: rule__CountFunction__ColumnAssignment_3
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
    // InternalSql_dsl.g:4187:1: rule__CountFunction__Group__4 : rule__CountFunction__Group__4__Impl rule__CountFunction__Group__5 ;
    public final void rule__CountFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4191:1: ( rule__CountFunction__Group__4__Impl rule__CountFunction__Group__5 )
            // InternalSql_dsl.g:4192:2: rule__CountFunction__Group__4__Impl rule__CountFunction__Group__5
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
    // InternalSql_dsl.g:4199:1: rule__CountFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__CountFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4203:1: ( ( ')' ) )
            // InternalSql_dsl.g:4204:1: ( ')' )
            {
            // InternalSql_dsl.g:4204:1: ( ')' )
            // InternalSql_dsl.g:4205:2: ')'
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
    // InternalSql_dsl.g:4214:1: rule__CountFunction__Group__5 : rule__CountFunction__Group__5__Impl ;
    public final void rule__CountFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4218:1: ( rule__CountFunction__Group__5__Impl )
            // InternalSql_dsl.g:4219:2: rule__CountFunction__Group__5__Impl
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
    // InternalSql_dsl.g:4225:1: rule__CountFunction__Group__5__Impl : ( ( rule__CountFunction__XAssignment_5 ) ) ;
    public final void rule__CountFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4229:1: ( ( ( rule__CountFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:4230:1: ( ( rule__CountFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:4230:1: ( ( rule__CountFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:4231:2: ( rule__CountFunction__XAssignment_5 )
            {
             before(grammarAccess.getCountFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:4232:2: ( rule__CountFunction__XAssignment_5 )
            // InternalSql_dsl.g:4232:3: rule__CountFunction__XAssignment_5
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
    // InternalSql_dsl.g:4241:1: rule__AvgFunction__Group__0 : rule__AvgFunction__Group__0__Impl rule__AvgFunction__Group__1 ;
    public final void rule__AvgFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4245:1: ( rule__AvgFunction__Group__0__Impl rule__AvgFunction__Group__1 )
            // InternalSql_dsl.g:4246:2: rule__AvgFunction__Group__0__Impl rule__AvgFunction__Group__1
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
    // InternalSql_dsl.g:4253:1: rule__AvgFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__AvgFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4257:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4258:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4258:1: ( 'SELECT' )
            // InternalSql_dsl.g:4259:2: 'SELECT'
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
    // InternalSql_dsl.g:4268:1: rule__AvgFunction__Group__1 : rule__AvgFunction__Group__1__Impl rule__AvgFunction__Group__2 ;
    public final void rule__AvgFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4272:1: ( rule__AvgFunction__Group__1__Impl rule__AvgFunction__Group__2 )
            // InternalSql_dsl.g:4273:2: rule__AvgFunction__Group__1__Impl rule__AvgFunction__Group__2
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
    // InternalSql_dsl.g:4280:1: rule__AvgFunction__Group__1__Impl : ( 'AVG' ) ;
    public final void rule__AvgFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4284:1: ( ( 'AVG' ) )
            // InternalSql_dsl.g:4285:1: ( 'AVG' )
            {
            // InternalSql_dsl.g:4285:1: ( 'AVG' )
            // InternalSql_dsl.g:4286:2: 'AVG'
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
    // InternalSql_dsl.g:4295:1: rule__AvgFunction__Group__2 : rule__AvgFunction__Group__2__Impl rule__AvgFunction__Group__3 ;
    public final void rule__AvgFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4299:1: ( rule__AvgFunction__Group__2__Impl rule__AvgFunction__Group__3 )
            // InternalSql_dsl.g:4300:2: rule__AvgFunction__Group__2__Impl rule__AvgFunction__Group__3
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
    // InternalSql_dsl.g:4307:1: rule__AvgFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__AvgFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4311:1: ( ( '(' ) )
            // InternalSql_dsl.g:4312:1: ( '(' )
            {
            // InternalSql_dsl.g:4312:1: ( '(' )
            // InternalSql_dsl.g:4313:2: '('
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
    // InternalSql_dsl.g:4322:1: rule__AvgFunction__Group__3 : rule__AvgFunction__Group__3__Impl rule__AvgFunction__Group__4 ;
    public final void rule__AvgFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4326:1: ( rule__AvgFunction__Group__3__Impl rule__AvgFunction__Group__4 )
            // InternalSql_dsl.g:4327:2: rule__AvgFunction__Group__3__Impl rule__AvgFunction__Group__4
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
    // InternalSql_dsl.g:4334:1: rule__AvgFunction__Group__3__Impl : ( ( rule__AvgFunction__ColumnAssignment_3 ) ) ;
    public final void rule__AvgFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4338:1: ( ( ( rule__AvgFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:4339:1: ( ( rule__AvgFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:4339:1: ( ( rule__AvgFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:4340:2: ( rule__AvgFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getAvgFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:4341:2: ( rule__AvgFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:4341:3: rule__AvgFunction__ColumnAssignment_3
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
    // InternalSql_dsl.g:4349:1: rule__AvgFunction__Group__4 : rule__AvgFunction__Group__4__Impl rule__AvgFunction__Group__5 ;
    public final void rule__AvgFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4353:1: ( rule__AvgFunction__Group__4__Impl rule__AvgFunction__Group__5 )
            // InternalSql_dsl.g:4354:2: rule__AvgFunction__Group__4__Impl rule__AvgFunction__Group__5
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
    // InternalSql_dsl.g:4361:1: rule__AvgFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__AvgFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4365:1: ( ( ')' ) )
            // InternalSql_dsl.g:4366:1: ( ')' )
            {
            // InternalSql_dsl.g:4366:1: ( ')' )
            // InternalSql_dsl.g:4367:2: ')'
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
    // InternalSql_dsl.g:4376:1: rule__AvgFunction__Group__5 : rule__AvgFunction__Group__5__Impl ;
    public final void rule__AvgFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4380:1: ( rule__AvgFunction__Group__5__Impl )
            // InternalSql_dsl.g:4381:2: rule__AvgFunction__Group__5__Impl
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
    // InternalSql_dsl.g:4387:1: rule__AvgFunction__Group__5__Impl : ( ( rule__AvgFunction__XAssignment_5 ) ) ;
    public final void rule__AvgFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4391:1: ( ( ( rule__AvgFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:4392:1: ( ( rule__AvgFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:4392:1: ( ( rule__AvgFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:4393:2: ( rule__AvgFunction__XAssignment_5 )
            {
             before(grammarAccess.getAvgFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:4394:2: ( rule__AvgFunction__XAssignment_5 )
            // InternalSql_dsl.g:4394:3: rule__AvgFunction__XAssignment_5
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
    // InternalSql_dsl.g:4403:1: rule__SumFunction__Group__0 : rule__SumFunction__Group__0__Impl rule__SumFunction__Group__1 ;
    public final void rule__SumFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4407:1: ( rule__SumFunction__Group__0__Impl rule__SumFunction__Group__1 )
            // InternalSql_dsl.g:4408:2: rule__SumFunction__Group__0__Impl rule__SumFunction__Group__1
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
    // InternalSql_dsl.g:4415:1: rule__SumFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SumFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4419:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4420:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4420:1: ( 'SELECT' )
            // InternalSql_dsl.g:4421:2: 'SELECT'
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
    // InternalSql_dsl.g:4430:1: rule__SumFunction__Group__1 : rule__SumFunction__Group__1__Impl rule__SumFunction__Group__2 ;
    public final void rule__SumFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4434:1: ( rule__SumFunction__Group__1__Impl rule__SumFunction__Group__2 )
            // InternalSql_dsl.g:4435:2: rule__SumFunction__Group__1__Impl rule__SumFunction__Group__2
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
    // InternalSql_dsl.g:4442:1: rule__SumFunction__Group__1__Impl : ( 'SUM' ) ;
    public final void rule__SumFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4446:1: ( ( 'SUM' ) )
            // InternalSql_dsl.g:4447:1: ( 'SUM' )
            {
            // InternalSql_dsl.g:4447:1: ( 'SUM' )
            // InternalSql_dsl.g:4448:2: 'SUM'
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
    // InternalSql_dsl.g:4457:1: rule__SumFunction__Group__2 : rule__SumFunction__Group__2__Impl rule__SumFunction__Group__3 ;
    public final void rule__SumFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4461:1: ( rule__SumFunction__Group__2__Impl rule__SumFunction__Group__3 )
            // InternalSql_dsl.g:4462:2: rule__SumFunction__Group__2__Impl rule__SumFunction__Group__3
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
    // InternalSql_dsl.g:4469:1: rule__SumFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__SumFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4473:1: ( ( '(' ) )
            // InternalSql_dsl.g:4474:1: ( '(' )
            {
            // InternalSql_dsl.g:4474:1: ( '(' )
            // InternalSql_dsl.g:4475:2: '('
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
    // InternalSql_dsl.g:4484:1: rule__SumFunction__Group__3 : rule__SumFunction__Group__3__Impl rule__SumFunction__Group__4 ;
    public final void rule__SumFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4488:1: ( rule__SumFunction__Group__3__Impl rule__SumFunction__Group__4 )
            // InternalSql_dsl.g:4489:2: rule__SumFunction__Group__3__Impl rule__SumFunction__Group__4
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
    // InternalSql_dsl.g:4496:1: rule__SumFunction__Group__3__Impl : ( ( rule__SumFunction__ColumnAssignment_3 ) ) ;
    public final void rule__SumFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4500:1: ( ( ( rule__SumFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:4501:1: ( ( rule__SumFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:4501:1: ( ( rule__SumFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:4502:2: ( rule__SumFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getSumFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:4503:2: ( rule__SumFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:4503:3: rule__SumFunction__ColumnAssignment_3
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
    // InternalSql_dsl.g:4511:1: rule__SumFunction__Group__4 : rule__SumFunction__Group__4__Impl rule__SumFunction__Group__5 ;
    public final void rule__SumFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4515:1: ( rule__SumFunction__Group__4__Impl rule__SumFunction__Group__5 )
            // InternalSql_dsl.g:4516:2: rule__SumFunction__Group__4__Impl rule__SumFunction__Group__5
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
    // InternalSql_dsl.g:4523:1: rule__SumFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__SumFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4527:1: ( ( ')' ) )
            // InternalSql_dsl.g:4528:1: ( ')' )
            {
            // InternalSql_dsl.g:4528:1: ( ')' )
            // InternalSql_dsl.g:4529:2: ')'
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
    // InternalSql_dsl.g:4538:1: rule__SumFunction__Group__5 : rule__SumFunction__Group__5__Impl ;
    public final void rule__SumFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4542:1: ( rule__SumFunction__Group__5__Impl )
            // InternalSql_dsl.g:4543:2: rule__SumFunction__Group__5__Impl
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
    // InternalSql_dsl.g:4549:1: rule__SumFunction__Group__5__Impl : ( ( rule__SumFunction__XAssignment_5 ) ) ;
    public final void rule__SumFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4553:1: ( ( ( rule__SumFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:4554:1: ( ( rule__SumFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:4554:1: ( ( rule__SumFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:4555:2: ( rule__SumFunction__XAssignment_5 )
            {
             before(grammarAccess.getSumFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:4556:2: ( rule__SumFunction__XAssignment_5 )
            // InternalSql_dsl.g:4556:3: rule__SumFunction__XAssignment_5
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
    // InternalSql_dsl.g:4565:1: rule__MinFunction__Group__0 : rule__MinFunction__Group__0__Impl rule__MinFunction__Group__1 ;
    public final void rule__MinFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4569:1: ( rule__MinFunction__Group__0__Impl rule__MinFunction__Group__1 )
            // InternalSql_dsl.g:4570:2: rule__MinFunction__Group__0__Impl rule__MinFunction__Group__1
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
    // InternalSql_dsl.g:4577:1: rule__MinFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__MinFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4581:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4582:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4582:1: ( 'SELECT' )
            // InternalSql_dsl.g:4583:2: 'SELECT'
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
    // InternalSql_dsl.g:4592:1: rule__MinFunction__Group__1 : rule__MinFunction__Group__1__Impl rule__MinFunction__Group__2 ;
    public final void rule__MinFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4596:1: ( rule__MinFunction__Group__1__Impl rule__MinFunction__Group__2 )
            // InternalSql_dsl.g:4597:2: rule__MinFunction__Group__1__Impl rule__MinFunction__Group__2
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
    // InternalSql_dsl.g:4604:1: rule__MinFunction__Group__1__Impl : ( 'MIN' ) ;
    public final void rule__MinFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4608:1: ( ( 'MIN' ) )
            // InternalSql_dsl.g:4609:1: ( 'MIN' )
            {
            // InternalSql_dsl.g:4609:1: ( 'MIN' )
            // InternalSql_dsl.g:4610:2: 'MIN'
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
    // InternalSql_dsl.g:4619:1: rule__MinFunction__Group__2 : rule__MinFunction__Group__2__Impl rule__MinFunction__Group__3 ;
    public final void rule__MinFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4623:1: ( rule__MinFunction__Group__2__Impl rule__MinFunction__Group__3 )
            // InternalSql_dsl.g:4624:2: rule__MinFunction__Group__2__Impl rule__MinFunction__Group__3
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
    // InternalSql_dsl.g:4631:1: rule__MinFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__MinFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4635:1: ( ( '(' ) )
            // InternalSql_dsl.g:4636:1: ( '(' )
            {
            // InternalSql_dsl.g:4636:1: ( '(' )
            // InternalSql_dsl.g:4637:2: '('
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
    // InternalSql_dsl.g:4646:1: rule__MinFunction__Group__3 : rule__MinFunction__Group__3__Impl rule__MinFunction__Group__4 ;
    public final void rule__MinFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4650:1: ( rule__MinFunction__Group__3__Impl rule__MinFunction__Group__4 )
            // InternalSql_dsl.g:4651:2: rule__MinFunction__Group__3__Impl rule__MinFunction__Group__4
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
    // InternalSql_dsl.g:4658:1: rule__MinFunction__Group__3__Impl : ( ( rule__MinFunction__ColumnAssignment_3 ) ) ;
    public final void rule__MinFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4662:1: ( ( ( rule__MinFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:4663:1: ( ( rule__MinFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:4663:1: ( ( rule__MinFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:4664:2: ( rule__MinFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getMinFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:4665:2: ( rule__MinFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:4665:3: rule__MinFunction__ColumnAssignment_3
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
    // InternalSql_dsl.g:4673:1: rule__MinFunction__Group__4 : rule__MinFunction__Group__4__Impl rule__MinFunction__Group__5 ;
    public final void rule__MinFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4677:1: ( rule__MinFunction__Group__4__Impl rule__MinFunction__Group__5 )
            // InternalSql_dsl.g:4678:2: rule__MinFunction__Group__4__Impl rule__MinFunction__Group__5
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
    // InternalSql_dsl.g:4685:1: rule__MinFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__MinFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4689:1: ( ( ')' ) )
            // InternalSql_dsl.g:4690:1: ( ')' )
            {
            // InternalSql_dsl.g:4690:1: ( ')' )
            // InternalSql_dsl.g:4691:2: ')'
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
    // InternalSql_dsl.g:4700:1: rule__MinFunction__Group__5 : rule__MinFunction__Group__5__Impl ;
    public final void rule__MinFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4704:1: ( rule__MinFunction__Group__5__Impl )
            // InternalSql_dsl.g:4705:2: rule__MinFunction__Group__5__Impl
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
    // InternalSql_dsl.g:4711:1: rule__MinFunction__Group__5__Impl : ( ( rule__MinFunction__XAssignment_5 ) ) ;
    public final void rule__MinFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4715:1: ( ( ( rule__MinFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:4716:1: ( ( rule__MinFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:4716:1: ( ( rule__MinFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:4717:2: ( rule__MinFunction__XAssignment_5 )
            {
             before(grammarAccess.getMinFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:4718:2: ( rule__MinFunction__XAssignment_5 )
            // InternalSql_dsl.g:4718:3: rule__MinFunction__XAssignment_5
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
    // InternalSql_dsl.g:4727:1: rule__MaxFunction__Group__0 : rule__MaxFunction__Group__0__Impl rule__MaxFunction__Group__1 ;
    public final void rule__MaxFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4731:1: ( rule__MaxFunction__Group__0__Impl rule__MaxFunction__Group__1 )
            // InternalSql_dsl.g:4732:2: rule__MaxFunction__Group__0__Impl rule__MaxFunction__Group__1
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
    // InternalSql_dsl.g:4739:1: rule__MaxFunction__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__MaxFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4743:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:4744:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:4744:1: ( 'SELECT' )
            // InternalSql_dsl.g:4745:2: 'SELECT'
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
    // InternalSql_dsl.g:4754:1: rule__MaxFunction__Group__1 : rule__MaxFunction__Group__1__Impl rule__MaxFunction__Group__2 ;
    public final void rule__MaxFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4758:1: ( rule__MaxFunction__Group__1__Impl rule__MaxFunction__Group__2 )
            // InternalSql_dsl.g:4759:2: rule__MaxFunction__Group__1__Impl rule__MaxFunction__Group__2
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
    // InternalSql_dsl.g:4766:1: rule__MaxFunction__Group__1__Impl : ( 'MAX' ) ;
    public final void rule__MaxFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4770:1: ( ( 'MAX' ) )
            // InternalSql_dsl.g:4771:1: ( 'MAX' )
            {
            // InternalSql_dsl.g:4771:1: ( 'MAX' )
            // InternalSql_dsl.g:4772:2: 'MAX'
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
    // InternalSql_dsl.g:4781:1: rule__MaxFunction__Group__2 : rule__MaxFunction__Group__2__Impl rule__MaxFunction__Group__3 ;
    public final void rule__MaxFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4785:1: ( rule__MaxFunction__Group__2__Impl rule__MaxFunction__Group__3 )
            // InternalSql_dsl.g:4786:2: rule__MaxFunction__Group__2__Impl rule__MaxFunction__Group__3
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
    // InternalSql_dsl.g:4793:1: rule__MaxFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__MaxFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4797:1: ( ( '(' ) )
            // InternalSql_dsl.g:4798:1: ( '(' )
            {
            // InternalSql_dsl.g:4798:1: ( '(' )
            // InternalSql_dsl.g:4799:2: '('
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
    // InternalSql_dsl.g:4808:1: rule__MaxFunction__Group__3 : rule__MaxFunction__Group__3__Impl rule__MaxFunction__Group__4 ;
    public final void rule__MaxFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4812:1: ( rule__MaxFunction__Group__3__Impl rule__MaxFunction__Group__4 )
            // InternalSql_dsl.g:4813:2: rule__MaxFunction__Group__3__Impl rule__MaxFunction__Group__4
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
    // InternalSql_dsl.g:4820:1: rule__MaxFunction__Group__3__Impl : ( ( rule__MaxFunction__ColumnAssignment_3 ) ) ;
    public final void rule__MaxFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4824:1: ( ( ( rule__MaxFunction__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:4825:1: ( ( rule__MaxFunction__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:4825:1: ( ( rule__MaxFunction__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:4826:2: ( rule__MaxFunction__ColumnAssignment_3 )
            {
             before(grammarAccess.getMaxFunctionAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:4827:2: ( rule__MaxFunction__ColumnAssignment_3 )
            // InternalSql_dsl.g:4827:3: rule__MaxFunction__ColumnAssignment_3
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
    // InternalSql_dsl.g:4835:1: rule__MaxFunction__Group__4 : rule__MaxFunction__Group__4__Impl rule__MaxFunction__Group__5 ;
    public final void rule__MaxFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4839:1: ( rule__MaxFunction__Group__4__Impl rule__MaxFunction__Group__5 )
            // InternalSql_dsl.g:4840:2: rule__MaxFunction__Group__4__Impl rule__MaxFunction__Group__5
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
    // InternalSql_dsl.g:4847:1: rule__MaxFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__MaxFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4851:1: ( ( ')' ) )
            // InternalSql_dsl.g:4852:1: ( ')' )
            {
            // InternalSql_dsl.g:4852:1: ( ')' )
            // InternalSql_dsl.g:4853:2: ')'
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
    // InternalSql_dsl.g:4862:1: rule__MaxFunction__Group__5 : rule__MaxFunction__Group__5__Impl ;
    public final void rule__MaxFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4866:1: ( rule__MaxFunction__Group__5__Impl )
            // InternalSql_dsl.g:4867:2: rule__MaxFunction__Group__5__Impl
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
    // InternalSql_dsl.g:4873:1: rule__MaxFunction__Group__5__Impl : ( ( rule__MaxFunction__XAssignment_5 ) ) ;
    public final void rule__MaxFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4877:1: ( ( ( rule__MaxFunction__XAssignment_5 ) ) )
            // InternalSql_dsl.g:4878:1: ( ( rule__MaxFunction__XAssignment_5 ) )
            {
            // InternalSql_dsl.g:4878:1: ( ( rule__MaxFunction__XAssignment_5 ) )
            // InternalSql_dsl.g:4879:2: ( rule__MaxFunction__XAssignment_5 )
            {
             before(grammarAccess.getMaxFunctionAccess().getXAssignment_5()); 
            // InternalSql_dsl.g:4880:2: ( rule__MaxFunction__XAssignment_5 )
            // InternalSql_dsl.g:4880:3: rule__MaxFunction__XAssignment_5
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
    // InternalSql_dsl.g:4889:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4893:1: ( ( ruleStatement ) )
            // InternalSql_dsl.g:4894:2: ( ruleStatement )
            {
            // InternalSql_dsl.g:4894:2: ( ruleStatement )
            // InternalSql_dsl.g:4895:3: ruleStatement
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
    // InternalSql_dsl.g:4904:1: rule__SelectStatement__ColumnAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__SelectStatement__ColumnAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4908:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:4909:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:4909:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:4910:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_1_1_0_0()); 
            // InternalSql_dsl.g:4911:3: ( RULE_ID )
            // InternalSql_dsl.g:4912:4: RULE_ID
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
    // InternalSql_dsl.g:4923:1: rule__SelectStatement__ColumnAssignment_1_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__SelectStatement__ColumnAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4927:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:4928:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:4928:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:4929:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_1_1_1_1_0()); 
            // InternalSql_dsl.g:4930:3: ( RULE_ID )
            // InternalSql_dsl.g:4931:4: RULE_ID
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
    // InternalSql_dsl.g:4942:1: rule__SelectStatement__XAssignment_2 : ( ruleFromAndWhereClauses ) ;
    public final void rule__SelectStatement__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4946:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:4947:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:4947:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:4948:3: ruleFromAndWhereClauses
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
    // InternalSql_dsl.g:4957:1: rule__FromAndWhereClauses__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FromAndWhereClauses__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4961:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:4962:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:4962:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:4963:3: ( RULE_ID )
            {
             before(grammarAccess.getFromAndWhereClausesAccess().getTableTableNameCrossReference_1_0()); 
            // InternalSql_dsl.g:4964:3: ( RULE_ID )
            // InternalSql_dsl.g:4965:4: RULE_ID
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
    // InternalSql_dsl.g:4976:1: rule__FromAndWhereClauses__ZAssignment_2_1 : ( ruleWhereDec ) ;
    public final void rule__FromAndWhereClauses__ZAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4980:1: ( ( ruleWhereDec ) )
            // InternalSql_dsl.g:4981:2: ( ruleWhereDec )
            {
            // InternalSql_dsl.g:4981:2: ( ruleWhereDec )
            // InternalSql_dsl.g:4982:3: ruleWhereDec
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
    // InternalSql_dsl.g:4991:1: rule__FromAndWhereClauses__ZAssignment_2_2_1 : ( ruleWhereDec ) ;
    public final void rule__FromAndWhereClauses__ZAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:4995:1: ( ( ruleWhereDec ) )
            // InternalSql_dsl.g:4996:2: ( ruleWhereDec )
            {
            // InternalSql_dsl.g:4996:2: ( ruleWhereDec )
            // InternalSql_dsl.g:4997:3: ruleWhereDec
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
    // InternalSql_dsl.g:5006:1: rule__WhereDec__ColumnAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WhereDec__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5010:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5011:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5011:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5012:3: ( RULE_ID )
            {
             before(grammarAccess.getWhereDecAccess().getColumnCDCrossReference_0_0()); 
            // InternalSql_dsl.g:5013:3: ( RULE_ID )
            // InternalSql_dsl.g:5014:4: RULE_ID
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


    // $ANTLR start "rule__WhereDec__NameAssignment_2_0_1"
    // InternalSql_dsl.g:5025:1: rule__WhereDec__NameAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__WhereDec__NameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5029:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5030:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5030:2: ( RULE_ID )
            // InternalSql_dsl.g:5031:3: RULE_ID
            {
             before(grammarAccess.getWhereDecAccess().getNameIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWhereDecAccess().getNameIDTerminalRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__WhereDec__NameAssignment_2_0_1"


    // $ANTLR start "rule__WhereDec__ColumnAssignment_2_1"
    // InternalSql_dsl.g:5040:1: rule__WhereDec__ColumnAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__WhereDec__ColumnAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5044:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5045:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5045:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5046:3: ( RULE_ID )
            {
             before(grammarAccess.getWhereDecAccess().getColumnCDCrossReference_2_1_0()); 
            // InternalSql_dsl.g:5047:3: ( RULE_ID )
            // InternalSql_dsl.g:5048:4: RULE_ID
            {
             before(grammarAccess.getWhereDecAccess().getColumnCDIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWhereDecAccess().getColumnCDIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getWhereDecAccess().getColumnCDCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__WhereDec__ColumnAssignment_2_1"


    // $ANTLR start "rule__WhereDec__ValAssignment_2_2"
    // InternalSql_dsl.g:5059:1: rule__WhereDec__ValAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__WhereDec__ValAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5063:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:5064:2: ( RULE_INT )
            {
            // InternalSql_dsl.g:5064:2: ( RULE_INT )
            // InternalSql_dsl.g:5065:3: RULE_INT
            {
             before(grammarAccess.getWhereDecAccess().getValINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWhereDecAccess().getValINTTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__WhereDec__ValAssignment_2_2"


    // $ANTLR start "rule__DatabaseDeclarationStatement__NameAssignment_2"
    // InternalSql_dsl.g:5074:1: rule__DatabaseDeclarationStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DatabaseDeclarationStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5078:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5079:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5079:2: ( RULE_ID )
            // InternalSql_dsl.g:5080:3: RULE_ID
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
    // InternalSql_dsl.g:5089:1: rule__CreateTableStatement__TablesAssignment : ( ruleTableDeclaration ) ;
    public final void rule__CreateTableStatement__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5093:1: ( ( ruleTableDeclaration ) )
            // InternalSql_dsl.g:5094:2: ( ruleTableDeclaration )
            {
            // InternalSql_dsl.g:5094:2: ( ruleTableDeclaration )
            // InternalSql_dsl.g:5095:3: ruleTableDeclaration
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
    // InternalSql_dsl.g:5104:1: rule__TableDeclaration__TableAssignment_2 : ( ruletableName ) ;
    public final void rule__TableDeclaration__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5108:1: ( ( ruletableName ) )
            // InternalSql_dsl.g:5109:2: ( ruletableName )
            {
            // InternalSql_dsl.g:5109:2: ( ruletableName )
            // InternalSql_dsl.g:5110:3: ruletableName
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
    // InternalSql_dsl.g:5119:1: rule__TableDeclaration__AttributesAssignment_4 : ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) ) ;
    public final void rule__TableDeclaration__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5123:1: ( ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) ) )
            // InternalSql_dsl.g:5124:2: ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) )
            {
            // InternalSql_dsl.g:5124:2: ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) )
            // InternalSql_dsl.g:5125:3: ( rule__TableDeclaration__AttributesAlternatives_4_0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_4_0()); 
            // InternalSql_dsl.g:5126:3: ( rule__TableDeclaration__AttributesAlternatives_4_0 )
            // InternalSql_dsl.g:5126:4: rule__TableDeclaration__AttributesAlternatives_4_0
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
    // InternalSql_dsl.g:5134:1: rule__TableDeclaration__AttributesAssignment_5_1 : ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) ) ;
    public final void rule__TableDeclaration__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5138:1: ( ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) ) )
            // InternalSql_dsl.g:5139:2: ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) )
            {
            // InternalSql_dsl.g:5139:2: ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) )
            // InternalSql_dsl.g:5140:3: ( rule__TableDeclaration__AttributesAlternatives_5_1_0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_5_1_0()); 
            // InternalSql_dsl.g:5141:3: ( rule__TableDeclaration__AttributesAlternatives_5_1_0 )
            // InternalSql_dsl.g:5141:4: rule__TableDeclaration__AttributesAlternatives_5_1_0
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
    // InternalSql_dsl.g:5149:1: rule__TableName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TableName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5153:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5154:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5154:2: ( RULE_ID )
            // InternalSql_dsl.g:5155:3: RULE_ID
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
    // InternalSql_dsl.g:5164:1: rule__ColumnDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ColumnDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5168:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5169:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5169:2: ( RULE_ID )
            // InternalSql_dsl.g:5170:3: RULE_ID
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
    // InternalSql_dsl.g:5179:1: rule__ColumnDeclaration__TypeAssignment_1 : ( ruleDataStructureType ) ;
    public final void rule__ColumnDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5183:1: ( ( ruleDataStructureType ) )
            // InternalSql_dsl.g:5184:2: ( ruleDataStructureType )
            {
            // InternalSql_dsl.g:5184:2: ( ruleDataStructureType )
            // InternalSql_dsl.g:5185:3: ruleDataStructureType
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
    // InternalSql_dsl.g:5194:1: rule__ColumnDeclaration__NotNullAssignment_2 : ( ( 'NOT NULL' ) ) ;
    public final void rule__ColumnDeclaration__NotNullAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5198:1: ( ( ( 'NOT NULL' ) ) )
            // InternalSql_dsl.g:5199:2: ( ( 'NOT NULL' ) )
            {
            // InternalSql_dsl.g:5199:2: ( ( 'NOT NULL' ) )
            // InternalSql_dsl.g:5200:3: ( 'NOT NULL' )
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0()); 
            // InternalSql_dsl.g:5201:3: ( 'NOT NULL' )
            // InternalSql_dsl.g:5202:4: 'NOT NULL'
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
    // InternalSql_dsl.g:5213:1: rule__PrimaryKey__ColumnAsPKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5217:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5218:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5218:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5219:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5220:3: ( RULE_ID )
            // InternalSql_dsl.g:5221:4: RULE_ID
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
    // InternalSql_dsl.g:5232:1: rule__PrimaryKey__ColumnAsPKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5236:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5237:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5237:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5238:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_4_1_0()); 
            // InternalSql_dsl.g:5239:3: ( RULE_ID )
            // InternalSql_dsl.g:5240:4: RULE_ID
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
    // InternalSql_dsl.g:5251:1: rule__ForeignKey__ColumnAsFKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5255:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5256:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5256:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5257:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5258:3: ( RULE_ID )
            // InternalSql_dsl.g:5259:4: RULE_ID
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
    // InternalSql_dsl.g:5270:1: rule__ForeignKey__ColumnAsFKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5274:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5275:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5275:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5276:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_4_1_0()); 
            // InternalSql_dsl.g:5277:3: ( RULE_ID )
            // InternalSql_dsl.g:5278:4: RULE_ID
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
    // InternalSql_dsl.g:5289:1: rule__ForeignKey__ForeignTableAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignTableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5293:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5294:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5294:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5295:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationCrossReference_7_0()); 
            // InternalSql_dsl.g:5296:3: ( RULE_ID )
            // InternalSql_dsl.g:5297:4: RULE_ID
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
    // InternalSql_dsl.g:5308:1: rule__ForeignKey__ForeignColumnsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5312:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5313:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5313:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5314:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_9_0()); 
            // InternalSql_dsl.g:5315:3: ( RULE_ID )
            // InternalSql_dsl.g:5316:4: RULE_ID
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
    // InternalSql_dsl.g:5327:1: rule__ForeignKey__ForeignColumnsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5331:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5332:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5332:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5333:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_10_1_0()); 
            // InternalSql_dsl.g:5334:3: ( RULE_ID )
            // InternalSql_dsl.g:5335:4: RULE_ID
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
    // InternalSql_dsl.g:5346:1: rule__DropTableStatement__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DropTableStatement__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5350:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5351:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5351:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5352:3: ( RULE_ID )
            {
             before(grammarAccess.getDropTableStatementAccess().getTableTableNameCrossReference_2_0()); 
            // InternalSql_dsl.g:5353:3: ( RULE_ID )
            // InternalSql_dsl.g:5354:4: RULE_ID
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


    // $ANTLR start "rule__TruncateTableStatement__TableAssignment_2"
    // InternalSql_dsl.g:5365:1: rule__TruncateTableStatement__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TruncateTableStatement__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5369:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5370:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5370:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5371:3: ( RULE_ID )
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTableTableNameCrossReference_2_0()); 
            // InternalSql_dsl.g:5372:3: ( RULE_ID )
            // InternalSql_dsl.g:5373:4: RULE_ID
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


    // $ANTLR start "rule__DeleteTableStatement__XAssignment_1"
    // InternalSql_dsl.g:5384:1: rule__DeleteTableStatement__XAssignment_1 : ( ruleFromAndWhereClauses ) ;
    public final void rule__DeleteTableStatement__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5388:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:5389:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:5389:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:5390:3: ruleFromAndWhereClauses
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
    // InternalSql_dsl.g:5399:1: rule__UpdateTableStatement__TableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UpdateTableStatement__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5403:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5404:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5404:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5405:3: ( RULE_ID )
            {
             before(grammarAccess.getUpdateTableStatementAccess().getTableTableNameCrossReference_1_0()); 
            // InternalSql_dsl.g:5406:3: ( RULE_ID )
            // InternalSql_dsl.g:5407:4: RULE_ID
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
    // InternalSql_dsl.g:5418:1: rule__UpdateTableStatement__ScAssignment_3 : ( ruleSetClause ) ;
    public final void rule__UpdateTableStatement__ScAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5422:1: ( ( ruleSetClause ) )
            // InternalSql_dsl.g:5423:2: ( ruleSetClause )
            {
            // InternalSql_dsl.g:5423:2: ( ruleSetClause )
            // InternalSql_dsl.g:5424:3: ruleSetClause
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
    // InternalSql_dsl.g:5433:1: rule__UpdateTableStatement__ScAssignment_4_1 : ( ruleSetClause ) ;
    public final void rule__UpdateTableStatement__ScAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5437:1: ( ( ruleSetClause ) )
            // InternalSql_dsl.g:5438:2: ( ruleSetClause )
            {
            // InternalSql_dsl.g:5438:2: ( ruleSetClause )
            // InternalSql_dsl.g:5439:3: ruleSetClause
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
    // InternalSql_dsl.g:5448:1: rule__UpdateTableStatement__ZAssignment_5_1 : ( ruleWhereDec ) ;
    public final void rule__UpdateTableStatement__ZAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5452:1: ( ( ruleWhereDec ) )
            // InternalSql_dsl.g:5453:2: ( ruleWhereDec )
            {
            // InternalSql_dsl.g:5453:2: ( ruleWhereDec )
            // InternalSql_dsl.g:5454:3: ruleWhereDec
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
    // InternalSql_dsl.g:5463:1: rule__UpdateTableStatement__ZAssignment_5_2_1 : ( ruleWhereDec ) ;
    public final void rule__UpdateTableStatement__ZAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5467:1: ( ( ruleWhereDec ) )
            // InternalSql_dsl.g:5468:2: ( ruleWhereDec )
            {
            // InternalSql_dsl.g:5468:2: ( ruleWhereDec )
            // InternalSql_dsl.g:5469:3: ruleWhereDec
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
    // InternalSql_dsl.g:5478:1: rule__SetClause__ColumnAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SetClause__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5482:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5483:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5483:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5484:3: ( RULE_ID )
            {
             before(grammarAccess.getSetClauseAccess().getColumnCDCrossReference_0_0()); 
            // InternalSql_dsl.g:5485:3: ( RULE_ID )
            // InternalSql_dsl.g:5486:4: RULE_ID
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
    // InternalSql_dsl.g:5497:1: rule__SetClause__NameAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__SetClause__NameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5501:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5502:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5502:2: ( RULE_ID )
            // InternalSql_dsl.g:5503:3: RULE_ID
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
    // InternalSql_dsl.g:5512:1: rule__SetClause__ValAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SetClause__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5516:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:5517:2: ( RULE_INT )
            {
            // InternalSql_dsl.g:5517:2: ( RULE_INT )
            // InternalSql_dsl.g:5518:3: RULE_INT
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
    // InternalSql_dsl.g:5527:1: rule__AlterTableStatement__TableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AlterTableStatement__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5531:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5532:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5532:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5533:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterTableStatementAccess().getTableTableNameCrossReference_2_0()); 
            // InternalSql_dsl.g:5534:3: ( RULE_ID )
            // InternalSql_dsl.g:5535:4: RULE_ID
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
    // InternalSql_dsl.g:5546:1: rule__AlterTableStatement__AddDropUpdateAssignment_3 : ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) ) ;
    public final void rule__AlterTableStatement__AddDropUpdateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5550:1: ( ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) ) )
            // InternalSql_dsl.g:5551:2: ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) )
            {
            // InternalSql_dsl.g:5551:2: ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) )
            // InternalSql_dsl.g:5552:3: ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlternatives_3_0()); 
            // InternalSql_dsl.g:5553:3: ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 )
            // InternalSql_dsl.g:5553:4: rule__AlterTableStatement__AddDropUpdateAlternatives_3_0
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
    // InternalSql_dsl.g:5561:1: rule__AlterDropStatement__ColumnAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AlterDropStatement__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5565:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5566:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5566:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5567:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterDropStatementAccess().getColumnCDCrossReference_2_0()); 
            // InternalSql_dsl.g:5568:3: ( RULE_ID )
            // InternalSql_dsl.g:5569:4: RULE_ID
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
    // InternalSql_dsl.g:5580:1: rule__AlterAddStatement__ColumnAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AlterAddStatement__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5584:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5585:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5585:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5586:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnCDCrossReference_1_0()); 
            // InternalSql_dsl.g:5587:3: ( RULE_ID )
            // InternalSql_dsl.g:5588:4: RULE_ID
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
    // InternalSql_dsl.g:5599:1: rule__AlterUpdateStatement__ColumnAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AlterUpdateStatement__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5603:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5604:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5604:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5605:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getColumnCDCrossReference_2_0()); 
            // InternalSql_dsl.g:5606:3: ( RULE_ID )
            // InternalSql_dsl.g:5607:4: RULE_ID
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
    // InternalSql_dsl.g:5618:1: rule__VariableDeclarationStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclarationStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5622:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5623:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:5623:2: ( RULE_ID )
            // InternalSql_dsl.g:5624:3: RULE_ID
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
    // InternalSql_dsl.g:5633:1: rule__VariableDeclarationStatement__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclarationStatement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5637:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:5638:2: ( RULE_INT )
            {
            // InternalSql_dsl.g:5638:2: ( RULE_INT )
            // InternalSql_dsl.g:5639:3: RULE_INT
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
    // InternalSql_dsl.g:5648:1: rule__CountFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CountFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5652:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5653:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5653:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5654:3: ( RULE_ID )
            {
             before(grammarAccess.getCountFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5655:3: ( RULE_ID )
            // InternalSql_dsl.g:5656:4: RULE_ID
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
    // InternalSql_dsl.g:5667:1: rule__CountFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__CountFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5671:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:5672:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:5672:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:5673:3: ruleFromAndWhereClauses
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
    // InternalSql_dsl.g:5682:1: rule__AvgFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AvgFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5686:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5687:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5687:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5688:3: ( RULE_ID )
            {
             before(grammarAccess.getAvgFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5689:3: ( RULE_ID )
            // InternalSql_dsl.g:5690:4: RULE_ID
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
    // InternalSql_dsl.g:5701:1: rule__AvgFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__AvgFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5705:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:5706:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:5706:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:5707:3: ruleFromAndWhereClauses
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
    // InternalSql_dsl.g:5716:1: rule__SumFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SumFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5720:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5721:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5721:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5722:3: ( RULE_ID )
            {
             before(grammarAccess.getSumFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5723:3: ( RULE_ID )
            // InternalSql_dsl.g:5724:4: RULE_ID
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
    // InternalSql_dsl.g:5735:1: rule__SumFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__SumFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5739:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:5740:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:5740:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:5741:3: ruleFromAndWhereClauses
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
    // InternalSql_dsl.g:5750:1: rule__MinFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MinFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5754:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5755:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5755:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5756:3: ( RULE_ID )
            {
             before(grammarAccess.getMinFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5757:3: ( RULE_ID )
            // InternalSql_dsl.g:5758:4: RULE_ID
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
    // InternalSql_dsl.g:5769:1: rule__MinFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__MinFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5773:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:5774:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:5774:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:5775:3: ruleFromAndWhereClauses
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
    // InternalSql_dsl.g:5784:1: rule__MaxFunction__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MaxFunction__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5788:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:5789:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:5789:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:5790:3: ( RULE_ID )
            {
             before(grammarAccess.getMaxFunctionAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:5791:3: ( RULE_ID )
            // InternalSql_dsl.g:5792:4: RULE_ID
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
    // InternalSql_dsl.g:5803:1: rule__MaxFunction__XAssignment_5 : ( ruleFromAndWhereClauses ) ;
    public final void rule__MaxFunction__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:5807:1: ( ( ruleFromAndWhereClauses ) )
            // InternalSql_dsl.g:5808:2: ( ruleFromAndWhereClauses )
            {
            // InternalSql_dsl.g:5808:2: ( ruleFromAndWhereClauses )
            // InternalSql_dsl.g:5809:3: ruleFromAndWhereClauses
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
            return "()* loopback of 225:4: ( rule__CreateTableStatement__TablesAssignment )*";
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\34\1\42\4\uffff\1\5\6\uffff";
    static final String dfa_10s = "\1\62\1\43\4\uffff\1\70\6\uffff";
    static final String dfa_11s = "\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\1\1\2\1\7\1\12";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\4\uffff\1\1\10\uffff\1\2\1\3\1\7\1\10\1\uffff\1\4\2\uffff\1\5",
            "\1\11\1\12",
            "",
            "",
            "",
            "",
            "\1\13\5\uffff\1\13\22\uffff\1\13\25\uffff\5\14",
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
            return "808:1: rule__Statement__Alternatives : ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) | ( ruleVariableDeclarationStatement ) | ( ruleSelectStatement ) | ( ruleDeleteTableStatement ) | ( ruleUpdateTableStatement ) | ( ruleFunctions ) );";
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