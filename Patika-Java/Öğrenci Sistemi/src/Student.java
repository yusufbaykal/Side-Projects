public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuno;
    String classes;


    double avarage;
    boolean ispass;

    Student(String name,String stuno,String classes,Course c1, Course c2, Course c3){
        this.name = name;
        this.stuno = stuno;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage =0.0;
        this.ispass = false;


    }


    void addbulnot(int nt1, int nt2, int nt3){
        if(nt1>= 0 && nt1 <=100 ){
           this.c1.note =nt1;
        }
        if(nt2>= 0 && nt2 <=100 ){
            this.c2.note =nt2;
        }
        if(nt3>= 0 && nt3 <=100 ){
            this.c3.note =nt3;
        }



    }
    void ispass(){
        System.out.println("==================");
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.avarage > 55){
            System.out.println("Sınıfı Geçtiniz.");
            this.ispass = true;

        }else{
            System.out.println("Sınıfta Kaldınız.");
            this.ispass = false;
        }
        printnot();
    }


    void printnot(){
        System.out.println(this.c1.name + "Notu\t:"+ this.c1.note);
        System.out.println(this.c2.name + "Notu\t:"+ this.c2.note);
        System.out.println(this.c3.name + "Notu\t:"+ this.c3.note);
        System.out.println("Ortalamanız:"+this.avarage);
    }

}
