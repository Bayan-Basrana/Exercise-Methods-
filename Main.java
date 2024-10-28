import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
1 - Write a Java method to find the smallest number among three
numbers.
 */
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter first number");
       int num1 = input.nextInt();
        System.out.println(" Enter 2nd number");
        int num2 = input.nextInt();
        System.out.println(" Enter 3rd number");
        int num3 = input.nextInt();
        smallest(num1,num2,num3);

/*
2 - Write a Java method that check if the entered number is negative or
positive or zero.
 */
        System.out.println(" Enter the number");
        int num = input.nextInt();
        check(num);

/*
3 - Write a Java method to check whether a string is a valid password.
Password rules:
 */
        System.out.println(" Enter the password");
        String pass = input.next();
if (checkPass(pass)){
    System.out.println("Password is valid:  " + pass);}
else
    System.out.println("password is invalid");





    }
    public static void smallest( int num1, int num2, int num3){
       if (num1< num2 && num1<num3)
        System.out.println("The smallest value " + num1);
       else if (num2<num1 && num2<num3)
           System.out.println("The smallest value " + num2);
       else
           System.out.println("The smallest value " + num3);}



    public static void check(int num){
    if (num>0)
        System.out.println(" the number is positive");
    else if (num<0)
        System.out.println(" the number is negative");
    else
        System.out.println(" the number is Zero");}




    public static boolean checkPass(String pass) {
        if (pass.length() < 10) {
            System.out.println(" password must have at least ten characters");
            return false;}

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                System.out.println("password consists of only letters and digits.");
                return false;}
        }
        int digitCount = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                digitCount++;}
        }
        if (digitCount <2){
            System.out.println(" password must contain at least two digits. ");
            return false;}
          return true;}

    }
