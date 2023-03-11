public class Hedgehog extends Animal{

    String name;
    int age;

    Hedgehog(String name, int age) {
        super("Hedgehog", 5);
        this.name = name;
        this.age = age;
    }

    @Override
    int humanAge() {
        return age * humanAgeFactor();
    }

    @Override
    void doesItFly() {
        System.out.println("It doesn't fly");
    }

    @Override
    void NameAndAge() {
        System.out.println("Hedgehog " + name + " " + age + " years old");
    }

    @Override
    String sound() {
        return "Sound: fuk fuk fuk";
    }
}
