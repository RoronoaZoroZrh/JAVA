/**
 * Ŀ��: ѧϰ��λ������
 * ����: 2021-02-20
 * ����: ZRH
 */
public class BitAnd
{
    public static void main(String[] args)
    {
        int n = 24;
        int m = (n & 1 << 3) >> 3;
        System.out.println(m);
    }
}