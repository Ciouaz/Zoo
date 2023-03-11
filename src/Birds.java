public abstract class Birds extends Animal {

    private String breed;
    private boolean fly;

    Birds(String breed, boolean fly) {
        super("Bird", 25);
        this.breed = breed;
        this.fly = fly;
    }

    @Override
    void doesItFly() {
        { System.out.println(fly ? "It flies" : "It doesn't fly");
        }
    }
}
