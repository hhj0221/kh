package member.moder.vo;

public class Silver {

	private String SilverName;
	private String SilverGrade;
	private int SilverPoint;

	
	public Silver() {
	}

	public Silver(String silverName, String silverGrade, int silverPoint) {
		this.SilverName = silverName;
		this.SilverGrade = silverGrade;
		this.SilverPoint = silverPoint;
	}

	public String getSilverName() {
		return SilverName;
	}

	public void setSilverName(String silverName) {
		SilverName = silverName;
	}

	public String getSilverGrade() {
		return SilverGrade;
	}

	public void setSliverGrade(String silverGrade) {
		SilverGrade = silverGrade;
	}

	public int getSilverPoint() {
		return SilverPoint;
	}

	public void setSilverPoint(int silverPoint) {
		SilverPoint = silverPoint;
	}

	public double getPoint() {
		return SilverPoint * 0.02;
	}
}
