package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EmployeePayrollTest {
    EmployeePayrollService employeePayRollService = new EmployeePayrollService();

    @Test
    public void givenEmployeePayrollDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        String sql = "select * from employee_payroll";
        List<Employee> employeePayrollDataList = employeePayRollService.queryExecute(sql);
        Assert.assertEquals(8, employeePayrollDataList.size());
    }
    @Test
    public void givenUpdatingTerisaBasicPay_whenUpdate_ShouldReturnUpdatedPay() {
        double BasicPay = 3000000;
        String Name = "Terisa";
        double salaryUpdated = employeePayRollService.updateBasicPay(Name, BasicPay);
        Assert.assertEquals(BasicPay, salaryUpdated,0.0);
    }

    @Test
    public void givenUpdatingRahulBasicPay_whenUpdate_ShouldReturnUpdatedPay() {
        double BasicPay = 205000;
        String Name = "Shravan";
        double salaryUpdated = employeePayRollService.updateBasicPay(Name, BasicPay);
        Assert.assertEquals(BasicPay, salaryUpdated,0.0);
    }
}
