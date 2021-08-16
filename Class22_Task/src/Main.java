import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
import java.util.Queue;
class Main {

    public static void main(String[] args) {

        //   Mom
        //   Was it a car or a cat I saw?
        //   Madam, in Eden, I’m Adam.
        //   Yo, banana boy!

        System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();
        Queue queue = new LinkedList();
        inputString = inputString.replaceAll("[^a-zA-Z]", "").toLowerCase();

        ////////// Using Stack:
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }
        if (inputString.equals(reverseString)) {
            System.out.println("The input is a palindrome using Stack.");
        } else {
            System.out.println("The input is not a palindrome using Stack.");
        }

        /////////////  Using Queue:

        for (int i = inputString.length()-1;
             i >=0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseStringTwo = "";
        while (!queue.isEmpty()) {
            reverseStringTwo = reverseStringTwo+queue.remove();
        }if (inputString.equals(reverseStringTwo))
            System.out.println("The input is a palindrome  using Queue.");
        else {
            System.out.println("The input is not a palindrome using Queue.");
        }
    }
}

