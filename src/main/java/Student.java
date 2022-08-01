import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FileStudentInfo",
        namespace = "urn:std",
        propOrder = {"studentName", "studentID"}
)
public class Student {
    @XmlElement(
            name = "StudentName",
            //namespace = "urn:std.name",
            required = true
    )
    protected String studentName;
    @XmlElement(
            name = "StudentID",
            //namespace = "urn:std.id",
            required = true
    )
    protected Long studentID;

    public Student() {

    }

    public Student(String studentName, Long studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
}
