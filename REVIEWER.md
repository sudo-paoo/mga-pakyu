<h1 align="center">Java Cheatsheet</h1>
# Basics

Basic syntax and functions from the Java programming language.

---

## Showing Output

```java
public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Hello World");
	}
}
```

## Taking Input

The `Scanner` class in Java provides methods to read input for various primitive data types. Here are some of the commonly used methods for primitive types along with examples:

1. **`nextBoolean()`:** Reads the next token as a boolean.

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a boolean value (true/false): ");
   boolean inputBoolean = scanner.nextBoolean();
   ```

2. **`nextByte()`:** Reads the next token as a byte.

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a byte value: ");
   byte inputByte = scanner.nextByte();
   ```

3. **`nextShort()`:** Reads the next token as a short.

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a short value: ");
   short inputShort = scanner.nextShort();
   ```

4. **`nextInt()`:** Reads the next token as an int.

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter an integer value: ");
   int inputInt = scanner.nextInt();
   ```

5. **`nextLong()`:** Reads the next token as a long.

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a long value: ");
   long inputLong = scanner.nextLong();
   ```

6. **`nextFloat()`:** Reads the next token as a float.

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a float value: ");
   float inputFloat = scanner.nextFloat();
   ```

7. **`nextDouble()`:** Reads the next token as a double.

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a double value: ");
   double inputDouble = scanner.nextDouble();
   ```

8. **`next()`:** Reads the next token as a string.

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter a string: ");
   String inputString = scanner.next();
   ```

## Primitive Datatypes

| Data Type | Size (bits) | Default Value | Example Range          |
| --------- | ----------- | ------------- | ---------------------- |
| `boolean` | 1           | `false`       | `true` or `false`      |
| `byte`    | 8           | `0`           | -128 to 127            |
| `short`   | 16          | `0`           | -32,768 to 32,767      |
| `int`     | 32          | `0`           | -2^31 to 2^31 - 1      |
| `long`    | 64          | `0L`          | -2^63 to 2^63 - 1      |
| `float`   | 32          | `0.0f`        | Approximately ±3.4E38  |
| `double`  | 64          | `0.0`         | Approximately ±1.7E308 |
| `char`    | 16          | `\u0000`      | 0 to 65,535 (Unicode)  |

## Comments

```java
// this is a single line comment

/* It's a
multi-line
comment
*/

/* It's a
* javadoc
* comment
*/
```

## Constants

Constants resemble variables, with the distinction that their value remains constant throughout the entire program execution.

```java
public class Constants {
	public static void main(String[] args) {
		final double PI = 3.14;
		System.out.println(PI);
	}
}
```

## Arithmetic Expressions

These are the collection of literals and arithmetic operators.

### Addition

```java
int result = a + b;
```

### Subtraction

```java
int result = a - b;
```

### Multiplication

```java
int result = a * b;
```

### Division

```java
int result = a / b; // Integer division
double result = (double) a / b; // Floating-point division
```

### Modulus

```java
int result = a % b;
```

## Augmented Operators

### Addition Assignment

```java
a += b; // Equivalent to: a = a + b;
```

### Subtraction Assignment

```java
a -= b; // Equivalent to: a = a - b;
```

### Multiplication Assignment

```java
a *= b; // Equivalent to: a = a * b;
```

### Division Assignment

```java
a /= b; // Equivalent to: a = a / b;
```

### Modulus Assignment

```java
a %= b; // Equivalent to: a = a % b;
```

## Escape Sequences

It is a sequence of characters starting with a backslash, and it doesn't represent itself when used inside string literal.

### Tab

It gives a tab space

```java
System.out.print("\t");
```

### Backslash

It adds a backslash

```java
System.out.print("\\");
```

### Single quote

It adds a single quotation mark

```java
System.out.print("\'");
```

### Question mark

It adds a question mark

```java
System.out.print("\?");
```

### Double quote

It adds a double quotation mark

```java
System.out.print("\"");
```

## Decision Statements

Conditional statements are used to perform operations based on some condition.

### if Statement

```java
if (condition) {
// block of code to be executed if the condition is true
}
```

### if-else Statement

```java
if (condition) {
// If condition is True then this block will get executed
} else {
// If condition is False then this block will get executed
}
```

### if else-if Statement

```java
if (condition1) {
// code here
}
else if(condition2) {
// code here
}
else if (condition3) {
// code here
}
else {
// code here
}
```

### Ternary Operator

It is shorthand of an if-else statement.

### Syntax

```java
variable = (condition) ? expressionTrue : expressionFalse;
```

### Example

```java
int x = 5;
int y = 10;
int result = (x > y) ? x : y;
```

### Switch Statements

It allows a variable to be tested for equality against a list of values (cases).

```java
public class SwitchExample {
    public static void main(String args[]) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
```

## Looping

### 1. for Loop:

- •A concise format in which to execute loops

```java
for (int i = 0; i < 10; i++) {
	// Loop body
}
```

### 2. while Loop:

- Loop-controlling Boolean expression is the first statement

