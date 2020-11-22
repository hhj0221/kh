package kh.java.oop.student;

public class Run {

	public static void main(String[] args) {
		
		Student s= new Student();
		s.setName("황현준");
		s.setAge(20);
		s.setGender('남');
		s.introduce();
		Student s1= new Student();
		s1.setName("김영의");
		s1.setAge(20);
		s1.setGender('여');
		s1.introduce();
	
	
	}

}
