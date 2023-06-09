package Exercise06;

import java.util.Scanner;

public class E04_MetCreationForLoop {


	/* Interview Question
	  Write a Java program to reverse a string. Use for loop and create a method called
	  reverseString

	  Mülakat Sorusu
      Bir dizeyi tersine çevirmek için bir Java programı yazın.
      for döngüsü kullanın ve adında bir yöntem oluşturun tersDize
	*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String ifade giriniz : ");
        String str = scan.nextLine();

        System.out.println("String'in tersi : " + reverseString(str));

    }

    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}
