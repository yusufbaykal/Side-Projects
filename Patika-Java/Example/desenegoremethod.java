import java.util.Scanner;

public class NewMain18{

     
    public static void getSequence(int num)
    {
        if(num <= 0)
            System.out.println("Lütfen pozitif bir sayı giriniz!! ");
        else
            getSequence(num,0,num);
    }
     
    private static void getSequence(int num,int goalNum,int baseNumber)
    {
         if(num < goalNum)
        {
            System.out.println(num+" ");
            if(num+5>= goalNum)
                System.out.println((num+5)+" ");
            else
                getSequence(num+5,goalNum,baseNumber);
        }
         else if(num > goalNum)
         {
             System.out.println(num+" ");
             if((num-5)<= goalNum)
                 getSequence(num-5,baseNumber,baseNumber);
             else
                 getSequence(num-5,goalNum,baseNumber);
         }
    }

     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num = sc.nextInt();
        getSequence(num);
    }

}
