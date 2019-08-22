package datastructures.stacksandqueues.utilities;

import datastructures.stacksandqueues.Stack;

public class MultiBracketValidation {


    public static boolean multiBracketValidation(String input){

        if (input.isEmpty()){
            return false;
        }
        Stack<Character> brackets = new Stack<>();

        boolean result = false;
        int bracketCount = 0;
        for (int i = 0; i < input.length(); i++){
            char currentBracket = input.charAt(i);
            switch (currentBracket) {
                case '(':
                case '[':
                case '{':
                    bracketCount++;
                    brackets.push(currentBracket);
                    break;
                case ')':
                case ']':
                case '}':
                    bracketCount++;
                    if (brackets.isEmpty()){
                        return false;
                    }
                    if (!brackets.isEmpty()) {
                        char previousBracket = brackets.pop();
                        if ( (currentBracket == ')' && previousBracket == '(') ||
                             (currentBracket == '}' && previousBracket == '{') ||
                             (currentBracket == ']' && previousBracket == '[')  ){
                            continue;
                        } else {
                            return false;
                        }
                    }
                    break;
            }
        }
        if (bracketCount == 0){
            return false;
        }
        if (brackets.isEmpty() ){
            result =  true;
        }
        return result;
    }
}
