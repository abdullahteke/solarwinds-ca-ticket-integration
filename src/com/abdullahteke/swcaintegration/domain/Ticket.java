package com.abdullahteke.swcaintegration.domain;

import java.io.Serializable;

public class Ticket implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2749977649306134186L;
	
	private String prm_process;
	private String prm_zODYA_Devre_Numara ;
	private String prm_zODYA_Kurum_Tipi;
	private String prm_vpn_Bulut_Adi;
	private String prm_sehir;
	private String prm_lokasyonTipi;
	private String prm_birimID;
	private String prm_ip_address;


	



	public Ticket() {

		this.prm_process = "";
		this.prm_zODYA_Devre_Numara = "";
		this.prm_zODYA_Kurum_Tipi = "";
		this.prm_vpn_Bulut_Adi = "";
		this.prm_sehir = "";
		this.prm_lokasyonTipi = "";
		this.prm_birimID = "";
		this.prm_ip_address = "";
	}




	public String getPrm_process() {
		return prm_process;
	}




	public void setPrm_process(String prm_process) {
		this.prm_process = prm_process;
	}




	public String getPrm_zODYA_Devre_Numara() {
		return prm_zODYA_Devre_Numara;
	}




	public void setPrm_zODYA_Devre_Numara(String prm_zODYA_Devre_Numara) {
		this.prm_zODYA_Devre_Numara = prm_zODYA_Devre_Numara;
	}




	public String getPrm_zODYA_Kurum_Tipi() {
		return prm_zODYA_Kurum_Tipi;
	}




	public void setPrm_zODYA_Kurum_Tipi(String prm_zODYA_Kurum_Tipi) {
		this.prm_zODYA_Kurum_Tipi = prm_zODYA_Kurum_Tipi;
	}




	public String getPrm_vpn_Bulut_Adi() {
		return prm_vpn_Bulut_Adi;
	}




	public void setPrm_vpn_Bulut_Adi(String prm_vpn_Bulut_Adi) {
		this.prm_vpn_Bulut_Adi = prm_vpn_Bulut_Adi;
	}




	public String getPrm_sehir() {
		return prm_sehir;
	}




	public void setPrm_sehir(String prm_sehir) {
		this.prm_sehir = prm_sehir;
	}




	public String getPrm_lokasyonTipi() {
		return prm_lokasyonTipi;
	}




	public void setPrm_lokasyonTipi(String prm_lokasyonTipi) {
		this.prm_lokasyonTipi = prm_lokasyonTipi;
	}




	public String getPrm_birimID() {
		return prm_birimID;
	}




	public void setPrm_birimID(String prm_birimID) {
		this.prm_birimID = prm_birimID;
	}




	public String getPrm_ip_address() {
		return prm_ip_address;
	}




	public void setPrm_ip_address(String prm_ip_address) {
		this.prm_ip_address = prm_ip_address;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public boolean equals(Object obj) {
		boolean retVal=false;
		Ticket t=(Ticket) obj;
		
		if(this.prm_birimID.equalsIgnoreCase(t.getPrm_birimID()) && this.prm_process.equalsIgnoreCase(t.getPrm_process())) {
			retVal=true;
		}
		
		return retVal;
	}

	
	
}
