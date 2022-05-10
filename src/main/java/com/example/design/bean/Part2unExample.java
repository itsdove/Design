package com.example.design.bean;

import java.util.ArrayList;
import java.util.List;

public class Part2unExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Part2unExample() {
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

        public Criteria andU3crf107mvAvalueIsNull() {
            addCriterion("U3CRF107MV_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueIsNotNull() {
            addCriterion("U3CRF107MV_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueEqualTo(String value) {
            addCriterion("U3CRF107MV_AVALUE =", value, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueNotEqualTo(String value) {
            addCriterion("U3CRF107MV_AVALUE <>", value, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueGreaterThan(String value) {
            addCriterion("U3CRF107MV_AVALUE >", value, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF107MV_AVALUE >=", value, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueLessThan(String value) {
            addCriterion("U3CRF107MV_AVALUE <", value, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF107MV_AVALUE <=", value, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueLike(String value) {
            addCriterion("U3CRF107MV_AVALUE like", value, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueNotLike(String value) {
            addCriterion("U3CRF107MV_AVALUE not like", value, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueIn(List<String> values) {
            addCriterion("U3CRF107MV_AVALUE in", values, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueNotIn(List<String> values) {
            addCriterion("U3CRF107MV_AVALUE not in", values, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueBetween(String value1, String value2) {
            addCriterion("U3CRF107MV_AVALUE between", value1, value2, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf107mvAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF107MV_AVALUE not between", value1, value2, "u3crf107mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueIsNull() {
            addCriterion("U3CRF109MV_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueIsNotNull() {
            addCriterion("U3CRF109MV_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueEqualTo(String value) {
            addCriterion("U3CRF109MV_AVALUE =", value, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueNotEqualTo(String value) {
            addCriterion("U3CRF109MV_AVALUE <>", value, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueGreaterThan(String value) {
            addCriterion("U3CRF109MV_AVALUE >", value, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF109MV_AVALUE >=", value, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueLessThan(String value) {
            addCriterion("U3CRF109MV_AVALUE <", value, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF109MV_AVALUE <=", value, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueLike(String value) {
            addCriterion("U3CRF109MV_AVALUE like", value, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueNotLike(String value) {
            addCriterion("U3CRF109MV_AVALUE not like", value, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueIn(List<String> values) {
            addCriterion("U3CRF109MV_AVALUE in", values, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueNotIn(List<String> values) {
            addCriterion("U3CRF109MV_AVALUE not in", values, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueBetween(String value1, String value2) {
            addCriterion("U3CRF109MV_AVALUE between", value1, value2, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109mvAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF109MV_AVALUE not between", value1, value2, "u3crf109mvAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueIsNull() {
            addCriterion("U3CRF115MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueIsNotNull() {
            addCriterion("U3CRF115MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueEqualTo(String value) {
            addCriterion("U3CRF115MT_AVALUE =", value, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueNotEqualTo(String value) {
            addCriterion("U3CRF115MT_AVALUE <>", value, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueGreaterThan(String value) {
            addCriterion("U3CRF115MT_AVALUE >", value, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF115MT_AVALUE >=", value, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueLessThan(String value) {
            addCriterion("U3CRF115MT_AVALUE <", value, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF115MT_AVALUE <=", value, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueLike(String value) {
            addCriterion("U3CRF115MT_AVALUE like", value, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueNotLike(String value) {
            addCriterion("U3CRF115MT_AVALUE not like", value, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueIn(List<String> values) {
            addCriterion("U3CRF115MT_AVALUE in", values, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueNotIn(List<String> values) {
            addCriterion("U3CRF115MT_AVALUE not in", values, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueBetween(String value1, String value2) {
            addCriterion("U3CRF115MT_AVALUE between", value1, value2, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf115mtAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF115MT_AVALUE not between", value1, value2, "u3crf115mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueIsNull() {
            addCriterion("U3CRF117MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueIsNotNull() {
            addCriterion("U3CRF117MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueEqualTo(String value) {
            addCriterion("U3CRF117MT_AVALUE =", value, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueNotEqualTo(String value) {
            addCriterion("U3CRF117MT_AVALUE <>", value, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueGreaterThan(String value) {
            addCriterion("U3CRF117MT_AVALUE >", value, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF117MT_AVALUE >=", value, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueLessThan(String value) {
            addCriterion("U3CRF117MT_AVALUE <", value, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF117MT_AVALUE <=", value, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueLike(String value) {
            addCriterion("U3CRF117MT_AVALUE like", value, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueNotLike(String value) {
            addCriterion("U3CRF117MT_AVALUE not like", value, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueIn(List<String> values) {
            addCriterion("U3CRF117MT_AVALUE in", values, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueNotIn(List<String> values) {
            addCriterion("U3CRF117MT_AVALUE not in", values, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueBetween(String value1, String value2) {
            addCriterion("U3CRF117MT_AVALUE between", value1, value2, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf117mtAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF117MT_AVALUE not between", value1, value2, "u3crf117mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueIsNull() {
            addCriterion("U3CRF125MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueIsNotNull() {
            addCriterion("U3CRF125MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueEqualTo(String value) {
            addCriterion("U3CRF125MT_AVALUE =", value, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueNotEqualTo(String value) {
            addCriterion("U3CRF125MT_AVALUE <>", value, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueGreaterThan(String value) {
            addCriterion("U3CRF125MT_AVALUE >", value, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF125MT_AVALUE >=", value, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueLessThan(String value) {
            addCriterion("U3CRF125MT_AVALUE <", value, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF125MT_AVALUE <=", value, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueLike(String value) {
            addCriterion("U3CRF125MT_AVALUE like", value, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueNotLike(String value) {
            addCriterion("U3CRF125MT_AVALUE not like", value, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueIn(List<String> values) {
            addCriterion("U3CRF125MT_AVALUE in", values, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueNotIn(List<String> values) {
            addCriterion("U3CRF125MT_AVALUE not in", values, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueBetween(String value1, String value2) {
            addCriterion("U3CRF125MT_AVALUE between", value1, value2, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf125mtAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF125MT_AVALUE not between", value1, value2, "u3crf125mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueIsNull() {
            addCriterion("U3CRF145MT_1_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueIsNotNull() {
            addCriterion("U3CRF145MT_1_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueEqualTo(String value) {
            addCriterion("U3CRF145MT_1_AVALUE =", value, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueNotEqualTo(String value) {
            addCriterion("U3CRF145MT_1_AVALUE <>", value, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueGreaterThan(String value) {
            addCriterion("U3CRF145MT_1_AVALUE >", value, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF145MT_1_AVALUE >=", value, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueLessThan(String value) {
            addCriterion("U3CRF145MT_1_AVALUE <", value, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF145MT_1_AVALUE <=", value, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueLike(String value) {
            addCriterion("U3CRF145MT_1_AVALUE like", value, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueNotLike(String value) {
            addCriterion("U3CRF145MT_1_AVALUE not like", value, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueIn(List<String> values) {
            addCriterion("U3CRF145MT_1_AVALUE in", values, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueNotIn(List<String> values) {
            addCriterion("U3CRF145MT_1_AVALUE not in", values, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueBetween(String value1, String value2) {
            addCriterion("U3CRF145MT_1_AVALUE between", value1, value2, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt1AvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF145MT_1_AVALUE not between", value1, value2, "u3crf145mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueIsNull() {
            addCriterion("U3CRF145MT_2_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueIsNotNull() {
            addCriterion("U3CRF145MT_2_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueEqualTo(String value) {
            addCriterion("U3CRF145MT_2_AVALUE =", value, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueNotEqualTo(String value) {
            addCriterion("U3CRF145MT_2_AVALUE <>", value, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueGreaterThan(String value) {
            addCriterion("U3CRF145MT_2_AVALUE >", value, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF145MT_2_AVALUE >=", value, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueLessThan(String value) {
            addCriterion("U3CRF145MT_2_AVALUE <", value, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF145MT_2_AVALUE <=", value, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueLike(String value) {
            addCriterion("U3CRF145MT_2_AVALUE like", value, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueNotLike(String value) {
            addCriterion("U3CRF145MT_2_AVALUE not like", value, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueIn(List<String> values) {
            addCriterion("U3CRF145MT_2_AVALUE in", values, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueNotIn(List<String> values) {
            addCriterion("U3CRF145MT_2_AVALUE not in", values, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueBetween(String value1, String value2) {
            addCriterion("U3CRF145MT_2_AVALUE between", value1, value2, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf145mt2AvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF145MT_2_AVALUE not between", value1, value2, "u3crf145mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueIsNull() {
            addCriterion("U3CRF147MT_1_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueIsNotNull() {
            addCriterion("U3CRF147MT_1_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueEqualTo(String value) {
            addCriterion("U3CRF147MT_1_AVALUE =", value, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueNotEqualTo(String value) {
            addCriterion("U3CRF147MT_1_AVALUE <>", value, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueGreaterThan(String value) {
            addCriterion("U3CRF147MT_1_AVALUE >", value, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF147MT_1_AVALUE >=", value, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueLessThan(String value) {
            addCriterion("U3CRF147MT_1_AVALUE <", value, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF147MT_1_AVALUE <=", value, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueLike(String value) {
            addCriterion("U3CRF147MT_1_AVALUE like", value, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueNotLike(String value) {
            addCriterion("U3CRF147MT_1_AVALUE not like", value, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueIn(List<String> values) {
            addCriterion("U3CRF147MT_1_AVALUE in", values, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueNotIn(List<String> values) {
            addCriterion("U3CRF147MT_1_AVALUE not in", values, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueBetween(String value1, String value2) {
            addCriterion("U3CRF147MT_1_AVALUE between", value1, value2, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt1AvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF147MT_1_AVALUE not between", value1, value2, "u3crf147mt1Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueIsNull() {
            addCriterion("U3CRF147MT_2_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueIsNotNull() {
            addCriterion("U3CRF147MT_2_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueEqualTo(String value) {
            addCriterion("U3CRF147MT_2_AVALUE =", value, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueNotEqualTo(String value) {
            addCriterion("U3CRF147MT_2_AVALUE <>", value, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueGreaterThan(String value) {
            addCriterion("U3CRF147MT_2_AVALUE >", value, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF147MT_2_AVALUE >=", value, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueLessThan(String value) {
            addCriterion("U3CRF147MT_2_AVALUE <", value, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF147MT_2_AVALUE <=", value, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueLike(String value) {
            addCriterion("U3CRF147MT_2_AVALUE like", value, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueNotLike(String value) {
            addCriterion("U3CRF147MT_2_AVALUE not like", value, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueIn(List<String> values) {
            addCriterion("U3CRF147MT_2_AVALUE in", values, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueNotIn(List<String> values) {
            addCriterion("U3CRF147MT_2_AVALUE not in", values, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueBetween(String value1, String value2) {
            addCriterion("U3CRF147MT_2_AVALUE between", value1, value2, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf147mt2AvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF147MT_2_AVALUE not between", value1, value2, "u3crf147mt2Avalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueIsNull() {
            addCriterion("U3CRF151MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueIsNotNull() {
            addCriterion("U3CRF151MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueEqualTo(String value) {
            addCriterion("U3CRF151MT_AVALUE =", value, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueNotEqualTo(String value) {
            addCriterion("U3CRF151MT_AVALUE <>", value, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueGreaterThan(String value) {
            addCriterion("U3CRF151MT_AVALUE >", value, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF151MT_AVALUE >=", value, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueLessThan(String value) {
            addCriterion("U3CRF151MT_AVALUE <", value, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF151MT_AVALUE <=", value, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueLike(String value) {
            addCriterion("U3CRF151MT_AVALUE like", value, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueNotLike(String value) {
            addCriterion("U3CRF151MT_AVALUE not like", value, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueIn(List<String> values) {
            addCriterion("U3CRF151MT_AVALUE in", values, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueNotIn(List<String> values) {
            addCriterion("U3CRF151MT_AVALUE not in", values, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueBetween(String value1, String value2) {
            addCriterion("U3CRF151MT_AVALUE between", value1, value2, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf151mtAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF151MT_AVALUE not between", value1, value2, "u3crf151mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueIsNull() {
            addCriterion("U3CRF153MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueIsNotNull() {
            addCriterion("U3CRF153MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueEqualTo(String value) {
            addCriterion("U3CRF153MT_AVALUE =", value, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueNotEqualTo(String value) {
            addCriterion("U3CRF153MT_AVALUE <>", value, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueGreaterThan(String value) {
            addCriterion("U3CRF153MT_AVALUE >", value, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF153MT_AVALUE >=", value, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueLessThan(String value) {
            addCriterion("U3CRF153MT_AVALUE <", value, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF153MT_AVALUE <=", value, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueLike(String value) {
            addCriterion("U3CRF153MT_AVALUE like", value, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueNotLike(String value) {
            addCriterion("U3CRF153MT_AVALUE not like", value, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueIn(List<String> values) {
            addCriterion("U3CRF153MT_AVALUE in", values, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueNotIn(List<String> values) {
            addCriterion("U3CRF153MT_AVALUE not in", values, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueBetween(String value1, String value2) {
            addCriterion("U3CRF153MT_AVALUE between", value1, value2, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf153mtAvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF153MT_AVALUE not between", value1, value2, "u3crf153mtAvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueIsNull() {
            addCriterion("U3CRF101SN1_LVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueIsNotNull() {
            addCriterion("U3CRF101SN1_LVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueEqualTo(String value) {
            addCriterion("U3CRF101SN1_LVALUE =", value, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueNotEqualTo(String value) {
            addCriterion("U3CRF101SN1_LVALUE <>", value, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueGreaterThan(String value) {
            addCriterion("U3CRF101SN1_LVALUE >", value, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF101SN1_LVALUE >=", value, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueLessThan(String value) {
            addCriterion("U3CRF101SN1_LVALUE <", value, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF101SN1_LVALUE <=", value, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueLike(String value) {
            addCriterion("U3CRF101SN1_LVALUE like", value, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueNotLike(String value) {
            addCriterion("U3CRF101SN1_LVALUE not like", value, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueIn(List<String> values) {
            addCriterion("U3CRF101SN1_LVALUE in", values, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueNotIn(List<String> values) {
            addCriterion("U3CRF101SN1_LVALUE not in", values, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueBetween(String value1, String value2) {
            addCriterion("U3CRF101SN1_LVALUE between", value1, value2, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf101sn1LvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF101SN1_LVALUE not between", value1, value2, "u3crf101sn1Lvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueIsNull() {
            addCriterion("U3CRF109SD_LVALUE is null");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueIsNotNull() {
            addCriterion("U3CRF109SD_LVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueEqualTo(String value) {
            addCriterion("U3CRF109SD_LVALUE =", value, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueNotEqualTo(String value) {
            addCriterion("U3CRF109SD_LVALUE <>", value, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueGreaterThan(String value) {
            addCriterion("U3CRF109SD_LVALUE >", value, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueGreaterThanOrEqualTo(String value) {
            addCriterion("U3CRF109SD_LVALUE >=", value, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueLessThan(String value) {
            addCriterion("U3CRF109SD_LVALUE <", value, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueLessThanOrEqualTo(String value) {
            addCriterion("U3CRF109SD_LVALUE <=", value, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueLike(String value) {
            addCriterion("U3CRF109SD_LVALUE like", value, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueNotLike(String value) {
            addCriterion("U3CRF109SD_LVALUE not like", value, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueIn(List<String> values) {
            addCriterion("U3CRF109SD_LVALUE in", values, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueNotIn(List<String> values) {
            addCriterion("U3CRF109SD_LVALUE not in", values, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueBetween(String value1, String value2) {
            addCriterion("U3CRF109SD_LVALUE between", value1, value2, "u3crf109sdLvalue");
            return (Criteria) this;
        }

        public Criteria andU3crf109sdLvalueNotBetween(String value1, String value2) {
            addCriterion("U3CRF109SD_LVALUE not between", value1, value2, "u3crf109sdLvalue");
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