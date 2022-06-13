// $ANTLR 3.5.2 C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g 2022-06-13 11:13:15

package org.talend.dataquality.parser.generate;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CombinedLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ALPHANUM=4;
	public static final int CAPWORD=5;
	public static final int CHAR_IGNORED=6;
	public static final int CJK=7;
	public static final int CURRENCY=8;
	public static final int DECIMAL=9;
	public static final int DIGIT=10;
	public static final int EMAIL=11;
	public static final int FRACTION=12;
	public static final int HEBREW=13;
	public static final int INT=14;
	public static final int LETTER=15;
	public static final int LETTER_ASCII=16;
	public static final int ROMAN_NUMERAL=17;
	public static final int SYMBOL_ASCII=18;
	public static final int UNDEFINED=19;
	public static final int UpperCasedLetter=20;
	public static final int WHITESPACE=21;
	public static final int WORD=22;
	public static final int Tokens=23;

	/** Override this method to change where error messages go */
	public void emitErrorMessage(String msg) {
	    org.talend.dataquality.parser.util.RecognitionError.set(false, msg);
	    // System.err.println(msg);
	}


	// delegates
	public Combined_BasicLexer gBasicLexer;
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {gBasicLexer};
	}

	public CombinedLexer() {} 
	public CombinedLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CombinedLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
		gBasicLexer = new Combined_BasicLexer(input, state, this);
	}
	@Override public String getGrammarFileName() { return "C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g"; }

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:49:3: ( ( ' ' | '\\r' | '\\n' | '\\t' | '\\f' ) )
			// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:50:3: ( ' ' | '\\r' | '\\n' | '\\t' | '\\f' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "CHAR_IGNORED"
	public final void mCHAR_IGNORED() throws RecognitionException {
		try {
			int _type = CHAR_IGNORED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:55:3: ( ( '.' | ',' | ':' | ';' | '!' | '?' | '\"' | '\\'' | '(' | ')' ) )
			// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:56:3: ( '.' | ',' | ':' | ';' | '!' | '?' | '\"' | '\\'' | '(' | ')' )
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||(input.LA(1) >= '\'' && input.LA(1) <= ')')||input.LA(1)==','||input.LA(1)=='.'||(input.LA(1) >= ':' && input.LA(1) <= ';')||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_IGNORED"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:1:8: ( WHITESPACE | CHAR_IGNORED | BasicLexer. Tokens )
		int alt1=3;
		int LA1_0 = input.LA(1);
		if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
			alt1=1;
		}
		else if ( (LA1_0=='.') ) {
			int LA1_2 = input.LA(2);
			if ( ((LA1_2 >= '0' && LA1_2 <= '9')) ) {
				alt1=3;
			}

			else {
				alt1=2;
			}

		}
		else if ( ((LA1_0 >= '#' && LA1_0 <= '&')||(LA1_0 >= '*' && LA1_0 <= '+')||LA1_0=='-'||(LA1_0 >= '/' && LA1_0 <= '9')||(LA1_0 >= '<' && LA1_0 <= '>')||(LA1_0 >= '@' && LA1_0 <= '~')||(LA1_0 >= '\u00A0' && LA1_0 <= '\u00FF')||(LA1_0 >= '\u0590' && LA1_0 <= '\u05FF')||(LA1_0 >= '\u20A0' && LA1_0 <= '\u20CF')||(LA1_0 >= '\u2153' && LA1_0 <= '\u2182')||(LA1_0 >= '\u4E00' && LA1_0 <= '\u9FAF')) ) {
			alt1=3;
		}
		else if ( ((LA1_0 >= '!' && LA1_0 <= '\"')||(LA1_0 >= '\'' && LA1_0 <= ')')||LA1_0==','||(LA1_0 >= ':' && LA1_0 <= ';')||LA1_0=='?') ) {
			alt1=2;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 1, 0, input);
			throw nvae;
		}

		switch (alt1) {
			case 1 :
				// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:1:10: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;
			case 2 :
				// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:1:21: CHAR_IGNORED
				{
				mCHAR_IGNORED(); 

				}
				break;
			case 3 :
				// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:1:34: BasicLexer. Tokens
				{
				gBasicLexer.mTokens(); 

				}
				break;

		}
	}



}
