package javaparser;

import java.io.*;
import java.util.*; 

import net.sourceforge.plantuml.SourceStringReader;

public class Main {
	public static void main(String[] args) throws Exception {
		args= new String[2];
		//Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a folder path: ");
		//args[0] = reader.next();
		System.out.println("Enter a output file name: ");
		//args[1] = reader.next();
		
		/* test case 1 */
		for (int i = 1; i <= 5; i++) {
			args[0] = "uml_cases/uml-parser-test-" + Integer.toString(i);
			args[1] = "uml" + Integer.toString(i) + ".png";
			
			UMLparser parser = new UMLparser(args[0], args[1]);
			parser.analyze();
		}
	}
}