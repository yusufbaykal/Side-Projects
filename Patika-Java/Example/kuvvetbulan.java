import java.util.Scanner;
public class NewMain3 {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz:");
        int sayı = klavye.nextInt();
        for (int i = 1; i <=sayı; i*=4) {
            System.out.println(i);            
        }
        for(int i =1;i<=sayı;i*=5){
            System.out.println(i);
        }
    }
    
}
