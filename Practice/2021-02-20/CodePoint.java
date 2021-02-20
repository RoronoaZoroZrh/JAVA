/**
 * 目的: 查看字符串代码单元长度与码点长度
 * 日期: 2021-02-20
 * 作者: ZRH
 */
public class CodePoint
{
    public static void main(String[] args)
    {
        String s = "Hi\uD835\uDD46";
        System.out.println(s);
        System.out.println(s.length()); //代码单元长度
        System.out.println(s.codePointCount(0, s.length())); //码点长度
        for (int i = 0; i < s.length(); ++i)
        {
            System.out.println(s.charAt(i)); //代码单元
        }
        for (int i = 0; i < s.codePointCount(0, s.length()); ++i)
        {
            System.out.println(s.offsetByCodePoints(0, i));
            System.out.println(s.codePointAt(s.offsetByCodePoints(0, i)));
        }
        for (int i = 0; i < s.length();)
        {
            int cp = s.codePointAt(i);
            if (Character.isSupplementaryCodePoint(cp))
            {
                System.out.println(cp);
                i += 2;
            }
            else
            {
                System.out.println(cp);
                i += 1;
            }
        }

        int[] codePoints = s.codePoints().toArray();
        for (int i = 0; i < codePoints.length; ++i)
        {
            System.out.println(codePoints[i]);
        }

        String ns = new String(codePoints, 0, codePoints.length);
        System.out.println(ns);
    }
}