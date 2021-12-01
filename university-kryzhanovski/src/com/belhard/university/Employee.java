package com.belhard.university;

public abstract class Employee extends Person {
	private double Salary;

	public void SetSalary(Double EmployeeSalary) {
		Salary = EmployeeSalary;
	}

	public double GetSalary() {
		return Salary;
	}

	private int WorkTime;

	public void SetWorkTime(int EmployeeWorkTime) {
		WorkTime = EmployeeWorkTime;
	}

	public int GetWorkTime() {
		return WorkTime;
	}

	static class Teacher extends Employee {
	
		public void Info() {
			System.out.println("Teacher: ");
			System.out.println("Name: " + Name + " \tSurname: " + Surname + "\tAge: " + Age + "\tID: " + Id);
		}
	}

	static class Cleaner extends Employee {
		private int CleanedRooms;

		public void SetCleanedRooms(int EmpCleanedRooms) {
			CleanedRooms = EmpCleanedRooms;
		}

		public int GetCleanedRooms() {
			return CleanedRooms;
		}

	}

}
