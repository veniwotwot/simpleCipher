package simpleCipher;

public class Cipher {

	public static void main(String[] args) {
		String test = "This is a basic message for testing";
		String test2 = "Mike and Morris lived in the same village. While Morris owned the largest "
				+ "jewelry shop in the village, Mike was a poor farmer. Both had large families with many sons, "
				+ "daughters-in-law and grandchildren. One fine day, Mike, tired of not being able to feed his "
				+ "family, decided to leave the village and move to the city where he was certain to earn enough "
				+ "to feed everyone. Along with his family, he left the village for the city. At night, they "
				+ "stopped under a large tree. There was a stream running nearby where they could freshen up "
				+ "themselves. He told his sons to clear the area below the tree, he told his wife to fetch "
				+ "water and he instructed his daughters-in-law to make up the fire and started cutting wood "
				+ "from the tree himself. They didn’t know that in the branches of the tree, there was a thief"
				+ " hiding. He watched as Mike’s family worked together and also noticed that they had nothing"
				+ " to cook. Mike’s wife also thought the same and asked her husband ” Everything is ready but "
				+ "what shall we eat?”. Mike raised his hands to heaven and said ” Don’t worry. He is watching "
				+ "all of this from above. He will help us.”\r\n"
				+ "";
		Cipher c = new Cipher();
		c.execute(test2);
	}

	// execute will encode and then decode the message. for decoding only,
	// comment out the line String result = encode(t);
	private void execute(String t) {
		System.out.println("The input is: " + t);
		System.out.println();

		String result = encode(t);
		System.out.println("The result is: " + result);

		result = decode(result);
		System.out.println("The result is: " + result);
	}

	// Given a string, return an encoded string.
	private String encode(String in) {
		char[] c_arr = in.toCharArray();
		char[] out = new char[c_arr.length];

		for (int i = 0; i < c_arr.length; i++) {
			out[i] = encodeHelper(c_arr[i]);
		}

		String output = new String(out);
		return output;
	}

	// Given a char, return an encoded char. Fully converts all characters into
	// lower case.
	private char encodeHelper(char c) {
		char result = encodeKey(c);
		return result;
	}

	// Given a string, return a decoded string.
	private String decode(String in) {
		char[] c_arr = in.toCharArray();
		char[] out = new char[c_arr.length];

		for (int i = 0; i < c_arr.length; i++) {
			out[i] = decodeHelper(c_arr[i]);
		}

		String output = new String(out);
		return output;
	}

	// Given a char, return an decoded char. Fully converts all characters into
	// lower case.
	private char decodeHelper(char c) {
		char result = decodeKey(c);
		return result;
	}

	// Refactoring encodeHelper() and checkKey() into a single function is possible,
	// but I left it as two functions to make it easier to understand what is
	// happening
	private char encodeKey(char c) {
		char output = ' ';
		int chance = (int) Math.random() * 10;
		switch (c) {
		case 'A':
			output = 'B';
			break;
		case 'a':
			output = 'B';
			break;
		case 'B':
			output = 'K';
			break;
		case 'b':
			output = 'k';
			break;
		case 'C':
			output = 'H';
			break;
		case 'c':
			output = 'h';
			break;
		case 'D':
			output = 'O';
			break;
		case 'd':
			output = 'o';
			break;
		case 'E':
			if (chance < 4)
				output = 'S';
			else
				output = 'P';
			break; //
		case 'e':
			if (chance < 4)
				output = 's';
			else
				output = 'p';
			break; //
		case 'F':
			output = 'G';
			break;
		case 'f':
			output = 'g';
			break;
		case 'G':
			output = 'J';
			break;
		case 'g':
			output = 'j';
			break;
		case 'H':
			output = 'U';
			break;
		case 'h':
			output = 'u';
			break;
		case 'I':
			output = 'D';
			break;
		case 'i':
			output = 'd';
			break;
		case 'J':
			output = 'X';
			break;
		case 'j':
			output = 'x';
			break;
		case 'K':
			output = 't';
			break;
		case 'k':
			output = 't';
			break;
		case 'L':
			output = 'L';
			break;
		case 'l':
			output = 'l';
			break;
		case 'M':
			output = 'F';
			break;
		case 'm':
			output = 'f';
			break;
		case 'N':
			output = 'Y';
			break;
		case 'n':
			output = 'y';
			break;
		case 'O':
			output = 'W';
			break;
		case 'o':
			output = 'w';
			break;
		case 'P':
			output = 'M';
			break;
		case 'p':
			output = 'm';
			break;
		case 'Q':
			output = 'V';
			break;
		case 'q':
			output = 'v';
			break;
		case 'R':
			output = 'R';
			break;
		case 'r':
			output = 'r';
			break;
		case 'S':
			output = 'E';
			break;
		case 's':
			output = 'e';
			break;
		case 'T':
			if (chance < 4)
				output = 'C';
			else
				output = 'A';
			break; //
		case 't':
			if (chance < 4)
				output = 'c';
			else
				output = 'a';
			break; //
		case 'U':
			output = 'Q';
			break;
		case 'u':
			output = 'q';
			break;
		case 'V':
			output = 'N';
			break;
		case 'v':
			output = 'n';
			break;
		case 'W':
			output = 'Z';
			break;
		case 'w':
			output = 'z';
			break;
		case 'X':
			output = 'E';
			break;
		case 'x':
			output = 'e';
			break;
		case 'Y':
			output = 'I';
			break;
		case 'y':
			output = 'i';
			break;
		case 'Z':
			output = 'E';
			break;
		case 'z':
			output = 'e';
			break;

		default:
			output = c;
		}

		return output;
	}

