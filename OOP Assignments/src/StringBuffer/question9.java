package StringBuffer;

import java.util.Scanner;

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.substring(s1.length()-1).equalsIgnoreCase(s2.substring(0,1))) {
			System.out.println(s1.concat(s2.substring(1,s2.length())));
		}
		else {
			System.out.println(s1.concat(s2).toLowerCase());
		}
	}

}
