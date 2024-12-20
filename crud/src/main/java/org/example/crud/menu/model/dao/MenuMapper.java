package org.example.crud.menu.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.crud.menu.model.dto.MenuDTO;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<MenuDTO> allMenu();


    MenuDTO oneMenu(int menuCode);
}
