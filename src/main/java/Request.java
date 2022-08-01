import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @Override
    public String toString() {
        return "Request{" +
                "Request ID : " + this.requestID +
                ", Student's Name : " + student.getStudentName() +
                ", Book's Name : " + book.getBookTitle() +
                '}';
    }
}
