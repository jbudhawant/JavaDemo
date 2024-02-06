package demo1;

public class ArraySum {
    public static void main(String[] args) {
             
    	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

               
    	int sum = calculateSum(numbers);

              
    	System.out.println("Sum of elements in the array: " + sum);
    }
     
    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
