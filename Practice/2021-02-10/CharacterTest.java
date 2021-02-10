/**
 * 目的: 使用Character对象
 * 日期: 2021-02-10
 * 作者: ZRH
 */
public class CharacterTest
{
    public static void main(String[] args)
    {
        //变量不可以以数字开头
        System.out.println(Character.isJavaIdentifierStart('1'));
        System.out.println(Character.isJavaIdentifierPart('1'));
    }
}