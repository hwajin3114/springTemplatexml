package com.company.app.emp.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.config.DBConfiguration;
import com.company.app.config.MybatisConfiguration;
import com.company.app.emp.service.Dept;

import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DBConfiguration.class,MybatisConfiguration.class } )
public class EmpMapperClient {

	@Autowired EmpMapper empMapper;
	@Autowired DeptMapper deptMapper;	// new로 생성하지 않아도 자동으로 가져온다. 
	// autowired는 이걸 사용할거니까 호출해달라 뭐 이런 의미
	private static Logger LOGGER = LoggerFactory.getLogger(Log4j2.class);

	//@Test
	public void deptListTest() {
		List<Dept> list = deptMapper.getDeptList();
		for(Dept dept : list) {
			System.out.println(dept.getDepartmentName());
		}
	}
	
	@Test
	public void getDept() {
		Dept dept = new Dept();
		dept.setDepartmentId("10");
//		dept = deptMapper.getDept(dept);
		dept = deptMapper.getDept(dept);
		System.out.println("======" + dept);
	}
	
	//@Test
	public void test() {
		LOGGER.debug("log test");
		System.out.println(empMapper.getEmpList().toString());
	}
}
