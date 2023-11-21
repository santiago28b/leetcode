package leetcode;

import java.util.Stack;

public class validpar {
	
	
	public boolean isValid(String s) {
       
		Stack<Character> stack = new Stack<Character>();
		
		for(char charsito: s.toCharArray()) {
			if(charsito == '(') {
				stack.push(')');  //when there is an opening parentheses we will push the closing parentheses to the stack
			}
			else if(charsito == '[') {
				stack.push(']');
			}
			else if (charsito == '{') {
				stack.push('}');
			}
			
			else if(stack.isEmpty() || stack.pop() != charsito) { //if stack is empty at this point there were not opening parentheses therefore returns false
				// or if the first element at the top that we are removing from the stack does not macth the element we are evaluating at the moment it has to
				//return false since it is a mismatch
				return false;
			}
			
		}
        return stack.isEmpty(); // if the stack is empty it means that we match each opening parentheses with a closing, otherwise if there are still 
        //some items left it will return false since we did not find any match for those elements therefore we return false.
        
    }
	
	public static void main(String[] args) {
		
		validpar solution = new validpar();
		
		String testString1 = "{[()]}";
        System.out.println("\"" + testString1 + "\" is valid: " + solution.isValid(testString1)); // Output: true

        String testString2 = "{[(])}";
        System.out.println("\"" + testString2 + "\" is valid: " + solution.isValid(testString2)); // Output: false

		
	}

}
