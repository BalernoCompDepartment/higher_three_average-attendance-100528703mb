import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
  int total = 0;
  Scanner input = new Scanner(System.in);
  for (int i = 0; i < 8; i++) {
    
    System.out.println("Enter attendance");
    int attendance = input.nextInt();
    total = total + attendance;
  }
  
  
  
  System.out.println("Average cricket attendance is " + Math.round((double)total/8) +  " this year");
  
  }
}