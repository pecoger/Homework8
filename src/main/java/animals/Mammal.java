package animals;

import org.jetbrains.annotations.NotNull;

public class Mammal {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            System.out.println("There is person without name, please enter name!");
        }
    }

    public Mammal(String name) {
        this.setName(name);
    }

    protected void eat(String food){
        System.out.println(name + " eats " + food);
    }
}
