# Currency and Length Converter
For my final project in my Java 2 class, I chose to program and design a currency
and length converter using Java and JavaFX. 

## Project’s Title

   Flash Converter

## Project Description

   ### What my application does : 
   
   My application is a currency and length converter, which means it can convert a value from one currency to another or a measurement from one unit to      another. To be more specific, the currency converter can convert between four currencies: CAD, USD, YEN, and EURO. As well as the length converter        which can also convert between four units of length: KM, M, MM, and CM.

   ### How it was built and what technologies I used :
   
   My application's logic was implemented in Java, and the GUI was developed in JavaFX, a java library that can be used to create both desktop and Rich      Internet Applications.

   ### Some challenges that I faced and features I hope to implement in the future :
   
   Some of the challenges that I faced while building this project were designing the JavaFX layout for my GUI due to the use of many Hboxes and Vboxes      in one another, designing a colour palette for my application, debugging my code while performing unit tests, and finally coming up with a regex          expression that takes whole numbers and decimal numbers.

   In the future, I'd like to add more functionalities to my project, such as an API that fetches the currencies directly rather than hard coding them,      as well as more than four currencies and unit lengths, and lastly more than two converters.

     
## Design

   ### Brief explanation behind the classes structure of the projects :
   
   The classes are divided into two sections: a currency converter and a length converter, both of which have the identical implementation. There are ten    classes in all, two abstract classes, and two interfaces.

   In the currency section, we can see that the abstract class Currency implements the ConvertCurrency interface, and that CAD, USD, YEN, and EURO are      all subclasses of Currency. There's also a class called CurrencyConverter, which takes a value and sets both currencies (the old and desired              currencies), then calls the appropriate convert method based on whatever currency was set as currency1 and converts it to the desired currency,        which in this case is currency2.

   Like I already said, both converter are implemented in the same way; the only difference is that instead of being currencies, they are units of          length.

       
## Class Diagram of my project (in UML)
![Screen Shot 2022-05-16 at 12 23 23 AM](https://user-images.githubusercontent.com/99833243/169211590-2e78a33b-a491-4530-8100-8a637d62a434.png)
   

## Javafx Design Layout
![Screen Shot 2022-05-18 at 4 50 59 PM](https://user-images.githubusercontent.com/99833243/169212911-2e81a61d-d689-46d2-a365-fb2ab7051148.png)


## Screenshots of the application
![Screen Shot 2022-05-19 at 12 45 29 AM](https://user-images.githubusercontent.com/99833243/169210922-1c02af3f-b9f2-445d-a106-7049835b12f1.png)
