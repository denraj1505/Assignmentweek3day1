package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	   {
		   System.out.println("studentName: Dennis");
	   }
	 public void studentDept()
	   {
		 System.out.println("studentDept: Computer science");
	   }
	   public void studentId()
	   {
		   System.out.println("studentId:  123657");
	   }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentDept();
		stud.studentName();
		stud.studentName();

	}

}
