package ru.mirea.task2;

public class Book {
    String name;
    int Page;
    public Book(String name, int Page)
    {
        this.name = name;
        this.Page = Page;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPage(int Page) {
        this.Page = Page;
    }
    public String getName() {
        return name;
    }
    public int getPage() {
        return Page;
    }
    @Override
    public String toString() {
        return "book name = " + name + ", page=" + Page;
    }
}
