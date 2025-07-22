public class PatternMaker {
    
    // Print a number triangle
    public static void printNumberTriangle(int rows) {
        // Print pattern like:
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // (for rows = 4)

        for(int i = 0 ; i <= rows ; i++ ){
            for(int n = 0 ; n <= i ; n++){
                System.out.print(n+ " ");
            }
            System.out.println("");
        }
    }
    
    // Print multiplication table
    public static void printMultiplicationTable(int number, int limit) {
        // Print: number x 1 = result, number x 2 = result, etc.
        // Up to the limit
        for(int i = 0 ; i <= limit ; i++){
            System.out.print(number +" X " + i + " = " + (number*i) + " , " );
        }
    }

    public static void main(String[] args) {
        printNumberTriangle(5);
        System.out.println();
        printMultiplicationTable(7, 10);
    }
}
