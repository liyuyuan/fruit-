package afternow.cn.entity.example;

import java.util.ArrayList;
import java.util.List;

public class UserAccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public UserAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
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
     * This method corresponds to the database table user_account
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
     * This method corresponds to the database table user_account
     *
     * @mbggenerated Wed May 09 17:09:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
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
     * This class corresponds to the database table user_account
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAdminUserIsNull() {
            addCriterion("admin_user is null");
            return (Criteria) this;
        }

        public Criteria andAdminUserIsNotNull() {
            addCriterion("admin_user is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUserEqualTo(String value) {
            addCriterion("admin_user =", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotEqualTo(String value) {
            addCriterion("admin_user <>", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserGreaterThan(String value) {
            addCriterion("admin_user >", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserGreaterThanOrEqualTo(String value) {
            addCriterion("admin_user >=", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserLessThan(String value) {
            addCriterion("admin_user <", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserLessThanOrEqualTo(String value) {
            addCriterion("admin_user <=", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserLike(String value) {
            addCriterion("admin_user like", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotLike(String value) {
            addCriterion("admin_user not like", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserIn(List<String> values) {
            addCriterion("admin_user in", values, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotIn(List<String> values) {
            addCriterion("admin_user not in", values, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserBetween(String value1, String value2) {
            addCriterion("admin_user between", value1, value2, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotBetween(String value1, String value2) {
            addCriterion("admin_user not between", value1, value2, "adminUser");
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

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("add_time like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("add_time not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNull() {
            addCriterion("paid_time is null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNotNull() {
            addCriterion("paid_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeEqualTo(String value) {
            addCriterion("paid_time =", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotEqualTo(String value) {
            addCriterion("paid_time <>", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThan(String value) {
            addCriterion("paid_time >", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanOrEqualTo(String value) {
            addCriterion("paid_time >=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThan(String value) {
            addCriterion("paid_time <", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanOrEqualTo(String value) {
            addCriterion("paid_time <=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLike(String value) {
            addCriterion("paid_time like", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotLike(String value) {
            addCriterion("paid_time not like", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIn(List<String> values) {
            addCriterion("paid_time in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotIn(List<String> values) {
            addCriterion("paid_time not in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeBetween(String value1, String value2) {
            addCriterion("paid_time between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotBetween(String value1, String value2) {
            addCriterion("paid_time not between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andAdminNoteIsNull() {
            addCriterion("admin_note is null");
            return (Criteria) this;
        }

        public Criteria andAdminNoteIsNotNull() {
            addCriterion("admin_note is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNoteEqualTo(String value) {
            addCriterion("admin_note =", value, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteNotEqualTo(String value) {
            addCriterion("admin_note <>", value, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteGreaterThan(String value) {
            addCriterion("admin_note >", value, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteGreaterThanOrEqualTo(String value) {
            addCriterion("admin_note >=", value, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteLessThan(String value) {
            addCriterion("admin_note <", value, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteLessThanOrEqualTo(String value) {
            addCriterion("admin_note <=", value, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteLike(String value) {
            addCriterion("admin_note like", value, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteNotLike(String value) {
            addCriterion("admin_note not like", value, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteIn(List<String> values) {
            addCriterion("admin_note in", values, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteNotIn(List<String> values) {
            addCriterion("admin_note not in", values, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteBetween(String value1, String value2) {
            addCriterion("admin_note between", value1, value2, "adminNote");
            return (Criteria) this;
        }

        public Criteria andAdminNoteNotBetween(String value1, String value2) {
            addCriterion("admin_note not between", value1, value2, "adminNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNull() {
            addCriterion("user_note is null");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNotNull() {
            addCriterion("user_note is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoteEqualTo(String value) {
            addCriterion("user_note =", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotEqualTo(String value) {
            addCriterion("user_note <>", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThan(String value) {
            addCriterion("user_note >", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThanOrEqualTo(String value) {
            addCriterion("user_note >=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThan(String value) {
            addCriterion("user_note <", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThanOrEqualTo(String value) {
            addCriterion("user_note <=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLike(String value) {
            addCriterion("user_note like", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotLike(String value) {
            addCriterion("user_note not like", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteIn(List<String> values) {
            addCriterion("user_note in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotIn(List<String> values) {
            addCriterion("user_note not in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteBetween(String value1, String value2) {
            addCriterion("user_note between", value1, value2, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotBetween(String value1, String value2) {
            addCriterion("user_note not between", value1, value2, "userNote");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIsNull() {
            addCriterion("process_type is null");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIsNotNull() {
            addCriterion("process_type is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTypeEqualTo(Integer value) {
            addCriterion("process_type =", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotEqualTo(Integer value) {
            addCriterion("process_type <>", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeGreaterThan(Integer value) {
            addCriterion("process_type >", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_type >=", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeLessThan(Integer value) {
            addCriterion("process_type <", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("process_type <=", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIn(List<Integer> values) {
            addCriterion("process_type in", values, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotIn(List<Integer> values) {
            addCriterion("process_type not in", values, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeBetween(Integer value1, Integer value2) {
            addCriterion("process_type between", value1, value2, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("process_type not between", value1, value2, "processType");
            return (Criteria) this;
        }

        public Criteria andPaymentNameIsNull() {
            addCriterion("payment_name is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNameIsNotNull() {
            addCriterion("payment_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNameEqualTo(String value) {
            addCriterion("payment_name =", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotEqualTo(String value) {
            addCriterion("payment_name <>", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameGreaterThan(String value) {
            addCriterion("payment_name >", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameGreaterThanOrEqualTo(String value) {
            addCriterion("payment_name >=", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameLessThan(String value) {
            addCriterion("payment_name <", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameLessThanOrEqualTo(String value) {
            addCriterion("payment_name <=", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameLike(String value) {
            addCriterion("payment_name like", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotLike(String value) {
            addCriterion("payment_name not like", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameIn(List<String> values) {
            addCriterion("payment_name in", values, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotIn(List<String> values) {
            addCriterion("payment_name not in", values, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameBetween(String value1, String value2) {
            addCriterion("payment_name between", value1, value2, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotBetween(String value1, String value2) {
            addCriterion("payment_name not between", value1, value2, "paymentName");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNull() {
            addCriterion("is_paid is null");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNotNull() {
            addCriterion("is_paid is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaidEqualTo(Integer value) {
            addCriterion("is_paid =", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotEqualTo(Integer value) {
            addCriterion("is_paid <>", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThan(Integer value) {
            addCriterion("is_paid >", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_paid >=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThan(Integer value) {
            addCriterion("is_paid <", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThanOrEqualTo(Integer value) {
            addCriterion("is_paid <=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidIn(List<Integer> values) {
            addCriterion("is_paid in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotIn(List<Integer> values) {
            addCriterion("is_paid not in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidBetween(Integer value1, Integer value2) {
            addCriterion("is_paid between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_paid not between", value1, value2, "isPaid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_account
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
     * This class corresponds to the database table user_account
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