public class Main {

    public static void main(String[]args){
        Teacher t1 = new Teacher("Yusuf Hoca","Tarih","09522524242");
        Teacher t2 = new Teacher("Graham Bell","Fizik","44242");
        Teacher t3 = new Teacher("Külyutmaz","Biyoloji","2432423");

        Course biyo = new Course("Biyoloji","103","Biyoloji");
        biyo.addTeacher(t3);

        Course tarih = new Course("Tarih","101","Tarih");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","Fizik");
        fizik.addTeacher(t2);



        Student s1 = new Student("Şaban","21112","4",tarih,fizik,biyo);
        s1.addbulnot(100,78,50);
        s1.ispass();

        Student s2 = new Student("Güdük","2131","4",tarih,fizik,biyo);
        s2.addbulnot(50,30,70);
        s2.ispass();





    }


}
