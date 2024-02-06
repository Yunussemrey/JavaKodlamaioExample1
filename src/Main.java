import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //öğrenci sınıfımızı çağırıyoruz
        Students students=new Students("Yunus","Akgül",21,"Bilgisayar programcılığı");
        Students students1=new Students("Süleyman","Akgül",47,"Tekstil Müh.");
        Students students2=new Students("Nurcan","Akgül",45,"Tekstil Müh.");

        //öğrenciler dizimiz
        String[] student=new String[3];
        student[0]= students.ad;
        student[1]=students1.ad;
        student[2]=students2.ad;



        //If - Array - For

        //Harf puanlaması
        String[] harfNotu=new String[3];
        harfNotu[0]="AA - BB - CC ";
        harfNotu[1]="DD ";
        harfNotu[2]="EE - FF ";

        //Sayısal puanlama
        String[] sayiNotu=new String[3];
        sayiNotu[0]="0.0 - 1.99";
        sayiNotu[1]="1.99 - 2.99";
        sayiNotu[2]="2.99 - 4.0";

        //Alınan puan
        int puan=75;

        /*
        //puan'a göre koşul belirle
        if (puan>50){
            System.out.println("Tebrikler! Geçtiniz. Sayısal notunuz: "+sayiNotu[2]+" Arasındadır.  Harf notunuz: "+harfNotu[0]);

        } else if (puan==50) {
            System.out.println("koşullu geçer. Sayısal notunuz: "+sayiNotu[1]+" Arasındadır. Harf notunuz: "+harfNotu[1]);

        } else if (puan<50){
            System.out.println("Kaldınız! Sayısal notunuz: "+sayiNotu[0]+" Arasındadır. Harf notunuz: "+harfNotu[2]);

        }
        System.out.println("---------------------");
        */

        //for

        if (puan>50){
            System.out.println("Tebrikler! Geçtiniz. Sayısal notunuz: "+sayiNotu[2]+" Arasındadır.  Harf notunuz: "+harfNotu[0]);
            System.out.println("Geçen öğrenciler");
            for (int i=0; i<student.length; i++){
                System.out.println(student[i]);
            }
                //Bu algoritmaya daha çok öğrenci ekleyerek ve öğrenciler sınıfına birde puan properties'i ekleyerek daha işlevsel hale
                //getirilebilir.
        }



    }
}