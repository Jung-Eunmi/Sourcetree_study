package test0915;

import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Gamer gamer = new Gamer();

        while (true){

            System.out.println("☆★☆★☆★☆★☆★☆★승!마!게!임☆★☆★☆★☆★☆★☆★");
            System.out.println("제일 먼저 1000m 에 들어오는 말이 챔피온이 됩니다!!");
            System.out.println("1번. 달리기");
            System.out.println("2번. 장애물 넘기");
            System.out.println("3번. 장외 밖으로 탈출");
            System.out.println("4번. 승/패");
            System.out.println("9번. 경기 끝내기");
            System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
            System.out.println();
            System.out.print("번호를 입력하세요 : ");
            int no = sc.nextInt();
            System.out.println();
            System.out.println("<<<<<<<<<<<<<<<<<진행상황>>>>>>>>>>>>>>>>>");

            switch (no){
                case 1 : gamer.go();
                    System.out.println();
                    break;
                case 2 : gamer.down();
                    System.out.println();
                    break;
                case 3 : gamer.Out();
                    System.out.println();
                    break;
                case 4 : gamer.champion();
                    break;

            }
            if(no==4){
                System.out.println("경기가 끝났습니다!!!!!!!~");
                break;
            }

        }

    }

}
