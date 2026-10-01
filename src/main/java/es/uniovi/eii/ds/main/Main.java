package es.uniovi.eii.ds.main;

import java.io.*;
import java.util.*;

public class Main {
	
	private static List<String[]> instructions = new ArrayList<>();
	private static int ip = 0;

	private static int[] memory = new int[1024];

	private static int[] stack = new int[32];
	private static int sp = 0;
	
	private static Scanner console = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		BufferedReader file = new BufferedReader(new FileReader("factorial.txt"));

		String line;
		while ((line = file.readLine()) != null)
			loadInstruction(line);
		file.close();

		executeProgram();
	}

	// Takes a line from the program file and stores it in the instructions list,
	// splitting it into tokens separated by spaces. Empty lines are ignored. 
	// For example:
	//  - "push 5" -> ["push", "5"]
	//  - "add" -> ["add"]
	// 
	private static void loadInstruction(String line) {
		if (line.trim().length() == 0)
			return;

		String[] tokens = line.split(" ");
		instructions.add(tokens);
	}

	// $ Execution engine ---------------------------------------------

	private static void executeProgram() {
		while (ip < instructions.size()) {
			
			String[] sentence = instructions.get(ip);
			
			if (sentence[0].equals("push")) {
				push(Integer.parseInt(sentence[1]));
				ip++;

			} else if (sentence[0].equals("add")) {
				push(pop() + pop());
				ip++;

			} else if (sentence[0].equals("sub")) {
				int b = pop();
				int a = pop();
				push(a - b);
				ip++;

			} else if (sentence[0].equals("mul")) {
				push(pop() * pop());
				ip++;

			} else if (sentence[0].equals("jmp")) {
				ip = Integer.parseInt(sentence[1]);

			} else if (sentence[0].equals("jmpg")) {
				int b = pop();
				int a = pop();
				if (a > b)
					ip = Integer.parseInt(sentence[1]);
				else
					ip++;

			} else if (sentence[0].equals("load")) {
				int address = pop();
				push(memory[address]);
				ip++;

			} else if (sentence[0].equals("store")) {
				int value = pop();
				int address = pop();
				memory[address] = value;
				ip++;

			} else if (sentence[0].equals("input")) {
				System.out.print("Enter a number: ");
				push(console.nextInt());
				ip++;

			} else if (sentence[0].equals("output")) {
				System.out.println(pop());
				ip++;
			}
		}
	}

	// $ Stack operations ---------------------------------------------

	private static void push(int value) {
		stack[sp] = value;
		sp++;
	}

	private static int pop() {
		sp--;
		return stack[sp];
	}
}
