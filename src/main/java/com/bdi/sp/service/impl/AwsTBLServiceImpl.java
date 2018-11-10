package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.AwsTBLDAO;
import com.bdi.sp.service.AwsTBLService;
import com.bdi.sp.vo.AwsTBLVO;

@Service
public class AwsTBLServiceImpl implements AwsTBLService {

	@Autowired
	private AwsTBLDAO atdao;
	@Override
	public List<AwsTBLVO> selectAwsTBLList() {
		// TODO Auto-generated method stub
		return atdao.selectAwsTBLList();
	}

	@Override
	public AwsTBLVO selectAwsTBL(int atnum) {
		// TODO Auto-generated method stub
		return atdao.selectAwsTBL(atnum);
	}

	@Override
	public Integer insertAwsTBL(AwsTBLVO aws) {
		// TODO Auto-generated method stub
		return atdao.insertAwsTBL(aws);
	}

	@Override
	public Integer updateAwsTBL(AwsTBLVO aws) {
		// TODO Auto-generated method stub
		return atdao.updateAwsTBL(aws);
	}

	@Override
	public Integer deleteAwsTBL(int atnum) {
		// TODO Auto-generated method stub
		return atdao.deleteAwsTBL(atnum);
	}

}
