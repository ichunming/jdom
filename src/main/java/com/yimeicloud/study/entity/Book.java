/**
 * Book
 * 2015/08/18
 * chunming
 */
package com.yimeicloud.study.entity;

public class Book {
	private String id;
	private String title;
	private String author;
	private String price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void print() {
		System.out.println(id + " " + title + " " + author + " " + price);
	}
}
