package javaOOP10;

//10. 접근제한자-쓸데없는 데이터의 도용을 막아준다.
public class JavaOOP10BirthDayTest {

	public static void main(String[] args) {

		JavaOOP10Birthday date = new JavaOOP10Birthday();
		date.setYear(1998);
		date.setMonth(04);
		date.setDay(16);
		
		date.showDate();
	}

}
