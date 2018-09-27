package nl.hva.ooad.composite;

/***
 * TODO: add comments
 */
public class MenuItem extends MenuComponent {

    private double price;
    private boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian) {
        super(name, description);

        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public void removeMenuComponent(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addMenuComponent(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuComponent getChild(int child) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        String output = getName();
        if(isVegetarian()) {
            output += "(v)";
        }
        output += ", " + getPrice() + " -- " + getDescription() + "\n";
        System.out.println(output);
    }
}