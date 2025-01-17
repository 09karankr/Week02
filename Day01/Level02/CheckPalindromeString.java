class PalindromeChecker {
   
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome(String str) {
		
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // Is a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome(text)) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}
public class CheckPalindromeString{


    public static void main(String[] args) {
        
        PalindromeChecker checker1 = new PalindromeChecker("A man, a plan, a canal, Panama");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello, World!");
        checker2.displayResult();
    }


}

