/**
 * Created by alexm on 09.04.2019.
 */
public class Book {
    private int yearOfEdit;
    private String bookAuthor;
    private boolean state;

    public Book(int yearOfEdit, String bookAuthor, boolean state) {
        this.yearOfEdit = yearOfEdit;
        this.bookAuthor = bookAuthor;
        this.state = state;
    }

    public int getYearOfEdit() {
        return yearOfEdit;
    }

    public void setYearOfEdit(int yearOfEdit) {
        this.yearOfEdit = yearOfEdit;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
