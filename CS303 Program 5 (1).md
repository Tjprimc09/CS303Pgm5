# **Program 5: Stacks**

Group Assignment – 2-3 people to a group

**Doubly Linked Lists, Stacks, Functions, Conditionals and Loops**

**Skills Required**

* An understanding of the underlying data structures that support a stack structure  
* Ability to create a generic Stack interface using MyDblLinkedList class completed in class.  

**Objectives**

* You will be using methods to test 5 different applications of stacks. The lists to use for this testing are included in the classroom assignment (see below)  
* You **MUST WORK WITH A PARTNER** to complete the stack application methods for this project. 

**Requirements**

	To begin, you need to clone the repository provided.  The repository will be named:   
   		 github.com/UMKC-CS303/FA26Pgm5-***githubusername***

      This repository contains some starter code and the test cases to use for each stack application. You should have the MyDblLinkedList class completed as developed in lecture. 

       The Stack Class will have a “has-a” relationship with the MyDblLinkedList class and uses the following UML:

\-------------------------------------------  
\|                 MyStack\<E\>           	\|  
\---------------------------------------------  
\| \- list : MyDblLinkedList\<E\>      	\|  
\---------------------------------------------  
\| \+ push(item : E) : void              	\|  
\| \+ pop() : E                              	\|  
\| \+ peek() : E                             	\|  
\| \+ size() : int                           	\|  
\| \+ isEmpty() : boolean                   	\|  
\| \+ clear() : void                         	\|  
\| \+ stackString() : String                	\|  
\-------------------------------------------

      There will be NO credit awarded for this project for using built in Java classes for this assignment.

 **Stack Applications:** 

       As a team, you must implement each of the following methods using your Stack class and write the output to a report file:

1. Palindrome   
2. Postfix Evaluator  
3. Prefix Evaluator  
4. Balanced Parenthesis  
5. Decimal to Binary  
6. Undo/Redo Command Processor

   
**Final Checks:**

* Verify that each of your functions are operating as expected before continuing.    Make sure the output is neat and orderly. Include PRE and POST conditions for each function\!  
* Cite your sources\!\!

**Testing:**

* Verify your program produces results that are in line with those provided in the rubric below.

**Submission:**

1. First – make sure changes you have made have been committed to GitHub\!    
   Each student should submit the whole project but must indicate which items they were responsible for in the identifying information in Main.java.   
     
2. Due to challenges inherent with groups & schedules, no video is required for this assignment.

   

   

   

   

   

   

   

   

   

   

   

   

   

 


**PROGRAM 5: GRADING RUBRIC & TESTING SCRIPT**

| OBJECTIVE | DESCRIPTION | RESULTS EXPECTED | POINTS\* |
| :---- | :---- | :---- | ----- |
| **1\. Accuracy** | The output produced matches the expected output  Each team member must complete 3 items   20 points each | **STACK 1: PALINDROME** tacocat   is a palindrome: true  bubba      is a palindrome: false  a                is a palindrome: true  mom         is a palindrome: true  abba        is a palindrome: true  abccba    is a palindrome: true  abcba      is a palindrome: true  **STACK 2: POSTFIX EVALUATOR** The result of the postfix expression: 5 7 \* 15 \+ 25 \*      \= 1250  The expression: 5 0 / 4 \+ is invalid. The result of the postfix expression: 15 2 \* 3 / 15 \+      \= 25    The result of the postfix expression: 3 5 7 \+ \*               \= 36    The expression: 3 5 6 is invalid. **STACK 3: PREFIX EVALUATOR** The result of the prefix expression: \+ \* 7 5 \+ 6 7         \= 48    The result of the prefix expression: \- \+ 7 \* 4 5 \+ 2 0    \= 25    The result of the prefix expression: \- / 18 / 6 3 2         \= 7     The result of the prefix expression: \* 25 \+ 15 \* 7 5      \= 1250  The result of the prefix expression: \+ 4 / 0 5                \= 4     The result of the prefix expression: \+ 15 / 3 \* 2 15      \= 15    The result of the prefix expression: \* \+ 7 5 3                \= 36    The expression: 6 5 3 is invalid. **STACK 4: PARENTHESIS IS BALANCED EVALUATOR** The expression \[7 \+ (4 \- 3)\] \- (3 \* 4\)   is balanced The expression \[7 \+ (4 \- 3\] \- (3 \* 4\)    is not balanced The expression 4 \+ 6 \- 7                     is balanced The expression (\[x \+ y\] \+ {z \* w})       is balanced The expression {(1 \+ \[2 \* 3\]) \- 4}        is balanced The expression (\[x \+ y\] \+ z}                is not balanced **STACK 5: DECIMAL TO BINARY EVALUATOR** The decimal value 15    is 1111             in binary The decimal value 81    is 1010001       in binary The decimal value 105   is 1101001      in binary The decimal value 255   is 11111111    in binary The decimal value 256   is 100000000  in binary The decimal value 0     is 0                    in binary The decimal value 1     is 1                    in binary  **STACK 6: UNDO/REDO FUNCTIONS**  NOTE: D \= Do, R \= Redo, U \= Undo, Q \= Quit Input commands on the left and the result is on the right D  add  a D  add b D  add c R  U   U   R   U  D  add d  U   U   U R F   Q     | **/60**       |
| **2\.  Style** |  | Code contains completed stack class as discussed in class | **/10** |
|  | Code is well organized  & easy to read  | Related code is grouped logically  Code is not redundant and was thoughtfully designed  Variable names are meaningful Comments are included to explain code (PRE/POST) | **/10** |
| **TOTAL**   | ADDITIONAL COMMENTS: |   | **/80** |

 **POINTS\***

Points assigned are partially subjective, but you can expect points assigned as follows:

| 0 | 1 | 2 | 3 | 3     (3 point scale) |
| :---- | :---- | :---- | :---- | :---- |
| 0 | 1 | 2 \- 3 | 4 | 5     (5 point scale) |
| 0 | 1-5 | 6 – 7 | 8-9 | 10   (10 point scale) |
| 0 | 1-10 | 12-14 | 15-19 | 20   (20 point scale) |
| No evidence of meeting this requirement | Evidence of requirement, but working at a substandard level  (code is present, but does not compile, for example) | Evidence of requirement, partially working  (code is present, some values work, but other values cause an abend for example)  | Requirement is predominantly met, but has some small issues   (code is present and runs, but output is not completely correct, for example)   | Requirement is fully met and functioning |

