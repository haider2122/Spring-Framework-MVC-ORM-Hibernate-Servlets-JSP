package com.springcore.ref;

public class Projects {
		private String pjName;
		private String pjId;
		private String pjDuration;
		public String getPjName() {
			return pjName;
		}
		public void setPjName(String pjName) {
			this.pjName = pjName;
		}
		public String getPjId() {
			return pjId;
		}
		public void setPjId(String pjId) {
			this.pjId = pjId;
		}
		public String getPjDuration() {
			return pjDuration;
		}
		public void setPjDuration(String pjDuration) {
			this.pjDuration = pjDuration;
		}
		@Override
		public String toString() {
			return "Projects [pjName=" + pjName + ", pjId=" + pjId + ", pjDuration=" + pjDuration + "]";
		}
		public Projects(String pjName, String pjId, String pjDuration) {
			super();
			this.pjName = pjName;
			this.pjId = pjId;
			this.pjDuration = pjDuration;
		}
		public Projects() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
