import java.util.Scanner;

public class app7 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tab = new int[20];

        System.out.print("Donner n (nombre d'elements): ");
        int n = sc.nextInt();
        System.out.println("Donner les elements du tableau : ");
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }
        System.out.print("Donner la position p (0 <= p <= " + n + ") : ");
        int p = sc.nextInt();
        for (int i = p; i < n - 1; i++) {
            tab[i] = tab[i + 1];
        }

        n--;
        System.out.println("Tableau après suppression :");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }


    
}
}