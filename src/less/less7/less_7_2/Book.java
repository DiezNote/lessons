package less.less7.less_7_2;

/**
 * Created by лтд on 22.11.2016.
 */
public class Book {

    Title title;
    Author author;
    Content content;

    Book(String _title, String _author, String _content) {
        this.title = new Title(_title);
        this.author = new Author(_author);
        this.content =new Content(_content);
    }
}