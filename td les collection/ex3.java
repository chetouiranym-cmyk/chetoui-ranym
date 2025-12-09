
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex3 {
    public static int occurance(String mot,String ch1){
        int nb= 0;
        StringTokenizer ch = new StringTokenizer(ch1, " ");
     while (ch.hasMoreTokens()) {
       String token = ch.nextToken();
            if (token.equalsIgnoreCase(mot)) {
                  nb=nb+1;
        }
    }

        return nb;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner une phrase");
        String phrase=sc.nextLine();
        HashMap<String,Integer>ran=new HashMap<>();
        StringTokenizer ch=new StringTokenizer(phrase," ");
        System.out.println(ch.countTokens());
        while(ch.hasMoreTokens()){
            String mot=ch.nextToken();
            int nb=occurance(mot,phrase);
            ran.put(mot,nb);}
    ran.forEach((k, v) -> {
    System.out.println("Clé : " + k + " | Valeur : " + v);
});
             
            
        
    }

}
