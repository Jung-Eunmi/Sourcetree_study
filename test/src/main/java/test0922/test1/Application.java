package test0922.test1;

import test0922.test1.exception.DivideNotZeroException;
import test0922.test1.exception.ModNotZeroException;
import test0922.test1.exception.MultipleNotZeroException;

import java.util.Scanner;

public class Application {

    public static void main(String[] args)  {
        //사칙연산을 수행하는 계산기 (+, -, *, /, %)
        //Application 클래스와 Calculrator 클래스 구현
        //Application 클래스에서는 main 메소드 구현
        //Application 클래스에서 Scanner 객체를 사용해서 2 개의 정수, 1 개의 사칙연산 기호를 받는다.
        //입력 한 정수를 사칙연산 기호에 따라
        //Calculrator 클래스의 각기 다른 사칙연산 메소드로 전달한다.
        //사칙연산이 수학적으로 통용되는 상식선에서 정상적으로 돌아가도록 구현
        //모든 사칙 연산은 정수로 계산되도록 할 것
        //나누기의 경우 나눌 수 가 0인 경우 사용자 정의의 DivideNotZeroException 이 발생하도록 구현
        //DivideNotZeroException 클래스는 message 로 "나눌 수는 0이 될 수 없습니다" 출력
        //곱하기의 경우 곱하는 수가 0인 경우 사용자 정의의 MultipleNotZeroException 이 발생하도록 구현
        //MultipleNotZeroException 클래스는 message 로 "곱하는 수는 0이 될 수 없습니다" 출력
        //그 외에 본인이 만들고 싶은 예외사항 있으면 얼마든지 추가 가능
        Scanner sc = new Scanner(System.in);
        Calculrator calc = new Calculrator();

        System.out.print("첫번째 정수 입력 : ");
        int no1 = sc.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int no2 = sc.nextInt();
        sc.nextLine();
        System.out.print("+, -, *, /, % 입력 : ");
        char ch = sc.nextLine().charAt(0);

        switch (ch){
            case '+' :
                calc.plus(no1,no2);
                break;
            case '-' :
                calc.minus(no1,no2);
                break;
            case '*' :
                try {
                    calc.multiply(no1,no2);
                }catch (MultipleNotZeroException m){
                    System.out.println(m.getMessage());
                }
                break;
            case '/' :
                try {
                    calc.divide(no1,no2);
                }catch (DivideNotZeroException d){
                    System.out.println(d.getMessage());
                }
                break;
            case '%' :
                try {
                    calc.mod(no1,no2);
                }catch (ModNotZeroException m){
                    System.out.println(m.getMessage());
                }
                break;
            default:
                System.out.println("연산기호를 다시 입력해주세요.");
                return;
        }
        System.out.println("프로그램이 종료되었습니다.");

    }

}
