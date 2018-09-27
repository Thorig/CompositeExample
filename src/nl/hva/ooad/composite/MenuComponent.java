package nl.hva.ooad.composite;

/***
 * TODO: add comments
 */
public abstract class MenuComponent {

    private String description;
    private String name;

    public MenuComponent(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void setPrice(double price) {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void setVegetarian(boolean vegetarian) {
        throw new UnsupportedOperationException();
    }

    public abstract void removeMenuComponent(MenuComponent menuComponent);

    public abstract void addMenuComponent(MenuComponent menuComponent);

    public abstract MenuComponent getChild(int child);

    public abstract void print();
}