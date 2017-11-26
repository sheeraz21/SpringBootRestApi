/**
 * 
 */
package com.intellectdesign.dao;



/**
 * @author Syed Sheeraz Shaukat
 *
 */
public interface IUserDao {
	
	public void addUser(UserEntity userEntity);
	
	public void deleteUser(int Id );
	
	public void updateUser(UserEntity userEntity);
	
	 public boolean userExists(String Email , boolean isActive);
	
	

}
