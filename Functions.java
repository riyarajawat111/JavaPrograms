// PRINT A GIVEN NAME IN A FAMILY
// import java.util.*;
// public class Functions {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String arggs[]){
//         Scanner sc =new Scanner(System.in);
//         String name = sc.next();
//         printMyName(name);
//     }
// }



// MAKE A FUNCTION TO ADD 2 NUMBERS AND RETURN THE SUM
// import java.util.*;
// public class Functions {
//     public static int calculateSum(int a ,int b){
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a,b);
//         System.out.println(sum);
//     }
// }



// MAKE A FUNCTION TO MULTIPLY 2 NUMBERS AND RETURN THE PRODUCT
// import java.util.*;
// public class Functions{
//     public static int calculateProduct(int a ,int b){
//         return a*b;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int Product = calculateProduct(a,b);
//         System.out.println(Product);
//     }
// }




// MAKE A FUNCTION TO CHECK IF A GIVEN NUMBER "n" IS EVEN OR NOT.
// import java.util.*;
// public class Functions{
//     public static boolean printEven(int n){
//         return n % 2 == 0;
//     }
//     public static void main(String args[]){
//         int n = 2;
//         if(printEven(n)){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Not Even");
//         }
//     }
// }



// MAKE A FUNCTION TO PRINT THE TABLE OF A GIVEN NUMBER "n"
// import java.util.*;
// public class Functions{
//     public static void printTable(int n){
//         for(int i=1; i<=10; i++){
//             System.out.println(n*i);
//         }
//     }
//     public static void main(String args[]){
//         printTable(5);
//     }
// }



// Enter 3 numbers from the user & make a function to print their average.
// import java.util.*;
// public class Functions {
//     public static void printAverage(int a , int b , int c){
//         double Average = (a+b+c) / 3;
//         System.out.println("Average=" + Average); 
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter first number:");
//         int a = sc.nextInt();

        
//         System.out.print("Enter second number:");
//         int b = sc.nextInt();

//         System.out.print("Enter third number:");
//         int c = sc.nextInt();

//         printAverage(a,b,c);
//     }
// }



// Write a function to print the sum of all odd numbers from 1 to n.
// import java.util.*;
// public class Functions {
//     public static int printOddSum(int n){ 
//         int sum =0;
//         for(int i=0; i<=n; i++){
//             if(i%2 != 0){
//                 System.out.print(i +" ");
//                 sum+=i;
//             }
//         }return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n = sc.nextInt();
//         System.out.println("sum of odd numbers:" + printOddSum (n));
//         int sum = sc.nextInt();
//     }
// }



// Write a function which takes in 2 numbers and returns the greater of those two.
// import java.util.*;
// public class Functions{
//     public static int printGreater(int a , int b){
//         if(a>b){
//              return a;
//         }else{
//             return b;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//          System.out.print("Enter 1st number:");
//          int a= sc.nextInt();

//         System.out.print("Enter 1st number:");
//          int b= sc.nextInt();

//          int Greater = printGreater(a,b);
//         System.out.print("Greater number is:" + Greater);
//     }
// }




// at the end it should display the count of positive, negative and
//  zeros entered. 

// Write a function that takes in the radius as input and
//  returns the circumference of a circle.
// import java.util.*;
// public class Functions{
//     public static double printCircumferenceOfCircle(int n){
//         double CircumferenceOfCircle = 2*3.14*n;
//         System.out.print(CircumferenceOfCircle);
//         return n;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
       
//         System.out.print("Enter The Value Of n :");
//         int n = sc.nextInt();

//        System.out.println(2*3.14*n);
//     }
// }



// Write a function that takes in age as input and returns if that person is
//  eligible to vote or not.A person of age > 18 is eligible to vote.
// import java.util.*;
// public class Functions{
//     public static void printAge(int n){
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter The Value Of n:");
//         int n = sc.nextInt();

//         if(n>18){
//             System.out.println("Eligible to vote");
//         }else{
//             System.out.println("Not Eligible to vote");
//         }
//     }
// }



// Write an infinite loop using do while condition.
// import java.util.*;
// public class Functions{
//     public static void printInfiniteLoop(){
        
//     }
//     public static void main(String args[]){
//         do{
//             System.out.print("this loop run forever");
//         }while(true);
//     }
// }



// Write a program to enter the numbers till the user wants and at the end
//  it should display the count of positive, negative and zeros entered.
// import java.util.*;
// public class Functions{
//     public static void printNumbers(int n){
//     }
//    public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int positive=0 , negative=0 , zeros=0; 
//         char choice;
//         do{
//             System.out.println("Enter a number:");
//             int n = sc.nextInt();
//         if(0<n){
//             System.out.println("Positive number:" + positive);
//             }else if(0>n){
//                 System.out.println("Negative number:" + negative);
//         }else{
//             System.out.println("zeros:" + zeros);
//         } System.out.println("do you want to enter another number?:(Yes or No");
//         char choice = sc.nextInt();
//         }while(choise == 'y' || choise == 'Y');
//         System.out.println();
//     }
// }




import java.util.*;
public class Functions{
    public static void printSong(int n){
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("If you want lyrics of KASHISH SONG ");
         System.out.print("press the number 2: ");
          int n = sc.nextInt();
        if (n==2){
             System.out.println(".");
              System.out.println(".");
               System.out.println(".");
            System.out.println("LYRICS OF KASHISH SONG");
             System.out.println(".");
              System.out.println(".");
               System.out.println(".");
         System.out.println("USKI ANKHO M PHELA KAJAL...");
         System.out.println("BATO SE KRDI GHAYAL...");
         System.out.println("SANSON MAI USKA HI HAI NAAM...");
         System.out.println("MERI NEENDEIN UDI HAI JBSE...");
         System.out.println("TU AA GYI JEEVAN MAI...");
         System.out.println( "ROSHAN KRDE TU MUJHKO AAJ...");
         System.out.println(".");
         System.out.println(".");
         System.out.println(".");
          System.out.println(".");
           System.out.println(".");2
         System.out.println("MISS RAGINI JI : baki ki lyrics aap google pr search krskte ho");
       
        }else{
            System.out.println("SORRY");
        }
    }
}
