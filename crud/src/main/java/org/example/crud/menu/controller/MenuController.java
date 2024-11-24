package org.example.crud.menu.controller;

import org.example.crud.menu.model.dto.MenuDTO;
import org.example.crud.menu.model.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menu/*")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/all")
    public String allMenu(Model model){

        List<MenuDTO> menuList = menuService.allMenu();
        for(MenuDTO menu : menuList ){
        System.out.println("menu = " + menu);}

        model.addAttribute("menuList", menuList);

        return "/menu/all";
    }
}
