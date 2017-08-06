package com.knights;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SlayQuest implements Quest {
	
	@Autowired
	private PrintStream printStream;
	
	public SlayQuest(PrintStream printStream) {
		this.printStream = printStream;
	}

	public void embark() {
		System.out.println("slay quest");
	}
}
