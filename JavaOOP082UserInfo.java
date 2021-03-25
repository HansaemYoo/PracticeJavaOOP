package javaOOP08;

//8. 복습하기
public class JavaOOP082UserInfo {

	//필드
	public String name;
	public int hight;
	public int weight;
	public int age;
	
	//생성자
	public JavaOOP082UserInfo(String name, int hight, int weight, int age) {
		this.name = name;
		this.hight = hight;
		this.weight = weight;
		this.age = age;
	}
	
	//메소드
	public String toStr() {
		return String.format("키가 %d이고 몸무게가 %d 킬로인 남성이 있습니다. 이름은 %s이고 나이는 %d세 입니다.", this.hight, this.weight, this.name, this.age);
	}
}
