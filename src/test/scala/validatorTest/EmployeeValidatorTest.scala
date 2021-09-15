package validatorTest

import org.scalatest.funsuite.AnyFunSuite
import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
class EmployeeValidatorTest extends AnyFunSuite{

  val FirstEmployeeNikhil = Employee("nikhil", "tyagi", 32,50000, "Software Consultant", "Knoldus", "Nikhiltyagi@gmail.com" )
  val SecondEmployeeShivam = Employee("shivam", "roy", 26,30000, "Software Trainee", "Philips", "shivamroy@gmail.com" )
  val ThirdEmployeeParth = Employee("parth", "dhiman", 43,65000, "Sr. Software Engineer", "CTS", "parth43@gmail.com" )
  val FourthEmployeeRishi = Employee("rishivant", "Singh", 22,25000, "Software Consultant", "Knoldus", "rishi21?@gmail.com" )


  test("Checking if Employee- employeeOneDavid working in Knoldus(company present in Database) is a valid Employee"){
    val expectResult = true
    val result = (new EmployeeValidator).employeeIsValid(FirstEmployeeNikhil)
    assert(expectResult == result)
  }


  test("Checking if Employee- employeeTwoLeo working in Philips(company present in Database) is a valid Employee"){

    val expectResult = true
    val result = (new EmployeeValidator).employeeIsValid(SecondEmployeeShivam)
    assert(expectResult == result)
  }


  test("Checking if Employee- employeeThreeSimon working in company TCS(company not present in Database) is thus an invalid Employee"){

    val expectResult = false
    val result = (new EmployeeValidator).employeeIsValid(ThirdEmployeeParth)
    assert(expectResult == result)
  }

  test("Checking if Employee- employeeFourSam working in Knoldus(company present in Database) having invalid Email ID is thus an invalid Employee"){
    val expectResult = false
    val result = (new EmployeeValidator).employeeIsValid(FourthEmployeeRishi)
    assert(expectResult == result)
  }

}
