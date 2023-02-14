//import java.util.Arrays;
//import java.util.HashMap;
//
//public class SmallestInteger {
//    public static int solution(int[] A) {
//        Arrays.sort(A);
//        int min = 1;
//        for (int i : A) {
//            if (i == min) {
//                min++;
//            }
//        }
//        return min;
//    }
//    //overthinking! You should not need a hashmap..
//
//    public static void main(String[] args) {
//        int[] array = {1,2,4,5};
//        solution[array];
//    }
//}

/*
        //Create a hashmap for quick search and sort the array
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        Arrays.sort(A);
        //In case the value is outside of the element range, return greatestValue
        int greatestValue = A[A.length-1] + 1;
        //Store all the elements of the array into a hashmap
        for (int i = 0; i < A.length; i++) {
            myHashMap.put(i,A[i]);
        }
        //Use forloop to find the smallest positive integer that does not occur within the array. Check with the hashmap.
        for (int i = 1; i < A.length; i++) {
            if (!myHashMap.containsValue(i)) {
                return i;
            }
        }
        return greatestValue;
 */