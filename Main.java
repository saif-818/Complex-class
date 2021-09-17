import java.util.*;  
class Complex{
    
     double real;
     double imaginary;
    
    public Complex(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public String PrintComplex() 
    {
      return real + " + " + imaginary + "i" ;
    }
    public Complex add(Complex T,Complex temp) 
    {
       temp.real=this.real + T.real;
       temp.imaginary=this.imaginary + T.imaginary;
       return temp;
    }
    public Complex subtract(Complex T,Complex temp) 
    {
       temp.real=this.real - T.real;
       temp.imaginary=this.imaginary - T.imaginary;
       return temp;
    }
    public Complex multiply(Complex T,Complex temp) 
    {
        temp.real=this.real * T.real - this.imaginary * T.imaginary;
        temp.imaginary=this.real * T.imaginary + T.real * this.imaginary;
        return temp;
    }
    public Complex divide(Complex T,Complex temp)
    {
        double k= T.real * T.real + T.imaginary * T.imaginary;
        temp.real= (this.real * T.real + this.imaginary * T.imaginary)/k;
        temp.imaginary= -(this.real * T.imaginary - T.real * this.imaginary)/k;
        return temp;
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter real part of 1st complex no: ");
	    int a1= sc.nextInt();
	    System.out.println("Enter imaginary part of 1st complex no: ");
	    int a2= sc.nextInt();
	    System.out.println("Enter real part of 2nd complex no: ");
	    int b1= sc.nextInt();
	    System.out.println("Enter imaginary part of 2nd complex no: ");
	    int b2= sc.nextInt();
		Complex A = new Complex(a1, a2);
		Complex B = new Complex(b1, b2);
		Complex temp = new Complex(0,0);
		System.out.println("Complex Number 1: " + A.PrintComplex());
        System.out.println("Complex Number 2: " + B.PrintComplex());
        
        System.out.println("Sum of Two Complex Numbers: " + A.add(B,temp).PrintComplex());
    
        System.out.println("Subtraction of Two Complex Numbers: " + A.subtract(B,temp).PrintComplex());
      
        System.out.println("Product of Two Complex Numbers: " + A.multiply(B,temp).PrintComplex());
    
        System.out.println("Division of Two Complex Numbers: " + A.divide(B,temp).PrintComplex());
	}
}

