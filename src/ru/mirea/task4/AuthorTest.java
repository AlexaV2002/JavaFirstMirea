package ru.mirea.task4;

public class AuthorTest {
    public static void main(String[] arg)
    {
        Author Leo = new Author("Leo Tolstoy", "tolstoy@litra.com", 'M');
        Author Anna = new Author("Anna Tod", "tod@litra.com", 'W');
        System.out.println(Leo);
        System.out.println(Anna);

    }
}
