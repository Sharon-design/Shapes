
public class Shape {

	private int h;
	private int r;
	private String s;
	private String text;

	public Shape(int h, int r, String text, String s) {
		setHeight(h);
		setRow(r);
		setSymbol(s);
		setText(text);
	}

	// public setters
	public void setHeight(int h) {
		this.h = h;
	}

	public void setRow(int r) {
		if (r < 0 || r > this.h) {
			throw new IllegalArgumentException(
					"That row was out of range. The row must be within the shapes height, between 0 and " + this.h);
		}
		this.r = r;
	}

	public void setSymbol(String s) {
		this.s = s;
	}

	public void setText(String text) {
		this.text = text;
	}

	// public getters
	public int getHeight() {
		return h;
	}

	public int getRow() {
		return r;
	}

	public String getSymbol() {
		return s;
	}

	public String getText() {
		return text;
	}

	// public method to print a square
	public void printSquare() {
		// declare and initialize variables
		int h = getHeight();
		int row = getRow();
		String s = getSymbol();
		String text = getText();

		// for loop to print number of rows given the specified height
		for (int i = 0; i < h; i++) {
			// print the next row on the next line.
			System.out.println("");
			// if the current row matches the row text is to be placed on, a different print
			// method must be used.
			if (i + 1 == row) {
				int r = (h / 2) - text.length() / 2;
				// print initial number of symbols, equal to half the length of the row minus
				// the length of the text to be printed.
				for (int j = 0; j < r; j++) {
					System.out.print(s + " ");
				}
				// print the text one character at a time with a space after it
				for (int index = 0; index < text.length(); index++) {
					System.out.print(text.charAt(index) + " ");
				}
				// if the sum of the height and text length are an even number then the next
				// half of the symbols can be printed.
				if ((h + text.length()) % 2 == 0) {
					for (int j = 0; j < r; j++) {
						System.out.print(s + " ");
					}
				}
				// if the length of the text is not even one less symbol will be printed in the
				// end of the row.
				else if (text.length() % 2 != 0) {
					for (int j = 0; j < r - 1; j++) {
						System.out.print(s + " ");
					}
				}
				// if the length of the text is even than one more symbol will be printed
				else {
					for (int j = 0; j < r + 1; j++) {
						System.out.print(s + " ");
					}
				}
				// if no text is printed in the row than the symbols will be printed out
				// normally.
			} else {
				for (int j = 0; j < h; j++) {
					System.out.print(s + " ");
				}
			}
		}
	}

	// public method to print a rectangle
	public void printRectangle() {
		// declare and initialize variables
		int h = getHeight();
		int w = h / 2;
		int row = getRow();
		String s = getSymbol();
		String text = getText();

		// for loop to print number of rows given the specified height
		for (int i = 0; i < h; i++) {
			// print the next row on the next line.
			System.out.println("");
			// if the current row matches the row text is to be placed on, a different print
			// method must be used.
			if (i + 1 == row) {
				int r = (w / 2) - text.length() / 2;
				// print initial number of symbols, equal to half the length of the row minus
				// the length of the text to be printed.
				for (int j = 0; j < r; j++) {
					System.out.print(s + " ");
				}
				// print the text one character at a time with a space after it
				for (int index = 0; index < text.length(); index++) {
					System.out.print(text.charAt(index) + " ");
				}
				// if the sum of the height and text length are an even number then the next
				// half of the symbols can be printed.
				if ((w + text.length()) % 2 == 0) {
					for (int j = 0; j < r; j++) {
						System.out.print(s + " ");
					}
				}
				// if the length of the text is not even one less symbol will be printed in the
				// end of the row.
				else if (text.length() % 2 != 0) {
					for (int j = 0; j < r - 1; j++) {
						System.out.print(s + " ");
					}
				}
				// if the length of the text is even than one more symbol will be printed
				else {
					for (int j = 0; j < r + 1; j++) {
						System.out.print(s + " ");
					}
				}
				// if no text is printed in the row than the symbols will be printed out
				// normally.
			} else {
				for (int j = 0; j < w; j++) {
					System.out.print(s + " ");
				}
			}
		}
	}

