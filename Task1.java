//Write a  program to print the area and perimeter of a circle.  
import java.lang.*;
import java.util.Scanner;

class Task1{   
    static float pi =3.14f; 

    void perimeterOfCircle(float radius)
    { 
        float p=2*pi*radius; 
        System.out.println("Perimeter ="+p);
    } 
    void areaOfCircle(float radius) 
    { 
        float a=pi*radius*radius; 
        System.out.println("Area ="+a);
    }
    public static void main(String[] args)
    { 
       Scanner sc=new Scanner(System.in); 
       float r=sc.nextFloat(); 
       Task1 t=new Task1(); 
       t.perimeterOfCircle(r); 
       t.areaOfCircle(r);
       
    } 

}