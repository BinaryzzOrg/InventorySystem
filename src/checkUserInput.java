import java.util.Scanner;

public class checkUserInput {
	static Scanner sc;

	public Object userInput(String prompt, String dataType) {
		sc = new Scanner(System.in);

		Object inputDataType = determineDataType(dataType);
		if (inputDataType != null) {
			return inputDataType;
		}

		System.out.println(printCustomError(dataType));
		System.out.print(prompt);
		return userInput(prompt, dataType);
	}// end method

	public Object determineDataType(String dataType) {
		sc = new Scanner(System.in);
		Object value;
		if (sc.hasNextInt() && dataType.toUpperCase().equals("INTEGER")) {
			value = sc.nextInt();
			return value;
		}

		if (sc.hasNextInt() && dataType.toUpperCase().equals("POSITIVE INTEGER")) {
			if (sc.nextInt() < 0) {
				return null;
			} else {
				return value = sc;
			}
		}

		if (sc.hasNextDouble() && dataType.toUpperCase().equals("DOUBLE")) {
			value = sc.nextDouble();
			return value;
		}

		if (!sc.hasNextInt() && dataType.toUpperCase().equals("STRING")) {
			value = removeWhiteSpace(sc.nextLine());
			return value;
		} // end if else

		return null;
	}// end method

	public static String removeWhiteSpace(String str) {
		String fixed = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				fixed += str.charAt(i);
			}
			if (str.charAt(i) != ' ') {
				fixed += str.charAt(i);
			}
		} // end for
		return fixed;
	}// end method

	public static String printCustomError(String type) {
		// @formatter:off
			return "\n" +
						"⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃\n" +
						"┇ Warning: Input is not a "+ type +" value. \n" +
						"⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃\n" +
						"┇ Notice: Please only enter a "+ type +" value.\n" +
						"⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃\n";
		// @formatter:on
	}// end method
}// end class
