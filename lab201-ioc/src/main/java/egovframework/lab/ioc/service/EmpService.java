package egovframework.lab.ioc.service;

import java.util.List;

public interface EmpService {

    // TODO [Step 1-1, 2-1] EmpService 에 대한 CRUD 및 목록조회 비지니스 메서드 작성
	// VO 파일이 없으면 에러가날거임
	public void insertEmp(EmpVO empVO) throws Exception;
	public void updateEmp(EmpVO empVO) throws Exception;
	public void deleteEmp(EmpVO empVO) throws Exception;
	public EmpVO selectEmp(EmpVO empVO) throws Exception;
	public List<EmpVO> selectEmpList() throws Exception;
}
