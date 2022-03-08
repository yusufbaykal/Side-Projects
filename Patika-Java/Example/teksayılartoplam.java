import java.util.Scanner;
public class NewMain2 {

    
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in);
       int n;
       int toplam =0;
       boolean tek;
         
        do{
            System.out.println("Sayı giriniz:");
            n = klavye.nextInt();
            if(n%2==0&&n%4==0)
                toplam=toplam+n;
            tek=n%2==1;
            
        }while(!tek);
        System.out.println("Toplam:"+toplam);
        
           
        
        
    }
    
}
