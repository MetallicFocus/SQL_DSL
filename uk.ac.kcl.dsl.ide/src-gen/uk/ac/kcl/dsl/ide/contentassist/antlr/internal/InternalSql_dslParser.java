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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'varchar'", "'char'", "'date'", "'int'", "'float'", "'time'", "'text'", "'CREATE'", "'DATABASE'", "'TABLE'", "'('", "')'", "','", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", "'DROP'", "'TRUNCATE'", "'ALTER'", "'COLUMN'", "'ADD'", "'NOT NULL'"
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


    // $ANTLR start "entryRuleDatabaseDeclarationStatement"
    // InternalSql_dsl.g:103:1: entryRuleDatabaseDeclarationStatement : ruleDatabaseDeclarationStatement EOF ;
    public final void entryRuleDatabaseDeclarationStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:104:1: ( ruleDatabaseDeclarationStatement EOF )
            // InternalSql_dsl.g:105:1: ruleDatabaseDeclarationStatement EOF
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
    // InternalSql_dsl.g:112:1: ruleDatabaseDeclarationStatement : ( ( rule__DatabaseDeclarationStatement__Group__0 ) ) ;
    public final void ruleDatabaseDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:116:2: ( ( ( rule__DatabaseDeclarationStatement__Group__0 ) ) )
            // InternalSql_dsl.g:117:2: ( ( rule__DatabaseDeclarationStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:117:2: ( ( rule__DatabaseDeclarationStatement__Group__0 ) )
            // InternalSql_dsl.g:118:3: ( rule__DatabaseDeclarationStatement__Group__0 )
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getGroup()); 
            // InternalSql_dsl.g:119:3: ( rule__DatabaseDeclarationStatement__Group__0 )
            // InternalSql_dsl.g:119:4: rule__DatabaseDeclarationStatement__Group__0
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
    // InternalSql_dsl.g:128:1: entryRuleCreateTableStatement : ruleCreateTableStatement EOF ;
    public final void entryRuleCreateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:129:1: ( ruleCreateTableStatement EOF )
            // InternalSql_dsl.g:130:1: ruleCreateTableStatement EOF
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
    // InternalSql_dsl.g:137:1: ruleCreateTableStatement : ( ( rule__CreateTableStatement__TablesAssignment )* ) ;
    public final void ruleCreateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:141:2: ( ( ( rule__CreateTableStatement__TablesAssignment )* ) )
            // InternalSql_dsl.g:142:2: ( ( rule__CreateTableStatement__TablesAssignment )* )
            {
            // InternalSql_dsl.g:142:2: ( ( rule__CreateTableStatement__TablesAssignment )* )
            // InternalSql_dsl.g:143:3: ( rule__CreateTableStatement__TablesAssignment )*
            {
             before(grammarAccess.getCreateTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:144:3: ( rule__CreateTableStatement__TablesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSql_dsl.g:144:4: rule__CreateTableStatement__TablesAssignment
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
    // InternalSql_dsl.g:153:1: entryRuleTableDeclaration : ruleTableDeclaration EOF ;
    public final void entryRuleTableDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:154:1: ( ruleTableDeclaration EOF )
            // InternalSql_dsl.g:155:1: ruleTableDeclaration EOF
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
    // InternalSql_dsl.g:162:1: ruleTableDeclaration : ( ( rule__TableDeclaration__Group__0 ) ) ;
    public final void ruleTableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:166:2: ( ( ( rule__TableDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:167:2: ( ( rule__TableDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:167:2: ( ( rule__TableDeclaration__Group__0 ) )
            // InternalSql_dsl.g:168:3: ( rule__TableDeclaration__Group__0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:169:3: ( rule__TableDeclaration__Group__0 )
            // InternalSql_dsl.g:169:4: rule__TableDeclaration__Group__0
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
    // InternalSql_dsl.g:178:1: entryRuleColumnDeclaration : ruleColumnDeclaration EOF ;
    public final void entryRuleColumnDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:179:1: ( ruleColumnDeclaration EOF )
            // InternalSql_dsl.g:180:1: ruleColumnDeclaration EOF
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
    // InternalSql_dsl.g:187:1: ruleColumnDeclaration : ( ( rule__ColumnDeclaration__Group__0 ) ) ;
    public final void ruleColumnDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:191:2: ( ( ( rule__ColumnDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:192:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:192:2: ( ( rule__ColumnDeclaration__Group__0 ) )
            // InternalSql_dsl.g:193:3: ( rule__ColumnDeclaration__Group__0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:194:3: ( rule__ColumnDeclaration__Group__0 )
            // InternalSql_dsl.g:194:4: rule__ColumnDeclaration__Group__0
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
    // InternalSql_dsl.g:203:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // InternalSql_dsl.g:204:1: ( rulePrimaryKey EOF )
            // InternalSql_dsl.g:205:1: rulePrimaryKey EOF
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
    // InternalSql_dsl.g:212:1: rulePrimaryKey : ( ( rule__PrimaryKey__Group__0 ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:216:2: ( ( ( rule__PrimaryKey__Group__0 ) ) )
            // InternalSql_dsl.g:217:2: ( ( rule__PrimaryKey__Group__0 ) )
            {
            // InternalSql_dsl.g:217:2: ( ( rule__PrimaryKey__Group__0 ) )
            // InternalSql_dsl.g:218:3: ( rule__PrimaryKey__Group__0 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup()); 
            // InternalSql_dsl.g:219:3: ( rule__PrimaryKey__Group__0 )
            // InternalSql_dsl.g:219:4: rule__PrimaryKey__Group__0
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
    // InternalSql_dsl.g:228:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalSql_dsl.g:229:1: ( ruleForeignKey EOF )
            // InternalSql_dsl.g:230:1: ruleForeignKey EOF
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
    // InternalSql_dsl.g:237:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:241:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalSql_dsl.g:242:2: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalSql_dsl.g:242:2: ( ( rule__ForeignKey__Group__0 ) )
            // InternalSql_dsl.g:243:3: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // InternalSql_dsl.g:244:3: ( rule__ForeignKey__Group__0 )
            // InternalSql_dsl.g:244:4: rule__ForeignKey__Group__0
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
    // InternalSql_dsl.g:253:1: entryRuleDropTableStatement : ruleDropTableStatement EOF ;
    public final void entryRuleDropTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:254:1: ( ruleDropTableStatement EOF )
            // InternalSql_dsl.g:255:1: ruleDropTableStatement EOF
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
    // InternalSql_dsl.g:262:1: ruleDropTableStatement : ( ( rule__DropTableStatement__TablesAssignment )* ) ;
    public final void ruleDropTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:266:2: ( ( ( rule__DropTableStatement__TablesAssignment )* ) )
            // InternalSql_dsl.g:267:2: ( ( rule__DropTableStatement__TablesAssignment )* )
            {
            // InternalSql_dsl.g:267:2: ( ( rule__DropTableStatement__TablesAssignment )* )
            // InternalSql_dsl.g:268:3: ( rule__DropTableStatement__TablesAssignment )*
            {
             before(grammarAccess.getDropTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:269:3: ( rule__DropTableStatement__TablesAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSql_dsl.g:269:4: rule__DropTableStatement__TablesAssignment
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
    // InternalSql_dsl.g:278:1: entryRuleDropTableDeclaration : ruleDropTableDeclaration EOF ;
    public final void entryRuleDropTableDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:279:1: ( ruleDropTableDeclaration EOF )
            // InternalSql_dsl.g:280:1: ruleDropTableDeclaration EOF
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
    // InternalSql_dsl.g:287:1: ruleDropTableDeclaration : ( ( rule__DropTableDeclaration__Group__0 ) ) ;
    public final void ruleDropTableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:291:2: ( ( ( rule__DropTableDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:292:2: ( ( rule__DropTableDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:292:2: ( ( rule__DropTableDeclaration__Group__0 ) )
            // InternalSql_dsl.g:293:3: ( rule__DropTableDeclaration__Group__0 )
            {
             before(grammarAccess.getDropTableDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:294:3: ( rule__DropTableDeclaration__Group__0 )
            // InternalSql_dsl.g:294:4: rule__DropTableDeclaration__Group__0
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
    // InternalSql_dsl.g:303:1: entryRuleTruncateTableStatement : ruleTruncateTableStatement EOF ;
    public final void entryRuleTruncateTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:304:1: ( ruleTruncateTableStatement EOF )
            // InternalSql_dsl.g:305:1: ruleTruncateTableStatement EOF
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
    // InternalSql_dsl.g:312:1: ruleTruncateTableStatement : ( ( rule__TruncateTableStatement__TablesAssignment )* ) ;
    public final void ruleTruncateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:316:2: ( ( ( rule__TruncateTableStatement__TablesAssignment )* ) )
            // InternalSql_dsl.g:317:2: ( ( rule__TruncateTableStatement__TablesAssignment )* )
            {
            // InternalSql_dsl.g:317:2: ( ( rule__TruncateTableStatement__TablesAssignment )* )
            // InternalSql_dsl.g:318:3: ( rule__TruncateTableStatement__TablesAssignment )*
            {
             before(grammarAccess.getTruncateTableStatementAccess().getTablesAssignment()); 
            // InternalSql_dsl.g:319:3: ( rule__TruncateTableStatement__TablesAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSql_dsl.g:319:4: rule__TruncateTableStatement__TablesAssignment
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
    // InternalSql_dsl.g:328:1: entryRuleTruncateTableDeclaration : ruleTruncateTableDeclaration EOF ;
    public final void entryRuleTruncateTableDeclaration() throws RecognitionException {
        try {
            // InternalSql_dsl.g:329:1: ( ruleTruncateTableDeclaration EOF )
            // InternalSql_dsl.g:330:1: ruleTruncateTableDeclaration EOF
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
    // InternalSql_dsl.g:337:1: ruleTruncateTableDeclaration : ( ( rule__TruncateTableDeclaration__Group__0 ) ) ;
    public final void ruleTruncateTableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:341:2: ( ( ( rule__TruncateTableDeclaration__Group__0 ) ) )
            // InternalSql_dsl.g:342:2: ( ( rule__TruncateTableDeclaration__Group__0 ) )
            {
            // InternalSql_dsl.g:342:2: ( ( rule__TruncateTableDeclaration__Group__0 ) )
            // InternalSql_dsl.g:343:3: ( rule__TruncateTableDeclaration__Group__0 )
            {
             before(grammarAccess.getTruncateTableDeclarationAccess().getGroup()); 
            // InternalSql_dsl.g:344:3: ( rule__TruncateTableDeclaration__Group__0 )
            // InternalSql_dsl.g:344:4: rule__TruncateTableDeclaration__Group__0
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
    // InternalSql_dsl.g:353:1: entryRuleAlterTableStatement : ruleAlterTableStatement EOF ;
    public final void entryRuleAlterTableStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:354:1: ( ruleAlterTableStatement EOF )
            // InternalSql_dsl.g:355:1: ruleAlterTableStatement EOF
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
    // InternalSql_dsl.g:362:1: ruleAlterTableStatement : ( ( rule__AlterTableStatement__Group__0 ) ) ;
    public final void ruleAlterTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:366:2: ( ( ( rule__AlterTableStatement__Group__0 ) ) )
            // InternalSql_dsl.g:367:2: ( ( rule__AlterTableStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:367:2: ( ( rule__AlterTableStatement__Group__0 ) )
            // InternalSql_dsl.g:368:3: ( rule__AlterTableStatement__Group__0 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getGroup()); 
            // InternalSql_dsl.g:369:3: ( rule__AlterTableStatement__Group__0 )
            // InternalSql_dsl.g:369:4: rule__AlterTableStatement__Group__0
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
    // InternalSql_dsl.g:378:1: entryRuleAlterDropStatement : ruleAlterDropStatement EOF ;
    public final void entryRuleAlterDropStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:379:1: ( ruleAlterDropStatement EOF )
            // InternalSql_dsl.g:380:1: ruleAlterDropStatement EOF
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
    // InternalSql_dsl.g:387:1: ruleAlterDropStatement : ( ( rule__AlterDropStatement__Group__0 ) ) ;
    public final void ruleAlterDropStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:391:2: ( ( ( rule__AlterDropStatement__Group__0 ) ) )
            // InternalSql_dsl.g:392:2: ( ( rule__AlterDropStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:392:2: ( ( rule__AlterDropStatement__Group__0 ) )
            // InternalSql_dsl.g:393:3: ( rule__AlterDropStatement__Group__0 )
            {
             before(grammarAccess.getAlterDropStatementAccess().getGroup()); 
            // InternalSql_dsl.g:394:3: ( rule__AlterDropStatement__Group__0 )
            // InternalSql_dsl.g:394:4: rule__AlterDropStatement__Group__0
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
    // InternalSql_dsl.g:403:1: entryRuleAlterAddStatement : ruleAlterAddStatement EOF ;
    public final void entryRuleAlterAddStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:404:1: ( ruleAlterAddStatement EOF )
            // InternalSql_dsl.g:405:1: ruleAlterAddStatement EOF
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
    // InternalSql_dsl.g:412:1: ruleAlterAddStatement : ( ( rule__AlterAddStatement__Group__0 ) ) ;
    public final void ruleAlterAddStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:416:2: ( ( ( rule__AlterAddStatement__Group__0 ) ) )
            // InternalSql_dsl.g:417:2: ( ( rule__AlterAddStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:417:2: ( ( rule__AlterAddStatement__Group__0 ) )
            // InternalSql_dsl.g:418:3: ( rule__AlterAddStatement__Group__0 )
            {
             before(grammarAccess.getAlterAddStatementAccess().getGroup()); 
            // InternalSql_dsl.g:419:3: ( rule__AlterAddStatement__Group__0 )
            // InternalSql_dsl.g:419:4: rule__AlterAddStatement__Group__0
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
    // InternalSql_dsl.g:428:1: entryRuleAlterUpdateStatement : ruleAlterUpdateStatement EOF ;
    public final void entryRuleAlterUpdateStatement() throws RecognitionException {
        try {
            // InternalSql_dsl.g:429:1: ( ruleAlterUpdateStatement EOF )
            // InternalSql_dsl.g:430:1: ruleAlterUpdateStatement EOF
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
    // InternalSql_dsl.g:437:1: ruleAlterUpdateStatement : ( ( rule__AlterUpdateStatement__Group__0 ) ) ;
    public final void ruleAlterUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:441:2: ( ( ( rule__AlterUpdateStatement__Group__0 ) ) )
            // InternalSql_dsl.g:442:2: ( ( rule__AlterUpdateStatement__Group__0 ) )
            {
            // InternalSql_dsl.g:442:2: ( ( rule__AlterUpdateStatement__Group__0 ) )
            // InternalSql_dsl.g:443:3: ( rule__AlterUpdateStatement__Group__0 )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getGroup()); 
            // InternalSql_dsl.g:444:3: ( rule__AlterUpdateStatement__Group__0 )
            // InternalSql_dsl.g:444:4: rule__AlterUpdateStatement__Group__0
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


    // $ANTLR start "ruleDataStructureType"
    // InternalSql_dsl.g:453:1: ruleDataStructureType : ( ( rule__DataStructureType__Alternatives ) ) ;
    public final void ruleDataStructureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:457:1: ( ( ( rule__DataStructureType__Alternatives ) ) )
            // InternalSql_dsl.g:458:2: ( ( rule__DataStructureType__Alternatives ) )
            {
            // InternalSql_dsl.g:458:2: ( ( rule__DataStructureType__Alternatives ) )
            // InternalSql_dsl.g:459:3: ( rule__DataStructureType__Alternatives )
            {
             before(grammarAccess.getDataStructureTypeAccess().getAlternatives()); 
            // InternalSql_dsl.g:460:3: ( rule__DataStructureType__Alternatives )
            // InternalSql_dsl.g:460:4: rule__DataStructureType__Alternatives
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
    // InternalSql_dsl.g:468:1: rule__Statement__Alternatives : ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:472:1: ( ( ruleDatabaseDeclarationStatement ) | ( ruleCreateTableStatement ) | ( ruleDropTableStatement ) | ( ruleTruncateTableStatement ) | ( ruleAlterTableStatement ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==19) ) {
                    alt4=1;
                }
                else if ( (LA4_1==20) ) {
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
            case 28:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            case 30:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSql_dsl.g:473:2: ( ruleDatabaseDeclarationStatement )
                    {
                    // InternalSql_dsl.g:473:2: ( ruleDatabaseDeclarationStatement )
                    // InternalSql_dsl.g:474:3: ruleDatabaseDeclarationStatement
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
                    // InternalSql_dsl.g:479:2: ( ruleCreateTableStatement )
                    {
                    // InternalSql_dsl.g:479:2: ( ruleCreateTableStatement )
                    // InternalSql_dsl.g:480:3: ruleCreateTableStatement
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
                    // InternalSql_dsl.g:485:2: ( ruleDropTableStatement )
                    {
                    // InternalSql_dsl.g:485:2: ( ruleDropTableStatement )
                    // InternalSql_dsl.g:486:3: ruleDropTableStatement
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
                    // InternalSql_dsl.g:491:2: ( ruleTruncateTableStatement )
                    {
                    // InternalSql_dsl.g:491:2: ( ruleTruncateTableStatement )
                    // InternalSql_dsl.g:492:3: ruleTruncateTableStatement
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
                    // InternalSql_dsl.g:497:2: ( ruleAlterTableStatement )
                    {
                    // InternalSql_dsl.g:497:2: ( ruleAlterTableStatement )
                    // InternalSql_dsl.g:498:3: ruleAlterTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getAlterTableStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAlterTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAlterTableStatementParserRuleCall_4()); 

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
    // InternalSql_dsl.g:507:1: rule__TableDeclaration__AttributesAlternatives_4_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TableDeclaration__AttributesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:511:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 26:
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
                    // InternalSql_dsl.g:512:2: ( ruleColumnDeclaration )
                    {
                    // InternalSql_dsl.g:512:2: ( ruleColumnDeclaration )
                    // InternalSql_dsl.g:513:3: ruleColumnDeclaration
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
                    // InternalSql_dsl.g:518:2: ( rulePrimaryKey )
                    {
                    // InternalSql_dsl.g:518:2: ( rulePrimaryKey )
                    // InternalSql_dsl.g:519:3: rulePrimaryKey
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
                    // InternalSql_dsl.g:524:2: ( ruleForeignKey )
                    {
                    // InternalSql_dsl.g:524:2: ( ruleForeignKey )
                    // InternalSql_dsl.g:525:3: ruleForeignKey
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
    // InternalSql_dsl.g:534:1: rule__TableDeclaration__AttributesAlternatives_5_1_0 : ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) );
    public final void rule__TableDeclaration__AttributesAlternatives_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:538:1: ( ( ruleColumnDeclaration ) | ( rulePrimaryKey ) | ( ruleForeignKey ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 26:
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
                    // InternalSql_dsl.g:539:2: ( ruleColumnDeclaration )
                    {
                    // InternalSql_dsl.g:539:2: ( ruleColumnDeclaration )
                    // InternalSql_dsl.g:540:3: ruleColumnDeclaration
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
                    // InternalSql_dsl.g:545:2: ( rulePrimaryKey )
                    {
                    // InternalSql_dsl.g:545:2: ( rulePrimaryKey )
                    // InternalSql_dsl.g:546:3: rulePrimaryKey
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
                    // InternalSql_dsl.g:551:2: ( ruleForeignKey )
                    {
                    // InternalSql_dsl.g:551:2: ( ruleForeignKey )
                    // InternalSql_dsl.g:552:3: ruleForeignKey
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
    // InternalSql_dsl.g:561:1: rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 : ( ( ruleAlterDropStatement ) | ( ruleAlterAddStatement ) | ( ruleAlterUpdateStatement ) );
    public final void rule__AlterTableStatement__AddDropUpdateAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:565:1: ( ( ruleAlterDropStatement ) | ( ruleAlterAddStatement ) | ( ruleAlterUpdateStatement ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 30:
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
                    // InternalSql_dsl.g:566:2: ( ruleAlterDropStatement )
                    {
                    // InternalSql_dsl.g:566:2: ( ruleAlterDropStatement )
                    // InternalSql_dsl.g:567:3: ruleAlterDropStatement
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
                    // InternalSql_dsl.g:572:2: ( ruleAlterAddStatement )
                    {
                    // InternalSql_dsl.g:572:2: ( ruleAlterAddStatement )
                    // InternalSql_dsl.g:573:3: ruleAlterAddStatement
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
                    // InternalSql_dsl.g:578:2: ( ruleAlterUpdateStatement )
                    {
                    // InternalSql_dsl.g:578:2: ( ruleAlterUpdateStatement )
                    // InternalSql_dsl.g:579:3: ruleAlterUpdateStatement
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
    // InternalSql_dsl.g:588:1: rule__DataStructureType__Alternatives : ( ( ( 'varchar' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) );
    public final void rule__DataStructureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:592:1: ( ( ( 'varchar' ) ) | ( ( 'char' ) ) | ( ( 'date' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'time' ) ) | ( ( 'text' ) ) )
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
                    // InternalSql_dsl.g:593:2: ( ( 'varchar' ) )
                    {
                    // InternalSql_dsl.g:593:2: ( ( 'varchar' ) )
                    // InternalSql_dsl.g:594:3: ( 'varchar' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 
                    // InternalSql_dsl.g:595:3: ( 'varchar' )
                    // InternalSql_dsl.g:595:4: 'varchar'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql_dsl.g:599:2: ( ( 'char' ) )
                    {
                    // InternalSql_dsl.g:599:2: ( ( 'char' ) )
                    // InternalSql_dsl.g:600:3: ( 'char' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1()); 
                    // InternalSql_dsl.g:601:3: ( 'char' )
                    // InternalSql_dsl.g:601:4: 'char'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getCHAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql_dsl.g:605:2: ( ( 'date' ) )
                    {
                    // InternalSql_dsl.g:605:2: ( ( 'date' ) )
                    // InternalSql_dsl.g:606:3: ( 'date' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2()); 
                    // InternalSql_dsl.g:607:3: ( 'date' )
                    // InternalSql_dsl.g:607:4: 'date'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql_dsl.g:611:2: ( ( 'int' ) )
                    {
                    // InternalSql_dsl.g:611:2: ( ( 'int' ) )
                    // InternalSql_dsl.g:612:3: ( 'int' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    // InternalSql_dsl.g:613:3: ( 'int' )
                    // InternalSql_dsl.g:613:4: 'int'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getINTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql_dsl.g:617:2: ( ( 'float' ) )
                    {
                    // InternalSql_dsl.g:617:2: ( ( 'float' ) )
                    // InternalSql_dsl.g:618:3: ( 'float' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // InternalSql_dsl.g:619:3: ( 'float' )
                    // InternalSql_dsl.g:619:4: 'float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSql_dsl.g:623:2: ( ( 'time' ) )
                    {
                    // InternalSql_dsl.g:623:2: ( ( 'time' ) )
                    // InternalSql_dsl.g:624:3: ( 'time' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5()); 
                    // InternalSql_dsl.g:625:3: ( 'time' )
                    // InternalSql_dsl.g:625:4: 'time'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataStructureTypeAccess().getTIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSql_dsl.g:629:2: ( ( 'text' ) )
                    {
                    // InternalSql_dsl.g:629:2: ( ( 'text' ) )
                    // InternalSql_dsl.g:630:3: ( 'text' )
                    {
                     before(grammarAccess.getDataStructureTypeAccess().getTEXTEnumLiteralDeclaration_6()); 
                    // InternalSql_dsl.g:631:3: ( 'text' )
                    // InternalSql_dsl.g:631:4: 'text'
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


    // $ANTLR start "rule__DatabaseDeclarationStatement__Group__0"
    // InternalSql_dsl.g:639:1: rule__DatabaseDeclarationStatement__Group__0 : rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1 ;
    public final void rule__DatabaseDeclarationStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:643:1: ( rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1 )
            // InternalSql_dsl.g:644:2: rule__DatabaseDeclarationStatement__Group__0__Impl rule__DatabaseDeclarationStatement__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSql_dsl.g:651:1: rule__DatabaseDeclarationStatement__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__DatabaseDeclarationStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:655:1: ( ( 'CREATE' ) )
            // InternalSql_dsl.g:656:1: ( 'CREATE' )
            {
            // InternalSql_dsl.g:656:1: ( 'CREATE' )
            // InternalSql_dsl.g:657:2: 'CREATE'
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getCREATEKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSql_dsl.g:666:1: rule__DatabaseDeclarationStatement__Group__1 : rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2 ;
    public final void rule__DatabaseDeclarationStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:670:1: ( rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2 )
            // InternalSql_dsl.g:671:2: rule__DatabaseDeclarationStatement__Group__1__Impl rule__DatabaseDeclarationStatement__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:678:1: rule__DatabaseDeclarationStatement__Group__1__Impl : ( 'DATABASE' ) ;
    public final void rule__DatabaseDeclarationStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:682:1: ( ( 'DATABASE' ) )
            // InternalSql_dsl.g:683:1: ( 'DATABASE' )
            {
            // InternalSql_dsl.g:683:1: ( 'DATABASE' )
            // InternalSql_dsl.g:684:2: 'DATABASE'
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getDATABASEKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSql_dsl.g:693:1: rule__DatabaseDeclarationStatement__Group__2 : rule__DatabaseDeclarationStatement__Group__2__Impl ;
    public final void rule__DatabaseDeclarationStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:697:1: ( rule__DatabaseDeclarationStatement__Group__2__Impl )
            // InternalSql_dsl.g:698:2: rule__DatabaseDeclarationStatement__Group__2__Impl
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
    // InternalSql_dsl.g:704:1: rule__DatabaseDeclarationStatement__Group__2__Impl : ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) ) ;
    public final void rule__DatabaseDeclarationStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:708:1: ( ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:709:1: ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:709:1: ( ( rule__DatabaseDeclarationStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:710:2: ( rule__DatabaseDeclarationStatement__NameAssignment_2 )
            {
             before(grammarAccess.getDatabaseDeclarationStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:711:2: ( rule__DatabaseDeclarationStatement__NameAssignment_2 )
            // InternalSql_dsl.g:711:3: rule__DatabaseDeclarationStatement__NameAssignment_2
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
    // InternalSql_dsl.g:720:1: rule__TableDeclaration__Group__0 : rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 ;
    public final void rule__TableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:724:1: ( rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1 )
            // InternalSql_dsl.g:725:2: rule__TableDeclaration__Group__0__Impl rule__TableDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSql_dsl.g:732:1: rule__TableDeclaration__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__TableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:736:1: ( ( 'CREATE' ) )
            // InternalSql_dsl.g:737:1: ( 'CREATE' )
            {
            // InternalSql_dsl.g:737:1: ( 'CREATE' )
            // InternalSql_dsl.g:738:2: 'CREATE'
            {
             before(grammarAccess.getTableDeclarationAccess().getCREATEKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSql_dsl.g:747:1: rule__TableDeclaration__Group__1 : rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2 ;
    public final void rule__TableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:751:1: ( rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2 )
            // InternalSql_dsl.g:752:2: rule__TableDeclaration__Group__1__Impl rule__TableDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:759:1: rule__TableDeclaration__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:763:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:764:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:764:1: ( 'TABLE' )
            // InternalSql_dsl.g:765:2: 'TABLE'
            {
             before(grammarAccess.getTableDeclarationAccess().getTABLEKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSql_dsl.g:774:1: rule__TableDeclaration__Group__2 : rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3 ;
    public final void rule__TableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:778:1: ( rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3 )
            // InternalSql_dsl.g:779:2: rule__TableDeclaration__Group__2__Impl rule__TableDeclaration__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSql_dsl.g:786:1: rule__TableDeclaration__Group__2__Impl : ( ( rule__TableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__TableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:790:1: ( ( ( rule__TableDeclaration__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:791:1: ( ( rule__TableDeclaration__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:791:1: ( ( rule__TableDeclaration__NameAssignment_2 ) )
            // InternalSql_dsl.g:792:2: ( rule__TableDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getTableDeclarationAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:793:2: ( rule__TableDeclaration__NameAssignment_2 )
            // InternalSql_dsl.g:793:3: rule__TableDeclaration__NameAssignment_2
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
    // InternalSql_dsl.g:801:1: rule__TableDeclaration__Group__3 : rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4 ;
    public final void rule__TableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:805:1: ( rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4 )
            // InternalSql_dsl.g:806:2: rule__TableDeclaration__Group__3__Impl rule__TableDeclaration__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSql_dsl.g:813:1: rule__TableDeclaration__Group__3__Impl : ( '(' ) ;
    public final void rule__TableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:817:1: ( ( '(' ) )
            // InternalSql_dsl.g:818:1: ( '(' )
            {
            // InternalSql_dsl.g:818:1: ( '(' )
            // InternalSql_dsl.g:819:2: '('
            {
             before(grammarAccess.getTableDeclarationAccess().getLeftParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSql_dsl.g:828:1: rule__TableDeclaration__Group__4 : rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5 ;
    public final void rule__TableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:832:1: ( rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5 )
            // InternalSql_dsl.g:833:2: rule__TableDeclaration__Group__4__Impl rule__TableDeclaration__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:840:1: rule__TableDeclaration__Group__4__Impl : ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) ) ;
    public final void rule__TableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:844:1: ( ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) ) )
            // InternalSql_dsl.g:845:1: ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) )
            {
            // InternalSql_dsl.g:845:1: ( ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* ) )
            // InternalSql_dsl.g:846:2: ( ( rule__TableDeclaration__AttributesAssignment_4 ) ) ( ( rule__TableDeclaration__AttributesAssignment_4 )* )
            {
            // InternalSql_dsl.g:846:2: ( ( rule__TableDeclaration__AttributesAssignment_4 ) )
            // InternalSql_dsl.g:847:3: ( rule__TableDeclaration__AttributesAssignment_4 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 
            // InternalSql_dsl.g:848:3: ( rule__TableDeclaration__AttributesAssignment_4 )
            // InternalSql_dsl.g:848:4: rule__TableDeclaration__AttributesAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__TableDeclaration__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 

            }

            // InternalSql_dsl.g:851:2: ( ( rule__TableDeclaration__AttributesAssignment_4 )* )
            // InternalSql_dsl.g:852:3: ( rule__TableDeclaration__AttributesAssignment_4 )*
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_4()); 
            // InternalSql_dsl.g:853:3: ( rule__TableDeclaration__AttributesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==24||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSql_dsl.g:853:4: rule__TableDeclaration__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalSql_dsl.g:862:1: rule__TableDeclaration__Group__5 : rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6 ;
    public final void rule__TableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:866:1: ( rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6 )
            // InternalSql_dsl.g:867:2: rule__TableDeclaration__Group__5__Impl rule__TableDeclaration__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:874:1: rule__TableDeclaration__Group__5__Impl : ( ( rule__TableDeclaration__Group_5__0 )* ) ;
    public final void rule__TableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:878:1: ( ( ( rule__TableDeclaration__Group_5__0 )* ) )
            // InternalSql_dsl.g:879:1: ( ( rule__TableDeclaration__Group_5__0 )* )
            {
            // InternalSql_dsl.g:879:1: ( ( rule__TableDeclaration__Group_5__0 )* )
            // InternalSql_dsl.g:880:2: ( rule__TableDeclaration__Group_5__0 )*
            {
             before(grammarAccess.getTableDeclarationAccess().getGroup_5()); 
            // InternalSql_dsl.g:881:2: ( rule__TableDeclaration__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSql_dsl.g:881:3: rule__TableDeclaration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalSql_dsl.g:889:1: rule__TableDeclaration__Group__6 : rule__TableDeclaration__Group__6__Impl ;
    public final void rule__TableDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:893:1: ( rule__TableDeclaration__Group__6__Impl )
            // InternalSql_dsl.g:894:2: rule__TableDeclaration__Group__6__Impl
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
    // InternalSql_dsl.g:900:1: rule__TableDeclaration__Group__6__Impl : ( ')' ) ;
    public final void rule__TableDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:904:1: ( ( ')' ) )
            // InternalSql_dsl.g:905:1: ( ')' )
            {
            // InternalSql_dsl.g:905:1: ( ')' )
            // InternalSql_dsl.g:906:2: ')'
            {
             before(grammarAccess.getTableDeclarationAccess().getRightParenthesisKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSql_dsl.g:916:1: rule__TableDeclaration__Group_5__0 : rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1 ;
    public final void rule__TableDeclaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:920:1: ( rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1 )
            // InternalSql_dsl.g:921:2: rule__TableDeclaration__Group_5__0__Impl rule__TableDeclaration__Group_5__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSql_dsl.g:928:1: rule__TableDeclaration__Group_5__0__Impl : ( ',' ) ;
    public final void rule__TableDeclaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:932:1: ( ( ',' ) )
            // InternalSql_dsl.g:933:1: ( ',' )
            {
            // InternalSql_dsl.g:933:1: ( ',' )
            // InternalSql_dsl.g:934:2: ','
            {
             before(grammarAccess.getTableDeclarationAccess().getCommaKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSql_dsl.g:943:1: rule__TableDeclaration__Group_5__1 : rule__TableDeclaration__Group_5__1__Impl ;
    public final void rule__TableDeclaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:947:1: ( rule__TableDeclaration__Group_5__1__Impl )
            // InternalSql_dsl.g:948:2: rule__TableDeclaration__Group_5__1__Impl
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
    // InternalSql_dsl.g:954:1: rule__TableDeclaration__Group_5__1__Impl : ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) ) ;
    public final void rule__TableDeclaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:958:1: ( ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) ) )
            // InternalSql_dsl.g:959:1: ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) )
            {
            // InternalSql_dsl.g:959:1: ( ( rule__TableDeclaration__AttributesAssignment_5_1 ) )
            // InternalSql_dsl.g:960:2: ( rule__TableDeclaration__AttributesAssignment_5_1 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAssignment_5_1()); 
            // InternalSql_dsl.g:961:2: ( rule__TableDeclaration__AttributesAssignment_5_1 )
            // InternalSql_dsl.g:961:3: rule__TableDeclaration__AttributesAssignment_5_1
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
    // InternalSql_dsl.g:970:1: rule__ColumnDeclaration__Group__0 : rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 ;
    public final void rule__ColumnDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:974:1: ( rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1 )
            // InternalSql_dsl.g:975:2: rule__ColumnDeclaration__Group__0__Impl rule__ColumnDeclaration__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSql_dsl.g:982:1: rule__ColumnDeclaration__Group__0__Impl : ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ColumnDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:986:1: ( ( ( rule__ColumnDeclaration__NameAssignment_0 ) ) )
            // InternalSql_dsl.g:987:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            {
            // InternalSql_dsl.g:987:1: ( ( rule__ColumnDeclaration__NameAssignment_0 ) )
            // InternalSql_dsl.g:988:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getNameAssignment_0()); 
            // InternalSql_dsl.g:989:2: ( rule__ColumnDeclaration__NameAssignment_0 )
            // InternalSql_dsl.g:989:3: rule__ColumnDeclaration__NameAssignment_0
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
    // InternalSql_dsl.g:997:1: rule__ColumnDeclaration__Group__1 : rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 ;
    public final void rule__ColumnDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1001:1: ( rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2 )
            // InternalSql_dsl.g:1002:2: rule__ColumnDeclaration__Group__1__Impl rule__ColumnDeclaration__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSql_dsl.g:1009:1: rule__ColumnDeclaration__Group__1__Impl : ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__ColumnDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1013:1: ( ( ( rule__ColumnDeclaration__TypeAssignment_1 ) ) )
            // InternalSql_dsl.g:1014:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            {
            // InternalSql_dsl.g:1014:1: ( ( rule__ColumnDeclaration__TypeAssignment_1 ) )
            // InternalSql_dsl.g:1015:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            {
             before(grammarAccess.getColumnDeclarationAccess().getTypeAssignment_1()); 
            // InternalSql_dsl.g:1016:2: ( rule__ColumnDeclaration__TypeAssignment_1 )
            // InternalSql_dsl.g:1016:3: rule__ColumnDeclaration__TypeAssignment_1
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
    // InternalSql_dsl.g:1024:1: rule__ColumnDeclaration__Group__2 : rule__ColumnDeclaration__Group__2__Impl ;
    public final void rule__ColumnDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1028:1: ( rule__ColumnDeclaration__Group__2__Impl )
            // InternalSql_dsl.g:1029:2: rule__ColumnDeclaration__Group__2__Impl
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
    // InternalSql_dsl.g:1035:1: rule__ColumnDeclaration__Group__2__Impl : ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) ;
    public final void rule__ColumnDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1039:1: ( ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? ) )
            // InternalSql_dsl.g:1040:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            {
            // InternalSql_dsl.g:1040:1: ( ( rule__ColumnDeclaration__NotNullAssignment_2 )? )
            // InternalSql_dsl.g:1041:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullAssignment_2()); 
            // InternalSql_dsl.g:1042:2: ( rule__ColumnDeclaration__NotNullAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSql_dsl.g:1042:3: rule__ColumnDeclaration__NotNullAssignment_2
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
    // InternalSql_dsl.g:1051:1: rule__PrimaryKey__Group__0 : rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 ;
    public final void rule__PrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1055:1: ( rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1 )
            // InternalSql_dsl.g:1056:2: rule__PrimaryKey__Group__0__Impl rule__PrimaryKey__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSql_dsl.g:1063:1: rule__PrimaryKey__Group__0__Impl : ( 'PRIMARY' ) ;
    public final void rule__PrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1067:1: ( ( 'PRIMARY' ) )
            // InternalSql_dsl.g:1068:1: ( 'PRIMARY' )
            {
            // InternalSql_dsl.g:1068:1: ( 'PRIMARY' )
            // InternalSql_dsl.g:1069:2: 'PRIMARY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getPRIMARYKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSql_dsl.g:1078:1: rule__PrimaryKey__Group__1 : rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 ;
    public final void rule__PrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1082:1: ( rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2 )
            // InternalSql_dsl.g:1083:2: rule__PrimaryKey__Group__1__Impl rule__PrimaryKey__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSql_dsl.g:1090:1: rule__PrimaryKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__PrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1094:1: ( ( 'KEY' ) )
            // InternalSql_dsl.g:1095:1: ( 'KEY' )
            {
            // InternalSql_dsl.g:1095:1: ( 'KEY' )
            // InternalSql_dsl.g:1096:2: 'KEY'
            {
             before(grammarAccess.getPrimaryKeyAccess().getKEYKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSql_dsl.g:1105:1: rule__PrimaryKey__Group__2 : rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 ;
    public final void rule__PrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1109:1: ( rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3 )
            // InternalSql_dsl.g:1110:2: rule__PrimaryKey__Group__2__Impl rule__PrimaryKey__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1117:1: rule__PrimaryKey__Group__2__Impl : ( '(' ) ;
    public final void rule__PrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1121:1: ( ( '(' ) )
            // InternalSql_dsl.g:1122:1: ( '(' )
            {
            // InternalSql_dsl.g:1122:1: ( '(' )
            // InternalSql_dsl.g:1123:2: '('
            {
             before(grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSql_dsl.g:1132:1: rule__PrimaryKey__Group__3 : rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 ;
    public final void rule__PrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1136:1: ( rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4 )
            // InternalSql_dsl.g:1137:2: rule__PrimaryKey__Group__3__Impl rule__PrimaryKey__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:1144:1: rule__PrimaryKey__Group__3__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) ;
    public final void rule__PrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1148:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) ) )
            // InternalSql_dsl.g:1149:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            {
            // InternalSql_dsl.g:1149:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_3 ) )
            // InternalSql_dsl.g:1150:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_3()); 
            // InternalSql_dsl.g:1151:2: ( rule__PrimaryKey__ColumnAsPKAssignment_3 )
            // InternalSql_dsl.g:1151:3: rule__PrimaryKey__ColumnAsPKAssignment_3
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
    // InternalSql_dsl.g:1159:1: rule__PrimaryKey__Group__4 : rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 ;
    public final void rule__PrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1163:1: ( rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5 )
            // InternalSql_dsl.g:1164:2: rule__PrimaryKey__Group__4__Impl rule__PrimaryKey__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:1171:1: rule__PrimaryKey__Group__4__Impl : ( ( rule__PrimaryKey__Group_4__0 )* ) ;
    public final void rule__PrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1175:1: ( ( ( rule__PrimaryKey__Group_4__0 )* ) )
            // InternalSql_dsl.g:1176:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            {
            // InternalSql_dsl.g:1176:1: ( ( rule__PrimaryKey__Group_4__0 )* )
            // InternalSql_dsl.g:1177:2: ( rule__PrimaryKey__Group_4__0 )*
            {
             before(grammarAccess.getPrimaryKeyAccess().getGroup_4()); 
            // InternalSql_dsl.g:1178:2: ( rule__PrimaryKey__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSql_dsl.g:1178:3: rule__PrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalSql_dsl.g:1186:1: rule__PrimaryKey__Group__5 : rule__PrimaryKey__Group__5__Impl ;
    public final void rule__PrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1190:1: ( rule__PrimaryKey__Group__5__Impl )
            // InternalSql_dsl.g:1191:2: rule__PrimaryKey__Group__5__Impl
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
    // InternalSql_dsl.g:1197:1: rule__PrimaryKey__Group__5__Impl : ( ')' ) ;
    public final void rule__PrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1201:1: ( ( ')' ) )
            // InternalSql_dsl.g:1202:1: ( ')' )
            {
            // InternalSql_dsl.g:1202:1: ( ')' )
            // InternalSql_dsl.g:1203:2: ')'
            {
             before(grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSql_dsl.g:1213:1: rule__PrimaryKey__Group_4__0 : rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 ;
    public final void rule__PrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1217:1: ( rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1 )
            // InternalSql_dsl.g:1218:2: rule__PrimaryKey__Group_4__0__Impl rule__PrimaryKey__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1225:1: rule__PrimaryKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__PrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1229:1: ( ( ',' ) )
            // InternalSql_dsl.g:1230:1: ( ',' )
            {
            // InternalSql_dsl.g:1230:1: ( ',' )
            // InternalSql_dsl.g:1231:2: ','
            {
             before(grammarAccess.getPrimaryKeyAccess().getCommaKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSql_dsl.g:1240:1: rule__PrimaryKey__Group_4__1 : rule__PrimaryKey__Group_4__1__Impl ;
    public final void rule__PrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1244:1: ( rule__PrimaryKey__Group_4__1__Impl )
            // InternalSql_dsl.g:1245:2: rule__PrimaryKey__Group_4__1__Impl
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
    // InternalSql_dsl.g:1251:1: rule__PrimaryKey__Group_4__1__Impl : ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) ;
    public final void rule__PrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1255:1: ( ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) ) )
            // InternalSql_dsl.g:1256:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:1256:1: ( ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 ) )
            // InternalSql_dsl.g:1257:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKAssignment_4_1()); 
            // InternalSql_dsl.g:1258:2: ( rule__PrimaryKey__ColumnAsPKAssignment_4_1 )
            // InternalSql_dsl.g:1258:3: rule__PrimaryKey__ColumnAsPKAssignment_4_1
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
    // InternalSql_dsl.g:1267:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1271:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalSql_dsl.g:1272:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSql_dsl.g:1279:1: rule__ForeignKey__Group__0__Impl : ( 'FOREIGN' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1283:1: ( ( 'FOREIGN' ) )
            // InternalSql_dsl.g:1284:1: ( 'FOREIGN' )
            {
            // InternalSql_dsl.g:1284:1: ( 'FOREIGN' )
            // InternalSql_dsl.g:1285:2: 'FOREIGN'
            {
             before(grammarAccess.getForeignKeyAccess().getFOREIGNKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSql_dsl.g:1294:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1298:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalSql_dsl.g:1299:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSql_dsl.g:1306:1: rule__ForeignKey__Group__1__Impl : ( 'KEY' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1310:1: ( ( 'KEY' ) )
            // InternalSql_dsl.g:1311:1: ( 'KEY' )
            {
            // InternalSql_dsl.g:1311:1: ( 'KEY' )
            // InternalSql_dsl.g:1312:2: 'KEY'
            {
             before(grammarAccess.getForeignKeyAccess().getKEYKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSql_dsl.g:1321:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1325:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalSql_dsl.g:1326:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1333:1: rule__ForeignKey__Group__2__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1337:1: ( ( '(' ) )
            // InternalSql_dsl.g:1338:1: ( '(' )
            {
            // InternalSql_dsl.g:1338:1: ( '(' )
            // InternalSql_dsl.g:1339:2: '('
            {
             before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSql_dsl.g:1348:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1352:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalSql_dsl.g:1353:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:1360:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1364:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) ) )
            // InternalSql_dsl.g:1365:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            {
            // InternalSql_dsl.g:1365:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_3 ) )
            // InternalSql_dsl.g:1366:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_3()); 
            // InternalSql_dsl.g:1367:2: ( rule__ForeignKey__ColumnAsFKAssignment_3 )
            // InternalSql_dsl.g:1367:3: rule__ForeignKey__ColumnAsFKAssignment_3
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
    // InternalSql_dsl.g:1375:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1379:1: ( rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5 )
            // InternalSql_dsl.g:1380:2: rule__ForeignKey__Group__4__Impl rule__ForeignKey__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:1387:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__Group_4__0 )* ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1391:1: ( ( ( rule__ForeignKey__Group_4__0 )* ) )
            // InternalSql_dsl.g:1392:1: ( ( rule__ForeignKey__Group_4__0 )* )
            {
            // InternalSql_dsl.g:1392:1: ( ( rule__ForeignKey__Group_4__0 )* )
            // InternalSql_dsl.g:1393:2: ( rule__ForeignKey__Group_4__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_4()); 
            // InternalSql_dsl.g:1394:2: ( rule__ForeignKey__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSql_dsl.g:1394:3: rule__ForeignKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalSql_dsl.g:1402:1: rule__ForeignKey__Group__5 : rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 ;
    public final void rule__ForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1406:1: ( rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6 )
            // InternalSql_dsl.g:1407:2: rule__ForeignKey__Group__5__Impl rule__ForeignKey__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalSql_dsl.g:1414:1: rule__ForeignKey__Group__5__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1418:1: ( ( ')' ) )
            // InternalSql_dsl.g:1419:1: ( ')' )
            {
            // InternalSql_dsl.g:1419:1: ( ')' )
            // InternalSql_dsl.g:1420:2: ')'
            {
             before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSql_dsl.g:1429:1: rule__ForeignKey__Group__6 : rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 ;
    public final void rule__ForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1433:1: ( rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7 )
            // InternalSql_dsl.g:1434:2: rule__ForeignKey__Group__6__Impl rule__ForeignKey__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1441:1: rule__ForeignKey__Group__6__Impl : ( 'REFERENCES' ) ;
    public final void rule__ForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1445:1: ( ( 'REFERENCES' ) )
            // InternalSql_dsl.g:1446:1: ( 'REFERENCES' )
            {
            // InternalSql_dsl.g:1446:1: ( 'REFERENCES' )
            // InternalSql_dsl.g:1447:2: 'REFERENCES'
            {
             before(grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSql_dsl.g:1456:1: rule__ForeignKey__Group__7 : rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 ;
    public final void rule__ForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1460:1: ( rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8 )
            // InternalSql_dsl.g:1461:2: rule__ForeignKey__Group__7__Impl rule__ForeignKey__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalSql_dsl.g:1468:1: rule__ForeignKey__Group__7__Impl : ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) ;
    public final void rule__ForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1472:1: ( ( ( rule__ForeignKey__ForeignTableAssignment_7 ) ) )
            // InternalSql_dsl.g:1473:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            {
            // InternalSql_dsl.g:1473:1: ( ( rule__ForeignKey__ForeignTableAssignment_7 ) )
            // InternalSql_dsl.g:1474:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableAssignment_7()); 
            // InternalSql_dsl.g:1475:2: ( rule__ForeignKey__ForeignTableAssignment_7 )
            // InternalSql_dsl.g:1475:3: rule__ForeignKey__ForeignTableAssignment_7
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
    // InternalSql_dsl.g:1483:1: rule__ForeignKey__Group__8 : rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 ;
    public final void rule__ForeignKey__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1487:1: ( rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9 )
            // InternalSql_dsl.g:1488:2: rule__ForeignKey__Group__8__Impl rule__ForeignKey__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1495:1: rule__ForeignKey__Group__8__Impl : ( '(' ) ;
    public final void rule__ForeignKey__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1499:1: ( ( '(' ) )
            // InternalSql_dsl.g:1500:1: ( '(' )
            {
            // InternalSql_dsl.g:1500:1: ( '(' )
            // InternalSql_dsl.g:1501:2: '('
            {
             before(grammarAccess.getForeignKeyAccess().getLeftParenthesisKeyword_8()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSql_dsl.g:1510:1: rule__ForeignKey__Group__9 : rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 ;
    public final void rule__ForeignKey__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1514:1: ( rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10 )
            // InternalSql_dsl.g:1515:2: rule__ForeignKey__Group__9__Impl rule__ForeignKey__Group__10
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:1522:1: rule__ForeignKey__Group__9__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) ;
    public final void rule__ForeignKey__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1526:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) ) )
            // InternalSql_dsl.g:1527:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            {
            // InternalSql_dsl.g:1527:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_9 ) )
            // InternalSql_dsl.g:1528:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_9()); 
            // InternalSql_dsl.g:1529:2: ( rule__ForeignKey__ForeignColumnsAssignment_9 )
            // InternalSql_dsl.g:1529:3: rule__ForeignKey__ForeignColumnsAssignment_9
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
    // InternalSql_dsl.g:1537:1: rule__ForeignKey__Group__10 : rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 ;
    public final void rule__ForeignKey__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1541:1: ( rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11 )
            // InternalSql_dsl.g:1542:2: rule__ForeignKey__Group__10__Impl rule__ForeignKey__Group__11
            {
            pushFollow(FOLLOW_11);
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
    // InternalSql_dsl.g:1549:1: rule__ForeignKey__Group__10__Impl : ( ( rule__ForeignKey__Group_10__0 )* ) ;
    public final void rule__ForeignKey__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1553:1: ( ( ( rule__ForeignKey__Group_10__0 )* ) )
            // InternalSql_dsl.g:1554:1: ( ( rule__ForeignKey__Group_10__0 )* )
            {
            // InternalSql_dsl.g:1554:1: ( ( rule__ForeignKey__Group_10__0 )* )
            // InternalSql_dsl.g:1555:2: ( rule__ForeignKey__Group_10__0 )*
            {
             before(grammarAccess.getForeignKeyAccess().getGroup_10()); 
            // InternalSql_dsl.g:1556:2: ( rule__ForeignKey__Group_10__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSql_dsl.g:1556:3: rule__ForeignKey__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalSql_dsl.g:1564:1: rule__ForeignKey__Group__11 : rule__ForeignKey__Group__11__Impl ;
    public final void rule__ForeignKey__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1568:1: ( rule__ForeignKey__Group__11__Impl )
            // InternalSql_dsl.g:1569:2: rule__ForeignKey__Group__11__Impl
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
    // InternalSql_dsl.g:1575:1: rule__ForeignKey__Group__11__Impl : ( ')' ) ;
    public final void rule__ForeignKey__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1579:1: ( ( ')' ) )
            // InternalSql_dsl.g:1580:1: ( ')' )
            {
            // InternalSql_dsl.g:1580:1: ( ')' )
            // InternalSql_dsl.g:1581:2: ')'
            {
             before(grammarAccess.getForeignKeyAccess().getRightParenthesisKeyword_11()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSql_dsl.g:1591:1: rule__ForeignKey__Group_4__0 : rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 ;
    public final void rule__ForeignKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1595:1: ( rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1 )
            // InternalSql_dsl.g:1596:2: rule__ForeignKey__Group_4__0__Impl rule__ForeignKey__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1603:1: rule__ForeignKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1607:1: ( ( ',' ) )
            // InternalSql_dsl.g:1608:1: ( ',' )
            {
            // InternalSql_dsl.g:1608:1: ( ',' )
            // InternalSql_dsl.g:1609:2: ','
            {
             before(grammarAccess.getForeignKeyAccess().getCommaKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSql_dsl.g:1618:1: rule__ForeignKey__Group_4__1 : rule__ForeignKey__Group_4__1__Impl ;
    public final void rule__ForeignKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1622:1: ( rule__ForeignKey__Group_4__1__Impl )
            // InternalSql_dsl.g:1623:2: rule__ForeignKey__Group_4__1__Impl
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
    // InternalSql_dsl.g:1629:1: rule__ForeignKey__Group_4__1__Impl : ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) ;
    public final void rule__ForeignKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1633:1: ( ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) ) )
            // InternalSql_dsl.g:1634:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            {
            // InternalSql_dsl.g:1634:1: ( ( rule__ForeignKey__ColumnAsFKAssignment_4_1 ) )
            // InternalSql_dsl.g:1635:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKAssignment_4_1()); 
            // InternalSql_dsl.g:1636:2: ( rule__ForeignKey__ColumnAsFKAssignment_4_1 )
            // InternalSql_dsl.g:1636:3: rule__ForeignKey__ColumnAsFKAssignment_4_1
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
    // InternalSql_dsl.g:1645:1: rule__ForeignKey__Group_10__0 : rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 ;
    public final void rule__ForeignKey__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1649:1: ( rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1 )
            // InternalSql_dsl.g:1650:2: rule__ForeignKey__Group_10__0__Impl rule__ForeignKey__Group_10__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1657:1: rule__ForeignKey__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ForeignKey__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1661:1: ( ( ',' ) )
            // InternalSql_dsl.g:1662:1: ( ',' )
            {
            // InternalSql_dsl.g:1662:1: ( ',' )
            // InternalSql_dsl.g:1663:2: ','
            {
             before(grammarAccess.getForeignKeyAccess().getCommaKeyword_10_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSql_dsl.g:1672:1: rule__ForeignKey__Group_10__1 : rule__ForeignKey__Group_10__1__Impl ;
    public final void rule__ForeignKey__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1676:1: ( rule__ForeignKey__Group_10__1__Impl )
            // InternalSql_dsl.g:1677:2: rule__ForeignKey__Group_10__1__Impl
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
    // InternalSql_dsl.g:1683:1: rule__ForeignKey__Group_10__1__Impl : ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) ;
    public final void rule__ForeignKey__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1687:1: ( ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) ) )
            // InternalSql_dsl.g:1688:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            {
            // InternalSql_dsl.g:1688:1: ( ( rule__ForeignKey__ForeignColumnsAssignment_10_1 ) )
            // InternalSql_dsl.g:1689:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsAssignment_10_1()); 
            // InternalSql_dsl.g:1690:2: ( rule__ForeignKey__ForeignColumnsAssignment_10_1 )
            // InternalSql_dsl.g:1690:3: rule__ForeignKey__ForeignColumnsAssignment_10_1
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
    // InternalSql_dsl.g:1699:1: rule__DropTableDeclaration__Group__0 : rule__DropTableDeclaration__Group__0__Impl rule__DropTableDeclaration__Group__1 ;
    public final void rule__DropTableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1703:1: ( rule__DropTableDeclaration__Group__0__Impl rule__DropTableDeclaration__Group__1 )
            // InternalSql_dsl.g:1704:2: rule__DropTableDeclaration__Group__0__Impl rule__DropTableDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSql_dsl.g:1711:1: rule__DropTableDeclaration__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DropTableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1715:1: ( ( 'DROP' ) )
            // InternalSql_dsl.g:1716:1: ( 'DROP' )
            {
            // InternalSql_dsl.g:1716:1: ( 'DROP' )
            // InternalSql_dsl.g:1717:2: 'DROP'
            {
             before(grammarAccess.getDropTableDeclarationAccess().getDROPKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSql_dsl.g:1726:1: rule__DropTableDeclaration__Group__1 : rule__DropTableDeclaration__Group__1__Impl rule__DropTableDeclaration__Group__2 ;
    public final void rule__DropTableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1730:1: ( rule__DropTableDeclaration__Group__1__Impl rule__DropTableDeclaration__Group__2 )
            // InternalSql_dsl.g:1731:2: rule__DropTableDeclaration__Group__1__Impl rule__DropTableDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1738:1: rule__DropTableDeclaration__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__DropTableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1742:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:1743:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:1743:1: ( 'TABLE' )
            // InternalSql_dsl.g:1744:2: 'TABLE'
            {
             before(grammarAccess.getDropTableDeclarationAccess().getTABLEKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSql_dsl.g:1753:1: rule__DropTableDeclaration__Group__2 : rule__DropTableDeclaration__Group__2__Impl ;
    public final void rule__DropTableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1757:1: ( rule__DropTableDeclaration__Group__2__Impl )
            // InternalSql_dsl.g:1758:2: rule__DropTableDeclaration__Group__2__Impl
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
    // InternalSql_dsl.g:1764:1: rule__DropTableDeclaration__Group__2__Impl : ( ( rule__DropTableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__DropTableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1768:1: ( ( ( rule__DropTableDeclaration__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:1769:1: ( ( rule__DropTableDeclaration__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:1769:1: ( ( rule__DropTableDeclaration__NameAssignment_2 ) )
            // InternalSql_dsl.g:1770:2: ( rule__DropTableDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getDropTableDeclarationAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:1771:2: ( rule__DropTableDeclaration__NameAssignment_2 )
            // InternalSql_dsl.g:1771:3: rule__DropTableDeclaration__NameAssignment_2
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
    // InternalSql_dsl.g:1780:1: rule__TruncateTableDeclaration__Group__0 : rule__TruncateTableDeclaration__Group__0__Impl rule__TruncateTableDeclaration__Group__1 ;
    public final void rule__TruncateTableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1784:1: ( rule__TruncateTableDeclaration__Group__0__Impl rule__TruncateTableDeclaration__Group__1 )
            // InternalSql_dsl.g:1785:2: rule__TruncateTableDeclaration__Group__0__Impl rule__TruncateTableDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSql_dsl.g:1792:1: rule__TruncateTableDeclaration__Group__0__Impl : ( 'TRUNCATE' ) ;
    public final void rule__TruncateTableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1796:1: ( ( 'TRUNCATE' ) )
            // InternalSql_dsl.g:1797:1: ( 'TRUNCATE' )
            {
            // InternalSql_dsl.g:1797:1: ( 'TRUNCATE' )
            // InternalSql_dsl.g:1798:2: 'TRUNCATE'
            {
             before(grammarAccess.getTruncateTableDeclarationAccess().getTRUNCATEKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSql_dsl.g:1807:1: rule__TruncateTableDeclaration__Group__1 : rule__TruncateTableDeclaration__Group__1__Impl rule__TruncateTableDeclaration__Group__2 ;
    public final void rule__TruncateTableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1811:1: ( rule__TruncateTableDeclaration__Group__1__Impl rule__TruncateTableDeclaration__Group__2 )
            // InternalSql_dsl.g:1812:2: rule__TruncateTableDeclaration__Group__1__Impl rule__TruncateTableDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1819:1: rule__TruncateTableDeclaration__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__TruncateTableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1823:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:1824:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:1824:1: ( 'TABLE' )
            // InternalSql_dsl.g:1825:2: 'TABLE'
            {
             before(grammarAccess.getTruncateTableDeclarationAccess().getTABLEKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSql_dsl.g:1834:1: rule__TruncateTableDeclaration__Group__2 : rule__TruncateTableDeclaration__Group__2__Impl ;
    public final void rule__TruncateTableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1838:1: ( rule__TruncateTableDeclaration__Group__2__Impl )
            // InternalSql_dsl.g:1839:2: rule__TruncateTableDeclaration__Group__2__Impl
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
    // InternalSql_dsl.g:1845:1: rule__TruncateTableDeclaration__Group__2__Impl : ( ( rule__TruncateTableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__TruncateTableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1849:1: ( ( ( rule__TruncateTableDeclaration__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:1850:1: ( ( rule__TruncateTableDeclaration__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:1850:1: ( ( rule__TruncateTableDeclaration__NameAssignment_2 ) )
            // InternalSql_dsl.g:1851:2: ( rule__TruncateTableDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getTruncateTableDeclarationAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:1852:2: ( rule__TruncateTableDeclaration__NameAssignment_2 )
            // InternalSql_dsl.g:1852:3: rule__TruncateTableDeclaration__NameAssignment_2
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
    // InternalSql_dsl.g:1861:1: rule__AlterTableStatement__Group__0 : rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1 ;
    public final void rule__AlterTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1865:1: ( rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1 )
            // InternalSql_dsl.g:1866:2: rule__AlterTableStatement__Group__0__Impl rule__AlterTableStatement__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSql_dsl.g:1873:1: rule__AlterTableStatement__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__AlterTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1877:1: ( ( 'ALTER' ) )
            // InternalSql_dsl.g:1878:1: ( 'ALTER' )
            {
            // InternalSql_dsl.g:1878:1: ( 'ALTER' )
            // InternalSql_dsl.g:1879:2: 'ALTER'
            {
             before(grammarAccess.getAlterTableStatementAccess().getALTERKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSql_dsl.g:1888:1: rule__AlterTableStatement__Group__1 : rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2 ;
    public final void rule__AlterTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1892:1: ( rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2 )
            // InternalSql_dsl.g:1893:2: rule__AlterTableStatement__Group__1__Impl rule__AlterTableStatement__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:1900:1: rule__AlterTableStatement__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__AlterTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1904:1: ( ( 'TABLE' ) )
            // InternalSql_dsl.g:1905:1: ( 'TABLE' )
            {
            // InternalSql_dsl.g:1905:1: ( 'TABLE' )
            // InternalSql_dsl.g:1906:2: 'TABLE'
            {
             before(grammarAccess.getAlterTableStatementAccess().getTABLEKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSql_dsl.g:1915:1: rule__AlterTableStatement__Group__2 : rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3 ;
    public final void rule__AlterTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1919:1: ( rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3 )
            // InternalSql_dsl.g:1920:2: rule__AlterTableStatement__Group__2__Impl rule__AlterTableStatement__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalSql_dsl.g:1927:1: rule__AlterTableStatement__Group__2__Impl : ( ( rule__AlterTableStatement__NameAssignment_2 ) ) ;
    public final void rule__AlterTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1931:1: ( ( ( rule__AlterTableStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:1932:1: ( ( rule__AlterTableStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:1932:1: ( ( rule__AlterTableStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:1933:2: ( rule__AlterTableStatement__NameAssignment_2 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:1934:2: ( rule__AlterTableStatement__NameAssignment_2 )
            // InternalSql_dsl.g:1934:3: rule__AlterTableStatement__NameAssignment_2
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
    // InternalSql_dsl.g:1942:1: rule__AlterTableStatement__Group__3 : rule__AlterTableStatement__Group__3__Impl ;
    public final void rule__AlterTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1946:1: ( rule__AlterTableStatement__Group__3__Impl )
            // InternalSql_dsl.g:1947:2: rule__AlterTableStatement__Group__3__Impl
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
    // InternalSql_dsl.g:1953:1: rule__AlterTableStatement__Group__3__Impl : ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) ) ;
    public final void rule__AlterTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1957:1: ( ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) ) )
            // InternalSql_dsl.g:1958:1: ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) )
            {
            // InternalSql_dsl.g:1958:1: ( ( rule__AlterTableStatement__AddDropUpdateAssignment_3 ) )
            // InternalSql_dsl.g:1959:2: ( rule__AlterTableStatement__AddDropUpdateAssignment_3 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAssignment_3()); 
            // InternalSql_dsl.g:1960:2: ( rule__AlterTableStatement__AddDropUpdateAssignment_3 )
            // InternalSql_dsl.g:1960:3: rule__AlterTableStatement__AddDropUpdateAssignment_3
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
    // InternalSql_dsl.g:1969:1: rule__AlterDropStatement__Group__0 : rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1 ;
    public final void rule__AlterDropStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1973:1: ( rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1 )
            // InternalSql_dsl.g:1974:2: rule__AlterDropStatement__Group__0__Impl rule__AlterDropStatement__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSql_dsl.g:1981:1: rule__AlterDropStatement__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__AlterDropStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:1985:1: ( ( 'DROP' ) )
            // InternalSql_dsl.g:1986:1: ( 'DROP' )
            {
            // InternalSql_dsl.g:1986:1: ( 'DROP' )
            // InternalSql_dsl.g:1987:2: 'DROP'
            {
             before(grammarAccess.getAlterDropStatementAccess().getDROPKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSql_dsl.g:1996:1: rule__AlterDropStatement__Group__1 : rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2 ;
    public final void rule__AlterDropStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2000:1: ( rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2 )
            // InternalSql_dsl.g:2001:2: rule__AlterDropStatement__Group__1__Impl rule__AlterDropStatement__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:2008:1: rule__AlterDropStatement__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__AlterDropStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2012:1: ( ( 'COLUMN' ) )
            // InternalSql_dsl.g:2013:1: ( 'COLUMN' )
            {
            // InternalSql_dsl.g:2013:1: ( 'COLUMN' )
            // InternalSql_dsl.g:2014:2: 'COLUMN'
            {
             before(grammarAccess.getAlterDropStatementAccess().getCOLUMNKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSql_dsl.g:2023:1: rule__AlterDropStatement__Group__2 : rule__AlterDropStatement__Group__2__Impl ;
    public final void rule__AlterDropStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2027:1: ( rule__AlterDropStatement__Group__2__Impl )
            // InternalSql_dsl.g:2028:2: rule__AlterDropStatement__Group__2__Impl
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
    // InternalSql_dsl.g:2034:1: rule__AlterDropStatement__Group__2__Impl : ( ( rule__AlterDropStatement__NameAssignment_2 ) ) ;
    public final void rule__AlterDropStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2038:1: ( ( ( rule__AlterDropStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:2039:1: ( ( rule__AlterDropStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:2039:1: ( ( rule__AlterDropStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:2040:2: ( rule__AlterDropStatement__NameAssignment_2 )
            {
             before(grammarAccess.getAlterDropStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:2041:2: ( rule__AlterDropStatement__NameAssignment_2 )
            // InternalSql_dsl.g:2041:3: rule__AlterDropStatement__NameAssignment_2
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
    // InternalSql_dsl.g:2050:1: rule__AlterAddStatement__Group__0 : rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1 ;
    public final void rule__AlterAddStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2054:1: ( rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1 )
            // InternalSql_dsl.g:2055:2: rule__AlterAddStatement__Group__0__Impl rule__AlterAddStatement__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:2062:1: rule__AlterAddStatement__Group__0__Impl : ( 'ADD' ) ;
    public final void rule__AlterAddStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2066:1: ( ( 'ADD' ) )
            // InternalSql_dsl.g:2067:1: ( 'ADD' )
            {
            // InternalSql_dsl.g:2067:1: ( 'ADD' )
            // InternalSql_dsl.g:2068:2: 'ADD'
            {
             before(grammarAccess.getAlterAddStatementAccess().getADDKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSql_dsl.g:2077:1: rule__AlterAddStatement__Group__1 : rule__AlterAddStatement__Group__1__Impl ;
    public final void rule__AlterAddStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2081:1: ( rule__AlterAddStatement__Group__1__Impl )
            // InternalSql_dsl.g:2082:2: rule__AlterAddStatement__Group__1__Impl
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
    // InternalSql_dsl.g:2088:1: rule__AlterAddStatement__Group__1__Impl : ( ( rule__AlterAddStatement__ColumnAssignment_1 ) ) ;
    public final void rule__AlterAddStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2092:1: ( ( ( rule__AlterAddStatement__ColumnAssignment_1 ) ) )
            // InternalSql_dsl.g:2093:1: ( ( rule__AlterAddStatement__ColumnAssignment_1 ) )
            {
            // InternalSql_dsl.g:2093:1: ( ( rule__AlterAddStatement__ColumnAssignment_1 ) )
            // InternalSql_dsl.g:2094:2: ( rule__AlterAddStatement__ColumnAssignment_1 )
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnAssignment_1()); 
            // InternalSql_dsl.g:2095:2: ( rule__AlterAddStatement__ColumnAssignment_1 )
            // InternalSql_dsl.g:2095:3: rule__AlterAddStatement__ColumnAssignment_1
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
    // InternalSql_dsl.g:2104:1: rule__AlterUpdateStatement__Group__0 : rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1 ;
    public final void rule__AlterUpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2108:1: ( rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1 )
            // InternalSql_dsl.g:2109:2: rule__AlterUpdateStatement__Group__0__Impl rule__AlterUpdateStatement__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSql_dsl.g:2116:1: rule__AlterUpdateStatement__Group__0__Impl : ( 'ALTER' ) ;
    public final void rule__AlterUpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2120:1: ( ( 'ALTER' ) )
            // InternalSql_dsl.g:2121:1: ( 'ALTER' )
            {
            // InternalSql_dsl.g:2121:1: ( 'ALTER' )
            // InternalSql_dsl.g:2122:2: 'ALTER'
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getALTERKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSql_dsl.g:2131:1: rule__AlterUpdateStatement__Group__1 : rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2 ;
    public final void rule__AlterUpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2135:1: ( rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2 )
            // InternalSql_dsl.g:2136:2: rule__AlterUpdateStatement__Group__1__Impl rule__AlterUpdateStatement__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSql_dsl.g:2143:1: rule__AlterUpdateStatement__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__AlterUpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2147:1: ( ( 'COLUMN' ) )
            // InternalSql_dsl.g:2148:1: ( 'COLUMN' )
            {
            // InternalSql_dsl.g:2148:1: ( 'COLUMN' )
            // InternalSql_dsl.g:2149:2: 'COLUMN'
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getCOLUMNKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSql_dsl.g:2158:1: rule__AlterUpdateStatement__Group__2 : rule__AlterUpdateStatement__Group__2__Impl ;
    public final void rule__AlterUpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2162:1: ( rule__AlterUpdateStatement__Group__2__Impl )
            // InternalSql_dsl.g:2163:2: rule__AlterUpdateStatement__Group__2__Impl
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
    // InternalSql_dsl.g:2169:1: rule__AlterUpdateStatement__Group__2__Impl : ( ( rule__AlterUpdateStatement__NameAssignment_2 ) ) ;
    public final void rule__AlterUpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2173:1: ( ( ( rule__AlterUpdateStatement__NameAssignment_2 ) ) )
            // InternalSql_dsl.g:2174:1: ( ( rule__AlterUpdateStatement__NameAssignment_2 ) )
            {
            // InternalSql_dsl.g:2174:1: ( ( rule__AlterUpdateStatement__NameAssignment_2 ) )
            // InternalSql_dsl.g:2175:2: ( rule__AlterUpdateStatement__NameAssignment_2 )
            {
             before(grammarAccess.getAlterUpdateStatementAccess().getNameAssignment_2()); 
            // InternalSql_dsl.g:2176:2: ( rule__AlterUpdateStatement__NameAssignment_2 )
            // InternalSql_dsl.g:2176:3: rule__AlterUpdateStatement__NameAssignment_2
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


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalSql_dsl.g:2185:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2189:1: ( ( ruleStatement ) )
            // InternalSql_dsl.g:2190:2: ( ruleStatement )
            {
            // InternalSql_dsl.g:2190:2: ( ruleStatement )
            // InternalSql_dsl.g:2191:3: ruleStatement
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


    // $ANTLR start "rule__DatabaseDeclarationStatement__NameAssignment_2"
    // InternalSql_dsl.g:2200:1: rule__DatabaseDeclarationStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DatabaseDeclarationStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2204:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2205:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2205:2: ( RULE_ID )
            // InternalSql_dsl.g:2206:3: RULE_ID
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
    // InternalSql_dsl.g:2215:1: rule__CreateTableStatement__TablesAssignment : ( ruleTableDeclaration ) ;
    public final void rule__CreateTableStatement__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2219:1: ( ( ruleTableDeclaration ) )
            // InternalSql_dsl.g:2220:2: ( ruleTableDeclaration )
            {
            // InternalSql_dsl.g:2220:2: ( ruleTableDeclaration )
            // InternalSql_dsl.g:2221:3: ruleTableDeclaration
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
    // InternalSql_dsl.g:2230:1: rule__TableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2234:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2235:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2235:2: ( RULE_ID )
            // InternalSql_dsl.g:2236:3: RULE_ID
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
    // InternalSql_dsl.g:2245:1: rule__TableDeclaration__AttributesAssignment_4 : ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) ) ;
    public final void rule__TableDeclaration__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2249:1: ( ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) ) )
            // InternalSql_dsl.g:2250:2: ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) )
            {
            // InternalSql_dsl.g:2250:2: ( ( rule__TableDeclaration__AttributesAlternatives_4_0 ) )
            // InternalSql_dsl.g:2251:3: ( rule__TableDeclaration__AttributesAlternatives_4_0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_4_0()); 
            // InternalSql_dsl.g:2252:3: ( rule__TableDeclaration__AttributesAlternatives_4_0 )
            // InternalSql_dsl.g:2252:4: rule__TableDeclaration__AttributesAlternatives_4_0
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
    // InternalSql_dsl.g:2260:1: rule__TableDeclaration__AttributesAssignment_5_1 : ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) ) ;
    public final void rule__TableDeclaration__AttributesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2264:1: ( ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) ) )
            // InternalSql_dsl.g:2265:2: ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) )
            {
            // InternalSql_dsl.g:2265:2: ( ( rule__TableDeclaration__AttributesAlternatives_5_1_0 ) )
            // InternalSql_dsl.g:2266:3: ( rule__TableDeclaration__AttributesAlternatives_5_1_0 )
            {
             before(grammarAccess.getTableDeclarationAccess().getAttributesAlternatives_5_1_0()); 
            // InternalSql_dsl.g:2267:3: ( rule__TableDeclaration__AttributesAlternatives_5_1_0 )
            // InternalSql_dsl.g:2267:4: rule__TableDeclaration__AttributesAlternatives_5_1_0
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
    // InternalSql_dsl.g:2275:1: rule__ColumnDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ColumnDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2279:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2280:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2280:2: ( RULE_ID )
            // InternalSql_dsl.g:2281:3: RULE_ID
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
    // InternalSql_dsl.g:2290:1: rule__ColumnDeclaration__TypeAssignment_1 : ( ruleDataStructureType ) ;
    public final void rule__ColumnDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2294:1: ( ( ruleDataStructureType ) )
            // InternalSql_dsl.g:2295:2: ( ruleDataStructureType )
            {
            // InternalSql_dsl.g:2295:2: ( ruleDataStructureType )
            // InternalSql_dsl.g:2296:3: ruleDataStructureType
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
    // InternalSql_dsl.g:2305:1: rule__ColumnDeclaration__NotNullAssignment_2 : ( ( 'NOT NULL' ) ) ;
    public final void rule__ColumnDeclaration__NotNullAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2309:1: ( ( ( 'NOT NULL' ) ) )
            // InternalSql_dsl.g:2310:2: ( ( 'NOT NULL' ) )
            {
            // InternalSql_dsl.g:2310:2: ( ( 'NOT NULL' ) )
            // InternalSql_dsl.g:2311:3: ( 'NOT NULL' )
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0()); 
            // InternalSql_dsl.g:2312:3: ( 'NOT NULL' )
            // InternalSql_dsl.g:2313:4: 'NOT NULL'
            {
             before(grammarAccess.getColumnDeclarationAccess().getNotNullNOTNULLKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSql_dsl.g:2324:1: rule__PrimaryKey__ColumnAsPKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2328:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2329:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2329:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2330:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationCrossReference_3_0()); 
            // InternalSql_dsl.g:2331:3: ( RULE_ID )
            // InternalSql_dsl.g:2332:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationCrossReference_3_0()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2343:1: rule__PrimaryKey__ColumnAsPKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryKey__ColumnAsPKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2347:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2348:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2348:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2349:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationCrossReference_4_1_0()); 
            // InternalSql_dsl.g:2350:3: ( RULE_ID )
            // InternalSql_dsl.g:2351:4: RULE_ID
            {
             before(grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getColumnAsPKColumnDeclarationCrossReference_4_1_0()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2362:1: rule__ForeignKey__ColumnAsFKAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2366:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2367:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2367:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2368:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationCrossReference_3_0()); 
            // InternalSql_dsl.g:2369:3: ( RULE_ID )
            // InternalSql_dsl.g:2370:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationCrossReference_3_0()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2381:1: rule__ForeignKey__ColumnAsFKAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ColumnAsFKAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2385:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2386:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2386:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2387:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationCrossReference_4_1_0()); 
            // InternalSql_dsl.g:2388:3: ( RULE_ID )
            // InternalSql_dsl.g:2389:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getColumnAsFKColumnDeclarationCrossReference_4_1_0()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2400:1: rule__ForeignKey__ForeignTableAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignTableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2404:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2405:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2405:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2406:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignTableTableDeclarationCrossReference_7_0()); 
            // InternalSql_dsl.g:2407:3: ( RULE_ID )
            // InternalSql_dsl.g:2408:4: RULE_ID
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
    // InternalSql_dsl.g:2419:1: rule__ForeignKey__ForeignColumnsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2423:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2424:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2424:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2425:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationCrossReference_9_0()); 
            // InternalSql_dsl.g:2426:3: ( RULE_ID )
            // InternalSql_dsl.g:2427:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationCrossReference_9_0()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2438:1: rule__ForeignKey__ForeignColumnsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__ForeignColumnsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2442:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2443:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2443:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2444:3: ( RULE_ID )
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationCrossReference_10_1_0()); 
            // InternalSql_dsl.g:2445:3: ( RULE_ID )
            // InternalSql_dsl.g:2446:4: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getForeignKeyAccess().getForeignColumnsColumnDeclarationCrossReference_10_1_0()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2457:1: rule__DropTableStatement__TablesAssignment : ( ruleDropTableDeclaration ) ;
    public final void rule__DropTableStatement__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2461:1: ( ( ruleDropTableDeclaration ) )
            // InternalSql_dsl.g:2462:2: ( ruleDropTableDeclaration )
            {
            // InternalSql_dsl.g:2462:2: ( ruleDropTableDeclaration )
            // InternalSql_dsl.g:2463:3: ruleDropTableDeclaration
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
    // InternalSql_dsl.g:2472:1: rule__DropTableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DropTableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2476:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2477:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2477:2: ( RULE_ID )
            // InternalSql_dsl.g:2478:3: RULE_ID
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
    // InternalSql_dsl.g:2487:1: rule__TruncateTableStatement__TablesAssignment : ( ruleTruncateTableDeclaration ) ;
    public final void rule__TruncateTableStatement__TablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2491:1: ( ( ruleTruncateTableDeclaration ) )
            // InternalSql_dsl.g:2492:2: ( ruleTruncateTableDeclaration )
            {
            // InternalSql_dsl.g:2492:2: ( ruleTruncateTableDeclaration )
            // InternalSql_dsl.g:2493:3: ruleTruncateTableDeclaration
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
    // InternalSql_dsl.g:2502:1: rule__TruncateTableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TruncateTableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2506:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2507:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2507:2: ( RULE_ID )
            // InternalSql_dsl.g:2508:3: RULE_ID
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
    // InternalSql_dsl.g:2517:1: rule__AlterTableStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AlterTableStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2521:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2522:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2522:2: ( RULE_ID )
            // InternalSql_dsl.g:2523:3: RULE_ID
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
    // InternalSql_dsl.g:2532:1: rule__AlterTableStatement__AddDropUpdateAssignment_3 : ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) ) ;
    public final void rule__AlterTableStatement__AddDropUpdateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2536:1: ( ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) ) )
            // InternalSql_dsl.g:2537:2: ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) )
            {
            // InternalSql_dsl.g:2537:2: ( ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 ) )
            // InternalSql_dsl.g:2538:3: ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 )
            {
             before(grammarAccess.getAlterTableStatementAccess().getAddDropUpdateAlternatives_3_0()); 
            // InternalSql_dsl.g:2539:3: ( rule__AlterTableStatement__AddDropUpdateAlternatives_3_0 )
            // InternalSql_dsl.g:2539:4: rule__AlterTableStatement__AddDropUpdateAlternatives_3_0
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
    // InternalSql_dsl.g:2547:1: rule__AlterDropStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AlterDropStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2551:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2552:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2552:2: ( RULE_ID )
            // InternalSql_dsl.g:2553:3: RULE_ID
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
    // InternalSql_dsl.g:2562:1: rule__AlterAddStatement__ColumnAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AlterAddStatement__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2566:1: ( ( ( RULE_ID ) ) )
            // InternalSql_dsl.g:2567:2: ( ( RULE_ID ) )
            {
            // InternalSql_dsl.g:2567:2: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2568:3: ( RULE_ID )
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnColumnDeclarationCrossReference_1_0()); 
            // InternalSql_dsl.g:2569:3: ( RULE_ID )
            // InternalSql_dsl.g:2570:4: RULE_ID
            {
             before(grammarAccess.getAlterAddStatementAccess().getColumnColumnDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlterAddStatementAccess().getColumnColumnDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAlterAddStatementAccess().getColumnColumnDeclarationCrossReference_1_0()); 

            }


            }

        }
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
    // InternalSql_dsl.g:2581:1: rule__AlterUpdateStatement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AlterUpdateStatement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql_dsl.g:2585:1: ( ( RULE_ID ) )
            // InternalSql_dsl.g:2586:2: ( RULE_ID )
            {
            // InternalSql_dsl.g:2586:2: ( RULE_ID )
            // InternalSql_dsl.g:2587:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000005000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000005000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000150000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});

}