public abstract class Animal {

    private String kindOfAnimal;
    private int lifeExpentency;

    Animal(String kindOfAnimal,int lifeExpentency) {
    this.kindOfAnimal = kindOfAnimal;
    this.lifeExpentency = lifeExpentency;
    }

     int humanAgeFactor(){
       int humanLifeExpentency = 80;
       return (humanLifeExpentency)/lifeExpentency;
   }
    abstract void NameAndAge();
    abstract String sound();
    abstract void doesItFly();
    abstract int humanAge();

}
