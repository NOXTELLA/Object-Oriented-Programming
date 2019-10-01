
# Java Basic Rules 
***
### 자바 이름규칙

### 자바(JAVA)의 패러다임 : Object Oriented Programming
- Object Oriented Programming(객체지향)의 세가지 특성
  - 상속(Inheritence)
  - 다형성(Polymorphism)
  - 캡슐화(Encapsulation)
  
### 자바에서의 이름규칙(Naming rules)

1 . 클래스 이름규칙

  - Camel Case모델을 지킬것 
    - 클래스 이름의 첫 문자는 대문자로 시작
    - 둘 이상의 단어가 묶여서 하나의 이름을 이룰 때는 새로 시작하는 단어의 첫 글자는 대문자로 해줄것
    - ex : Camel + Case = CameCase
    
    
2 . 메소드와 변수 이름규칙

  - 변형된 Camel Case모델을 지킬것
    - 메소드와 변수는 Camel Case모델에서 하나가 변형된다. 바로 첫문자를 소문자로 한다는 것이다
    - ex : Camel + Case = camelCase
    
    
3 . 상수 이름규칙

  - 상수의 이름 규칙은 모든 글자를 대문자로 구성하는것을 관례로 한다
  - ex : final int INTEAGER_A
 
### 자바 생성자에 대해(Java Constructor)

- 생성자 이름은 자신이 선언된 클래스의 이름과 동일해야 한다.
- 생성자는 어떠한 반환타입도 가지지 않는다.
- 생성자 호출은 인스턴스 생성의 마지막 단계에 해당한다.
- 어떤 경우든 생성자가 존재하지 않는 경우는 인스턴스로 볼 수 없다.
  - 생성자 선언을 안한 경우가 존재한다.그런 경우에는 JavaCompiler에서 '디폴트 생성자'(Default Compiler)를 클래스에 넣어서 규칙을 성립하게 만들어 준다.
  
 ### 자바 접근 수준 지시자(Access-level Modifiers)
 
 1 . 종류 : public, protected, private, default
 
 2 . 특징 
 
  - default
    - 의미 : 아무런 선언도 하지 않은 상황을 의미함
    - 사용되는경우 
      - 클래스 정의
      - 클래스의 인스턴스 변수와 메소드
   
  - public
    - 의미 : 어디서든 해당 클래스의 인스턴스를 생성할 수 있다.
    - 반대로 default로 클래스가 정의되는 경우 동일 패키지로 묶인 클래스 내에서만 인스턴스 생성을 허용한다.
   
  - private
    -의미 : 정보은닉을 위해서 사용된다. private로 변수를 선언할 시 동일 클래스 내에 정의된 메소드를 통해서만 해당 변수에 접근이 가능해 진다.
  - protected

### 클래스 변수(Class Variable)

- 클래스 변수는 변수에 static을 붙여서 선언을 하게된다. 클래스 변수는 선언된 클래스의 모든 인스턴스가 공유하는 변수이다.
- 클래스 변수는 인스턴스 생성 전에 메모리상에 존재한다.

``` java
class Op{
    static int io = 0;
    void Op(){
        io++;
    }
}
public class ClassVar2 {
    public static void main(String[] args)
    {
        Op.io += 1;
        System.out.println(Op.io); // 1이 나온다
        //인스턴스 선언 없이도 클래스변수에 접근하여 연산을 할 수 있다. 이를 통해서 클래스 변수는 인스턴스 생성 전에 메모리에 존재함을 알 수 있다.
    }
}
```

- 클래스 로딩(Class loading) : '클래스 정보를 가상머신이 읽는다'라는 표현의 정의이다. 이는 가상머신이 특정 클래스 정보를 읽는 행위를 가리켜 '클래스 로딩'이라고 한다.특정 클래스의 인스턴스가 생성되기 위해서는 해당 클래스가 반드시 가상머신에 의해 읽혀져야 한다. 즉 인스턴스 생성보다 클래스 로딩이 먼저 된다는것을 알 수 있다.
- 클래스 변수는 인스턴스간 데이터 공유가 필요한 상황에서 클래스 변수를 선언한다.

```java
class Circle_Ck{
    // 원주율 pi는 모든 Circle_Ck 인스턴스가 참조해야하는 값이지만 각각의 인스턴스가 지녀야하는 값은 아니고 변경해서는 안되는 고유값이므로 final로 상수선언까지 해준것이다. 
    //이러한 변수들을 클래스 변수들로 선언해주면 좋다.
    static final double pi = 3.14;
    private double rad;
    Circle_Ck(double rad_n){
        rad = rad_n;
    }
    public void showRound()
    {
        System.out.println("Round length of circle : " + (rad * 2 * pi));
    }
    public void width()
    {
        System.out.println("Width of circle : " + (rad * rad * pi));
    }
}

public class Circle {
    public static void main(String[] args)
    {
        Circle_Ck ui = new Circle_Ck(3.5);
        ui.showRound();
        ui.width();
    }
}
```

