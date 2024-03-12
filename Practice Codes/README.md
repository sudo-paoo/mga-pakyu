# PRACTICE CODES

### CC2 Java to Python

#### Midterms

1. Calculator
    - This Python script implements a basic calculator with a console-based user interface. It prompts the user to input two numbers and an operator (+, -, *, /, %), performs the corresponding operation, and displays the result. The script includes error handling for division by zero in the cases of the division and modulo operators. The use of the match statement (introduced in Python 3.10) enhances readability by handling different cases for each operator.

2. Employee Information
    - This Python script calculates and displays an employee's payslip information based on user input. It incorporates constants for standard deductions such as SSS, PhilHealth, Pag-IBIG, and a fixed tax rate. The script prompts the user to input personal and salary details and then computes the total deductions, as well as the net pay. The final payslip information is displayed in a clear format. 

3. Soda Vending Machine
    - This Python script simulates a soda vending machine, allowing the user to choose from a selection of sodas with corresponding prices. The user inputs their budget, selects a soda, and specifies the quantity. The script then calculates the total cost and provides a receipt. It checks if the budget is sufficient, displays the balance, and issues a thank-you message. The use of the match statement (introduced in Python 3.10) enhances readability by handling different cases for each soda choice.

4. Facebook
    - This Python script simulates a basic login/signup system for a simplified Facebook interface. Users can choose to log in or sign up, with admin credentials predefined for logging in. The script utilizes the match statement (introduced in Python 3.10) for handling different cases for login and signup. After successful login or signup, it displays a basic profile.

#### Finals

##### Looping
1. Calculator
    - This Python script implements a calculator with basic arithmetic operations (+, -, *, /, %) and incorporates error handling. The user is prompted to enter two numbers and an operator. The script checks for valid numeric inputs and a valid operator. It then performs the calculation and displays the result, handling division by zero errors for both division and modulo operations. The user has the option to exit or continue calculating.

2. Factorial
    - This Python script is a simple console-based factorial calculator. The user is prompted to enter a number to calculate its factorial. The calculation is performed using a loop, and the result is displayed. The user can enter -1 to exit the program. The script includes a check for negative numbers since factorial is not defined for negative integers. 

3. Multiplication Table
    - This Python script generates a multiplication table for a specified range and table number. The user is prompted to input the starting and ending numbers for the multiplication table, as well as the table number. The script then prints the multiplication table for the specified range. 

4. Temperature Converter
    - This Python script converts temperatures from Celsius to Fahrenheit in a console-based environment. The user is prompted to enter a temperature in Celsius, and the script converts it to Fahrenheit. The conversion formula is applied, and the result is displayed. The user has the option to continue converting temperatures or exit the program. 

##### Lists
1. Student Information
    - This Python script displays information about a list of students. It utilizes separate lists for first names, middle initials, last names, ages, student numbers, and enrollment status. The script iterates through the lists, printing detailed information for each student, including their full name, age, student number, and enrollment status

2. Guessing Game
    - This Python script is a simple console-based guessing game. The program generates a random number between 1 and 100, and the user is prompted to guess the number. Feedback is provided after each guess, indicating whether the correct number is higher or lower. The game continues until the user correctly guesses the number. The user can choose to play again or exit the game. 

3. Sum of Array
    - This Python script calculates the sum of elements in an array. The user is prompted to enter the size of the array and input individual numbers. The script demonstrates two ways to calculate the sum: using the built-in sum() function and using a for loop. The results are displayed for both methods.

4. Word Compressor
    - This Python script compresses a given word by representing consecutive repeated characters with the character itself followed by the count of repetitions. The example provided compresses the word "aabccccaaa" to "a2b1c4a3". The script iterates through the input word, counts consecutive repetitions, and builds the compressed word accordingly. The original and compressed words are then displayed. 

##### Quizzes
1. Pin Code
    - This Python script simulates a simple PIN verification system for a bank. The user has three attempts to enter the correct PIN, and after three incorrect attempts, the user is locked out. The correct PIN is set as "012212." If the entered PIN matches the correct one, the user is welcomed, and the account balance is displayed. If the maximum number of attempts is reached, the user is notified of being locked out.

2. Password Generator
    - This Python script generates a password based on user input. The user is prompted to enter their first name, last name, birth year, and favorite color. The script then creates a password by combining the first three letters of the last name, the last two digits of the birth year, the first four letters of the first name, and the first letter of the favorite color. The generated password is displayed in lowercase. 

