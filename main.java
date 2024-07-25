import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                matrix[i][j] = rand.nextInt(1, 100);

            }

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
        corners(matrix, 5, 5);
        diagonals(matrix, 5, 5);
        diamond(matrix, 5, 5);

    }
    public static void corners(int [][] matrix, int rows, int cols){
        int left_corner = matrix[0][0];
        int right_corner = matrix[0][cols-1];
        int bottom_left = matrix[rows-1][0];
        int bottom_right = matrix[rows-1][cols-1];
        int [] cornerss = new int[4];
        cornerss[0] = left_corner;
        cornerss[1] = right_corner;
        cornerss[2] = bottom_left;
        cornerss[3] = bottom_right;
        System.out.println("Printing Corners");
        for(int i = 0; i<4; i++){
            System.out.println(cornerss[i]);
        }
    }

    public static void diagonals(int [][] matrix, int rows, int cols){
        System.out.println("Printing diagonals of left side");
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if (i==j){
                    System.out.println(matrix[i][j]);
                }
            }
        }
        System.out.println("Printing diagonals of right side");
        for (int i=0; i<rows; i++ ){
            System.out.println(matrix[i][cols-i-1]);
        }
    }

    public static void diamond(int [][] matrix, int rows, int cols){
        int[] diamonds = new int[5];
        int middle_row = Math.floorDiv(rows, 2);
        int upper_row = middle_row-1;
        int lower_row = middle_row+1;
        int middle_cols_middle_row = Math.floorDiv(cols, 2);
        int left_side = middle_cols_middle_row-1;
        int right_side = middle_cols_middle_row+1;
        int cols_upper_mid = Math.floorDiv(cols, 2), cols_lower_mid = Math.floorDiv(cols, 2);
        diamonds[0] = matrix[middle_row][middle_cols_middle_row];
        diamonds[1] = matrix[middle_row][left_side];
        diamonds[2] = matrix[upper_row][cols_upper_mid];
        diamonds[3] = matrix[middle_row][right_side];
        diamonds[4] = matrix[lower_row][cols_lower_mid];
        System.out.println("Printing Diamonds");
        for (int i = 0; i<5; i++){
            System.out.println(diamonds[i]);
        }
    }
}
