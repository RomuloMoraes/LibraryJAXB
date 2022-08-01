package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Book;

import javax.xml.bind.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(
        name = "model.Request"
)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "model.Request",
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

    @Override
    public String toString() {
        return "model.Request{" +
                "model.Request ID : " + this.requestID +
                ", model.Student's Name : " + student.getStudentName() +
                ", model.Book's Name : " + book.getBookTitle() +
                '}';
    }
}
