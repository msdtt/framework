package com.msdtt.framework.dao;

import com.msdtt.framework.model.Test;
import com.msdtt.framework.model.TestCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    /**
     * test数据表的操作方法: countByExample  
     * 
     */
    int countByExample(TestCriteria example);

    /**
     * test数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(TestCriteria example);

    /**
     * test数据表的操作方法: insert  
     * 
     */
    int insert(Test record);

    /**
     * test数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(Test record);

    /**
     * test数据表的操作方法: selectByExample  
     * 
     */
    List<Test> selectByExample(TestCriteria example);

    /**
     * test数据表的操作方法: lockByExample  
     * 
     */
    Test lockByExample(TestCriteria example);

    /**
     * test数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestCriteria example);

    /**
     * test数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") Test record, @Param("example") TestCriteria example);
}