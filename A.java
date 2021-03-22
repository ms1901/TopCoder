//package atcoder;
/*Given a,b,c,d chose x such a<=x<=b and y such that c<=y<=d and the value of x-y is max.

*/
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[4];
		for(int i=0;i<4;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println(Math.max(arr[0],arr[1])-Math.min(arr[2],arr[3]));

	}

}
