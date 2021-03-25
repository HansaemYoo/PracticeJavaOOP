package javaOOP09;

//9. 참조자료형
public class JavaOOP09SubjectTest {
			
	public static void main(String[] args) {

		//객체생성
		JavaOOP09Student stdYoo = new JavaOOP09Student(9804, "유");
		stdYoo.setKorean("국어", 98);
		stdYoo.setMath("수학", 88);
		
		JavaOOP09Student stdKim = new JavaOOP09Student(0416, "김");
		stdKim.setKorean("국어", 88);
		stdKim.setMath("수학", 78);
		
		//출력
		stdYoo.showScore();
		stdKim.showScore();
	}

}
