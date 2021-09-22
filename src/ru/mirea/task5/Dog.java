package ru.mirea.task5;

public class Dog {
    String character;
    String livability;


    public String getСharacter() {
        return character;
    }

    public void setСharacter(String character) {
        this.character = character;
    }

    public String getLivability() {
        return livability;
    }

    public void setLivability(String livability) {
        this.livability = livability;
    }

    public Dog(String character, String livability) {
        this.character = character;
        this.livability = livability;
    }

    @Override
    public String toString() {
        return  "Харатер:" + character + " Уживчивоость с другими животными" + livability ;
    }
}

