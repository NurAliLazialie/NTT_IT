parser grammar BasicParser;

@members {
org.talend.dataquality.parser.util.Interpreter interp;

public void setInterpreter(org.talend.dataquality.parser.util.Interpreter interp) {
	this.interp = interp;
}
}

separator
  :
  WHITESPACE
  | CHAR_IGNORED
  ;

//-------------------------------Extended Terms----------------------------------------//

extended
  :
  currency
  | roman_numeral
  | decimal
  | fraction
  | cjk
  | hebrew
  | email
  ;

currency
  :
  CURRENCY 
           {
            interp.store("CURRENCY", $currency.text);
           }
  ;

roman_numeral
  :
  ROMAN_NUMERAL 
                {
                 interp.store("ROMAIN_NUMERAL", $roman_numeral.text);
                }
  ;

decimal
  :
  DECIMAL 
          {
           interp.store("DECIMAL", $decimal.text);
          }
  ;

fraction
  :
  FRACTION 
           {
            interp.store("FRACTION", $fraction.text);
           }
  ;

cjk
  :
  CJK 
           {
            interp.store("CJK", $cjk.text);
           }
  ;

hebrew
  :
  HEBREW 
           {
            interp.store("HEBREW", $hebrew.text);
           }
  ;

email
  :
  EMAIL
           {
            interp.store("EMAIL", $email.text);
           }
  ;
//-------------------------------Basic Terms-------------------------------------------//

basic
  :
  integer
  | capword
  | word
  | alphanum
  ;

integer
  :
  INT 
      {
       interp.store("INT", $integer.text);
      }
  ;

capword
  :
  CAPWORD 
          {
           interp.store("CAPWORD", $capword.text);
          }
  ;

word
  :
  WORD 
       {
        interp.store("WORD", $word.text);
       }
  ;

alphanum
  :
  ALPHANUM 
           {
            interp.store("ALPHANUM", $alphanum.text);
           }
  ;

undefined
  :
  UNDEFINED 
            {
             interp.store("UNDEFINED", $undefined.text);
            }
  ;
  