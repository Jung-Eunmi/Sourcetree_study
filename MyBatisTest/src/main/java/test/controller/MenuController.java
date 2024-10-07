package test.controller;

import test.model.dto.MenuDTO;
import test.model.service.MenuService;
import test.model.service.PrintResult;

import java.util.List;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController(){
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }

    public void selectAllmenu() {
        List<MenuDTO> menuLise = menuService.selectAllMenu();

        if(menuLise != null){
            printResult.printMenuList(menuLise);
        } else {
            System.out.println("조회결과가 없습니다.");
        }

    }
}
