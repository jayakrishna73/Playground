import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      System.out.println(sum_of(n));
	}
  public static   int sum_of(int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
}