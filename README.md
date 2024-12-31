# WESTERN GOVERNORS UNIVERSITY 
## D288 – BACK-END PROGRAMMING
Welcome to Back-End Programming! This is an opportunity for students to develop object-oriented applications that can be integrated with relational databases, write code for object-oriented applications using Spring framework, and implements design patterns for object-oriented applications. 
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will be building your project using IntelliJ IDEA (Ultimate Edition) in a WGU-provided lab environment. You will be working with an existing MySQL database and Angular front-end, which are supplied for you in the lab environment. You will share this project to a private external GitLab repository and backup regularly. If you wish to work on it on your local machine, you will also need to download the Angular front-end application and create your own MySQL database. Use the links on your course page to install the integrated development environments (IDE), MySQL WorkBench, and IntelliJ IDEA, and pull the project from the lab environment.  


Your submission must be your own original work. You may not use or reference other students’ submissions for this task. For more information please review our Academic Authenticity policies and the Professionalism and Conduct Expectations for College of Information Technology Students.



You must use the rubric to direct the creation of your submission because it provides detailed criteria that will be used to evaluate your work. Each requirement below may be evaluated by more than one rubric aspect. The rubric aspect titles may contain hyperlinks to relevant portions of the course.



Tasks may not be submitted as cloud links, such as links to Google Docs, Google Slides, OneDrive, etc., unless specified in the task requirements. All other submissions must be file types that are uploaded and submitted as attachments (e.g., .docx, .pdf, .ppt).



Note: External plugins and libraries other than those specified in this task are not allowed.


A.   Create a new Java project using Spring Initializr, with each of the following dependencies:

•    Spring Data JPA (spring-boot starter-data-jpa)

•    Rest Repositories (spring-boot-starter-data-rest)

•    MySQL Driver (mysql-connector-java)

•    Lombok



Note: Since the application properties will be empty, you will need to copy over the supplied application properties.

1. Added Spring Initializr with dependencies. Updated README.md. Date: 9/11.

B.   Create your subgroup and project by logging into GitLab using the web link provided and do the following:

•    connect your new Java project

•    commit with a message and push when you complete each of the tasks listed below (parts B to F, etc.)

2. Created working_branch. Date: 9/11.

Note: Any submissions that do not have a commit after each task will not be evaluated.


Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.


•    Submit a copy of the git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.


Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.



C.   Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.


Note: The packages should be on the same level of the hierarchy.


Note: Construct a package named config and copy the RestDataConfig.java provided in the laboratory environment to the package. Modify it so that the package and imports have the correct package and import addresses. Copy the application.properties file that is provided in the laboratory environment into your application properties resource file.

3. Constructed 4 packages (contollers/dao/entities/services), added RestDataConfig.java and application.properties. Date: 9/11.

D.   Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.

4. Added java classes to Entity file. Date: 9/14.

E.   Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.

5. Added repositories to dao file. Date 9/14.

F.   Write code for the services package that includes each of the following:

•    a purchase data class with a customer cart and a set of cart items

•    a purchase response data class that contains an order tracking number

•    a checkout service interface

•    a checkout service implementation class

6. Update to services file, added services java files. Update to README.md. Date: 9/15

G.   Write code to include validation to enforce the inputs needed by the Angular front-end.

7. Updated Customer.java for validation on required inputs for fields. Update to README.md. Date: 9/15

H.   Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.

8. Added CheckoutContorller.java to controllers. Updated README.md. Date: 9/15.

Note: You do not need to duplicate REST functionality for each repository by creating methods in Java.


I.   Add five sample customers to the application programmatically.


Note: Make sure the customer information is not overwritten each time you run the application.

9. Added BootStrapData.java to bootstrap. Updated README.md. Date: 9/15.

J.   Run your integrated application by adding a customer order for a vacation with two excursions using the unmodified Angular front-end. Provide screenshots for the following:

•    that your application does not generate a network error when adding the data

•    your database tables using MySQL Workbench to show the data was successfully added



Note: The screenshot should include the front-end view and the inspection console in the browser.

10. 

K.   Demonstrate professional communication in the content and presentation of your submission.
