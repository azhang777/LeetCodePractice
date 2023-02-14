import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class EqualZero {
        public static int[] equalZero(int N) {
            //can we create two arrays in which we can have one generate unique numbers and the other generate the compliment
            //then combine it? terrible idea^
            //this is simple...
            int[] arrayEqualZero = new int[N];
            for (int i = 1; i < N; i+=2) {
                arrayEqualZero[i] = i;
                arrayEqualZero[i+1] = -i;
            }
            return arrayEqualZero;
            //in the case of an odd, the first index will always be 0 if not filled.
        // Implement your solution here
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(equalZero(11)));
    }
}


/*
            Random random = new Random();
            int uniqueInteger = 0;
            HashSet<Integer> myHashSet = new HashSet<>();
            int[] uniqueNumberArray = new int[Math.floorDiv(N,2)];
            int[] complementArray = new int[Math.floorDiv(N,2)];
            int[] arrayEqualZero = new int[N];
            for (int i = 0; i < uniqueNumberArray.length; i++) {
                uniqueInteger = random.nextInt(1,101);
                while (myHashSet.contains(uniqueInteger)) {
                    uniqueInteger = random.nextInt(1,101);
                    myHashSet.add(uniqueInteger);
                }
                myHashSet.add(uniqueInteger);
                uniqueNumberArray[i] = uniqueInteger;
                complementArray[i] = 0 - uniqueNumberArray[i];
            }
            System.arraycopy(uniqueNumberArray,0,arrayEqualZero,0,uniqueNumberArray.length);
            System.arraycopy(complementArray,0,arrayEqualZero,uniqueNumberArray.length,complementArray.length);
            return arrayEqualZero;
 */
/*
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i += 2) {
            result[i] = i + 1;
            result[i + 1] = -(i + 1);
        }
        return result;
 */