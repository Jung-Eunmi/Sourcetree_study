package org.example.crud.menu.model.service;

import org.example.crud.menu.model.dao.MenuMapper;
import org.example.crud.menu.model.dto.MenuDTO;
import org.springframework.stereotype.Service;

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
}
