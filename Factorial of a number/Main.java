import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fact = 1;
      for (int a =1; a <= n; a++)
      {
        fact = fact * a; 
      }
      System.out.println(fact);
	}
}