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
            System.out.println(s.codePointAt(s.offsetByCodePoints(0, i)));
        }
    }
}