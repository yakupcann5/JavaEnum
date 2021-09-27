import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Gunler gunler = Gunler.PAZARTESI;
        //System.out.println(gunler + " Haftanın " +   ". günüdür." );

        Scanner scanner = new Scanner(System.in);

        String gun = scanner.nextLine();

        if (gun.equals(Gunler.PAZARTESI.toString())) {
            System.out.println("haftanın ilk günü değildir");
        } else {
            System.out.println("haftanın ilk günü");
        }

       /* Gunler gunler1 = Gunler.SALI;
        System.out.println(gunler1 + " Haftanın " + gunler.gun + ". günüdür." );

        Gunler gunler2 = Gunler.CARSAMBA;
        System.out.println(gunler2 + " Haftanın " + gunler.gun + ". günüdür." );

        Gunler gunler3 = Gunler.PERSEMBE;
        System.out.println(gunler3 + " Haftanın " + gunler.gun + ". günüdür." );

        Gunler gunler4 = Gunler.CUMA;
        System.out.println(gunler4 + " Haftanın " + gunler.gun + ". günüdür." );

        Gunler gunler5 = Gunler.CUMARTESİ;
        System.out.println(gunler5 + " Haftanın " + gunler.gun + ". günüdür." );

        Gunler gunler6 = Gunler.PAZAR;
        System.out.println(gunler6 + " Haftanın " + gunler.gun + ". günüdür." );

        */

    }
}
