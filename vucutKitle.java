import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args) {

        // değişkenler
        double boy, kilo, index;
        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunu metre cinsinden girer misin?: ");
        boy = inp.nextDouble();

        System.out.println("Kilonu girer misin?  :) :) :) : ");
        kilo = inp.nextDouble();

        index = kilo/(boy*boy);

        System.out.println("Vucut kitle indeksin: " + index);
    }
}
