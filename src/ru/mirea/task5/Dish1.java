package ru.mirea.task5;

class Dish1 extends Dish {
    public Dish1(String a, String b, String c){
        types=a;
        colour=b;
        material=c;
    }
    public Dish1(){
        types="Чашка";
        colour="Зеленая";
        material="Керамика";
        cost = 1099;

    }
    public void Test(){
        System.out.println("Тип посуды: "+types);
        System.out.println("Цвет: "+ colour);
        System.out.println("Материал:"+material);
    }
    public void setTypes(String types) {
        this.types=types;
    }
    public String getTypes(String types){
        return types;
    }

    public void setColour(String colour) {
        this.colour =colour;
    }
    public String getColour(String colour){
        return colour;
    }
    public void setMaterial(String material) {
        this.material=material;
    }
    public String getMaterial(String material){
        return material;
    }
    public void Buy() {
        System.out.println("Купить чашку за "+cost);
        System.out.println("");
    }
}
