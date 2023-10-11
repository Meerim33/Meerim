import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //тут я объявила переменную
        String nameWomen;
        //здесь объявила константу значение которой нельзя менять, и положила туда 33
        final int NUM = 33;
       // значение типа данных стринг они всегда пишутся внутри кавычек, а остальные без
        String word = " Yoga";
        //конкатенация - это просто плюс
        nameWomen = NUM + word;
        //распечатай мне
        System.out.println(nameWomen);
        //условная конструкция всего лишь - if(){}
        if(NUM<0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if(NUM>0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("вы сохранили нуль");
        }






    }
}

