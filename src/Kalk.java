import java.util.Scanner;

public class Kalk {
    public static void main(String[] args) throws Exception {

        Scanner tb = new Scanner(System.in);

        System.out.println("Ange nummer 1");
        int nummer1 = tb.nextInt();
        System.out.println("Ange nummer 2");
        int nummer2 = tb.nextInt();
        System.out.println("1=+, 2=-, 3=*, 4=/");
        int metod = tb.nextInt();

        if (metod == 1){
            System.out.println("Ditt tal är "+(nummer1+nummer2));
        }
        if (metod == 2){
            System.out.println("Ditt tal är "+(nummer1-nummer2));
        }
        if (metod == 3){
            System.out.println("Ditt tal är "+(nummer1*nummer2));
        }
        if (metod == 4){
            System.out.println("Ditt tal är "+(nummer1/nummer2));
        }

    }
}


