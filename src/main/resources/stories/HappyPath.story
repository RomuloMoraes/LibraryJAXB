Scenario:  Student request 1 book from library

Given Student <$studentName> is logged
And Student types the <$bookName> book's name
When Student selects the book
Then The book is assigned to the book
And The system create a xml file with <$studentName>, <$studentId>, <$bookName> and <$bookId> data

Examples:
|studentName     |studentId|bookName        |bookId|
|Maribel Madrigal|1        |The Book of Java|1     |
