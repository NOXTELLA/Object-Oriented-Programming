package lecture4_3;

import java.util.*;

public class rectArray {
	public static void main(String[] args)
	{
		int max = 4;
		rect[] a = new rect[max];
		Scanner sc = new Scanner(System.in);
		int totalArea = 0;
		int width,height;
		for(int count = 0;count < max; count++)
		{
			System.out.print((count + 1) + " �ʺ�� ���� >>");
			width = sc.nextInt();
			height = sc.nextInt();
			rect npl = new rect(width, height);
			a[count] = npl;
		}
		System.out.println("�����Ͽ����ϴ�....");
		for(int count = 0;count < max;count++)
		{
			totalArea += a[count].getArea();
		}
		System.out.println("�簢���� ��ü���� : " + totalArea);
	}
}

class rect{
	private int width, height;
	rect(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return width*height;
	}
}