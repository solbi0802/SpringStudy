# SpringStudy
프레임워크의 구성요소
1. IOC
2. Class Library
3. design pattern

 Spring Framework 

 1. Portable Service Abstraction (서비스 추상화)
 기술적인 복잡함은 추상화를 통해 low Level의 기술 구현 부분과 기술을 사용하는 인터페이스로 분리한다.

 2. DI(Dependency Injection) 의존 관계 주입
 Spring은 객체지향에 충실한 설계가 가능하도록 단순한 객체 형태로 개발할 수 있고, DI는 유연하게 확장 가능한 객체를 만들어 두고 그 관계는 
 외부에서 다이내믹하게 설정해준다.

 3. AOP(Aspect Oriented Programming) 관점지향프로그래밍
 애플리케이션 로직을 담당하는 코드에 남아 있는 기술 관련 코드를 분리해서 별도의 모듈로 관리하게 해주는 강력한 기술이다.

 4. POJO(Plain Old Java Object)
 객체지향 원리에 충실하면서, 특정 환경이나 규약에 종속되지 않고 필요에 따라 재활용될 수 있는 방식으로 설계된 객체이다.

 Spring Framework 특징
  1. 컨테이너 역할
  2. DI지원
  3. AOP지원
  4. POJO지원
  5. 트랜잭션 처리를 위한 일관된 방법을 지원
  6. 영속성과 관련된 다양한 API 지원

- Spring Framework 기능 요소
core 컨테이너, Context, dao, ORM, AOP, Web, WebMVC

- IoC 컨테이너 : 객체에 대한 생성 및 의존성 관리, POJO의 생성, 초기화, 서비스, 소멸에 대한 권한을 가짐,
- DI : 각 클래스간의 의존관계를 빈 설정 정보를 바탕으로 컨테이너가 자동으로 연결해주는 것
- DI의 유형
Setter Injection : 의존성을 입력 받는 Setter 메서드를 만들고 이를 통해 의존성을 주입한다.
Constructor Injection : 필요한 의존성을 포함하는 클래스의 생성자를 만들고 이를 통해 의존성을 주입한다.
Method Injection : 의존성을 입력 받는 일반 메서드를 만들고 이를 통해 의존성을 주입한다.
- Spring DI 컨테이너의 개념
: Spring DI 컨테이너가 관리하는 객체를 빈이라 하고, 이 빈을 관리한다는 의미로 컨테이너를 빈 팩토리라고 부른다.
