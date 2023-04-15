package model;

public class WildAnimal extends Animal{

    private Enum type;
    public WildAnimal(int id, String name, double age) {
        super(id, name, age);
        this.type = TypeAnimal.WILD;
    }

    @Override
    public String toString() {
        return "WildAninal{id="+ super.getId() +
                " name=" + super.getName() +
                " age=" + super.getAge() +
                " type=" + type +
                '}';
    }

    public String getType(){
        return "Wild";
    }


    public void getCommand(String text) {

    }
}
