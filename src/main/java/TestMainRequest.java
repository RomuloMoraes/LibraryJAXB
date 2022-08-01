import model.Book;
import model.Request;
import model.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

public class TestMainRequest {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {

        Student student = new Student("Maribel Madrigal", 1L);

        Book book = new Book(1L, "The model.Book of JAXB", "Jax Bee", new Date());

        Request request = new Request(3L, student, book);

        JAXBContext context = JAXBContext.newInstance(Request.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(request, new File("C:\\Users\\Romulo Moraes\\Documents\\projects\\LibraryJAXB\\src\\files\\test.xml"));

        JAXBContext contextUnm = JAXBContext.newInstance(Request.class);
        Unmarshaller unmar = contextUnm.createUnmarshaller();
        Request requestUnm = (Request) unmar.unmarshal(new FileReader("C:\\Users\\Romulo Moraes\\Documents\\projects\\LibraryJAXB\\src\\files\\test3.xml"));
        System.out.println(requestUnm);

    }
}
