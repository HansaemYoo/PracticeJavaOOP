package javaOOP04;

//4.객체의 속성은 멤버 변수로, 객체의 기능은 메소드로
public class StudentTest {

	public static void main(String[] args) {

		//객체생성
		Student st1 = new Student();
		Student st2 = new Student();
		
		//st1 객체초기화
		st1.name = "유";
		st1.age = 24;
		st1.grade = 3;
		st1 .address = "서울특별시";
		
		st1.studentInfo(); //메소드호출
		
		//st2 객체초기화
		st2.name = "샘";
		st2.age = 24;
		st2.grade = 3;
		st2.address = "성동구";
		
		st2.studentInfo(); //메소드호출
		
	}

}
