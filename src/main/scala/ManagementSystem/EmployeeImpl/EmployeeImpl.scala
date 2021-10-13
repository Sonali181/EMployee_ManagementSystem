package ManagementSystem.EmployeeImpl

import ManagementSystem.Employee.Employee

class EmployeeImpl extends Employee {

  case class User(designation: String)

  private val C="CONS"
  private val M="MANA"
  private val S="SRMA"
  private val P="POTC"

  def consultant(FirstName: String, LastName: String, Salary: Int, empid : String): Unit = println("Name of Employee " + FirstName + " " + LastName + " and Salary " + Salary + " having Employee ID :" + C + empid)
  def Manager(FirstName: String, LastName: String, Salary: Int, empid : String): Unit = println("Name of Employee " + FirstName + " " + LastName + " and Salary " + Salary + " having Employee ID :" + M + empid)
  def SrManager(FirstName: String, LastName: String, Salary: Int, empid : String): Unit = println("Name of Employee " + FirstName + " " + LastName + " and Salary " + Salary + " having Employee ID :" + S + empid)
  def President(FirstName: String, LastName: String, Salary: Int, empid : String): Unit = println("Name of Employee " + FirstName + " " + LastName + " and Salary " + Salary + " having Employee ID :" + P + empid)

  def attendance(emp: User, startTime: String, endTime: Int): Unit= {println(s"$emp, $startTime, $endTime")}
  def attendance(emp: User) {
    val startTime: String = "9.45 AM"
    val endTime: String = "6.45PM"
  println(s"$emp, $startTime, $endTime")}
}

//object main extends App {
//  val obj= new EmployeeImpl
//  obj.attendance(obj.User("Manager"), "10.00 AM", 5)
//  obj.Manager(FirstName = "Sona", LastName = "K", Salary = 15000, empid = "12")
//  obj.attendance(obj.User("President"))
//  obj.President("Sonali", "Kumari", 15000, "15")
//}
