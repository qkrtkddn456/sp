package com.bdi.sp.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Alias("aws")
@Data
public class AwsTBLVO {

	private Integer atnum;
	private String atname;
	private Integer atage;
}
