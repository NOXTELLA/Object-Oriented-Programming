import java.util.*;

public class num_9 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String inp;
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		inp = sc.next();
		int total_count = 0;
		for(int a = 0;a < inp.length();a++)
		{
			char T = inp.charAt(a); 
			if( T == '3' || T == '6' || T == '9')
			{
				total_count++;
			}
			else
			{
				continue;
			}
		}
		if(total_count == 2)
		{
			System.out.println("박수짝짝");
		}
		else if(total_count == 1)
		{
			System.out.println("박수짝");
		}
		else {
			System.out.println("박수없음");
		}
	}
}
