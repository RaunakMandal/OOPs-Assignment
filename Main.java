// 1. Create a Complex class having two attributes - re and im. Write a constructor to initialize the attributes.
// Write a function to display the complex number in the form a+(b)i.
// Write appropriate main() function in another class and create an object of complex class, initialize the object using constructor and then display the value.

// 2. Design a Complex class and add four basic operations addition, subtraction, multiplication and division in the class. From a main class perform the operation

package com.mandal;

class Complex{
    double real;
    double img;

    Complex(double real_parameter,double imaginary_parameter){
        real = real_parameter;
        img = imaginary_parameter;
    }
    void display(){
        System.out.println(real+"+"+"("+img+")"+"i");
    }
    Complex Add(Complex q1){

        Complex res = new Complex(0,0);
        res.real = real+q1.real;
        res.img = img + q1.img;

        return res;
    }
    Complex Subtract(Complex c1,Complex c2){
        Complex temp = new Complex(0,0);

        temp.real = c1.real- c2.real;
        temp.img = c1.img-c2.img;
        return temp;
    }
    Complex Multiply(Complex c2){
        Complex  res = new Complex (0,0);
        res.real = (real * c2.real) - (img * c2.img);
        res.img = (real * c2.img) + (img * c2.real);
        return res;

    }
    Complex divide(Complex c3) {
        Complex res = new Complex(0,0);
        res.real = real / c3.real - img / c3.img;
        res.img = real / c3.img + img / c3.real;
        return res;      }
}

public class Main {

        public static  void main(String[] args){
            Complex c1=new Complex(10,20);
            Complex c2=new Complex(5,10);
            Complex result,multi,div;
            Complex result1=new Complex(0,0);

            System.out.println();
            System.out.print("Complex Number1 is - ");
            c1.display();
            System.out.print("Complex Number2 is - ");
            c2.display();

            result = c1.Add(c2);
            result1=result1.Subtract(c1,c2);
            multi=c1.Multiply(c2);
            div=c1.divide(c2);

            System.out.println();


            System.out.print("Sum is - ");
            result.display();
            System.out.print("Difference is - ");
            result1.display();
            System.out.print("Multiplication is - ");
            multi.display();
            System.out.print("Division result is - ");
            div.display();



        }
}



//Output -
//
//
//        Complex Number1 is - 10.0+(20.0)i
//        Complex Number2 is - 5.0+(10.0)i
//
//        Sum is - 15.0+(30.0)i
//        Difference is - 5.0+(10.0)i
//        Multiplication is - -150.0+(200.0)i
//        Division result is - 0.0+(5.0)i
//
//        Process finished with exit code 0