	// Copy of encodeKey(), but in reverse
	private char decodeKey(char c) {
		char output = ' ';
		switch (c) {
		case 'A':
			output = 'T';
			break;
		case 'a':
			output = 't';
			break;
		case 'B':
			output = 'A';
			break;
		case 'b':
			output = 'a';
			break;
		case 'C':
			output = 'T';
			break;
		case 'c':
			output = 't';
			break;
		case 'D':
			output = 'I';
			break;
		case 'd':
			output = 'i';
			break;
		case 'E':
			output = 'S';
			break; //
		case 'e':
			output = 's';
			break; //
		case 'F':
			output = 'M';
			break;
		case 'f':
			output = 'm';
			break;
		case 'G':
			output = 'F';
			break;
		case 'g':
			output = 'f';
			break;
		case 'H':
			output = 'C';
			break;
		case 'h':
			output = 'c';
			break;
		case 'I':
			output = 'Y';
			break;
		case 'i':
			output = 'y';
			break;
		case 'J':
			output = 'G';
			break;
		case 'j':
			output = 'g';
			break;
		case 'K':
			output = 'B';
			break;
		case 'k':
			output = 'b';
			break;
		case 'L':
			output = 'L';
			break;
		case 'l':
			output = 'l';
			break;
		case 'M':
			output = 'P';
			break;
		case 'm':
			output = 'p';
			break;
		case 'N':
			output = 'V';
			break;
		case 'n':
			output = 'v';
			break;
		case 'O':
			output = 'D';
			break;
		case 'o':
			output = 'd';
			break;
		case 'P':
			output = 'E';
			break;
		case 'p':
			output = 'e';
			break;
		case 'Q':
			output = 'U';
			break;
		case 'q':
			output = 'u';
			break;
		case 'R':
			output = 'R';
			break;
		case 'r':
			output = 'r';
			break;
		case 'S':
			output = 'e';
			break;
		case 's':
			output = 'e';
			break;
		case 'T':
			output = 'K';
			break; //
		case 't':
			output = 'k';
			break; //
		case 'U':
			output = 'H';
			break;
		case 'u':
			output = 'h';
			break;
		case 'V':
			output = 'Q';
			break;
		case 'v':
			output = 'q';
			break;
		case 'W':
			output = 'O';
			break;
		case 'w':
			output = 'o';
			break;
		case 'X':
			output = 'J';
			break;
		case 'x':
			output = 'j';
			break;
		case 'Y':
			output = 'N';
			break;
		case 'y':
			output = 'n';
			break;
		case 'Z':
			output = 'W';
			break;
		case 'z':
			output = 'w';
			break;

		default:
			output = c;
		}

		return output;
	}
}
