//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
        int puan=49;

        //puan'a göre koşul belirle
        if (puan>50){
            System.out.println("Tebrikler! Geçtiniz. Sayısal notunuz: "+sayiNotu[2]+" Arasındadır.  Harf notunuz: "+harfNotu[0]);

        } else if (puan==50) {
            System.out.println("koşullu geçer. Sayısal notunuz: "+sayiNotu[1]+" Arasındadır. Harf notunuz: "+harfNotu[1]);

        } else if (puan<50){
            System.out.println("Kaldınız! Sayısal notunuz: "+sayiNotu[0]+" Arasındadır. Harf notunuz: "+harfNotu[2]);

        }


    }
}