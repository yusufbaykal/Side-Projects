import java.util.Scanner;
public class ilk16 {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Tutarı giriniz:");
        float sayı = klavye.nextInt();
        float tutar = (float)(sayı*0.18);
        System.out.println("Kdv Tutarı:"+tutar);
        float toplam = tutar+sayı;
        System.out.println("Toplam Tutar:"+toplam);
          
    }
    
}
