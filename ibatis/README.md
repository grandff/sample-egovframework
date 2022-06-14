# ibatis 실습
> lab204-ibatis.txt에서 순서 및 소스 참고

### 실습 순서(환경 설정)
1. dataSource 설정 
	- ibatis/src/test/resources/META-INF/spring/context-datasource.xml
		- dataSource 빈 정의
	- ibatis/src/test/resources/META-INF/spring/context-common.xml
		- context:property placeholder 설정 추가
	- ibatis/src/test/resources/META-INF/spring/jdbc.properties
		- db 접속정보 추가
2. transaction 설정
	- ibatis/src/test/resources/META-INF/spring/context-transaction.xml
		- annotation 을 사용할 수 도 있지만 여기선 xml에서 해당 설정만 추가했음
3. Spring의 iBatis 연동 설정
	- ibatis/src/test/resources/META-INF/spring/context-sqlMap.xml
4. ibatis의 sql-map-config 설정 파일 작성
	- ibatis/src/test/resources/META-INF/sqlmap/sql-map-config.xml
5. Id Generation Service 설정 확인
	- ibatis/src/test/resources/META-INF/spring/context-idgen.xml 
6. common 설정 확인
	- ibatis/src/test/resources/META-INF/spring/context-common.xml
7. aspect 설정 확인
	- ibatis/src/test/resources/META-INF/spring/context-aspect.xml
	
### 실습 순서(자바)
1. Service Interface 확인
	- ibatis/src/main/java/egovframework/lab/dataaccess/service/EmpService.java
2. VO 확인
	- ibatis/src/main/java/egovframework/lab/dataaccess/service/EmpVO.java
3. Annotation을 적용한 Impl
	- ibatis/src/main/java/egovframework/lab/dataaccess/service/impl/EmpServiceImpl.java
4. DAO 작성
	- ibatis/src/main/java/egovframework/lab/dataaccess/service/impl/EmpDAO.java
5. mapping xml 작성
	- ibatis/src/test/resources/META-INF/sqlmap/mappings/lab-emp.xml
6. 테스트 실행
	- 전체 하지말고 메서드 하나씩 확인

### References
[egov idgenertaion](https://www.egovframe.go.kr/wiki/doku.php?id=egovframework:rte:fdl:id_generation)<br/>