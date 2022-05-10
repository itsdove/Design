package com.example.design.bean;

import java.util.ArrayList;
import java.util.List;

public class Part3nExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Part3nExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueIsNull() {
            addCriterion("U3CGR001MP_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueIsNotNull() {
            addCriterion("U3CGR001MP_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueEqualTo(String value) {
            addCriterion("U3CGR001MP_AVALUE =", value, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueNotEqualTo(String value) {
            addCriterion("U3CGR001MP_AVALUE <>", value, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueGreaterThan(String value) {
            addCriterion("U3CGR001MP_AVALUE >", value, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CGR001MP_AVALUE >=", value, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueLessThan(String value) {
            addCriterion("U3CGR001MP_AVALUE <", value, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CGR001MP_AVALUE <=", value, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueLike(String value) {
            addCriterion("U3CGR001MP_AVALUE like", value, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueNotLike(String value) {
            addCriterion("U3CGR001MP_AVALUE not like", value, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueIn(List<String> values) {
            addCriterion("U3CGR001MP_AVALUE in", values, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueNotIn(List<String> values) {
            addCriterion("U3CGR001MP_AVALUE not in", values, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueBetween(String value1, String value2) {
            addCriterion("U3CGR001MP_AVALUE between", value1, value2, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mpAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CGR001MP_AVALUE not between", value1, value2, "u3cgr001mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueIsNull() {
            addCriterion("U3CGR003MP_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueIsNotNull() {
            addCriterion("U3CGR003MP_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueEqualTo(String value) {
            addCriterion("U3CGR003MP_AVALUE =", value, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueNotEqualTo(String value) {
            addCriterion("U3CGR003MP_AVALUE <>", value, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueGreaterThan(String value) {
            addCriterion("U3CGR003MP_AVALUE >", value, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CGR003MP_AVALUE >=", value, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueLessThan(String value) {
            addCriterion("U3CGR003MP_AVALUE <", value, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CGR003MP_AVALUE <=", value, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueLike(String value) {
            addCriterion("U3CGR003MP_AVALUE like", value, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueNotLike(String value) {
            addCriterion("U3CGR003MP_AVALUE not like", value, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueIn(List<String> values) {
            addCriterion("U3CGR003MP_AVALUE in", values, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueNotIn(List<String> values) {
            addCriterion("U3CGR003MP_AVALUE not in", values, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueBetween(String value1, String value2) {
            addCriterion("U3CGR003MP_AVALUE between", value1, value2, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr003mpAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CGR003MP_AVALUE not between", value1, value2, "u3cgr003mpAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueIsNull() {
            addCriterion("U3CGR001MD_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueIsNotNull() {
            addCriterion("U3CGR001MD_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueEqualTo(String value) {
            addCriterion("U3CGR001MD_AVALUE =", value, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueNotEqualTo(String value) {
            addCriterion("U3CGR001MD_AVALUE <>", value, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueGreaterThan(String value) {
            addCriterion("U3CGR001MD_AVALUE >", value, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CGR001MD_AVALUE >=", value, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueLessThan(String value) {
            addCriterion("U3CGR001MD_AVALUE <", value, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CGR001MD_AVALUE <=", value, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueLike(String value) {
            addCriterion("U3CGR001MD_AVALUE like", value, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueNotLike(String value) {
            addCriterion("U3CGR001MD_AVALUE not like", value, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueIn(List<String> values) {
            addCriterion("U3CGR001MD_AVALUE in", values, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueNotIn(List<String> values) {
            addCriterion("U3CGR001MD_AVALUE not in", values, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueBetween(String value1, String value2) {
            addCriterion("U3CGR001MD_AVALUE between", value1, value2, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr001mdAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CGR001MD_AVALUE not between", value1, value2, "u3cgr001mdAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueIsNull() {
            addCriterion("U3CGR059MN_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueIsNotNull() {
            addCriterion("U3CGR059MN_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueEqualTo(String value) {
            addCriterion("U3CGR059MN_AVALUE =", value, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueNotEqualTo(String value) {
            addCriterion("U3CGR059MN_AVALUE <>", value, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueGreaterThan(String value) {
            addCriterion("U3CGR059MN_AVALUE >", value, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CGR059MN_AVALUE >=", value, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueLessThan(String value) {
            addCriterion("U3CGR059MN_AVALUE <", value, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CGR059MN_AVALUE <=", value, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueLike(String value) {
            addCriterion("U3CGR059MN_AVALUE like", value, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueNotLike(String value) {
            addCriterion("U3CGR059MN_AVALUE not like", value, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueIn(List<String> values) {
            addCriterion("U3CGR059MN_AVALUE in", values, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueNotIn(List<String> values) {
            addCriterion("U3CGR059MN_AVALUE not in", values, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueBetween(String value1, String value2) {
            addCriterion("U3CGR059MN_AVALUE between", value1, value2, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059mnAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CGR059MN_AVALUE not between", value1, value2, "u3cgr059mnAvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueIsNull() {
            addCriterion("U3CGR059SN_LVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueIsNotNull() {
            addCriterion("U3CGR059SN_LVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueEqualTo(String value) {
            addCriterion("U3CGR059SN_LVALUE =", value, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueNotEqualTo(String value) {
            addCriterion("U3CGR059SN_LVALUE <>", value, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueGreaterThan(String value) {
            addCriterion("U3CGR059SN_LVALUE >", value, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CGR059SN_LVALUE >=", value, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueLessThan(String value) {
            addCriterion("U3CGR059SN_LVALUE <", value, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CGR059SN_LVALUE <=", value, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueLike(String value) {
            addCriterion("U3CGR059SN_LVALUE like", value, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueNotLike(String value) {
            addCriterion("U3CGR059SN_LVALUE not like", value, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueIn(List<String> values) {
            addCriterion("U3CGR059SN_LVALUE in", values, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueNotIn(List<String> values) {
            addCriterion("U3CGR059SN_LVALUE not in", values, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueBetween(String value1, String value2) {
            addCriterion("U3CGR059SN_LVALUE between", value1, value2, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr059snLvalueNotBetween(String value1, String value2) {
            addCriterion("U3CGR059SN_LVALUE not between", value1, value2, "u3cgr059snLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueIsNull() {
            addCriterion("U3CGR039SP_LVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueIsNotNull() {
            addCriterion("U3CGR039SP_LVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueEqualTo(String value) {
            addCriterion("U3CGR039SP_LVALUE =", value, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueNotEqualTo(String value) {
            addCriterion("U3CGR039SP_LVALUE <>", value, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueGreaterThan(String value) {
            addCriterion("U3CGR039SP_LVALUE >", value, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CGR039SP_LVALUE >=", value, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueLessThan(String value) {
            addCriterion("U3CGR039SP_LVALUE <", value, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CGR039SP_LVALUE <=", value, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueLike(String value) {
            addCriterion("U3CGR039SP_LVALUE like", value, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueNotLike(String value) {
            addCriterion("U3CGR039SP_LVALUE not like", value, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueIn(List<String> values) {
            addCriterion("U3CGR039SP_LVALUE in", values, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueNotIn(List<String> values) {
            addCriterion("U3CGR039SP_LVALUE not in", values, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueBetween(String value1, String value2) {
            addCriterion("U3CGR039SP_LVALUE between", value1, value2, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr039spLvalueNotBetween(String value1, String value2) {
            addCriterion("U3CGR039SP_LVALUE not between", value1, value2, "u3cgr039spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueIsNull() {
            addCriterion("U3CGR055SP_LVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueIsNotNull() {
            addCriterion("U3CGR055SP_LVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueEqualTo(String value) {
            addCriterion("U3CGR055SP_LVALUE =", value, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueNotEqualTo(String value) {
            addCriterion("U3CGR055SP_LVALUE <>", value, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueGreaterThan(String value) {
            addCriterion("U3CGR055SP_LVALUE >", value, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CGR055SP_LVALUE >=", value, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueLessThan(String value) {
            addCriterion("U3CGR055SP_LVALUE <", value, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CGR055SP_LVALUE <=", value, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueLike(String value) {
            addCriterion("U3CGR055SP_LVALUE like", value, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueNotLike(String value) {
            addCriterion("U3CGR055SP_LVALUE not like", value, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueIn(List<String> values) {
            addCriterion("U3CGR055SP_LVALUE in", values, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueNotIn(List<String> values) {
            addCriterion("U3CGR055SP_LVALUE not in", values, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueBetween(String value1, String value2) {
            addCriterion("U3CGR055SP_LVALUE between", value1, value2, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr055spLvalueNotBetween(String value1, String value2) {
            addCriterion("U3CGR055SP_LVALUE not between", value1, value2, "u3cgr055spLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueIsNull() {
            addCriterion("U3CGR045ST_LVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueIsNotNull() {
            addCriterion("U3CGR045ST_LVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueEqualTo(String value) {
            addCriterion("U3CGR045ST_LVALUE =", value, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueNotEqualTo(String value) {
            addCriterion("U3CGR045ST_LVALUE <>", value, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueGreaterThan(String value) {
            addCriterion("U3CGR045ST_LVALUE >", value, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CGR045ST_LVALUE >=", value, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueLessThan(String value) {
            addCriterion("U3CGR045ST_LVALUE <", value, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CGR045ST_LVALUE <=", value, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueLike(String value) {
            addCriterion("U3CGR045ST_LVALUE like", value, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueNotLike(String value) {
            addCriterion("U3CGR045ST_LVALUE not like", value, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueIn(List<String> values) {
            addCriterion("U3CGR045ST_LVALUE in", values, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueNotIn(List<String> values) {
            addCriterion("U3CGR045ST_LVALUE not in", values, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueBetween(String value1, String value2) {
            addCriterion("U3CGR045ST_LVALUE between", value1, value2, "u3cgr045stLvalue");
            return (Criteria) this;
        }

        public Criteria andU3cgr045stLvalueNotBetween(String value1, String value2) {
            addCriterion("U3CGR045ST_LVALUE not between", value1, value2, "u3cgr045stLvalue");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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