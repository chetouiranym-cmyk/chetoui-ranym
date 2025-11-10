import java.util.Scanner;

public class ex6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch;
        do{
        System.out.println(" donner ch");
         ch=sc.nextLine();}
        while(ch.endsWith("er")==false);
        if ((ch.toLowerCase()).equals("aller")) 
        { System.out.println("le verbe n'est pas regulier");} 
        else {
            System.out.println(" conjugason de verb  "+ch+" au present");
            ch=ch.substring(0,(ch.length())-2);
            System.out.println("je "+ch+"e");
            System.out.println("tu "+ch+"es");
            System.out.println("elle "+ch+"e");
            if(ch.endsWith("g")==true){
            System.out.println("nous "+ch+"eons");}
            else{
                System.out.println("nous "+ch+"ons");

            }
             System.out.println("vous "+ch+"ez");
            System.out.println("Elles "+ch+"ent");
        }
    }
}   
            