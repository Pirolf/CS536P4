###
# MakeFile for P4
#
# make clean removes all generated files.
#
###

JC = javac

P4.class: P4.java parser.class Yylex.class ASTnode.class
	$(JC) -g P4.java

parser.class: parser.java ASTnode.class Yylex.class ErrMsg.class
	$(JC) parser.java

parser.java: CSX.cup
	java java_cup.Main < CSX.cup

Yylex.class: CSX.jlex.java sym.class ErrMsg.class
	$(JC) CSX.jlex.java

ASTnode.class: ast.java
	$(JC) -g ast.java

CSX.jlex.java: CSX.jlex sym.class
	java JLex.Main CSX.jlex

sym.class: sym.java
	$(JC) -g sym.java

sym.java: CSX.cup
	java java_cup.Main < CSX.cup

ErrMsg.class: ErrMsg.java
	$(JC) ErrMsg.java

###
# clean
###
clean:
	rm -f *~ *.class parser.java CSX.jlex.java sym.java
