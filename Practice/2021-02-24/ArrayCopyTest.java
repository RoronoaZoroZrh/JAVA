import java.util.*;

/**
 * 目的: 查看数组拷贝结果->1 3 4 5 7 9 0 0 0 0 0
 * 日期: 2021-02-24
 * 作者: ZRH
 */
public class ArrayCopyTest
{
    public static void main(String[] args)
    {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = Arrays.copyOf(a, 2 * a.length);
        for (int elem : b)
        {
            System.out.println(elem);
        }
    }
}