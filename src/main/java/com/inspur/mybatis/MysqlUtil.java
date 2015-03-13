package com.inspur.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MysqlUtil {
	private  final static SqlSessionFactory sqlSessionFactory;   
    static {   
       Reader reader = null;   
       try {   
           reader = Resources.getResourceAsReader("com/inspur/mybatis/mybatis-mysql-config.xml");
       } catch (IOException e) {   
           System.out.println(e.getMessage());   
       }
       sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);   
    }   
    public static SqlSessionFactory getSqlSessionFactory() {   
       return sqlSessionFactory;   
    }  
}
