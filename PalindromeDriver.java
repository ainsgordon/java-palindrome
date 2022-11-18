import java.util.Scanner;
import java.util.Stack;

public class PalindromeDriver {

	public static void main(String[] args) {
		LinkedQueueAlt<Character> phrase = new LinkedQueueAlt<>();
		Stack<Character> backwardPhrase = new Stack<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word/phrase");
		String allLetters = scan.nextLine().toLowerCase();
		
		String backwardsLetters = "";

		//First enqueue letters into the queue
		for (int i = 0; i  < allLetters.length(); i++) {
			phrase.enqueue(allLetters.charAt(i));
		}
		
		
		//Dequeue letters and push onto the stack
		
		while(!(phrase.isEmpty())) {
			backwardPhrase.push(phrase.dequeue());
		}
		
		
		//Pop stack to create the reverse word
		while(!(backwardPhrase.isEmpty())) {
			backwardsLetters += backwardPhrase.pop();
		}
		
		
		
		System.out.println("Word/Phrase is " + allLetters + "\nReverse word/phrase is " + backwardsLetters);
		if(allLetters.equals(backwardsLetters)) {
			System.out.println(allLetters + " is a pallindrome!");
		}
		else {
			System.out.println(allLetters + " is NOT a pallindrome");
		}

	}

}