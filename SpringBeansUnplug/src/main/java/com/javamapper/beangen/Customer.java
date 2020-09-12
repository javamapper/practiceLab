package com.javamapper.beangen;

public class Customer {

		private Integer cid;
		private String name;
		private Double investAmt;
		public Integer getCid() {
			return cid;
		}
		public void setCid(Integer cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getInvestAmt() {
			return investAmt;
		}
		public void setInvestAmt(Double investAmt) {
			this.investAmt = investAmt;
		}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", name=" + name + ", investAmt=" + investAmt + "]";
		}
}
