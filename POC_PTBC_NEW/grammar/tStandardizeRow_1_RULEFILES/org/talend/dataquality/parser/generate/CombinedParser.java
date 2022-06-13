// $ANTLR 3.5.2 C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g 2022-06-13 11:13:15

package org.talend.dataquality.parser.generate;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CombinedParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHANUM", "CAPWORD", "CHAR_IGNORED", 
		"CJK", "CURRENCY", "DECIMAL", "DIGIT", "EMAIL", "FRACTION", "HEBREW", 
		"INT", "LETTER", "LETTER_ASCII", "ROMAN_NUMERAL", "SYMBOL_ASCII", "UNDEFINED", 
		"UpperCasedLetter", "WHITESPACE", "WORD"
	};
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

	// delegates
	public Combined_BasicParser gBasicParser;
	public Parser[] getDelegates() {
		return new Parser[] {gBasicParser};
	}

	// delegators


	public CombinedParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CombinedParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		gBasicParser = new Combined_BasicParser(input, state, this);
	}

	@Override public String[] getTokenNames() { return CombinedParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g"; }


	org.talend.dataquality.parser.util.Interpreter interp;

	public CombinedParser(TokenStream tokenStream,
	        org.talend.dataquality.parser.util.Interpreter interp) {
	    this(tokenStream);
	    this.interp = interp;
	    gBasicParser.setInterpreter(interp);
	}

	/** Override this method to change where error messages go */
	public void emitErrorMessage(String msg) {
	    org.talend.dataquality.parser.util.RecognitionError.set(false, msg);
	    // System.err.println(msg);
	}



	// $ANTLR start "text"
	// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:38:1: text : ( separator )* ( ( extended | basic | undefined ) ( separator )* )* ;
	public final void text() throws RecognitionException {
		try {
			// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:39:3: ( ( separator )* ( ( extended | basic | undefined ) ( separator )* )* )
			// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:40:3: ( separator )* ( ( extended | basic | undefined ) ( separator )* )*
			{
			// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:40:3: ( separator )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CHAR_IGNORED||LA1_0==WHITESPACE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:40:3: separator
					{
					pushFollow(FOLLOW_separator_in_text54);
					separator();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:41:3: ( ( extended | basic | undefined ) ( separator )* )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ALPHANUM && LA4_0 <= CAPWORD)||(LA4_0 >= CJK && LA4_0 <= DECIMAL)||(LA4_0 >= EMAIL && LA4_0 <= INT)||LA4_0==ROMAN_NUMERAL||LA4_0==UNDEFINED||LA4_0==WORD) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:42:5: ( extended | basic | undefined ) ( separator )*
					{
					// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:42:5: ( extended | basic | undefined )
					int alt2=3;
					switch ( input.LA(1) ) {
					case CJK:
					case CURRENCY:
					case DECIMAL:
					case EMAIL:
					case FRACTION:
					case HEBREW:
					case ROMAN_NUMERAL:
						{
						alt2=1;
						}
						break;
					case ALPHANUM:
					case CAPWORD:
					case INT:
					case WORD:
						{
						alt2=2;
						}
						break;
					case UNDEFINED:
						{
						alt2=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:42:6: extended
							{
							pushFollow(FOLLOW_extended_in_text66);
							extended();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:42:17: basic
							{
							pushFollow(FOLLOW_basic_in_text70);
							basic();
							state._fsp--;

							}
							break;
						case 3 :
							// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:42:25: undefined
							{
							pushFollow(FOLLOW_undefined_in_text74);
							undefined();
							state._fsp--;

							}
							break;

					}

					// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:43:5: ( separator )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==CHAR_IGNORED||LA3_0==WHITESPACE) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Talend_8.0.1\\Administrator\\workspace_fentri\\.repositories\\1396644473\\main\\POC_PTBC_NEW\\grammar\\tStandardizeRow_1_RULEFILES\\grammar\\Combined.g:43:5: separator
							{
							pushFollow(FOLLOW_separator_in_text82);
							separator();
							state._fsp--;

							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "text"

	// Delegated rules
	public Combined_BasicParser.decimal_return decimal() throws RecognitionException { return gBasicParser.decimal(); }

	public Combined_BasicParser.hebrew_return hebrew() throws RecognitionException { return gBasicParser.hebrew(); }

	public Combined_BasicParser.integer_return integer() throws RecognitionException { return gBasicParser.integer(); }

	public Combined_BasicParser.cjk_return cjk() throws RecognitionException { return gBasicParser.cjk(); }

	public Combined_BasicParser.email_return email() throws RecognitionException { return gBasicParser.email(); }

	public void basic() throws RecognitionException { gBasicParser.basic(); }

	public Combined_BasicParser.alphanum_return alphanum() throws RecognitionException { return gBasicParser.alphanum(); }

	public Combined_BasicParser.undefined_return undefined() throws RecognitionException { return gBasicParser.undefined(); }

	public void extended() throws RecognitionException { gBasicParser.extended(); }

	public Combined_BasicParser.fraction_return fraction() throws RecognitionException { return gBasicParser.fraction(); }

	public Combined_BasicParser.capword_return capword() throws RecognitionException { return gBasicParser.capword(); }

	public Combined_BasicParser.currency_return currency() throws RecognitionException { return gBasicParser.currency(); }

	public Combined_BasicParser.roman_numeral_return roman_numeral() throws RecognitionException { return gBasicParser.roman_numeral(); }

	public Combined_BasicParser.word_return word() throws RecognitionException { return gBasicParser.word(); }

	public void separator() throws RecognitionException { gBasicParser.separator(); }



	public static final BitSet FOLLOW_separator_in_text54 = new BitSet(new long[]{0x00000000006A7BF2L});
	public static final BitSet FOLLOW_extended_in_text66 = new BitSet(new long[]{0x00000000006A7BF2L});
	public static final BitSet FOLLOW_basic_in_text70 = new BitSet(new long[]{0x00000000006A7BF2L});
	public static final BitSet FOLLOW_undefined_in_text74 = new BitSet(new long[]{0x00000000006A7BF2L});
	public static final BitSet FOLLOW_separator_in_text82 = new BitSet(new long[]{0x00000000006A7BF2L});
}
