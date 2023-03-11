public class Parrot extends Birds{

    String name;
    int age;
    Parrot(String name, int age){
        super("Parrot", true);
        this.name = name;
        this.age = age;
    }

    @Override
    int humanAge() {
        return age * humanAgeFactor();
    }

    @Override
    void NameAndAge() {
        System.out.println("Parrot " + name + " " + age + " years old");
    }

    @Override
    String sound() {
        return "Sound: " + ("Parrot " + name + " " + age + " years old");
    }
}