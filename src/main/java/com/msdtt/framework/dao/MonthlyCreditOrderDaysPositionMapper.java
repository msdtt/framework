package com.msdtt.framework.dao;

import com.msdtt.framework.model.MonthlyCreditOrderDaysPosition;
import com.msdtt.framework.model.MonthlyCreditOrderDaysPositionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthlyCreditOrderDaysPositionMapper {
    /**
     * monthly_credit_order_days_position数据表的操作方法: countByExample  
     * 
     */
    int countByExample(MonthlyCreditOrderDaysPositionCriteria example);

    /**
     * monthly_credit_order_days_position数据表的操作方法: deleteByExample  
     * 
     */
    int deleteByExample(MonthlyCreditOrderDaysPositionCriteria example);

    /**
     * monthly_credit_order_days_position数据表的操作方法: insert  
     * 
     */
    int insert(MonthlyCreditOrderDaysPosition record);

    /**
     * monthly_credit_order_days_position数据表的操作方法: insertSelective  
     * 
     */
    int insertSelective(MonthlyCreditOrderDaysPosition record);

    /**
     * monthly_credit_order_days_position数据表的操作方法: selectByExample  
     * 
     */
    List<MonthlyCreditOrderDaysPosition> selectByExample(MonthlyCreditOrderDaysPositionCriteria example);

    /**
     * monthly_credit_order_days_position数据表的操作方法: lockByExample  
     * 
     */
    MonthlyCreditOrderDaysPosition lockByExample(MonthlyCreditOrderDaysPositionCriteria example);

    /**
     * monthly_credit_order_days_position数据表的操作方法: updateByExampleSelective  
     * 
     */
    int updateByExampleSelective(@Param("record") MonthlyCreditOrderDaysPosition record, @Param("example") MonthlyCreditOrderDaysPositionCriteria example);

    /**
     * monthly_credit_order_days_position数据表的操作方法: updateByExample  
     * 
     */
    int updateByExample(@Param("record") MonthlyCreditOrderDaysPosition record, @Param("example") MonthlyCreditOrderDaysPositionCriteria example);
}