package model;

public class Counter {
    private int COUNT;

    public Counter() {
        this.COUNT = 0;
    }

    public void increaseCount(){
        COUNT++;
    }

    public void decreaseCount(){
        COUNT--;
    }

    public void printCount(){
        System.out.println(COUNT);
    }
}
