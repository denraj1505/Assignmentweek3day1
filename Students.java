package Student;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID is: "+" " +id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID:"+" " +id+" "+ "Student Name:"+ " " +name);
	}
	public void getStudentInfo(String email,String phonenum)
	{
		System.out.println("Student mailID:" +email+" "+ "Student Phone Number:"+ " " +phonenum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stdinfo=new Students();
		stdinfo.getStudentInfo(10);
		stdinfo.getStudentInfo(12459, "Dennis Rajan");
		stdinfo.getStudentInfo("Dennis@testleaf.com", "9876543210");

	}

}
