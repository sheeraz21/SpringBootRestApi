package com.intellectdesign.intellectdesign;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.intellectdesign.dao.UserEntity;
import com.intellectdesign.service.IUserService;

import junit.framework.TestCase;

public class UserServiceTest extends TestCase {

	@Autowired
	IUserService userService;

	Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11)
	.getTime();
	
	

	@Test( )
    public void testAddUser(){
		
		UserEntity user = new UserEntity();
		user.setEmail("John@gmail.com");
		user.setFirstName("Johan");
		user.setFirstName("Sam");
		user.setPinCode(2221);
		user.setBirthDate((java.sql.Date) date);
		assertNull(null, userService.addUser(user));
		assertEquals(user, userService.addUser(user));
	
}



}
