# Ajax

### 실습 순서(기초)
1. simpleAjax 메소드 완성
	 - ajax/src/main/java/egovframework/lab/ajax/web/AjaxSimpleController.java
2. MappingJackson2JsonView 빈 등록(jsonView 선언)
	- ajax/src/main/webapp/WEB-INF/config/springmvc/context-servlet.xml
	- bean id로 등록한 이름을 view로 사용해야함
3. jsp에 ajax 구현
	- ajax/src/main/webapp/WEB-INF/autocomplete.jsp
4. context-servelet에 등록한 bean id를 controller.java에 등록
	- setViewName으로 bean id 등록 (안그러면 계속 jsp 페이지를 찾음)
	
### 실습 순서(auto complete, auto select)
1. ajax call 기능 구현
	- ajax/src/main/webapp/WEB-INF/jsp/employeelist.jsp
2. autoComplete의 리스트를 db를 통해 가져옴
	- ajax/src/main/java/egovframework/lab/ajax/web/AjaxController.java
3. service interface의 getNameListForSuggest 메소드 구현
	- ajax/src/main/java/egovframework/lab/ajax/service/EmployeeService.java
4. getNameListForSuggest 메소드 추가
	-	ajax/src/main/java/egovframework/lab/ajax/service/impl/EmployeeServiceImpl.java
	