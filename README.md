# HorseGame

이 게임은 말이 1000m 를 완주하면 끝나는 게임이다.
-------------------------------------------------------------------------
**<Application main 메소드>**

말을 움직일 수 있게하는 Gamer 클래스를 호출시킨 후

게임을 반복 할 수 있도록 while 문을 이용하였고,

그 안에 Scanner 클래스를 이용하여, swtich 의 비교할 변수값'no'를 입력할 수 있게 하였다.

'1' 입력하면, Gamer 클래스의 gamer.go 라는 이름의 메소드를 호출시켰고,

'2' 입력하면, Gamer 클래스의 gamer.down 라는 이름의 메소드를 호출시켰고,

'3' 입력하면, Gamer 클래스의 gamer.out 라는 이름의 메소드를 호출시켰고,

'4' 입력하면, Gamer 클래스의 gamer.champion 라는 이름의 메소드를 호출시킬 수 있게 하였다.

각각 1,2,3,4 로 호출 후 새로운 정수를 받아 반복될 수 있도록 break를 걸어두었다.

그리고 if 문을 써 no의 값이 '4' 일 때 break를 걸어 while 반복문에서 나갈 수 있게 하였다. 


**<Gamer 클래스>**

Horse 클래스를 호출하여 캡슐화 해 놓고,
Horse와 Application간 상호작용을 할 수 있도록 해주었다.


**<Horse 클래스>**

1번. 달리기
= 조건문 if로 1번말,2번말,3번말 스피드가 
900 이상이면 이미 경기가 끝났다라는 조건을 넣었고,
900이하 일때 랜덤클래스로 말을 랜덤하게 선정하여 
조건문 if 안에 switch 문을 넣어
랜덤값이 '0' 일때는 speedFrist 변수인 1번말의 스피드를 +100 만큼 올려준 후 break 를 걸어주고,
랜덤값이 '1' 일때는 speedSecond 변수인 2번말의 스피드를 +100 만큼 올려준 후 break 를 걸어주고,
랜덤값이 '3' 일때는 speedThird인 3번말의 스피드를 +100 만큼 올려주게 만들어주었다.

2번. 장애물 넘기
= 마찬가지로 조건문 if로 1번말,2번말,3번말 스피드가 
900 이상이면 이미 경기가 끝났다라는 조건을 넣었고,
900이하 일때 랜덤클래스로 말을 랜덤하게 선정하여 


3번. 장외 밖으로 탈출
=

4번. 승/패
=
