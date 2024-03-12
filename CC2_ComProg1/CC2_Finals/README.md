# CC2 - FINALS

> [!NOTE]
> Programming Concepts: Loops, String Manipulation (String methods, StringBuilders), Arrays, Java methods
>
> **Total Programs: 19**

### Program List + Instructions

#### Looping

1. [Temperature Converter](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Looping/TemperatureConverter.java)
   - Java program for a simple temperature converter program. The program prompts the user to enter a temperature in Celsius, validates the input to ensure it is a valid double value, and then converts the Celsius temperature to Fahrenheit using the formula `(Celsius * 9/5) + 32`. The result is displayed to the user along with the original Celsius temperature. After each conversion, the program asks the user if they want to convert another temperature, and the process repeats until the user enters 'n' or 'N' to exit the program. The code includes error handling for invalid input to ensure that the user provides a valid numerical temperature value.
2. [Looping Calculator](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Looping/LoopCalculator.java)
   - Java simple calculator program that allows the user to perform basic arithmetic calculations in a loop. The program prompts the user to enter the first number, an arithmetic operator (+, -, \*, /), and the second number. It validates the input to ensure that the numbers are valid doubles and the operator is one of the supported arithmetic operators. The program then performs the corresponding calculation based on the operator, considering division by zero as an error. If the calculation is valid, the result is displayed to the user. The user is given the option to perform another calculation, and the loop continues until the user enters 'n' or 'N' to exit the program. The code includes error handling to manage invalid inputs and division by zero scenarios.
3. [Factorial Calculator](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Looping/Factorial.java)
   - Java program for calculating a factorial of a number. It prompts the user to enter a positive integer and calculates its factorial. The program validates the input to ensure that the user enters a valid positive integer. It uses a loop to calculate the factorial of the entered number iteratively. The result is then displayed to the user. After each calculation, the program asks the user if they want to calculate the factorial of another number. The loop continues until the user enters 'n' or 'N' to exit the program. The code includes error handling to manage invalid inputs and ensures that the user provides a positive integer.

#### String Manipulation (StringBuffer & StringBuilders)

1. [Scenario One](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/StringBuilders%20%26%20StringBuffer/ScenarioOne.java)

   - Task: Write a Java program that takes two strings as input and concatenates them. Print the length of the concatenated string.

2. [Scenario Two](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/StringBuilders%20%26%20StringBuffer/ScenarioTwo.java)

   - Task: Rewrite the concatenation program from Activity 1 using StringBuilder. Compare the performance with the previous implementation.

3. [Scenario Three](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/StringBuilders%20%26%20StringBuffer/ScenarioThree.java)

   - Task: Write a program that takes a string as input and extracts a substring from it. Allow the user to input the starting and ending indices for the substring.

4. [Lab Activity](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/StringBuilders%20%26%20StringBuffer/LabActivty.java)
   - Task: Write a Java program that outputs the same as the picture below.
   - ![lab activity](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/StringBuilders%20%26%20StringBuffer/images/lab%20activity.png)

#### Arrays

1. [Student Information](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Arrays/StudentInformation.java)

   - The provided Java code defines a program that manages information for a group of students. The information includes first names, middle initials, last names, ages, student numbers, and enrollment status. The program performs two activities:
     - //Activity 3.1: It iterates over the arrays of student information and prints details for each student, including their full name, age, student number, and enrollment status. This part provides a formatted display of individual student information.
     - //Activity 3.2: It prints the entire arrays for each category of student information, showcasing the data in a tabular format. This part provides a more concise view of the overall student information.
   - The code uses arrays to store information for multiple students, providing a structured way to organize and access the data. The two activities offer different perspectives on presenting the student information, catering to both individual details and an overview of the entire dataset. The program serves as a simple tool for managing and displaying student information in a Java console application.

2. [Sum of Array](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Arrays/Problem%20Sets/SumOfArray.java)

   - Java program that calculates the sum of elements in an array. The program prompts the user to enter the size of the array and then takes input for each element in the array. After populating the array, it calculates the sum of all elements and displays both the inputted array and the computed sum.

