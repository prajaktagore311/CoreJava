package date07032012;

public class Student {
	String studName;
	String deptName;
	String collegeName;
	String bloodGroup;
	String address;
	String fClass;
	String sClass;
	String tClass;
	static int studId=2021101;
	int rollNo;
 
	public Student(String iStudName,String iDeptName,String iCollegeName,String iBloodGroup,String iAddress,String iFclass,String iSclass,String iTclass, int iStudId,int iRollNo)
	{
		studName=iStudName;
		deptName=iDeptName;
		collegeName=iCollegeName;
		bloodGroup=iBloodGroup;
		address=iAddress;
		fClass=iFclass;
		sClass=iSclass;
		tClass=iTclass;
		studId=iStudId;
		rollNo=iRollNo;
				
	}
	public void displayStudentDetails()
	{
System.out.println("Id is:"+studId);
System.out.println("College nmae is :"+collegeName);
System.out.println("Student Name is :"+studName);
System.out.println("Roll number is :"+rollNo);
System.out.println("Department name is :"+deptName);
System.out.println("Class is :"+fClass);
System.out.println("Address is :"+address);
System.out.println("Blood Group is :"+bloodGroup);
	}
	public void displayDepartmentDetails()
	{
		System.out.println("college Name is: "+collegeName);
		System.out.println("Department Name is :"+deptName);
		System.out.println("class is :"+fClass);
		System.out.println("class is :"+sClass);
		System.out.println("Class is :"+tClass);
	}
}
