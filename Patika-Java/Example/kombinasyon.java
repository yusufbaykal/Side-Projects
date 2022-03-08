import java.util.Scanner;
public class NewMain3 {

    
    public static void main(String[] args) {
         Scanner klavye = new Scanner(System.in);
         int total = 1;
         System.out.println("1.Sayıyı giriniz:");
         int n = klavye.nextInt();
         System.out.println("2. Sayıyı giriniz:");
         int r = klavye.nextInt();
         int sonuc;
         sonuc = Faktoriyel(n)/(Faktoriyel(r)*(Faktoriyel(n-r)));
         System.out.println("Sonuc:"+sonuc);
                 
        }
    private static int Faktoriyel(int sayi){
        if(sayi==1 && sayi==0){
            return 1;
            
        }
        return sayi * Faktoriyel(sayi-1);
    }
    
    
  }
