package member.moder.vo;

public class Vip {
	private String Vipname;
	private String Vipgrade;

	private int VipPoint;

	public String getVipname() {
		return Vipname;
	}

	public void setVipname(String vipname) {
		Vipname = vipname;
	}

	public String getVipgrade() {
		return Vipgrade;
	}

	public void setVipgrade(String vipgrade) {
		Vipgrade = vipgrade;
	}

	public int getVipPoint() {
		return VipPoint;
	}

	public void setVipPoint(int vipPoint) {
		VipPoint = vipPoint;
	}

	public Vip() {
	}

	public Vip(String vipname, String vipgrade, int vipPoint) {
		Vipname = vipname;
		Vipgrade = vipgrade;
		VipPoint = vipPoint;
	}
	public double getVipPrint() {
		return VipPoint *0.1;
				
	}
	

}
