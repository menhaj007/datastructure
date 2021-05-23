public class Palindrome {
    public static void main(String[] args) {
        String input = args[0];
        System.out.println(isPalindrome(input));

        //This is just an easy example to practice stack. LIFO.
        
    }
    public static boolean isPalindrome(String userInput) {
        Stack<Character> userStringStack = new Stack<Character>(userInput.length());
        for (int i =0; i < userInput.length(); i++) {
            userStringStack.push(userInput.charAt(i));
        }

        for (int i = 0; i < userStringStack.size(); i++) {
            if (userInput.charAt(i) != userStringStack.pop()) {
                return false;
            }
        }
        return true;
    }
    
}
