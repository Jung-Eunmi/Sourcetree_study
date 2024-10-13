package model.dao;

import model.dto.MenuDTO;

import java.util.List;

public interface MenuMapper {

    List<MenuDTO> selectMenuByCode(int categoryCode);
}
