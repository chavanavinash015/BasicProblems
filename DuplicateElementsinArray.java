package com.BridgeLabz.Day3;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		
		int[]array= {15,24,36,15,54,22,15};
		
		for(int index=0; index<array.length; index++) {
			for(int j=index+1; j<array.length; j++) {
				if(array[index]==array[j]) {
					System.out.println(" Duplicate Elements -"+array[index]);
	               return;
				}
			}
		}
	}
}
