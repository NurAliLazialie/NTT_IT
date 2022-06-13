package routines;

import org.antlr.runtime.*;
import org.talend.dataquality.parser.util.GrammarEngine;

public class CleansingTstandardizerow_1 extends GrammarEngine {

    @Override
    protected void executeParserRule(TokenStream tokenStream) throws RecognitionException {
        CombinedParser parser = new CombinedParser(tokenStream, matcher.getInterpreter());
        parser.text();
    }
   
    @Override
    protected Lexer getUserLexer(ANTLRStringStream antlrStringStream) {
        return new CombinedLexer(antlrStringStream);
    }

static class Combined_BasicLexer extends Lexer {
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

	// delegates
	// delegators
	public CombinedLexer gCombined;
	public CombinedLexer gParent;
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Combined_BasicLexer() {} 
	public Combined_BasicLexer(CharStream input, CombinedLexer gCombined) {
		this(input, new RecognizerSharedState(), gCombined);
	}
	public Combined_BasicLexer(CharStream input, RecognizerSharedState state, CombinedLexer gCombined) {
		super(input,state);
		this.gCombined = gCombined;
		gParent = gCombined;
	}
	@Override public String getGrammarFileName() { return "BasicLexer.g"; }

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// BasicLexer.g:5:3: ( '0' .. '9' )
			// BasicLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "UpperCasedLetter"
	public final void mUpperCasedLetter() throws RecognitionException {
		try {
			// BasicLexer.g:11:3: ( 'A' .. 'Z' )
			// BasicLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UpperCasedLetter"

	// $ANTLR start "LETTER_ASCII"
	public final void mLETTER_ASCII() throws RecognitionException {
		try {
			// BasicLexer.g:17:3: ( 'a' .. 'z' | 'A' .. 'Z' )
			// BasicLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER_ASCII"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// BasicLexer.g:24:3: ( LETTER_ASCII | '\\u00a0' .. '\\u00ff' )
			// BasicLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "SYMBOL_ASCII"
	public final void mSYMBOL_ASCII() throws RecognitionException {
		try {
			// BasicLexer.g:31:3: ( '#' .. '&' | '*' | '+' | '-' | '/' | '<' .. '>' | '@' | '\\u005b' .. '\\u0060' | '\\u007b' .. '\\u007e' )
			// BasicLexer.g:
			{
			if ( (input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1) >= '<' && input.LA(1) <= '>')||input.LA(1)=='@'||(input.LA(1) >= '[' && input.LA(1) <= '`')||(input.LA(1) >= '{' && input.LA(1) <= '~') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL_ASCII"

	// $ANTLR start "CJK"
	public final void mCJK() throws RecognitionException {
		try {
			int _type = CJK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:39:3: ( ( '\\u4e00' .. '\\u9faf' )+ )
			// BasicLexer.g:40:3: ( '\\u4e00' .. '\\u9faf' )+
			{
			// BasicLexer.g:40:3: ( '\\u4e00' .. '\\u9faf' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u4E00' && LA1_0 <= '\u9FAF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// BasicLexer.g:
					{
					if ( (input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FAF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CJK"

	// $ANTLR start "HEBREW"
	public final void mHEBREW() throws RecognitionException {
		try {
			int _type = HEBREW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:44:3: ( ( '\\u0590' .. '\\u05FF' )+ )
			// BasicLexer.g:45:3: ( '\\u0590' .. '\\u05FF' )+
			{
			// BasicLexer.g:45:3: ( '\\u0590' .. '\\u05FF' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0590' && LA2_0 <= '\u05FF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// BasicLexer.g:
					{
					if ( (input.LA(1) >= '\u0590' && input.LA(1) <= '\u05FF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEBREW"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:49:3: ( DIGIT ( DIGIT )* )
			// BasicLexer.g:50:3: DIGIT ( DIGIT )*
			{
			mDIGIT(); 

			// BasicLexer.g:50:9: ( DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// BasicLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "ALPHANUM"
	public final void mALPHANUM() throws RecognitionException {
		try {
			int _type = ALPHANUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:54:3: ( LETTER_ASCII ( LETTER_ASCII | '-' | '+' )* DIGIT ( DIGIT | LETTER_ASCII | '-' | '+' )* | DIGIT ( DIGIT | '-' | '+' )* LETTER_ASCII ( DIGIT | LETTER_ASCII | '-' | '+' )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= 'A' && LA8_0 <= 'Z')||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// BasicLexer.g:55:3: LETTER_ASCII ( LETTER_ASCII | '-' | '+' )* DIGIT ( DIGIT | LETTER_ASCII | '-' | '+' )*
					{
					mLETTER_ASCII(); 

					// BasicLexer.g:55:16: ( LETTER_ASCII | '-' | '+' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0=='+'||LA4_0=='-'||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// BasicLexer.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					mDIGIT(); 

					// BasicLexer.g:55:50: ( DIGIT | LETTER_ASCII | '-' | '+' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='+'||LA5_0=='-'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// BasicLexer.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;
				case 2 :
					// BasicLexer.g:56:5: DIGIT ( DIGIT | '-' | '+' )* LETTER_ASCII ( DIGIT | LETTER_ASCII | '-' | '+' )*
					{
					mDIGIT(); 

					// BasicLexer.g:56:11: ( DIGIT | '-' | '+' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='+'||LA6_0=='-'||(LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// BasicLexer.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					mLETTER_ASCII(); 

					// BasicLexer.g:56:45: ( DIGIT | LETTER_ASCII | '-' | '+' )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='+'||LA7_0=='-'||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// BasicLexer.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALPHANUM"

	// $ANTLR start "CAPWORD"
	public final void mCAPWORD() throws RecognitionException {
		try {
			int _type = CAPWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:60:3: ( UpperCasedLetter ( UpperCasedLetter )* )
			// BasicLexer.g:61:3: UpperCasedLetter ( UpperCasedLetter )*
			{
			mUpperCasedLetter(); 

			// BasicLexer.g:61:20: ( UpperCasedLetter )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// BasicLexer.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAPWORD"

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			int _type = WORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:65:3: ( LETTER ( ( '-' | '\\'' | '.' )? LETTER )* ( '\\'' | '.' )? )
			// BasicLexer.g:66:3: LETTER ( ( '-' | '\\'' | '.' )? LETTER )* ( '\\'' | '.' )?
			{
			mLETTER(); 

			// BasicLexer.g:66:10: ( ( '-' | '\\'' | '.' )? LETTER )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\''||LA11_0=='.') ) {
					int LA11_1 = input.LA(2);
					if ( ((LA11_1 >= 'A' && LA11_1 <= 'Z')||(LA11_1 >= 'a' && LA11_1 <= 'z')||(LA11_1 >= '\u00A0' && LA11_1 <= '\u00FF')) ) {
						alt11=1;
					}

				}
				else if ( (LA11_0=='-'||(LA11_0 >= 'A' && LA11_0 <= 'Z')||(LA11_0 >= 'a' && LA11_0 <= 'z')||(LA11_0 >= '\u00A0' && LA11_0 <= '\u00FF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// BasicLexer.g:66:11: ( '-' | '\\'' | '.' )? LETTER
					{
					// BasicLexer.g:66:11: ( '-' | '\\'' | '.' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='\''||(LA10_0 >= '-' && LA10_0 <= '.')) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// BasicLexer.g:
							{
							if ( input.LA(1)=='\''||(input.LA(1) >= '-' && input.LA(1) <= '.') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					mLETTER(); 

					}
					break;

				default :
					break loop11;
				}
			}

			// BasicLexer.g:66:36: ( '\\'' | '.' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\''||LA12_0=='.') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// BasicLexer.g:
					{
					if ( input.LA(1)=='\''||input.LA(1)=='.' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORD"

	// $ANTLR start "DECIMAL"
	public final void mDECIMAL() throws RecognitionException {
		try {
			int _type = DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:70:3: ( ( DIGIT )* '.' ( DIGIT )+ )
			// BasicLexer.g:71:3: ( DIGIT )* '.' ( DIGIT )+
			{
			// BasicLexer.g:71:3: ( DIGIT )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// BasicLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop13;
				}
			}

			match('.'); 
			// BasicLexer.g:71:14: ( DIGIT )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// BasicLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL"

	// $ANTLR start "FRACTION"
	public final void mFRACTION() throws RecognitionException {
		try {
			int _type = FRACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:75:3: ( ( DIGIT )+ '/' ( DIGIT )+ | '\\u2153' .. '\\u215f' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= '\u2153' && LA17_0 <= '\u215F')) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// BasicLexer.g:76:3: ( DIGIT )+ '/' ( DIGIT )+
					{
					// BasicLexer.g:76:3: ( DIGIT )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// BasicLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					match('/'); 
					// BasicLexer.g:76:14: ( DIGIT )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// BasicLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					}
					break;
				case 2 :
					// BasicLexer.g:77:5: '\\u2153' .. '\\u215f'
					{
					matchRange('\u2153','\u215F'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRACTION"

	// $ANTLR start "EMAIL"
	public final void mEMAIL() throws RecognitionException {
		try {
			int _type = EMAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:81:3: ( ( LETTER_ASCII | DIGIT ) ( ( '_' | '.' | '-' | '%' )? ( LETTER_ASCII | DIGIT ) )+ '@' ( LETTER_ASCII | DIGIT ) ( ( '-' | '.' )? ( LETTER_ASCII | DIGIT ) )* '.' LETTER_ASCII LETTER_ASCII ( LETTER_ASCII ( LETTER_ASCII )? )? )
			// BasicLexer.g:82:3: ( LETTER_ASCII | DIGIT ) ( ( '_' | '.' | '-' | '%' )? ( LETTER_ASCII | DIGIT ) )+ '@' ( LETTER_ASCII | DIGIT ) ( ( '-' | '.' )? ( LETTER_ASCII | DIGIT ) )* '.' LETTER_ASCII LETTER_ASCII ( LETTER_ASCII ( LETTER_ASCII )? )?
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// BasicLexer.g:82:26: ( ( '_' | '.' | '-' | '%' )? ( LETTER_ASCII | DIGIT ) )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0=='%'||(LA19_0 >= '-' && LA19_0 <= '.')||(LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// BasicLexer.g:82:27: ( '_' | '.' | '-' | '%' )? ( LETTER_ASCII | DIGIT )
					{
					// BasicLexer.g:82:27: ( '_' | '.' | '-' | '%' )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0=='%'||(LA18_0 >= '-' && LA18_0 <= '.')||LA18_0=='_') ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// BasicLexer.g:
							{
							if ( input.LA(1)=='%'||(input.LA(1) >= '-' && input.LA(1) <= '.')||input.LA(1)=='_' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			match('@'); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// BasicLexer.g:82:105: ( ( '-' | '.' )? ( LETTER_ASCII | DIGIT ) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0=='.') ) {
					int LA21_1 = input.LA(2);
					if ( ((LA21_1 >= 'A' && LA21_1 <= 'Z')||(LA21_1 >= 'a' && LA21_1 <= 'z')) ) {
						int LA21_3 = input.LA(3);
						if ( ((LA21_3 >= 'A' && LA21_3 <= 'Z')||(LA21_3 >= 'a' && LA21_3 <= 'z')) ) {
							int LA21_4 = input.LA(4);
							if ( ((LA21_4 >= 'A' && LA21_4 <= 'Z')||(LA21_4 >= 'a' && LA21_4 <= 'z')) ) {
								int LA21_6 = input.LA(5);
								if ( ((LA21_6 >= 'A' && LA21_6 <= 'Z')||(LA21_6 >= 'a' && LA21_6 <= 'z')) ) {
									int LA21_7 = input.LA(6);
									if ( ((LA21_7 >= '-' && LA21_7 <= '.')||(LA21_7 >= '0' && LA21_7 <= '9')||(LA21_7 >= 'A' && LA21_7 <= 'Z')||(LA21_7 >= 'a' && LA21_7 <= 'z')) ) {
										alt21=1;
									}

								}
								else if ( ((LA21_6 >= '-' && LA21_6 <= '.')||(LA21_6 >= '0' && LA21_6 <= '9')) ) {
									alt21=1;
								}

							}
							else if ( ((LA21_4 >= '-' && LA21_4 <= '.')||(LA21_4 >= '0' && LA21_4 <= '9')) ) {
								alt21=1;
							}

						}
						else if ( ((LA21_3 >= '-' && LA21_3 <= '.')||(LA21_3 >= '0' && LA21_3 <= '9')) ) {
							alt21=1;
						}

					}
					else if ( ((LA21_1 >= '0' && LA21_1 <= '9')) ) {
						alt21=1;
					}

				}
				else if ( (LA21_0=='-'||(LA21_0 >= '0' && LA21_0 <= '9')||(LA21_0 >= 'A' && LA21_0 <= 'Z')||(LA21_0 >= 'a' && LA21_0 <= 'z')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// BasicLexer.g:82:106: ( '-' | '.' )? ( LETTER_ASCII | DIGIT )
					{
					// BasicLexer.g:82:106: ( '-' | '.' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( ((LA20_0 >= '-' && LA20_0 <= '.')) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// BasicLexer.g:
							{
							if ( (input.LA(1) >= '-' && input.LA(1) <= '.') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop21;
				}
			}

			match('.'); 
			mLETTER_ASCII(); 

			mLETTER_ASCII(); 

			// BasicLexer.g:82:177: ( LETTER_ASCII ( LETTER_ASCII )? )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= 'A' && LA23_0 <= 'Z')||(LA23_0 >= 'a' && LA23_0 <= 'z')) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// BasicLexer.g:82:178: LETTER_ASCII ( LETTER_ASCII )?
					{
					mLETTER_ASCII(); 

					// BasicLexer.g:82:191: ( LETTER_ASCII )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( ((LA22_0 >= 'A' && LA22_0 <= 'Z')||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// BasicLexer.g:
							{
							if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMAIL"

	// $ANTLR start "CURRENCY"
	public final void mCURRENCY() throws RecognitionException {
		try {
			int _type = CURRENCY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:86:3: ( '\\u0024' | '\\u00a2' .. '\\u00a5' | '\\u20a0' .. '\\u20cf' )
			// BasicLexer.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= '\u00A2' && input.LA(1) <= '\u00A5')||(input.LA(1) >= '\u20A0' && input.LA(1) <= '\u20CF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURRENCY"

	// $ANTLR start "ROMAN_NUMERAL"
	public final void mROMAN_NUMERAL() throws RecognitionException {
		try {
			int _type = ROMAN_NUMERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:93:3: ( '\\u2160' .. '\\u2182' )
			// BasicLexer.g:
			{
			if ( (input.LA(1) >= '\u2160' && input.LA(1) <= '\u2182') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROMAN_NUMERAL"

	// $ANTLR start "UNDEFINED"
	public final void mUNDEFINED() throws RecognitionException {
		try {
			int _type = UNDEFINED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// BasicLexer.g:98:3: ( SYMBOL_ASCII ( SYMBOL_ASCII | CHAR_IGNORED )* | ( LETTER_ASCII | DIGIT ) ( LETTER_ASCII | DIGIT | '_' | '.' | '-' | '+' | '/' | ':' | '@' )+ )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= '#' && LA26_0 <= '&')||(LA26_0 >= '*' && LA26_0 <= '+')||LA26_0=='-'||LA26_0=='/'||(LA26_0 >= '<' && LA26_0 <= '>')||LA26_0=='@'||(LA26_0 >= '[' && LA26_0 <= '`')||(LA26_0 >= '{' && LA26_0 <= '~')) ) {
				alt26=1;
			}
			else if ( ((LA26_0 >= '0' && LA26_0 <= '9')||(LA26_0 >= 'A' && LA26_0 <= 'Z')||(LA26_0 >= 'a' && LA26_0 <= 'z')) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// BasicLexer.g:99:3: SYMBOL_ASCII ( SYMBOL_ASCII | CHAR_IGNORED )*
					{
					mSYMBOL_ASCII(); 

					// BasicLexer.g:99:16: ( SYMBOL_ASCII | CHAR_IGNORED )*
					loop24:
					while (true) {
						int alt24=3;
						int LA24_0 = input.LA(1);
						if ( ((LA24_0 >= '#' && LA24_0 <= '&')||(LA24_0 >= '*' && LA24_0 <= '+')||LA24_0=='-'||LA24_0=='/'||(LA24_0 >= '<' && LA24_0 <= '>')||LA24_0=='@'||(LA24_0 >= '[' && LA24_0 <= '`')||(LA24_0 >= '{' && LA24_0 <= '~')) ) {
							alt24=1;
						}
						else if ( ((LA24_0 >= '!' && LA24_0 <= '\"')||(LA24_0 >= '\'' && LA24_0 <= ')')||LA24_0==','||LA24_0=='.'||(LA24_0 >= ':' && LA24_0 <= ';')||LA24_0=='?') ) {
							alt24=2;
						}

						switch (alt24) {
						case 1 :
							// BasicLexer.g:99:17: SYMBOL_ASCII
							{
							mSYMBOL_ASCII(); 

							}
							break;
						case 2 :
							// BasicLexer.g:99:30: CHAR_IGNORED
							{
							gCombined.mCHAR_IGNORED(); 

							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;
				case 2 :
					// BasicLexer.g:100:5: ( LETTER_ASCII | DIGIT ) ( LETTER_ASCII | DIGIT | '_' | '.' | '-' | '+' | '/' | ':' | '@' )+
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// BasicLexer.g:100:28: ( LETTER_ASCII | DIGIT | '_' | '.' | '-' | '+' | '/' | ':' | '@' )+
					int cnt25=0;
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0=='+'||(LA25_0 >= '-' && LA25_0 <= ':')||(LA25_0 >= '@' && LA25_0 <= 'Z')||LA25_0=='_'||(LA25_0 >= 'a' && LA25_0 <= 'z')) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// BasicLexer.g:
							{
							if ( input.LA(1)=='+'||(input.LA(1) >= '-' && input.LA(1) <= ':')||(input.LA(1) >= '@' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt25 >= 1 ) break loop25;
							EarlyExitException eee = new EarlyExitException(25, input);
							throw eee;
						}
						cnt25++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDEFINED"

	@Override
	public void mTokens() throws RecognitionException {
		// BasicLexer.g:1:8: ( CJK | HEBREW | INT | ALPHANUM | CAPWORD | WORD | DECIMAL | FRACTION | EMAIL | CURRENCY | ROMAN_NUMERAL | UNDEFINED )
		int alt27=12;
		alt27 = dfa27.predict(input);
		switch (alt27) {
			case 1 :
				// BasicLexer.g:1:10: CJK
				{
				mCJK(); 

				}
				break;
			case 2 :
				// BasicLexer.g:1:14: HEBREW
				{
				mHEBREW(); 

				}
				break;
			case 3 :
				// BasicLexer.g:1:21: INT
				{
				mINT(); 

				}
				break;
			case 4 :
				// BasicLexer.g:1:25: ALPHANUM
				{
				mALPHANUM(); 

				}
				break;
			case 5 :
				// BasicLexer.g:1:34: CAPWORD
				{
				mCAPWORD(); 

				}
				break;
			case 6 :
				// BasicLexer.g:1:42: WORD
				{
				mWORD(); 

				}
				break;
			case 7 :
				// BasicLexer.g:1:47: DECIMAL
				{
				mDECIMAL(); 

				}
				break;
			case 8 :
				// BasicLexer.g:1:55: FRACTION
				{
				mFRACTION(); 

				}
				break;
			case 9 :
				// BasicLexer.g:1:64: EMAIL
				{
				mEMAIL(); 

				}
				break;
			case 10 :
				// BasicLexer.g:1:70: CURRENCY
				{
				mCURRENCY(); 

				}
				break;
			case 11 :
				// BasicLexer.g:1:79: ROMAN_NUMERAL
				{
				mROMAN_NUMERAL(); 

				}
				break;
			case 12 :
				// BasicLexer.g:1:93: UNDEFINED
				{
				mUNDEFINED(); 

				}
				break;

		}
	}


	protected DFA27 dfa27 = new DFA27(this);
	static final String DFA27_eotS =
		"\3\uffff\1\16\1\27\1\11\4\uffff\1\14\4\uffff\1\16\1\15\1\40\4\15\2\uffff"+
		"\1\27\1\40\1\15\2\11\3\15\1\uffff\3\40\1\7\1\15\1\10\4\40\1\11\1\40\6"+
		"\15\3\26";
	static final String DFA27_eofS =
		"\66\uffff";
	static final String DFA27_minS =
		"\1\43\2\uffff\3\45\4\uffff\1\41\4\uffff\1\45\1\53\1\45\2\60\1\53\1\60"+
		"\2\uffff\2\45\1\53\1\45\2\53\1\60\1\45\1\uffff\1\53\1\45\1\53\2\45\3\53"+
		"\1\45\1\53\1\45\1\53\1\55\2\60\1\55\1\60\1\55\3\53";
	static final String DFA27_maxS =
		"\1\u9faf\2\uffff\1\172\1\u00ff\1\172\4\uffff\1\176\4\uffff\4\172\1\71"+
		"\2\172\2\uffff\1\u00ff\1\172\1\u00ff\5\172\1\uffff\15\172\1\u00ff\7\172";
	static final String DFA27_acceptS =
		"\1\uffff\1\1\1\2\3\uffff\1\6\1\7\1\10\1\6\1\uffff\1\13\1\12\1\14\1\3\7"+
		"\uffff\1\11\1\5\10\uffff\1\4\25\uffff";
	static final String DFA27_specialS =
		"\66\uffff}>";
	static final String[] DFA27_transitionS = {
			"\1\15\1\12\2\15\3\uffff\2\15\1\uffff\1\15\1\7\1\15\12\3\2\uffff\3\15"+
			"\1\uffff\1\15\32\4\6\15\32\5\4\15\41\uffff\2\11\4\6\132\11\u0490\uffff"+
			"\160\2\u1aa0\uffff\60\14\u0083\uffff\15\10\43\13\u2c7d\uffff\u51b0\1",
			"",
			"",
			"\1\26\5\uffff\1\24\1\uffff\1\20\1\22\1\23\12\17\1\15\5\uffff\1\15\32"+
			"\21\4\uffff\1\25\1\uffff\32\21",
			"\1\26\1\uffff\1\11\3\uffff\1\35\1\uffff\1\32\1\34\1\15\12\31\1\15\5"+
			"\uffff\1\15\32\30\4\uffff\1\25\1\uffff\32\33\45\uffff\140\11",
			"\1\26\5\uffff\1\35\1\uffff\1\32\1\34\1\15\12\31\1\15\5\uffff\1\15\32"+
			"\33\4\uffff\1\25\1\uffff\32\33",
			"",
			"",
			"",
			"",
			"\17\15\12\uffff\7\15\32\uffff\6\15\32\uffff\4\15",
			"",
			"",
			"",
			"",
			"\1\26\5\uffff\1\24\1\uffff\1\20\1\22\1\23\12\17\1\15\5\uffff\1\36\32"+
			"\21\4\uffff\1\25\1\uffff\32\21",
			"\1\24\1\uffff\1\24\2\uffff\12\37\7\uffff\32\21\6\uffff\32\21",
			"\1\26\5\uffff\1\43\1\uffff\1\41\1\25\1\15\12\42\1\15\5\uffff\1\36\32"+
			"\42\4\uffff\1\25\1\uffff\32\42",
			"\12\44\7\uffff\32\45\6\uffff\32\45",
			"\12\46",
			"\1\24\1\uffff\1\24\2\uffff\12\24\7\uffff\32\47\6\uffff\32\47",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"",
			"",
			"\1\26\1\uffff\1\11\3\uffff\1\35\1\uffff\1\32\1\34\1\15\12\31\1\15\5"+
			"\uffff\1\36\32\30\4\uffff\1\25\1\uffff\32\33\45\uffff\140\11",
			"\1\26\5\uffff\1\52\1\uffff\1\50\1\25\1\15\12\51\1\15\5\uffff\1\36\32"+
			"\51\4\uffff\1\25\1\uffff\32\51",
			"\1\35\1\uffff\1\35\2\uffff\12\31\7\uffff\32\33\6\uffff\32\33\45\uffff"+
			"\140\11",
			"\1\26\5\uffff\1\35\1\uffff\1\32\1\34\1\15\12\31\1\15\5\uffff\1\36\32"+
			"\33\4\uffff\1\25\1\uffff\32\33",
			"\1\15\1\uffff\3\15\12\45\1\15\5\uffff\1\15\32\53\4\uffff\1\15\1\uffff"+
			"\32\53",
			"\1\35\1\uffff\1\35\2\uffff\12\54\7\uffff\32\35\6\uffff\32\35",
			"\12\55\7\uffff\32\55\6\uffff\32\55",
			"\1\26\5\uffff\1\24\1\uffff\1\20\1\25\1\uffff\12\37\6\uffff\1\36\32\21"+
			"\4\uffff\1\25\1\uffff\32\21",
			"",
			"\1\43\1\uffff\1\43\2\15\12\42\1\15\5\uffff\1\15\32\42\4\uffff\1\15\1"+
			"\uffff\32\42",
			"\1\26\5\uffff\1\43\1\uffff\1\41\1\25\1\15\12\42\1\15\5\uffff\1\36\32"+
			"\42\4\uffff\1\25\1\uffff\32\42",
			"\1\43\1\uffff\1\43\2\15\12\43\1\15\5\uffff\1\15\32\43\4\uffff\1\15\1"+
			"\uffff\32\43",
			"\1\26\5\uffff\1\15\1\uffff\2\25\1\15\12\44\1\15\5\uffff\1\36\32\45\4"+
			"\uffff\1\25\1\uffff\32\45",
			"\1\26\7\uffff\2\25\1\uffff\12\45\6\uffff\1\36\32\45\4\uffff\1\25\1\uffff"+
			"\32\45",
			"\1\15\1\uffff\3\15\12\46\1\15\5\uffff\33\15\4\uffff\1\15\1\uffff\32"+
			"\15",
			"\1\43\1\uffff\1\43\2\15\12\43\1\15\5\uffff\1\15\32\43\4\uffff\1\15\1"+
			"\uffff\32\43",
			"\1\52\1\uffff\1\52\2\15\12\51\1\15\5\uffff\1\15\32\51\4\uffff\1\15\1"+
			"\uffff\32\51",
			"\1\26\5\uffff\1\52\1\uffff\1\50\1\25\1\15\12\51\1\15\5\uffff\1\36\32"+
			"\51\4\uffff\1\25\1\uffff\32\51",
			"\1\52\1\uffff\1\52\2\15\12\52\1\15\5\uffff\1\15\32\52\4\uffff\1\15\1"+
			"\uffff\32\52",
			"\1\26\5\uffff\1\15\1\uffff\1\56\1\34\1\15\12\45\1\15\5\uffff\1\36\32"+
			"\53\4\uffff\1\25\1\uffff\32\53",
			"\1\52\1\uffff\1\52\2\15\12\52\1\15\5\uffff\1\15\32\52\4\uffff\1\15\1"+
			"\uffff\32\52",
			"\1\61\1\57\1\uffff\12\60\7\uffff\32\60\6\uffff\32\60",
			"\12\45\7\uffff\32\53\6\uffff\32\53\45\uffff\140\11",
			"\12\60\7\uffff\32\62\6\uffff\32\62",
			"\1\61\1\57\1\uffff\12\60\7\uffff\32\60\6\uffff\32\60",
			"\12\60\7\uffff\32\60\6\uffff\32\60",
			"\1\61\1\57\1\uffff\12\60\7\uffff\32\63\6\uffff\32\63",
			"\1\15\1\uffff\1\61\1\57\1\15\12\60\1\15\5\uffff\1\15\32\64\4\uffff\1"+
			"\15\1\uffff\32\64",
			"\1\15\1\uffff\1\61\1\57\1\15\12\60\1\15\5\uffff\1\15\32\65\4\uffff\1"+
			"\15\1\uffff\32\65",
			"\1\15\1\uffff\1\61\1\57\1\15\12\60\1\15\5\uffff\1\15\32\60\4\uffff\1"+
			"\15\1\uffff\32\60"
	};

	static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
	static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
	static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
	static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
	static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
	static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
	static final short[][] DFA27_transition;

	static {
		int numStates = DFA27_transitionS.length;
		DFA27_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
		}
	}

	protected class DFA27 extends DFA {

		public DFA27(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 27;
			this.eot = DFA27_eot;
			this.eof = DFA27_eof;
			this.min = DFA27_min;
			this.max = DFA27_max;
			this.accept = DFA27_accept;
			this.special = DFA27_special;
			this.transition = DFA27_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CJK | HEBREW | INT | ALPHANUM | CAPWORD | WORD | DECIMAL | FRACTION | EMAIL | CURRENCY | ROMAN_NUMERAL | UNDEFINED );";
		}
	}

}

static class CombinedLexer extends Lexer {
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

static class Combined_BasicParser extends Parser {
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

static class CombinedParser extends Parser {
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
}