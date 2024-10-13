package model.service;

import model.dao.MenuMapper;
import model.dto.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static common.Template.getSqlSession;

public class MenuService {

    private MenuMapper menuMapper;

    public List<MenuDTO> selectMenuByCode(int categoryCode) {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menuList = menuMapper.selectMenuByCode(categoryCode);

        sqlSession.close();

        return menuList;
    }
}
