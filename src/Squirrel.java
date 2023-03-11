public class Squirrel extends Animal{

    String name;
    int age;

    Squirrel(String name, int age) {
        super("Squirell", 10);
        this.name = name;
        this.age = age;
    }

    @Override
    int humanAge() {
        return age * humanAgeFactor();
    }

    @Override
    void doesItFly() {
        System.out.println("It soars");
    }

    @Override
    void NameAndAge() {
        System.out.println("Squirell " + name + " " + age + " years old");
    }

    @Override
    String sound() {
        return "Sound: wide range of vocal features, including squeaks, barks, and grunts";
    }
}