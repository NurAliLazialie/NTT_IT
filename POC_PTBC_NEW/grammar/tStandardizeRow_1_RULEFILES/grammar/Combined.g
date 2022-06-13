grammar Combined;
import BasicParser, BasicLexer;

@lexer::header {
package org.talend.dataquality.parser.generate;
}

@header {
package org.talend.dataquality.parser.generate;
}

@lexer::members {
/** Override this method to change where error messages go */
public void emitErrorMessage(String msg) {
    org.talend.dataquality.parser.util.RecognitionError.set(false, msg);
    // System.err.println(msg);
}
}

@members {
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
}


text
  : 
  separator*
  (
    (extended | basic | undefined )
    separator*
  )*
  ;


WHITESPACE
  :
  ( ' ' | '\r' | '\n' | '\t' | '\f' )
  { $channel=HIDDEN; }
  ;

CHAR_IGNORED
  :
  ( '.' | ',' | ':' | ';' | '!' | '?' | '"' | '\'' | '(' | ')' )
  { $channel=HIDDEN; }
  ;

