package com.belhard.university;

import com.belhard.university.Employee.Teacher;

public class Group {
	public static void main(String args[]) {

		Student Student1 = new Student();
		Teacher Teacher1 = new Teacher();
		Teacher1.SetName("b");
		Teacher1.SetAge(2);
		Teacher1.GetId();
		Teacher1.SetSurname("b1 ");
		Teacher1.Info();

		Student1.SetName("a");
		Student1.SetAge(1);
		Student1.GetId();
		Student1.SetSurname("a1 ");
		Student1.Info();

	}

	static class Student extends Person {
		private String Adress;
		private String Faculty;

		public void SetFaculty(String StudentFaculty) {
			Adress = StudentFaculty;
		}

		public String GetFaculty() {
			return Faculty;
		}

		public void SetAdress(String StudentAdress) {
			Adress = StudentAdress;
		}

		public String GetAdress() {
			return Adress;
		}
		public void Info() {
			System.out.println("Students: ");
			System.out.println("Name: " + Name + " \tSurname: " + Surname + "\tAge: " + Age + "\tID: " + Id);
		}


	}

}