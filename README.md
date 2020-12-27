# Kotlin 게시판
코틀린을 익히고자 간단한 예제를 만들어본다.
아래는 기본 설명들을 적어볼거다.

## 변수
코틀린은 변수 타입을 자동 캐스팅하기 때문에 타입을 명시하지 않아도 됨, 하지만 명시할 수도 있음, 기본 타입에 ?를 붙이면 레퍼런스 타입이 됨
```kotlin
var number = 1
var a: Int = 1
var a: Int? = 1 // java의 Integer
```

## companion object
코틀린에는 static 키워드가 존재하지 않는다. 대신 companion object가 존재한다.

## 함수
```kotlin
fun 함수명(인자1: 타입, 인자2: 타입 ...): 반환 타입 {
    return 
}
```
* 리턴 타입이 void인 경우 Unit 선언
* 리턴 타입을 생략해도 코틀린이 유추해서 자동 캐스팅 해준다.

인자의 기본값도 정의할 수 있다.
```kotlin
fun sum(num1: Int = 1, num2: Int = 10): Int {
    return num1 + num2
}

var sum = sum(num2 = 1)
println(sum)    // 2 출력
```

## 인터페이스
Java 8과 동일하게 메소드 구현이 가능하지만, 인스턴스 변수를 초기화 할 수 없고 자식 클래스에서 override 해야한다.

## 클래스
* 클래스는 하나의 Primary Constructor와 Secondary Constructor를 가지는데 Primary Constructor는 클래스를 선언하면서 같이 선언한다.
* Secondary Constructor는 클래스의 코드 블럭 안에서 constructor 키워드를 사용하여 선언한다.

### Data Transfer Object
data 클래스는 getter만 제공한다. (setter는 제공하지 않음)
```kotlin
@Entity
data class Post(
    var title: String,
    var author: String,
    var content: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
}
```

