package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZooFerm {

    private int ANIMAL_COUNT = 0;
    private final List<Animal> animalList;
    private final List<String> commandList;

    public ZooFerm() {
        animalList = new ArrayList<>();
        commandList = new ArrayList<>();
        {
            commandList.add("Run");
            commandList.add("Play");
            commandList.add("Eating");
        }
    }

    public void showAnimals(){
        for (Animal animal: animalList) {
            System.out.println(animal);
        }
    }

    public void addAnimal(String name, double age, String type){
        int id = ++ANIMAL_COUNT;
        if (type.equals("HOME")){
            HomeAnimal homeAninal = new HomeAnimal(id, name, age);
            animalList.add(homeAninal);
        }else if (type.equals("WILD")){
            WildAnimal wildAnimal = new WildAnimal(id, name, age);
            animalList.add(wildAnimal);
        }
    }

    public void editAnimal(String name, double age, int id){
        Animal animal = animalList.get(id);
        animal.setName(name);
        animal.setAge(age);
    }

    public void deleteAnimal(int id){
        animalList.remove(id);
    }

    public void addCommand(String text){
        commandList.add(text);
    }

    public void getCommand() {
        int count = 1;
        for (String com: commandList) {
            System.out.println("id: " + count + " " + com);
            count++;
        }
    }

    public void getPlay(int id, int idCom){
        System.out.println(animalList.get(id) + " use command: " + commandList.get(idCom));
    }

    public void readDb(){

        try (BufferedReader br = new BufferedReader(new FileReader(PathDb.pathDb))){
            String name;
            while ((name = br.readLine()) != null){
                double age = Double.parseDouble(br.readLine());
                String type = br.readLine();
                addAnimal(name, age, type);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveDb(){
        try (FileWriter writer = new FileWriter(PathDb.pathDb, false)) {
            for (Animal animal : animalList) {
                String s = animal.toString();
                Pattern pattern = Pattern.compile("name=(\\w+)\\s+age=([\\d.]+)\\s+type=(\\w+)");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()) {
                    String name = matcher.group(1);
                    double age = Double.parseDouble(matcher.group(2));
                    String type = matcher.group(3);
                    writer.append(name)
                            .append("\n")
                            .append(String.valueOf(age))
                            .append("\n")
                            .append(String.format(type))
                            .append("\n");
                    writer.flush();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
