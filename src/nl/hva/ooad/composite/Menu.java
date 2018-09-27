package nl.hva.ooad.composite;

import java.util.ArrayList;
import java.util.List;

/***
 * TODO: add comments
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents;

    public Menu(String name, String description) {
        super(name, description);
        menuComponents = new ArrayList<>();
    }

    @Override
    public void removeMenuComponent(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void addMenuComponent(MenuComponent menuComponent) {
        if(!menuComponents.contains(menuComponent)) {
            menuComponents.add(menuComponent);
        }
    }

    @Override
    public MenuComponent getChild(int child) {
        return menuComponents.get(child);
    }

    @Override
    public void print() {
        System.out.print("\n" + getName() + ", " + getDescription() + "\n-----------------------\n");

        for(MenuComponent menuItem : menuComponents) {
            menuItem.print();
        }
    }
}