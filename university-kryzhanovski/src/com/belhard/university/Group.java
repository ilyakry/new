package com.belhard.university;

public class Group {
	public static void main(String args[]) {

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
