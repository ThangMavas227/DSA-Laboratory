package Thang.Problem03_Brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketCheck {
    public static boolean check(String line) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (!match(open, c)) return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean match (char open, char c) {
        return (open == '(' && c == ')') ||
                (open == '[' && c == ']') ||
                (open == '{' && c == '}');
    }
}

