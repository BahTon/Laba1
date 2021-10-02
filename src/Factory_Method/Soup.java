package Factory_Method;

import org.w3c.dom.ls.LSOutput;

public class Soup implements Dishes{
    public String nameOfSoup;

    public Soup(String nameOfSoup){
        this.nameOfSoup = nameOfSoup;
    }

    @Override
    public void serving_the_dish() {
        System.out.println("в глубокой тарелке");
    }

    @Override
    public void process_of_cooking() {
        switch(this.nameOfSoup) {
            case "Сырный с грибами": {
                System.out.println("\nСуп сырный с грибами");
                System.out.println("1)Обжарить грибы с луком 10 минут\n2)Добавить в грибы сливки и томить на слабом огне 15 минут");
                System.out.println("3)В закипевшей воде сварить нарезанный кубиком картофель\n4)Добавить грибы в воду\n5)Посолить и поперчить по вкусу");
                serving_the_dish();
                break;
            }
            case "Борщ": {
                System.out.println("\nБорщ");
                System.out.println("1)Обжарить лук с морковью\n2)Отдельно обжарить натертую свёклу\n3)В закипевшую воду добавить нарезанный картофель соломкой, свёклу, морковь с луком");
                serving_the_dish();
                break;
            }
        }
    }
}
