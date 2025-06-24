/*
 * Name: Hammad Ahmed
 * Roll Number: 2k24/CSE/62
 * Course: Data Structures and Algorithms
 * Assignment: 1
 */

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

// 2. Program to match the parentheses stored in a string using a stack data structure.
public class ParenthesesMatcher {

    /**
     * Checks if the parentheses in a string are balanced.
     * @param expression The string to check.
     * @return true if parentheses are balanced, false otherwise.
     */
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        // Using a Map is a clean way to store bracket pairs
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');

        for (char c : expression.toCharArray()) {
            // If it's an opening bracket, push it onto the stack.
            if (bracketMap.containsKey(c)) {
                stack.push(c);
            }
            // If it's a closing bracket.
            else if (bracketMap.containsValue(c)) {
                // If stack is empty, there's no matching opening bracket.
                if (stack.isEmpty()) {
                    return false;
                }
                // Check if the popped opening bracket matches the current closing one.
                char openBracket = stack.pop();
                if (bracketMap.get(openBracket) != c) {
                    return false;
                }
            }
        }

        // If the stack is empty at the end, all brackets were matched.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // --- Example Usage ---

        System.out.println("--- Example 1: Balanced ---");
        String balancedExpr = "({a + b}) * [c - (d / e)]";
        System.out.println("Expression: " + balancedExpr);
        System.out.println("Are parentheses balanced? -> " + areParenthesesBalanced(balancedExpr));
        System.out.println("--------------------");

        System.out.println("\n--- Example 2: Unbalanced (Mismatched) ---");
        String unbalancedExpr1 = "([a + b)]";
        System.out.println("Expression: " + unbalancedExpr1);
        System.out.println("Are parentheses balanced? -> " + areParenthesesBalanced(unbalancedExpr1));
        System.out.println("--------------------");

        System.out.println("\n--- Example 3: Unbalanced (Extra Closing) ---");
        String unbalancedExpr2 = "{a + b}})";
        System.out.println("Expression: " + unbalancedExpr2);
        System.out.println("Are parentheses balanced? -> " + areParenthesesBalanced(unbalancedExpr2));
        System.out.println("--------------------");

        System.out.println("\n--- Example 4: Unbalanced (Extra Opening) ---");
        String unbalancedExpr3 = "((a+b)";
        System.out.println("Expression: " + unbalancedExpr3);
        System.out.println("Are parentheses balanced? -> " + areParenthesesBalanced(unbalancedExpr3));
        System.out.println("--------------------");
    }
}

/*
--- Example Output ---
--- Example 1: Balanced ---
Expression: ({a + b}) * [c - (d / e)]
Are parentheses balanced? -> true
--------------------

--- Example 2: Unbalanced (Mismatched) ---
Expression: ([a + b)]
Are parentheses balanced? -> false
--------------------

--- Example 3: Unbalanced (Extra Closing) ---
Expression: {a + b}})
Are parentheses balanced? -> false
--------------------

--- Example 4: Unbalanced (Extra Opening) ---
Expression: ((a+b)
Are parentheses balanced? -> false
--------------------
*/
