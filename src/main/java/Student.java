import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@NoArgsConstructor
@AllArgsConstructor
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


}
