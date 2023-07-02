//Write a  program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;

 class Task2 
 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int a,b,c; 
        a=sc.nextInt(); 
        b=sc.nextInt(); 
        c=sc.nextInt(); 
        int average=(a+b+c)/3; 
        System.out.println("Average of Three Numbers ="+average); 
        
    }
 }