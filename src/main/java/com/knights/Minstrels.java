package com.knights;

import java.io.PrintStream;

public class Minstrels {
	private PrintStream printStream;
	
	public Minstrels(PrintStream printStream) {
		this.printStream = printStream;
	}
	
	public void singBeforeRequest() {
		System.out.println("before quest");
	}
	
	public void singAfterRequest() {
		System.out.println("after quest");
	}
}
