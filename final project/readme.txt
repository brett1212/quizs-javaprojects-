----------------------------------------------------------------------
Introduction
----------------------------------------------------------------------

In this project,we would be implementing an exam question bank.
The exam question bank (multiple choice and true/false questions), 
is to select a given number of question randomly from the bank based
on the type and number of questions the user requested.  
We also stored the multiple choice (four of the possible solutions) 
as well as the correct solution for the particular question. 
A minimum of 75 questions is stored with this program but the user 
can update the question bank at anytime within the text file.




----------------------------------------------------------------------
Group members
----------------------------------------------------------------------
Brett Andrews
Isiah Emmanuel


----------------------------------------------------------------------
Contents
----------------------------------------------------------------------
MC.txt contains multiple choice questions
tf.txt contains true and false questions
test.txt contains random generated questions
Ans.txt contains the answers for the random gerated questions


----------------------------------------------------------------------
Usage
----------------------------------------------------------------------


This progarm when open, prompts the user to enter a "type" meaning multiple or true and false 
question and a amount.When the user clicks generate the program randomly pulls questions from either a true and false question
bank or multiple choice question bank and displays it. the program also generates a text file named test
and a file named Ans so that the questions and answers can be printed separately.
if for some reason questions or answers need to be changed or deleted or even added you can do so by 
following the correct format that is explained below.



----------------------------------------------------------------------
Format for multiple choice questions:
----------------------------------------------------------------------

question
a
b
c
d
Answer

----------------------------------------------------------------------
Format for true and false questions
----------------------------------------------------------------------
question
true
or
false
?
answer


----------------------------------------------------------------------
Requirements:
----------------------------------------------------------------------
Java 1.8 or higher




