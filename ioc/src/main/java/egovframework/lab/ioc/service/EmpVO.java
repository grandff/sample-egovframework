package egovframework.lab.ioc.service;

import java.io.Serializable;

public class EmpVO implements Serializable, Comparable<EmpVO> {

    private static final long serialVersionUID = 21364643634L;
	
	public int empNo;
	public String empName;
	public String job;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public int compareTo(EmpVO o) {
		if(empNo > o.getEmpNo()) {
			return 1;
		} else if(empNo < o.getEmpNo()) {
			return -1;
		}else {
			return 0;
		}
	}
}
