package com.hr.personnel;

import static org.assertj.core.api.Java6Assertions.assertThat;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

  private Employee employee;

  @BeforeEach
  void setUp() throws Exception {
    employee = new Employee("Hobak", LocalDate.of(2020, 01, 03));
  }

  @Test
  void getEmployeeInfo_should_return_name_and_hireDate() {
    // act
    String employeeInfo = employee.getEmployeeInfo();

    // assert
    Assertions.assertEquals("name = Hobak, hireDate = 2020-01-03", employeeInfo);
  }

  @Test
  void work_should_return_name_worked_string() {
    String work = employee.work();

//    Assertions.assertEquals("Hobak worked", work);
    assertThat(work).isEqualTo("Hobak worked");
  }
}