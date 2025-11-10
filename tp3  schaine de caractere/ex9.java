import java.util.Scanner;
import java.util.StringTokenizer;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           String ch;

        System.out.println("Veuillez saisir vos coordonnées séparées par des virgules :");
        System.out.println("(Nom, Prénom, CIN, Date de naissance, Ville d’origine, Spécialité, Année du bac)");
        System.out.print("→ ");
        ch =sc.nextLine();
        StringTokenizer ch1=new StringTokenizer(ch,",");
        while(ch1.hasMoreTokens()){
        System.out.println(ch1.nextToken());}
    }}


       