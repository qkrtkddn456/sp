package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.AwsTBLDAO;
import com.bdi.sp.vo.AwsTBLVO;

@Repository
public class AwsTBLDAOImpl implements AwsTBLDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<AwsTBLVO> selectAwsTBLList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.bdi.sp.AWS_TBL.selectAWSTBLList");
	}

	@Override
	public AwsTBLVO selectAwsTBL(int atnum) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.bdi.sp.AWS_TBL.selectAWSTBL",atnum);
	}

	@Override
	public Integer insertAwsTBL(AwsTBLVO aws) {
		// TODO Auto-generated method stub
		return ss.insert("com.bdi.sp.AWS_TBL.insertAWSTBL",aws);
	}

	@Override
	public Integer updateAwsTBL(AwsTBLVO aws) {
		// TODO Auto-generated method stub
		return ss.update("com.bdi.sp.AWS_TBL.updateAWSTBL",aws);
	}

	@Override
	public Integer deleteAwsTBL(int atnum) {
		// TODO Auto-generated method stub
		return ss.delete("com.bdi.sp.AWS_TBL.deleteAWSTBL",atnum);
	}

}
