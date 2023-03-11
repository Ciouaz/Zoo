public class Pigeon extends Birds{

    String name;
    int age;
    Pigeon(String name, int age){
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
        System.out.println("Pigeon " + name + " " + age + " years old");
    }

    @Override
    String sound() {
        return "Sound: grrrr, grrr, grrr.";
    }
}