package member.moder.vo;

public class Gold {
	private String Goldname;
	private String Goldgrade;
	private int Goldpoint;

	public Gold() {

	}

	public Gold(String goldname, String goldgrade, int goldpoint) {

		this.Goldname = goldname;
		this.Goldgrade = goldgrade;
		this.Goldpoint = goldpoint;
	}
	public String getGoldname() {
		return Goldname;
	}

	public void setGoldname(String goldname) {
		Goldname = goldname;
	}

	public String getGoldgrade() {
		return Goldgrade;
	}

	public void setGoldgrade(String goldgrade) {
		Goldgrade = goldgrade;
	}

	public int getGoldpoint() {
		return Goldpoint;
	}

	public void setGoldpoint(int goldpoint) {
		Goldpoint = goldpoint;
	}

	public double getGoPoint() {
		return Goldpoint*0.05;
	}

}
