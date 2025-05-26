package com.dvs.staticconcept;

public class Static2 {
	
	
	
	
	public Static2() {
		System.out.println("Constructor");
	}
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Non static block");
	}
	
	  

	public static void main(String[] args) {
		//System.out.println("Main");
		
		//new Static2();
		

	}

}
