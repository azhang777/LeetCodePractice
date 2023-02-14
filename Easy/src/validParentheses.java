import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParentheses {
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();
        for (char c: s.toCharArray()) {
            if (c == '(') {
                myStack.push(')');
            }
            else if(c == '[') {
                myStack.push(']');
            }
            else if (c == '{') {
                myStack.push('}');
            }
            else if (myStack.isEmpty() || myStack.pop() != c) {
                return false;
            }
        }
        return myStack.isEmpty();
    }
    public static void main(String[] args) {
        isValid("()[]{}");
    }
}
