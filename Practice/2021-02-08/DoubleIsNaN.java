/**
 * Ŀ��: 
 * ����: 2021-02-08
 * ����: ZRH
**/
public class DoubleIsNaN
{
	public static void main(String[] args)
	{
		Double tmp = 0d/0d;
		if (Double.isNaN(tmp))
		{
			System.out.println("0/0�Ľ����NaN!");
		}
		else
		{
			System.out.println("0/0�Ľ������NaN!");
		}
	}
}