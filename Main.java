import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
  int total = 0;
  
  for (int i = 0; i < 8; i++) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter attendance");
    int attendance = input.nextInt();
    total = total + attendance;
  }
  
  double average = total/8;
  
  System.out.println("Average cricket attendance is " + Math.round(average) +  " this year");
  
  }
}