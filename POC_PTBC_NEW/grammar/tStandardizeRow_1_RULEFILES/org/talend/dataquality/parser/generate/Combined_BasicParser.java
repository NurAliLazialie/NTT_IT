// $ANTLR 3.5.2 BasicParser.g 2022-06-13 11:13:15

package org.talend.dataquality.parser.generate;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Combined_BasicParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public CombinedParser gCombined;
	public CombinedParser gParent;


	public Combined_BasicParser(TokenStream input, CombinedParser gCombined) {
		this(input, new RecognizerSharedState(), gCombined);
	}
	public Combined_BasicParser(TokenStream input, RecognizerSharedState state, CombinedParser gCombined) {
		super(input, state);
		this.gCombined = gCombined;
		gParent = gCombined;
	}

	@Override public String[] getTokenNames() { return CombinedParser.tokenNames; }
	@Override public String getGrammarFileName() { return "BasicParser.g"; }


	org.talend.dataquality.parser.util.Interpreter interp;

	public void setInterpreter(org.talend.dataquality.parser.util.Interpreter interp) {
		this.interp = interp;
	}



	// $ANTLR start "separator"
	// BasicParser.g:11:1: separator : ( WHITESPACE | CHAR_IGNORED );
	public final void separator() throws RecognitionException {
		try {
			// BasicParser.g:12:3: ( WHITESPACE | CHAR_IGNORED )
			// BasicParser.g:
			{
			if ( input.LA(1)==CHAR_IGNORED||input.LA(1)==WHITESPACE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "separator"



	// $ANTLR start "extended"
	// BasicParser.g:19:1: extended : ( currency | roman_numeral | decimal | fraction | cjk | hebrew | email );
	public final void extended() throws RecognitionException {
		try {
			// BasicParser.g:20:3: ( currency | roman_numeral | decimal | fraction | cjk | hebrew | email )
			int alt1=7;
			switch ( input.LA(1) ) {
			case CURRENCY:
				{
				alt1=1;
				}
				break;
			case ROMAN_NUMERAL:
				{
				alt1=2;
				}
				break;
			case DECIMAL:
				{
				alt1=3;
				}
				break;
			case FRACTION:
				{
				alt1=4;
				}
				break;
			case CJK:
				{
				alt1=5;
				}
				break;
			case HEBREW:
				{
				alt1=6;
				}
				break;
			case EMAIL:
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
					// BasicParser.g:21:3: currency
					{
					pushFollow(FOLLOW_currency_in_extended45);
					currency();
					state._fsp--;

					}
					break;
				case 2 :
					// BasicParser.g:22:5: roman_numeral
					{
					pushFollow(FOLLOW_roman_numeral_in_extended51);
					roman_numeral();
					state._fsp--;

					}
					break;
				case 3 :
					// BasicParser.g:23:5: decimal
					{
					pushFollow(FOLLOW_decimal_in_extended57);
					decimal();
					state._fsp--;

					}
					break;
				case 4 :
					// BasicParser.g:24:5: fraction
					{
					pushFollow(FOLLOW_fraction_in_extended63);
					fraction();
					state._fsp--;

					}
					break;
				case 5 :
					// BasicParser.g:25:5: cjk
					{
					pushFollow(FOLLOW_cjk_in_extended69);
					cjk();
					state._fsp--;

					}
					break;
				case 6 :
					// BasicParser.g:26:5: hebrew
					{
					pushFollow(FOLLOW_hebrew_in_extended75);
					hebrew();
					state._fsp--;

					}
					break;
				case 7 :
					// BasicParser.g:27:5: email
					{
					pushFollow(FOLLOW_email_in_extended81);
					email();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "extended"


	public static class currency_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "currency"
	// BasicParser.g:30:1: currency : CURRENCY ;
	public final Combined_BasicParser.currency_return currency() throws RecognitionException {
		Combined_BasicParser.currency_return retval = new Combined_BasicParser.currency_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:31:3: ( CURRENCY )
			// BasicParser.g:32:3: CURRENCY
			{
			match(input,CURRENCY,FOLLOW_CURRENCY_in_currency96); 

			            interp.store("CURRENCY", input.toString(retval.start,input.LT(-1)));
			           
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "currency"


	public static class roman_numeral_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "roman_numeral"
	// BasicParser.g:38:1: roman_numeral : ROMAN_NUMERAL ;
	public final Combined_BasicParser.roman_numeral_return roman_numeral() throws RecognitionException {
		Combined_BasicParser.roman_numeral_return retval = new Combined_BasicParser.roman_numeral_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:39:3: ( ROMAN_NUMERAL )
			// BasicParser.g:40:3: ROMAN_NUMERAL
			{
			match(input,ROMAN_NUMERAL,FOLLOW_ROMAN_NUMERAL_in_roman_numeral125); 

			                 interp.store("ROMAIN_NUMERAL", input.toString(retval.start,input.LT(-1)));
			                
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "roman_numeral"


	public static class decimal_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "decimal"
	// BasicParser.g:46:1: decimal : DECIMAL ;
	public final Combined_BasicParser.decimal_return decimal() throws RecognitionException {
		Combined_BasicParser.decimal_return retval = new Combined_BasicParser.decimal_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:47:3: ( DECIMAL )
			// BasicParser.g:48:3: DECIMAL
			{
			match(input,DECIMAL,FOLLOW_DECIMAL_in_decimal159); 

			           interp.store("DECIMAL", input.toString(retval.start,input.LT(-1)));
			          
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decimal"


	public static class fraction_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "fraction"
	// BasicParser.g:54:1: fraction : FRACTION ;
	public final Combined_BasicParser.fraction_return fraction() throws RecognitionException {
		Combined_BasicParser.fraction_return retval = new Combined_BasicParser.fraction_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:55:3: ( FRACTION )
			// BasicParser.g:56:3: FRACTION
			{
			match(input,FRACTION,FOLLOW_FRACTION_in_fraction187); 

			            interp.store("FRACTION", input.toString(retval.start,input.LT(-1)));
			           
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fraction"


	public static class cjk_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "cjk"
	// BasicParser.g:62:1: cjk : CJK ;
	public final Combined_BasicParser.cjk_return cjk() throws RecognitionException {
		Combined_BasicParser.cjk_return retval = new Combined_BasicParser.cjk_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:63:3: ( CJK )
			// BasicParser.g:64:3: CJK
			{
			match(input,CJK,FOLLOW_CJK_in_cjk216); 

			            interp.store("CJK", input.toString(retval.start,input.LT(-1)));
			           
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cjk"


	public static class hebrew_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "hebrew"
	// BasicParser.g:70:1: hebrew : HEBREW ;
	public final Combined_BasicParser.hebrew_return hebrew() throws RecognitionException {
		Combined_BasicParser.hebrew_return retval = new Combined_BasicParser.hebrew_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:71:3: ( HEBREW )
			// BasicParser.g:72:3: HEBREW
			{
			match(input,HEBREW,FOLLOW_HEBREW_in_hebrew245); 

			            interp.store("HEBREW", input.toString(retval.start,input.LT(-1)));
			           
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "hebrew"


	public static class email_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "email"
	// BasicParser.g:78:1: email : EMAIL ;
	public final Combined_BasicParser.email_return email() throws RecognitionException {
		Combined_BasicParser.email_return retval = new Combined_BasicParser.email_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:79:3: ( EMAIL )
			// BasicParser.g:80:3: EMAIL
			{
			match(input,EMAIL,FOLLOW_EMAIL_in_email274); 

			            interp.store("EMAIL", input.toString(retval.start,input.LT(-1)));
			           
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "email"



	// $ANTLR start "basic"
	// BasicParser.g:87:1: basic : ( integer | capword | word | alphanum );
	public final void basic() throws RecognitionException {
		try {
			// BasicParser.g:88:3: ( integer | capword | word | alphanum )
			int alt2=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt2=1;
				}
				break;
			case CAPWORD:
				{
				alt2=2;
				}
				break;
			case WORD:
				{
				alt2=3;
				}
				break;
			case ALPHANUM:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// BasicParser.g:89:3: integer
					{
					pushFollow(FOLLOW_integer_in_basic303);
					integer();
					state._fsp--;

					}
					break;
				case 2 :
					// BasicParser.g:90:5: capword
					{
					pushFollow(FOLLOW_capword_in_basic309);
					capword();
					state._fsp--;

					}
					break;
				case 3 :
					// BasicParser.g:91:5: word
					{
					pushFollow(FOLLOW_word_in_basic315);
					word();
					state._fsp--;

					}
					break;
				case 4 :
					// BasicParser.g:92:5: alphanum
					{
					pushFollow(FOLLOW_alphanum_in_basic321);
					alphanum();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "basic"


	public static class integer_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "integer"
	// BasicParser.g:95:1: integer : INT ;
	public final Combined_BasicParser.integer_return integer() throws RecognitionException {
		Combined_BasicParser.integer_return retval = new Combined_BasicParser.integer_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:96:3: ( INT )
			// BasicParser.g:97:3: INT
			{
			match(input,INT,FOLLOW_INT_in_integer336); 

			       interp.store("INT", input.toString(retval.start,input.LT(-1)));
			      
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integer"


	public static class capword_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "capword"
	// BasicParser.g:103:1: capword : CAPWORD ;
	public final Combined_BasicParser.capword_return capword() throws RecognitionException {
		Combined_BasicParser.capword_return retval = new Combined_BasicParser.capword_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:104:3: ( CAPWORD )
			// BasicParser.g:105:3: CAPWORD
			{
			match(input,CAPWORD,FOLLOW_CAPWORD_in_capword360); 

			           interp.store("CAPWORD", input.toString(retval.start,input.LT(-1)));
			          
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "capword"


	public static class word_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "word"
	// BasicParser.g:111:1: word : WORD ;
	public final Combined_BasicParser.word_return word() throws RecognitionException {
		Combined_BasicParser.word_return retval = new Combined_BasicParser.word_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:112:3: ( WORD )
			// BasicParser.g:113:3: WORD
			{
			match(input,WORD,FOLLOW_WORD_in_word388); 

			        interp.store("WORD", input.toString(retval.start,input.LT(-1)));
			       
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "word"


	public static class alphanum_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "alphanum"
	// BasicParser.g:119:1: alphanum : ALPHANUM ;
	public final Combined_BasicParser.alphanum_return alphanum() throws RecognitionException {
		Combined_BasicParser.alphanum_return retval = new Combined_BasicParser.alphanum_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:120:3: ( ALPHANUM )
			// BasicParser.g:121:3: ALPHANUM
			{
			match(input,ALPHANUM,FOLLOW_ALPHANUM_in_alphanum413); 

			            interp.store("ALPHANUM", input.toString(retval.start,input.LT(-1)));
			           
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alphanum"


	public static class undefined_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "undefined"
	// BasicParser.g:127:1: undefined : UNDEFINED ;
	public final Combined_BasicParser.undefined_return undefined() throws RecognitionException {
		Combined_BasicParser.undefined_return retval = new Combined_BasicParser.undefined_return();
		retval.start = input.LT(1);

		try {
			// BasicParser.g:128:3: ( UNDEFINED )
			// BasicParser.g:129:3: UNDEFINED
			{
			match(input,UNDEFINED,FOLLOW_UNDEFINED_in_undefined442); 

			             interp.store("UNDEFINED", input.toString(retval.start,input.LT(-1)));
			            
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "undefined"

	// Delegated rules



	public static final BitSet FOLLOW_currency_in_extended45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roman_numeral_in_extended51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decimal_in_extended57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fraction_in_extended63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cjk_in_extended69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hebrew_in_extended75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_email_in_extended81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURRENCY_in_currency96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROMAN_NUMERAL_in_roman_numeral125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_decimal159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FRACTION_in_fraction187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CJK_in_cjk216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEBREW_in_hebrew245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_basic303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_capword_in_basic309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_word_in_basic315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alphanum_in_basic321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_integer336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPWORD_in_capword360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_word388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALPHANUM_in_alphanum413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_undefined442 = new BitSet(new long[]{0x0000000000000002L});
}
