/**
 * 目的: 学习StringBuilderPractice类
 * 日期: 2021-02-22
 * 作者: ZRH
 */
public class StringBuilderPractice
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.length());
        builder.append("123");
        builder.append("abc");
        builder.append("中国");
        System.out.println(builder);
        System.out.println(builder.length());
        builder.setCharAt(0, '8');
        System.out.println(builder);
        builder.insert(1, "t");
        System.out.println(builder);
        builder.delete(1, 2);
        System.out.println(builder);
    }
}