/*
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

public class TestMain {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {

        model.Book book = new model.Book(1L, "The model.Book of JAXB", "Jax Bee", new Date());

        JAXBContext context = JAXBContext.newInstance(model.Book.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(book, new File("C:\\Users\\Romulo Moraes\\Documents\\projects\\LibraryJAXB\\src\\files\\TheBookOfJAXB.xml"));


        JAXBContext context1 = JAXBContext.newInstance(model.Book.class);
        Unmarshaller unmar = context1.createUnmarshaller();
        model.Book book1 = (model.Book) unmar.unmarshal(new FileReader("C:\\Users\\Romulo Moraes\\Documents\\projects\\LibraryJAXB\\src\\files\\TheJavaBook.xml"));
        System.out.println(book1);



    }
}
*/
