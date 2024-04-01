import helper.Topic;

public class Book {
    String name;
    Topic bookType;
    String author;

    public Book(String name, String author, Topic type){

        bookType = type;
        this.name = name;
        this.author = author;
    }
}
