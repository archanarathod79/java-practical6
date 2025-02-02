class Practicalpa6 {
    public static void main(String[] args) {
        int size = 4; // Size of the pyramid (height)
        
        // Outer loop for each level/row of the pyramid
        for (int ln = 1; ln <= size; ln++) {
            
            // Printing spaces before stars
            for (int spaces = size - ln; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            
            // Printing stars for the current level
            for (int star = 2 * ln - 1; star > 0; star--) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println(); 
        }
    }
}
