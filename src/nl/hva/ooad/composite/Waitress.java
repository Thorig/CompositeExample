package nl.hva.ooad.composite;

public class Waitress {
    public static void main(String args[]) {

        MenuComponent menu = createPancakeMenu();

        menu.addMenuComponent(createDinerMenu());

        menu.print();
    }

    private static MenuComponent createDinerMenu() {

        MenuComponent menu = createDinerMainMenu();
        menu.addMenuComponent(createDinerDessertMenu());
        return menu;
    }

    private static MenuComponent createDinerMainMenu() {
        MenuComponent menu = new Menu("Diner menu", "Lunchkaart van de diner");

        menu.addMenuComponent(new MenuItem(
                "Boodje Ei",
                "Brood met een Ei",
                3.5,
                false));

        menu.addMenuComponent(new MenuItem(
                "Boodje Kaas",
                "Brood met een stukje schimmel",
                4.5,
                true));

        menu.addMenuComponent(new MenuItem(
                "Boodje Ham",
                "Brood met een plak ham",
                2.5,
                false));

        return menu;
    }

    private static MenuComponent createDinerDessertMenu() {
        MenuComponent menuDessert = new Menu("Diner dessert menu", "Dessertkaart van de diner");

        menuDessert.addMenuComponent(new MenuItem(
                "Mouse",
                "Choco Mouse",
                4.5,
                false));

        menuDessert.addMenuComponent(new MenuItem(
                "IJs",
                "Lekker bolletje ijs",
                2.5,
                true));

        return menuDessert;
    }

    private static MenuComponent createPancakeMenu() {
        MenuComponent menu = new Menu("Pannenkoeken menu", "Kaart met de pannenkoeken");

        menu.addMenuComponent(new MenuItem(
                "Naturel",
                "Droge pannenkoek (stroop staat op tafel)",
                2.5,
                false));

        menu.addMenuComponent(new MenuItem(
                "Pannenkoek met Kaas",
                "Pannenkoek met een gesmolten stukjes schimmel",
                4.5,
                false));

        menu.addMenuComponent(new MenuItem(
                "pannenkoek spek",
                "Pannenkoek met een plakjes spek",
                3.5,
                false));

        return menu;
    }
}