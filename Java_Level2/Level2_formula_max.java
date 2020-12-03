// 프로그래머스 - [카카오 인턴] 수식 최대화

import java.util.*;

public class Level2_formula_max {

	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		long answer = 0;
		
		char[][] operator = {{'*', '+', '-'},{'*', '-', '+'},{'+', '-', '*'},{'+', '*', '-'},{'-', '+', '*'},{'-', '*', '+'}};
		
		int operator_num = 0;
		
		for(int i = 0; i < operator[0].length; i++) {
			String[] str1 = expression.split("\\" + operator[0][i]);
			operator_num += str1.length - 1;
		}
		
		ArrayList<Long> nums = new ArrayList<Long>();
		
		String temp = expression.replaceAll("-", "\\+").replaceAll("\\*", "\\+");
		
		for(int i = 0; i < operator_num + 1; i++) {
			int idx = temp.indexOf("+");
			
			if(idx == -1) {
				nums.add(Long.parseLong(temp));
				break;
			}
			
			nums.add(Long.parseLong(temp.substring(0, idx)));
			temp = temp.substring(idx + 1);
		}
		
		ArrayList<Character> operators = new ArrayList<Character>();
		
		for(int i = 0; i < expression.length(); i++) {
			if(expression.charAt(i) == '+') {
				operators.add('+');
			}else if(expression.charAt(i) == '-') {
				operators.add('-');
			}else if(expression.charAt(i) == '*') {
				operators.add('*');
			}
		}
		
		
		for(int k = 0; k < operator.length; k++) {
			@SuppressWarnings("unchecked")
			ArrayList<Long> nums_temp = (ArrayList<Long>)nums.clone();
			@SuppressWarnings("unchecked")
			ArrayList<Character> operators_temp = (ArrayList<Character>)operators.clone();
			
			for(int i = 0; i < operator[0].length; i++) {
				if(operator[k][i] == '+') {
					while(operators_temp.contains(operator[k][i])) {
						int idx = operators_temp.indexOf(operator[k][i]);
						long sum = nums_temp.get(idx) + nums_temp.get(idx + 1);
						nums_temp.set(idx, sum);
						nums_temp.remove(idx + 1);
						operators_temp.remove(idx);
					}
				}else if(operator[k][i] == '-') {
					while(operators_temp.contains(operator[k][i])) {
						int idx = operators_temp.indexOf(operator[k][i]);
						long sum = nums_temp.get(idx) - nums_temp.get(idx + 1);
						nums_temp.set(idx, sum);
						nums_temp.remove(idx + 1);
						operators_temp.remove(idx);
					}
				}else if(operator[k][i] == '*') {
					while(operators_temp.contains(operator[k][i])) {
						int idx = operators_temp.indexOf(operator[k][i]);
						long sum = nums_temp.get(idx) * nums_temp.get(idx + 1);
						nums_temp.set(idx, sum);
						nums_temp.remove(idx + 1);
						operators_temp.remove(idx);
					}
				}
			}
		
			if(answer < Math.abs(nums_temp.get(0)))
				answer = Math.abs(nums_temp.get(0));
		}
		
		System.out.println(answer);
	}

}
