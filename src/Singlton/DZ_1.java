package Singlton;

public class DZ_1 {
    public static void main(String[] args) {
        Father Andrey = Father.getInstance(50, "пекарь");
        Father Boris = Father.getInstance(44, "токарь");
        System.out.println(Andrey.age + " " + Andrey.job);
        System.out.println(Boris.age + " " + Boris.job);//проверка
    }
}
