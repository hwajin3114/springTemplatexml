package com.company.app.emp.service.impl;

import java.util.List;

import com.company.app.emp.service.Dept;

public interface DeptMapper {
	public List<Dept> getDeptList();

	public Dept getDept(Dept dept); // 단건 조회. 매개값으로 vo를 넘겨주면 dept_mapper에서 where절에 대한 placeholder로 받아온다.
//	public Dept getDept(String id);
}
