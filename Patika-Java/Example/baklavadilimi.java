import java.util.Scanner;
public class NewMain6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         int boyut;

         int i,j,k,l;

        

         System.out.println("Sayı giriniz: ");

         boyut = input.nextInt();

        

         for (i=1; i <= boyut; i++)

         {

               k = i <= boyut / 2 ? 2 * i - 1 : 2 * (boyut - i + 1) - 1;

               j = (boyut - k) / 2;



               for (l = 0; l < j; l++)

                    System.out.print(" ");



               for (l = 0; l < k; l++)

                    if(l == 0 || l == k - 1)

                        System.out.print("*");

                    else

                        System.out.print(" ");



               System.out.println();
     
    }

}}
