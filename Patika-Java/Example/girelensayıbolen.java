import java.util.Scanner;
public class NewMain2 {

    
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in);
       int sayac = 0, toplam = 0;
        System.out.println("Sayı giriniz:");
        int sayi = klavye.nextInt();
        for (int i = 0; i <sayi; i++) {
            if(i==0) continue;
            if(i %3 ==0 && i%4==0)
            toplam +=i;
            sayac++;
        
        }
        System.out.println("Ortalama:"+toplam/sayac);
           
        
        
    }
    
}
