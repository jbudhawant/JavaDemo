package demo1;

public class MultiplicationTable1 {
    public static void main(String[] args) {
               
    	int rows = 9;
        int columns = 9;

              
        int[][] multiplicationTable = generateMultiplicationTable(rows, columns);

               
        displayMultiplicationTable(multiplicationTable);    }
    
        private static int[][] generateMultiplicationTable(int rows, int columns) {
        int[][] table = new int[rows][columns];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                table[i - 1][j - 1] = i * j;
            }        }
        return table;
    }
  
        private static void displayMultiplicationTable(int[][] table) {
        System.out.println("Multiplication Table:");

        for (int[] row : table) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}
