package calismalar;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan bir String ve bir cümle isteyin
         * String'in cümle içindeki görünümlerini (büyük-küçük harf duyarlı olmadan) bulun ve yazdırın.
         *
         * Örnekler:
         * sentences = "hihihi", String = "hi", output = "hihihi içinde 3 adet "hi" bulundu"
         * sentences = "I am coming", String = "com", output = "I am coming içinde 1 adet "com" bulundu"
         */


        Scanner scanner= new Scanner(System.in);
        System.out.print("Please insert a sentence:  ");
        String sentence = scanner.nextLine();
        System.out.print("Please insert a word:  ");
        String word = scanner.next();


        int sayac =0;
        int index = sentence.toLowerCase().indexOf(word);


        while (index!=-1){
            sayac++;
            index= sentence.toLowerCase().indexOf(word,index+1);
        }

        System.out.println("inside of" +sentence+sayac+" word found ");
    }
 }