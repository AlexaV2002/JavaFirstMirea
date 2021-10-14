package ru.mirea.task6;

class Telephone implements Priceable {
    private String prise;

    public String getPrice() {
        System.out.printf("Цена: '%s'\n", prise);
        return prise;
    }

    Telephone(String prise) {

        this.prise = prise;
    }
}
