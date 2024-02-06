package demo1;

public class MatrixAddition {
    public static void main(String[] args) {
            
    	int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

             
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices must be of the same size for addition.");
            return;
        }
             
    int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];         
                }      
            }
              
        System.out.println("Matrix1:");
        printMatrix(matrix1);        System.out.println("\nMatrix2:");
        printMatrix(matrix2);
        System.out.println("\nSum of Matrices:");
        printMatrix(resultMatrix);
    }

  
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}