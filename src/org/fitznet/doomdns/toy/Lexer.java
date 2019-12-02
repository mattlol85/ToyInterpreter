package org.fitznet.doomdns.toy;

import java.util.regex.Pattern;

public class Lexer {

	public enum TokenType {
		DIGIT, NONZERODIGIT, LITERAL, LETTER, IDENTIFIER, FACT, TERM, EXP, ASSIGNMENT, PROGRAM
	}


	Pattern digit = Pattern.compile("[0-9]"); // 0-9
	Pattern nonZeroDigit = Pattern.compile("[1-9]");
	Pattern literal = Pattern.compile("0 |" + nonZeroDigit.toString() + "|" + digit.toString() + "*");
	Pattern letter = Pattern.compile("[a-z] | [A-Z] | _");
	Pattern identifier = Pattern.compile(letter.toString() + "[" + letter.toString() + "|" + digit.toString() + "]*");
	Pattern fact = Pattern.compile("");
	//String lineToLex;
	
	public Lexer() {
		System.out.println(identifier.toString());
	}
}
