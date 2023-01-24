public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Spike";
        dog.bread = "Shepherd";
        dog.weight = 2.0;
        dog.speed = 5;

        System.out.println(dog.getName());
        dog.run();
        


//        System.out.println("Средний возраст трех людей: " + result);
//        Man human1 = new Man();
//        Man human2 = new Man();
//        Man human3 = new Man();
//
//        human1.name = "Alex";
//        human1.age = 20;
//        human1.weight = 65;
//
//        human2.name = "Piter";
//        human2.age = 45;
//        human2.weight = 76;
//
//        human3.name = "Nikita";
//        human3.age = 34;
//        human3.weight = 67;
//
//        int result = (human1.age + human2.age + human3.age) / 3;
    }
}