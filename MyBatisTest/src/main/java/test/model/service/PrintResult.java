package test.model.service;

import test.model.dto.MenuDTO;

import java.util.List;

public class PrintResult {

    public void printMenuList(List<MenuDTO> menuLise) {
        System.out.println("요청하신 전체 메뉴 조회 결과입니다.");

        for(MenuDTO menu : menuLise) {
            System.out.println(menu);
        }

        System.out.println("================================");
    }
}
