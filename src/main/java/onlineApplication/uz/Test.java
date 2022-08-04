package onlineApplication.uz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {



        int[] a = {1, 2, 3, 4, 8, 5, 7, 9, 6, 0};
        int[] b = {0, 2, 11, 12, 5, 6, 8};
        int[] merged = IntStream.concat(IntStream.of(a), IntStream.of(b))
                .distinct()
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(merged));


//        int a = 123_123_123;
//        System.out.println(a);

//        int[] arr = {1, 2, 3, 5, 67, 87};
//        int[] arr1 = {1, 3, 7};
//        Map<Integer, Boolean> variable;
//
//
//        variable = twoArrayEqual(arr, arr1);
//        variable = twoArrayEqual(arr1, arr);
//        System.out.println(Arrays.toString(new Map[]{variable}));


//
//        HashMap<Integer, Boolean> map = new HashMap<>();
//
//        for (int i : arr1) {
//            for (int j : arr2) {
//                if (arr2[j] != arr1[i]) {
//                    map.put(arr1[i], false);
//                } else {
//                    break;
//                }
//            }
//        }
//
//        System.out.println(Collections.singletonList(map));


//        int[] input = new int[]{1, 1, 3, 3, 7, 7, 8, 9, 9, 9, 10,11};
//        int current = input[0];
//        boolean found = false;
//
//        for (int i = 0; i < input.length; i++) {
//            if (current == input[i] && !found) {
//                found = true;
//            } else if (current != input[i]) {
//                System.out.print(" " + current);
//                current = input[i];
//                found = false;
//            }
//        }
//        System.out.println(" " + current);
    }


    private static Map<Integer, Boolean> twoArrayEqual(int[] arr1, int[] arr2) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        int max = Math.max(arr1.length, arr2.length);

        int min = arr1.length != max ? arr1.length : arr2.length;

        int[] minInt = min == arr1.length ? arr1 : arr2;
        int[] maxInt = min != arr2.length ? arr2 : arr1;


        for (int i = 0; i < max; i++) {
            boolean check = false;
            for (int i1 = 0; i1 < minInt.length; i1++) {
                if (maxInt[i] == minInt[i1]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                map.put(maxInt[i], false);
            }
        }
        return map;
    }


    private static void twoArrayEquals(int[] arr1, int[] arr2) {


    }

}
