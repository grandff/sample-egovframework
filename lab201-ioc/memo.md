# IOC 실습
> lab201-ioc.txt에서 순서 및 소스 참고

### 실습 순서
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
	- 오류없어야 정상
	
### References
[java Collections sort](https://wjheo.tistory.com/entry/Java-%EC%A0%95%EB%A0%AC%EB%B0%A9%EB%B2%95-Collectionssort)<br/>
[java Binary Search](https://tadomstudio.tistory.com/47)