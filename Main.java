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
    public Complex add(Complex T,Complex temp) 
    {
       temp.x=this.x + T.x;
       temp.y=this.y + T.y;
       return temp;
    }
    public Complex subtract(Complex T,Complex temp) 
    {
       temp.x=this.x - T.x;
       temp.y=this.y - T.y;
       return temp;
    }
    public Complex multiply(Complex T,Complex temp) 
    {
        temp.x=this.x * T.x - this.y * T.y;
        temp.y=this.x * T.y + T.x * this.y;
        return temp;
    }
    public Complex divide(Complex T,Complex temp)
    {
        double k= T.x * T.x + T.y * T.y;
        temp.x= (this.x * T.x + this.y * T.y)/k;
        temp.y= (this.x * T.y - T.x * this.y)/k;
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

