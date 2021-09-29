package ru.mirea.task5;

class Furniture2 extends Furniture{
    public Furniture2(String m, int p, String t){
        material=m;
        price=p;
        type=t;
    }
    public Furniture2(){
        material="берёза";
        price=15999;
        type="шкаф";
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
