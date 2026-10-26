
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    public static boolean isDigits(String inString){
        if (inString == null || inString.isEmpty()) 
            return false;
        for (char c : inString.toCharArray()) {
            if (!Character.isDigit(c)) 
               return false;
        }
        return true;
    }

   public static void testPalindrome(PrintWriter out){
        System.out.println("\nSTACK 1: PALINDROME");
        out.println("\nSTACK 1: PALINDROME");


        MyStack<Character> stack = new MyStack<>();
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("tacocat", "bubba","a", "mom","abba", "abccba", "abcba" ));
        // PRE: A list of words is provided
        // POST: Checks if each word is a palindrome
        for (String word : wordList) {


            stack.clear();


            // Add each letter to the stack
            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }


            boolean isPalindrome = true;


            // Compare original letters with stack letters
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }


            System.out.println(word + " is a palindrome: " + isPalindrome);
            out.println(word + " is a palindrome: " + isPalindrome);
        }
    }


    public static void testPostFixExpression(PrintWriter out) {
       System.out.println("\nSTACK 2: POSTFIX EVALUATOR");
       out.println("\nSTACK 2: POSTFIX EVALUATOR");      


       ArrayList<String> expList = new ArrayList<>(Arrays.asList(
           "5 7 * 15 + 25 *",
           "5 0 / 4 +",
           "15 2 * 3 / 15 +",
           "3 5 7 + *",
           "3 5 6"));


   }

    
    public static void testPreFixExpression(PrintWriter out) {
        System.out.println("\nSTACK 3: PREFIX EVALUATOR");
        out.println("\nSTACK 3: PREFIX EVALUATOR");


        ArrayList<String> expList = new ArrayList<>(Arrays.asList(
            "+ * 7 5 + 6 7",
            "- + 7 * 4 5 + 2 0",
            "- / 18 / 6 3 2",
            "* 25 + 15 * 7 5",
            "+ 4 / 0 5",
            "+ 15 / 3 * 2 15",
            "* + 7 5 3",
            "6 5 3"));
}
    //PRE: Accepts a PrintWriter object to write output to a file
    //POST: Evaluates a series of decimal numbers and calls helper method to convert them to binary
    //POST: Prints the results to the console and the output file
    public static void testDecToBinary(PrintWriter out) {
        System.out.println("\nSTACK 4: DECIMAL TO BINARY EVALUATOR");
        out.println("\nSTACK 4: DECIMAL TO BINARY EVALUATOR");

        ArrayList<Integer> binary = new ArrayList<>(Arrays.asList(15, 81, 105, 255, 256, 0, 1 ));

        for (int num : binary) {
            String binaryString = decToBinary(num);
            System.out.println("Decimal: " + num + " -> Binary: " + binaryString);
            out.println("Decimal: " + num + " -> Binary: " + binaryString);
        }
 
    }


   public static void testIsBalanced(PrintWriter out) {
        System.out.println("\nSTACK 5: PARENTHESIS IS BALANCED EVALUATOR");
        out.println("\nSTACK 5: PARENTHESIS IS BALANCED EVALUATOR");


        ArrayList<String> expList = new ArrayList<>(Arrays.asList(
            "[7 + (4 - 3)] - (3 * 4)",
            "[7 + (4 - 3] - (3 * 4)",
            "4 + 6 - 7",
            "([x + y] + {z * w})",
            "{(1 + [2 * 3]) - 4}",
            "([x + y] + z}"));


        // PRE: A list of expressions is provided
        // POST: Checks if brackets are balanced and prints results
        for (String expression : expList) {


            MyStack<Character> stack = new MyStack<>();
            boolean balanced = true;


            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);


                // Add opening brackets to stack
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                }


                // Check closing brackets
                else if (c == ')' || c == ']' || c == '}') {


                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }


                    char open = stack.pop();


                    if ((c == ')' && open != '(') ||
                        (c == ']' && open != '[') ||
                        (c == '}' && open != '{')) {


                        balanced = false;
                        break;
                    }
                }
            }


            // Check for leftover opening brackets
            if (!stack.isEmpty()) {
                balanced = false;
            }


            String result = balanced ? "balanced" : "not balanced";


            System.out.println("The expression " + expression + " is " + result);
            out.println("The expression " + expression + " is " + result);
        }
    }


    //PRE: Accepts a PrintWriter object to write output to a file
    //POST: Evaluates a series of commands for adding, undoing, and redoing actions, and prints the results to the console and the output file
    public static void testUndoRedo(PrintWriter out) {
        System.out.println("\nSTACK 6: UNDO REDO FUNCTION EVALUATOR");
        out.println("\nSTACK 6: UNDO REDO FUNCTION EVALUATOR");

        ArrayList<String> expList = new ArrayList<>(Arrays.asList(
            "D add a", "D add b", "D add c", "R", "U","U","R","U","D add d", "U", "U", "U", "R", "F", "Q"));
        // I want a stack to keep track of values that have been added, and a stack to keep track of values that have been undone. 

        MyStack<String> addedStack = new MyStack<>();
        MyStack<String> undoneStack = new MyStack<>();

        // When I add a value, I push it onto the added stack. 
        // When I undo, I pop from the added stack and push onto the undone stack. 
        // When I redo, I pop from the undone stack and push back onto the added stack. 
        // This way, I can keep track of the current state of the list and allow for multiple undos and redos.
        for (String command : expList) {
            // Process each command and perform the corresponding action (add, undo, redo, etc.)
            switch (command.charAt(0)) {
                case 'D':
                    // Add the element to the list
                    String elementToAdd = command.substring(6); // Extract the element after "D add "
                    addedStack.push(elementToAdd);
                    System.out.println("Performing: add" + elementToAdd);
                    out.println("Performing: add " + elementToAdd);
                    break;
                case 'U': 
                    // Undo the last action
                    if (!addedStack.isEmpty()) {
                        String elementToUndo = addedStack.pop();
                        undoneStack.push(elementToUndo);
                        System.out.println("Undoing: command: " + command + elementToUndo);
                        out.println("Undoing: command: " + command + elementToUndo);
                    } else {
                        System.out.println("Stack is empty.");
                        out.println("Stack is empty.");
                    }
                    break;
                case 'R':
                    // Redo the last undone action
                    if (!undoneStack.isEmpty()) {
                        String elementToRedo = undoneStack.pop();
                        addedStack.push(elementToRedo);
                        System.out.println("Redoing: command: " + command + elementToRedo);
                        out.println("Redoing: command: " + command + elementToRedo);
                    } else {
                        System.out.println("Stack is empty.");
                        out.println("Stack is empty.");
                    }
                    break;
                case 'F':
                    // Finish processing commands
                    System.out.println("Invalid command entered: " + command);
                    out.println("Invalid command entered: " + command);
                    break;
                case 'Q':
                    // Quit the program
                    System.out.println("Program ending.");
                    out.println("Program ending.");
                    return; // Exit the method
                default:
                    System.out.println("Unknown command: " + command);
                    out.println("Unknown command: " + command);
            }
        }

    }


    //PRE: Accepts an integer is input
    //POST: Validates the input and converts the decimal number to binary using a stack, returning the binary representation as a string
    private static String decToBinary(int num) {
        if (num < 0) 
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        
        if (num == 0) {
            return "0";
        }
        else {
            // Convert the number to binary and use a stack to reverse the order of the bits
            // binary uses base 2, so I can repeatedly divide the number by 2, pushing the remainder onto the stack
            // then use the StringBuilder and pop operations on the stack to get the binary in the correct order
            // Example: 10 in binary is 1010
            // 10/2 = 5 R 0 (push 0); 5/2 = 2 R 1 (push 1); 2/2 = 1 R 0 (push 0); 1/2 = 0 R 1 (push 1)
            // Popping the stack gives us the reverse order: 1, 0, 1, 0
            
            StringBuilder binaryString = new StringBuilder();
            MyStack<Integer> stack = new MyStack<>();
            while (num > 0) {
                stack.push(num % 2);
                num /= 2;
            }
            
            while (!stack.isEmpty()) {
                binaryString.append(stack.pop());
            }
            return binaryString.toString();
        }
    }

}
