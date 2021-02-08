/**
 * 目的: 
 * 日期: 2021-02-08
 * 作者: ZRH
**/
public class DoubleIsNaN
{
	public static void main(String[] args)
	{
		Double tmp = 0d/0d;
		if (Double.isNaN(tmp))
		{
			System.out.println("0/0的结果是NaN!");
		}
		else
		{
			System.out.println("0/0的结果不是NaN!");
		}
	}
}