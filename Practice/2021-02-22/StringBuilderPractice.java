/**
 * Ŀ��: ѧϰStringBuilderPractice��
 * ����: 2021-02-22
 * ����: ZRH
 */
public class StringBuilderPractice
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.length());
        builder.append("123");
        builder.append("abc");
        builder.append("�й�");
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