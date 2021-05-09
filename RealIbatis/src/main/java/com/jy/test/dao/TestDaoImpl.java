package com.jy.test.dao;

import com.jy.test.model.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDaoImpl implements TestDao{

    @Autowired
    SqlMapClientTemplate sqlmap;


    @Override
    public List<TestVO> selBoard() {
        return sqlmap.queryForList("bbs.selBoard");
    }
}
