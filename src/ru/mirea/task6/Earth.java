package ru.mirea.task6;

class Earth implements Nameable {
    private String name;

    public String getName() {
        System.out.printf("Планета: '%s'\n", name);
        return name;
    }

    Earth(String name) {

        this.name = name;
    }
}
