package com.intellectdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.intellectdesign.dao.UserEntity;
import com.intellectdesign.service.IUserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	IUserService userService;

	@PostMapping("add")
	public ResponseEntity<Void> addUser(@RequestBody UserEntity userEntity,
			UriComponentsBuilder builder) {
		boolean flag = userService.addUser(userEntity);
		if (flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/add/{id}").buildAndExpand(userEntity.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@DeleteMapping("delete/{Id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("Id") int Id) {
		userService.deleteUser(Id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@PutMapping("update")
	public ResponseEntity<UserEntity> updateArticle(
			@RequestBody UserEntity userEntity) {
		userService.updateUser(userEntity);
		return new ResponseEntity<UserEntity>(userEntity, HttpStatus.OK);
	}

}
