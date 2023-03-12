package Exercise01;

import java.util.Scanner;

public class E02_StringManipwithMethodCreation {
    public static void main(String[] args) {



    /*
     * girilen String icinde "xyz" dizimi var ise true degilse
       false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir adet string ifade giriniz : ");

        String str = scan.nextLine().toLowerCase();


        System.out.println(xyzVarmi(str));

    }

    public static boolean xyzVarmi(String str) {

        if (str.contains("xyz")) {
            return true;
        } else {
            return false;
        }

    }

}
