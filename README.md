# Student_Registration
This project provides a RESTful API for managing student data using Java Spring Boot. It allows clients to perform CRUD (Create, Read, Update, Delete) operations on student resources through HTTP requests.

Requests :-
*  GET
  -- http://localhost:9090/students
   Returns All Students data
  -- http://localhost:9090/students/2
   Returns student data of the given id
   
*  POST
 -- http://localhost:9090/students
   {
    "id": 3,
    "fname": "Chicku",
    "lname": "Raj",
    "phoneNum": 1234567890,
    "emailId": "abcd@gmail.com"
  }
  Adds the given data

*  PUT
  -- http://localhost:9090/students
  {
    "id": 3,
    "fname": "Abhinav",
    "lname": "Raj",
    "phoneNum": 1234567890,
    "emailId": "abcd@gmail.com"

  }
  Updates the data
  
*  DELETE
  -- http://localhost:9090/students/3
   Delete the data from the database
  
