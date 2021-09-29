package ru.mirea.task5;

class Dog2 extends Dog {
    public Dog2(String b, String c, String p) {
        breed = b;
        characteristic = c;
        parameters = p;
    }

    public Dog2() {
        breed = "Бигль";
        characteristic = "Бигль — гладкошерстная охотничья собака, подвижная, с веселым характером и очень хорошим нюхом.";
        parameters = "Вес — от 8 до 11 кг. Рост в холке 33- 41 см";
    }

    public void Test() {
        System.out.println("Порода: " + breed);
        System.out.println("Характеристика: " + characteristic);
        System.out.println("Параметры:" + parameters);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed(String breed) {
        return breed;
    }

    public void setChracteristic(String chracteristic) {
        this.characteristic = chracteristic;
    }

    public String getChracteristic(String chracteristic) {
        return chracteristic;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getParameters(String parameters) {
        return parameters;
    }

    public void Buy() {
        System.out.println("Купить породу - " + breed);
        System.out.println("");
    }
}
