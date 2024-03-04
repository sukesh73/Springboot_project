package com.wissen.dao;


import org.springframework.data.repository.CrudRepository;


import com.wissen.entities.User;


public interface UserRepository extends CrudRepository<User, Integer>
{


	
}
