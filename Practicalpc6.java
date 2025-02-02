class Practicalpc6 {
 static int symbol;

    public static void main(String[] args) {
        int size = 4;


        // Outer loop for each level/row of the pyramid
        for (int ln = 1; ln <= size; ln++) {

            // Printing spaces before stars
            for (int spaces = size - ln; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            // Printing stars for the current level
            for (int symbol = 2 * ln - 1; symbol > 0; symbol--) {
                 if(symbol%2==0){
                System.out.print("*");
            }
            else
              System.out.print("+");
           }


            // Move to the next line after each row
            System.out.println();
}
}
}
 

