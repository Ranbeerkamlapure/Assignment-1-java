program that prints your name, college name, and current date 

// import java.util.Scanner;
// import java.time.LocalDate;
// public class Classroom{
//     public static void main(String[]args){
//         String name="Ranbeer";
//         String college="WIT SOLAPUR";
//         LocalDate currentdate=LocalDate.now();

//         System.out.println("Name: "+ name);
//         System.out.println("College: "+ college);
//         System.out.println("Date: "+ currentdate);
//     }
// }

Java program to input a number and check if it is:
Even or Odd
Prime or not
Map to weekday using switch-case (1=Monday … 7=Sunday)


// import java.util.Scanner;
// public class Classroom{
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number=sc.nextInt();

//         if(number%2==0){
//             System.out.println("number is even");
//         }
//         else{
//             System.out.println("number is odd");
//         }
    
//         Boolean isPrime=true;
//         if(number<=1){
//             isPrime=false;
//         }
//         else{
//             for(int i = 2; i<=number/2; i++){
//                 if(number % i==0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//         }
//             if(isPrime){
//                 System.out.println("prime number");
//             }
//             else
//             {
//             System.out.println("not a prime number");
//         }
//         switch(number){
//             case 1:System.out.println("Weekday:Monday"); break;
//             case 2:System.out.println("Weekday:Tuesday"); break;
//             case 3:System.out.println("Weekday:Wednesday"); break;
//             case 4:System.out.println("Weekday:Thursday"); break;
//             case 5:System.out.println("Weekday:Friday"); break;
//             case 6:System.out.println("Weekday:Saturday"); break;
//             case 7:System.out.println("Weekday:Sunday"); break;
//             default:System.out.println("Invalid Weekday number");
//         }
//         sc.close();
//     }
// }