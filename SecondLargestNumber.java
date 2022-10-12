package com.BridgeLabz.Day3;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int largest = 0;
		int secondlargest= 0;
		
		int[] array = {15,34,52,68,49,15,25};
		
		for(int index=0; index<array.length; index++) {
			if(array[index]>largest) {
				secondlargest=largest;
				largest=array[index];
			}else if(array[index]>secondlargest) {
				secondlargest= array[index];
			}
		}
		System.out.println("First Largest Number = "+largest);
		System.out.println("second largest Number = "+secondlargest);
	}
}
