package com.check.jar.bean;

import java.util.Date;

/**
 * 僵尸木马事件实体类
 * @author 程佳伟
 */
public class WaBotnetTrojanResult {

	private Long id;
	private String sourceCatagory;
	private String source;
	private String typeCode;
	private String basicType;
	private String subType;
	private String detailType;
	private String extensionTypeCode;
	private String extensionType;
	
	private Date findTime;

	private Date day;
	private Integer hour;
	
	private String destPointIp;
	private Long destNumIp;
	private Integer destPort;
	private String destIpOwnership;
	private String destIpRegion;
	private String destIpOperator;
	private Double destIpLongitude;
	private Double destIpLatitude;

	private String sourcePointIp;
	private Long sourceNumIp;
	private Integer sourcePort;
	private String sourceIpOwnership;
	private String sourceIpRegion;
	private String sourceIpOperator;
	private Double sourceIpLongitude;
	private Double sourceIpLatitude;
	
	private String monitorLocType;
	private String monitorRegion;
	private String monitorOperator;
	private String monitorJoinPoint;
	private String monitorNetwork;
	private String monitorGateway;
	private int flag;
	private String returnValue;
	
	private Date createTime;
	
	private Long unitId;
	private String unit;
	private String industry;
	private String business;
	private String county;
	private String address;
	private String unitType;//单位类型
	private String parentDept;//上级部门
	private String contact;//联系人
	private String phone;//联系电话
	private String email;//联系邮箱
	private String icpNumber;//ICP备案号
	private String webAccessType;//互联网接入方式
	private String webAccessPrincipal;//互联网接入商
	private String accessAddress;//接入地址
	private String systemName;
	private String domainUrl;

	private String sourceUnit;
	private Long sourceUnitId;
	private String sourceIndustry;
	private String sourceBusiness;
	private String sourceCounty;
	private String sourceAddress;
	private String sourceUnitType;//单位类型
	private String sourceParentDept;//上级部门
	private String sourceContact;//联系人
	private String sourcePhone;//联系电话
	private String sourceEmail;//联系邮箱
	private String sourceIcpNumber;//ICP备案号
	private String sourceWebAccessType;//互联网接入方式
	private String sourceWebAccessPrincipal;//互联网接入商
	private String sourceAccessAddress;//接入地址
	private String sourceSystemName;
	private String sourceDomainUrl;

	private Integer type;
	private Integer field;
	private Boolean isMore;
	private String isMoreText;
	private Integer unitNum;
	
	private Integer sourceUnitNum;
	
