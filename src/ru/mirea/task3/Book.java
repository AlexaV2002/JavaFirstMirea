package ru.mirea.task3;

public class Book {
    String name;
    String Author;
    int Page;
    int year;
    public Book(String name, String Author, int Page, int year) {
        this.name = name;
        this.Author = Author;
        this.Page = Page;
        this.year = year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public void setPage(int Page) {
        this.Page = Page;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return Author;
    }
    public int getPage() {
        return Page;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "book name - " + name + ", author of book - " + Author + ", number of pages - " + Page + ", year of release - " + year;
    }
}
