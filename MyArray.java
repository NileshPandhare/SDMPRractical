package com.demo.beans;

import java.util.Arrays;

public class MyArray {
		private int[] arr;
		private int count;
		
		public MyArray()
		{
			super();
			arr=new int[10];
			count=0;
		}
		public MyArray(int size) {
			arr=new int[size];
			
		}
		public void add(int x) {
		     if(arr.length>count) {
		    	 arr[count]=x;
		    	 count++;
		     }else {
		    	 System.out.println("Array is Full...");
		     }
		}
		
		public int getLength() {
			return arr.length;
		}
		public String toString() {
			return Arrays.toString(arr);
		}
		
		public int sum()
		{
			int s=0;
			if(arr.length>0)
			{
				for (int i = 0; i < arr.length; i++) {
					s+=arr[i];
					
				}
			}else
			{
				System.out.println("Array IS Empty");
			}
			return s;
		}
		
		public int[] reverseArray(boolean flag)
		{
			
			if(flag) {
				int i=0;
				int j=arr.length-1;
				do {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					i++;j--;
				}while(i<j);
			}else {
				int[] newarr=new int[arr.length];
			    int n=arr.length-1;
			    int j=0;
			    while(n>=0) {
			    	newarr[j]=arr[n];
			    	n--;
			    	j++;
			    }
			    return newarr;
			}
			return arr;
		}
//		public int[] replaceIndexValue()
}
