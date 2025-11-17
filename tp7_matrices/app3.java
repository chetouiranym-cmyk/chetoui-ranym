import java.util.Scanner;

public class app3 {
    public static int somme(int[][]m,int i, int nc){
        int s=0;
        for (int j = 0; j < nc; j++) {
            s=s+m[i][j];
            
        }return s;
    }
    public static int max(int[]t,int nc){
         int mx=t[0];
        for (int i = 1; i < nc; i++) {
            if(t[i]>mx){
                mx=t[i];
            }
            
        }return mx;

    }
    public static int min(int[]t,int nc){
         int min=t[0];
        for (int i = 1; i < nc; i++) {
            if(t[i]<min){
                min=t[i];
            }
          
        }return min;

    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        int nl,nc;
        do{ 
            System.out.println("donner nl");
            nl=sc.nextInt();
        }while(nl<0||nl>=20);
        do{
            System.out.println("donner nc");
            nc=sc.nextInt();
        }while(nc<0||nc>=30);
        int[][] m = new int[nl][nc];
        int[]t=new int[nc];
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.println("donner un entier de matrices");
                m[i][j]=sc.nextInt();}
        }
            int i=0;
            while(i<nl){
               for (int j = 0; j < nc; j++) {
                t[j]=somme(m,i,nc);}i++;}
            for(int k = 0; k< nc; k++) {
               System.out.println(t[k]+"");}
             System.out.println(max(t,nc));
             System.out.println(min(t,nc));   
            
                
            }

    
}
