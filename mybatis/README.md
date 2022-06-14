# MyBatic 실습
> lab205-mybatis.txt에서 순서 및 소스 참고

### 실습 순서(환경 설정)
1. DataSource 설정
	- mybatis/src/test/resources/META-INF/spring/context-datasource.xml
	- mybatis/src/test/resources/META-INF/spring/context-common.xml
	- mybatis/src/test/resources/META-INF/spring/jdbc.properties
2. Transaction 설정
	- mybatis/src/test/resources/META-INF/spring/context-transaction.xml
3. MyBatis와 Spring 연동 설정
	- mybatis/src/test/resources/META-INF/spring/context-mybatis.xml
4. MyBatic Configuration File 작성
	- mybatis/src/test/resources/META-INF/sqlmap/sql-mybatis-config.xml
5. IDgeneration service 설정 확인
	- mybatis/src/test/resources/META-INF/spring/context-idgen.xml
6. 공통 설정 확인
	- mybatis/src/test/resources/META-INF/spring/context-common.xml
7. AOP 설정 확인
	- mybatis/src/test/resources/META-INF/spring/context-aspect.xml
	
### 실습 순서(DAO 클래스 작성 - 선택1)
1. Annotation을 적용한 EmpServiceImpl 작성
	- mybatis/src/main/java/egovframework/lab/dataaccess/service/impl/EmpServiceImpl.java
2. EgovAbstractMapper를 상속한 DAO 클래스 작성
	- mybatis/src/main/java/egovframework/lab/dataaccess/service/impl/EmpDAO.java
3. lab-dao-class.xml 
	- mybatis/src/test/resources/META-INF/sqlmap/mappers/lab-dao-class.xml
	
### 실습순서(Mapper Interface 작성 - 선택2)
1. Annotation을 적용한 EmpServiceImpl 작성
	- mybatis/src/main/java/egovframework/lab/dataaccess/service/impl/EmpServiceImpl.java
2. EmpMapper 인터페이스 작성
	- mybatis/src/main/java/egovframework/lab/dataaccess/service/impl/EmpMapper.java
3. MyBatis의 Mapper Interface 자동 스캔 설정
	- mybatis/src/test/resources/META-INF/spring/context-mybatis.xml
4. lab-mapper-interface.xml
	- mybatis/src/test/resources/META-INF/sqlmap/mappers/lab-mapper-interface.xml
	