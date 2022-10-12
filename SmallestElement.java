package com.BridgeLabz.Day3;

public class SmallestElement {

	public static void main(String[] args) {
		
		int[] array= {45,24,62,35,42,56};
		
		int min = array[0];
		for(int index=1; index<array.length; index++) {
			if(array[index]<min) min = array[index];
		}
		System.out.println(min);
	}
}
