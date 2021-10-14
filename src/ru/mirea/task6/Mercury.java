package ru.mirea.task6;

class Mercury implements Nameable {
    private String name;

    public String getName() {
        System.out.printf("Планета: '%s'\n", name);
        return name;
    }

    Mercury(String name) {

        this.name = name;
    }
}
