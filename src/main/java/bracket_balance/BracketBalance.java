package bracket_balance;

import java.util.Stack;

public class BracketBalance {

    /**
     * Returns true if the brackets inside the text are balanced.
     * Examples:
     * "[{()}]"      returns true
     * "]["          returns false
     * "(a+b-[c-d])" returns true
     * "([)]"        returns false
     *
     * @param text
     * @return
     */
    public static boolean isBalanced(String text) {

        boolean balanced = true;
        if (text == null)
            return true;

        // a little help, you could use the Stack structure
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(i);
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                stack.push(caracter);
                continue;
            }
            if (stack.isEmpty()) { // que diferencia existe entre Empty y isEmpty)
                return false;
            }
            char check;
            switch (caracter) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;

            }


        }
        return stack.isEmpty();
        //return balanced;
    }
}
