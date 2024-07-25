Java Matrix Operations
This Java program creates and manipulates a 5x5 matrix filled with random integer values ranging from 1 to 99. The program includes methods to display specific parts of the matrix, such as the corner elements, diagonals, and a diamond pattern. The main components of the program are:

Matrix Initialization and Display:

A 5x5 matrix is initialized and filled with random values.
The matrix is then printed to the console.
Corners Method:

corners(int[][] matrix, int rows, int cols): This method extracts and prints the values of the four corner elements of the matrix.
Diagonals Method:

diagonals(int[][] matrix, int rows, int cols): This method prints the elements on the main diagonal (top-left to bottom-right) and the anti-diagonal (top-right to bottom-left).
Diamond Method:

diamond(int[][] matrix, int rows, int cols): This method prints the elements forming a diamond shape centered in the matrix, specifically the middle element, left, right, top, and bottom elements relative to the center.
