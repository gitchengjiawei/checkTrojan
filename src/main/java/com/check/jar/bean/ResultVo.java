package com.check.jar.bean;
/** 
* @author: wkn
* @date：2019年11月4日 下午4:48:29 
* 
*/
public class ResultVo {
	Object data;
	Integer state;
	String msg;
	public ResultVo( Integer state, String msg,Object data) {
		super();
		this.data = data;
		this.state = state;
		this.msg = msg;
	}
	
	public ResultVo(Integer state, String msg) {
		super();
		this.state = state;
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public Integer getState() {
		return state;
	}
	public String getMsg() {
		return msg;
	}
	
}
