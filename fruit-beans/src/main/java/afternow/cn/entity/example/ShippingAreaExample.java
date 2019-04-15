package afternow.cn.entity.example;

import java.util.ArrayList;
import java.util.List;

public class ShippingAreaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public ShippingAreaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
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

        public Criteria andShippingAreaIdIsNull() {
            addCriterion("shipping_area_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdIsNotNull() {
            addCriterion("shipping_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdEqualTo(Integer value) {
            addCriterion("shipping_area_id =", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotEqualTo(Integer value) {
            addCriterion("shipping_area_id <>", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdGreaterThan(Integer value) {
            addCriterion("shipping_area_id >", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_area_id >=", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdLessThan(Integer value) {
            addCriterion("shipping_area_id <", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_area_id <=", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdIn(List<Integer> values) {
            addCriterion("shipping_area_id in", values, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotIn(List<Integer> values) {
            addCriterion("shipping_area_id not in", values, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("shipping_area_id between", value1, value2, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_area_id not between", value1, value2, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(Integer value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(Integer value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(Integer value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(Integer value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<Integer> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<Integer> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(Integer value1, Integer value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameIsNull() {
            addCriterion("shipping_area_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameIsNotNull() {
            addCriterion("shipping_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameEqualTo(String value) {
            addCriterion("shipping_area_name =", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotEqualTo(String value) {
            addCriterion("shipping_area_name <>", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameGreaterThan(String value) {
            addCriterion("shipping_area_name >", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_area_name >=", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLessThan(String value) {
            addCriterion("shipping_area_name <", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_area_name <=", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameLike(String value) {
            addCriterion("shipping_area_name like", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotLike(String value) {
            addCriterion("shipping_area_name not like", value, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameIn(List<String> values) {
            addCriterion("shipping_area_name in", values, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotIn(List<String> values) {
            addCriterion("shipping_area_name not in", values, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameBetween(String value1, String value2) {
            addCriterion("shipping_area_name between", value1, value2, "shippingAreaName");
            return (Criteria) this;
        }

        public Criteria andShippingAreaNameNotBetween(String value1, String value2) {
            addCriterion("shipping_area_name not between", value1, value2, "shippingAreaName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shipping_area
     *
     * @mbggenerated do_not_delete_during_merge Wed May 09 17:09:45 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shipping_area
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
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