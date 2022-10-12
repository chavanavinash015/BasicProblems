package com.BridgeLabz.Day3;

public class LargestElement {

	public static void main(String[] args) {
		
		int[] array= {20,52,54,12,85,70};
		
		int max = array[0];
		for(int index=1; index<array.length; index++) {
			if(array[index]>max) max = array[index];
		
		}
		System.out.println(max);
	}
}
