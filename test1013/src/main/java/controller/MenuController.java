package controller;

import model.dto.MenuDTO;
import model.service.MenuService;
import view.PrintResult;

import java.util.List;
import java.util.Map;

public class MenuController {
    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }

    public void selectMenuByCode(Map<String, String> parameter) {

        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        List<MenuDTO> menuList = menuService.selectMenuByCode(categoryCode);

        if(menuList != null) {
            printResult.printMenu(menuList);
        }else {
            printResult.printErrorMeMessager("selectList");
        }


    }
}
