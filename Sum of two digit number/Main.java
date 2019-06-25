import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int last=num/10;
      int first=num%10;
      int sum=last+first;
      System.out.println(sum);
	}
}