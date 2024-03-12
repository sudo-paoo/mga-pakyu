print("----------------------")
print("| Java Matrix System |")
print("----------------------")
print()

rows = int(input("Enter number of row: "))
column = int(input("Enter number of column: "))
matrix = []

while True:
    print(
        """
Matrix Operations Menu:
[1] Input elements into matrix
[2] Display elements in matrix
[3] Sum of all elements in matrix
[4] Display row-wise sum
[5] Display column-wise sum
[6] Create transpose of matrix
[0] Exit"""
    )

    choice = int(input("Enter your choice: "))

    match choice:
        case 1:
            print("-------------------------")
            print("| Enter matrix elements |")
            print("-------------------------")
            for i in range(rows):
                row = []
                for j in range(column):
                    add_to_matrix = int(
                        input(f"Enter element at position [{i}][{j}]: ")
                    )
                    row.append(add_to_matrix)
                matrix.append(row)
        case 2:
            print("-------------------")
            print("| Matrix Elements |")
            print("-------------------")
            for i in range(len(matrix)):
                for j in range(len(matrix[i])):
                    print(str(matrix[i][j]), end="\t")
                print()
        case 3:
            print("------------------------------")
            print("| Sum of All Matrix Elements |")
            print("------------------------------")
            sum_matrix = 0
            for i in range(len(matrix)):
                for j in range(len(matrix[i])):
                    sum_matrix += matrix[i][j]

            print("Sum of all elements in matrix:", sum_matrix)
        case 4:
            print("----------------------------")
            print("| Row-wise Sum of Elements |")
            print("----------------------------")
            for i in range(len(matrix)):
                row_sum = 0
                for j in range(len(matrix[i])):
                    row_sum += matrix[i][j]
                print(f"Row {i} sum:", row_sum)
        case 5:
            print("-------------------------------")
            print("| Column-wise Sum of Elements |")
            print("-------------------------------")
            for j in range(len(matrix[0])):
                column_sum = 0
                for i in range(len(matrix)):
                    column_sum += matrix[i][j]
                print(f"Column {j} sum:", column_sum)
        case 6:
            print("-----------------------------")
            print("| Transpose Matrix Elements |")
            print("-----------------------------")
            transpose_matrix = []
            for i in range(column):
                row = []
                for j in range(rows):
                    row.append(matrix[j][i])
                transpose_matrix.append(row)
            for i in range(len(transpose_matrix)):
                for j in range(len(transpose_matrix[i])):
                    print(transpose_matrix[i][j], end="\t")
                print()
        case 0:
            print("Exiting the Matrix System. Goodbye!")
            break
        case _:
            print("Invalid choice. Please enter a valid option.")
