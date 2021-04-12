grammar Grammar;

parse
: block EOF
;

block
: stat*
;


stat
: assignment
| if_stat
| while_stat
| log
| sum
| mult
| div
| minus
| call
| read
| return_value
;

assignment
: ID ASSIGN expr SCOL
;

if_stat
: IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
;

condition_block
: expr stat_block
;

stat_block
: OBRACE block CBRACE
| stat
;

while_stat
: WHILE expr stat_block
;

log
:  LOG expr SCOL
;

call
:  CALL params
;

read
  :  READ OPAR params OPAR params CPAR CPAR
  ;

params
  :   atom ( COMMA atom )* ?
  ;

  param
   : FLOAT
   | STRING
   | INT
   | function
   ;

   function
    : ID params
    ;


expr
: expr POW<assoc=right> expr           #powExpr
| MINUS expr                           #unaryMinusExpr
| NOT expr                             #notExpr
| expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
| expr op=(SUM | MINUS) expr           #additiveExpr
| expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
| expr op=(EQ | NEQ) expr              #equalityExpr
| expr AND expr                        #andExpr
| expr OR expr                         #orExpr
| sum                                  #sumExpr
| minus                                #minusExpr
| div                                  #divExpr
| mult                                 #multExpr
| atom                                 #atomExpr
| call                                 #callExpr
| read                                 #readExpr
;

atom
: OPAR expr CPAR #parExpr
| (INT | FLOAT)  #numberAtom
| (TRUE | FALSE) #booleanAtom
| ID             #idAtom
| STRING         #stringAtom
| NIL            #nilAtom
;


sum
: SUM OPAR expr COMMA expr CPAR
;


mult
: MULT OPAR expr COMMA expr CPAR
;

div
: DIV OPAR expr COMMA expr CPAR
;

minus
: MINUS OPAR expr COMMA expr CPAR
;

return_value
: RETURN expr SCOL
;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
MOD : '%';
POW : '^';
NOT : '!';
SUM : 'SUM';
MULT : 'MULT';
DIV : 'DIV';
MINUS : 'MINUS';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
COMMA : ',';

TRUE : 'TRUE';
FALSE : 'FALSE';
NIL : 'NIL';
IF : 'IF';
ELSE : 'ELSE';
WHILE : 'WHILE';
LOG : 'LOG';
CALL : 'CALL';
READ : 'READ';
RETURN : 'RETURN';

ID
: [a-zA-Z_] [a-zA-Z_0-9]*
;

INT
: [0-9]+
;

FLOAT
: [0-9]+ '.' [0-9]*
| '.' [0-9]+
;

STRING
: '"' (~["\r\n] | '""')* '"'
;

COMMENT
: '#' ~[\r\n]* -> skip
;

SPACE
: [ \t\r\n] -> skip
;

OTHER
: .
;