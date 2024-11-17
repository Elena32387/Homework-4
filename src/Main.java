import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args){
        //Задание 1
        System.out.println("Задание 1");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);}

        //Задание 2
        System.out.println("Задание 2");
        for(int i = 10; i >= 1; i=i-1) {
            System.out.println(i);}

        //Задание 3
        System.out.println("Задание 3");
        for (int i = 1; i <= 17; i++) {
            if (i%2==0)
            System.out.println(i);}

        //Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);}

        //Задание 5
        System.out.println("Задание 5");
        for (int i = 1904; i<=2096; i=i+4){
            System.out.println(i+" год считается високосным");}

        //Задание 6
        System.out.println("Задание 6");
        for (int i =7; i<=98; i=i+7){
            System.out.println(i);}

        //Задание 7
        System.out.println("Задание 7");
        for (int i=1; i<=512; i=i*2){
            System.out.println(i);}

        //Задание 8
        System.out.println("Задание 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i <=12; i++) {
            total=total+accumulation;
            System.out.println("Месяц "+ i +" ,сумма накоплений равна " +total+ " рублей");}

        //Задание 9
        System.out.println("Задание 9");
        int salary=29000;
        int result = 0;
        for (int i = 0; i<12; i++) {
            result= result+salary;
            result=result+result/100;
            System.out.println("Месяц " +i + ", сумма накоплений равна "+result+ " рублей");}

        //Задание 10
        System.out.println("Задание 10");
        for (int i = 1; i<=10; i++) {
            System.out.printf("%d x %d = %d%n", 2, i, 2 * i);}




    }

}