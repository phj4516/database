package com.middleground.database.service.impl;

import com.middleground.database.pojo.entity.DatabaseDo;
import com.middleground.database.mapper.DatabaseDoMapper;
import com.middleground.database.service.IDatabaseDoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jinzhiyuan
 * @since 2020-11-19
 */
@Service
public class DatabaseDoServiceImpl extends ServiceImpl<DatabaseDoMapper, DatabaseDo> implements IDatabaseDoService {

    public void doDatabase(){

//        Databasedo databasedo = databasedoMapper.selectById(1);
//
//
//        ResultSet rs = null;
//        Statement stmt = null;
//        Connection con = null;
//        try{
//            //加载MySql的驱动类
//            Class.forName("com.mysql.jdbc.Driver") ;
//            //配置
//            String url = databasedo.getUrl()+"?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai&allowMultiQueries=true";
//            String username = databasedo.getUsername() ;
//            String password = databasedo.getPassword() ;
//            //创建数据库的连接
//            con = DriverManager.getConnection(url , username , password ) ;
//            //sqlStr
//            String sql = databasedo.getSqlStr();
//            //创建一个preparedStatement
//            stmt = con.createStatement() ;
//            PreparedStatement pstmt = con.prepareStatement(sql) ;
//            //执行SQL语句
//            pstmt.execute();
//            databasedo.setResult(2);
//            databasedoMapper.updateById(databasedo);
//        }catch(Exception e){
//            e.printStackTrace() ;
//            databasedo.setResult(1);
//            databasedoMapper.updateById(databasedo);
//        }finally {
//            if(rs !=null){   // 关闭记录集
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(stmt !=null){   // 关闭声明
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(con !=null){  // 关闭连接对象
//                try {
//                    con.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    @Override
    public List<DatabaseDo> listByMissionId(Long missionId) {
        return this.getBaseMapper().getListByMissionId(missionId);
    }

    @Override
    @Transactional
    public Long saveOrUpdateDatabaseDo(DatabaseDo databaseDo) {
        this.saveOrUpdate(databaseDo);
        return databaseDo.getDatabaseDoId();
    }
}
