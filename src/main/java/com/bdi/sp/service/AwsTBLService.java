package com.bdi.sp.service;

import java.util.List;

import com.bdi.sp.vo.AwsTBLVO;

public interface AwsTBLService {
	public List<AwsTBLVO> selectAwsTBLList();
	public AwsTBLVO selectAwsTBL(int atnum);
	public Integer insertAwsTBL(AwsTBLVO aws);
	public Integer updateAwsTBL(AwsTBLVO aws);
	public Integer deleteAwsTBL(int atnum);
}
