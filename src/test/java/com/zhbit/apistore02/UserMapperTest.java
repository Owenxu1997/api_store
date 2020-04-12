//package com.zhbit.apistore02;
//
//import com.zhbit.apistore02.pojo.User;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//public class UserMapperTest {
//
//    @Test
//    public void UserTest() {
//
//        //获得sqlSession对象
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        //方式一：getMapper执行sql
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.getUserList();
//
//        for (User user : userList){
//            System.out.println(user);
//        }
//
//        sqlSession.close();
//    }
//}
