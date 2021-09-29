package ru.mirea.task5;

class FurnitureShop{
    String department;
    String name;
    int floor;

    public FurnitureShop(String d, String n, int f){
        department=d;
        name=n;
        floor=f;
    }
    public FurnitureShop(){
        department="диваны";
        name="IKEA";
        floor=3;
    }

    public void setDepartment(String department) {
        this.department=department;
    }
    public String getDepartment(String department){
        return department;
    }

    public void setName(String name) {
        this.name=name;
    }
    public String getName(String name){
        return name;
    }

    public void setFloor(int floor) {
        this.floor=floor;
    }
    public int getFloor(int floor){
        return floor;
    }
    public void Test(){
        System.out.println("название отдела: "+department);
        System.out.println("название: "+name);
        System.out.println("всего этажей: "+floor);
    }
}
