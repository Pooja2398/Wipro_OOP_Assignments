package StringBuffer;

import java.util.*;

public class question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		int index=s.indexOf('*');
		sb.delete(index-1, index+2);
		System.out.println(sb);
	}

}
