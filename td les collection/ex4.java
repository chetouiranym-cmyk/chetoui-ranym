
import java.util.HashMap;
import java.util.Scanner;
public class ex4 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String,Integer>produit=new HashMap<>();
        System.out.println("doner n");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("libeles produit");
            String prod=sc.next();
            System.out.println(" le prix de produit");
            int prix=sc.nextInt();
            produit.put(prod,prix);
        }
        produit.forEach((k,v)->{
            System.out.println(k+v);
        });
        
            
            
        int s = 0;
        for (int prix : produit.values()) {
            s += prix;
        }System.out.println("la moyenne est "+s/n);
      int[] prixMax = {Integer.MIN_VALUE};
       String[] produitPlusCher = {null};
        produit.forEach((lib,prix) -> {
            if (prix > prixMax[0]) {
                prixMax[0] = prix;
                 produitPlusCher[0] = lib;
            }
        });

        System.out.println("Produit le plus cher : " + produitPlusCher[0]);

        
    }
    
}
