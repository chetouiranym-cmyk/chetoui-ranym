
import java.util.*;

public class EX1 {
     static Scanner sc=new Scanner(System.in);
public static void main(String[] args){
        ArrayList <Integer>note=new ArrayList<>();
        int n=lecteur();
        remplissage(note,n);
        affiche(note);
        int max=Collections.max(note);
        System.out.println("la note maximal"+max);
        double moy=somme(note,n)/n;
        System.out.println("la moyenne"+moy);
        System.out.println("donner la note pour suprimer");
        int x=sc.nextInt();
        Iterator<Integer>it=note.iterator();
        boolean test=false;
        while(it.hasNext()){
            int el2= it.next();
           
            if(x==el2){it.remove();
                test=true;
            }
            }
            if(!test){System.out.println("note non trouvee");}
          affiche(note);
        Collections.sort(note);
        System.out.println("suprimer des note");
        Iterator<Integer>its=note.iterator();
        while(its.hasNext()){
           int elm= its.next();
            if(elm>18){
                its.remove();
            }
        }
        System.out.println("donner la note qui le modifier");
        int y=sc.nextInt();
        
        System.out.println("donner la note pour modifier");
        int z=sc.nextInt();
        note.set(note.indexOf(y),z);
        affiche(note);
        ArrayList<String> etudaint= new ArrayList<>(Arrays.asList("alia","samira","Amira"));;
        System.out.println("donner le nom");
        String nom=sc.next();
        etudaint.add(nom);
        if(etudaint.contains("samira")){System.out.println("nom est trouvee");}
         for (int i = 0; i < etudaint.size(); i++) {
            if(etudaint.get(i).equals("alia")){etudaint.set(i,"alia ben salh");}
       }System.out.println("donner le nom a suprimer");
      String sup=sc.next();
      if(etudaint.contains(sup)){
       Iterator<String>etd=etudaint.iterator();
        while(etd.hasNext()){
           String nom2= etd.next();
            if(nom2.equals(sup)){
                etd.remove();
            }
        }}
         for (String e : etudaint) {
            System.out.println(e);
            
        }Collections.sort(etudaint);
        for (String e : etudaint) {
            System.out.println(e);
            
        }System.out.println("donner  un letttre");
       String lettre=sc.next().toLowerCase();
       for (int i = 0; i < etudaint.size(); i++) {
        if( etudaint.get(i).toLowerCase().startsWith(lettre)){System.out.println( etudaint.get(i)+"commence par le lettre"+lettre);}
           
       }
         

        
    }
    public static int lecteur(){
        int n;
        do { 
            System.out.println("donner n");
            n=sc.nextInt();
            
        } while (n<0);
        return n;
    } 
    public static void remplissage(ArrayList <Integer>note,int n){
        int a;
        for (int i = 0; i < n; i++) {
            do{
            System.out.println("donner une note(0et20)");
             a=sc.nextInt();}
            while(a<0||a>20);
            note.add(a);
            
        }

    }
    public static void affiche(ArrayList<Integer>note) {
        Iterator<Integer>it=note.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        
        
    }
    public static int somme(ArrayList <Integer>note,int n){
         int s=0;
        for (int i = 0; i < n; i++) {
            s=s+note.get(i);}
            return s;}

            
}
