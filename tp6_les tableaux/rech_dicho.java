
import java.util.Scanner;

public class rech_dicho {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] t={2,3,4,5,6,7,8,10,15};
        int x,deb,fin,mil;
        System.out.println("donner x");
        x=sc.nextInt();
        deb=0;
        fin=t.length;
    
        do { 
           mil=(deb+fin)/2;
           if(x<t[mil]){
            deb=mil-1;}
            else{
                fin=mil+1;} 
            }while(x==t[mil] ||deb>fin);
        
            if ( deb>fin) {
            System.out.println("Valeur non trouvée.");
        } else {
            System.out.println( "valeur trouvee");

    }
    
}}
