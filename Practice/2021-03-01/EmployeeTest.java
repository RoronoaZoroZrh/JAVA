import java.time.*;

/**
 * 目的: 练习自定义类的使用
 * 日期: 2021-03-01
 * 作者: ZRH
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

    //姓名
    private final String m_sName;

    //薪水
    private double m_fSalary;

    //入职时间
    private final LocalDate m_vHireDay;

    //构造函数
    public Employee(String sName, double fSalary, int nYear, int nMonth, int nDay) {
        m_sName = sName;
        m_fSalary = fSalary;
        m_vHireDay = LocalDate.of(nYear, nMonth, nDay);
    }

    //获取姓名
    public String GetName() {
        return m_sName;
    }

    //获取薪水
    public double GetSalary() {
        return m_fSalary;
    }

    //获取入职时间
    public LocalDate GetHireDay() {
        return m_vHireDay;
    }

    //加薪
    public void RaiseSalary(double fByPercent) {
        double fRaise = m_fSalary * fByPercent / 100;
        m_fSalary += fRaise;
    }
}