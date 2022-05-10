package com.example.design.bean;

import java.util.ArrayList;
import java.util.List;

public class Part1nExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Part1nExample() {
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

        public Criteria andWcw101mvAvalueIsNull() {
            addCriterion("WCW101MV_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueIsNotNull() {
            addCriterion("WCW101MV_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueEqualTo(String value) {
            addCriterion("WCW101MV_AVALUE =", value, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueNotEqualTo(String value) {
            addCriterion("WCW101MV_AVALUE <>", value, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueGreaterThan(String value) {
            addCriterion("WCW101MV_AVALUE >", value, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW101MV_AVALUE >=", value, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueLessThan(String value) {
            addCriterion("WCW101MV_AVALUE <", value, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW101MV_AVALUE <=", value, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueLike(String value) {
            addCriterion("WCW101MV_AVALUE like", value, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueNotLike(String value) {
            addCriterion("WCW101MV_AVALUE not like", value, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueIn(List<String> values) {
            addCriterion("WCW101MV_AVALUE in", values, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueNotIn(List<String> values) {
            addCriterion("WCW101MV_AVALUE not in", values, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueBetween(String value1, String value2) {
            addCriterion("WCW101MV_AVALUE between", value1, value2, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mvAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW101MV_AVALUE not between", value1, value2, "wcw101mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueIsNull() {
            addCriterion("WCW103MV_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueIsNotNull() {
            addCriterion("WCW103MV_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueEqualTo(String value) {
            addCriterion("WCW103MV_AVALUE =", value, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueNotEqualTo(String value) {
            addCriterion("WCW103MV_AVALUE <>", value, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueGreaterThan(String value) {
            addCriterion("WCW103MV_AVALUE >", value, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW103MV_AVALUE >=", value, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueLessThan(String value) {
            addCriterion("WCW103MV_AVALUE <", value, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW103MV_AVALUE <=", value, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueLike(String value) {
            addCriterion("WCW103MV_AVALUE like", value, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueNotLike(String value) {
            addCriterion("WCW103MV_AVALUE not like", value, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueIn(List<String> values) {
            addCriterion("WCW103MV_AVALUE in", values, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueNotIn(List<String> values) {
            addCriterion("WCW103MV_AVALUE not in", values, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueBetween(String value1, String value2) {
            addCriterion("WCW103MV_AVALUE between", value1, value2, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mvAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW103MV_AVALUE not between", value1, value2, "wcw103mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueIsNull() {
            addCriterion("WCW105MV_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueIsNotNull() {
            addCriterion("WCW105MV_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueEqualTo(String value) {
            addCriterion("WCW105MV_AVALUE =", value, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueNotEqualTo(String value) {
            addCriterion("WCW105MV_AVALUE <>", value, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueGreaterThan(String value) {
            addCriterion("WCW105MV_AVALUE >", value, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW105MV_AVALUE >=", value, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueLessThan(String value) {
            addCriterion("WCW105MV_AVALUE <", value, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW105MV_AVALUE <=", value, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueLike(String value) {
            addCriterion("WCW105MV_AVALUE like", value, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueNotLike(String value) {
            addCriterion("WCW105MV_AVALUE not like", value, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueIn(List<String> values) {
            addCriterion("WCW105MV_AVALUE in", values, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueNotIn(List<String> values) {
            addCriterion("WCW105MV_AVALUE not in", values, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueBetween(String value1, String value2) {
            addCriterion("WCW105MV_AVALUE between", value1, value2, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mvAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW105MV_AVALUE not between", value1, value2, "wcw105mvAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueIsNull() {
            addCriterion("WCW111MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueIsNotNull() {
            addCriterion("WCW111MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueEqualTo(String value) {
            addCriterion("WCW111MT_AVALUE =", value, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueNotEqualTo(String value) {
            addCriterion("WCW111MT_AVALUE <>", value, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueGreaterThan(String value) {
            addCriterion("WCW111MT_AVALUE >", value, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW111MT_AVALUE >=", value, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueLessThan(String value) {
            addCriterion("WCW111MT_AVALUE <", value, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW111MT_AVALUE <=", value, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueLike(String value) {
            addCriterion("WCW111MT_AVALUE like", value, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueNotLike(String value) {
            addCriterion("WCW111MT_AVALUE not like", value, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueIn(List<String> values) {
            addCriterion("WCW111MT_AVALUE in", values, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueNotIn(List<String> values) {
            addCriterion("WCW111MT_AVALUE not in", values, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW111MT_AVALUE between", value1, value2, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw111mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW111MT_AVALUE not between", value1, value2, "wcw111mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueIsNull() {
            addCriterion("WCWF121MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueIsNotNull() {
            addCriterion("WCWF121MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueEqualTo(String value) {
            addCriterion("WCWF121MT_AVALUE =", value, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueNotEqualTo(String value) {
            addCriterion("WCWF121MT_AVALUE <>", value, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueGreaterThan(String value) {
            addCriterion("WCWF121MT_AVALUE >", value, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCWF121MT_AVALUE >=", value, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueLessThan(String value) {
            addCriterion("WCWF121MT_AVALUE <", value, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCWF121MT_AVALUE <=", value, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueLike(String value) {
            addCriterion("WCWF121MT_AVALUE like", value, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueNotLike(String value) {
            addCriterion("WCWF121MT_AVALUE not like", value, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueIn(List<String> values) {
            addCriterion("WCWF121MT_AVALUE in", values, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueNotIn(List<String> values) {
            addCriterion("WCWF121MT_AVALUE not in", values, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueBetween(String value1, String value2) {
            addCriterion("WCWF121MT_AVALUE between", value1, value2, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcwf121mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCWF121MT_AVALUE not between", value1, value2, "wcwf121mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueIsNull() {
            addCriterion("WCW131MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueIsNotNull() {
            addCriterion("WCW131MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueEqualTo(String value) {
            addCriterion("WCW131MT_AVALUE =", value, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueNotEqualTo(String value) {
            addCriterion("WCW131MT_AVALUE <>", value, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueGreaterThan(String value) {
            addCriterion("WCW131MT_AVALUE >", value, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW131MT_AVALUE >=", value, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueLessThan(String value) {
            addCriterion("WCW131MT_AVALUE <", value, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW131MT_AVALUE <=", value, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueLike(String value) {
            addCriterion("WCW131MT_AVALUE like", value, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueNotLike(String value) {
            addCriterion("WCW131MT_AVALUE not like", value, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueIn(List<String> values) {
            addCriterion("WCW131MT_AVALUE in", values, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueNotIn(List<String> values) {
            addCriterion("WCW131MT_AVALUE not in", values, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW131MT_AVALUE between", value1, value2, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw131mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW131MT_AVALUE not between", value1, value2, "wcw131mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueIsNull() {
            addCriterion("WCW113MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueIsNotNull() {
            addCriterion("WCW113MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueEqualTo(String value) {
            addCriterion("WCW113MT_AVALUE =", value, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueNotEqualTo(String value) {
            addCriterion("WCW113MT_AVALUE <>", value, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueGreaterThan(String value) {
            addCriterion("WCW113MT_AVALUE >", value, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW113MT_AVALUE >=", value, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueLessThan(String value) {
            addCriterion("WCW113MT_AVALUE <", value, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW113MT_AVALUE <=", value, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueLike(String value) {
            addCriterion("WCW113MT_AVALUE like", value, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueNotLike(String value) {
            addCriterion("WCW113MT_AVALUE not like", value, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueIn(List<String> values) {
            addCriterion("WCW113MT_AVALUE in", values, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueNotIn(List<String> values) {
            addCriterion("WCW113MT_AVALUE not in", values, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW113MT_AVALUE between", value1, value2, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw113mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW113MT_AVALUE not between", value1, value2, "wcw113mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueIsNull() {
            addCriterion("WCW123MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueIsNotNull() {
            addCriterion("WCW123MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueEqualTo(String value) {
            addCriterion("WCW123MT_AVALUE =", value, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueNotEqualTo(String value) {
            addCriterion("WCW123MT_AVALUE <>", value, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueGreaterThan(String value) {
            addCriterion("WCW123MT_AVALUE >", value, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW123MT_AVALUE >=", value, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueLessThan(String value) {
            addCriterion("WCW123MT_AVALUE <", value, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW123MT_AVALUE <=", value, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueLike(String value) {
            addCriterion("WCW123MT_AVALUE like", value, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueNotLike(String value) {
            addCriterion("WCW123MT_AVALUE not like", value, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueIn(List<String> values) {
            addCriterion("WCW123MT_AVALUE in", values, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueNotIn(List<String> values) {
            addCriterion("WCW123MT_AVALUE not in", values, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW123MT_AVALUE between", value1, value2, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw123mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW123MT_AVALUE not between", value1, value2, "wcw123mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueIsNull() {
            addCriterion("WCW133MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueIsNotNull() {
            addCriterion("WCW133MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueEqualTo(String value) {
            addCriterion("WCW133MT_AVALUE =", value, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueNotEqualTo(String value) {
            addCriterion("WCW133MT_AVALUE <>", value, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueGreaterThan(String value) {
            addCriterion("WCW133MT_AVALUE >", value, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW133MT_AVALUE >=", value, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueLessThan(String value) {
            addCriterion("WCW133MT_AVALUE <", value, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW133MT_AVALUE <=", value, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueLike(String value) {
            addCriterion("WCW133MT_AVALUE like", value, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueNotLike(String value) {
            addCriterion("WCW133MT_AVALUE not like", value, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueIn(List<String> values) {
            addCriterion("WCW133MT_AVALUE in", values, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueNotIn(List<String> values) {
            addCriterion("WCW133MT_AVALUE not in", values, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW133MT_AVALUE between", value1, value2, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw133mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW133MT_AVALUE not between", value1, value2, "wcw133mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueIsNull() {
            addCriterion("WCW101MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueIsNotNull() {
            addCriterion("WCW101MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueEqualTo(String value) {
            addCriterion("WCW101MT_AVALUE =", value, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueNotEqualTo(String value) {
            addCriterion("WCW101MT_AVALUE <>", value, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueGreaterThan(String value) {
            addCriterion("WCW101MT_AVALUE >", value, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW101MT_AVALUE >=", value, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueLessThan(String value) {
            addCriterion("WCW101MT_AVALUE <", value, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW101MT_AVALUE <=", value, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueLike(String value) {
            addCriterion("WCW101MT_AVALUE like", value, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueNotLike(String value) {
            addCriterion("WCW101MT_AVALUE not like", value, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueIn(List<String> values) {
            addCriterion("WCW101MT_AVALUE in", values, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueNotIn(List<String> values) {
            addCriterion("WCW101MT_AVALUE not in", values, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW101MT_AVALUE between", value1, value2, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw101mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW101MT_AVALUE not between", value1, value2, "wcw101mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueIsNull() {
            addCriterion("WCW103MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueIsNotNull() {
            addCriterion("WCW103MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueEqualTo(String value) {
            addCriterion("WCW103MT_AVALUE =", value, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueNotEqualTo(String value) {
            addCriterion("WCW103MT_AVALUE <>", value, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueGreaterThan(String value) {
            addCriterion("WCW103MT_AVALUE >", value, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW103MT_AVALUE >=", value, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueLessThan(String value) {
            addCriterion("WCW103MT_AVALUE <", value, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW103MT_AVALUE <=", value, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueLike(String value) {
            addCriterion("WCW103MT_AVALUE like", value, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueNotLike(String value) {
            addCriterion("WCW103MT_AVALUE not like", value, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueIn(List<String> values) {
            addCriterion("WCW103MT_AVALUE in", values, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueNotIn(List<String> values) {
            addCriterion("WCW103MT_AVALUE not in", values, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW103MT_AVALUE between", value1, value2, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw103mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW103MT_AVALUE not between", value1, value2, "wcw103mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueIsNull() {
            addCriterion("WCW105MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueIsNotNull() {
            addCriterion("WCW105MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueEqualTo(String value) {
            addCriterion("WCW105MT_AVALUE =", value, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueNotEqualTo(String value) {
            addCriterion("WCW105MT_AVALUE <>", value, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueGreaterThan(String value) {
            addCriterion("WCW105MT_AVALUE >", value, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW105MT_AVALUE >=", value, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueLessThan(String value) {
            addCriterion("WCW105MT_AVALUE <", value, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW105MT_AVALUE <=", value, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueLike(String value) {
            addCriterion("WCW105MT_AVALUE like", value, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueNotLike(String value) {
            addCriterion("WCW105MT_AVALUE not like", value, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueIn(List<String> values) {
            addCriterion("WCW105MT_AVALUE in", values, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueNotIn(List<String> values) {
            addCriterion("WCW105MT_AVALUE not in", values, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW105MT_AVALUE between", value1, value2, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw105mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW105MT_AVALUE not between", value1, value2, "wcw105mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueIsNull() {
            addCriterion("WCW107MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueIsNotNull() {
            addCriterion("WCW107MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueEqualTo(String value) {
            addCriterion("WCW107MT_AVALUE =", value, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueNotEqualTo(String value) {
            addCriterion("WCW107MT_AVALUE <>", value, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueGreaterThan(String value) {
            addCriterion("WCW107MT_AVALUE >", value, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW107MT_AVALUE >=", value, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueLessThan(String value) {
            addCriterion("WCW107MT_AVALUE <", value, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW107MT_AVALUE <=", value, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueLike(String value) {
            addCriterion("WCW107MT_AVALUE like", value, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueNotLike(String value) {
            addCriterion("WCW107MT_AVALUE not like", value, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueIn(List<String> values) {
            addCriterion("WCW107MT_AVALUE in", values, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueNotIn(List<String> values) {
            addCriterion("WCW107MT_AVALUE not in", values, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW107MT_AVALUE between", value1, value2, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw107mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW107MT_AVALUE not between", value1, value2, "wcw107mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueIsNull() {
            addCriterion("WCW141MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueIsNotNull() {
            addCriterion("WCW141MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueEqualTo(String value) {
            addCriterion("WCW141MT_AVALUE =", value, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueNotEqualTo(String value) {
            addCriterion("WCW141MT_AVALUE <>", value, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueGreaterThan(String value) {
            addCriterion("WCW141MT_AVALUE >", value, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW141MT_AVALUE >=", value, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueLessThan(String value) {
            addCriterion("WCW141MT_AVALUE <", value, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW141MT_AVALUE <=", value, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueLike(String value) {
            addCriterion("WCW141MT_AVALUE like", value, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueNotLike(String value) {
            addCriterion("WCW141MT_AVALUE not like", value, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueIn(List<String> values) {
            addCriterion("WCW141MT_AVALUE in", values, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueNotIn(List<String> values) {
            addCriterion("WCW141MT_AVALUE not in", values, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW141MT_AVALUE between", value1, value2, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw141mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW141MT_AVALUE not between", value1, value2, "wcw141mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueIsNull() {
            addCriterion("WCW143MT_AVALUE is null");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueIsNotNull() {
            addCriterion("WCW143MT_AVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueEqualTo(String value) {
            addCriterion("WCW143MT_AVALUE =", value, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueNotEqualTo(String value) {
            addCriterion("WCW143MT_AVALUE <>", value, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueGreaterThan(String value) {
            addCriterion("WCW143MT_AVALUE >", value, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueGreaterThanOrEqualTo(String value) {
            addCriterion("WCW143MT_AVALUE >=", value, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueLessThan(String value) {
            addCriterion("WCW143MT_AVALUE <", value, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueLessThanOrEqualTo(String value) {
            addCriterion("WCW143MT_AVALUE <=", value, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueLike(String value) {
            addCriterion("WCW143MT_AVALUE like", value, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueNotLike(String value) {
            addCriterion("WCW143MT_AVALUE not like", value, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueIn(List<String> values) {
            addCriterion("WCW143MT_AVALUE in", values, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueNotIn(List<String> values) {
            addCriterion("WCW143MT_AVALUE not in", values, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueBetween(String value1, String value2) {
            addCriterion("WCW143MT_AVALUE between", value1, value2, "wcw143mtAvalue");
            return (Criteria) this;
        }

        public Criteria andWcw143mtAvalueNotBetween(String value1, String value2) {
            addCriterion("WCW143MT_AVALUE not between", value1, value2, "wcw143mtAvalue");
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