package StringBuffer;
import java.util.*;

public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		if(s.equalsIgnoreCase(sb.toString())) {
			System.out.println("Pallindrome ");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}

}
