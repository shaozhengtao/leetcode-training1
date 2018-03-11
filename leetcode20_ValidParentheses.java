import java.util.Stack;

public class leetcode20_ValidParentheses {
	public static boolean ValidParentheses(String s) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push(')');
			}else if(s.charAt(i)=='[') {
				stack.push(']');
			}else if(s.charAt(i)=='{') {
				stack.push('}');
			}else if(stack.isEmpty() || stack.pop()!=s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s="([)]";
		boolean res=ValidParentheses(s);
		System.out.println(res);
	}
}
