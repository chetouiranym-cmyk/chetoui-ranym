import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        String ch, chinverse = "";
        int i;
        Scanner Sc = new Scanner(System.in);
        System.out.println("donner ch");
        ch = Sc.nextLine();
        for (i = ch.length() - 1; i >= 0; i--) {
            chinverse = chinverse + ch.charAt(i);
        }
        if (ch.equals(chinverse)) {
            System.out.println(ch +" "+ "est est palindrom");
        } else {
            System.out.println(ch +" "+ "n'est pas palindrom");
        }
        System.out.println(chinverse);

    }
}