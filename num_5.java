import java.util.*;

public class num_5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean s1,s2;
		String op;
		System.out.print("논리연산을 입력하세요 : ");
		s1 = sc.nextBoolean();
		op = sc.next();
		s2 = sc.nextBoolean();
		
		if(op.equals("OR"))
		{
			if(s1 == true && (s2 == true || s2 == false))
			{
				System.out.println("true");
			}
			else if (s1 == false && s2 == false)
			{
				System.out.println("false");
			}
			else if (s1 == false && s2 == true)
			{
				System.out.println("true");
			}
		}
		else if(op.equals("AND"))
		{
			if((s1 == true && s2 == false) || (s1 == false && s2 == true))
			{
				System.out.println("false");
			}
			else
			{
				System.out.println("true");
			}
			
		}
		sc.close();
	}
}
