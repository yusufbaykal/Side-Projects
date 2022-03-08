import java.util.Scanner;
public class NewMain8 {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int max=0, min=0 , g_sayi;
        
        System.out.println("Kaç adet sayı girişi olacak:");
        g_sayi = klavye.nextInt();
        for (int i = 1; i <=g_sayi; i++) {
            System.out.println("Sayı giriniz:");
            int sayi = klavye.nextInt();
            
            if(i==1){
                min=sayi;
                max=sayi;
            }
            else{
               if(g_sayi<min){
                min=g_sayi;
            }
            else if(g_sayi>max){
                max = g_sayi;
            } 
               
            }
            
        }
        System.out.println("Maksimum Sayı:"+max);
        System.out.println("Minimum Sayı:"+min);
    }
    
}
