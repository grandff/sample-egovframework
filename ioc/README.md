# IOC 실습
> lab201-ioc.txt에서 순서 및 소스 참고

### 실습 순서(xml)
1. Interface 생성
2. VO 작성<br/>
	- Comparable 상속받고 메서드 추가<br/>
	- compareTo를 통해 empNo 속성 크기 비교<br/>
		- 여기서 오타나면 test할 때 에러남<br/>
3. Impl 작성<br/>
4. DAO 작성<br/>
	- db 연동 없이 100개의 샘플 데이터 생성<br/>
5. xml 설정 파일 작성<br/>
6. Testcase 작성<br/>
	6-1. Test 진행<br/>
	- test 자바 파일에서 마우스 오른쪽버튼 > Run As > JUnit Test<br/>
	- 오류없어야 정상<br/>
	- Spring 연동을 위해 제공하는 @RunWith(SpringJUnit4ClassRunner.class), @ContextConfiguration (...) 설정에 유의<br/>
	- 테스트에 필요한 Spring Bean 설정 파일만으로 제한하는 것이 바람직<br/>
	
### 실습 순서(annotation)
1. Interface, VO는 xml 과정과 동일한 파일 사용<br/>
2. Annotation을 적용한 Impl 작성<br/>
	- @Service 스테레오 타입 Annotation 을 사용하여 bean 설정 <br/>
3. Annotation을 적용한 DAO 작성 <br />
	-  @Repository 스테레오 타입 Annotation 을 사용하여 bean 설정 <br/>
4. common 설정 파일 설정(context-common.xml)<br/>
5. Testcase 작성<br/>
	- annotation 호출하는 형식으로 변경<br/>
	- 그 외 소스는 그대로<br/>

	
### References
[java Collections sort](https://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort)<br/>
[java Binary Search](https://tadomstudio.tistory.com/47)