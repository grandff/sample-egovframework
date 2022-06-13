package egovframework.lab.ioc.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import egovframework.lab.ioc.service.EmpVO;

public class XmlEmpDAO {

    // TODO [Step 1-4] XmlEmpDAO 작성
	static List<EmpVO> list;
	
	// db select 없이 테스트용으로 데이터 생성
	static {
		list = new ArrayList<EmpVO>();
		EmpVO empVO;
		for (int i = 1; i <= 100; i++) {
			empVO = new EmpVO();
			empVO.setEmpNo(i);
			empVO.setEmpName("EmpName " + i);
			empVO.setJob("SALESMAN");
			list.add(empVO);
		}
	}
	
	// insert
	public void insertEmp(EmpVO empVO) throws Exception{
		list.add(empVO);
		Collections.sort(list);	// 정렬
	}
	
	// update
	public void updateEmp(EmpVO empVO) throws Exception {
		int index = Collections.binarySearch(list, empVO);	// sort가 된 상태에서만 가능
		EmpVO orgEmpVO = list.get(index);
		
		orgEmpVO.setEmpName(empVO.getEmpName());
		orgEmpVO.setJob(empVO.getJob());
	}
	
	// delete
	public void deleteEmp(EmpVO empVO) throws Exception{
		list.remove(Collections.binarySearch(list, empVO));
		Collections.sort(list);
	}
	
	// select
	public EmpVO selectEmp(EmpVO empVO) throws Exception {		
		int index = Collections.binarySearch(list, empVO);		
		return index < 0 ? null : list.get(index);
	}
	
	// list
	public List<EmpVO> selectEmpList() throws Exception{
		return list;
	}
}
