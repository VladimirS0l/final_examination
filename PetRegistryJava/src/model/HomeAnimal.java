package model;

public class HomeAnimal extends Animal{
    private Enum type;

    public HomeAnimal(int id, String name, double age) {
        super(id, name, age);
        this.type = TypeAnimal.HOME;
    }

    @Override
    public String toString() {
        return "HomeAninal{id="+ super.getId() +
                " name=" + super.getName() +
                " age=" + super.getAge() +
                " type=" + type +
                '}';
    }

    public String getType(){
        return "Wild";
    }

}
