package interfaz;

public class Bear implements Herbivore, Omnivore {

    @Override
    public int eatPlants(int quantity) {
        System.out.println("Eating Plants Herbivore: " + quantity);
        return quantity;
    }

    @Override
    public void eatPlants() {
        System.out.println("Eating Plants Omnivore");
    }
}
