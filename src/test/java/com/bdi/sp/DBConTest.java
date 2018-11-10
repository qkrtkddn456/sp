package com.bdi.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bdi.sp.dao.AwsTBLDAO;
import com.bdi.sp.service.AwsTBLService;
import com.bdi.sp.vo.AwsTBLVO;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class DBConTest {

//	@Autowired
//	private SqlSession ss;
//	
//	@Autowired
//	private AwsTBLDAO atdao;
//	
//	@Autowired
//	private AwsTBLService as;
////	@Test
////	public void test() throws SQLException {
////		AwsTBLVO aws = ss.selectOne("com.bdi.sp.AWS_TBL.selectAWSTBL",1);
////		assertNotNull(aws);
////		
////		aws.setAtname("변경");
////		aws.setAtage(22);
////		assertEquals(1, ss.update("com.bdi.sp.AWS_TBL.updateAWSTBL",aws));
////		
////		aws = ss.selectOne("com.bdi.sp.AWS_TBL.selectAWSTBL",1);
////		asserttEquals("변경", aws.getAtname());
////		
////		assertEquals(1, ss.delete("com.bdi.sp.AWS_TBL.deleteAWSTBL",1));
////		assertEquals(1, ss.insert("com.bdi.sp.AWS_TBL.insertAWSTBL",aws));
////		
////		List<AwsTBLVO> atList = ss.selectList("com.bdi.sp.AWS_TBL.selectAWSTBLList");
////		
////		assertEquals(1, atList.size());
////		log.info("atList=>{}",atList);
////		
////	}
//	
//	@Test
//	public void test() throws SQLException {
//		System.out.println(as.selectAwsTBLList());
//		System.out.println(as.selectAwsTBL(2));
//	}
//	
//

}
