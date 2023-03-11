import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();
        list.add(new Penguin("Roman", 12));
        list.add(new Pigeon("Zbyszek", 23));
        list.add(new Parrot("Carol", 6));
        list.add(new Hedgehog("Sonic", 3));
        list.add(new Squirrel("John", 10));

        for (Animal animal : list){
            animal.NameAndAge();
            System.out.println(animal.sound());
            animal.doesItFly();
            System.out.println("Human age: " + animal.humanAge()+ "\n");
        }


    }
}