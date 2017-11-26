package com.intellectdesign.intellectdesign;

import java.net.URI;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.intellectdesign.dao.UserEntity;

public class UserControllerTest {

	Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();

	public void addArticleDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user/add";
		UserEntity user = new UserEntity();
		user.setEmail("John@gmail.com");
		user.setFirstName("Johan");
		user.setFirstName("Sam");
		user.setPinCode(2221);
		user.setBirthDate((java.sql.Date) date);
		HttpEntity<UserEntity> requestEntity = new HttpEntity<UserEntity>(user,
				headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println(uri.getPath());
	}

	public void deleteUser() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user/delete/{id}";
		HttpEntity<UserEntity> requestEntity = new HttpEntity<UserEntity>(
				headers);
		restTemplate.exchange(url, HttpMethod.DELETE, requestEntity,
				Void.class, 4);
	}

	public void updateArticleDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user/update";
		UserEntity user = new UserEntity();
		// Date date = new Date(2011-12-12);

		user.setBirthDate((java.sql.Date) date);
		user.setPinCode(2232);
		HttpEntity<UserEntity> requestEntity = new HttpEntity<UserEntity>(user,
				headers);
		restTemplate.put(url, requestEntity);
	}

}
