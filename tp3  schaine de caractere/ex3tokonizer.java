
import java.util.StringTokenizer;

public class ex3tokonizer{
    public static void main(String[] args) {
        String text1="bonjour, lrs, etudiant,bien, venu ,en ,java!";
        StringTokenizer st1=new StringTokenizer(text1,",");
        System.out.println("decoupage de text en mots");
        while(st1.hasMoreTokens()){
        System.out.println(st1.nextToken());}
        System.out.println("le text principale est "+text1 );
        
    }
}