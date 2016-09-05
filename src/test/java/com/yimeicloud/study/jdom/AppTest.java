package com.yimeicloud.study.jdom;

import java.util.List;

import org.junit.Test;

import com.yimeicloud.study.entity.Book;
import com.yimeicloud.study.entity.User;
import com.yimeicloud.study.util.XMLUtil;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
    public void readTest() {
    	
		XMLUtil xmlUtil = new XMLUtil();
		List<User> userList = null;
		List<Book> bookList = null;

		// read from userandbook.xml
		userList = xmlUtil.readXML("userandbook.xml", User.class);
		if(null != userList) {
			for(User user : userList) {
				user.print();
			}
			// write to user.xml
			xmlUtil.writeXML(userList, "user.xml", User.class);
		}
		
		// read from userandbook.xml
		bookList = xmlUtil.readXML("userandbook.xml", Book.class);
		if(null != bookList) {
			for(Book book : bookList) {
				book.print();
			}
			// write to user.xml
			xmlUtil.writeXML(bookList, "book.xml", Book.class);
		}
    }
}
