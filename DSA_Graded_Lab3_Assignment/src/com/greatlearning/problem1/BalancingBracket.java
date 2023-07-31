package com.greatlearning.problem1;

import java.util.Stack;

public class BalancingBracket {

	public static void main(String[] args) {
		String bracketExpression =  "(([[{}]]))";
		
		 boolean result;
		 result = isBracketBlanaced(bracketExpression);
			if(result)
				System.out.println("The Entered string has Balanced Brackets");
			else
			System.out.println("The Entered string does not contains Balanced Brackets");
				 
	}

	private static boolean isBracketBlanaced(String bracketExpression) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<bracketExpression.length();i++) {
			char ch = bracketExpression.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
			stack.push(ch);
			else if(ch==')'||ch=='}'||ch==']') {
				if(stack.isEmpty())
					return false;
				stack.pop();
			}
		}
		return stack.isEmpty()?true:false;

	}

}
