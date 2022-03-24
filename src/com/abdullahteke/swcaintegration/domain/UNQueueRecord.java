package com.abdullahteke.swcaintegration.domain;

public class UNQueueRecord {
	private int id;
	private String birimID;
	private int callReqID;
	private int process;
	private long insertedTime;
	private long openDate;
	private int openHatTipiID;
	private String openHatTipi;
	private int openHatKapasitesiID;
	private String openHatKapasitesi;
	private float openHatUcreti;
	private long closeDate;
	private int closeHatTipiID;
	private String closeHatTipi;
	private int closeHatKapasitesiID;
	private String closeHatKapasitesi;
	private float closeHatUcreti;
	private String logdescription;
	private String UnManaged;
	private String ipAddress;
	private String locationName;
	private String locUUID;
	private String locTemosNo;
	private String locKurumTipi;
	

	
	public UNQueueRecord() {
		this.id=-1;
		this.birimID = "";
		this.process = -1;
		this.callReqID = -1;
		this.insertedTime=-1;
		this.openDate = -1;
		this.openHatTipiID = -1;
		this.openHatTipi = "";
		this.openHatKapasitesiID = -1;
		this.openHatKapasitesi = "";
		this.openHatUcreti=0;
		this.closeDate = -1;
		this.closeHatTipiID = -1;
		this.closeHatTipi = "";
		this.closeHatKapasitesiID = -1;
		this.closeHatKapasitesi = "";
		this.closeHatUcreti=0;
		this.logdescription="";
		this.UnManaged="";
		this.ipAddress="";
		this.locationName="";
		this.locUUID="";
		this.locTemosNo="";
		this.locKurumTipi="";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBirimID() {
		return birimID;
	}


	public void setBirimID(String birimID) {
		this.birimID = birimID;
	}


	public int getCallReqID() {
		return callReqID;
	}


	public void setCallReqID(int callReqID) {
		this.callReqID = callReqID;
	}


	public int getProcess() {
		return process;
	}


	public void setProcess(int process) {
		this.process = process;
	}


	public long getInsertedTime() {
		return insertedTime;
	}


	public void setInsertedTime(long insertedTime) {
		this.insertedTime = insertedTime;
	}


	public long getOpenDate() {
		return openDate;
	}


	public void setOpenDate(long openDate) {
		this.openDate = openDate;
	}


	public int getOpenHatTipiID() {
		return openHatTipiID;
	}


	public void setOpenHatTipiID(int openHatTipiID) {
		this.openHatTipiID = openHatTipiID;
	}


	public String getOpenHatTipi() {
		return openHatTipi;
	}


	public void setOpenHatTipi(String openHatTipi) {
		this.openHatTipi = openHatTipi;
	}


	public int getOpenHatKapasitesiID() {
		return openHatKapasitesiID;
	}


	public void setOpenHatKapasitesiID(int openHatKapasitesiID) {
		this.openHatKapasitesiID = openHatKapasitesiID;
	}


	public String getOpenHatKapasitesi() {
		return openHatKapasitesi;
	}


	public void setOpenHatKapasitesi(String openHatKapasitesi) {
		this.openHatKapasitesi = openHatKapasitesi;
	}


	public float getOpenHatUcreti() {
		return openHatUcreti;
	}


	public void setOpenHatUcreti(float openHatUcreti) {
		this.openHatUcreti = openHatUcreti;
	}


	public long getCloseDate() {
		return closeDate;
	}


	public void setCloseDate(long closeDate) {
		this.closeDate = closeDate;
	}


	public int getCloseHatTipiID() {
		return closeHatTipiID;
	}


	public void setCloseHatTipiID(int closeHatTipiID) {
		this.closeHatTipiID = closeHatTipiID;
	}


	public String getCloseHatTipi() {
		return closeHatTipi;
	}


	public void setCloseHatTipi(String closeHatTipi) {
		this.closeHatTipi = closeHatTipi;
	}


	public int getCloseHatKapasitesiID() {
		return closeHatKapasitesiID;
	}


	public void setCloseHatKapasitesiID(int closeHatKapasitesiID) {
		this.closeHatKapasitesiID = closeHatKapasitesiID;
	}


	public String getCloseHatKapasitesi() {
		return closeHatKapasitesi;
	}


	public void setCloseHatKapasitesi(String closeHatKapasitesi) {
		this.closeHatKapasitesi = closeHatKapasitesi;
	}


	public float getCloseHatUcreti() {
		return closeHatUcreti;
	}


	public void setCloseHatUcreti(float closeHatUcreti) {
		this.closeHatUcreti = closeHatUcreti;
	}


	public String getLogdescription() {
		return logdescription;
	}


	public void setLogdescription(String logdescription) {
		this.logdescription = logdescription;
	}



}
