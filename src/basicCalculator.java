/*Program designed to make simple calculation including, +, -, *, /, and random number generator between users desired range.
Added option to continue making calculations from menu option*/

import java.util.Scanner;
import java.util.Random;

class Main {

public static void main(String[] args) {
//int fail = 0;
while(true) { // continues menu until choice 6
System.out.print("\nMenu\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Generate Random Number\n6. Quit \nWhat would you like to do?"); // Prints menu to screen
Scanner input = new Scanner(System.in); // user input
int choice = input.nextInt();

if(choice < 1 || choice > 6) // invalid choice if less than one and or greater than 6

System.out.printf("I'm sorry, %d was not one of the options", choice);
//fail++;

else if (choice == 6) {
System.out.print("Goodbye!");
System.exit(0);
/* } else {
if (fail==3){
    System.out.printf("try again later"); 
    break;   
}*/
}else{
if(choice == 5)
{

System.out.print("\nWhat is the lower limit? ");
double lower = input.nextInt(); // user inputs lower value
System.out.print("What is the upper limit? ");
double upper = input.nextInt(); // user inputs upper value
Random r = new Random();
System.out.print("Answer: "+ (lower + (upper - lower) * r.nextDouble())); // This gives a random integer between lower value and upper value.

}
else
{    

System.out.print("\nWhat is the first number? ");
double one = input.nextInt();
System.out.print("What is the second number? ");
double two = input.nextInt();
if(choice == 1)
System.out.print("Answer: "+(one+two)); //prints out added numbers

else if(choice == 2)
System.out.print("Answer: "+(one-two)); //prints out subtracted numbers

else if(choice == 3)
System.out.print("Answer: "+(one*two)); // prints out multiplied numbers

else if(choice == 4)


{



if(two == 0)
System.out.print("I'm sorry, you can't divide by zero.\nAnswer:NaN"); // validates that user can't divide by zero

else
System.out.print("Answer: "+(one/two)); // prints out divided numbers



}}}}}}

