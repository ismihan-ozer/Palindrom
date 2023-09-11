import java.util.Scanner;
public class Palindrom {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int palindrom = scan.nextInt();
        int firstnumber = palindrom;
        int length = String.valueOf(palindrom).length();

        int remaining, value =0;
        for (int i = 0; i<length; i++){

            remaining = palindrom % 10;
            value = value * 10 + remaining;
            palindrom = palindrom /10;
        }

        if(value == firstnumber){
            System.out.println(value + " Is a Palindrom .");
        }else{
            System.out.println(value + " Not a Palindrom numbers .");
        }

    }
}