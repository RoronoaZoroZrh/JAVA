import java.util.*;

/**
 * Ŀ��: �鿴���鿽�����->1 3 4 5 7 9 0 0 0 0 0
 * ����: 2021-02-24
 * ����: ZRH
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