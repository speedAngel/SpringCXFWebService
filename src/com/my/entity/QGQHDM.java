package com.my.entity;



public class QGQHDM  {

	private String QHDM;
	private String SZZM;
	private String SM;
	private String QXM;
	private int WLJB;
	public String getQHDM() {
		return QHDM;
	}
	public void setQHDM(String qHDM) {
		QHDM = qHDM;
	}
	public String getSZZM() {
		return SZZM;
	}
	public void setSZZM(String sZZM) {
		SZZM = sZZM;
	}
	public String getSM() {
		return SM;
	}
	public void setSM(String sM) {
		SM = sM;
	}
	public String getQXM() {
		return QXM;
	}
	public void setQXM(String qXM) {
		QXM = qXM;
	}
	public int getWLJB() {
		return WLJB;
	}
	public void setWLJB(int wLJB) {
		WLJB = wLJB;
	}
	public QGQHDM(String qHDM, String sZZM, String sM, String qXM, int wLJB) {
		super();
		QHDM = qHDM;
		SZZM = sZZM;
		SM = sM;
		QXM = qXM;
		WLJB = wLJB;
	}
	
	public QGQHDM(){
     }
	@Override
	public String toString() {
		return "QGQHDM [QHDM=" + QHDM + ", SZZM=" + SZZM + ", SM=" + SM
				+ ", QXM=" + QXM + ", WLJB=" + WLJB + "]";
	}

	
	
}
