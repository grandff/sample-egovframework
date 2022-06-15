# 종합 실습

## Tasks
1. 로그인 처리
	1. LoginController.java 에서 LoginService를 이용해 로그인 여부 체크 Account 객체를 리턴 받음
	2. LoginServiceImpl.java에서 구현되어 있는 LoginMapper의 authenticate 메소드를 이용해 검증하여 결과 객체 리턴
	3. LoginController.java에서 가져온 account 객체를 session에 "UserAccount" 라는 이름으로 저장
	4. LoginController.java에서 loginSuccess.do로 호출된 처리를 위한 메소드 사용(GET)
2. 사원 목록 조회
	1. EmployeeController.java에서 employeeList.do 경로로 요청과 메소드를 매핑(RequestMapping 사용)
	2. EmployeeController.java에서 화면에서 넘어오는 pageNo 파라미터 값을 반드시 넘어오지 않아도 됨을 명시적으로 표현(RequestParam required 사용)
	3. employeelist.jsp에서 ajax 사용을 위한 jquery autocomplete 코드 작성
3. 사원 정보 등록 화면 이동
	1. EmployeeController.java에서 요청되는 insertEmployee.do와 메소드를 매핑(GET으로만)
	2. EmployeeController.java에서 employee 객체를 ModelAttributes를 이용하여 셋팅
	3. EmployeeController.java에서 deptInfoOneDepthCategory객체를 ModelAttributes를 이용하여 셋팅
4. 사원정보 등록화면, 부서 멀티콤보 처리
	1. EmployeeController.java에서 요청되는 insertEmployee.do와 메소드를 매핑(POST만, string으로 리턴)
	2. EmployeeController.java에서 DefaultBeanValidator를 이용해 employee 객체 값을 체크
	3. EmployeeController.java에서 DefaultBeanValidator를 실행한 결과 에러가 있는 경우 addemployee.jsp로 이동하고 에러메시지 보여주기
	4. addemployee.jsp에서 jquery를 이용해 ajax 방식으로 통신해 근무부서 조회
5. 사원정보 등록, 상세 조회
	1. EmployeeServiceImpl.java에서 insertEmployee 메소드는 Employee를 파라미터로 받아 empMapper를 실행
	2. EmpMapper.java에서 insertEmployee메소드는 EgovAbstractMapper에서 제공되는 insert를 이용해서 sql문 실행
	3. Employee.xml 파일에 insertEmployee에 해당하는 sql문 생성
6. 사원정보 수정
	1. EmployeeController.java에서 updateEmployee.do 요청 시 @RequestMapping에 value와 method 생성
	2. EmployeeController.java에서 getEmployeeInfo 메소드에 updateEmployee.do 요청 시 Employye 객체를 가져오도록 ModelAttribute를 설정
	
## 동작 순서
1. pom.xml 
	- repository에 대한 설정, 의존성 설정, 버전 정보 등 확인
2. web.xml
	- web 설정에 관한 내용 확인 가능
	- tomcat이 제일 먼저 읽어들임
3. context-*.xml
	- spring에서 사용하는 각 설정 파일들