3. [Array Rotation](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Arrays/Problem%20Sets/ArrayRotation.java)

   - Java program that performs array rotation. The program initializes an array with values [1, 2, 3, 4, 5], prompts the user to input the number of rotations, and then rotates the array to the left by the specified number of positions. The original and rotated arrays are displayed to the user.

4. [Guessing Game](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Arrays/Problem%20Sets/GuessingGame.java)

   - Java program that represents a simple guessing game where the user is prompted to guess a randomly generated number between 1 and 100. The program utilizes a loop that continues until the user correctly guesses the number. After each guess, the program provides feedback on whether the correct number is higher or lower than the guessed number. Once the correct number is guessed, a congratulatory message is displayed, and the user is given the option to play again.

5. [Word Compressor](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Arrays/Problem%20Sets/WordCompressor.java)
   - Java program that implements a simple word compressor. The program takes an input string, in this case, "aabcccccaaa," and compresses it by replacing consecutive repeated characters with the character followed by the count of consecutive occurrences.

#### Quizzes

1. [Pin Code](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Quizzes/PinCode.java)
   - Java program that represents a simple PIN code authentication program for a bank. The program begins by setting a predetermined PIN ("012212") and initializes a counter for the number of attempts (tries). It prompts the user to enter their PIN and compares it with the predefined one. If the entered PIN matches, a welcome message is displayed along with an imaginary account balance of $1,000,000.00. If the PIN is incorrect, the program provides feedback and allows the user to try again. The user has up to three attempts, after which the program informs them that they have been locked out. The code ensures account security by limiting the number of incorrect attempts before locking the user out.
2. [Password Generator](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Quizzes/PasswordGenerator.java)
   - Java program to create a password based on user input. The program prompts the user to enter their first name, last name, birth year, and favorite color. It then constructs a password using a combination of the first three letters of the last name, the last two digits of the birth year, the first four letters of the first name, and the first letter of the favorite color. The generated password is converted to lowercase and displayed to the user. The password generation process is straightforward, and the resulting password is a combination of elements from the user's input, providing a personalized touch to the generated password.

#### Lab Exams

1. [Twitter System](https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Lab%20Exam/Twitter.java)

   - Java program that simulates a basic Twitter login system. It prompts the user to enter a username and password and checks if the provided credentials match those stored in predefined arrays. If a match is found, it logs the user in, displays a welcome message, and provides account profile information. The system allows a maximum of three login attempts before locking the user out.

2. [Matrix System](<https://github.com/sudo-paoo/mga-pakyu/blob/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Lab%20Exam%20(Free)/Matrix.java>)
   - Java program that implements a simple matrix system with various operations. The program allows users to perform operations like inputting elements into a matrix, displaying matrix elements, calculating the sum of all elements, displaying row-wise and column-wise sums, and creating the transpose of the matrix. The user can choose these operations from a menu until they choose to exit.

#### Methods

1. [Student Information System](https://github.com/sudo-paoo/mga-pakyu/tree/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Methods/Student%20Information%20System)
   - Java program that implements a basic Student Information System. The system allows users to perform various operations such as adding, editing, removing, and retrieving information about students. The user interacts with the system through a menu-driven interface.
2. [Lab Exam (Modified)](<https://github.com/sudo-paoo/mga-pakyu/tree/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Methods/Lab%20Exam%20(Modified)>)
   - Java program that simulates a simple Instagram login system. It prompts the user to enter a username and password, then checks the entered credentials against a database using the `Database` class. Users have three attempts to enter correct credentials before being locked out. The loop continues until the user successfully logs in or chooses to exit.
3. [Lab Exam (Free) (Modified)](<https://github.com/sudo-paoo/mga-pakyu/tree/736389f8aa89b2706531ecec7cf55b527de9b8ba/CC2_ComProg1/CC2_Finals/Methods/Lab%20Exam%20(Free)%20(Modified)>)
   - Java program that implements a simple matrix operations program using the `MatrixSystem` class. This program allows users to perform various operations on a matrix, such as inputting elements, displaying elements, calculating the sum of all elements, displaying row-wise sums, displaying column-wise sums, and creating the transpose of the matrix. The user interacts with the program through a menu-driven interface.
