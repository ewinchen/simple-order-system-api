package com.ewin.sos.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultDao {

//  @Autowired
//  @Qualifier("kmisSqlSession")
//  private SqlSession kmisSqlSession;
//
//  @Autowired
//  @Qualifier("fnccsSqlSession")
//  private SqlSession fnccsSqlSession;

  @Autowired
  private SqlSession sqlSessionTemplate;

  /**
   * 可以直接调用生成的Mapper 的方法，因为已为sqlSession 注入所有statement
   * 没必要这样用，直接用对应的Mapper 就行了
   * 这里只是测试，验证
   */
//    public Users getUserProxy(long id) {
//        return sqlSessionTemplate.selectOne("selectById", id);
//    }

  /**
   * 调用自定义Mapper 的方法
   */
//    public Users getUser(long id) {
//        return sqlSessionTemplate.selectOne("selectUserById", id);
//    }
//  public List<Map<String, Object>> getPpo() {
//    return sqlSessionTemplate.selectList("selectPpo");
//  }

  /**
   * 调用另一个数据源的自定义Mapper 的方法
   */
//  public List<Map<String, Object>> getEnergy() {
//    return fnccsSqlSession.selectList("selectEnergy");
//  }
//
//  public List<Map<String, Object>> getPdAcElectricDryer() {
//    return fnccsSqlSession.selectList("getPdAcElectricDryer");
//  }
//
//  public List<Map<String, Object>> getPdUcElectricDryer() {
//    return kmisSqlSession.selectList("getPdUcElectricDryer");
//  }

//  public List<Map<String, Object>> getFnAcElectricPreshrinkingMachine() {
//    return fnccsSqlSession.selectList("getFnAcElectricPreshrinkingMachine");
//  }
//
//  public List<Map<String, Object>> getFnAcElectricSettingMachine() {
//    return fnccsSqlSession.selectList("getFnAcElectricSettingMachine");
//  }
//
//  public List<Map<String, Object>> getFnUcElectricSettingMachine() {
//    return kmisSqlSession.selectList("getFnUcElectricSettingMachine");
//  }
}
