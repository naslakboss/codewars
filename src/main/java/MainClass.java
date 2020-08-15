import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});


        System.out.println(Metro.countPassengers(list));
        System.out.println(Metro.countPassengers2(list));
        System.out.println(Metro.countPassengers3(list));

    }

    public static class Square {
        public static boolean isSquare(int n) {
           Double m = (double) n;
           Double o = Math.sqrt(m);
           int x = o.intValue();
           if((x*x) == n){
                return true;
            }
            return false;

        }

        public  static long isSquare2(long sq){
            if(Math.sqrt(sq) % 1 != 0){
                return  -1L;
            }
            return (long)((Math.sqrt(sq)+1)*(Math.sqrt(sq)+1));
        }

        public  static long isSquare2Ref(long sq){
            double result =  Math.sqrt(sq);
            if(result % 1 != 0){
                return  -1L;
            }
            return (long)((result+1) * (result +1));
        }
    }

   public static class Metro {

        public static int countPassengers(ArrayList<int[]> stops) {


            int length = stops.size();
            int finalResult = 0;
            for(int i = 0; i < length; i++){
                int[] result = stops.get(i);
                int a = result[0];
                int b = result[1];
                finalResult += (a - b);

            }
            return finalResult;
        }

       public static int countPassengers2(ArrayList<int[]> stops){
           return stops.stream().mapToInt(number -> number[0] - number[1]).sum();
       }

       public static int countPassengers3(ArrayList<int[]> stops){
            int result = 0;
            for(int[] oneStop : stops){
                result += (oneStop[0] - oneStop[1]);
            }
            return result;
       }
    }


}
