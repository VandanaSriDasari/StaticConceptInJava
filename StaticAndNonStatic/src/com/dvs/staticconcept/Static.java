package com.dvs.staticconcept;

import java.util.Random;

public class Static {
	   static int number;  //make this static and see the difference
	//int onum;

	public static void main(String[] args) {
		System.out.println(Static.number);
		System.out.println("Accessing STatic fielddd");
		//static is shared memory..it is a single copy hence everytime we assign it is overriden
		
		
		
		System.out.println("Accessing Non static fields using objects");
		Static s1=new Static();
		s1.number=new Random().nextInt();
		System.out.println(s1.number); 
		
		Static s2=new Static();
		s2.number=new Random().nextInt();
		
		Static s3=new Static();
		s3.number=new Random().nextInt();
		
		System.out.println(s1.number);
		System.out.println(s2.number);
		System.out.println(s3.number);
		

	}

}
