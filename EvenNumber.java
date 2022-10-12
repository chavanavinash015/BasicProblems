package com.BridgeLabz.Day3;

public class EvenNumber {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		for(int index=0; index<array.length; index++) {
			if(index%2==0) {
			   System.out.println(index+" Even Number ");
			}
		}
	}
}
