import java.util.Scanner;
import java.util.Arrays;
import java.math.*;

public class ShapesTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// declare and initialize variables
		int go = 1;
		int h = 0;
		int r = 0;
		

		// get user input for which shape they wish to have printed
		while (go == 1) {
			int shapeNumber = 0;
			String shape = "";
			String s = "";
			String t = "";
			
			while (shapeNumber != 1 && shapeNumber != 2 && shapeNumber != 3 && shapeNumber != 4) {
				System.out.print(
						"\nWhat shape should I draw? (Enter 1 for square, 2 for triangle, 3 for diamond, and 4 for rectangle)");
				try {
					shapeNumber = input.nextInt();
				} catch (Exception WrongDataType) {
					System.out.println("\n!Warning! Please enter an integer.");
					input.nextLine();
				}
				switch (shapeNumber) {
				case 1:
					shape = "square";
					break;
				case 2:
					shape = "triangle";
					break;
				case 3:
					shape = "diamond";
					break;
				case 4:
					shape = "rectangle";
					break;
				}
			}

			// get user input for the label to be printed with the shape
			input.nextLine();
			System.out.printf("\nWhat label should I print on your %s (Leave blank for 'LU')?", shape);
			t = input.nextLine();
			if (t.length() == 0) {
				t = "LU";
			}
			
			// get user input for the symbol used to print the shape
			while (s.length() != 1) {
				System.out.printf("\nWhat symbol should be used to print the %s? It must be only one character. (Example: 'X', '*', '$')", shape);
				s = input.nextLine();
				if (s.length() == 0) {
					t = "X";
				}
			}


			// get user input on the height of the shape, validating it is an integer
			System.out.printf("\nHow tall should the %s be?", shape);
			try {
				h = input.nextInt();
			} catch (Exception WrongDataType) {
				System.out.println("\n!Warning! Please enter an integer.");
				input.nextLine();
				continue;
			}
			// get user input on the row of the shape, validating it is an integer
			System.out.printf("\nOn what row should I print '%s'?", t);
			try {
				r = input.nextInt();
			} catch (Exception WrongDataType) {
				System.out.println("\n!Warning! Please enter an integer.");
				input.nextLine();
				continue;
			}

			try {
				Shape Shape1 = new Shape(h, r, t, s);
			} catch (Exception IllegalArgumentException) {
				System.out.println(IllegalArgumentException);
				continue;
			}

			Shape Shape1 = new Shape(h, r, t, s);

			switch (shapeNumber) {
			case 1:
				Shape1.printSquare();
				break;
			case 2:
				Shape1.printTriangle();
				break;
			case 3:
				Shape1.printDiamond();
				break;
			case 4:
				Shape1.printRectangle();
				break;
			}
			System.out.printf("\n\nEnter 1 to continue printing shapes, and anything else to exit.");
			try {
				go = input.nextInt();
			} catch (Exception WrongDataType) {
				go = 0;
			}

		}
	}
}
