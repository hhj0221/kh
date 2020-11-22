package member.moder.vo;

public class VVip {
		private String VVipName;
		private String VVipgrade;
		private int  VVipPoint;
		
		
		public VVip() {
		}
		public VVip(String vVipName, String vVipgrade, int vVipPoint) {
			VVipName = vVipName;
			VVipgrade = vVipgrade;
			VVipPoint = vVipPoint;
		}
		public String getVVipName() {
			return VVipName;
		}
		public void setVVipName(String vVipName) {
			VVipName = vVipName;
		}
		public String getVVipgrade() {
			return VVipgrade;
		}
		public void setVVipgrade(String vVipgrade) {
			VVipgrade = vVipgrade;
		}
		public int getVVipPoint() {
			return VVipPoint;
		}
		public void setVVipPoint(int vVipPoint) {
			VVipPoint = vVipPoint;
		}
		
}
