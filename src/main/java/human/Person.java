package human;

import animals.Mammal;

public class Person extends Mammal {

    @Override
    protected void eat(String food) {
        super.eat(food);
    }

    public Person(String name) {
       super(name);
    }
}
