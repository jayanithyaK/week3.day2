package week3.day2;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] char1 = test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			if (Character.isLetter(char1[i]))
				letter++;
			else if (Character.isDigit(char1[i]))
				num++;
			else if (Character.isSpaceChar(char1[i]))
				space++;
			else
				specialChar++;

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

	}


