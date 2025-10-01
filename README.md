# School_Supplies_List_Manager-Program

School Supplies List Manager Using ArrayList--> 

Rina is preparing a list of school supplies she needs to buy for the upcoming school year.

Let's break this down with an example:

Rina starts with the following items on her list:
Notebooks
Pens
Eraser
Pencils
She adds items to her ArrayList, and as she buys them, she removes the purchased items from the list. At the end, she wants to see what school supplies are still left to buy. 1 <= n <= 100 (Number of school supplies)

After purchasing Pens and Eraser, she wants to remove them from her list. The remaining items will be:
Notebooks, Pencils.

Your Task:
Write a program that:
1. Adds school supplies to an ArrayList.
2. Removes purchased items from the list.
3. Prints the remaining items on the list.

Constraints:
The names of the items will contain only alphabetical characters and will have a length between 1 and 30.
Let's walk through a detailed example step-by-step to understand how to manage Rina's school supplies list using an ArrayList.

Input:
4
Notebooks Pens Eraser Pencils
2
Pens Eraser

Reading Input:
The first number 4 indicates that Rina has 4 school supplies on her list.
The next 4 items are Notebooks, Pens, Eraser, Pencils, representing the school supplies on her list.
The number 2 indicates that 2 items were purchased: Pens and Eraser.

Expected Output:
The remaining school supplies on Rina's list are:
Notebooks, Pencils

1) Sample Input
4
Notebooks Pens Eraser Pencils
2
Pens Eraser
Sample Output
Notebooks, Pencils

2) Sample Input
3
Markers Glue Scissors
1
Glue
Sample Output
Markers, Scissors
