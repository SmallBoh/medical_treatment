package net.yasite.entity;

import java.io.Serializable;
/**
 * 
 * @author 波波
 * @date 2014/11/25/13:54
 */
@SuppressWarnings("serial")
public class MJosnStringEntity extends Object implements Serializable{
	private String result;
	private String error;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	@Override
	public String toString() {
		return "MJosnStringEntity [result=" + result + ", error=" + error + "]";
	}
}
