package assin4sorting;

import java.util.Scanner;

import binarysearch.binary;

public class sorting {

	public static void main(String[] args) {

		sorting2 obj1 = new sorting2();
		Thread obj2 = new Thread(obj1);
		obj2.start();

		System.out.println("enter the value");
		Scanner sc = new Scanner(System.in);
		sorting3 obj3 = new sorting3();
		obj3.start();

		// binary.bubbleSort();

		System.out.println("\n" + "Enter the number to find the index value");

		Scanner scc = new Scanner(System.in);
		int i = scc.nextInt();
		sorting3 mba = new sorting3();
		//int[] arr2=mba.start(inputArr,i);

		System.out.println("Key position: "+ mba.run(obj1.getArr(), i));
  
	}

}
