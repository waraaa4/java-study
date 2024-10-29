package main;

import java.util.ArrayList;
import java.util.List;

public class Quiz5 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1, "둘리"));
		students.add(new Student(2, "또치"));
		students.add(new Student(3, "도우너"));

		for (Student student : students) {
			System.out.println(student);
		}

	}

}

class Student {
	int no;
	String name;

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

}