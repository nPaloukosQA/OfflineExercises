package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") returns "TTThhheee"
	// multChar("AAbb") returns "AAAAAAbbbbbb"
	// multChar("Hi-There") returns "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
	
		String multy3Char = "";
		
		for (int i = 0; i < input.length(); i++) {
			for (int count = 0; count < 3; count++) {
				multy3Char += input.substring(i, i+1);
			}
		}
		return multy3Char;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") returns "evilc"
	// getBert("xxbertfridgebertyy") returns "egdirf"
	// getBert("xxBertfridgebERtyy") returns "egdirf"
	// getBert("xxbertyy") returns ""
	// getBert("xxbeRTyy") returns ""

	public String getBert(String input) {
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) returns true
	// evenlySpaced(4, 6, 2) returns true
	// evenlySpaced(4, 6, 3) returns false
	// evenlySpaced(4, 60, 9) returns false

	public boolean evenlySpaced(int a, int b, int c) {
		
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) returns "Ho"
	// nMid("Chocolate", 3) returns "Choate"
	// nMid("Chocolate", 1) returns "Choclate"

	public String nMid(String input, int a) {
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") returns true
	// endsDev("wehateDev") returns true
	// endsDev("everoyonehatesdevforreal") returns false
	// endsDev("devisnotcool") returns false

	public boolean endsDev(String input) {
		boolean devIs;
		input = input.toLowerCase();
		
		if (input.length() <= 3) {
			return false;
		} else {
			devIs = true;
		}

		return devIs;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") returns 2
	// superBlock("abbCCCddDDDeeEEE") returns 3
	// superBlock("") returns 0

	public int superBlock(String input) {
		
		
		return -1;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") returns 1
	// amISearch("I am in Amsterdam am I?") returns 2
	// amISearch("I have been in Amsterdam") returns 0

	public int amISearch(String arg1) {
		return 0;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) returns "fizz"
	// fizzBuzz(10) returns "buzz"
	// fizzBuzz(15) returns "fizzbuzz"

	public String fizzBuzz(int arg1) {
		
		String fizzbuzz = "";
		
		if((arg1 % 3) == 0) {
			fizzbuzz += "fizz";
		}
		if((arg1 % 5) == 0) {
			fizzbuzz += "buzz";
		}
		
		return fizzbuzz;
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") returns 14
	// largest("15 72 80 164") returns 11
	// largest("555 72 86 45 10") returns 15

	public int largest(String arg1) {
		return 0;

	}

}
