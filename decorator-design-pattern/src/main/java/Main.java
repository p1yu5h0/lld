// Concrete Pizza class
class BasicPizza extends Pizza {

    @Override
    public String display() {
        return "Pizza";
    }

    @Override
    public Integer cost() {
        return 100;
    }
}

// Abstract Decorator class
abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    public String display(){
        return pizza.display();
    }
    public Integer cost(){
        return pizza.cost();
    }
}

// Olive topping decorator
class Olive extends PizzaDecorator {
    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String display() {
        return super.display() + " with Olive";
    }

    @Override
    public Integer cost(){
        return super.cost() + 5;
    }
}

// Pepper topping decorator
class Pepper extends PizzaDecorator {
    public Pepper(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String display() {
        return super.display() + " with Pepper";
    }

    @Override
    public Integer cost(){
        return super.cost() + 15;
    }
}

// Mushroom topping decorator
class Mushroom extends PizzaDecorator {
    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String display() {
        return super.display() + " with Mushroom";
    }

    @Override
    public Integer cost(){
        return super.cost() + 25;
    }
}

public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        System.out.println(basicPizza.display());

        Pizza olivePizza = new Olive(basicPizza);
        System.out.println(olivePizza.display() + " Price: " + olivePizza.cost());

        Pizza pepperPizza = new Pepper(basicPizza);
        System.out.println(pepperPizza.display() + " Price: " + pepperPizza.cost());

        Pizza mushroomPizza = new Mushroom(basicPizza);
        System.out.println(mushroomPizza.display() + " Price: " + mushroomPizza.cost());

        // You can also stack decorators
        Pizza fullyLoadedPizza = new Olive(new Pepper(new Mushroom(basicPizza)));
        System.out.println(fullyLoadedPizza.display() + " Price: " + fullyLoadedPizza.cost());
    }
}
