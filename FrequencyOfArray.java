package com.BridgeLabz.Day3;

public class FrequencyOfArray {

	public static void main(String[] args) {
		int[] array = { 10, 20, 10, 65, 45, 23, 20, 45, 65, 10, 41, 65 };
		boolean[] visited = new boolean[array.length];
//		for (int index = 0; index < array.length; index++) {
//                   System.out.println(array[index]+"  ");
//		}

		for (int index = 0; index < array.length; index++) {
			int count = 1;
			if (visited[index]) {
				continue;
			}
			for (int j = index + 1; j < array.length; j++) {
				if (array[index] == array[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(array[index] + " => " + count);
		}
	}
}