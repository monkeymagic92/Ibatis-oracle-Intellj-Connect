package com.jy.test.service;

import com.jy.test.dao.TestDaoImpl;
import com.jy.test.model.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDaoImpl dao;

    public List<TestVO> selBoard() {
        return dao.selBoard();
    }

}
