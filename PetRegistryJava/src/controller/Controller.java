package controller;

import model.Counter;
import model.ZooFerm;
import view.View;

import java.util.Scanner;

public class Controller {
    View view;
    ZooFerm zooFerm;
    Counter counter;

    public Controller() {
        view = new View();
        zooFerm = new ZooFerm();
        counter = new Counter();
    }

    public void button_click(){
        zooFerm.readDb();
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!s.equals("q")){
            view.showMainMenu();
            view.enter();
            s = scanner.nextLine();
            switch (s) {
                case "1" -> zooFerm.showAnimals();
                case "2" -> {
                    String name = view.enterName();
                    double age = view.enterAge();
                    String type = view.enterType();
                    zooFerm.addAnimal(name, age, type);
                    view.viewAddAnimal();
                    counter.increaseCount();

                }
                case "3" -> {
                    zooFerm.showAnimals();
                    int idChange = view.enterId();
                    String nameNew = view.enterName();
                    double ageNew = view.enterAge();
                    zooFerm.editAnimal(nameNew, ageNew, idChange);
                    view.viewEditAnimal();
                }
                case "4" -> {
                    zooFerm.showAnimals();
                    int idDel = view.enterId();
                    zooFerm.deleteAnimal(idDel);
                    view.deleteAnimal();
                    counter.decreaseCount();
                }
                case "5" -> {
                    zooFerm.showAnimals();
                    int idPlay = view.enterId();
                    zooFerm.getCommand();
                    int idPlayAnimal = view.enterId();
                    zooFerm.getPlay(idPlay, idPlayAnimal);
                }
                case "6" -> {
                    String newCommand = view.enterNewCommand();
                    zooFerm.addCommand(newCommand);
                }
                case  "7" -> {
                    counter.printCount();
                }
                case "8" -> {
                    zooFerm.saveDb();
                }
                default -> {
                }
            }
        }
    }


}
