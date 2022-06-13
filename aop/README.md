# AOP 실습
> lab202-aop-tutor.txt에서 순서 및 소스 참고<br>
> xml은 생략

### 실습 순서(annotation)
1. Interface, VO, Impl, DAO는 ioc 프로젝트 소스와 동일함<br/>
	- AnnotationEmpServiceImpl.java, AnnotationEmpDAO.java <br/>
2. common 설정 <br/>
	- aop/src/test/resources/META-INF/spring/context-common.xml <br/>
3. Aspect 작성 <br/>
	- aop/src/main/java/egovframework/lab/aop/aspectjannotation/AspectUsingAnnotation.java <br/>
	- @Component 스테레오 타입 Annotation 을 사용하여 Spring Bean으로 설정 <br/>
	- 별도의 클래스로 Pointcut 과 Advice 기능을 통합한 Aspect 클래스를 작성하여 @Aspect Annotation 을 사용하여 AspectJ 형식 AOP Aspect 클래스를 설정 <br />
	- 여기서는 모든 비지니스 메서드(Impl 로 끝나는 모든 class 의 모든 메서드)에 대해 다양한 Advice 기능을 동시에 적용하였음에 유의할 것. (@Before/@After/@AfterReturning/@AfterThrowing/@Around) <br/>
4. @Aspectj 형식의 Spring AOP를 가능케 하는 aspectj-autoproxy 설정<br/>
	- aop/src/test/resources/META-INF/spring/context-aspectj-annotation.xml <br/>
	- aop 네임스페이스 의 apsectj-autoproxy 태그로 간략히 설정 가능 <br />
5. Testcase 작성 <br/>
	- ioc에서 만든 파일과 거의 동일함<br/>
	- ContextConfiguration 설정 파일 로딩과 annotation 형식 테스트 대상 서비스 injection만 변경해서 테스트<br/>
	
### References
[pointcut annotation](https://galid1.tistory.com/498)<br/>
[before annotation](https://sup2is.tistory.com/59)<br/>