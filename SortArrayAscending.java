package com.BridgeLabz.Day3;

public class SortArrayAscending {
	
         public static void main(String[] args) {
			
        	 int[] array = {55,65,56,42,50};
        	 
        	 for(int index=0; index<array.length; index++) {
        		 for(int j =index+1; j<array.length; j++) {
        			 if(array[index]>array[j]) {
        				 int value = array[index];
        				 array[index]=array[j];
        				 array[j]=value;
        			 }
        		 }
        	 }
        	 for(int index=0; index<array.length; index++) {
        		 System.out.println(array[index]+" ");
        	 }
		}

}
