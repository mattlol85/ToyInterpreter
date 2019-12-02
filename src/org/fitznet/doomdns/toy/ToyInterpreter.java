package org.fitznet.doomdns.toy;

import java.io.*;
import java.util.*;
import java.util.regex.*;

import org.fitznet.doomdns.toy.Lexer.TokenType;

/***
 * --------GAME PLAN--------
 * 1) Tokenize Entire file CHECK
 * 2) Write a parse tree for Toy  
 * 3) Check var assignments
 * 4) Define the lexer.
 */
//GIT TEST
public class ToyInterpreter {
	static File inputFile;

	public static void main(String[] args) {
		System.out.println("Fitz-Net Toy Interpreter v2");
		System.out.println("Usage: java ToyInterpreter [filename]\n");
		Lexer testLex = new Lexer();
		// Check to see if any arguments are given
		if (args.length == 0) {
			System.out.println("Live Interpret mode.");
			liveInterpreter();
		} else if (args.length == 1) {
			// Assign launch args to file object
			inputFile = new File(args[0]);

			// TOKENIZE TIME BABY
			TokenizeFile(inputFile);
		}
		//Exit Nicely
		System.exit(0);
	}

	private static void liveInterpreter() {
		String inputLine = "";
		Scanner userReader = new Scanner(System.in);
		ArrayList<String> tokenList = null;
		// Type :q to exit the Interpreter, this is caught by the while loop
		while (!inputLine.equals(":q")) {
			// Read in line
			inputLine = userReader.nextLine();
			StringTokenizer sp = new StringTokenizer(inputLine); // Create Tokenizer
			// Gather tokens into an arrayList of Strings
			tokenList = new ArrayList<>();

			while (sp.hasMoreTokens()) {
				tokenList.add(sp.nextToken());
			}
			//Print Out Token Values
			for(int i =0; i < tokenList.size();++i)
				System.out.println(tokenList.get(i));
			validateProgram(tokenList);
		}
		userReader.close();
	}
	/**
	 * 
	 * @param tokenList
	 */
	private static void validateProgram(ArrayList<String> tokenList) {
		
		for(int i = 0;i < tokenList.size();++i) {
			//Take each token and see if it fits the description of the terminal or non-terminal
			tokenList.get(i);
		}
	}

	// Probably will not use this
	private static void TokenizeFile(File inputFile) {
		String fileContents = "";
		// Gather the file source code into a string to be tokenized.
		try {
			Scanner scanner = new Scanner(inputFile);
			while (scanner.hasNext()) {
				fileContents += scanner.next() + " ";
			}
			StringTokenizer tokenizer = new StringTokenizer(fileContents);
			for (; tokenizer.hasMoreTokens();) {
				System.out.println(tokenizer.nextToken());
			}
		} catch (FileNotFoundException e) {
			// If the file cannot be found
			e.printStackTrace();
		}
	}

}
