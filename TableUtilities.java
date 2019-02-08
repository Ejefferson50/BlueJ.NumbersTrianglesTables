 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int size = 5;
        String small = "";
        for (int x = 1; x <= size; x++) {
            for (int y = 1; y <= size; y++){
                small += small.format("%3d", x * y) + " |";
            }
       small += "\n";
   }
   return small;
  
}
    public static String getLargeMultiplicationTable() {
        int size = 10;
        String large = "";
        for (int x = 1; x <= size; x++) {
            for (int y = 1; y <= size; y++){
                large += large.format("%3d", x * y) + " |";
            }
       large += "\n";
   }
   return large;
    }

    public static String getMultiplicationTable(int tableSize) {
       
        String mystery = "";
        for (int x = 1; x <= tableSize; x++) {
            for (int y = 1; y <= tableSize; y++){
                mystery += mystery.format("%3d", x * y) + " |";
            }
       mystery += "\n";
   }
   return mystery;
    }
}
