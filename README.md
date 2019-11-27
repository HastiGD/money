# money
This project contains the Java source code required to generate Money objects--objects which encapsulate the concept of money, i.e. dollar value and cents value. The driver performs operations on the Moneys such as the addition, subtraction, and multiplication. For this project I used a different approach called test driven design, or TDD. TDD involves writing the test code and the program simultaneously such that when the program has been written in entirety a complete test suite has also been generated. Therefore in this project you will also find a MoneyTestSuite class for the Money class. In the current version of the system the user must specify Money values in the source code of the driver. In future versions I would like to remove any interaction between the code and the user to preserve the integrity of the code. To accomplish this I will create a Money factory which will generate Money objects to be passed to the driver, and the values of the Moneys can be specified by the user in a text document in hopes of increasing versatility and improving security of my system. In this repository you will find a basic factory class that can create Moneys from a plain text file. The classes described in this repositories are summarized below:

Repository: money

  - Money.java              // definition
  - MoneyTestSuite.java     // test suite
  - MoneyTester.java        // driver
  - ReadFromFile.java       // factory