	public String getIsMoreText() {
		return isMoreText;
	}
	public void setIsMoreText(String isMoreText) {
		this.isMoreText = isMoreText;
	}
	public Integer getUnitNum() {
		return unitNum;
	}
	public void setUnitNum(Integer unitNum) {
		this.unitNum = unitNum;
	}
	public Integer getSourceUnitNum() {
		return sourceUnitNum;
	}
	public void setSourceUnitNum(Integer sourceUnitNum) {
		this.sourceUnitNum = sourceUnitNum;
	}
	public Boolean getIsMore() {
		return isMore;
	}
	public void setIsMore(Boolean isMore) {
		this.isMore = isMore;
	}
	public Long getUnitId() {
		return unitId;
	}
	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public String getDomainUrl() {
		return domainUrl;
	}
	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}
	
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public String getParentDept() {
		return parentDept;
	}
	public void setParentDept(String parentDept) {
		this.parentDept = parentDept;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIcpNumber() {
		return icpNumber;
	}
	public void setIcpNumber(String icpNumber) {
		this.icpNumber = icpNumber;
	}
	public String getWebAccessType() {
		return webAccessType;
	}
	public void setWebAccessType(String webAccessType) {
		this.webAccessType = webAccessType;
	}
	public String getWebAccessPrincipal() {
		return webAccessPrincipal;
	}
	public void setWebAccessPrincipal(String webAccessPrincipal) {
		this.webAccessPrincipal = webAccessPrincipal;
	}
	public String getAccessAddress() {
		return accessAddress;
	}
	public void setAccessAddress(String accessAddress) {
		this.accessAddress = accessAddress;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSourceCatagory() {
		return sourceCatagory;
	}
	public void setSourceCatagory(String sourceCatagory) {
		this.sourceCatagory = sourceCatagory;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getBasicType() {
		return basicType;
	}
	public void setBasicType(String basicType) {
		this.basicType = basicType;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public String getDetailType() {
		return detailType;
	}
	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}
	public String getExtensionTypeCode() {
		return extensionTypeCode;
	}
	public void setExtensionTypeCode(String extensionTypeCode) {
		this.extensionTypeCode = extensionTypeCode;
	}
	public String getExtensionType() {
		return extensionType;
	}
	public void setExtensionType(String extensionType) {
		this.extensionType = extensionType;
	}
	public Date getFindTime() {
		return findTime;
	}
	public void setFindTime(Date findTime) {
		this.findTime = findTime;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public String getDestPointIp() {
		return destPointIp;
	}
	public void setDestPointIp(String destPointIp) {
		this.destPointIp = destPointIp;
	}
	public Long getDestNumIp() {
		return destNumIp;
	}
	public void setDestNumIp(Long destNumIp) {
		this.destNumIp = destNumIp;
	}
	public Integer getDestPort() {
		return destPort;
	}
	public void setDestPort(Integer destPort) {
		this.destPort = destPort;
	}
	public String getDestIpOwnership() {
		return destIpOwnership;
	}
	public void setDestIpOwnership(String destIpOwnership) {
		this.destIpOwnership = destIpOwnership;
	}
	public String getDestIpRegion() {
		return destIpRegion;
	}
	public void setDestIpRegion(String destIpRegion) {
		this.destIpRegion = destIpRegion;
	}
	public String getDestIpOperator() {
		return destIpOperator;
	}
	public void setDestIpOperator(String destIpOperator) {
		this.destIpOperator = destIpOperator;
	}
	public Double getDestIpLongitude() {
		return destIpLongitude;
	}
	public void setDestIpLongitude(Double destIpLongitude) {
		this.destIpLongitude = destIpLongitude;
	}
	public Double getDestIpLatitude() {
		return destIpLatitude;
	}
	public void setDestIpLatitude(Double destIpLatitude) {
		this.destIpLatitude = destIpLatitude;
	}
	public String getSourcePointIp() {
		return sourcePointIp;
	}
	public void setSourcePointIp(String sourcePointIp) {
		this.sourcePointIp = sourcePointIp;
	}
	public Long getSourceNumIp() {
		return sourceNumIp;
	}
	public void setSourceNumIp(Long sourceNumIp) {
		this.sourceNumIp = sourceNumIp;
	}
	public Integer getSourcePort() {
		return sourcePort;
	}
	public void setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
	}
	public String getSourceIpOwnership() {
		return sourceIpOwnership;
	}
	public void setSourceIpOwnership(String sourceIpOwnership) {
		this.sourceIpOwnership = sourceIpOwnership;
	}
	public String getSourceIpRegion() {
		return sourceIpRegion;
	}
	public void setSourceIpRegion(String sourceIpRegion) {
		this.sourceIpRegion = sourceIpRegion;
	}
	public String getSourceIpOperator() {
		return sourceIpOperator;
	}
	public void setSourceIpOperator(String sourceIpOperator) {
		this.sourceIpOperator = sourceIpOperator;
	}
	public Double getSourceIpLongitude() {
		return sourceIpLongitude;
	}
	public void setSourceIpLongitude(Double sourceIpLongitude) {
		this.sourceIpLongitude = sourceIpLongitude;
	}
	public Double getSourceIpLatitude() {
		return sourceIpLatitude;
	}
	public void setSourceIpLatitude(Double sourceIpLatitude) {
		this.sourceIpLatitude = sourceIpLatitude;
	}
	public String getMonitorLocType() {
		return monitorLocType;
	}
	public void setMonitorLocType(String monitorLocType) {
		this.monitorLocType = monitorLocType;
	}
	public String getMonitorRegion() {
		return monitorRegion;
	}
	public void setMonitorRegion(String monitorRegion) {
		this.monitorRegion = monitorRegion;
	}
	public String getMonitorOperator() {
		return monitorOperator;
	}
	public void setMonitorOperator(String monitorOperator) {
		this.monitorOperator = monitorOperator;
	}
	public String getMonitorJoinPoint() {
		return monitorJoinPoint;
	}
	public void setMonitorJoinPoint(String monitorJoinPoint) {
		this.monitorJoinPoint = monitorJoinPoint;
	}
	public String getMonitorNetwork() {
		return monitorNetwork;
	}
	public void setMonitorNetwork(String monitorNetwork) {
		this.monitorNetwork = monitorNetwork;
	}
	public String getMonitorGateway() {
		return monitorGateway;
	}
	public void setMonitorGateway(String monitorGateway) {
		this.monitorGateway = monitorGateway;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getReturnValue() {
		return returnValue;
	}
	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getField() {
		return field;
	}
	public void setField(Integer field) {
		this.field = field;
	}

	public String getSourceUnit() {
		return sourceUnit;
	}

	public void setSourceUnit(String sourceUnit) {
		this.sourceUnit = sourceUnit;
	}
	public Long getSourceUnitId() {
		return sourceUnitId;
	}
	public void setSourceUnitId(Long sourceUnitId) {
		this.sourceUnitId = sourceUnitId;
	}

	public String getSourceIndustry() {
		return sourceIndustry;
	}

	public void setSourceIndustry(String sourceIndustry) {
		this.sourceIndustry = sourceIndustry;
	}

	public String getSourceBusiness() {
		return sourceBusiness;
	}

	public void setSourceBusiness(String sourceBusiness) {
		this.sourceBusiness = sourceBusiness;
	}

	public String getSourceCounty() {
		return sourceCounty;
	}

	public void setSourceCounty(String sourceCounty) {
		this.sourceCounty = sourceCounty;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getSourceUnitType() {
		return sourceUnitType;
	}

	public void setSourceUnitType(String sourceUnitType) {
		this.sourceUnitType = sourceUnitType;
	}

	public String getSourceParentDept() {
		return sourceParentDept;
	}

	public void setSourceParentDept(String sourceParentDept) {
		this.sourceParentDept = sourceParentDept;
	}

	public String getSourceContact() {
		return sourceContact;
	}

	public void setSourceContact(String sourceContact) {
		this.sourceContact = sourceContact;
	}

	public String getSourcePhone() {
		return sourcePhone;
	}

	public void setSourcePhone(String sourcePhone) {
		this.sourcePhone = sourcePhone;
	}

	public String getSourceEmail() {
		return sourceEmail;
	}

	public void setSourceEmail(String sourceEmail) {
		this.sourceEmail = sourceEmail;
	}

	public String getSourceIcpNumber() {
		return sourceIcpNumber;
	}

	public void setSourceIcpNumber(String sourceIcpNumber) {
		this.sourceIcpNumber = sourceIcpNumber;
	}

	public String getSourceWebAccessType() {
		return sourceWebAccessType;
	}

	public void setSourceWebAccessType(String sourceWebAccessType) {
		this.sourceWebAccessType = sourceWebAccessType;
	}

	public String getSourceWebAccessPrincipal() {
		return sourceWebAccessPrincipal;
	}

	public void setSourceWebAccessPrincipal(String sourceWebAccessPrincipal) {
		this.sourceWebAccessPrincipal = sourceWebAccessPrincipal;
	}

	public String getSourceAccessAddress() {
		return sourceAccessAddress;
	}

	public void setSourceAccessAddress(String sourceAccessAddress) {
		this.sourceAccessAddress = sourceAccessAddress;
	}

	public String getSourceSystemName() {
		return sourceSystemName;
	}

	public void setSourceSystemName(String sourceSystemName) {
		this.sourceSystemName = sourceSystemName;
	}

	public String getSourceDomainUrl() {
		return sourceDomainUrl;
	}

	public void setSourceDomainUrl(String sourceDomainUrl) {
		this.sourceDomainUrl = sourceDomainUrl;
	}
}
