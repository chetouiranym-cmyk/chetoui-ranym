import java.util.Scanner;

public class app1 {
    public static boolean paire(int x){
        if(x%2==0){
            return true;
        }else{
            return false;
        }
    }
 public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        int nl,nc,x;
         boolean test;
        
        do{ 
            System.out.println("donner nl");
            nl=sc.nextInt();
        }while(nl<0||nl>=50);
        do{
            System.out.println("donner nc");
            nc=sc.nextInt();
        }while(nc<0||nc>=50);
        int[][] m = new int[nl][nc];

        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                do{
                System.out.println("donner un entier de matrices");
                m[i][j]=sc.nextInt();}
                while(paire(m[i][j]));
                
            }
            
        }
        do{
        System.out.println("donner x");
        x=sc.nextInt();}
        while(paire(x));
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                if(m[i][j]==x){
                    test=true;
                }break;
                
            }
            
        }
        if(test=true){
            System.out.println(x+"est trouve dan ce matrice");

        }else{
            System.out.println(x+"n existe pas");
        }
 }   
}
