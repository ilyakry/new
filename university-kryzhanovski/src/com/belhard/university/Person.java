package com.belhard.university;

public class Person {
	protected String Name;

	public void SetName(String PersonName) {
		Name = PersonName;
	}

	public String GetName() {
		return Name;
	}

	protected String Surname;

	public void SetSurname(String PersonSurname) {
		Surname = PersonSurname;
	}

	public String GetSurname() {
		return Surname;
	}

	protected int Age;

	public void SetAge(int PersonAge) {
		Age = PersonAge;
	}

	public int GetAge() {
		return Age;
	}

	public int Id;

	int a = 0;
	int b = 100000000;
	double PersonId = a + Math.random() * b;

	public void SetId(int PersonId) {
		Id = PersonId;
	}

	public int GetId() {
		return Id = (int) PersonId;
	}

	public void Info() {
		System.out.println("Name: " + Name + " \tSurname: " + Surname + "\tAge: " + Age + "\tID: " + Id);
	}

}
