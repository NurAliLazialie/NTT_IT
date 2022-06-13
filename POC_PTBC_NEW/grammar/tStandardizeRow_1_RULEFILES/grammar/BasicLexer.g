lexer grammar BasicLexer;

fragment
DIGIT
  :
  '0'..'9'
  ;

fragment
UpperCasedLetter
  :
  'A'..'Z'
  ;

fragment
LETTER_ASCII
  :
  'a'..'z'
  | 'A'..'Z'
  ;
  
fragment
LETTER
  :
  LETTER_ASCII
  | '\u00a0'..'\u00ff' // latin1 suppliment
  ;

fragment
SYMBOL_ASCII
  :
  '#'..'&' | '*' | '+' | '-' |'/'   //  excluded ! " ' ( ) , . 
  | '<'..'>' | '@'           // excluded : ; ? 
  | '\u005b'..'\u0060'       // from [ to `
  | '\u007b'..'\u007e'       // from { to ~
  ;
  
CJK
  :
  ('\u4e00'..'\u9faf')+
  ;
   
HEBREW
  :
  ('\u0590'..'\u05FF')+
  ;
  
INT
  :
  DIGIT DIGIT*
  ;

ALPHANUM
  :
  LETTER_ASCII (LETTER_ASCII | '-' | '+')* DIGIT ( DIGIT | LETTER_ASCII | '-' | '+')*
  | DIGIT (DIGIT | '-' | '+')* LETTER_ASCII ( DIGIT | LETTER_ASCII | '-' | '+')*
  ;

CAPWORD
  :
  UpperCasedLetter UpperCasedLetter*
  ;

WORD
  :
  LETTER (('-'|'\''|'.')? LETTER)* ('\''|'.')? 
  ;

DECIMAL
  :
  DIGIT* '.' DIGIT+
  ;

FRACTION
  :
  DIGIT+ '/' DIGIT+
  | '\u2153'..'\u215f' // combined fraction characters
  ;
  
EMAIL
  :
  (LETTER_ASCII | DIGIT) (( '_' | '.' | '-' | '%')? (LETTER_ASCII | DIGIT))+ '@' (LETTER_ASCII | DIGIT) (( '-' | '.' )? (LETTER_ASCII | DIGIT ))* '.' LETTER_ASCII LETTER_ASCII (LETTER_ASCII LETTER_ASCII?)? 
  ;
  
CURRENCY
  :
  '\u0024' //dollar
  | '\u00a2'..'\u00a5' //cent, pound, currency sign, yuan
  | '\u20a0'..'\u20cf' //others
  ;

ROMAN_NUMERAL
  :
  '\u2160'..'\u2182'
  ;
       
UNDEFINED
  :  
  SYMBOL_ASCII (SYMBOL_ASCII|CHAR_IGNORED)*
  | (LETTER_ASCII | DIGIT) (LETTER_ASCII | DIGIT | '_' | '.' | '-' | '+' | '/' | ':' | '@')+
  ;
  