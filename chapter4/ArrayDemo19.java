package chapter4;
//打印楊輝三角前8行
public class ArrayDemo19 {

	public static void main(String[] args) {
		int[][] a = new int[8][8];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				a[i][j] = 1;
			}
		}
		//計算楊輝三角
		for (int i = 2; i < a.length; i++)
		{
			for (int j = 1; j<i; j++)
			{
				a[i][j] = a[i-1][j-1] + a[i-1][j];
			}
		}
		//打印
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
