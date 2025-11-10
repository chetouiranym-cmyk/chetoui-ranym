import java.util.Scanner;
import java.util.StringTokenizer;

public class exx8 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez une phrase :");
        String phrase = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(phrase);
        int nbM = tokenizer.countTokens();
        System.out.println("Nombre de mots  : " + nbM);
        StringBuffer mots = new StringBuffer();
        
        
        while (tokenizer.hasMoreTokens()) {
            String mot = tokenizer.nextToken();
            System.out.println(mot);
            mots.append(mot.toLowerCase()).append(" ");
        }
        
       
        StringTokenizer tokenizer2 = new StringTokenizer(phrase);
        
        while (tokenizer2.hasMoreTokens()) {
            String motActuel = tokenizer2.nextToken().toLowerCase();
            
            
            if (mots.indexOf(motActuel + " ") != -1) {
                int i = 0;
                int indx = 0;
                
                
                while ((indx= mots.indexOf(motActuel + " ", indx)) != -1) {
                    i++;
                    indx+= motActuel.length() + 1;
                }
                
                
                System.out.println(motActuel + " : " + i + " fois");
                
                int pos;
                while ((pos = mots.indexOf(motActuel + " ")) != -1) {
                    mots.delete(pos, pos + motActuel.length() + 1);
                }
            }
        }
        
        sc.close();
    }
}
