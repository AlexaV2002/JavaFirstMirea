package ru.mirea.task6;

class Tablet implements Priceable {
    private String prise;

    public String getPrice() {
        System.out.printf("Цена: '%s'\n", prise);
        return prise;
    }

    Tablet(String prise) {

        this.prise = prise;
    }
}
