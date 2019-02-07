import java.util.*;
import java.lang.Math;


public class NumberUtilities {
    public static String getRange(int stop) {
        String range = "";

        for (int x = 0; x < stop; x++){
            range = range + x;
        }
        return range;

    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++){
            range = range + i;
        }
        return range;

    }

    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i+=step){
            range = range + i;
        }
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String range = "";
        if(start % 2 == 0){
            for (int i = start; i < stop; i+=2){
                range = range + i;
            }}else {
            for (int i = start + 1; i < stop; i+=2){
                range = range + i;
            }
        }
        return range;
    }


            public static String getOddNumbers(int start, int stop) {
            String range = "";
            if(start % 2 == 1){
                for (int i = start; i < stop; i+=2){
                    range = range + i;
                }} else {

                for (int i = start + 1; i<stop; i+=2){
                    range = range + i;
                }}
            return range;
        }

        public static String getExponentiations(int start, int stop, int exponent) {
            String range = "";
        for (int i = start; i <= stop; i++) {
        range = range + Math.round(Math.pow(i, exponent));
    }
      
    return range;
    }
}
