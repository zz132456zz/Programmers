// 프로그래머스 - 소수 찾기

import java.util.*;

public class Level2_find_prime_number {
	
	public static void permutation(int[] arr, int a, int b, ArrayList<Integer> arr2) {
		String temp = "";	
		
		if(a==b) {
			for(int i = 0; i < b; i++) {
				temp += Integer.toString(arr[i]);
			}
			arr2.add(Integer.parseInt(temp));
			return;
		}
	
		for(int i = 0; i + a < arr.length; i++) {
			swap(arr, a, a + i);
			permutation(arr, a + 1, b, arr2);
			swap(arr, a, a + i);			
		}
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		String numbers = "011";
		
		int[] arr = new int[numbers.length()];
		
		for(int i = 0; i < numbers.length(); i++) {
			arr[i] = Integer.parseInt(Character.toString(numbers.charAt(i)));
		}
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>(); // 모든순열저장 배열
		ArrayList<Integer> arr3 = new ArrayList<Integer>(); // 중복제거 배열
		
		for(int i = 0; i < arr.length; i++) {
			permutation(arr, 0 , i + 1, arr2);
		}
		
		for(int i = 0; i < arr2.size(); i++) {
			if(!arr3.contains(arr2.get(i))) {
				arr3.add(arr2.get(i));
			}
		}
		
		int answer = arr3.size();
		
		for(int i = 0; i < arr3.size(); i++) {
			if(arr3.get(i) == 0 || arr3.get(i) == 1) {
				answer--;
				continue;
			}
			
			for(int j = 2; j < arr3.get(i); j++) {
				if(arr3.get(i) % j == 0) {
					answer--;
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
