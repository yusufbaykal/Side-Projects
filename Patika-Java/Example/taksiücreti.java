import java.util.Scanner;
public class NewMain1 {

     
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int km;
        double pkm = 2.20,total,basfyt = 20;
        System.out.println("Mesafeyi giriniz(KM):");
        km = klavye.nextInt();
        total = (km*pkm);
        total += (basfyt);
        total = (total<20) ? 20 : total;
        System.out.println("Toplam tutar:"+total);
         
        
        
        
    }
    
}
