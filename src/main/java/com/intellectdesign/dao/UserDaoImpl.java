package com.intellectdesign.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserDaoImpl implements IUserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addUser(UserEntity userEntity) {

		entityManager.merge(userEntity);
	}

	@Override
	public void deleteUser(int Id) {

		UserEntity user = new UserEntity();
		user.setId(Id);
		String hql = "UPDATE UserEntity set isActive = false where Id= :Id ";
		Query query = entityManager.createQuery(hql);
		query.setParameter("Id", user.getId());
		query.executeUpdate();

	}

	@Override
	public void updateUser(UserEntity userEntity) {

		String hql = "UPDATE UserEntity set PinCode = :PinCode , BirthDate = :BirthDate"
				+ " WHERE Id = :Id";
		Query query = entityManager.createQuery(hql);
		query.setParameter("Id", userEntity.getId());
		query.setParameter("PinCode", userEntity.getPinCode());
		query.setParameter("BirthDate", userEntity.getBirthDate());
		query.executeUpdate();

	}

	@Override
	public boolean userExists(String Email, boolean isActive) {
		String hql = "FROM UserEntity as user WHERE user.Email = ? and isActive = ? ";
		int count = entityManager.createQuery(hql).setParameter(1, Email)
				.setParameter(2, isActive).getResultList().size();
		return count > 0 ? true : false;
	}

}
