import java.util.Stack;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0 ) {
            return false;
        }
        int div = 1;

        while (x >= div * 10) {
            div = div * 10;
        }
        while (x > 0) {
            int right = x % 10;
            int left = x / div;
            if (right != left) {
                return false;
            }
            x = (x % div) / 10;
            div = div / 100;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
/*
        Stack<Character> myStack = new Stack<Character>();
        String stringConversion = Integer.toString(x);
        char[] tempArray = new char[stringConversion.length()];
        char[] compArray = new char[stringConversion.length()];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = stringConversion.charAt(i);
            myStack.push(tempArray[i]);
        }

        for (int i = 0; i < tempArray.length; i++) {
            compArray[i] = myStack.pop();
            if (tempArray[i] != compArray[i]) {
                return false;
            }
        }
        return true;
 */

/*


/*
public boolean isPalindrome(int num){
   if(num < 0) return  false;
   int reversed = 0, remainder, original = num;
   while(num != 0) {
        remainder = num % 10; // reversed integer is stored in variable
        reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
        num  /= 10;  //the last digit is removed from num after division by 10.
    }
    // palindrome if original and reversed are equal
    return original == reversed;
} say 1221. we 1221%10 = 1, reversed * 10 + 1 = 1, 1221/= 10 = 122. REPEAT 122%10 = 2, reversed * 10 + 2 = 12, 122/10 = 12. REPEAT we will get 1221 as palindrome.
 */