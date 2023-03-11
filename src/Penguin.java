public class Penguin extends Birds{

    String name;
    int age;
    Penguin(String name, int age){
        super("Penguin", false);
        this.name = name;
        this.age = age;
    }

    @Override
    int humanAge() {
        return age * humanAgeFactor();
    }

    @Override
    void NameAndAge() {
        System.out.println("Penguin " + name + " " + age + " years old");
    }

    @Override
    String sound() {
        return "Sound: Sound: honk honk honk";
    }
}
