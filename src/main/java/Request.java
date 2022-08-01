import javax.xml.bind.annotation.*;

@XmlRootElement(
        name = "Request"
)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Request",
        propOrder = {"requestID", "student", "book"}
)
public class Request {

    @XmlElement(
            name = "RequestIDHd",
            required = true
    )
    private Long requestID;

    @XmlElement(
            name = "StudentHD",
            required = true
    )
    private Student student;

    @XmlElement(
            name = "BookHD",
            required = true
    )
    private Book book;


    public Request() {

    }

    public Request(Long requestID, Student student, Book book) {
        this.requestID = requestID;
        this.student = student;
        this.book = book;

    }

    public Long getRequestID() {
        return requestID;
    }

    public void setRequestID(Long requestID) {
        this.requestID = requestID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Request{" +
                "Request ID : " + this.requestID +
                ", Student's Name : " + student.getStudentName() +
                ", Book's Name : " + book.getBookTitle() +
                '}';
    }
}
