package com.collection.assign;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {

	public static void main(String[] args) {
		List<Student> StudentDetails=new ArrayList<>();
                 Student s1=new Student();
                 s1.rollNumber=101;
                 s1.name="Mohit";
                 s1.mobileNumber="9214187652";
                 Student s2=new Student();
                 s2.rollNumber=102;
                 s2.name="Johny";
                 s2.mobileNumber="9321487565";
                 Student s3=new Student();
                 s3.rollNumber=103;
                 s3.name="Vikash";
                 s3.mobileNumber="9488652145";
                 Student s4=new Student();
                 s4.rollNumber=104;
                 s4.name="Sumit";
                 s4.mobileNumber="9594939291";
                 Student s5=new Student();
                 s5.rollNumber=105;
                 s5.name="John";
                 s5.mobileNumber="9695949291";
                 Student s6=new Student();
                 s6.rollNumber=106;
                 s6.name="Raina";
                 s6.mobileNumber="9785423512";
                 Student s7=new Student();
                 s7.rollNumber=107;
                 s7.name="Sohit";
                 s7.mobileNumber="9854214578";
                 Student s8=new Student();
                 s8.rollNumber=108;
                 s8.name="Rohit";
                 s8.mobileNumber="9954477725";
                 // calling parameterized constructor for remaining two students:
                 Student s9=new Student(109,"Amit","9188542565");
                 Student s10=new Student(110,"Amir","9088542565");
                 
                 StudentDetails.add(s1);
                 StudentDetails.add(s2);
                 StudentDetails.add(s3);
                 StudentDetails.add(s4);
                 StudentDetails.add(s5);
                 StudentDetails.add(s6);
                 StudentDetails.add(s7);
                 StudentDetails.add(s8);
                 StudentDetails.add(s9);
                 StudentDetails.add(s10);
                 System.out.println(StudentDetails.size());
                 
                 for(Student s: StudentDetails) {
                	 System.out.println("Roll: "+s.getRollNumber()+" mobile number: "+s.getMobileNumber());
                 }
                 StudentDetails.remove(5);// index number(index 6 will be remove 0 1 2 3...)
                 System.out.println("after deleting one students details"+"\n");
                 for(Student s: StudentDetails) {
                 System.out.println("roll: "+s.getRollNumber()+" mobile number: "+s.getMobileNumber());
                 }
                 System.out.println();
                 //Insert a new student details in the list
                 StudentDetails.add(new Student(111, "Ravin", "1234567890")); 
     //new hai, means constructor se object create and space but how to replace it by other's details
                 for(Student s: StudentDetails) {
                     System.out.println("roll: "+s.getRollNumber()+" mobile number: "+s.getMobileNumber());
                     }
                 //Replace a student details in the list
                 s3.setRollNumber(112);
                 s3.setName("Dhoni");
                 s3.setMobileNumber("7775452145");
                 System.out.println();
                 System.out.println("roll: "+s3.getRollNumber()+" mobile number: "+s3.getMobileNumber());
                 //Iterate over the list and check if a mobile number is present in the list
                 for(Student s: StudentDetails) {
                 String mobileNumberToSearch=s.mobileNumber;
                 if (s.getMobileNumber().equals(mobileNumberToSearch)) {
                	 System.out.println("mobile number is present: "+mobileNumberToSearch);
                 } else {
                	 System.out.println("mobile number not present in list");
                 }
                 }
	} 

}
