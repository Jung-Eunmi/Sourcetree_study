package test.model.dao;

import org.apache.ibatis.session.SqlSession;
import test.model.dto.MenuDTO;

import java.util.List;

public class MenuDAO {
    public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {

        return sqlSession.selectList("MenuMapper.selectAllMenu");
    }
}
