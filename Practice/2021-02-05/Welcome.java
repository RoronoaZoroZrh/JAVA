/**
 * 目的: 在控制台显示一条信息
 * 日期: 2021-02-05
 * 作者: ZRH
**/
public class Welcome
{
	public static void main(String[] args)
	{
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting);
		for (int i = 0; i < greeting.length(); ++i)
		{
			System.out.print("=");
		}
		System.out.println();
	}
}