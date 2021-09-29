package ru.mirea.task5;

class Dog1 extends Dog{
    public Dog1(String b, String c, String p){
        breed=b;
        characteristic =c;
        parameters = p;
    }
    public Dog1(){
        breed="Лабрадор";
        characteristic ="Лабрадоры – уравновешенные и легко обучаемые собаки. Они известны фантастическим нюхом и любовью к апортировке." + "\n" + "Это позволяет им работать в таможенных службах, исполнять обязанности поводырей и спасателей. Канадцы традиционно использовались как тягловые и охотничьи псы.";
        parameters="Высота в холке до 57 см, вес до 40 кг";
    }
    public void Test(){
        System.out.println("Порода: "+breed);
        System.out.println("Характеристика: "+ characteristic);
        System.out.println("Параметры:"+parameters);
    }
    public void setBreed(String breed) {
        this.breed=breed;
    }
    public String getBreed(String breed){
        return breed;
    }

    public void setChracteristic(String chracteristic) {
        this.characteristic =chracteristic;
    }
    public String getChracteristic(String chracteristic){
        return chracteristic;
    }
    public void setParameters(String parameters) {
        this.parameters=parameters;
    }
    public String getParameters(String parameters){
        return parameters;
    }
    public void Buy() {
        System.out.println("Купить породу - "+breed);
        System.out.println("");
    }
}
