public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> myNumbers = new Stack<>(4);
        myNumbers.push(10);
        myNumbers.push(20);
        myNumbers.push(30);
        myNumbers.push(40);

        /*
        30
        20
        10
        */
        // System.out.println("Top: at line 13: " + myNumbers.top());
        // myNumbers.pop();
        // System.out.println("Top: " + myNumbers.top());
        // myNumbers.pop();
        // System.out.println("Top: " + myNumbers.top());
        // myNumbers.pop();
        // System.out.println("Top: " + myNumbers.top());

        // int removedElement = (int) myNumbers.pop();
        // System.out.println(removedElement);

        // System.out.println(myNumbers.top());
        // System.out.println(myNumbers.size());

        Stack<String> nameList = new Stack<String>(3);
        nameList.push("John");
        nameList.push("Kim");
        System.out.println(nameList.top());
        



    }
    
}
