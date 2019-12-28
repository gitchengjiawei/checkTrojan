package com.check.jar.bean;

/** 
* @author: wkn
* @date：2019年11月28日 下午1:11:05 
* 
*/
public class WaIspInfo {
	private Long id;
	private String startIp;
	private String endIp;
	private String ispType;
	private String ispName;
	private String ispAddress;
	private Long siteId;

	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStartIp() {
		return startIp;
	}
	public void setStartIp(String startIp) {
		this.startIp = startIp;
	}
	public String getEndIp() {
		return endIp;
	}
	public void setEndIp(String endIp) {
		this.endIp = endIp;
	}
	public String getIspType() {
		return ispType;
	}
	public void setIspType(String ispType) {
		this.ispType = ispType;
	}
	public String getIspName() {
		return ispName;
	}
	public void setIspName(String ispName) {
		this.ispName = ispName;
	}
	public String getIspAddress() {
		return ispAddress;
	}
	public void setIspAddress(String ispAddress) {
		this.ispAddress = ispAddress;
	}
	
}
