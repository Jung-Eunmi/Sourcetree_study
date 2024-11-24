package org.example.crud.menu.model.service;

import org.example.crud.menu.model.dao.MenuMapper;
import org.example.crud.menu.model.dto.MenuDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class MenuService {

    private final MenuMapper menuMapper;

    public MenuService(MenuMapper menuMapper){
        this.menuMapper = menuMapper;
    }
    public List<MenuDTO> allMenu() {

        return menuMapper.allMenu();
    }

    public MenuDTO oneMenu(int menuCode) {

        return menuMapper.oneMenu(menuCode);
    }
}
