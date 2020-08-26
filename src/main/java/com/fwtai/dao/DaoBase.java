package com.fwtai.dao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

/**
 * dao底层操作处理工具类
 */
@Repository
public class DaoBase{

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSession;

    /**
     * 用于查询返回String
     */
    public String queryForString(final String sqlMapId) throws Exception{
        return sqlSession.selectOne(sqlMapId);
    }

    /**
     * 用于查询返回String
     */
    public String queryForString(final String sqlMapId,final Object objParam) throws Exception{
        return sqlSession.selectOne(sqlMapId,objParam);
    }

    /**
     * 查询返回List《HashMap<String,String>》-ok
     */
    public List<HashMap<String,String>> queryForListHashMapString(final String sqlMapId,final Object objParam) throws Exception{
        return sqlSession.selectList(sqlMapId,objParam);
    }

    /**
     * 查询返回List《HashMap<String,Object>》-ok
     */
    public List<HashMap<String,Object>> queryForListHashMap(final String sqlMapId,final Object objParam) throws Exception{
        return sqlSession.selectList(sqlMapId,objParam);
    }

    /**
     * 查询返回List《HashMap<String,Object>》-ok
     */
    public <T> List<T> queryForListBean(final String sqlMapId,final Object objParam) throws Exception{
        return sqlSession.selectList(sqlMapId,objParam);
    }
}