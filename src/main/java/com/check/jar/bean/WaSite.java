package com.check.jar.bean;

import java.util.Date;

/** 
* @author: wkn
* @date：2019年11月28日 下午12:56:35 
* 
*/
public class WaSite {
	private Long id;
	private String siteName;
	private Date firstReportTime;
	private Date approveTime;
	private String industryType;
	private String siteType;
	private String parentDept;
	private String siteProvice;
	private String siteCity;
	private String siteCounty;
	private String siteAddress;
	private String siteRecorde;
	private String siteHead;
	private String cerType;
	private String cerNum;
	private String siteCertype;
	private String siteCerno;
	private String siteTel;
	private Date createTime;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Date getFirstReportTime() {
		return firstReportTime;
	}
	public void setFirstReportTime(Date firstReportTime) {
		this.firstReportTime = firstReportTime;
	}
	public Date getApproveTime() {
		return approveTime;
	}
	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getSiteType() {
		return siteType;
	}
	public void setSiteType(String siteType) {
		this.siteType = siteType;
	}
	public String getParentDept() {
		return parentDept;
	}
	public void setParentDept(String parentDept) {
		this.parentDept = parentDept;
	}
	public String getSiteProvice() {
		return siteProvice;
	}
	public void setSiteProvice(String siteProvice) {
		this.siteProvice = siteProvice;
	}
	public String getSiteCity() {
		return siteCity;
	}
	public void setSiteCity(String siteCity) {
		this.siteCity = siteCity;
	}
	public String getSiteCounty() {
		return siteCounty;
	}
	public void setSiteCounty(String siteCounty) {
		this.siteCounty = siteCounty;
	}
	public String getSiteAddress() {
		return siteAddress;
	}
	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}
	public String getSiteRecorde() {
		return siteRecorde;
	}
	public void setSiteRecorde(String siteRecorde) {
		this.siteRecorde = siteRecorde;
	}
	public String getSiteHead() {
		return siteHead;
	}
	public void setSiteHead(String siteHead) {
		this.siteHead = siteHead;
	}
	public String getCerType() {
		return cerType;
	}
	public void setCerType(String cerType) {
		this.cerType = cerType;
	}
	public String getCerNum() {
		return cerNum;
	}
	public void setCerNum(String cerNum) {
		this.cerNum = cerNum;
	}
	public String getSiteCertype() {
		return siteCertype;
	}
	public void setSiteCertype(String siteCertype) {
		this.siteCertype = siteCertype;
	}
	public String getSiteCerno() {
		return siteCerno;
	}
	public void setSiteCerno(String siteCerno) {
		this.siteCerno = siteCerno;
	}
	public String getSiteTel() {
		return siteTel;
	}
	public void setSiteTel(String siteTel) {
		this.siteTel = siteTel;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
