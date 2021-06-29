package StringBuffer;

import java.util.*;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String res="";
		StringBuffer sb=new StringBuffer(res);
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s=s1.substring(0,2);
		int n=s1.length();
		while(n!=0) {
			res=res.concat(s);
			n--;
		}
		System.out.println(res.substring(0,res.length()/2));
	}
}
