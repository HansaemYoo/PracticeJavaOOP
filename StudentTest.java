package javaOOP06Constructor;

//6. 생성자
public class StudentTest {

	public static void main(String[] args) {
		
		//객체생성
		Student std1 = new Student("유", 24, 3);
		Student std2 = new Student("샘", 23, 2);
		
		//출력
		System.out.println(std1.studentInfo());
		System.out.println(std2.studentInfo());
		
	}

}
