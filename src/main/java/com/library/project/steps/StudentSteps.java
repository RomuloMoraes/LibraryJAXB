package com.library.project.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class StudentSteps {

    @Given("Student <$studentName> is logged")
    public void printName() {
        System.out.println("Maribel Madrigal");
    }

    @Given("Student types the <$bookName> book's name")
    public void studentTypesBookName(String bookName) {
        System.out.println("Java Book");
    }

    @When("Student selects the book")
    public void whenStudentSelectsBook() {
        System.out.println("Student selects the book");
    }

    @Then("The book is assigned to the book")
    public void bookIsAssignedToStudent() {
        System.out.println("The book is assigned");
    }

    @Then("The system create a xml file with <$studentName>, <$studentId>, <$bookName> and <$bookId> data")
    public void systemCreateXMLFile() {
        System.out.println("File is created");
    }
}
