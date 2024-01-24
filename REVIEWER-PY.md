# Chapter 1: Datatypes and Variables

## Variables

You are free to assign any name to a variable, provided it adheres to the following guidelines:

1. It can be only one word.

```python
# bad
my variable = 'Hello'

# good
var = 'Hello'
```

2. It can use only letters, numbers, and the underscore (`_`) character.

```python
# bad
%$@variable = 'Hello'

# good
my_variable = 'Hello'

# good
my_variable_2 = 'Hello'
```

3. It can’t begin with a number.

```python
# this wont work
19_var = 'hello'
```

4. Variable name starting with an underscore (`_`) are considered as “unuseful”.

```python
# _spam should not be used again in the code
_spam = 'Hello'
```

## Datatypes

```python
# integers
x = 10
# float
y = 1.123
# string
str1 = 'hello'
str2 = "world"
# Boolean
isEnrolled = True
```

# Chapter 2: Math Operators

## Math Operators

From **highest** to **lowest** precedence:

| Precedence | Operator | Description                   | Examples                                 |
| ---------- | -------- | ----------------------------- | ---------------------------------------- |
| 1          | ()       | Parentheses                   | `(2 + 3) * 4`                            |
| 2          | \*\*     | Exponentiation                | `2 ** 3`                                 |
| 3          | +x, -x   | Unary plus, Unary minus       | `+5`, `-7`                               |
| 4          | \*       | Multiplication                | `6 * 3`                                  |
| 4          | /        | Division                      | `10 / 2`                                 |
| 4          | //       | Floor division                | `13 // 5`                                |
| 4          | %        | Modulus                       | `15 % 4`                                 |
| 5          | +        | Addition, Subtraction         | `8 + 2`                                  |
| 5          | -        | Subtraction                   | `5 - 3`                                  |
| 10         | <        | Less than                     | `x < y`                                  |
| 10         | <=       | Less than or equal to         | `a <= b`                                 |
| 10         | >        | Greater than                  | `3 > 2`                                  |
| 10         | >=       | Greater than or equal to      | `10 >= 5`                                |
| 10         | !=       | Not equal                     | `x != y`                                 |
| 10         | ==       | Equal                         | `a == b`                                 |
| 10         | in       | Membership test - in          | `3 in [1, 2, 3]`                         |
| 10         | not in   | Membership test - not in      | `5 not in [1, 2, 3]`                     |
| 10         | is       | Object identity test - is     | `x is y`                                 |
| 10         | is not   | Object identity test - is not | `a is not b`                             |
| 11         | not      | Boolean NOT                   | `not True`, `not (5 > 3)`                |
| 12         | and      | Boolean AND                   | `True and False`, `(x > 0) and (y < 10)` |
| 13         | or       | Boolean OR                    | `True or False`, `(a == b) or (c != d)`  |

## Augmented Operators

| Operation        | Equivalent Expression      |
| ---------------- | -------------------------- |
| `variable += 1`  | `variable = variable + 1`  |
| `variable -= 1`  | `variable = variable - 1`  |
| `variable *= 1`  | `variable = variable * 1`  |
| `variable /= 1`  | `variable = variable / 1`  |
| `variable //= 1` | `variable = variable // 1` |
| `variable %= 1`  | `variable = variable % 1`  |
| `variable **= 1` | `variable = variable ** 1` |

### Examples

```python
greet = 'Hello'
greet += ' world!'
print(greet)
# Hello world!

number = 9
number += 1
print(number)
# 10

my_list = ['item']
my_list *= 3
print(my_list)
# ['item', 'item', 'item']
```

# Chapter 3: Comments

### 1. Inline Comments

```python
# this is inline comment
```

### 2. Multiline Comments

```python
# this is a
# multiline comment
# wEh?
```

### 3. Code with a comment

```python
name = "some name"  # initializing some name
```

- Please note the 2 spaces in front of the comment

### 4. Function Docstring

```python
def foo_bar():
    """
    This is a function docstring
    You can also use:
    ''' Function Docstring '''
    """
```

# Chapter 4: The print() function

The `print()` function outputs the values provided as its arguments, accommodating multiple arguments, floating-point quantities, and strings.

```python
print('Hello world!')
# Hello world!

n = 1
print('Hello world!', n)
# Hello world! 1
```

### The 'end' keyword

The `end` keyword argument provides the flexibility to either omit the newline character after the output or conclude the output with a different string. The default behavior, if not specified, is to end the output with a newline.

```python
str1 = 'hello'
str2 = 'world'
print(str1, end='-')
print(str2)
# hello-world
```

### The 'sep' keyword

The `sep` keyword specifies how to separate objects when there is more than one. If not specified, the default separator is a space.

```python
str1 = 'hello'
str2 = 'world'
print(str1, str2, sep=', ')
# hello, world
```

# Chapter 5: The input() function

The `input()` function in Python is a built-in function that allows the user to enter data from the keyboard. It reads a line of text entered by the user and returns that input as a string.

```python
name = input("Enter your name: ")
print("Hi,", name)
# Enter your name: Pao
# Hi, Pao
```

### 1. input() type casting to integer

```python
number = int(input("Enter a number: "))
print(number - 5)
print(type(number))
# Enter a number: 10
# 5
# <class 'int'>
```

### 2. input() type casting to float

```python
floating_number = float(input("Enter a number: "))
print(floating_number + 5)
print(type(floating_number))
# Enter a number: 1.2
# 6.2
# <class 'float'>
```

# Chapter 6: The len() function

Returns the integer value representing the number of characters in a string, list, dictionary, etc.:

```python
str1 = 'hello'
print(len(str1))
# 5
list1 = ['cat', 1, True]
print(len(list1))
# 3
```

> [!IMPORTANT]
> When checking for emptiness in strings, lists, dictionaries, etc., it is recommended to use direct boolean evaluation instead of relying on the `len` function.

### Test of emptiness example

```python
b = "Hello, World!"

# bad
if len(b) > 0:  # evaluates to True
    print("The string is not empty!")

# good
if b:  # evaluates to True
    print("The string is not empty!")

```

# Chapter 7: The str(), int(), float() functions

These functions enable the conversion of variable types. For instance, you can change a variable from an integer or float to a string:

```python
str(18)
# '18'

str(3.14)
# '3.14'
```

Or from `string` to `integer` or `float`

```python
>>> int('11')
# 11

>>> float('3.14')
# 3.14
```
