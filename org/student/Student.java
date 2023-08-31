package org.student;

import org.department.Department;

public class Student extends Department{
         public void studentName(String studentname) {
        	 System.out.println("The student name is " + studentname);
         }
         
         public void studentDept(String deptname) {
        	 System.out.println("The student dept is " + deptname);
         }
         
         public void studentId(int studentid) {
        	 System.out.println("The student id is " + studentid);
         }
         
         public static void main(String[] args) {
			Student university = new Student();
			university.collegeName("LIT");
			university.collegeCode(2109);
			university.collegeRank(4);
			university.deptName("BE");
			university.studentName("Sujan");
			university.studentDept("CSE");
			university.studentId(4055);
		}
}
