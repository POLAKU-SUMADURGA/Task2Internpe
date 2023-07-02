//Write a program to print the area and perimeter of a rectangle. 
import java.util.Scanner;

class Task3
{ 
    static void perimeterOfRectangle(int length,int width)
    { 
        int p=2*(length+width); 
        System.out.println("Perimeter of Rectangle ="+p);
    } 
    static void areaOfRectangle(int length,int width)
    { 
        int a=length*width; 
        System.out.println("Area of Rectangle ="+a); 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        int l,w; 
        l=sc.nextInt(); 
        w=sc.nextInt(); 
        perimeterOfRectangle(l,w); 
        areaOfRectangle(l,w);
    }
}