	public void printTriangle() {
		// declare and initialize variables
		String text = getText();
		int row = getRow();
		int h = getHeight();
		int y = 0;
		int n = h;

		// Triangle Code
		for (int i = 0; i < h; i++) {
			// y is the number of symbols that will be printed in each row. This will always
			// start with one symbol and increase until it equals the total number of rows
			y++;
			// n number of spaces must be printed to correctly align the triangle. One less
			// space will be required in each iteration
			n--;
			// if the current row matches the row text is to be placed on, a different print
			// method must be used.
			if (i + 1 == row) {
				System.out.println("");
				int r = (y / 2) - text.length() / 2;
				// print initial spaces
				for (int j = 0; j < n; j++) {
					System.out.print(" ");
				}
				// print initial symbols
				for (int j = 0; j < r; j++) {
					System.out.print(s + " ");
				}
				// print characters
				for (int index = 0; index < text.length(); index++) {
					System.out.print(text.charAt(index) + " ");
				}
				// print end symbols
				// if the length of the current row and text is even that the rest of the row
				// will be printed
				if ((y + text.length()) % 2 == 0) {
					for (int j = 0; j < r; j++) {
						System.out.print(s + " ");
					}
				}
				// if the length of the text is not even one less symbol will be printed in the
				// end of the row.
				else if (text.length() % 2 != 0) {
					for (int j = 0; j < r - 1; j++) {
						System.out.print(s + " ");
					}
				}
				// if the length of the text is even than one more symbol will be printed
				else {
					for (int j = 0; j < r + 1; j++) {
						System.out.print(s + " ");
					}
				}

			}
			// print the rows without text on them
			else {
				System.out.println("");
				for (int j = 0; j < n; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < y; j++) {
					System.out.print(s + " ");
				}
			}
		}
	}

	public void printDiamond() {
		// declare and initialize variables
		String text = getText();
		int row = getRow();
		int h = getHeight();
		String sym = getSymbol();
		// y will be used to track the number of symbols that need to be printed in a
		// given row
		int y = 1;
		// s will be used to track the number of spaces that need to be printed in a
		// given row
		int s = h;

		// if the current row matches the row text is to be placed on, a different print
		// method must be used
		for (int i = 0; i < h; i++) {
			System.out.println("");

			if (i + 1 == row) {
				if (i < h / 2) {
					y++;
					s--;
				} else {
					y--;
					s++;
				}
				int r = (y / 2) - text.length() / 2;
				// print initial spaces
				for (int j = 0; j < s; j++) {
					System.out.print(" ");
				}
				// print initial symbols
				for (int j = 0; j < r; j++) {
					System.out.print(sym + " ");
				}
				// print characters
				for (int index = 0; index < text.length(); index++) {
					System.out.print(text.charAt(index) + " ");
				}
				// print end symbols
				// if the length of the current row and text is even that the rest of the row
				// will be printed
				if ((y + text.length()) % 2 == 0) {
					for (int j = 0; j < r; j++) {
						System.out.print(sym + " ");
					}
				}
				// if the length of the text is not even one less symbol will be printed in the
				// end of the row
				else if (text.length() % 2 != 0) {
					for (int j = 0; j < r - 1; j++) {
						System.out.print(sym + " ");
					}
				}
				// if the length of the text is even than one more symbol will be printed
				else {
					for (int j = 0; j < r + 1; j++) {
						System.out.print(sym + " ");
					}
				}
			}
			// print the rows without text on them
			else {
				if (i < h / 2) {
					y++;
					s--;

					for (int j = 0; j < s; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < y; j++) {
						System.out.print(sym + " ");
					}
				}
				if (i == h / 2) {
					y = h / 2 + 2;
					s = h / 2;
					if (h % 2 == 0) {
						s--;
					}
				}

				if (i >= h / 2) {
					y--;
					s++;
					for (int j = 0; j < s; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < y; j++) {
						System.out.print(sym + " ");
					}
				}
			}
		}
	}
}
