package javaOOP06Constructor;

//6. 생성자
public class Student {

	//필드
	public String name;
	public int age;
	public int grade;
	
	//생성자
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	//메소드
	public String studentInfo() {
		return "학생의 이름은 " + name +"이고, " + grade + "학년입니다.";
	}

}
