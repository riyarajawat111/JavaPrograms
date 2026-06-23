// print the marks

// public class Arrays {
//     public static void main(String args[]){
//        int marks[] = new int[3];
//        marks[0] = 97; //phys.
//        marks[1] = 98; //chem.
//        marks[2] = 95; //engl.
//         //             or
//         //  int marks[] = {97,98,95};
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         //          or
//         for(int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
         
        
//     }
    
// }






// import java.util.*;
// public class Arrays {
//     public static void  main(String args[]){
//         Scanner sc = new Scanner(System.in);  
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         for(int i=0; i<size; i++){
//         System.out.println(numbers[i]);
//         }
//     }
// }





// TAKING AN ARRAY AS AN INPUT AND PRINTING ITS ELEMENTS
// USER SE INPUT LEKAR ARRAY BNANA HAI

//  import java.util.*;
//  public class Arrays {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];


//        for(int i=0; i<size; i++) {
//            numbers[i] = sc.nextInt();
//        }


//        //print the numbers in array
//        for(int i=0; i<numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//    }
// }





// Take An Array As Input From The User. Search For a
// Given Number "X" And Print The Index At Which It Occurs.
// // SIZE = NAME OF VARIABLE+.length = numbers.length...................

//  import java.util.*;
// public class Arrays {
//     public static void  main(String args[]){
//         Scanner sc = new Scanner(System.in);  
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         // input..........
//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt(); 
//         }
           
           //JIS NO. KO SEARCH KRNA...........    
//         int x = sc.nextInt();

//         // output...........
//         for(int i=0; i<numbers.length; i++){
//           if(numbers[i] ==x) {
//           System.out.println("x found at index:" + i);
//           }
//         }
//     }
// }




// TAKE AN ARRAY OF NAMES as a INPUT FROM THE USERS 
// AND PRINT THEM ON THE SCREEN.

import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names = new String[size];

        // INPUT..................
        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }

        // OUTPUT.................
        for(int i=0; i<size; i++){
            System.out.println("name" + (i+1) + "is:" + names[i]);
        }
    }
}




// Read about Integer.MIN_VALUE & Integer.MAX_VALUE in
//  Java].

