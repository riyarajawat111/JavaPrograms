/*for loop*/
/*100 time print RIYA*/
// public class loops {
//     public static void main(String[] args){
//         for(int counter = 0; counter<100; counter = counter+1){
//             System.out.println("RIYA");
//         }
//     }
// }

/*10times print RAJAWAT */
// public class Loop{
//     public static void main(String[] args){
//         for(int counter = 0; counter<10; counter++){
//             System.out .println("RIYA RAJAWAT");
//         }
//     }
// }

// public class Loop{
//      public static void main(String[] args){
//          for(int i = 0; i < 11; i++){
//              System.out.print(i+" ");
//          }
//      }
//  }

// [WHILE LOOP]
// public class Loop{
//       public static void main(String[] args){
//         int i = 0;
//         while(i<11){
//             System.out.println(i);
//             i = i + 1;
//         }
//     }
// }            

//DO WHILE 
// public class Loop{
//     public static void main(String[] args){
//         int i = 0;
//         do{
//             System.out.println(i);
//             i = i + 1;
//         }while(i<11);
//     }
// }

//PRINT THE SUM OF FIRST n NATURAL NUMBER (n=4)
// import java.util.*;
// public class Loop{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int sum = 0;
//     for(int i=0; i<=n; i++){
//         sum = sum + i;
//     }
//     System.out.println(sum);
//   }
// }


// PRINT THE TABLE OF A NUMBER INPUT BY THE USER(n=2)
// import java.util.*;
// public class Loop{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i=1; i<11; i++){
//         System.out.println(n*i);
//     }
//   }
// }      


//print all even number till n explain to krna
// import java.util.*;
// public class Loop{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i=0; i<n; i++){
//         if(i%2==0){
//             System.out.println(i);
//         }
//     }
//   }
// }


// [Run
// for(; ;) {
//             System.out.println("Apna College");
//         }
// loop on your system and analyze what happens. 
// Try to think of the reason for the output produced.]

// public class Loop{
//     public static void main(String[] args){
//         for(; ;){
//             System.out.println("RIYA");
//         }
//     }
// }

//   Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)
//*********************************************************/
// import java.util.*;
// public class Loop{
//    public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//     do{
//         System.out.println("Enter 0 to STOP");
//         System.out.println("Enter 1 to CONTINUE");
//         int n = sc.nextInt();
//       }
//       while(0!=0);{
//         System.out.println("program stopped");
//       } 
//       if(n>=90){
//         System.out.println("THIS IS GOOD");
//       }else if(89>=n && n>=60){
//         System.out.println("this is also good ");
//       }else if(59>=n && n>=0){
//         System.out.println("this is good as well");
//       }else{
//         System.out.println("invalid marks");
//       }
//    }
// }


// print 100 * in columns
// public class Loop{
//     public static void main(String[] args){
//         for(int i=1; i<=100; i++){
//         System.out.print("*");
//         }
//     }
// }


//NESTED LOOPS
// print the pattern
// *****
// *****
// *****
// *****
// public class Loop{
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5;
//         //outer loop
//         for(int i=1; i<=n; i++){
//             System.out.println();
//             //inner loop
//             for(int j=1; j<=m; j++){
//                 System.out.print("*");
//             }
//         }
//     }
// }

// *****
// *   *
// *   *
// *****
// public class Loop{
//      public static void main(String[] args){
//          int n = 4;
//          int m = 5;
//          for(int i=1; i<=n; i++){
//             for(int j=1; j<=m; j++){
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//          }
//      }
//     }    


//    *
//    **
//    ***
//    ****
// public class Loop{
//     public static void main(String[] args){
//         int n=4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//    ****
//    ***
//    **
//    *
// public class Loop{
//     public static void main(String[] args){
        // int n=4;
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




//    *
//   **
//  ***
// ****


// public class Loop{
//       public static void main(String[] args){
//           int n = 4;
//          for(int i=1; i<=n; i++){
//              for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }System.out.println();
//         }
//     }
// }
              



// print 
// 1
// 12
// 123
// 1234
// 12345
// public class Loop{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }System.out.println();
//         }
//     }
// }


// print
// 12345
// 1234
// 123
// 12
// 1
// public class Loop{
//      public static void main(String[] args){
//          int n = 5;
//          for(int i=1; i<=n; i++){
//              for(int j=1; j<=n-i+1; j++){
//                  System.out.print(j+" ");
//              }System.out.println();
//          }
//      }
// }     


// print
// 1
// 23
// 456
// 78910
// 1112131415
// public class Loop{
//       public static void main(String[] args){
//           int n = 5;
//           int number = 1;
//          for(int i=1; i<=n; i++){
//              for(int j=1; j<=i; j++){
//                 System.out.print(number);
//                 number++;
//                  }System.out.println();
//             }
//         }
// }



// print
// 1
// 01
// 101
// 0101
// 10101
// public class Loop{
//       public static void main(String[] args){
//           int n = 5;
//           int number = 1;
//          for(int i=1; i<=n; i++){
//              for(int j=1; j<=i; j++){
//                 int sum = i+j;
//                 if(sum%2==0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//              }System.out.println();
//             }
//         }
// }



// print
//     *****
//    *****
//   *****
//  *****
// *****
// public class Loop{
//       public static void main(String[] args){
//           int n = 5;
//          for(int i=1; i<=n; i++){
//              for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }System.out.println();
//         }
//     }
// }
              


//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5 
// public class Loop{
//       public static void main(String[] args){
//           int n = 5;
//          for(int i=1; i<=n; i++){
//              for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+" ");
//             }System.out.println();
//         }
//     }
// }


//    1
//   212
//  32123
// 4321234
//543212345
// public class Loop{
//       public static void main(String[] args){
//           int n = 5;
//          for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//             }
//             for(int j=i; j>=1; j--){
//                 System.out.print(j);
//             }
//              for(int j=2; j<=i; j++){
//                  System.out.print(j);
            
//             }System.out.println();
//          }
//        }
// }




// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
// public class Loop{
//     public static void main(String[] args){
//         int n=4;
//         // upper half
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }int spaces = 2 * (n-i);
//             for(int j=1; j<=spaces; j++){
//                  System.out.print(" ");
//             }for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }System.out.println();
//                 // lower half
//         }for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n-i);
//             for(int j=1; j<=spaces; j++){
//                  System.out.print(" ");
//             }for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }System.out.println();
//         }
//     }
// }





//   *
//  ***
// *****
//******* 
//******* 
// *****
//  ***
//   *

//  public class Loop{
//       public static void main(String[] args){
//           int n = 4;
//         //   UPPER HALF PART
//         // SPACE
//          for(int i=1; i<=n; i++){
//              for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             // 1ST PART
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             // 2ND PART
//             for(int j=1; j<=i-1; j++){
//                 System.out.print("*");
//             }System.out.println();
//          }
//         // LOWER HALF
//         // SPACE
//         for(int i=n; i>=1; i--){
//             for(int j=0; j<n-i; j++){
//              System.out.print(" ");
//             }
//             // 3RD PART
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             // 4TH PART
//             for(int j=2; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }  

