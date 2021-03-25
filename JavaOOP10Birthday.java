package javaOOP10;

//10. 접근제한자-쓸데없는 데이터의 도용을 막아준다.
public class JavaOOP10Birthday {

	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	
	//게터, 세터
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month <1 || month>12) {
			isValid = false;
		} else {
			isValid = true;
		}
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid == true) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
