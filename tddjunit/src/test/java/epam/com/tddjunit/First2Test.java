package epam.com.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class First2Test {
	/*
	 * TODO list for my features
	 * 1.4 chars : ABCD => BCD
	 * 2.4 chars : AACD => CD
	 * 3.4 chars : BACD => BCD
	 * 4.4 chars : BBAA => BBAA
	 * 5.N chars : AAAAABAA => AAABAA
	 * 6.1 chars:  A => ""
	 * 7.empty chars : "" => ""
	 * 8.2 chars : BA => B
	 */
	First2check f;
	@BeforeEach
	void initial() {
		f=new First2check();
	}
	@Test
	void test4pro() {
		assertEquals("BCD",f.removeAs("ABCD"));
	}
	@Test
	void test2pro() {
		assertEquals("B",f.removeAs("BA"));
	}
	@Test
	void testnpro() {
		assertEquals("AAABAA",f.removeAs("AAAAABAA"));
	}
	@Test
	void test1pro() {
		assertEquals("",f.removeAs("A"));
	}
	@Test
	void testemptypro() {
		assertEquals("",f.removeAs(""));
	}
	
	
	

}
