package com.msdtt.framework.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestCriteria {
    /**
     * test表的操作属性:orderByClause
     * 
     */
    protected String orderByClause;

    /**
     * test表的操作属性:start
     * 
     */
    protected int start;

    /**
     * test表的操作属性:limit
     * 
     */
    protected int limit;

    /**
     * test表的操作属性:distinct
     * 
     */
    protected boolean distinct;

    /**
     * test表的操作属性:oredCriteria
     * 
     */
    protected List<Criteria> oredCriteria;

    /**
     * test数据表的操作方法: TestCriteria  
     * 
     */
    public TestCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * test数据表的操作方法: setOrderByClause  
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * test数据表的操作方法: getOrderByClause  
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * test数据表的操作方法: setStart  
     * 
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * test数据表的操作方法: getStart  
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * test数据表的操作方法: setLimit  
     * 
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * test数据表的操作方法: getLimit  
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * test数据表的操作方法: setDistinct  
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * test数据表的操作方法: isDistinct  
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * test数据表的操作方法: getOredCriteria  
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * test数据表的操作方法: or  
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * test数据表的操作方法: or  
     * 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * test数据表的操作方法: createCriteria  
     * 
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * test数据表的操作方法: createCriteriaInternal  
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * test数据表的操作方法: clear  
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * test表的操作类
     * 
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMonthsIsNull() {
            addCriterion("months is null");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNotNull() {
            addCriterion("months is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsEqualTo(Integer value) {
            addCriterion("months =", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotEqualTo(Integer value) {
            addCriterion("months <>", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThan(Integer value) {
            addCriterion("months >", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThanOrEqualTo(Integer value) {
            addCriterion("months >=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThan(Integer value) {
            addCriterion("months <", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThanOrEqualTo(Integer value) {
            addCriterion("months <=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsIn(List<Integer> values) {
            addCriterion("months in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotIn(List<Integer> values) {
            addCriterion("months not in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsBetween(Integer value1, Integer value2) {
            addCriterion("months between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotBetween(Integer value1, Integer value2) {
            addCriterion("months not between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andExpiredAtIsNull() {
            addCriterion("expired_at is null");
            return (Criteria) this;
        }

        public Criteria andExpiredAtIsNotNull() {
            addCriterion("expired_at is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredAtEqualTo(Integer value) {
            addCriterion("expired_at =", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtNotEqualTo(Integer value) {
            addCriterion("expired_at <>", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtGreaterThan(Integer value) {
            addCriterion("expired_at >", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("expired_at >=", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtLessThan(Integer value) {
            addCriterion("expired_at <", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtLessThanOrEqualTo(Integer value) {
            addCriterion("expired_at <=", value, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtIn(List<Integer> values) {
            addCriterion("expired_at in", values, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtNotIn(List<Integer> values) {
            addCriterion("expired_at not in", values, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtBetween(Integer value1, Integer value2) {
            addCriterion("expired_at between", value1, value2, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andExpiredAtNotBetween(Integer value1, Integer value2) {
            addCriterion("expired_at not between", value1, value2, "expiredAt");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRepayAtIsNull() {
            addCriterion("repay_at is null");
            return (Criteria) this;
        }

        public Criteria andRepayAtIsNotNull() {
            addCriterion("repay_at is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAtEqualTo(Integer value) {
            addCriterion("repay_at =", value, "repayAt");
            return (Criteria) this;
        }

        public Criteria andRepayAtNotEqualTo(Integer value) {
            addCriterion("repay_at <>", value, "repayAt");
            return (Criteria) this;
        }

        public Criteria andRepayAtGreaterThan(Integer value) {
            addCriterion("repay_at >", value, "repayAt");
            return (Criteria) this;
        }

        public Criteria andRepayAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("repay_at >=", value, "repayAt");
            return (Criteria) this;
        }

        public Criteria andRepayAtLessThan(Integer value) {
            addCriterion("repay_at <", value, "repayAt");
            return (Criteria) this;
        }

        public Criteria andRepayAtLessThanOrEqualTo(Integer value) {
            addCriterion("repay_at <=", value, "repayAt");
            return (Criteria) this;
        }

        public Criteria andRepayAtIn(List<Integer> values) {
            addCriterion("repay_at in", values, "repayAt");
            return (Criteria) this;
        }

        public Criteria andRepayAtNotIn(List<Integer> values) {
            addCriterion("repay_at not in", values, "repayAt");
            return (Criteria) this;
        }

        public Criteria andRepayAtBetween(Integer value1, Integer value2) {
            addCriterion("repay_at between", value1, value2, "repayAt");
            return (Criteria) this;
        }

        public Criteria andRepayAtNotBetween(Integer value1, Integer value2) {
            addCriterion("repay_at not between", value1, value2, "repayAt");
            return (Criteria) this;
        }
    }

    /**
     * test表的操作类
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * test表的操作类
     * 
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}