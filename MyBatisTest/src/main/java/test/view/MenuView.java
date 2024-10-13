package test.view;

import test.controller.MenuController;

import java.util.Scanner;

public class MenuView {

    public void display() {

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do{
            System.out.println("==============HiMedia 메뉴 관리 시스템==============");
            System.out.println("1. 메뉴 전체 조회하기");
            System.out.println("2. 메뉴 코드로 메뉴 조회하기");
            System.out.println("3. 신규 메뉴 등록하기");
            System.out.println("4. 메뉴 수정하기");
            System.out.println("5. 메뉴 삭제하기");
            System.out.println("==================================================");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 :
                    menuController.selectAllmenu();
                    break;
            }



        }while (true);

    }
}