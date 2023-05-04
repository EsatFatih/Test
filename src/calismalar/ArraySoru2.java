package calismalar;

import java.util.Arrays;

public class ArraySoru2 {

    // verilen 2 array birleştiren program.
    static int[] arr1 = {1, 5, 3, 8};
    static int[] arr2 = {2, 7, 8, 9};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrYeni(arr1,arr2)));
    }

    public static int[] arrYeni(int[] arr1, int[] arr2) {

        int[] yeniArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            yeniArr[i] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++) {
            yeniArr[arr1.length + i] = arr2[i];

        }

        return yeniArr;
    }
}
