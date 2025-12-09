
import java.util.HashMap;
import java.util.Scanner;

public class ex2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String,String>lair=new HashMap<>();
        lecteur(lair);
        System.out.println("doner le non");
        String nom=sc.nextLine();
        recherche(lair,nom);
        System.out.println("doner le nom por modification");
        String nom2=sc.nextLine();
        modification(lair,nom2);
        System.out.println("doner le nom pour supresion");
        String nom3=sc.nextLine();
        supresion(lair,nom3);
        affiche(lair);

    }
    public static void lecteur(HashMap<String,String> lair){
        System.out.println("doner le non");
        String nom=sc.nextLine();
        String tel;
        do{
        System.out.println("doner le telephone");
        tel=sc.nextLine();}
        while(!(verif(tel)));
        if (!( lair.containsKey(nom)&&lair.containsValue(nom)))
        {lair.put(nom,tel);}
        else{
            System.out.println("contact exixte deja");}

    }
    public static boolean verif(String tel) {
    if (tel.length() != 8) return false;

    for (int i = 0; i < tel.length(); i++) {
        if (!Character.isDigit(tel.charAt(i))) {
            return false;
        }
    }
    return true;
}
public static void recherche(HashMap<String,String>lair, String nom){
    if(lair.containsKey(nom)){
        System.out.println(lair.get(nom));

    }else{System.out.println("contact introuvable");}

}
public static void modification(HashMap<String,String>lair, String nom){
    if(lair.containsKey(nom)){
        String tel;
        do{
        System.out.println("doner le  nouveau telephone");
        tel=sc.nextLine();}
        while(!(verif(tel)));
        lair.replace(nom,tel);}
        else{System.out.println("contact intouvable");}


}
public static void supresion(HashMap<String,String>lair, String nom){
    if(lair.containsKey(nom)){
        lair.remove(nom);}
    else{System.out.println("contact intouvable");

    }    
}
public static void affiche(HashMap<String,String>lair){
    
   lair.forEach(( nom,tel)->{
    System.out.println("Nom : " + nom + " | Téléphone : " + tel);
        
    });
}

    
}
