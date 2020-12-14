package com.web.jdbc;

import org.junit.Test;

import java.sql.*;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/10 11:32
 * @Version: 1.0
 **/
public class Demo {

    @Test
    public void test01() throws ClassNotFoundException, SQLException {

        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
//        Class.forName("com.mysql.jdbc.Driver");
            Class.forName(Utils.driverClassName);
            conn = DriverManager.getConnection(Utils.url, Utils.username, Utils.password);
//        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@30.20.110.230:11521:webdb", "osgos", "osgos");
            statement = conn.createStatement();
            rs = statement.executeQuery("select * from s_users where user_name like '%zhang%'");
            while (rs.next()){
                System.out.print("id:"+rs.getString("id")+" ");
                System.out.print("name:"+rs.getString("user_name"));
                System.out.println();
            }
            int i = statement.executeUpdate("update s_users set user_name = 'zhangsan' where user_name = 'zhangsan'");
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                rs = null;
            }
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                statement = null;
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }

    }

}
