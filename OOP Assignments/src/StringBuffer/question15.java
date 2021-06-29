package StringBuffer;

import java.util.*;

public class question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		int i=s.indexOf("x");
		int l=s.lastIndexOf("x");
		String s1= new String(sb.delete(i-1, l+2));
        System.out.println(s1);
	}

}
