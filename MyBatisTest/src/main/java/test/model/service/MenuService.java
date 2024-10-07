package test.model.service;

import org.apache.ibatis.session.SqlSession;
import test.model.dao.MenuDAO;
import test.model.dto.MenuDTO;

import java.util.List;

import static test.common.Template.getSqlSession;

public class MenuService {

    private final MenuDAO menuDAO;

    public MenuService() {
        this.menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);

        sqlSession.close();

        return menuList;
    }
}
