# 헤드 퍼스트 디자인 패턴

-----

## 객체지향 기초
* 추상화
* 캡슐화
* 다형성
* 상속

## 객체지향 원칙
* 바뀌는 부분을 캡슐화한다.
* 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
* 상속보다는 구성(Composition)을 활용한다. 
* 상호 작용하는 객체 사이에서는 가능하면 느슨한 결합을 사용하자.

### 1. 전략 패턴(Strategy pattern) - step1

#### &nbsp; 1) 전략 패턴 정의 

     실행 중에 알고리즘을 선택할 수 있게 하는 해위 소프트웨어 디자인 패턴이다. 특정한 계열의 알고리즘들을 정의하고
     각 알고리즘을 캡슐화하여 상호 교체가 가능하게 만들어준다. 독립적으로 알고리즘을 보완하거나 추가할 수 있다는 장점이 있다.
     단점도 있다. 만약 미래에 다양하게 확장하는게 아니라 단순히 2~3개 정도만 고정적으로 사용한다면 클래스로 따로 빼는 것보다
     분기문으로 짧게 처리하는게 가독성이 더 좋을 수 있다.
     전략 패턴의 핵심은 다양하게 확장할 수 있는 행위를 하나의 추상화로 만든 후, 클래스를 언제든 교체할 수 있게 하는 것이다. 

------
### 2. 옵저버 패턴(Observer pattern) - step2

#### &nbsp; 1) 옵져버 패턴 정의
    
     옵져버 패턴은 주제(subject), 옵져버(observer)의 관계를 이해해야 한다.
     한 대상의 주제(상태)에 대해 변화된 사항들을 옵져버들에게 전달해 준다.
     옵져버는 추가할 수도 있고 제거할 수 있게 해준다. 마치 유투브의 구독하기와 비슷하다.
     즉, 한 객체의 상태가 바뀌면 그 객체의 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는
     방식으로 일대다 의존성을 가지고 있다.

#### &nbsp; 2) 옵져버 패턴 구조

옵져버 패턴은 다양하게 구현이 가능하지만 보통 주제 인터페이스와 옵져버 인터페이스로 구현된다. 

```java

// 주제(subject)
public interface subject{
    // 옵져버 등록
    public void registerObserver(Observer o);
    // 옵져버 삭제
    public void removeObserver(Observer o);
    // 옵져버들에게 알림
    public void notifyObservers();
}

// 옵져버(Observer)
public interface Observer{
    // 최신 상태 갱신
    public void update();
}

// 화면
public interface DisplayElement{
    public void display();
}
```

###     * Push or Pull?
주제가 전달받는 옵져버들에게 update 메서드를 사용해서 모든 데이터를 보내도록 설정되어 있는데(Push). 옵져버가 
필요한 데이터들을 선택해서 가져오는 방식도 있다.(Pull) => Getter를 사용

**Pull(주제에서 알림보내기)** : 기존 코드에서는 주제에서 update 메서드에 모든 매개변수를 담아서 호출했었는데. 
이번에는 비어있는 update()를 호출한다.
```java
public void notifyObservers(){
    for(Observer observer : observers){
        observer.update()
        }
}
```

**옵져버에서 알림 받기** : 필요한 온도와 습도 값만 pull 받는다.
```java
// interface
public interface Observer{
    public void update();
}

// implement
public void update(){
    this.temperature = weatherData.getTemperature();
    this.humidity = wwatherData.getHumidity();
    display();
}
```

-----
### 3. 데코레이터 패턴(Decorator pattern) - step3
데코레이터 패턴(Decorator Pattern)으로 **객체에 추가 요소를 동적으로 더할 수 있다.**  