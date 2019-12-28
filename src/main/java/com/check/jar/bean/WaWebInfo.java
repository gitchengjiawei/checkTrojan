package com.check.jar.bean;

import java.util.Date;

/** 
* @author: wkn
* @date：2019年11月28日 下午1:21:48 
* 
*/
public class WaWebInfo {
	private Long id;
	private String webHead;
	private String webTel;
	private String webEmail;
	private String webName;
	private String webDns;
	private String webRecord;
	private String webCerno;
	private String webCertype;
	private Long siteId;
	private Date webFirstReportTime;
	private Date createTime;
	public String getWebHead() {
		return webHead;
	}
	public void setWebHead(String webHead) {
		this.webHead = webHead;
	}
	public String getWebTel() {
		return webTel;
	}
	public void setWebTel(String webTel) {
		this.webTel = webTel;
	}
	public String getWebEmail() {
		return webEmail;
	}
	public void setWebEmail(String webEmail) {
		this.webEmail = webEmail;
	}
	public String getWebName() {
		return webName;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}
	public String getWebDns() {
		return webDns;
	}
	public void setWebDns(String webDns) {
		this.webDns = webDns;
	}
	public String getWebRecord() {
		return webRecord;
	}
	public void setWebRecord(String webRecord) {
		this.webRecord = webRecord;
	}
	public String getWebCerno() {
		return webCerno;
	}
	public void setWebCerno(String webCerno) {
		this.webCerno = webCerno;
	}
	public String getWebCertype() {
		return webCertype;
	}
	public void setWebCertype(String webCertype) {
		this.webCertype = webCertype;
	}
	public Date getWebFirstReportTime() {
		return webFirstReportTime;
	}
	public void setWebFirstReportTime(Date webFirstReportTime) {
		this.webFirstReportTime = webFirstReportTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	
}
