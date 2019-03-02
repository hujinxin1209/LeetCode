package stack;

import java.util.Stack;

//Input: "()"
//Output: true
//Input: "()[]{}"
//Output: true
public class ValidParentheses_20 {
	public static boolean isValid(String s) {
		char[] chars = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(char c : chars) {
			if(c == '(') {
				stack.push(')');
			} else if(c == '[') {
				stack.push(']');
			} else if(c == '{') {
				stack.push('}');
			} else if(stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("{}()]["));
		System.out.println(isValid("{}()[]"));
	}
	
	public static boolean isValid1(String s) {
		int length;
		do {
			length = s.length();
			s.replace("()", "").replace("{}", "").replace("[]", "");
		} while(length != s.length());
		return s.length() == 0;
	}
	
}
