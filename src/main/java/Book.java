import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FileBookInfo",
        //namespace = "urn:bkk",
        propOrder = {"bookID", "bookTitle", "bookAuthor", "date"}
)
public class Book implements Serializable {

    @XmlTransient
    private Long bookLibID;
    @XmlElement(
            name = "BookID",
            //namespace = "urn:bkk.id",
            required = true
    )
    private Long bookID;
    @XmlElement(
            name = "BookTitle",
            //namespace = "urn:bkk.title",
            required = true
    )
    private String bookTitle;
    @XmlElement(
            name = "BookAuthor",
            //namespace = "urn:bkk.author",
            required = true
    )
    private String bookAuthor;
    @XmlElement(
            name = "Date",
            //namespace = "urn:bkk.date",
            required = true
    )
    private Date date;

    public Book() {

    }

    public Book(long bookID, String bookTitle, String bookAuthor, Date date) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.date = date;
    }

    public Long getBookLibID() {
        return bookLibID;
    }

    public void setBookLibID(Long bookLibID) {
        this.bookLibID = bookLibID;
    }

    public Long getBookID() {
        return bookID;
    }

    public void setBookID(Long bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "Book{" +
                "ID : " + bookID +
                ", Title : '" + bookTitle + '\'' +
                ", Author : '" + bookAuthor + '\'' +
                ", Request Date=" + date +
                '}';
    }
}
