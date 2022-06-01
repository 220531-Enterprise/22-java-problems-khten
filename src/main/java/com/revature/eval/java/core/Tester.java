package com.revature.eval.java.core;

public class Tester {

	public static void main(String[] args) {
	     EvaluationService es = new EvaluationService();
	     System.out.println(es.cleanPhoneNumber("+1 (613)-455-1234"));
	     System.out.println(es.cleanPhoneNumber("(613)-455-1234"));
	     System.out.println(es.cleanPhoneNumber("613-455-1234"));
	     System.out.println(es.cleanPhoneNumber("613.455.1234"));
	     
    }
}
