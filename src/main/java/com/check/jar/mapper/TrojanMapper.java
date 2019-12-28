package com.check.jar.mapper;

import com.check.jar.bean.WaBotnetTrojanResult;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-12-29 00:42
 */
public class TrojanMapper {

    private static String resource;

    private static SqlSessionFactory sqlSessionFactory;

    private static SqlSession sqlSession;

    static {

//        resource = JdbcUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath();
//        resource = resource.substring(0,resource.lastIndexOf("/")+1)+"mybatis-config.xml";

        resource = "mybatis-config.xml";

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 构建sqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取sqlSession
        sqlSession = sqlSessionFactory.openSession();
    }

    public static int inserTrojan(WaBotnetTrojanResult result){
        int rows = sqlSession.insert("trojanMapper.insertTrojan",result);
        sqlSession.commit();
        return rows;
    }

    public static int inserTrojanList(List<WaBotnetTrojanResult> list){
        int rows = sqlSession.insert("trojanMapper.insertBotnetTrojanResultList",list);
        sqlSession.commit();
        return rows;
    }

    public static List<Map<String,Long>> getTrojanResults(Map<String,Object> params){
        return sqlSession.selectList("trojanMapper.getBotnetTrojanResults",params);
    }

    public static WaBotnetTrojanResult getBotnetTrojanById(long id){
        return sqlSession.selectOne("trojanMapper.getBotnetTrojanById",id);
    }

    public static Long getTrojanCountMaxId(){
        return sqlSession.selectOne("trojanMapper.getTrojanCountMaxId");
    }

    public static void deleteLeadUserResult(){
        sqlSession.delete("trojanMapper.deleteLeadUserResult");
        sqlSession.commit();
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() {
        return sqlSession;
    }
}
