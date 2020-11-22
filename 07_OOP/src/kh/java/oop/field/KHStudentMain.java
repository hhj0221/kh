package kh.java.oop.field;

public class KHStudentMain {
	public static void main(String[] args) {
		KHStudent kh1 = new KHStudent();
		kh1.setName("황현준");
		kh1.setKh("M-201호");
		kh1.setKh_Number("010-1234-1234");
		System.out.println(KHStudent.KH_NAME);
		System.out.println(KHStudent.KH_NUMBER);
		System.out.printf("이름 :%s 강의실 :%s%n %s번호입니다 %n", kh1.getName(), kh1.getKh(), kh1.getKh_Number());
	
		KHStudent kh2 = new KHStudent();
		kh2.setName("홍길동");
		kh2.setKh("M-202호");
		kh2.setKh_Number("010-1234-2323");
		System.out.println(KHStudent.KH_NAME);
		System.out.println(KHStudent.KH_NUMBER);
		System.out.printf("이름 :%s 강의실 :%s%n %s번호입니다 %n", kh2.getName(), kh2.getKh(), kh2.getKh_Number());
	}

}
