package com.skw.audioserver.userserver;

import com.skw.audioserver.userserver.model.PlayerInfo;
import com.skw.audioserver.userserver.util.MybatisUtil;
import com.skw.userBean.UserRegisterBean;
import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;

public class UserDao {
    //建立一个工厂,获取连接
    SqlSession sqlSession;
    public UserDao(){
        sqlSession = MybatisUtil.getSqlSession();
    }
    public PlayerInfo register(UserRegisterBean userRegisterBean){
        PlayerInfo playerInfo = new PlayerInfo();
        playerInfo.setName(userRegisterBean.getName());
        playerInfo.setPassword(userRegisterBean.getPassword());
        int row = sqlSession.insert("PlayerMapper.add", playerInfo);
        sqlSession.commit();
        if(row>0){
            return query(playerInfo);
        }else{
            return null;
        }
    }
    public PlayerInfo query(PlayerInfo playerInfo){
        return sqlSession.selectOne("PlayerMapper.select",playerInfo);
    }
}
