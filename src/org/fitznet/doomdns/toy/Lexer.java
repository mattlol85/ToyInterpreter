package org.fitznet.doomdns.toy;

import java.util.regex.Pattern;

public class Lexer {

	public enum TokenType {
		DIGIT, NONZERODIGIT, LITERAL, LETTER, IDENTIFIER, FACT, TERM, EXP, ASSIGNMENT, PROGRAM
	}


	
	//Digit: 0|1|...|9
	Pattern digit = Pattern.compile("[0-9]"); // 0-9
	//NonZeroDigit: 1|...|9
	Pattern nonZeroDigit = Pattern.compile("[1-9]");
	//Literal: 0 | NonZeroDigit Digit*
	Pattern literal = Pattern.compile("0 |" + nonZeroDigit.toString() + "|" + digit.toString() + "*");
	Pattern letter = Pattern.compile("[a-z] | [A-Z] | _");
	Pattern identifier = Pattern.compile(letter.toString() + "[" + letter.toString() + "|" + digit.toString() + "]*");
	Pattern fact = Pattern.compile("");
	Pattern term = Pattern.compile("");
	Pattern exp = Pattern.compile("");
	Pattern assignment = Pattern.compile("");
//	Pattern program = Pattern.compile(assignment.toString() + "*");
	//String lineToLex;
	
	public Lexer() {
		System.out.println(digit.toString());
		System.out.println(nonZeroDigit.toString());
		System.out.println(literal.toString());
		System.out.println(letter.toString());
		System.out.println(identifier.toString());
		System.out.println(fact.toString());
		System.out.println(term.toString());
		System.out.println(exp.toString());
		System.out.println(assignment.toString());
		//System.out.println(program.toString());
	}
}
