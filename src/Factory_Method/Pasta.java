package Factory_Method;

import java.sql.SQLOutput;

public class Pasta implements Dishes {

    public String nameOfPasta;

    public Pasta(String nameOfPasta) {
        this.nameOfPasta = nameOfPasta;
    }

    @Override
    public void serving_the_dish() {
        System.out.println("на плоской тарелке");
    }

    @Override
    public void process_of_cooking() {
        switch (this.nameOfPasta) {
            case "Болоньезе": {
                System.out.println("Болоньеза");
                System.out.println("1)Обжарить на сковороде нарезанный лук\n2)Добавить к луку фарш\n3)Обжаривать до полуготовности фарша");
                System.out.println("4)Добавить томатную пасту и немного воды\n5)В готовый соус добавить спаггетти, тушить до готовности");
                serving_the_dish();
                break;
            }
            case "Сырная": {
                System.out.println("Сырная паста");
                System.out.println("1)Отварить в сковороде макароны\n2)Добавить немного сливок и ОЧЕНЬ много натертого сыра\n3)тушить до выпаривыния сливок\n4)Довести блюдо в духовке до румяной корочки");
                serving_the_dish();
                break;
            }
        }
    }
}
