/** 
 * User
 * 2015/08/18
 * chunming
 */
package com.yimeicloud.study.entity;
public class User {
	private String id;
	private String name;
	private String code;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void print() {
		System.out.println(id + " " + code + " " + name);
	}
}
