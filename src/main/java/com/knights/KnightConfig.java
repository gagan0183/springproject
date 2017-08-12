package com.knights;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration
public class KnightConfig {
	@Bean
	public PrintStream printStream() {
		return System.out;
	}
	
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	@Conditional(value = MagicExistsConditions.class)
	public Quest quest() {
		return new SlayQuest(printStream());
	}
}
