import java.util.*;

public class num_9 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String inp;
		System.out.print("1~99 ������ ������ �Է��ϼ���>>");
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
			System.out.println("�ڼ�¦¦");
		}
		else if(total_count == 1)
		{
			System.out.println("�ڼ�¦");
		}
		else {
			System.out.println("�ڼ�����");
		}
	}
}
