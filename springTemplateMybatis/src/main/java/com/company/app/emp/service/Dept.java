package com.company.app.emp.service;

import lombok.Data;

@Data
// 귀찮으면 @Data만 해도 된다.
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class Dept {
	String departmentId;
	String departmentName;
	String managerId;
	String locationId;
}
