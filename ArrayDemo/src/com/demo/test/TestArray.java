package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;
import com.demo.beans.MyArray;
public class TestArray {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		MyArray ob=new MyArray(size);
		for(int i=0;i<size;i++) {
			System.out.println("Enter Elements in an Array:");
			ob.add(sc.nextInt());
		}
		System.out.println(ob);
		
		
		System.out.println("Summation is :"+ob.sum());
		System.out.println("Reveerse :"+Arrays.toString(ob.reverseArray(true)));
		


	}

}
