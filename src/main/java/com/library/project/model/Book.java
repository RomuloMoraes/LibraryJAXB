package com.library.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FileBookInfo",
        //namespace = "urn:bkk",
        propOrder = {"bookID", "bookTitle", "bookAuthor", "date"}
)
public class Book implements Serializable {

    @XmlTransient
    private Long bookLibID;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
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

    public Book(long bookID, String bookTitle, String bookAuthor, Date date) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.date = date;
    }

    public String toString() {
        return "model.Book{" +
                "ID : " + bookID +
                ", Title : '" + bookTitle + '\'' +
                ", Author : '" + bookAuthor + '\'' +
                ", model.Request Date=" + date +
                '}';
    }
}
