package com.bdi.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.service.AwsTBLService;
import com.bdi.sp.vo.AwsTBLVO;

@Controller
public class AwsTBLController {
	
	@Autowired
	private AwsTBLService as;
	@GetMapping("/awstbls")
	public @ResponseBody List<AwsTBLVO> getAwsTBLList(){
		return as.selectAwsTBLList();	
	}
}
