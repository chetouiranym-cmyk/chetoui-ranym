import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        String ch;
        char car;
        Scanner Sc = new Scanner(System.in);
        int nb, i;
        do {
            System.out.println("donner ch");
            ch = Sc.nextLine();
        } while (ch.length() > 20);
        System.out.println("doner car");
        car = Sc.next().charAt(0);
        nb = 0;
        for (i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == car) {
                nb = nb + 1;
            }
        }
        System.out.println("le nombre de car=" + nb);

    }
}
