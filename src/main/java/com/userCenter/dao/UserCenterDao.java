package com.userCenter.dao;

import com.alibaba.fastjson.JSON;
import com.userCenter.pojo.UserCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class UserCenterDao {

    @Autowired
    @Qualifier("masterJdbcTemplate")
    private JdbcTemplate jdbcTemplate;


    public String getUserList() {
        String sql = "SELECT * FROM yonghuzhuce";
        try {
            List<UserCenter> list = jdbcTemplate.query(sql, new RowMapper<UserCenter>() {/*匿名实现类*/
                @Override
                public UserCenter mapRow(ResultSet resultSet, int i) throws SQLException {
                    UserCenter userCenter1 = new UserCenter();/*实例化*/
                    userCenter1.setId(resultSet.getInt("ID"));
                    userCenter1.setJibie(resultSet.getString("jibie"));
                    userCenter1.setName(resultSet.getString("name"));
                    return userCenter1;
                }
            });
            return JSON.toJSONString(list);/*对象返回字符串*/
        } catch (Exception e) {
            e.printStackTrace();/*调用异常中的方法，输出异常信息*/
            return "ERROR";
        }
    }
}
