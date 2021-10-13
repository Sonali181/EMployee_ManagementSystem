package ManagementSystem.Employee

trait Employee {

  def consultant(FirstName: String, LastName: String, Salary: Int, empid : String)
  def Manager(FirstName: String, LastName: String, Salary: Int, empid : String)
  def SrManager(FirstName: String, LastName: String, Salary: Int, empid : String)
  def President(FirstName: String, LastName: String, Salary: Int, empid : String)

}