##### Exam
1. Twitter
    - This Python script simulates a basic Twitter-like login system. It prompts the user to enter a username and password and checks them against predefined credentials. Users have three attempts to log in, and after three unsuccessful attempts, they are locked out. If the login is successful, the user's profile information is displayed.

2. Matrix (Free Section)
    - This Python script simulates a basic Java matrix system, allowing users to perform various operations on matrices. Users can input matrix elements, display the elements, calculate the sum of all elements, display row-wise and column-wise sums, and create the transpose of the matrix. The script provides a menu-driven interface for these operations, and users can exit the system by entering '0'. 

##### Methods
1. Instagram (Exam)
    - This Python script simulates a simple Instagram-like login system using a class-based database. The `Database` class contains static lists for usernames, passwords, and full names. The `get_info` method is used for login verification, checking the entered username and password against the stored credentials. The main script creates an instance of the `Database` class and runs a loop to prompt the user for login credentials. The login system displays the account profile if the credentials are correct, and it allows three attempts before locking the user out.

2. Student Information System
    - This Python script implements a basic Student Information System using separate modules (`main.py` and `StudentDatabase.py`). The system allows users to add, edit, remove, and retrieve information about students. The main menu provides options for these operations. The student data is stored in separate lists within the `StudentDatabase` module.

### Data Validation (Python)
1. Empty Validation
  - This Python script prompts the user to input a string, ensuring the input is not empty. It utilizes a while loop to repeatedly prompt the user until a valid non-empty string is provided. The script then prints and confirms the entered string.

2. Length Validation
  - This Python script prompts the user to input a password, enforcing a maximum length of 16 characters. It utilizes a while loop to repeatedly prompt the user until a valid password length (non-empty and <= 16 characters) is provided.

3. Membership Validation
  - This Python script prompts the user to input a color and checks if it is in the predefined list of colors. It utilizes a while loop to repeatedly prompt the user until a valid color is provided. The script then confirms whether the entered color is available in the predefined list.

4. Number Validation
  - This Python script prompts the user to input a number, handling potential errors if the input is not a valid integer. It utilizes a try-except block to catch ValueError and prompts the user to try again until a valid integer is provided. Once a valid number is input, the script confirms and displays the entered number. 

5. Range Validation
  - This Python script prompts the user to input a number and checks if it falls within a specified range. It uses a try-except block to handle potential ValueError for non-numeric input, and a subsequent check ensures that the entered number is within the defined range (min to max). The script continues to prompt the user until a valid number within the specified range is provided.

### Java Swing

1. Calculator GUI

- This Java application, implemented in the CalcuGUI class, functions as a graphical calculator allowing users to perform basic arithmetic operations. Users input two numbers, choose an operator (+, -, \*, /, %) from a dropdown menu, and receive instant results displayed on the GUI. The application includes input validation and handles special cases such as division by zero.

2. Employee Payslip GUI

- This Java application, represented by the Payslip class, automates the process of generating employee payslips based on user input. The program calculates deductions such as Social Security System (SSS), PhilHealth, Pag-IBIG, and income tax. It then displays the payslip information using a graphical user interface (GUI).

3. Click Counter GUI

- This Java application, named "Click Counter," tracks the number of button clicks in a Swing GUI. The interface includes a non-resizable JFrame with a banner, a "Click me" button, and a label displaying the click count, which updates with each button click.

4. Facebook GUI

- This Java application simulates a basic user profile system with login functionality. The program utilizes a predefined profile database, allowing users to log in with their credentials and view their profiles. The application provides a graphical user interface (GUI) for a seamless user experience.

5. Facebook with signup GUI

- This Java application simulates a basic user profile system with login and signup functionalities. The program utilizes a predefined profile database, allowing users to log in with their credentials and view their profiles. The users can also create a new account with then will be added on the profile database. The application provides a graphical user interface (GUI) for a seamless user experience.

6. FileReader and FileWriter

- This Java program copies the content of a file specified by "path-to-file" to a new file specified by "path-to-new-file." It reads the input file line by line using a Scanner and writes the content to the new file using a FileWriter.

7. Guessing Game GUI

- This Java application offers a user-friendly guessing game experience with a graphical interface. Users input guesses through a text field, and the program provides instant feedback on correctness, making it an engaging and straightforward gaming interaction.

8. Student Information System GUI

- This Java application presents a Student Information System (SIS) with a user-friendly graphical user interface (GUI). The system enables users to perform fundamental operations such as adding, updating, and deleting student records.

9. Temperature Converter GUI

- This is a simple Java Swing application for converting temperatures between Celsius, Fahrenheit, and Kelvin. The application includes a graphical user interface (GUI).