package javaOOP04;

//4.객체의 속성은 멤버 변수로, 객체의 기능은 메소드로
public class Student {
	
	//필드
	public String name;
	public String address;
	public int age;
	public int grade;
		
	//메소드
	public void studentInfo() {
		System.out.println("학생의 이름은 " + name + "이고,주소는 " + address + "입니다.");
	}

}