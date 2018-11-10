package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.AwsTBLVO;

public interface AwsTBLDAO {

	public List<AwsTBLVO> selectAwsTBLList();
	public AwsTBLVO selectAwsTBL(int atnum);
	public Integer insertAwsTBL(AwsTBLVO aws);
	public Integer updateAwsTBL(AwsTBLVO aws);
	public Integer deleteAwsTBL(int atnum);
}
