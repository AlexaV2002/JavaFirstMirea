package ru.mirea.task6;

class Laptop implements Priceable {
    private String prise;

    public String getPrice() {
        System.out.printf("Цена: '%s'\n", prise);
        return prise;
    }

    Laptop(String prise) {

        this.prise = prise;
    }
}
