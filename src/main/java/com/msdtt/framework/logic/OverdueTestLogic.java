package com.msdtt.framework.logic;

import com.msdtt.framework.dao.MonthlyCreditOrderDaysPositionMapper;
import com.msdtt.framework.dao.TestMapper;
import com.msdtt.framework.model.MonthlyCreditOrderDaysPosition;
import com.msdtt.framework.model.Test;
import com.msdtt.framework.model.TestCriteria;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author zhuxd@wjs.com
 * @date 2017/10/20 1:42
 */
@Repository
public class OverdueTestLogic{
	@Autowired
	private TestMapper testMapper;
	@Autowired
	private MonthlyCreditOrderDaysPositionMapper monthlyCreditOrderDaysPositionMapper;

	public void test(){
		for(int i = 0;; i++){
			TestCriteria criteria = new TestCriteria();
			criteria.createCriteria().andExpiredAtLessThanOrEqualTo(20170930);
			criteria.setLimit(1000);
			criteria.setStart(i*1000);
			List<Test> testList =testMapper.selectByExample(criteria);

			for(Test test : testList){
				if(test.getRepayAt() == 0){
					Test b = getBy(test.getOrderNo(), test.getPosition());
					if(b.getRepayAt() > test.getExpiredAt()){
						initByTest(test, b);
					}else {
						Test a = getTest(test.getOrderNo(), b.getPosition() + 1);
						initByTest(test, a);
					}
				}else if(test.getExpiredAt() < test.getRepayAt()){
					Test b = getByA(test);
					initByTest(test, b);
				}
			}
		}

	}


	private void initByTest(Test test, Test b){
		Integer repayAt = test.getRepayAt();
		if(repayAt == 0){
			repayAt = 20170930;
		}
		BigDecimal amount = getAmount(test.getOrderNo(), b.getPosition());
		inti(test, 1, amount);
		if(addDays(b.getExpiredAt(), 9) < repayAt){
			inti(test, 8, amount);
		}
		if(addDays(b.getExpiredAt(), 31) < repayAt){
			inti(test, 30, amount);
		}
		if(addDays(b.getExpiredAt(), 61) < repayAt){
			inti(test, 60, amount);
		}
		if(addDays(b.getExpiredAt(), 91) < repayAt){
			inti(test, 90, amount);
		}
	}

	private void inti(Test test, Integer days, BigDecimal amount){
		MonthlyCreditOrderDaysPosition monthlyCreditOrderDaysPosition = new MonthlyCreditOrderDaysPosition();
		monthlyCreditOrderDaysPosition.setMonthly(test.getMonths());
		monthlyCreditOrderDaysPosition.setOrderNo(test.getOrderNo());
		monthlyCreditOrderDaysPosition.setPosition(test.getPosition());
		monthlyCreditOrderDaysPosition.setAmount(amount);
		monthlyCreditOrderDaysPosition.setDays(days);

		monthlyCreditOrderDaysPositionMapper.insert(monthlyCreditOrderDaysPosition);
	}

	public BigDecimal getAmount(String orderNo, Integer position){
		TestCriteria criteria = new TestCriteria();
		criteria.createCriteria().andOrderNoEqualTo(orderNo)
				.andPositionGreaterThanOrEqualTo(position);

		return testMapper.selectByExample(criteria).stream().map(Test::getAmount).reduce(BigDecimal.ZERO,(a,b)->a.add(b));
	}

	public Test getBy(String orderNo, Integer position){
		TestCriteria criteria = new TestCriteria();
		criteria.createCriteria().andOrderNoEqualTo(orderNo)
				.andPositionLessThanOrEqualTo(position)
				.andRepayAtNotEqualTo(0);

		criteria.setOrderByClause("position desc");
		List<Test> list = testMapper.selectByExample(criteria);
		if(CollectionUtils.isEmpty(list)){
			TestCriteria criteria1 = new TestCriteria();
			criteria.createCriteria().andOrderNoEqualTo(orderNo)
					.andPositionEqualTo(1);
			List<Test> list1 = testMapper.selectByExample(criteria1);
			return list1.get(0);
		}
		return  list.get(0);
	}


	public Test getTest(String orderNo, Integer position){
		TestCriteria criteria = new TestCriteria();
		criteria.createCriteria().andOrderNoEqualTo(orderNo)
				.andPositionEqualTo(position);


		return testMapper.selectByExample(criteria).get(0);
	}
	public Test getByA(Test test){
		TestCriteria criteria = new TestCriteria();
		criteria.createCriteria().andOrderNoEqualTo(test.getOrderNo())
				.andPositionLessThanOrEqualTo(test.getPosition());

		criteria.setOrderByClause("position desc");
		List<Test> dblist = testMapper.selectByExample(criteria);
		Test reTest = test;
		for(Test dbTest : dblist){
			if(test.getExpiredAt() >= dbTest.getRepayAt()){
				break;
			}
			reTest = dbTest;
		}
		return reTest;
	}


	public static Integer addDays(Integer start, int days) {
		Date startDate = integerFormatDate(start);
		return dateFormatInteger(addDays(startDate, days));
	}

	private static Integer dateFormatInteger(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return Integer.valueOf(sdf.format(date));
	}

	public static Date integerFormatDate(Integer startInteger) {
		Date formatDate = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			formatDate = sdf.parse(Integer.toString(startInteger.intValue()));
		} catch (ParseException var3) {
			;
		}

		return formatDate;
	}

	public static Date addDays(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(5, days);
		return calendar.getTime();
	}

	public static Integer addMonths(Integer date, Integer months) {
		Date startDate = integerFormatDate(date);
		return dateFormatInteger(addMonths(startDate, months.intValue()));
	}

	public static Date addMonths(Date date, int months) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(2, months);
		return calendar.getTime();
	}

}
