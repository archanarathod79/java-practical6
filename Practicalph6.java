class Practicalph6 {
    public static void main(String[] args) {
        int size = 3;  // The middle width (maximum stars)
        
        // Upper half (including the middle row)
        for (int ln = 1; ln <= size; ln++) {  // Loop for the upper half
            // Print spaces
            for (int space = 1; space <= size - ln; space++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int symbol = 1; symbol <= (2 * ln - 1); symbol++) {
                if (symbol % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                  System.out.print("~");
                }
            }
            System.out.println(); // Move to the next line
        }
        
        // Lower half
        for (int ln = size - 1; ln >= 1; ln--) {  // Loop for the lower half
            // Print spaces
            for (int space = 1; space <= size - ln; space++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int symbol = 1; symbol <= (2 * ln - 1); symbol++) {
                if (symbol % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("+");
                   System.out.print("~");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
