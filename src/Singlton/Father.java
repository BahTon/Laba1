package Singlton;

public class Father {
    private static Father instance;
    public int age;
    public String job;

    private Father(int age, String job){
        this.age = age;
        this.job = job;
    }

    public static Father getInstance(int age, String job){
        if(instance == null){
            instance = new Father(age, job);
        }
        return instance;
    }
}
