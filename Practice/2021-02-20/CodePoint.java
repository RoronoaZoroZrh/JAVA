/**
 * Ŀ��: �鿴�ַ������뵥Ԫ��������㳤��
 * ����: 2021-02-20
 * ����: ZRH
 */
public class CodePoint
{
    public static void main(String[] args)
    {
        String s = "Hi\uD835\uDD46";
        System.out.println(s);
        System.out.println(s.length()); //���뵥Ԫ����
        System.out.println(s.codePointCount(0, s.length())); //��㳤��
        for (int i = 0; i < s.length(); ++i)
        {
            System.out.println(s.charAt(i)); //���뵥Ԫ
        }
        for (int i = 0; i < s.codePointCount(0, s.length()); ++i)
        {
            System.out.println(s.codePointAt(s.offsetByCodePoints(0, i)));
        }
    }
}