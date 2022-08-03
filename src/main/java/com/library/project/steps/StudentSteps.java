package com.library.project.steps;

import org.jbehave.core.annotations.Given;

public class StudentSteps {

    @Given("Student is logged")
    public void printName() {
        System.out.println("Maribel Madrigal");
    }

    @Given("Student types the <$bookName> book's name")
    public void studentTypesBookName(String bookName) {
        System.out.println("Java Book");
    }


}
