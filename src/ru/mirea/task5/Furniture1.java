package ru.mirea.task5;

class Furniture1 extends Furniture{
    public Furniture1(String m, int p, String t){
        material=m;
        price=p;
        type=t;
    }
    public Furniture1(){
        material="кожа";
        price=6999;
        type="кресло";
    }

    public void setMaterial(String material) {
        this.material=material;
    }
    public String getMaterial(String material){
        return material;
    }

    public void setPrice(int price) {
        this.price=price;
    }
    public int getPrice(int price){
        return price;
    }

    public void setType(String type) {
        this.type=type;
    }
    public String getType(String type){
        return type;
    }
    public void Test(){
        System.out.println("материал: "+material);
        System.out.println("цена: "+price);
        System.out.println("название мебели: "+type);
    }

}
