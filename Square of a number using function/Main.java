import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      System.out.println(square_num(n));
	} 
  public static int square_num(int n)
  {
    int mul = n*n;
    return mul;
  }
}