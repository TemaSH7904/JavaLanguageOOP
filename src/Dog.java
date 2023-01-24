public class Dog {
    String name;
    String bread;
    Double weight;
    int speed;

    String getName(){
        return "Имя: " + name + "\nПорода: " + bread + "\nМасса: " + weight;
    }

    void run(){
        for (int i = 0; i < speed; i++) {
            System.out.println("бегу");
        }
    }

}
