/* 
public class Main {
    public static void main(String[] args){
        System.out.print("*\n**\n***\n****\n*****\n******");
    }
}
*/
/* 
public class Main {
    public static void main(String[] args){
        System.out.print("*\n**");
    }
}
*/
/* 
public class Main {
    public static void main(String[] args){
        int a = 20;
        int b = 40;
        int sum = a + b;
        System.out.println(sum);
    }
}
*/
/* 
public class Main {
    public static void main(String[] args){
        int a = 20;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);
        int diff = a - b;
        System.out.println(diff);
        int multiply = a * b;
        System.out.println(multiply);
        int divide = a / b;
        System.out.println(divide);
    }
}
*/

/* 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
*/
/* 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
*/
/* 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Adult");            
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
*/
/* if,else(even/odd)*/

// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         if(x%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }

/*user=a,b[(a=b)=equal, (a>b)= a is greater, (a<b)=a is lesser]*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else{
          if(a>b){
            System.out.println("a is greater");
          }
          else{
            System.out.println("a is lesser");
          }
        }
    }
}
*/


/*else if */
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is smaller");
        }
    }
}
*/


/*
if 3 is an even number ,print"Bazinga"
 */
/* 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Bazinga");
        }
    } */


/*  
import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    if(button==1){
        System.out.println("Hello");
    }else if(button==2){
        System.out.println("Namaste");
    }else if(button==3){
        System.out.println("bonjour");
    }else{
        System.out.println("Invalid number");
    }
    }
}/*


/*[Switch , Break , Default] */
/*
import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        switch(Button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid");
        }  
    }
}*/


/*Ask the user to enter the number of the month
 & print the name of the month. 
 For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
 */
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        switch(Button){
            case 1: System.out.println("january");
            break;
            case 2: System.out.println("february");
            break;
            case 3: System.out.println("march");
            break;
            case 4: System.out.println("april");
            break;
            case 5: System.out.println("may");
            break;
            case 6: System.out.println("june");
            break;
            case 7: System.out.println("july");
            break;
            case 8: System.out.println("august");
            break;
            case 9: System.out.println("september");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("november");
            break;
            case 12: System.out.println("December");
            break;
            default:System.out.println("Invalid Button");
        }
    }
} */


/*Make a Calculator. Take 2 numbers (a & b) from the user
 and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given 
and display it to the user
 */
// import java.util.*;
// public class Calculator {
//         public static void main(String[] args) {
//                     Scanner sc = new Scanner(System.in);
//                             // Input two numbers
//                      System.out.print("Enter first number: ");     
//                      int a = sc.nextInt();        
//                      System.out.print("Enter second number: ");        
//                      int b = sc.nextInt();        
//                      // Show operations        
//                      System.out.println("\nChoose Operation:");n("1 : + (Addition)");      
                           
//                      System.out.println("2 : - (Subtraction)");        
                     
//                      System.out.println("3 : * (Multiplication)");        
//                      System.out.println("4 : / (Division)");        
//                      System.out.println("5 : % (Modulo)");        
//                      // Input choice        
//                      System.out.print("Enter your choice: ");        
//                      int choice = sc.nextInt();        
//                      // Perform operation        
//                      switch(choice) {            
//                         case 1:                
//                         System.out.println("Result = " + (a + b));                
//                         break;            
//                         case 2:                
//                         System.out.println("Result = " + (a - b));                
//                         break;            
//                         case 3:                
//                         System.out.println("Result = " + (a * b));                
//                         break;            
//                         case 4:                
//                         if(b != 0) {                    
//                             System.out.println("Result = " + (a / b));                
//                         } else {                    
//                             System.out.println("Division by zero is not allowed.");                
//                         }                
//                         break;            
//                         case 5:                
//                         if(b != 0) {                    
//                             System.out.println("Result = " + (a % b));                
//                         } else {                    
//                             System.out.println("Modulo by zero is not allowed.");                
//                         }                
//                         break;            
//                         default:                
//                         System.out.println("Invalid Choice");        
//                     }        
//                 }
//             }