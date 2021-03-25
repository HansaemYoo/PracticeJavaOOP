package javaOOP09;

//9. 참조자료형
public class JavaOOP09Student {
	
	//필드
	String studentName;
	int studentId;
	
	//참조 자료형
	JavaOOP09Subject korean;
	JavaOOP09Subject math;
	
	//생성자
	JavaOOP09Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		//참조자료형을 사용하려면 객체를 만들어야 된다.
		korean = new JavaOOP09Subject();
		math = new JavaOOP09Subject();
	}
	
	
	//메소드
	public void setKorean(String subjectName, int score) {
		korean.subjectName = subjectName;
		korean.score = score;
	}
	
	public void setMath(String subjectName, int score) {
		math.subjectName = subjectName;
		math.score = score;
	}
	
	public void showScore() { //점수계산
		int totalScore = korean.score + math.score;
		int koreanScore = korean.score;
		int mathScore = math.score;
		
		System.out.printf("%s학생의 총점은 %d점이며, 국어는 %d점, 수학은 %d점이다.\n", studentName, totalScore, koreanScore, mathScore);
	}
}
