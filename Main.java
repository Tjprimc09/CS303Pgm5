// Tyler Prince
// 10/24/2026
// Functions implemented: Undo/Redo Command Processing and Decimal to Binary Conversion
//
// Updated 10/25/2026 to include methods implemented by Aisha Tahlil: testPalindrome(), testIsBalanced()
// Updated 10/25/2026 to include methods implemented by Natasha Jama: testPostFixExpression(), testPreFixExpression()

import java.io.IOException;
import java.io.PrintWriter;

public class Main {


    public static void main(String[] args) {

        try{
            PrintWriter out = new PrintWriter("report.txt");
            Functions.testPalindrome(out);
            Functions.testPostFixExpression(out);
            Functions.testPreFixExpression(out);
            Functions.testDecToBinary(out);
            Functions.testIsBalanced(out);
            Functions.testUndoRedo(out);
            out.close();
        }
        catch(IOException e){
            System.out.println("Error opening the file: " + e.getMessage());
        }
    }
}
