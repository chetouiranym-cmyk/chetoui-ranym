
import java.util.Scanner;

public class phrase{
    
    public static String lecteur1(){
        Scanner sc=new Scanner(System.in);
        String ch;
do { System.out.println("donner une phrase");
      ch=sc.nextLine();
} while ((ch.isBlank())||(ch.length()>50)|| (ch.indexOf(' ') == -1) );
     return  ch;}
    public static String lecteur2(){
        Scanner sc=new Scanner(System.in);
        String ch;
        do { System.out.println("donner une phrase");
             ch=sc.nextLine();}
        while((ch.isBlank())||(ch.length()>70)||(ch.indexOf( ' ') == -1) );
        return ch;}
    public static String traitement(String ch){
        StringBuffer ch1;
       ch1=new StringBuffer();
        int i;
       ch1.append( Character.toUpperCase(ch.charAt(0)));
         ch1.append(ch.substring(1));

        for(i=1;i<ch1.length()-1;i++){
            if((ch1.charAt(i-1))==' '){
                ch1.setCharAt(i-1,'@');
            
            }
           

        }
       
     

        /*la premier caracter est majuscule avec ch1.append  tji au fin*/
    return ch1.toString();
     

    }    
    
    public static void main(String[]args){
        String ch,choix;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("donner votre choix");
        choix=sc.nextLine();
        if(choix.equalsIgnoreCase("petit")){
            ch=lecteur1();

        }else{
            ch=lecteur2();
        }
        
        System.out.println("la nouvelle phrase   "+ traitement(ch));

    }
}