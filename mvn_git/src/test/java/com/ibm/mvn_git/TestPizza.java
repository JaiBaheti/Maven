package com.ibm.mvn_git;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestPizza {
	private static Pizza piz;
	
	@BeforeAll
	public static void setup() {
		piz = new Pizza();
	}
	
	@Test
	public void invalidOrder() {
		assertThrows(OrderCancelledException.class, ()->piz.order("S",1));
	}
	@Test
	public void invalidNumber() {
		assertThrows(NumberFormatException.class, ()->piz.order("", -1));
	}
}
