public class Monster {

    //Поля, глаза, руки и ноги монстра.
    int eyes;
    int hands;
    int legs;
    // Конутруктор - 1
    // Без параметров, устанавливает всем полям значение - 2
    Monster(int eyes, int hands, int legs){
        this.eyes = 2;
        this.hands = 2;
        this.legs = 2;
    }
    // Конструктор - 2
    // Принимает один параметр - 3.
    Monster(){
        this(3);
    }
    Monster(int number){
        this(number, number, number);
    }
    // Конструктор - 3
    // Принимает три параметра - кол-во: глаз, рук и ног. И устанавливает значение переменным экземпляра.

    // Метод Войс -голос
    static void voice(){
        System.out.println("Grrrrr");
    }
}