```java
int i = 0;
while (i < 10) {
	// Loop body
	i++;
}
```

### 3. do-while Loop:

- Loop-controlling Boolean expression is the last  statement

```java
int i = 0; do {
	// Loop body
	i++;
} while (i < 10);
```

### 4. Enhanced for Loop (for-each):

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
	// Loop body
}
```

### 5. Infinite Loop:

```java
while (true) {
	// Loop body
}
```

### 6. Loop Control Statements:

- break:

```java
for (int i = 0; i < 10; i++) {
	if (i == 5){
		break; // Exit the loop
	}
}
```

- continue:

```java
for (int i = 0; i < 10; i++) {
	if (i == 5){
		continue; // Skip the rest of the loop body and continue with the next iteration
	}
}
```

## Arrays

### 1. Declaration and Initialization:

```java
// Declaration
int[] numbers;
// Initialization (with size)
numbers = new int[5];
// Declaration and Initialization in one line
int[] numbers = new int[5];
```

### 2. Initialization with Values:

```java
// Declaration and Initialization with values
int[] numbers = {1, 2, 3, 4, 5};
```

### 3. **Accessing Elements:**

```java
int[] numbers = {1, 2, 3, 4, 5};
// Accessing elements
// NOTE: use index and index always start in 0
int firstElement = numbers[0]; // 1
int thirdElement = numbers[2]; // 3
```

### 4. Updating Elements:

```java
int[] numbers = {1, 2, 3, 4, 5};
// Updating elements numbers[1] = 10;
```

### 5. Array Length:

```java
int[] numbers = {1, 2, 3, 4, 5};
// Array length
int length = numbers.length; // 5
```

### 6. Iterating Through an Array:

```java
int[] numbers = {1, 2, 3, 4, 5};
// Using a for loop
for (int i = 0; i < numbers.length; i++) {
	// printing each element:
	System.out.println(numbers[i]);
}
// Using an enhanced for loop (for-each)
for (int num : numbers) {
	// printing each element:
	System.out.println(num);
}
```

### 7. Overriding an element

```java
int[] numbers = {1, 2, 3, 4, 5};
numbers[0] = 6; // since numbers[0] is not null, 1 will be overwritten by 6
System.out.println(numbers[0]); // 6
```

### 8. Adding an element

```java
int arrOld[] = {22, 13, 15, 37, 49};
int n = arrOld.length;
int arrNew[] = new int[n + 1];
int value = 20;
for (int a = 0; a < n; a++) {
	arrNew[a] = arrOld[a]; // copies old array data to new array
}
arrNew[n] = value; // adding the new value
```

### 9. Deleting an element

```java
// import java.util.Arrays;

int arrOld[] = {22, 13, 15, 37, 49}; int n = arrOld.length; int indexRem = 2; // value is 15
System.out.println("This is the old array:" + Arrays.toString(arrOld));
int arrNew[] = new int[n - 1];
for (int a = 0, k = 0; a < n; a++) {
	if (a != indexRem) {
		arrNew[k] = arrOld[a]; // copies old array data to new array k++;
	}
}
System.out.println("This is the new array:" + Arrays.toString(arrNew));
```

### 10. Inserting an element

```java
// import java.util.Arrays;

