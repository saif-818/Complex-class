import java.util.*;  
class Complex{
    
     double x;
     double y;
    
    public Complex(int real,int imaginary)
    {
        this.x=real;
        this.y=imaginary;
    }
    public String PrintComplex() 
    {
      return x + " + " + y + "i" ;
    }
    public Complex add(Complex T) 
    {
       Complex temp=new Complex(0,0);
       temp.x=this.x + T.x;
       temp.y=this.y + T.y;
       return temp;
    }
    public Complex subtract(Complex T) 
    {
       Complex temp1=new Complex(0,0);
       temp1.x=this.x - T.x;
       temp1.y=this.y - T.y;
       return temp1;
    }
    public Complex multiply(Complex T) 
    {
        Complex temp2=new Complex(0,0);
        temp2.x=this.x * T.x - this.y * T.y;
        temp2.y=this.x * T.y + T.x * this.y;
        return temp2;
    }
    public Complex divide(Complex T)
    {
        Complex temp3=new Complex(0,0);
        double k= T.x * T.x + T.y * T.y;
        temp3.x= (this.x * T.x + this.y * T.y)/k;
        temp3.y= (this.x * T.y - T.x * this.y)/k;
        return temp3;
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
		System.out.println("Complex Number 1: " + A.PrintComplex());
        System.out.println("Complex Number 2: " + B.PrintComplex());
        
        Complex temp=A.add(B);
        System.out.println("Sum of Two Complex Numbers: " + temp.PrintComplex());
        
        Complex temp1=A.subtract(B);
        System.out.println("Subtraction of Two Complex Numbers: " + temp1.PrintComplex());
        
        Complex temp2=A.multiply(B);
        System.out.println("Product of Two Complex Numbers: " + temp2.PrintComplex());
        
        Complex temp3=A.divide(B);
        System.out.println("Division of Two Complex Numbers: " + temp3.PrintComplex());
	}
}
