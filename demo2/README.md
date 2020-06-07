# Advance Java Course June 2020
 # Demo 2

 This is a tiny demo that uses spring boot to creat an MVC.
 Spring Initializer `https://start.spring.io/` can be used to create the framework. 

 You will need a Model in `src/main/java/model` (or java/com/deloitte/training/demo2/model).
 This is simply the definition of the object with all of the getter and setter functions.
 This looks like this `Name.java`.

 You will need a services file, which gives the path names, I think that this is the View.
 This lives in  `src/main/java/services` (or java/com/deloitte/training/demo2/services).
 And its name is `NameServices.java`.

 You will need an Application file, which I presume is the controller.
 It lives in `src/main/java` (or java/com/deloitte/training/demo2).
 It is called `DemoApplication.java` presumably it can use different models.


## Running
From inside demo2 type `gradle bootRun`

In a new tab `http://localhost:8080/holidays/all`
This should display `[{"destination":"Ibiza","days":7},{"destination":"Rome","days":5},{"destination":"Thailand","days":21}]`

In a new tab `http://localhost:8080/holidays/byDestination/Rome`
This should display `{"destination":"Rome","days":5}`

In a new tab `http://localhost:8080/holidays/byDestination/Paris` and you should get `java.io.IOException: Oh No!` on the commandline.



