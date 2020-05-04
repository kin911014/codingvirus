package com.douzone.codingvirus19.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.codingvirus19.vo.UserVo;
@Repository
public class UserRepository {
	
	@Autowired
	private SqlSession sqlSession;

	public List<UserVo> findAll() {
		return sqlSession.selectOne("user.findAll");
	}
	
//	public UserVo findAll() {
//		return sqlSession.selectOne("user.findAll");
//	}

}
