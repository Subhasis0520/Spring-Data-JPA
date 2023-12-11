<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Employee Details</title>
  </head>
  <body>
    <h2 style="text-align: center">Book Details</h2>
    <br />

    <form action="employee" method="get">
      EmployeeId : <input type="text" name="eid" />
      <input type="submit" value="SEARCH" />
    </form>
    <hr />

    <h5>
      Employee Name   : ${emp.empName}  </br>
      Employee Gender : ${emp.gender}  </br>
      Employee Salary : ${emp.sal} </br>
      Employee Dept   : ${emp.dept} 
    </h5>
  </body>
</html>
