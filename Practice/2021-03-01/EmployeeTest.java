import java.time.*;

/**
 * Ŀ��: ��ϰ�Զ������ʹ��
 * ����: 2021-03-01
 * ����: ZRH
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Wacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e : staff)
            e.RaiseSalary(5);

        for (Employee e : staff)
            System.out.println("name=" + e.GetName() +", salary=" + e.GetSalary() + ", hireDay="
                + e.GetHireDay());
    }
}

class Employee {

    //����
    private final String m_sName;

    //нˮ
    private double m_fSalary;

    //��ְʱ��
    private final LocalDate m_vHireDay;

    //���캯��
    public Employee(String sName, double fSalary, int nYear, int nMonth, int nDay) {
        m_sName = sName;
        m_fSalary = fSalary;
        m_vHireDay = LocalDate.of(nYear, nMonth, nDay);
    }

    //��ȡ����
    public String GetName() {
        return m_sName;
    }

    //��ȡнˮ
    public double GetSalary() {
        return m_fSalary;
    }

    //��ȡ��ְʱ��
    public LocalDate GetHireDay() {
        return m_vHireDay;
    }

    //��н
    public void RaiseSalary(double fByPercent) {
        double fRaise = m_fSalary * fByPercent / 100;
        m_fSalary += fRaise;
    }
}