int arrOld[] = {22, 13, 15, 37, 49}; int n = arrOld.length; int newVal = 18; // value is 18
int indexPos = 2; // index is 2
System.out.println("This is the old array:" + Arrays.toString(arrOld));
// Shifting values to make room for the new value
for (int a = n - 1; a > indexPos; a--) {
	arrOld[a] = arrOld[a - 1];
}
// Assigning the new value to the specified position
arrOld[indexPos] = newVal;
System.out.println("This is the new array:" + Arrays.toString(arrOld));
```

### 8. Multidimensional Arrays:

```java
// 2D Array Declaration and Initialization
int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
// Accessing elements in a 2D array
int element = matrix[1][2]; // 6
```

## Using Methods, Classes, and Objects

## Class

- A `class` in object-oriented programming (OOP) is a blueprint for creating objects. It defines the properties (attributes/fields) and behaviors (methods) that objects of that class will have, serving as a template for object creation.
- Classes are user-defined data types that act as the blueprint for individual objects, attributes and methods.

### Structure of Class

```java
public class ClassName {
    // Fields (Attributes/Properties)
    dataType fieldName1;
    dataType fieldName2;
    // Constructors
    public ClassName() {
        // Default constructor
    }
    public ClassName(dataType param1, dataType param2) {
        // Parameterized constructor
        // Initialize fields with parameters
    }
    // Methods (Behaviors)
    returnType methodName1() {
        // Method body
        // Optionally return a value
    }
    returnType methodName2(dataType param1, dataType param2) {
        // Method body
        // Optionally return a value
    }
    // Additional methods...
}
```

## Instance

- Creating an instance (object) of a class in Java involves using the `new` keyword along with a constructor. Here's an example of how you create an instance of a class:

### Example: `Person` class:

```java
public class Person {
	// Fields
	String name;
	int age;
	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// Method
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	// Getter methods (Optional)
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
```

Now, you can create an instance of the `Person` class in another class or the main method:

```java
public class Main {
	public static void main(String[] args) {
	// Creating an instance of the Person class
	Person person1 = new Person("John Doe", 25);
	// Accessing fields and calling methods
	person1.displayDetails();
	// fields using getter methods (Optional)
	String person1Name = person1.getName();
	int person1Age = person1.getAge();
	// Displaying information obtained from the instance
	System.out.println("Person 1 Name: " + person1Name);
	System.out.println("Person 1 Age: " + person1Age);
	}
}
```

##### Explanation:

1. `Person person1 = new Person("John Doe", 25);`: This line creates a new instance of the `Person` class named `person1`. The `new` keyword is used to allocate memory for the object, and the constructor is called to initialize its fields.
2. `person1.displayDetails();`: This line calls the `displayDetails` method of the `person1` object, which prints the name and age to the console.
3. `String person1Name = person1.getName();`: This line calls the `getName` method to retrieve the name of the `person1` object.
4. `int person1Age = person1.getAge();`: This line calls the `getAge` method to retrieve the age of the `person1` object.

## Attributes

- `Attributes`, also called fields or member variables in a class, embody the data or state linked to objects instantiated from that class. They define the characteristics or properties of an object and can have diverse data types like int, String, Boolean, etc.

### Instance Variables

- Instance variables in Java, also known as member variables or fields, are attributes that belong to each instance (object) of a class. They represent the state of the object and are declared within the class but outside of any method, constructor, or block.

```java
public class ClassName {
    // Instance variables
    public String firstName;
    String lastName;
    private int age;
}
```

### Static Variables

- a static variable, also known as a class variable, is a variable that belongs to the class itself rather than to any instance (object) of the class. This means that there is only one copy of a static variable shared among all instances of the class.

```java
public class MyClass {  
	private String firstName, lastName;
	private int age;
	// static variable
	public static int numberOfCars = 0; 
	public void PrintInfo() {
		System.out.println("Age: "+ age);
   }
}
```

### Local Variables

- Known only within boundaries of method
- Each time method executes
  - Variable redeclared
  - New memory location large enough to hold type set up and named

```java
public class MyClass {  
	private String firstName, lastName;
	private int age;
	public void PrintInfo() {
		// local variable
		String fullName = firstName + " " +  lastName;
		System.out.println("Full Name: " + fullName);
   }
}
```

## Methods

- `Methods` are functions that are defined inside a class that describe the behaviors of an object. Each method contained in class definitions starts with a reference to an instance object. Additionally, the subroutines contained in an object are called instance methods.

```java
public class ClassName {
    // Constructor method(s)
    public ClassName() {
        // Default constructor
        // Initialization code for attributes
    }
    public ClassName(DataType param1, DataType param2) {
        // Parameterized constructor
        // Initialization code using parameters
    }
}
```

### Method Declaration:

```java
// Method without parameters and return type
void greet() {
	System.out.println("Hello, there!");
}
// Method with parameters and return type
int add(int a, int b) {
	return a + b;
}
```

### Calling a Method:

```java
// Calling a method without parameters
greet();
// Calling a method with parameters
int sum = add(5, 3);
System.out.println("Sum: " + sum);
```

### Return Type:

```java
// Method with no return type (void)
void displayMessage() {
	System.out.println("This is a simple message.");
}
// Method with a return type
double multiply(double x, double y) {
	return x * y;
}
```

### Parameters:

```java
// Method with parameters
void greet(String name) {
	System.out.println("Hello, " + name + "!");
}
// Method with multiple parameters
void printDetails(String name, int age) {
	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
}
```

### Method Overloading:

```java
// Method Overloading
int add(int a, int b) {
	return a + b;
}
double add(double a, double b) {
	return a + b;
}
```

### Static Methods:

```java
// Static method
static void staticMethod() {
	System.out.println("This is a static method.");
}
```

### Recursive Methods:

```java
// Recursive method
int factorial(int n) {
	if (n == 0 || n == 1) {
		return 1;
	}
	return n * factorial(n - 1);
}
```

### Access Modifiers:

```java
// Public method
public void publicMethod() {
	System.out.println("This is a public method.");
}
// Private method
private void privateMethod() {
	System.out.println("This is a private method.");
}
```

## Object

- `object` is a fundamental building block of a class. It is a concrete instance of a class that represents real-world entities, possessing both state (attributes or fields) and behavior (methods).

```java
public class Car {
    // Instance variables
    private String brand;
    private String model;
    private int year;
    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022);
        // Calling a method on the object
        myCar.displayInfo();
    }
}
```

##### Explanation:

- The `Car` class has instance variables (`brand`, `model`, `year`), a constructor to initialize these variables, and a method (`displayInfo`) to display car information.
- In the `main` method, an object of the `Car` class named `myCar` is created using the `new` keyword and the constructor. The values "Toyota", "Camry", and 2022 are passed as arguments.
- The `displayInfo` method is then called on the `myCar` object to print the car information to the console.
