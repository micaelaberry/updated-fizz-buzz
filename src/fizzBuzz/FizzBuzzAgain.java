package fizzBuzz;

import java.util.ArrayList;
import java.util.Collections;

//public class FizzBuzzAgain {
//
//	public static void main(String args[]) {
//
//		ArrayList<String> numberOrder = new ArrayList<String>();
//		numberOrder.add("1");
//		numberOrder.add("2");
//		numberOrder.add("3");
//		numberOrder.add("4");
//		numberOrder.add("5");
//		
//
//		Collections.sort(numberOrder, Collections.reverseOrder());
//
//		System.out.println("ArrayList in descending order:");
//		for (String number : numberOrder) {
//			System.out.println(number);
//		}
//	}
//}
//--------
import java.util.Collections;

public class FizzBuzzAgain {

	public static void main(String[] args) {

		String numberOrder = "1 2, 3 4, 5";
		String[] elements = numberOrder.split(", ");

	//	Collections.sort(numberOrder, Collections.reverseOrder());

		System.out.println("List in descending order:");
		for (String number : elements) {
			System.out.println(number);
		}
	}
}
// --------

// public static String fizzBuzz(int number) {
// if (isFizz(number) && (isBuzz(number))) {
// return "fizzbuzz";
// } else if (isBuzz(number)) {
// return "buzz";
// } else if (isFizz(number)) {
// return "fizz";
// }
// return String.valueOf(number);
// }
//
// public static boolean isFizz(int number){
// return number % 3 == 0;
// }
//
// public static boolean isBuzz(int number){
// return number % 5 ==0;
// }
// }

// public static String fizzBuzz(int number) {
// if (number % 15 == 0) {
// return "fizzbuzz";
// } else if (number % 5 == 0) {
// return "buzz";
// } else if (number % 3 == 0) {
// return "fizz";
// }
// return String.valueOf(number);
// }