### 클래스 메소드(Class Method)

- 클래스 메소드 : 클래스 메소드도 클래스 변수와 동일하게 static을 통해서 선언을 해준다
- 클래스 메소드의 성질은 다음과 같다.
  - 인스턴스 생성 전부터 접근이 가능하다.
  - 어떠한 인스턴스에도 속하지 않는다.
  - 클래스 메소드 또한 인스턴스 생성 전에 호출이 된다

```java
class NumberPrint{
    private int num = 0;
    static void showInt(int a)
    {
        System.out.println("A : " + a);
    }
    static void showDouble(double b)
    {
        System.out.println("B : " + b);
    }
    void setNum(int c)
    {
        num = c;
    }
}
public class ClassMethod {
    public static void main(String[] args)
    {
        //클래스 메소드도 클래스 변수와 동일하게인스턴스 생성 전부터 접근할 수 있다.
        NumberPrint.showDouble(3.14);
        NumberPrint.showInt(10);
        NumberPrint op = new NumberPrint();
        op.showDouble(4.1);
        op.showInt(20);
    }
}

/*결과
B : 3.14
A : 10
B : 4.1
A : 20
 */
 ```
 - 클래스 메소드 선언이 이점이 되는 경우
 
 ```java
 //이와 같은 경우에 Cal이라는 클래스에는 단지 외부에 기능을 제공하기 위해서 사용되는 메소드밖에 없다. 또한 인스턴스 변수의 값을 참조하거나 수정하지 않는다.
//즉 이러한 메소드들은 딱히 인스턴스에 속할 필요가 없다는것을 알 수 있다. 이러한 경우에는 클래스 메소드로 사용하는것이 좋은 방법이다.
class Cal{
    static final double pi = 3.14;
    static int add(int a, int b)
    {
        return a - b;
    }
    static int min(int a, int b)
    {
        return a - b;
    }
    static int multi(int a, int b)
    {
        return a * b;
    }
    static double divide(int a, int b)
    {
        return a / b;
    }
}
public class ClassMethodCons {
    public static void main(String[] args)
    {
        System.out.println("10 - 1 is " + Cal.min(10,1));
        System.out.println("5 + 6 is " + Cal.add(5,6));
        System.out.println("10 x 3 is " + Cal.multi(10,3));
        System.out.println("10 / 4 is " + Cal.divide(10,4));
    }
}
```

### 왜 public static void main(String[] args)인가?

- 여기까지 알았다면 왜 main메소드를 public static void main() 형태로 쓰는지 이해할 수 있을것이다. 우선 이 형태는 일종의 약속이라는것을 알고가면 좋다.

- **public** : 우선 main메소드가 호출되는 영역은 클래스의 외부이다. 그렇기 때문에 우선 public선언을 해주는것이 맞다.
- **static** : main메소드는 인스턴스가 생성되기 이전에 호출된다. 즉 static선언을 해주어야 한다.
- void : 반환형

- 이러한 단계로 public static void main()이 되는것을 알 수 있다.

### static 선언

- 다음과 같은 코드가 있다고 가정하자

```java
public class StaticInitial {
    static String date;
    public static void main(String[] args)
    {
        System.out.println("Today date : " + date);
    }
}
```
- 위 코드는 현재 날짜 정보가 담긴 클래스 변수 date를 출력하는것을 시도하고 있다.
- 하지만 클래스 변수는 선언과 동시에 메모리에 올라가기 때문에 따로 초기화를 시켜줄수 있는 방법이 있다. 만약 date변수가 클래스 변수가 아닌 인스턴스 변수인 경우에는 

```java
import java.time.LocalDate;

LocalDate dNow = LocalDate.now();
date = dNow.toString();
```
- 위 부분을 추가해 주면 된다. 하지만 현재는 클래스 변수이므로 static선언을 이용하여 선언과 동시에 초기화가 가능하도록 해주어야한다.

```java
import java.time.LocalDate;

public class StaticInitial {
    static String date;
    static {
        LocalDate dNow = LocalDate.now();
        date = dNow.toString();
    }
    public static void main(String[] args)
    {
        System.out.println("Today date : " + date);
    }
}
```
