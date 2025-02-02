class Practicalpi6 {
    public static void main(String[] args) {
        int size = 3;  
        
        
        for (int ln = 1; ln <= size; ln++) {  
           
            for (int space = 1; space <= size - ln; space++) {
                System.out.print(" ");
            }
            
            
            for (int symbol = 1; symbol <= (2 * ln -size+1); symbol++) {
                if (symbol % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(); 
        }
        
        
        for (int ln = size - 1; ln >= 1; ln--) {  
            
            for (int space = 0; space <= size + ln-1; space++) {
                System.out.print(" ");
            }
            
            
            for (int symbol = 1; symbol <= (2 * ln -size+1); symbol++) {
                if (symbol % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(); 
        }
    }
}
