package ru.mirea.task6;

class Venus implements Nameable {
    private String name;

    public String getName() {
        System.out.printf("Планета: '%s'\n", name);
        return name;
    }

    Venus(String name) {

        this.name = name;
    }
}
