package StringBuffer;

import java.util.*;

public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int n=s1.length();
		String s="";
		if(n%2==0) {
			s=s.concat(s1.substring(0,n/2));
		}
		else {
			s=" ";
		}
		System.out.println(s);

	}

}
