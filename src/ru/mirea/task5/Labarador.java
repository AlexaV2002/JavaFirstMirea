package ru.mirea.task5;

public class Labarador extends Dog {
    private String razmer;

    public String getRazmer() {
        return razmer;
    }

    public void setRazmer(String razmer) {
        this.razmer = razmer;
    }

    public Labarador(String character, String livability, String razmer) {
        super(character, livability);
        this.razmer = razmer;
    }

    @Override
    public String toString() {
        return "Размер породы: " + razmer + " Характер: " + character + ", Уживчивость другими животными: " + livability ;
    }
}
