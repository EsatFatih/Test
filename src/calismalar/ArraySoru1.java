package calismalar;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySoru1 {

    //soru1:N elemanlı bir dizi bulunmaktadır. Klavyeden girilen sayılar
    //diziye, bir tane baştan bir tane sondan olmak üzere
    //yerleştirilmektedir. Örneğin ilk sayı birinci elemana, ikinci
    //sayı N’inci elemana, üçüncü sayı ikinci elemana, dördüncü sayı
    //N-1’inci elemana... şeklinde yerleştirilmektedir. N tane sayıyı
    //klavyeden okuyup diziye yerleştiren ve diziyi ekranda
    //görüntüleyen programı yazınız.

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrYeni()));
    }

    public static int[] arrYeni() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert element number : ");
        int elementNumber = scanner.nextInt();

        int[] arr = new int[elementNumber];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please insert" + (i + 1) + ". number:");
            int number = scanner.nextInt();
            if (i % 2 == 0) {
                arr[i/2]=number;
            }else {
                arr[elementNumber-1-i/2]=number;
            }
        }

        return arr;

    }
}
