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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'varchar'", "'char'", "'date'", "'int'", "'float'", "'time'", "'text'", "'SELECT'", "'FROM'", "'CREATE'", "'DATABASE'", "'TABLE'", "'('", "')'", "','", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'DROP'", "'TRUNCATE'", "'ALTER'", "'COLUMN'", "'ADD'", "'var'", "'='", "'.'", "'NOT NULL'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalSql_dsl.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:66:2: ( ( ( rule__Model__StatementsAssignment ) ) )
            // InternalSql_dsl.g:67:2: ( ( rule__Model__StatementsAssignment ) )
            {
            // InternalSql_dsl.g:67:2: ( ( rule__Model__StatementsAssignment ) )
            // InternalSql_dsl.g:68:3: ( rule__Model__StatementsAssignment )
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalSql_dsl.g:69:3: ( rule__Model__StatementsAssignment )
            // InternalSql_dsl.g:69:4: rule__Model__StatementsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__StatementsAssignment();

            state._fsp--;


            }

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


    // $ANTLR start "entryRuleDatabaseDeclarationStatement"
    // InternalSql_dsl.g:128:1: entryRuleDatabaseDeclarationStatement : ruleDatabaseDeclarationStatement EOF ;
    public final void entryRuleDatabaseDeclarationStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:129:1: ( ruleDatabaseDeclarationStatement EOF )
            // InternalSql_dsl.g:130:1: ruleDatabaseDeclarationStatement EOF
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
    // InternalSql_dsl.g:137:1: ruleDatabaseDeclarationStatement : ( ( rule__DatabaseDeclarationStatement__Group__0 ) ) ;
    public final void ruleDatabaseDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:141:2: ( ( ( rule__DatabaseDeclarationStatement__Group__0 ) ) )
            // InternalSql_dsl.g:142:2: ( ( rule__DatabaseDeclarationStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:142:2: ( ( rule__DatabaseDeclarationStatement__Group__0 ) )
            // InternalSql_dsl.g:143:3: ( rule__DatabaseDeclarationStatement__Group__0 )
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getGroup()); 
            // InternalSql_dsl.g:144:3: ( rule__DatabaseDeclarationStatement__Group__0 )
            // InternalSql_dsl.g:144:4: rule__DatabaseDeclarationStatement__Group__0
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
    // InternalSql_dsl.g:153:1: entryRuleCreateTableStatement : ruleCreateTableStatement EOF ;
    public final void entryRuleCreateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:154:1: ( ruleCreateTableStatement EOF )
            // InternalSql_dsl.g:155:1: ruleCreateTableStatement EOF
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
    // InternalSql_dsl.g:162:1: ruleCreateTableStatement : ( ( rule__CreateTableStatement__TablesAssignment )* ) ;
    public final void ruleCreateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:166:2: ( ( ( rule__CreateTableStatement__TablesAssignment )* ) )
            // InternalSql_dsl.g:167:2: ( ( rule__CreateTableStatement__TablesAssignment )* )
            {
            // InternalSql_dsl.g:167:2: ( ( rule__CreateTableStatement__TablesAssignment )* )
            // InternalSql_dsl.g:168:3: ( rule__CreateTableStatement__TablesAssignment )*
            {
             before(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:169:3: ( rule__CreateTableStatement__TablesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSql_dsl.g:169:4: rule__CreateTableStatement__TablesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__CreateTableStatement__TablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 

            }


            }

        }
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
    // InternalSql_dsl.g:178:1: entryRuleTableDeclaration : ruleTableDeclaration EOF ;
    public final void entryRuleTableDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:179:1: ( ruleTableDeclaration EOF )
            // InternalSql_dsl.g:180:1: ruleTableDeclaration EOF
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
    // InternalSql_dsl.g:187:1: ruleTableDeclaration : ( ( rule__TableDeclaration__Group__0 ) ) ;
    public final void ruleTableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:191:2: ( ( ( rule__TableDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:192:2: ( ( rule__TableDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:192:2: ( ( rule__TableDeclaration__Group__0 ) )
            // InternalSql_dsl.g:193:3: ( rule__TableDeclaration__Group__0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:194:3: ( rule__TableDeclaration__Group__0 )
            // InternalSql_dsl.g:194:4: rule__TableDeclaration__Group__0
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


    // $ANTLR start "entryRuleColumnDeclaration"
    // InternalSql_dsl.g:203:1: entryRuleColumnDeclaration : ruleColumnDeclaration EOF ;
    public final void entryRuleColumnDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:204:1: ( ruleColumnDeclaration EOF )
            // InternalSql_dsl.g:205:1: ruleColumnDeclaration EOF
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
    // InternalSql_dsl.g:212:1: ruleColumnDeclaration : ( ( rule__ColumnDeclaration__Group__0 ) ) ;
    public final void ruleColumnDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:216:2: ( ( ( rule__ColumnDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:217:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:217:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            // InternalSql_dsl.g:218:3: ( rule__ColumnDeclaration__Group__0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:219:3: ( rule__ColumnDeclaration__Group__0 )
            // InternalSql_dsl.g:219:4: rule__ColumnDeclaration__Group__0
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
    // InternalSql_dsl.g:228:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalSql_dsl.g:229:1: ( rulePrimaryKey EOF )
            // InternalSql_dsl.g:230:1: rulePrimaryKey EOF
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
    // InternalSql_dsl.g:237:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:241:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalSql_dsl.g:242:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalSql_dsl.g:242:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalSql_dsl.g:243:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalSql_dsl.g:244:3: ( rule__PrimaryKey__Group__0 )
            // InternalSql_dsl.g:244:4: rule__PrimaryKey__Group__0
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
    // InternalSql_dsl.g:253:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalSql_dsl.g:254:1: ( ruleForeignKey EOF )
            // InternalSql_dsl.g:255:1: ruleForeignKey EOF
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
    // InternalSql_dsl.g:262:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:266:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalSql_dsl.g:267:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalSql_dsl.g:267:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalSql_dsl.g:268:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalSql_dsl.g:269:3: ( rule__ForeignKey__Group__0 )
            // InternalSql_dsl.g:269:4: rule__ForeignKey__Group__0
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
    // InternalSql_dsl.g:278:1: entryRuleDropTableStatement : ruleDropTableStatement EOF ;
    public final void entryRuleDropTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:279:1: ( ruleDropTableStatement EOF )
            // InternalSql_dsl.g:280:1: ruleDropTableStatement EOF
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
    // InternalSql_dsl.g:287:1: ruleDropTableStatement : ( ( rule__DropTableStatement__TablesAssignment )* ) ;
    public final void ruleDropTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:291:2: ( ( ( rule__DropTableStatement__TablesAssignment )* ) )
            // InternalSql_dsl.g:292:2: ( ( rule__DropTableStatement__TablesAssignment )* )
            {
            // InternalSql_dsl.g:292:2: ( ( rule__DropTableStatement__TablesAssignment )* )
            // InternalSql_dsl.g:293:3: ( rule__DropTableStatement__TablesAssignment )*
            {
             before(grammarAccess.getDropTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:294:3: ( rule__DropTableStatement__TablesAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSql_dsl.g:294:4: rule__DropTableStatement__TablesAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DropTableStatement__TablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDropTableStatementAccess().getTablesAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDropTableDeclaration"
    // InternalSql_dsl.g:303:1: entryRuleDropTableDeclaration : ruleDropTableDeclaration EOF ;
    public final void entryRuleDropTableDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:304:1: ( ruleDropTableDeclaration EOF )
            // InternalSql_dsl.g:305:1: ruleDropTableDeclaration EOF
            {
             before(grammarAccess.getDropTableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDropTableDeclaration();

            state._fsp--;

             after(grammarAccess.getDropTableDeclarationRule()); 
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
    // $ANTLR end "entryRuleDropTableDeclaration"


    // $ANTLR start "ruleDropTableDeclaration"
    // InternalSql_dsl.g:312:1: ruleDropTableDeclaration : ( ( rule__DropTableDeclaration__Group__0 ) ) ;
    public final void ruleDropTableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:316:2: ( ( ( rule__DropTableDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:317:2: ( ( rule__DropTableDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:317:2: ( ( rule__DropTableDeclaration__Group__0 ) )
            // InternalSql_dsl.g:318:3: ( rule__DropTableDeclaration__Group__0 )
            {
             before(grammarAccess.getDropTableDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:319:3: ( rule__DropTableDeclaration__Group__0 )
            // InternalSql_dsl.g:319:4: rule__DropTableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DropTableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropTableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDropTableDeclaration"


    // $ANTLR start "entryRuleTruncateTableStatement"
    // InternalSql_dsl.g:328:1: entryRuleTruncateTableStatement : ruleTruncateTableStatement EOF ;
    public final void entryRuleTruncateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:329:1: ( ruleTruncateTableStatement EOF )
            // InternalSql_dsl.g:330:1: ruleTruncateTableStatement EOF
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
    // InternalSql_dsl.g:337:1: ruleTruncateTableStatement : ( ( rule__TruncateTableStatement__TablesAssignment )* ) ;
    public final void ruleTruncateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:341:2: ( ( ( rule__TruncateTableStatement__TablesAssignment )* ) )
            // InternalSql_dsl.g:342:2: ( ( rule__TruncateTableStatement__TablesAssignment )* )
            {
            // InternalSql_dsl.g:342:2: ( ( rule__TruncateTableStatement__TablesAssignment )* )
            // InternalSql_dsl.g:343:3: ( rule__TruncateTableStatement__TablesAssignment )*
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:344:3: ( rule__TruncateTableStatement__TablesAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSql_dsl.g:344:4: rule__TruncateTableStatement__TablesAssignment
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__TruncateTableStatement__TablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTruncateTableStatementAccess().getTablesAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTruncateTableDeclaration"
    // InternalSql_dsl.g:353:1: entryRuleTruncateTableDeclaration : ruleTruncateTableDeclaration EOF ;
    public final void entryRuleTruncateTableDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:354:1: ( ruleTruncateTableDeclaration EOF )
            // InternalSql_dsl.g:355:1: ruleTruncateTableDeclaration EOF
            {
             before(grammarAccess.getTruncateTableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleTruncateTableDeclaration();

            state._fsp--;

             after(grammarAccess.getTruncateTableDeclarationRule()); 
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
    // $ANTLR end "entryRuleTruncateTableDeclaration"


    // $ANTLR start "ruleTruncateTableDeclaration"
    // InternalSql_dsl.g:362:1: ruleTruncateTableDeclaration : ( ( rule__TruncateTableDeclaration__Group__0 ) ) ;
    public final void ruleTruncateTableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:366:2: ( ( ( rule__TruncateTableDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:367:2: ( ( rule__TruncateTableDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:367:2: ( ( rule__TruncateTableDeclaration__Group__0 ) )
            // InternalSql_dsl.g:368:3: ( rule__TruncateTableDeclaration__Group__0 )
            {
             before(grammarAccess.getTruncateTableDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:369:3: ( rule__TruncateTableDeclaration__Group__0 )
            // InternalSql_dsl.g:369:4: rule__TruncateTableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TruncateTableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTruncateTableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTruncateTableDeclaration"


    // $ANTLR start "entryRuleAlterTableStatement"
    // InternalSql_dsl.g:378:1: entryRuleAlterTableStatement : ruleAlterTableStatement EOF ;
    public final void entryRuleAlterTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:379:1: ( ruleAlterTableStatement EOF )
            // InternalSql_dsl.g:380:1: ruleAlterTableStatement EOF
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
    // InternalSql_dsl.g:387:1: ruleAlterTableStatement : ( ( rule__AlterTableStatement__Group__0 ) ) ;
    public final void ruleAlterTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:391:2: ( ( ( rule__AlterTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:392:2: ( ( rule__AlterTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:392:2: ( ( rule__AlterTableStatement__Group__0 ) )
            // InternalSql_dsl.g:393:3: ( rule__AlterTableStatement__Group__0 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:394:3: ( rule__AlterTableStatement__Group__0 )
            // InternalSql_dsl.g:394:4: rule__AlterTableStatement__Group__0
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
    // InternalSql_dsl.g:403:1: entryRuleAlterDropStatement : ruleAlterDropStatement EOF ;
    public final void entryRuleAlterDropStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:404:1: ( ruleAlterDropStatement EOF )
            // InternalSql_dsl.g:405:1: ruleAlterDropStatement EOF
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
    // InternalSql_dsl.g:412:1: ruleAlterDropStatement : ( ( rule__AlterDropStatement__Group__0 ) ) ;
    public final void ruleAlterDropStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:416:2: ( ( ( rule__AlterDropStatement__Group__0 ) ) )
            // InternalSql_dsl.g:417:2: ( ( rule__AlterDropStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:417:2: ( ( rule__AlterDropStatement__Group__0 ) )
            // InternalSql_dsl.g:418:3: ( rule__AlterDropStatement__Group__0 )
            {
             before(grammarAccess.getAlterDropStatementAccess().getGroup()); 
            // InternalSql_dsl.g:419:3: ( rule__AlterDropStatement__Group__0 )
            // InternalSql_dsl.g:419:4: rule__AlterDropStatement__Group__0
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
    // InternalSql_dsl.g:428:1: entryRuleAlterAddStatement : ruleAlterAddStatement EOF ;
    public final void entryRuleAlterAddStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:429:1: ( ruleAlterAddStatement EOF )
            // InternalSql_dsl.g:430:1: ruleAlterAddStatement EOF
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
    // InternalSql_dsl.g:437:1: ruleAlterAddStatement : ( ( rule__AlterAddStatement__Group__0 ) ) ;
    public final void ruleAlterAddStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:441:2: ( ( ( rule__AlterAddStatement__Group__0 ) ) )
            // InternalSql_dsl.g:442:2: ( ( rule__AlterAddStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:442:2: ( ( rule__AlterAddStatement__Group__0 ) )
            // InternalSql_dsl.g:443:3: ( rule__AlterAddStatement__Group__0 )
            {
             before(grammarAccess.getAlterAddStatementAccess().getGroup()); 
            // InternalSql_dsl.g:444:3: ( rule__AlterAddStatement__Group__0 )
            // InternalSql_dsl.g:444:4: rule__AlterAddStatement__Group__0
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
    // InternalSql_dsl.g:453:1: entryRuleAlterUpdateStatement : ruleAlterUpdateStatement EOF ;
    public final void entryRuleAlterUpdateStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:454:1: ( ruleAlterUpdateStatement EOF )
            // InternalSql_dsl.g:455:1: ruleAlterUpdateStatement EOF
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
    // InternalSql_dsl.g:462:1: ruleAlterUpdateStatement : ( ( rule__AlterUpdateStatement__Group__0 ) ) ;
    public final void ruleAlterUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:466:2: ( ( ( rule__AlterUpdateStatement__Group__0 ) ) )
            // InternalSql_dsl.g:467:2: ( ( rule__AlterUpdateStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:467:2: ( ( rule__AlterUpdateStatement__Group__0 ) )
            // InternalSql_dsl.g:468:3: ( rule__AlterUpdateStatement__Group__0 )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getGroup()); 
            // InternalSql_dsl.g:469:3: ( rule__AlterUpdateStatement__Group__0 )
            // InternalSql_dsl.g:469:4: rule__AlterUpdateStatement__Group__0
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
    // InternalSql_dsl.g:478:1: entryRuleVariableDeclarationStatement : ruleVariableDeclarationStatement EOF ;
    public final void entryRuleVariableDeclarationStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:479:1: ( ruleVariableDeclarationStatement EOF )
            // InternalSql_dsl.g:480:1: ruleVariableDeclarationStatement EOF
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
    // InternalSql_dsl.g:487:1: ruleVariableDeclarationStatement : ( ( rule__VariableDeclarationStatement__Group__0 ) ) ;
    public final void ruleVariableDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:491:2: ( ( ( rule__VariableDeclarationStatement__Group__0 ) ) )
            // InternalSql_dsl.g:492:2: ( ( rule__VariableDeclarationStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:492:2: ( ( rule__VariableDeclarationStatement__Group__0 ) )
            // InternalSql_dsl.g:493:3: ( rule__VariableDeclarationStatement__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getGroup()); 
            // InternalSql_dsl.g:494:3: ( rule__VariableDeclarationStatement__Group__0 )
            // InternalSql_dsl.g:494:4: rule__VariableDeclarationStatement__Group__0
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
    // InternalSql_dsl.g:503:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql_dsl.g:507:1: ( ruleREAL EOF )
            // InternalSql_dsl.g:508:1: ruleREAL EOF
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
    // InternalSql_dsl.g:518:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:523:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalSql_dsl.g:524:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalSql_dsl.g:524:2: ( ( rule__REAL__Group__0 ) )
            // InternalSql_dsl.g:525:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalSql_dsl.g:526:3: ( rule__REAL__Group__0 )
            // InternalSql_dsl.g:526:4: rule__REAL__Group__0
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


    // $ANTLR start "ruleDataStructureType"
    // InternalSql_dsl.g:536:1: ruleDataStructureType : ( ( rule__DataStructureType__Alternatives ) ) ;
    public final void ruleDataStructureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:540:1: ( ( ( rule__DataStructureType__Alternatives ) ) )
            // InternalSql_dsl.g:541:2: ( ( rule__DataStructureType__Alternatives ) )
            {
            // InternalSql_dsl.g:541:2: ( ( rule__DataStructureType__Alternatives ) )
            // InternalSql_dsl.g:542:3: ( rule__DataStructureType__Alternatives )
            {
             before(grammarAccess.getDataStructureTypeAccess().getAlternatives()); 
            // InternalSql_dsl.g:543:3: ( rule__DataStructureType__Alternatives )
            // InternalSql_dsl.g:543:4: rule__DataStructureType__Alternatives
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
    // InternalSql_dsl.g:551:1: rule__Statement__Alternatives : ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) | ( ruleVariableDeclarationStatement ) | ( ruleSelectStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:555:1: ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) | ( ruleVariableDeclarationStatement ) | ( ruleSelectStatement ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==21) ) {
                    alt4=1;
                }
                else if ( (LA4_1==22) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 35:
                {
                alt4=6;
                }
                break;
            case 18:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSql_dsl.g:556:2: ( ruleDatabaseDeclarationStatement )
                    {
                    // InternalSql_dsl.g:556:2: ( ruleDatabaseDeclarationStatement )
                    // InternalSql_dsl.g:557:3: ruleDatabaseDeclarationStatement
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
                    // InternalSql_dsl.g:562:2: ( ruleCreateTableStatement )
                    {
                    // InternalSql_dsl.g:562:2: ( ruleCreateTableStatement )
                    // InternalSql_dsl.g:563:3: ruleCreateTableStatement
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
                    // InternalSql_dsl.g:568:2: ( ruleDropTableStatement )
                    {
                    // InternalSql_dsl.g:568:2: ( ruleDropTableStatement )
                    // InternalSql_dsl.g:569:3: ruleDropTableStatement
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
                    // InternalSql_dsl.g:574:2: ( ruleTruncateTableStatement )
                    {
                    // InternalSql_dsl.g:574:2: ( ruleTruncateTableStatement )
                    // InternalSql_dsl.g:575:3: ruleTruncateTableStatement
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
                    // InternalSql_dsl.g:580:2: ( ruleAlterTableStatement )
                    {
                    // InternalSql_dsl.g:580:2: ( ruleAlterTableStatement )
                    // InternalSql_dsl.g:581:3: ruleAlterTableStatement
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
                    // InternalSql_dsl.g:586:2: ( ruleVariableDeclarationStatement )
                    {
                    // InternalSql_dsl.g:586:2: ( ruleVariableDeclarationStatement )
                    // InternalSql_dsl.g:587:3: ruleVariableDeclarationStatement
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
                    // InternalSql_dsl.g:592:2: ( ruleSelectStatement )
                    {
                    // InternalSql_dsl.g:592:2: ( ruleSelectStatement )
                    // InternalSql_dsl.g:593:3: ruleSelectStatement
                    {
                     before(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_6()); 

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


    // $ANTLR start "rule__TableDeclaration__AttributesAlternatives_4_0"
    // InternalSql_dsl.g:602:1: rule__TableDeclaration__AttributesAlternatives_4_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TableDeclaration__AttributesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:606:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 28:
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
                    // InternalSql_dsl.g:607:2: ( ruleColumnDeclaration )
                    {
                    // InternalSql_dsl.g:607:2: ( ruleColumnDeclaration )
                    // InternalSql_dsl.g:608:3: ruleColumnDeclaration
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
                    // InternalSql_dsl.g:613:2: ( rulePrimaryKey )
                    {
                    // InternalSql_dsl.g:613:2: ( rulePrimaryKey )
                    // InternalSql_dsl.g:614:3: rulePrimaryKey
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
                    // InternalSql_dsl.g:619:2: ( ruleForeignKey )
                    {
                    // InternalSql_dsl.g:619:2: ( ruleForeignKey )
                    // InternalSql_dsl.g:620:3: ruleForeignKey
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
    // InternalSql_dsl.g:629:1: rule__TableDeclaration__AttributesAlternatives_5_1_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TableDeclaration__AttributesAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:633:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSql_dsl.g:634:2: ( ruleColumnDeclaration )
                    {
                    // InternalSql_dsl.g:634:2: ( ruleColumnDeclaration )
                    // InternalSql_dsl.g:635:3: ruleColumnDeclaration
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
                    // InternalSql_dsl.g:640:2: ( rulePrimaryKey )
                    {
                    // InternalSql_dsl.g:640:2: ( rulePrimaryKey )
                    // InternalSql_dsl.g:641:3: rulePrimaryKey
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
                    // InternalSql_dsl.g:646:2: ( ruleForeignKey )
                    {
                    // InternalSql_dsl.g:646:2: ( ruleForeignKey )
                    // InternalSql_dsl.g:647:3: ruleForeignKey
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


    // $ANTLR start "rule__AlterTableStatement__AddDropUpdateAlternatives_3_0"
    // InternalSql_dsl.g:656:1: rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 : ( ( ruleAlterDropStatement ) | ( ruleAlterAddStatement ) | ( ruleAlterUpdateStatement ) );
    public final void rule__AlterTableStatement__AddDropUpdateAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:660:1: ( ( ruleAlterDropStatement ) | ( ruleAlterAddStatement ) | ( ruleAlterUpdateStatement ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSql_dsl.g:661:2: ( ruleAlterDropStatement )
                    {
                    // InternalSql_dsl.g:661:2: ( ruleAlterDropStatement )
                    // InternalSql_dsl.g:662:3: ruleAlterDropStatement
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
                    // InternalSql_dsl.g:667:2: ( ruleAlterAddStatement )
                    {
                    // InternalSql_dsl.g:667:2: ( ruleAlterAddStatement )
                    // InternalSql_dsl.g:668:3: ruleAlterAddStatement
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
                    // InternalSql_dsl.g:673:2: ( ruleAlterUpdateStatement )
                    {
                    // InternalSql_dsl.g:673:2: ( ruleAlterUpdateStatement )
                    // InternalSql_dsl.g:674:3: ruleAlterUpdateStatement
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


    // $ANTLR start "rule__DataStructureType__Alternatives"
    // InternalSql_dsl.g:683:1: rule__DataStructureType__Alternatives : ( ( ( 'varchar' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) );
    public final void rule__DataStructureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:687:1: ( ( ( 'varchar' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            case 16:
                {
                alt8=6;
                }
                break;
            case 17:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSql_dsl.g:688:2: ( ( 'varchar' ) )
                    {
                    // InternalSql_dsl.g:688:2: ( ( 'varchar' ) )
                    // InternalSql_dsl.g:689:3: ( 'varchar' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 
                    // InternalSql_dsl.g:690:3: ( 'varchar' )
                    // InternalSql_dsl.g:690:4: 'varchar'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:694:2: ( ( 'char' ) )
                    {
                    // InternalSql_dsl.g:694:2: ( ( 'char' ) )
                    // InternalSql_dsl.g:695:3: ( 'char' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // InternalSql_dsl.g:696:3: ( 'char' )
                    // InternalSql_dsl.g:696:4: 'char'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:700:2: ( ( 'date' ) )
                    {
                    // InternalSql_dsl.g:700:2: ( ( 'date' ) )
                    // InternalSql_dsl.g:701:3: ( 'date' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2()); 
                    // InternalSql_dsl.g:702:3: ( 'date' )
                    // InternalSql_dsl.g:702:4: 'date'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:706:2: ( ( 'int' ) )
                    {
                    // InternalSql_dsl.g:706:2: ( ( 'int' ) )
                    // InternalSql_dsl.g:707:3: ( 'int' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    // InternalSql_dsl.g:708:3: ( 'int' )
                    // InternalSql_dsl.g:708:4: 'int'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:712:2: ( ( 'float' ) )
                    {
                    // InternalSql_dsl.g:712:2: ( ( 'float' ) )
                    // InternalSql_dsl.g:713:3: ( 'float' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // InternalSql_dsl.g:714:3: ( 'float' )
                    // InternalSql_dsl.g:714:4: 'float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:718:2: ( ( 'time' ) )
                    {
                    // InternalSql_dsl.g:718:2: ( ( 'time' ) )
                    // InternalSql_dsl.g:719:3: ( 'time' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5()); 
                    // InternalSql_dsl.g:720:3: ( 'time' )
                    // InternalSql_dsl.g:720:4: 'time'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:724:2: ( ( 'text' ) )
                    {
                    // InternalSql_dsl.g:724:2: ( ( 'text' ) )
                    // InternalSql_dsl.g:725:3: ( 'text' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getTEXTEnumLiteralDeclaration_6()); 
                    // InternalSql_dsl.g:726:3: ( 'text' )
                    // InternalSql_dsl.g:726:4: 'text'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalSql_dsl.g:734:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:738:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalSql_dsl.g:739:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
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
    // InternalSql_dsl.g:746:1: rule__SelectStatement__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:750:1: ( ( 'SELECT' ) )
            // InternalSql_dsl.g:751:1: ( 'SELECT' )
            {
            // InternalSql_dsl.g:751:1: ( 'SELECT' )
            // InternalSql_dsl.g:752:2: 'SELECT'
            {
             before(grammarAccess.getSelectStatementAccess().getSELECTKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSql_dsl.g:761:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:765:1: ( rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 )
            // InternalSql_dsl.g:766:2: rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2
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
    // InternalSql_dsl.g:773:1: rule__SelectStatement__Group__1__Impl : ( ( rule__SelectStatement__NameAssignment_1 ) ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:777:1: ( ( ( rule__SelectStatement__NameAssignment_1 ) ) )
            // InternalSql_dsl.g:778:1: ( ( rule__SelectStatement__NameAssignment_1 ) )
            {
            // InternalSql_dsl.g:778:1: ( ( rule__SelectStatement__NameAssignment_1 ) )
            // InternalSql_dsl.g:779:2: ( rule__SelectStatement__NameAssignment_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getNameAssignment_1()); 
            // InternalSql_dsl.g:780:2: ( rule__SelectStatement__NameAssignment_1 )
            // InternalSql_dsl.g:780:3: rule__SelectStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalSql_dsl.g:788:1: rule__SelectStatement__Group__2 : rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 ;
    public final void rule__SelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:792:1: ( rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 )
            // InternalSql_dsl.g:793:2: rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SelectStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSql_dsl.g:800:1: rule__SelectStatement__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__SelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:804:1: ( ( 'FROM' ) )
            // InternalSql_dsl.g:805:1: ( 'FROM' )
            {
            // InternalSql_dsl.g:805:1: ( 'FROM' )
            // InternalSql_dsl.g:806:2: 'FROM'
            {
             before(grammarAccess.getSelectStatementAccess().getFROMKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getFROMKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SelectStatement__Group__3"
    // InternalSql_dsl.g:815:1: rule__SelectStatement__Group__3 : rule__SelectStatement__Group__3__Impl ;
    public final void rule__SelectStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:819:1: ( rule__SelectStatement__Group__3__Impl )
            // InternalSql_dsl.g:820:2: rule__SelectStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__3"


    // $ANTLR start "rule__SelectStatement__Group__3__Impl"
    // InternalSql_dsl.g:826:1: rule__SelectStatement__Group__3__Impl : ( ( rule__SelectStatement__ColumnAssignment_3 ) ) ;
    public final void rule__SelectStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:830:1: ( ( ( rule__SelectStatement__ColumnAssignment_3 ) ) )
            // InternalSql_dsl.g:831:1: ( ( rule__SelectStatement__ColumnAssignment_3 ) )
            {
            // InternalSql_dsl.g:831:1: ( ( rule__SelectStatement__ColumnAssignment_3 ) )
            // InternalSql_dsl.g:832:2: ( rule__SelectStatement__ColumnAssignment_3 )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnAssignment_3()); 
            // InternalSql_dsl.g:833:2: ( rule__SelectStatement__ColumnAssignment_3 )
            // InternalSql_dsl.g:833:3: rule__SelectStatement__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__3__Impl"


    // $ANTLR start "rule__DatabaseDeclarationStatement__Group__0"
    // InternalSql_dsl.g:842:1: rule__DatabaseDeclarationStatement__Group__0 : rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1 ;
    public final void rule__DatabaseDeclarationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:846:1: ( rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1 )
            // InternalSql_dsl.g:847:2: rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSql_dsl.g:854:1: rule__DatabaseDeclarationStatement__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__DatabaseDeclarationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:858:1: ( ( 'CREATE' ) )
            // InternalSql_dsl.g:859:1: ( 'CREATE' )
            {
            // InternalSql_dsl.g:859:1: ( 'CREATE' )
            // InternalSql_dsl.g:860:2: 'CREATE'
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getCREATEKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSql_dsl.g:869:1: rule__DatabaseDeclarationStatement__Group__1 : rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2 ;
    public final void rule__DatabaseDeclarationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:873:1: ( rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2 )
            // InternalSql_dsl.g:874:2: rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:881:1: rule__DatabaseDeclarationStatement__Group__1__Impl : ( 'DATABASE' ) ;
    public final void rule__DatabaseDeclarationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:885:1: ( ( 'DATABASE' ) )
            // InternalSql_dsl.g:886:1: ( 'DATABASE' )
            {
            // InternalSql_dsl.g:886:1: ( 'DATABASE' )
            // InternalSql_dsl.g:887:2: 'DATABASE'
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getDATABASEKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSql_dsl.g:896:1: rule__DatabaseDeclarationStatement__Group__2 : rule__DatabaseDeclarationStatement__Group__2__Impl ;
    public final void rule__DatabaseDeclarationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:900:1: ( rule__DatabaseDeclarationStatement__Group__2__Impl )
            // InternalSql_dsl.g:901:2: rule__DatabaseDeclarationStatement__Group__2__Impl
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
    // InternalSql_dsl.g:907:1: rule__DatabaseDeclarationStatement__Group__2__Impl : ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) ) ;
    public final void rule__DatabaseDeclarationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:911:1: ( ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:912:1: ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:912:1: ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:913:2: ( rule__DatabaseDeclarationStatement__NameAssignment_2 )
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:914:2: ( rule__DatabaseDeclarationStatement__NameAssignment_2 )
            // InternalSql_dsl.g:914:3: rule__DatabaseDeclarationStatement__NameAssignment_2
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
    // InternalSql_dsl.g:923:1: rule__TableDeclaration__Group__0 : rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 ;
    public final void rule__TableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:927:1: ( rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 )
            // InternalSql_dsl.g:928:2: rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSql_dsl.g:935:1: rule__TableDeclaration__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__TableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:939:1: ( ( 'CREATE' ) )
            // InternalSql_dsl.g:940:1: ( 'CREATE' )
            {
            // InternalSql_dsl.g:940:1: ( 'CREATE' )
            // InternalSql_dsl.g:941:2: 'CREATE'
            {
             before(grammarAccess.getTableDeclarationAccess().getCREATEKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSql_dsl.g:950:1: rule__TableDeclaration__Group__1 : rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2 ;
    public final void rule__TableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:954:1: ( rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2 )
            // InternalSql_dsl.g:955:2: rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:962:1: rule__TableDeclaration__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:966:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:967:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:967:1: ( 'TABLE' )
            // InternalSql_dsl.g:968:2: 'TABLE'
            {
             before(grammarAccess.getTableDeclarationAccess().getTABLEKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSql_dsl.g:977:1: rule__TableDeclaration__Group__2 : rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3 ;
    public final void rule__TableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:981:1: ( rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3 )
            // InternalSql_dsl.g:982:2: rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSql_dsl.g:989:1: rule__TableDeclaration__Group__2__Impl : ( ( rule__TableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__TableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:993:1: ( ( ( rule__TableDeclaration__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:994:1: ( ( rule__TableDeclaration__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:994:1: ( ( rule__TableDeclaration__NameAssignment_2 ) )
            // InternalSql_dsl.g:995:2: ( rule__TableDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getTableDeclarationAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:996:2: ( rule__TableDeclaration__NameAssignment_2 )
            // InternalSql_dsl.g:996:3: rule__TableDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSql_dsl.g:1004:1: rule__TableDeclaration__Group__3 : rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4 ;
    public final void rule__TableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1008:1: ( rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4 )
            // InternalSql_dsl.g:1009:2: rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:1016:1: rule__TableDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__TableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1020:1: ( ( '(' ) )
            // InternalSql_dsl.g:1021:1: ( '(' )
            {
            // InternalSql_dsl.g:1021:1: ( '(' )
            // InternalSql_dsl.g:1022:2: '('
            {
             before(grammarAccess.getTableDeclarationAccess().getLeftParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSql_dsl.g:1031:1: rule__TableDeclaration__Group__4 : rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5 ;
    public final void rule__TableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1035:1: ( rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5 )
            // InternalSql_dsl.g:1036:2: rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalSql_dsl.g:1043:1: rule__TableDeclaration__Group__4__Impl : ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) ) ;
    public final void rule__TableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1047:1: ( ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) ) )
            // InternalSql_dsl.g:1048:1: ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) )
            {
            // InternalSql_dsl.g:1048:1: ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) )
            // InternalSql_dsl.g:1049:2: ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* )
            {
            // InternalSql_dsl.g:1049:2: ( ( rule__TableDeclaration__AttributesAssignment_4 ) )
            // InternalSql_dsl.g:1050:3: ( rule__TableDeclaration__AttributesAssignment_4 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 
            // InternalSql_dsl.g:1051:3: ( rule__TableDeclaration__AttributesAssignment_4 )
            // InternalSql_dsl.g:1051:4: rule__TableDeclaration__AttributesAssignment_4
            {
            pushFollow(FOLLOW_13);
            rule__TableDeclaration__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 

            }

            // InternalSql_dsl.g:1054:2: ( ( rule__TableDeclaration__AttributesAssignment_4 )* )
            // InternalSql_dsl.g:1055:3: ( rule__TableDeclaration__AttributesAssignment_4 )*
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 
            // InternalSql_dsl.g:1056:3: ( rule__TableDeclaration__AttributesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==26||LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSql_dsl.g:1056:4: rule__TableDeclaration__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__TableDeclaration__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSql_dsl.g:1065:1: rule__TableDeclaration__Group__5 : rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6 ;
    public final void rule__TableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1069:1: ( rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6 )
            // InternalSql_dsl.g:1070:2: rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalSql_dsl.g:1077:1: rule__TableDeclaration__Group__5__Impl : ( ( rule__TableDeclaration__Group_5__0 )* ) ;
    public final void rule__TableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1081:1: ( ( ( rule__TableDeclaration__Group_5__0 )* ) )
            // InternalSql_dsl.g:1082:1: ( ( rule__TableDeclaration__Group_5__0 )* )
            {
            // InternalSql_dsl.g:1082:1: ( ( rule__TableDeclaration__Group_5__0 )* )
            // InternalSql_dsl.g:1083:2: ( rule__TableDeclaration__Group_5__0 )*
            {
             before(grammarAccess.getTableDeclarationAccess().getGroup_5()); 
            // InternalSql_dsl.g:1084:2: ( rule__TableDeclaration__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSql_dsl.g:1084:3: rule__TableDeclaration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TableDeclaration__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSql_dsl.g:1092:1: rule__TableDeclaration__Group__6 : rule__TableDeclaration__Group__6__Impl ;
    public final void rule__TableDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1096:1: ( rule__TableDeclaration__Group__6__Impl )
            // InternalSql_dsl.g:1097:2: rule__TableDeclaration__Group__6__Impl
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
    // InternalSql_dsl.g:1103:1: rule__TableDeclaration__Group__6__Impl : ( ')' ) ;
    public final void rule__TableDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1107:1: ( ( ')' ) )
            // InternalSql_dsl.g:1108:1: ( ')' )
            {
            // InternalSql_dsl.g:1108:1: ( ')' )
            // InternalSql_dsl.g:1109:2: ')'
            {
             before(grammarAccess.getTableDeclarationAccess().getRightParenthesisKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSql_dsl.g:1119:1: rule__TableDeclaration__Group_5__0 : rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1 ;
    public final void rule__TableDeclaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1123:1: ( rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1 )
            // InternalSql_dsl.g:1124:2: rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:1131:1: rule__TableDeclaration__Group_5__0__Impl : ( ',' ) ;
    public final void rule__TableDeclaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1135:1: ( ( ',' ) )
            // InternalSql_dsl.g:1136:1: ( ',' )
            {
            // InternalSql_dsl.g:1136:1: ( ',' )
            // InternalSql_dsl.g:1137:2: ','
            {
             before(grammarAccess.getTableDeclarationAccess().getCommaKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSql_dsl.g:1146:1: rule__TableDeclaration__Group_5__1 : rule__TableDeclaration__Group_5__1__Impl ;
    public final void rule__TableDeclaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1150:1: ( rule__TableDeclaration__Group_5__1__Impl )
            // InternalSql_dsl.g:1151:2: rule__TableDeclaration__Group_5__1__Impl
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
    // InternalSql_dsl.g:1157:1: rule__TableDeclaration__Group_5__1__Impl : ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) ) ;
    public final void rule__TableDeclaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1161:1: ( ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) ) )
            // InternalSql_dsl.g:1162:1: ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) )
            {
            // InternalSql_dsl.g:1162:1: ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) )
            // InternalSql_dsl.g:1163:2: ( rule__TableDeclaration__AttributesAssignment_5_1 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_5_1()); 
            // InternalSql_dsl.g:1164:2: ( rule__TableDeclaration__AttributesAssignment_5_1 )
            // InternalSql_dsl.g:1164:3: rule__TableDeclaration__AttributesAssignment_5_1
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
    // InternalSql_dsl.g:1173:1: rule__ColumnDeclaration__Group__0 : rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 ;
    public final void rule__ColumnDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1177:1: ( rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 )
            // InternalSql_dsl.g:1178:2: rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSql_dsl.g:1185:1: rule__ColumnDeclaration__Group__0__Impl : ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ColumnDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1189:1: ( ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) )
            // InternalSql_dsl.g:1190:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            {
            // InternalSql_dsl.g:1190:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            // InternalSql_dsl.g:1191:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getNameAssignment_0()); 
            // InternalSql_dsl.g:1192:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            // InternalSql_dsl.g:1192:3: rule__ColumnDeclaration__NameAssignment_0
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
    // InternalSql_dsl.g:1200:1: rule__ColumnDeclaration__Group__1 : rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 ;
    public final void rule__ColumnDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1204:1: ( rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 )
            // InternalSql_dsl.g:1205:2: rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSql_dsl.g:1212:1: rule__ColumnDeclaration__Group__1__Impl : ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__ColumnDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1216:1: ( ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) )
            // InternalSql_dsl.g:1217:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            {
            // InternalSql_dsl.g:1217:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            // InternalSql_dsl.g:1218:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getTypeAssignment_1()); 
            // InternalSql_dsl.g:1219:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            // InternalSql_dsl.g:1219:3: rule__ColumnDeclaration__TypeAssignment_1
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
    // InternalSql_dsl.g:1227:1: rule__ColumnDeclaration__Group__2 : rule__ColumnDeclaration__Group__2__Impl ;
    public final void rule__ColumnDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1231:1: ( rule__ColumnDeclaration__Group__2__Impl )
            // InternalSql_dsl.g:1232:2: rule__ColumnDeclaration__Group__2__Impl
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
    // InternalSql_dsl.g:1238:1: rule__ColumnDeclaration__Group__2__Impl : ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) ;
    public final void rule__ColumnDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1242:1: ( ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) )
            // InternalSql_dsl.g:1243:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            {
            // InternalSql_dsl.g:1243:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            // InternalSql_dsl.g:1244:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullAssignment_2()); 
            // InternalSql_dsl.g:1245:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSql_dsl.g:1245:3: rule__ColumnDeclaration__NotNullAssignment_2
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
    // InternalSql_dsl.g:1254:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1258:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalSql_dsl.g:1259:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSql_dsl.g:1266:1: rule__PrimaryKey__Group__0__Impl : ( 'PRIMARY' ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1270:1: ( ( 'PRIMARY' ) )
            // InternalSql_dsl.g:1271:1: ( 'PRIMARY' )
            {
            // InternalSql_dsl.g:1271:1: ( 'PRIMARY' )
            // InternalSql_dsl.g:1272:2: 'PRIMARY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSql_dsl.g:1281:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1285:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalSql_dsl.g:1286:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSql_dsl.g:1293:1: rule__PrimaryKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1297:1: ( ( 'KEY' ) )
            // InternalSql_dsl.g:1298:1: ( 'KEY' )
            {
            // InternalSql_dsl.g:1298:1: ( 'KEY' )
            // InternalSql_dsl.g:1299:2: 'KEY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSql_dsl.g:1308:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1312:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalSql_dsl.g:1313:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:1320:1: rule__PrimaryKey__Group__2__Impl : ( '(' ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1324:1: ( ( '(' ) )
            // InternalSql_dsl.g:1325:1: ( '(' )
            {
            // InternalSql_dsl.g:1325:1: ( '(' )
            // InternalSql_dsl.g:1326:2: '('
            {
             before(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSql_dsl.g:1335:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1339:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalSql_dsl.g:1340:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalSql_dsl.g:1347:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1351:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) )
            // InternalSql_dsl.g:1352:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            {
            // InternalSql_dsl.g:1352:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            // InternalSql_dsl.g:1353:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_3()); 
            // InternalSql_dsl.g:1354:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            // InternalSql_dsl.g:1354:3: rule__PrimaryKey__ColumnAsPKAssignment_3
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
    // InternalSql_dsl.g:1362:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1366:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalSql_dsl.g:1367:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalSql_dsl.g:1374:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1378:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalSql_dsl.g:1379:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalSql_dsl.g:1379:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalSql_dsl.g:1380:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalSql_dsl.g:1381:2: ( rule__PrimaryKey__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSql_dsl.g:1381:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PrimaryKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSql_dsl.g:1389:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1393:1: ( rule__PrimaryKey__Group__5__Impl )
            // InternalSql_dsl.g:1394:2: rule__PrimaryKey__Group__5__Impl
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
    // InternalSql_dsl.g:1400:1: rule__PrimaryKey__Group__5__Impl : ( ')' ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1404:1: ( ( ')' ) )
            // InternalSql_dsl.g:1405:1: ( ')' )
            {
            // InternalSql_dsl.g:1405:1: ( ')' )
            // InternalSql_dsl.g:1406:2: ')'
            {
             before(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSql_dsl.g:1416:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1420:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalSql_dsl.g:1421:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:1428:1: rule__PrimaryKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1432:1: ( ( ',' ) )
            // InternalSql_dsl.g:1433:1: ( ',' )
            {
            // InternalSql_dsl.g:1433:1: ( ',' )
            // InternalSql_dsl.g:1434:2: ','
            {
             before(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSql_dsl.g:1443:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1447:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalSql_dsl.g:1448:2: rule__PrimaryKey__Group_4__1__Impl
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
    // InternalSql_dsl.g:1454:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1458:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) )
            // InternalSql_dsl.g:1459:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:1459:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            // InternalSql_dsl.g:1460:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_4_1()); 
            // InternalSql_dsl.g:1461:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            // InternalSql_dsl.g:1461:3: rule__PrimaryKey__ColumnAsPKAssignment_4_1
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
    // InternalSql_dsl.g:1470:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1474:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalSql_dsl.g:1475:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSql_dsl.g:1482:1: rule__ForeignKey__Group__0__Impl : ( 'FOREIGN' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1486:1: ( ( 'FOREIGN' ) )
            // InternalSql_dsl.g:1487:1: ( 'FOREIGN' )
            {
            // InternalSql_dsl.g:1487:1: ( 'FOREIGN' )
            // InternalSql_dsl.g:1488:2: 'FOREIGN'
            {
             before(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSql_dsl.g:1497:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1501:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalSql_dsl.g:1502:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSql_dsl.g:1509:1: rule__ForeignKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1513:1: ( ( 'KEY' ) )
            // InternalSql_dsl.g:1514:1: ( 'KEY' )
            {
            // InternalSql_dsl.g:1514:1: ( 'KEY' )
            // InternalSql_dsl.g:1515:2: 'KEY'
            {
             before(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSql_dsl.g:1524:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1528:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalSql_dsl.g:1529:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:1536:1: rule__ForeignKey__Group__2__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1540:1: ( ( '(' ) )
            // InternalSql_dsl.g:1541:1: ( '(' )
            {
            // InternalSql_dsl.g:1541:1: ( '(' )
            // InternalSql_dsl.g:1542:2: '('
            {
             before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSql_dsl.g:1551:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1555:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalSql_dsl.g:1556:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalSql_dsl.g:1563:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1567:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) )
            // InternalSql_dsl.g:1568:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            {
            // InternalSql_dsl.g:1568:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            // InternalSql_dsl.g:1569:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_3()); 
            // InternalSql_dsl.g:1570:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            // InternalSql_dsl.g:1570:3: rule__ForeignKey__ColumnAsFKAssignment_3
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
    // InternalSql_dsl.g:1578:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1582:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalSql_dsl.g:1583:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalSql_dsl.g:1590:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1594:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalSql_dsl.g:1595:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalSql_dsl.g:1595:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalSql_dsl.g:1596:2: ( rule__ForeignKey__Group_4__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            // InternalSql_dsl.g:1597:2: ( rule__ForeignKey__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSql_dsl.g:1597:3: rule__ForeignKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ForeignKey__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSql_dsl.g:1605:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1609:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalSql_dsl.g:1610:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalSql_dsl.g:1617:1: rule__ForeignKey__Group__5__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1621:1: ( ( ')' ) )
            // InternalSql_dsl.g:1622:1: ( ')' )
            {
            // InternalSql_dsl.g:1622:1: ( ')' )
            // InternalSql_dsl.g:1623:2: ')'
            {
             before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSql_dsl.g:1632:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1636:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalSql_dsl.g:1637:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:1644:1: rule__ForeignKey__Group__6__Impl : ( 'REFERENCES' ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1648:1: ( ( 'REFERENCES' ) )
            // InternalSql_dsl.g:1649:1: ( 'REFERENCES' )
            {
            // InternalSql_dsl.g:1649:1: ( 'REFERENCES' )
            // InternalSql_dsl.g:1650:2: 'REFERENCES'
            {
             before(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSql_dsl.g:1659:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1663:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalSql_dsl.g:1664:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalSql_dsl.g:1671:1: rule__ForeignKey__Group__7__Impl : ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1675:1: ( ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) )
            // InternalSql_dsl.g:1676:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            {
            // InternalSql_dsl.g:1676:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            // InternalSql_dsl.g:1677:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); 
            // InternalSql_dsl.g:1678:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            // InternalSql_dsl.g:1678:3: rule__ForeignKey__ForeignTableAssignment_7
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
    // InternalSql_dsl.g:1686:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1690:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalSql_dsl.g:1691:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:1698:1: rule__ForeignKey__Group__8__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1702:1: ( ( '(' ) )
            // InternalSql_dsl.g:1703:1: ( '(' )
            {
            // InternalSql_dsl.g:1703:1: ( '(' )
            // InternalSql_dsl.g:1704:2: '('
            {
             before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSql_dsl.g:1713:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1717:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalSql_dsl.g:1718:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
            {
            pushFollow(FOLLOW_12);
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
    // InternalSql_dsl.g:1725:1: rule__ForeignKey__Group__9__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1729:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) )
            // InternalSql_dsl.g:1730:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            {
            // InternalSql_dsl.g:1730:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            // InternalSql_dsl.g:1731:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); 
            // InternalSql_dsl.g:1732:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            // InternalSql_dsl.g:1732:3: rule__ForeignKey__ForeignColumnsAssignment_9
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
    // InternalSql_dsl.g:1740:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1744:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalSql_dsl.g:1745:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
            {
            pushFollow(FOLLOW_12);
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
    // InternalSql_dsl.g:1752:1: rule__ForeignKey__Group__10__Impl : ( ( rule__ForeignKey__Group_10__0 )* ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1756:1: ( ( ( rule__ForeignKey__Group_10__0 )* ) )
            // InternalSql_dsl.g:1757:1: ( ( rule__ForeignKey__Group_10__0 )* )
            {
            // InternalSql_dsl.g:1757:1: ( ( rule__ForeignKey__Group_10__0 )* )
            // InternalSql_dsl.g:1758:2: ( rule__ForeignKey__Group_10__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_10()); 
            // InternalSql_dsl.g:1759:2: ( rule__ForeignKey__Group_10__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSql_dsl.g:1759:3: rule__ForeignKey__Group_10__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ForeignKey__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSql_dsl.g:1767:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1771:1: ( rule__ForeignKey__Group__11__Impl )
            // InternalSql_dsl.g:1772:2: rule__ForeignKey__Group__11__Impl
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
    // InternalSql_dsl.g:1778:1: rule__ForeignKey__Group__11__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1782:1: ( ( ')' ) )
            // InternalSql_dsl.g:1783:1: ( ')' )
            {
            // InternalSql_dsl.g:1783:1: ( ')' )
            // InternalSql_dsl.g:1784:2: ')'
            {
             before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSql_dsl.g:1794:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1798:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalSql_dsl.g:1799:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:1806:1: rule__ForeignKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1810:1: ( ( ',' ) )
            // InternalSql_dsl.g:1811:1: ( ',' )
            {
            // InternalSql_dsl.g:1811:1: ( ',' )
            // InternalSql_dsl.g:1812:2: ','
            {
             before(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSql_dsl.g:1821:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1825:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalSql_dsl.g:1826:2: rule__ForeignKey__Group_4__1__Impl
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
    // InternalSql_dsl.g:1832:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1836:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) )
            // InternalSql_dsl.g:1837:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:1837:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            // InternalSql_dsl.g:1838:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_4_1()); 
            // InternalSql_dsl.g:1839:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            // InternalSql_dsl.g:1839:3: rule__ForeignKey__ColumnAsFKAssignment_4_1
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
    // InternalSql_dsl.g:1848:1: rule__ForeignKey__Group_10__0 : rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 ;
    public final void rule__ForeignKey__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1852:1: ( rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 )
            // InternalSql_dsl.g:1853:2: rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:1860:1: rule__ForeignKey__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1864:1: ( ( ',' ) )
            // InternalSql_dsl.g:1865:1: ( ',' )
            {
            // InternalSql_dsl.g:1865:1: ( ',' )
            // InternalSql_dsl.g:1866:2: ','
            {
             before(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSql_dsl.g:1875:1: rule__ForeignKey__Group_10__1 : rule__ForeignKey__Group_10__1__Impl ;
    public final void rule__ForeignKey__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1879:1: ( rule__ForeignKey__Group_10__1__Impl )
            // InternalSql_dsl.g:1880:2: rule__ForeignKey__Group_10__1__Impl
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
    // InternalSql_dsl.g:1886:1: rule__ForeignKey__Group_10__1__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) ;
    public final void rule__ForeignKey__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1890:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) )
            // InternalSql_dsl.g:1891:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            {
            // InternalSql_dsl.g:1891:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            // InternalSql_dsl.g:1892:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); 
            // InternalSql_dsl.g:1893:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            // InternalSql_dsl.g:1893:3: rule__ForeignKey__ForeignColumnsAssignment_10_1
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


    // $ANTLR start "rule__DropTableDeclaration__Group__0"
    // InternalSql_dsl.g:1902:1: rule__DropTableDeclaration__Group__0 : rule__DropTableDeclaration__Group__0__Impl rule__DropTableDeclaration__Group__1 ;
    public final void rule__DropTableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1906:1: ( rule__DropTableDeclaration__Group__0__Impl rule__DropTableDeclaration__Group__1 )
            // InternalSql_dsl.g:1907:2: rule__DropTableDeclaration__Group__0__Impl rule__DropTableDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DropTableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableDeclaration__Group__0"


    // $ANTLR start "rule__DropTableDeclaration__Group__0__Impl"
    // InternalSql_dsl.g:1914:1: rule__DropTableDeclaration__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DropTableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1918:1: ( ( 'DROP' ) )
            // InternalSql_dsl.g:1919:1: ( 'DROP' )
            {
            // InternalSql_dsl.g:1919:1: ( 'DROP' )
            // InternalSql_dsl.g:1920:2: 'DROP'
            {
             before(grammarAccess.getDropTableDeclarationAccess().getDROPKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDropTableDeclarationAccess().getDROPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__DropTableDeclaration__Group__1"
    // InternalSql_dsl.g:1929:1: rule__DropTableDeclaration__Group__1 : rule__DropTableDeclaration__Group__1__Impl rule__DropTableDeclaration__Group__2 ;
    public final void rule__DropTableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1933:1: ( rule__DropTableDeclaration__Group__1__Impl rule__DropTableDeclaration__Group__2 )
            // InternalSql_dsl.g:1934:2: rule__DropTableDeclaration__Group__1__Impl rule__DropTableDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DropTableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropTableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableDeclaration__Group__1"


    // $ANTLR start "rule__DropTableDeclaration__Group__1__Impl"
    // InternalSql_dsl.g:1941:1: rule__DropTableDeclaration__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__DropTableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1945:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:1946:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:1946:1: ( 'TABLE' )
            // InternalSql_dsl.g:1947:2: 'TABLE'
            {
             before(grammarAccess.getDropTableDeclarationAccess().getTABLEKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDropTableDeclarationAccess().getTABLEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__DropTableDeclaration__Group__2"
    // InternalSql_dsl.g:1956:1: rule__DropTableDeclaration__Group__2 : rule__DropTableDeclaration__Group__2__Impl ;
    public final void rule__DropTableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1960:1: ( rule__DropTableDeclaration__Group__2__Impl )
            // InternalSql_dsl.g:1961:2: rule__DropTableDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropTableDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableDeclaration__Group__2"


    // $ANTLR start "rule__DropTableDeclaration__Group__2__Impl"
    // InternalSql_dsl.g:1967:1: rule__DropTableDeclaration__Group__2__Impl : ( ( rule__DropTableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__DropTableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1971:1: ( ( ( rule__DropTableDeclaration__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:1972:1: ( ( rule__DropTableDeclaration__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:1972:1: ( ( rule__DropTableDeclaration__NameAssignment_2 ) )
            // InternalSql_dsl.g:1973:2: ( rule__DropTableDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getDropTableDeclarationAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:1974:2: ( rule__DropTableDeclaration__NameAssignment_2 )
            // InternalSql_dsl.g:1974:3: rule__DropTableDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DropTableDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropTableDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TruncateTableDeclaration__Group__0"
    // InternalSql_dsl.g:1983:1: rule__TruncateTableDeclaration__Group__0 : rule__TruncateTableDeclaration__Group__0__Impl rule__TruncateTableDeclaration__Group__1 ;
    public final void rule__TruncateTableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1987:1: ( rule__TruncateTableDeclaration__Group__0__Impl rule__TruncateTableDeclaration__Group__1 )
            // InternalSql_dsl.g:1988:2: rule__TruncateTableDeclaration__Group__0__Impl rule__TruncateTableDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TruncateTableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruncateTableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableDeclaration__Group__0"


    // $ANTLR start "rule__TruncateTableDeclaration__Group__0__Impl"
    // InternalSql_dsl.g:1995:1: rule__TruncateTableDeclaration__Group__0__Impl : ( 'TRUNCATE' ) ;
    public final void rule__TruncateTableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1999:1: ( ( 'TRUNCATE' ) )
            // InternalSql_dsl.g:2000:1: ( 'TRUNCATE' )
            {
            // InternalSql_dsl.g:2000:1: ( 'TRUNCATE' )
            // InternalSql_dsl.g:2001:2: 'TRUNCATE'
            {
             before(grammarAccess.getTruncateTableDeclarationAccess().getTRUNCATEKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTruncateTableDeclarationAccess().getTRUNCATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TruncateTableDeclaration__Group__1"
    // InternalSql_dsl.g:2010:1: rule__TruncateTableDeclaration__Group__1 : rule__TruncateTableDeclaration__Group__1__Impl rule__TruncateTableDeclaration__Group__2 ;
    public final void rule__TruncateTableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2014:1: ( rule__TruncateTableDeclaration__Group__1__Impl rule__TruncateTableDeclaration__Group__2 )
            // InternalSql_dsl.g:2015:2: rule__TruncateTableDeclaration__Group__1__Impl rule__TruncateTableDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TruncateTableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruncateTableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableDeclaration__Group__1"


    // $ANTLR start "rule__TruncateTableDeclaration__Group__1__Impl"
    // InternalSql_dsl.g:2022:1: rule__TruncateTableDeclaration__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TruncateTableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2026:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:2027:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:2027:1: ( 'TABLE' )
            // InternalSql_dsl.g:2028:2: 'TABLE'
            {
             before(grammarAccess.getTruncateTableDeclarationAccess().getTABLEKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTruncateTableDeclarationAccess().getTABLEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TruncateTableDeclaration__Group__2"
    // InternalSql_dsl.g:2037:1: rule__TruncateTableDeclaration__Group__2 : rule__TruncateTableDeclaration__Group__2__Impl ;
    public final void rule__TruncateTableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2041:1: ( rule__TruncateTableDeclaration__Group__2__Impl )
            // InternalSql_dsl.g:2042:2: rule__TruncateTableDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TruncateTableDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableDeclaration__Group__2"


    // $ANTLR start "rule__TruncateTableDeclaration__Group__2__Impl"
    // InternalSql_dsl.g:2048:1: rule__TruncateTableDeclaration__Group__2__Impl : ( ( rule__TruncateTableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__TruncateTableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2052:1: ( ( ( rule__TruncateTableDeclaration__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:2053:1: ( ( rule__TruncateTableDeclaration__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:2053:1: ( ( rule__TruncateTableDeclaration__NameAssignment_2 ) )
            // InternalSql_dsl.g:2054:2: ( rule__TruncateTableDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getTruncateTableDeclarationAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:2055:2: ( rule__TruncateTableDeclaration__NameAssignment_2 )
            // InternalSql_dsl.g:2055:3: rule__TruncateTableDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TruncateTableDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTruncateTableDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__AlterTableStatement__Group__0"
    // InternalSql_dsl.g:2064:1: rule__AlterTableStatement__Group__0 : rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1 ;
    public final void rule__AlterTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2068:1: ( rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1 )
            // InternalSql_dsl.g:2069:2: rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSql_dsl.g:2076:1: rule__AlterTableStatement__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__AlterTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2080:1: ( ( 'ALTER' ) )
            // InternalSql_dsl.g:2081:1: ( 'ALTER' )
            {
            // InternalSql_dsl.g:2081:1: ( 'ALTER' )
            // InternalSql_dsl.g:2082:2: 'ALTER'
            {
             before(grammarAccess.getAlterTableStatementAccess().getALTERKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSql_dsl.g:2091:1: rule__AlterTableStatement__Group__1 : rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2 ;
    public final void rule__AlterTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2095:1: ( rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2 )
            // InternalSql_dsl.g:2096:2: rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:2103:1: rule__AlterTableStatement__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__AlterTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2107:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:2108:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:2108:1: ( 'TABLE' )
            // InternalSql_dsl.g:2109:2: 'TABLE'
            {
             before(grammarAccess.getAlterTableStatementAccess().getTABLEKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSql_dsl.g:2118:1: rule__AlterTableStatement__Group__2 : rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3 ;
    public final void rule__AlterTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2122:1: ( rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3 )
            // InternalSql_dsl.g:2123:2: rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSql_dsl.g:2130:1: rule__AlterTableStatement__Group__2__Impl : ( ( rule__AlterTableStatement__NameAssignment_2 ) ) ;
    public final void rule__AlterTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2134:1: ( ( ( rule__AlterTableStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:2135:1: ( ( rule__AlterTableStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:2135:1: ( ( rule__AlterTableStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:2136:2: ( rule__AlterTableStatement__NameAssignment_2 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:2137:2: ( rule__AlterTableStatement__NameAssignment_2 )
            // InternalSql_dsl.g:2137:3: rule__AlterTableStatement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AlterTableStatement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlterTableStatementAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2145:1: rule__AlterTableStatement__Group__3 : rule__AlterTableStatement__Group__3__Impl ;
    public final void rule__AlterTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2149:1: ( rule__AlterTableStatement__Group__3__Impl )
            // InternalSql_dsl.g:2150:2: rule__AlterTableStatement__Group__3__Impl
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
    // InternalSql_dsl.g:2156:1: rule__AlterTableStatement__Group__3__Impl : ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) ) ;
    public final void rule__AlterTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2160:1: ( ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) ) )
            // InternalSql_dsl.g:2161:1: ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) )
            {
            // InternalSql_dsl.g:2161:1: ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) )
            // InternalSql_dsl.g:2162:2: ( rule__AlterTableStatement__AddDropUpdateAssignment_3 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAssignment_3()); 
            // InternalSql_dsl.g:2163:2: ( rule__AlterTableStatement__AddDropUpdateAssignment_3 )
            // InternalSql_dsl.g:2163:3: rule__AlterTableStatement__AddDropUpdateAssignment_3
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
    // InternalSql_dsl.g:2172:1: rule__AlterDropStatement__Group__0 : rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1 ;
    public final void rule__AlterDropStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2176:1: ( rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1 )
            // InternalSql_dsl.g:2177:2: rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSql_dsl.g:2184:1: rule__AlterDropStatement__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__AlterDropStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2188:1: ( ( 'DROP' ) )
            // InternalSql_dsl.g:2189:1: ( 'DROP' )
            {
            // InternalSql_dsl.g:2189:1: ( 'DROP' )
            // InternalSql_dsl.g:2190:2: 'DROP'
            {
             before(grammarAccess.getAlterDropStatementAccess().getDROPKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSql_dsl.g:2199:1: rule__AlterDropStatement__Group__1 : rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2 ;
    public final void rule__AlterDropStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2203:1: ( rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2 )
            // InternalSql_dsl.g:2204:2: rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:2211:1: rule__AlterDropStatement__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__AlterDropStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2215:1: ( ( 'COLUMN' ) )
            // InternalSql_dsl.g:2216:1: ( 'COLUMN' )
            {
            // InternalSql_dsl.g:2216:1: ( 'COLUMN' )
            // InternalSql_dsl.g:2217:2: 'COLUMN'
            {
             before(grammarAccess.getAlterDropStatementAccess().getCOLUMNKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSql_dsl.g:2226:1: rule__AlterDropStatement__Group__2 : rule__AlterDropStatement__Group__2__Impl ;
    public final void rule__AlterDropStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2230:1: ( rule__AlterDropStatement__Group__2__Impl )
            // InternalSql_dsl.g:2231:2: rule__AlterDropStatement__Group__2__Impl
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
    // InternalSql_dsl.g:2237:1: rule__AlterDropStatement__Group__2__Impl : ( ( rule__AlterDropStatement__NameAssignment_2 ) ) ;
    public final void rule__AlterDropStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2241:1: ( ( ( rule__AlterDropStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:2242:1: ( ( rule__AlterDropStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:2242:1: ( ( rule__AlterDropStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:2243:2: ( rule__AlterDropStatement__NameAssignment_2 )
            {
             before(grammarAccess.getAlterDropStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:2244:2: ( rule__AlterDropStatement__NameAssignment_2 )
            // InternalSql_dsl.g:2244:3: rule__AlterDropStatement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AlterDropStatement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlterDropStatementAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2253:1: rule__AlterAddStatement__Group__0 : rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1 ;
    public final void rule__AlterAddStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2257:1: ( rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1 )
            // InternalSql_dsl.g:2258:2: rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:2265:1: rule__AlterAddStatement__Group__0__Impl : ( 'ADD' ) ;
    public final void rule__AlterAddStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2269:1: ( ( 'ADD' ) )
            // InternalSql_dsl.g:2270:1: ( 'ADD' )
            {
            // InternalSql_dsl.g:2270:1: ( 'ADD' )
            // InternalSql_dsl.g:2271:2: 'ADD'
            {
             before(grammarAccess.getAlterAddStatementAccess().getADDKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSql_dsl.g:2280:1: rule__AlterAddStatement__Group__1 : rule__AlterAddStatement__Group__1__Impl ;
    public final void rule__AlterAddStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2284:1: ( rule__AlterAddStatement__Group__1__Impl )
            // InternalSql_dsl.g:2285:2: rule__AlterAddStatement__Group__1__Impl
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
    // InternalSql_dsl.g:2291:1: rule__AlterAddStatement__Group__1__Impl : ( ( rule__AlterAddStatement__ColumnAssignment_1 ) ) ;
    public final void rule__AlterAddStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2295:1: ( ( ( rule__AlterAddStatement__ColumnAssignment_1 ) ) )
            // InternalSql_dsl.g:2296:1: ( ( rule__AlterAddStatement__ColumnAssignment_1 ) )
            {
            // InternalSql_dsl.g:2296:1: ( ( rule__AlterAddStatement__ColumnAssignment_1 ) )
            // InternalSql_dsl.g:2297:2: ( rule__AlterAddStatement__ColumnAssignment_1 )
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnAssignment_1()); 
            // InternalSql_dsl.g:2298:2: ( rule__AlterAddStatement__ColumnAssignment_1 )
            // InternalSql_dsl.g:2298:3: rule__AlterAddStatement__ColumnAssignment_1
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
    // InternalSql_dsl.g:2307:1: rule__AlterUpdateStatement__Group__0 : rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1 ;
    public final void rule__AlterUpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2311:1: ( rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1 )
            // InternalSql_dsl.g:2312:2: rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSql_dsl.g:2319:1: rule__AlterUpdateStatement__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__AlterUpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2323:1: ( ( 'ALTER' ) )
            // InternalSql_dsl.g:2324:1: ( 'ALTER' )
            {
            // InternalSql_dsl.g:2324:1: ( 'ALTER' )
            // InternalSql_dsl.g:2325:2: 'ALTER'
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getALTERKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSql_dsl.g:2334:1: rule__AlterUpdateStatement__Group__1 : rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2 ;
    public final void rule__AlterUpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2338:1: ( rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2 )
            // InternalSql_dsl.g:2339:2: rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:2346:1: rule__AlterUpdateStatement__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__AlterUpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2350:1: ( ( 'COLUMN' ) )
            // InternalSql_dsl.g:2351:1: ( 'COLUMN' )
            {
            // InternalSql_dsl.g:2351:1: ( 'COLUMN' )
            // InternalSql_dsl.g:2352:2: 'COLUMN'
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getCOLUMNKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSql_dsl.g:2361:1: rule__AlterUpdateStatement__Group__2 : rule__AlterUpdateStatement__Group__2__Impl ;
    public final void rule__AlterUpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2365:1: ( rule__AlterUpdateStatement__Group__2__Impl )
            // InternalSql_dsl.g:2366:2: rule__AlterUpdateStatement__Group__2__Impl
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
    // InternalSql_dsl.g:2372:1: rule__AlterUpdateStatement__Group__2__Impl : ( ( rule__AlterUpdateStatement__NameAssignment_2 ) ) ;
    public final void rule__AlterUpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2376:1: ( ( ( rule__AlterUpdateStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:2377:1: ( ( rule__AlterUpdateStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:2377:1: ( ( rule__AlterUpdateStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:2378:2: ( rule__AlterUpdateStatement__NameAssignment_2 )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:2379:2: ( rule__AlterUpdateStatement__NameAssignment_2 )
            // InternalSql_dsl.g:2379:3: rule__AlterUpdateStatement__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AlterUpdateStatement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlterUpdateStatementAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2388:1: rule__VariableDeclarationStatement__Group__0 : rule__VariableDeclarationStatement__Group__0__Impl rule__VariableDeclarationStatement__Group__1 ;
    public final void rule__VariableDeclarationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2392:1: ( rule__VariableDeclarationStatement__Group__0__Impl rule__VariableDeclarationStatement__Group__1 )
            // InternalSql_dsl.g:2393:2: rule__VariableDeclarationStatement__Group__0__Impl rule__VariableDeclarationStatement__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:2400:1: rule__VariableDeclarationStatement__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclarationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2404:1: ( ( 'var' ) )
            // InternalSql_dsl.g:2405:1: ( 'var' )
            {
            // InternalSql_dsl.g:2405:1: ( 'var' )
            // InternalSql_dsl.g:2406:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getVarKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSql_dsl.g:2415:1: rule__VariableDeclarationStatement__Group__1 : rule__VariableDeclarationStatement__Group__1__Impl rule__VariableDeclarationStatement__Group__2 ;
    public final void rule__VariableDeclarationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2419:1: ( rule__VariableDeclarationStatement__Group__1__Impl rule__VariableDeclarationStatement__Group__2 )
            // InternalSql_dsl.g:2420:2: rule__VariableDeclarationStatement__Group__1__Impl rule__VariableDeclarationStatement__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSql_dsl.g:2427:1: rule__VariableDeclarationStatement__Group__1__Impl : ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclarationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2431:1: ( ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) ) )
            // InternalSql_dsl.g:2432:1: ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) )
            {
            // InternalSql_dsl.g:2432:1: ( ( rule__VariableDeclarationStatement__NameAssignment_1 ) )
            // InternalSql_dsl.g:2433:2: ( rule__VariableDeclarationStatement__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getNameAssignment_1()); 
            // InternalSql_dsl.g:2434:2: ( rule__VariableDeclarationStatement__NameAssignment_1 )
            // InternalSql_dsl.g:2434:3: rule__VariableDeclarationStatement__NameAssignment_1
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
    // InternalSql_dsl.g:2442:1: rule__VariableDeclarationStatement__Group__2 : rule__VariableDeclarationStatement__Group__2__Impl rule__VariableDeclarationStatement__Group__3 ;
    public final void rule__VariableDeclarationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2446:1: ( rule__VariableDeclarationStatement__Group__2__Impl rule__VariableDeclarationStatement__Group__3 )
            // InternalSql_dsl.g:2447:2: rule__VariableDeclarationStatement__Group__2__Impl rule__VariableDeclarationStatement__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSql_dsl.g:2454:1: rule__VariableDeclarationStatement__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclarationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2458:1: ( ( '=' ) )
            // InternalSql_dsl.g:2459:1: ( '=' )
            {
            // InternalSql_dsl.g:2459:1: ( '=' )
            // InternalSql_dsl.g:2460:2: '='
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSql_dsl.g:2469:1: rule__VariableDeclarationStatement__Group__3 : rule__VariableDeclarationStatement__Group__3__Impl ;
    public final void rule__VariableDeclarationStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2473:1: ( rule__VariableDeclarationStatement__Group__3__Impl )
            // InternalSql_dsl.g:2474:2: rule__VariableDeclarationStatement__Group__3__Impl
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
    // InternalSql_dsl.g:2480:1: rule__VariableDeclarationStatement__Group__3__Impl : ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclarationStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2484:1: ( ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) ) )
            // InternalSql_dsl.g:2485:1: ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) )
            {
            // InternalSql_dsl.g:2485:1: ( ( rule__VariableDeclarationStatement__ValueAssignment_3 ) )
            // InternalSql_dsl.g:2486:2: ( rule__VariableDeclarationStatement__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationStatementAccess().getValueAssignment_3()); 
            // InternalSql_dsl.g:2487:2: ( rule__VariableDeclarationStatement__ValueAssignment_3 )
            // InternalSql_dsl.g:2487:3: rule__VariableDeclarationStatement__ValueAssignment_3
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
    // InternalSql_dsl.g:2496:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2500:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalSql_dsl.g:2501:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSql_dsl.g:2508:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2512:1: ( ( ( RULE_INT )? ) )
            // InternalSql_dsl.g:2513:1: ( ( RULE_INT )? )
            {
            // InternalSql_dsl.g:2513:1: ( ( RULE_INT )? )
            // InternalSql_dsl.g:2514:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalSql_dsl.g:2515:2: ( RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSql_dsl.g:2515:3: RULE_INT
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
    // InternalSql_dsl.g:2523:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2527:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalSql_dsl.g:2528:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSql_dsl.g:2535:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2539:1: ( ( '.' ) )
            // InternalSql_dsl.g:2540:1: ( '.' )
            {
            // InternalSql_dsl.g:2540:1: ( '.' )
            // InternalSql_dsl.g:2541:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSql_dsl.g:2550:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2554:1: ( rule__REAL__Group__2__Impl )
            // InternalSql_dsl.g:2555:2: rule__REAL__Group__2__Impl
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
    // InternalSql_dsl.g:2561:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2565:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:2566:1: ( RULE_INT )
            {
            // InternalSql_dsl.g:2566:1: ( RULE_INT )
            // InternalSql_dsl.g:2567:2: RULE_INT
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


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalSql_dsl.g:2577:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2581:1: ( ( ruleStatement ) )
            // InternalSql_dsl.g:2582:2: ( ruleStatement )
            {
            // InternalSql_dsl.g:2582:2: ( ruleStatement )
            // InternalSql_dsl.g:2583:3: ruleStatement
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


    // $ANTLR start "rule__SelectStatement__NameAssignment_1"
    // InternalSql_dsl.g:2592:1: rule__SelectStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SelectStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2596:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2597:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2597:2: ( RULE_ID )
            // InternalSql_dsl.g:2598:3: RULE_ID
            {
             before(grammarAccess.getSelectStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__NameAssignment_1"


    // $ANTLR start "rule__SelectStatement__ColumnAssignment_3"
    // InternalSql_dsl.g:2607:1: rule__SelectStatement__ColumnAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SelectStatement__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2611:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2612:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2612:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2613:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_3_0()); 
            // InternalSql_dsl.g:2614:3: ( RULE_ID )
            // InternalSql_dsl.g:2615:4: RULE_ID
            {
             before(grammarAccess.getSelectStatementAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getColumnCDIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSelectStatementAccess().getColumnCDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__ColumnAssignment_3"


    // $ANTLR start "rule__DatabaseDeclarationStatement__NameAssignment_2"
    // InternalSql_dsl.g:2626:1: rule__DatabaseDeclarationStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DatabaseDeclarationStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2630:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2631:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2631:2: ( RULE_ID )
            // InternalSql_dsl.g:2632:3: RULE_ID
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
    // InternalSql_dsl.g:2641:1: rule__CreateTableStatement__TablesAssignment : ( ruleTableDeclaration ) ;
    public final void rule__CreateTableStatement__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2645:1: ( ( ruleTableDeclaration ) )
            // InternalSql_dsl.g:2646:2: ( ruleTableDeclaration )
            {
            // InternalSql_dsl.g:2646:2: ( ruleTableDeclaration )
            // InternalSql_dsl.g:2647:3: ruleTableDeclaration
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


    // $ANTLR start "rule__TableDeclaration__NameAssignment_2"
    // InternalSql_dsl.g:2656:1: rule__TableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2660:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2661:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2661:2: ( RULE_ID )
            // InternalSql_dsl.g:2662:3: RULE_ID
            {
             before(grammarAccess.getTableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDeclaration__NameAssignment_2"


    // $ANTLR start "rule__TableDeclaration__AttributesAssignment_4"
    // InternalSql_dsl.g:2671:1: rule__TableDeclaration__AttributesAssignment_4 : ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) ) ;
    public final void rule__TableDeclaration__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2675:1: ( ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) ) )
            // InternalSql_dsl.g:2676:2: ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) )
            {
            // InternalSql_dsl.g:2676:2: ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) )
            // InternalSql_dsl.g:2677:3: ( rule__TableDeclaration__AttributesAlternatives_4_0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_4_0()); 
            // InternalSql_dsl.g:2678:3: ( rule__TableDeclaration__AttributesAlternatives_4_0 )
            // InternalSql_dsl.g:2678:4: rule__TableDeclaration__AttributesAlternatives_4_0
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
    // InternalSql_dsl.g:2686:1: rule__TableDeclaration__AttributesAssignment_5_1 : ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) ) ;
    public final void rule__TableDeclaration__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2690:1: ( ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) ) )
            // InternalSql_dsl.g:2691:2: ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) )
            {
            // InternalSql_dsl.g:2691:2: ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) )
            // InternalSql_dsl.g:2692:3: ( rule__TableDeclaration__AttributesAlternatives_5_1_0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_5_1_0()); 
            // InternalSql_dsl.g:2693:3: ( rule__TableDeclaration__AttributesAlternatives_5_1_0 )
            // InternalSql_dsl.g:2693:4: rule__TableDeclaration__AttributesAlternatives_5_1_0
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


    // $ANTLR start "rule__ColumnDeclaration__NameAssignment_0"
    // InternalSql_dsl.g:2701:1: rule__ColumnDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ColumnDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2705:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2706:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2706:2: ( RULE_ID )
            // InternalSql_dsl.g:2707:3: RULE_ID
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
    // InternalSql_dsl.g:2716:1: rule__ColumnDeclaration__TypeAssignment_1 : ( ruleDataStructureType ) ;
    public final void rule__ColumnDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2720:1: ( ( ruleDataStructureType ) )
            // InternalSql_dsl.g:2721:2: ( ruleDataStructureType )
            {
            // InternalSql_dsl.g:2721:2: ( ruleDataStructureType )
            // InternalSql_dsl.g:2722:3: ruleDataStructureType
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
    // InternalSql_dsl.g:2731:1: rule__ColumnDeclaration__NotNullAssignment_2 : ( ( 'NOT NULL' ) ) ;
    public final void rule__ColumnDeclaration__NotNullAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2735:1: ( ( ( 'NOT NULL' ) ) )
            // InternalSql_dsl.g:2736:2: ( ( 'NOT NULL' ) )
            {
            // InternalSql_dsl.g:2736:2: ( ( 'NOT NULL' ) )
            // InternalSql_dsl.g:2737:3: ( 'NOT NULL' )
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0()); 
            // InternalSql_dsl.g:2738:3: ( 'NOT NULL' )
            // InternalSql_dsl.g:2739:4: 'NOT NULL'
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSql_dsl.g:2750:1: rule__PrimaryKey__ColumnAsPKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2754:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2755:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2755:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2756:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_3_0()); 
            // InternalSql_dsl.g:2757:3: ( RULE_ID )
            // InternalSql_dsl.g:2758:4: RULE_ID
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
    // InternalSql_dsl.g:2769:1: rule__PrimaryKey__ColumnAsPKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2773:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2774:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2774:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2775:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKCDCrossReference_4_1_0()); 
            // InternalSql_dsl.g:2776:3: ( RULE_ID )
            // InternalSql_dsl.g:2777:4: RULE_ID
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
    // InternalSql_dsl.g:2788:1: rule__ForeignKey__ColumnAsFKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2792:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2793:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2793:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2794:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_3_0()); 
            // InternalSql_dsl.g:2795:3: ( RULE_ID )
            // InternalSql_dsl.g:2796:4: RULE_ID
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
    // InternalSql_dsl.g:2807:1: rule__ForeignKey__ColumnAsFKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2811:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2812:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2812:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2813:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKCDCrossReference_4_1_0()); 
            // InternalSql_dsl.g:2814:3: ( RULE_ID )
            // InternalSql_dsl.g:2815:4: RULE_ID
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
    // InternalSql_dsl.g:2826:1: rule__ForeignKey__ForeignTableAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignTableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2830:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2831:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2831:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2832:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationCrossReference_7_0()); 
            // InternalSql_dsl.g:2833:3: ( RULE_ID )
            // InternalSql_dsl.g:2834:4: RULE_ID
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
    // InternalSql_dsl.g:2845:1: rule__ForeignKey__ForeignColumnsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2849:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2850:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2850:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2851:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_9_0()); 
            // InternalSql_dsl.g:2852:3: ( RULE_ID )
            // InternalSql_dsl.g:2853:4: RULE_ID
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
    // InternalSql_dsl.g:2864:1: rule__ForeignKey__ForeignColumnsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2868:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2869:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2869:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2870:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsCDCrossReference_10_1_0()); 
            // InternalSql_dsl.g:2871:3: ( RULE_ID )
            // InternalSql_dsl.g:2872:4: RULE_ID
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


    // $ANTLR start "rule__DropTableStatement__TablesAssignment"
    // InternalSql_dsl.g:2883:1: rule__DropTableStatement__TablesAssignment : ( ruleDropTableDeclaration ) ;
    public final void rule__DropTableStatement__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2887:1: ( ( ruleDropTableDeclaration ) )
            // InternalSql_dsl.g:2888:2: ( ruleDropTableDeclaration )
            {
            // InternalSql_dsl.g:2888:2: ( ruleDropTableDeclaration )
            // InternalSql_dsl.g:2889:3: ruleDropTableDeclaration
            {
             before(grammarAccess.getDropTableStatementAccess().getTablesDropTableDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDropTableDeclaration();

            state._fsp--;

             after(grammarAccess.getDropTableStatementAccess().getTablesDropTableDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableStatement__TablesAssignment"


    // $ANTLR start "rule__DropTableDeclaration__NameAssignment_2"
    // InternalSql_dsl.g:2898:1: rule__DropTableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DropTableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2902:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2903:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2903:2: ( RULE_ID )
            // InternalSql_dsl.g:2904:3: RULE_ID
            {
             before(grammarAccess.getDropTableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropTableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropTableDeclaration__NameAssignment_2"


    // $ANTLR start "rule__TruncateTableStatement__TablesAssignment"
    // InternalSql_dsl.g:2913:1: rule__TruncateTableStatement__TablesAssignment : ( ruleTruncateTableDeclaration ) ;
    public final void rule__TruncateTableStatement__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2917:1: ( ( ruleTruncateTableDeclaration ) )
            // InternalSql_dsl.g:2918:2: ( ruleTruncateTableDeclaration )
            {
            // InternalSql_dsl.g:2918:2: ( ruleTruncateTableDeclaration )
            // InternalSql_dsl.g:2919:3: ruleTruncateTableDeclaration
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTablesTruncateTableDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTruncateTableDeclaration();

            state._fsp--;

             after(grammarAccess.getTruncateTableStatementAccess().getTablesTruncateTableDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableStatement__TablesAssignment"


    // $ANTLR start "rule__TruncateTableDeclaration__NameAssignment_2"
    // InternalSql_dsl.g:2928:1: rule__TruncateTableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TruncateTableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2932:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2933:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2933:2: ( RULE_ID )
            // InternalSql_dsl.g:2934:3: RULE_ID
            {
             before(grammarAccess.getTruncateTableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTruncateTableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruncateTableDeclaration__NameAssignment_2"


    // $ANTLR start "rule__AlterTableStatement__NameAssignment_2"
    // InternalSql_dsl.g:2943:1: rule__AlterTableStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AlterTableStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2947:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2948:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2948:2: ( RULE_ID )
            // InternalSql_dsl.g:2949:3: RULE_ID
            {
             before(grammarAccess.getAlterTableStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlterTableStatementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterTableStatement__NameAssignment_2"


    // $ANTLR start "rule__AlterTableStatement__AddDropUpdateAssignment_3"
    // InternalSql_dsl.g:2958:1: rule__AlterTableStatement__AddDropUpdateAssignment_3 : ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) ) ;
    public final void rule__AlterTableStatement__AddDropUpdateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2962:1: ( ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) ) )
            // InternalSql_dsl.g:2963:2: ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) )
            {
            // InternalSql_dsl.g:2963:2: ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) )
            // InternalSql_dsl.g:2964:3: ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlternatives_3_0()); 
            // InternalSql_dsl.g:2965:3: ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 )
            // InternalSql_dsl.g:2965:4: rule__AlterTableStatement__AddDropUpdateAlternatives_3_0
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


    // $ANTLR start "rule__AlterDropStatement__NameAssignment_2"
    // InternalSql_dsl.g:2973:1: rule__AlterDropStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AlterDropStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2977:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2978:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2978:2: ( RULE_ID )
            // InternalSql_dsl.g:2979:3: RULE_ID
            {
             before(grammarAccess.getAlterDropStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlterDropStatementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterDropStatement__NameAssignment_2"


    // $ANTLR start "rule__AlterAddStatement__ColumnAssignment_1"
    // InternalSql_dsl.g:2988:1: rule__AlterAddStatement__ColumnAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AlterAddStatement__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2992:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2993:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2993:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2994:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnCDCrossReference_1_0()); 
            // InternalSql_dsl.g:2995:3: ( RULE_ID )
            // InternalSql_dsl.g:2996:4: RULE_ID
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


    // $ANTLR start "rule__AlterUpdateStatement__NameAssignment_2"
    // InternalSql_dsl.g:3007:1: rule__AlterUpdateStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AlterUpdateStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3011:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:3012:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:3012:2: ( RULE_ID )
            // InternalSql_dsl.g:3013:3: RULE_ID
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlterUpdateStatementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlterUpdateStatement__NameAssignment_2"


    // $ANTLR start "rule__VariableDeclarationStatement__NameAssignment_1"
    // InternalSql_dsl.g:3022:1: rule__VariableDeclarationStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclarationStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3026:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:3027:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:3027:2: ( RULE_ID )
            // InternalSql_dsl.g:3028:3: RULE_ID
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
    // InternalSql_dsl.g:3037:1: rule__VariableDeclarationStatement__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclarationStatement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:3041:1: ( ( RULE_INT ) )
            // InternalSql_dsl.g:3042:2: ( RULE_INT )
            {
            // InternalSql_dsl.g:3042:2: ( RULE_INT )
            // InternalSql_dsl.g:3043:3: RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000014000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000014000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000540000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});

}