import java.util.Scanner;

public class app2 {
    public static int somme(int[][]m,int nl, int nc){
       int s=0;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                s=s+m[i][j];

    }
    } return s;
}
 public static int produit(int[][]m,int nl, int nc){
       int p=1;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
            p=p*m[i][j];

    }
    } return p;
} public static int moy(int[][]m,int nl, int nc){
     int moy,s; 
     s=somme(m,nl,nc); 
     moy=s/(nc*nl);
     return moy;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nl,nc;
        
        do { 
            System.out.println("donner nl");
            nl=sc.nextInt();
        }while ((nl<0 )||(nl>=30));
        do{
            System.out.println("donner nc");
            nc=sc.nextInt();
        } while((nc<0)||(nc>=30));
        int[][] m = new int[nl][nc];

        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.println("donner un entier de matrices");
                m[i][j]=sc.nextInt();
                
            }
            
        }
        System.out.println(somme(m,nl,nc));
        System.out.println(produit(m,nl,nc));
        System.out.println(moy(m,nl,nc));
    }
}