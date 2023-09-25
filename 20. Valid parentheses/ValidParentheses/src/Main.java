import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "(){}}{";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if ((c == ')' || c == ']' || c == '}') && stack.isEmpty()) {
                System.out.println(false);
                break;
            }
            switch (c) {
                case ')':
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.peek() == '[') {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                    break;
                default:
            }
        }
        System.out.println(stack.isEmpty());
    }
}
