package kh.java.oop.field;

/**
 * Kh학생정보를 다닐 교육원 명 교육원전화번호 학생명 강의장명 전화번호
 * 
 * @author USER
 *
 */

public class KHStudent {
		
	public static final String KH_NAME ="**** KH정보교육원 *****";
	public static final String KH_NUMBER ="**** 02-520-2222 ***";
	
			
	private String name; // 학생명
	private String kh; // 강의장
	private String Kh_Number; //전화번호?

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKh() {
		return kh;
	}

	public void setKh(String kh) {
		this.kh = kh;
	}

	public String getKh_Number() {
		return Kh_Number;
	}

	public void setKh_Number(String kh_Number) {
		Kh_Number = kh_Number;
	}

}
