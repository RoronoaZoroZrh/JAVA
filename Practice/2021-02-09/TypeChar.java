/**
 * 目的: 查看字符型十六进制表示
 * 日期: 2021-02-09
 * 作者: ZRH
 */
public class TypeChar
{
    public static void main(String\u005B\u005D args)
    {
        //\u000A //is a newline 后面的is a newline不注释会报错 因为转义字符会被处理成换行符 后面的内容不会被认为是注释
        System.out.println('\u2122');
        System.out.println('\u03C0');
        System.out.println("\u0022+\u0022"); //转义字符会优先处理 变成""+"" 成为空串
        //look inside c:\\usrs
    }
}