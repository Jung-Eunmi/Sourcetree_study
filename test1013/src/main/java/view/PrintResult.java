package view;

import model.dto.MenuDTO;

import java.util.List;

public class PrintResult {

    public void printMenu(List<MenuDTO> menuList) {

        System.out.println("요청하신 카테고리코드의 메뉴 조회 결과입니다.");

        for (MenuDTO menuDTO : menuList){
            System.out.println(menuDTO);
        }

        System.out.println("==============================================");

    }

    public void printErrorMeMessager(String errorCode) {

        String errorMessage = "";
        switch (errorCode){
            case "selectList" :
                errorMessage = "메뉴 조회에 실패하셨습니다. 카테고리 코드를 다시 입력해주세요";
                break;
        }

        System.out.println(errorMessage);

    }
}
