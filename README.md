# HorseGame

이 게임은 말이 1000m 를 먼저 도착하면 이기는 게임이다.
-------------------------------------------------------------------------
**<Application main 메소드>**


말을 움직일 수 있게하는 Gamer 클래스를 호출시킨 후

게임을 반복 할 수 있도록 while 문을 이용하였고,

그 안에 Scanner 클래스를 이용하여, swtich 의 비교할 변수값'no'를 입력할 수 있게 하였다.

'1' 입력하면, Gamer 클래스의 gamer.go 라는 이름의 메소드를 호출시켰고,

'2' 입력하면, Gamer 클래스의 gamer.down 라는 이름의 메소드를 호출시켰고,

'3' 입력하면, Gamer 클래스의 gamer.out 라는 이름의 메소드를 호출시켰고,

'4' 입력하면, Gamer 클래스의 gamer.champion 라는 이름의 메소드를 호출시켰다.

각각 1,2,3,4 로 호출 후 새로운 정수를 받아 반복될 수 있도록 break를 걸어두었다.

그리고 if 문을 써 no의 값이 '4' 일 때 break를 걸어 while 반복문에서 나갈 수 있게 하였다. 



**<Gamer 클래스>**


Horse 클래스를 호출하여 캡슐화 해 놓고,

go 메소드에 Horse 클래스의 horseGo 메소드를 호출하였고,

down 메소드에 Horse 클래스의 horseDown 메소드를 호출하였고,

out 메소드에 Horse 클래스의 horseOut 메소드를 호출하였고,

champion 메소드에 Horse클래스의 horseChampion 메소드를 호출하여 객체 간의 상호작용을 할 수 있도록 해주었다.



**<Horse 클래스>**

private 접근제한자를 써서
1,2,3 번 말의 속도를 조절하는 변수 speedFirst,speedSecond,speedThird 를 선언해주고,


**horseGo 메소드**에 조건문 if 문으로 speedFirst,speedSecond,speedThird가 

900이하 일때, Random 클래스로 정수 0부터 3개를 랜덤하게 하여 horseNum 라는 변수에 값을 넣어주었다.  

그 안에 swtich 문을 이용하여,

horseNum 값이 '0' 일때는 speedFrist 변수인 1번말의 스피드를 +100 만큼 올려준 후 break 를 걸어주고,

horseNum 값이 '1' 일때는 speedSecond 변수인 2번말의 스피드를 +100 만큼 올려준 후 break 를 걸어주고,

horseNum 값이 '2' 일때는 speedThird인 3번말의 스피드를 +100 만큼 올려주게 만들어주었다.

그리고 각각 case0,1,2에 말 이모티콘이 움직일 수 있는 메소드 horseCRT1,horseCRT2,horseCRT3 을 넣어 말의 스피드값에 따라 말 이모티콘 위치가 달라질 수 있게 하였다.

900 이상이면 이미 경기가 끝났다라는 조건을 넣었다.


**horseDown 메소드**에도 마찬가지로 조건문 if 문으로 speedFirst,speedSecond,speedThird가 

900이하 일때, 랜덤한 값을 넣은 horseNum 변수를 선언하고 그 안에 swtich 문을 이용하여,

horseNum 값이 '0' 일때는 장애물에 걸린 speedFrist을 제외하고 speedThird,speedSecond 2,3번 말에만 스피드를 +100 만큼 올려주어 break 를 걸어주고,

horseNum 값이 '1' 일때는 장애물에 걸린 speedSecond 제외하고 speedFrist,speedThird 1,3번 말에만 스피드를 +100 만큼 올려주어 break 를 걸어주고,

horseNum 값이 '2' 일때는 장애물에 걸린 speedThird 제외하고 speedFrist,speedSecond 1,2번 말에만 스피드를 +100 만큼 올려주어 break 를 걸어주었다.

그리고 각각 case0,1,2에 말 이모티콘이 움직일 수 있는 메소드 horseCRT1,horseCRT2,horseCRT3 을 넣어 말의 스피드값에 따라 말 이모티콘 위치가 달라질 수 있게 하였다.

900 이상이면 이미 경기가 끝났다라는 조건을 넣었다.


**horseOut 메소드**에도 마찬가지로 조건문 if 문으로 speedFirst,speedSecond,speedThird가 

900이하 일때, 랜덤한 값을 넣은 horseNum 변수를 선언하고 그 안에 swtich 문을 이용하여,

horseNum 값이 '0' 일때는 speedFirst = 0; 을 하여 장애물에 걸린 1번말의 스피드를 0으로 초기화시킨 후 break 를 걸어주고,

horseNum 값이 '1' 일때는 speedSecond = 0; 을 하여 장애물에 걸린 2번말의 스피드를 0으로 초기화시킨 후 break 를 걸어주고,

horseNum 값이 '2' 일때는 speedThird = 0; 을 하여 장애물에 걸린 3번말의 스피드를 0으로 초기화시킨 후 break 를 걸어주었다.

그리고 각각 case0,1,2에 말 이모티콘이 움직일 수 있는 메소드 horseCRT1,horseCRT2,horseCRT3 을 넣어 말의 스피드값에 따라 말 이모티콘 위치가 달라질 수 있게 하였다.

900 이상이면 이미 경기가 끝났다라는 조건을 넣었다.

**horseChampion 메소드**에는 if 문으로 speedFrist 값이 1000 이상이면 승리문구가 나올 수 있게하고 

그 안에 if 문을 써서 speedSecond,speedThird 값도 마찬가지로 1000이상일 경우 공동승리문구가 나올수 있도록 하였다.

else if 로 마찬가지로 speedSecond과 speedThird 도 1000 이상일 경우 승리문구와 공동승리 문구가 나오게하였다.

**horseCRT1,2,3 메소드** 는 말의 이모티콘의 위치를 변경하기 위해서 
if 문으로 빈 문자열을 사용하여 100~ 1000 까지 위치가 다르도록 설정해놓았다. 

-끝!!!-





