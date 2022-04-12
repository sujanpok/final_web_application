package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dataInput.Input;
import com.example.demo.dataInput.UserInfo;




@Mapper
public interface  UserMapper {
	

	int doCheck(Input request);

	 public void insertNewUser(Input userRequest);

	UserInfo getUserInfo(Input request);

	
	public List<Input> find();
	
	
	


	
}