package net.jeeshop.biz.shop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomPageExample() {
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table custom_page
     *
     * @mbggenerated
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPageidIsNull() {
            addCriterion("pageid is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("pageid is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(Integer value) {
            addCriterion("pageid =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(Integer value) {
            addCriterion("pageid <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(Integer value) {
            addCriterion("pageid >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageid >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(Integer value) {
            addCriterion("pageid <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(Integer value) {
            addCriterion("pageid <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<Integer> values) {
            addCriterion("pageid in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<Integer> values) {
            addCriterion("pageid not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(Integer value1, Integer value2) {
            addCriterion("pageid between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(Integer value1, Integer value2) {
            addCriterion("pageid not between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimIsNull() {
            addCriterion("update_teim is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimIsNotNull() {
            addCriterion("update_teim is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimEqualTo(Date value) {
            addCriterion("update_teim =", value, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimNotEqualTo(Date value) {
            addCriterion("update_teim <>", value, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimGreaterThan(Date value) {
            addCriterion("update_teim >", value, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimGreaterThanOrEqualTo(Date value) {
            addCriterion("update_teim >=", value, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimLessThan(Date value) {
            addCriterion("update_teim <", value, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimLessThanOrEqualTo(Date value) {
            addCriterion("update_teim <=", value, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimIn(List<Date> values) {
            addCriterion("update_teim in", values, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimNotIn(List<Date> values) {
            addCriterion("update_teim not in", values, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimBetween(Date value1, Date value2) {
            addCriterion("update_teim between", value1, value2, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andUpdateTeimNotBetween(Date value1, Date value2) {
            addCriterion("update_teim not between", value1, value2, "updateTeim");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDspIsNull() {
            addCriterion("dsp is null");
            return (Criteria) this;
        }

        public Criteria andDspIsNotNull() {
            addCriterion("dsp is not null");
            return (Criteria) this;
        }

        public Criteria andDspEqualTo(String value) {
            addCriterion("dsp =", value, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspNotEqualTo(String value) {
            addCriterion("dsp <>", value, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspGreaterThan(String value) {
            addCriterion("dsp >", value, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspGreaterThanOrEqualTo(String value) {
            addCriterion("dsp >=", value, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspLessThan(String value) {
            addCriterion("dsp <", value, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspLessThanOrEqualTo(String value) {
            addCriterion("dsp <=", value, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspLike(String value) {
            addCriterion("dsp like", value, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspNotLike(String value) {
            addCriterion("dsp not like", value, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspIn(List<String> values) {
            addCriterion("dsp in", values, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspNotIn(List<String> values) {
            addCriterion("dsp not in", values, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspBetween(String value1, String value2) {
            addCriterion("dsp between", value1, value2, "dsp");
            return (Criteria) this;
        }

        public Criteria andDspNotBetween(String value1, String value2) {
            addCriterion("dsp not between", value1, value2, "dsp");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andIsindexIsNull() {
            addCriterion("isIndex is null");
            return (Criteria) this;
        }

        public Criteria andIsindexIsNotNull() {
            addCriterion("isIndex is not null");
            return (Criteria) this;
        }

        public Criteria andIsindexEqualTo(String value) {
            addCriterion("isIndex =", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexNotEqualTo(String value) {
            addCriterion("isIndex <>", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexGreaterThan(String value) {
            addCriterion("isIndex >", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexGreaterThanOrEqualTo(String value) {
            addCriterion("isIndex >=", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexLessThan(String value) {
            addCriterion("isIndex <", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexLessThanOrEqualTo(String value) {
            addCriterion("isIndex <=", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexLike(String value) {
            addCriterion("isIndex like", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexNotLike(String value) {
            addCriterion("isIndex not like", value, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexIn(List<String> values) {
            addCriterion("isIndex in", values, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexNotIn(List<String> values) {
            addCriterion("isIndex not in", values, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexBetween(String value1, String value2) {
            addCriterion("isIndex between", value1, value2, "isindex");
            return (Criteria) this;
        }

        public Criteria andIsindexNotBetween(String value1, String value2) {
            addCriterion("isIndex not between", value1, value2, "isindex");
            return (Criteria) this;
        }

        public Criteria andKhidIsNull() {
            addCriterion("khid is null");
            return (Criteria) this;
        }

        public Criteria andKhidIsNotNull() {
            addCriterion("khid is not null");
            return (Criteria) this;
        }

        public Criteria andKhidEqualTo(String value) {
            addCriterion("khid =", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidNotEqualTo(String value) {
            addCriterion("khid <>", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidGreaterThan(String value) {
            addCriterion("khid >", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidGreaterThanOrEqualTo(String value) {
            addCriterion("khid >=", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidLessThan(String value) {
            addCriterion("khid <", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidLessThanOrEqualTo(String value) {
            addCriterion("khid <=", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidLike(String value) {
            addCriterion("khid like", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidNotLike(String value) {
            addCriterion("khid not like", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidIn(List<String> values) {
            addCriterion("khid in", values, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidNotIn(List<String> values) {
            addCriterion("khid not in", values, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidBetween(String value1, String value2) {
            addCriterion("khid between", value1, value2, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidNotBetween(String value1, String value2) {
            addCriterion("khid not between", value1, value2, "khid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table custom_page
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table custom_page
     *
     * @mbggenerated
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