package view;

import controller.MenuController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuView {

    public void display() {

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("============HiMedia 메뉴 관리 시스템============");
            System.out.println("1. 카테고리 코드로 메뉴 조회하기");
            System.out.println("9. 프로그램 종료");
            System.out.println("==============================================");
            System.out.print("실행 할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 :
                    menuController.selectMenuByCode(inputCategoryCode());
                    break;
                case 9 :
                    System.out.println("프로그램 종료되었습니다.");
                    return;
            }



        }while (true);



    }

    private static Map<String, String> inputCategoryCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("categoryCode",categoryCode);

        return parameter;
    }
}
