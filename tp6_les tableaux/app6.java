 import java.util.Scanner;
public class app6 {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tab = new int[20];

        System.out.print("Donner n (nombre d'elements): ");
        int n = sc.nextInt();
        System.out.println("Donner les elements du tableau : ");
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }

        System.out.print("Donner l'entier a inserer : ");
        int x = sc.nextInt();
        System.out.print("Donner la position p (0 <= p <= " + n + ") : ");
        int p = sc.nextInt();

       
        for (int i = n; i > p; i--) {
            tab[i] = tab[i - 1];
        }


        tab[p] = x;

        n++;
        System.out.println("Tableau après insertion :");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}

