package top.alertcode.trainhigh.common.domian;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KdsChapterPointExample {

  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public KdsChapterPointExample() {
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

    public Criteria andParentIdIsNull() {
      addCriterion("parent_id is null");
      return (Criteria) this;
    }

    public Criteria andParentIdIsNotNull() {
      addCriterion("parent_id is not null");
      return (Criteria) this;
    }

    public Criteria andParentIdEqualTo(Long value) {
      addCriterion("parent_id =", value, "parentId");
      return (Criteria) this;
    }

    public Criteria andParentIdNotEqualTo(Long value) {
      addCriterion("parent_id <>", value, "parentId");
      return (Criteria) this;
    }

    public Criteria andParentIdGreaterThan(Long value) {
      addCriterion("parent_id >", value, "parentId");
      return (Criteria) this;
    }

    public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
      addCriterion("parent_id >=", value, "parentId");
      return (Criteria) this;
    }

    public Criteria andParentIdLessThan(Long value) {
      addCriterion("parent_id <", value, "parentId");
      return (Criteria) this;
    }

    public Criteria andParentIdLessThanOrEqualTo(Long value) {
      addCriterion("parent_id <=", value, "parentId");
      return (Criteria) this;
    }

    public Criteria andParentIdIn(List<Long> values) {
      addCriterion("parent_id in", values, "parentId");
      return (Criteria) this;
    }

    public Criteria andParentIdNotIn(List<Long> values) {
      addCriterion("parent_id not in", values, "parentId");
      return (Criteria) this;
    }

    public Criteria andParentIdBetween(Long value1, Long value2) {
      addCriterion("parent_id between", value1, value2, "parentId");
      return (Criteria) this;
    }

    public Criteria andParentIdNotBetween(Long value1, Long value2) {
      addCriterion("parent_id not between", value1, value2, "parentId");
      return (Criteria) this;
    }

    public Criteria andChapterIdIsNull() {
      addCriterion("chapter_id is null");
      return (Criteria) this;
    }

    public Criteria andChapterIdIsNotNull() {
      addCriterion("chapter_id is not null");
      return (Criteria) this;
    }

    public Criteria andChapterIdEqualTo(Long value) {
      addCriterion("chapter_id =", value, "chapterId");
      return (Criteria) this;
    }

    public Criteria andChapterIdNotEqualTo(Long value) {
      addCriterion("chapter_id <>", value, "chapterId");
      return (Criteria) this;
    }

    public Criteria andChapterIdGreaterThan(Long value) {
      addCriterion("chapter_id >", value, "chapterId");
      return (Criteria) this;
    }

    public Criteria andChapterIdGreaterThanOrEqualTo(Long value) {
      addCriterion("chapter_id >=", value, "chapterId");
      return (Criteria) this;
    }

    public Criteria andChapterIdLessThan(Long value) {
      addCriterion("chapter_id <", value, "chapterId");
      return (Criteria) this;
    }

    public Criteria andChapterIdLessThanOrEqualTo(Long value) {
      addCriterion("chapter_id <=", value, "chapterId");
      return (Criteria) this;
    }

    public Criteria andChapterIdIn(List<Long> values) {
      addCriterion("chapter_id in", values, "chapterId");
      return (Criteria) this;
    }

    public Criteria andChapterIdNotIn(List<Long> values) {
      addCriterion("chapter_id not in", values, "chapterId");
      return (Criteria) this;
    }

    public Criteria andChapterIdBetween(Long value1, Long value2) {
      addCriterion("chapter_id between", value1, value2, "chapterId");
      return (Criteria) this;
    }

    public Criteria andChapterIdNotBetween(Long value1, Long value2) {
      addCriterion("chapter_id not between", value1, value2, "chapterId");
      return (Criteria) this;
    }

    public Criteria andPointNoIsNull() {
      addCriterion("point_no is null");
      return (Criteria) this;
    }

    public Criteria andPointNoIsNotNull() {
      addCriterion("point_no is not null");
      return (Criteria) this;
    }

    public Criteria andPointNoEqualTo(String value) {
      addCriterion("point_no =", value, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoNotEqualTo(String value) {
      addCriterion("point_no <>", value, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoGreaterThan(String value) {
      addCriterion("point_no >", value, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoGreaterThanOrEqualTo(String value) {
      addCriterion("point_no >=", value, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoLessThan(String value) {
      addCriterion("point_no <", value, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoLessThanOrEqualTo(String value) {
      addCriterion("point_no <=", value, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoLike(String value) {
      addCriterion("point_no like", value, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoNotLike(String value) {
      addCriterion("point_no not like", value, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoIn(List<String> values) {
      addCriterion("point_no in", values, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoNotIn(List<String> values) {
      addCriterion("point_no not in", values, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoBetween(String value1, String value2) {
      addCriterion("point_no between", value1, value2, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNoNotBetween(String value1, String value2) {
      addCriterion("point_no not between", value1, value2, "pointNo");
      return (Criteria) this;
    }

    public Criteria andPointNameIsNull() {
      addCriterion("point_name is null");
      return (Criteria) this;
    }

    public Criteria andPointNameIsNotNull() {
      addCriterion("point_name is not null");
      return (Criteria) this;
    }

    public Criteria andPointNameEqualTo(String value) {
      addCriterion("point_name =", value, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameNotEqualTo(String value) {
      addCriterion("point_name <>", value, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameGreaterThan(String value) {
      addCriterion("point_name >", value, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameGreaterThanOrEqualTo(String value) {
      addCriterion("point_name >=", value, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameLessThan(String value) {
      addCriterion("point_name <", value, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameLessThanOrEqualTo(String value) {
      addCriterion("point_name <=", value, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameLike(String value) {
      addCriterion("point_name like", value, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameNotLike(String value) {
      addCriterion("point_name not like", value, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameIn(List<String> values) {
      addCriterion("point_name in", values, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameNotIn(List<String> values) {
      addCriterion("point_name not in", values, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameBetween(String value1, String value2) {
      addCriterion("point_name between", value1, value2, "pointName");
      return (Criteria) this;
    }

    public Criteria andPointNameNotBetween(String value1, String value2) {
      addCriterion("point_name not between", value1, value2, "pointName");
      return (Criteria) this;
    }

    public Criteria andStatusIsNull() {
      addCriterion("status is null");
      return (Criteria) this;
    }

    public Criteria andStatusIsNotNull() {
      addCriterion("status is not null");
      return (Criteria) this;
    }

    public Criteria andStatusEqualTo(Integer value) {
      addCriterion("status =", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusNotEqualTo(Integer value) {
      addCriterion("status <>", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusGreaterThan(Integer value) {
      addCriterion("status >", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
      addCriterion("status >=", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusLessThan(Integer value) {
      addCriterion("status <", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusLessThanOrEqualTo(Integer value) {
      addCriterion("status <=", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusIn(List<Integer> values) {
      addCriterion("status in", values, "status");
      return (Criteria) this;
    }

    public Criteria andStatusNotIn(List<Integer> values) {
      addCriterion("status not in", values, "status");
      return (Criteria) this;
    }

    public Criteria andStatusBetween(Integer value1, Integer value2) {
      addCriterion("status between", value1, value2, "status");
      return (Criteria) this;
    }

    public Criteria andStatusNotBetween(Integer value1, Integer value2) {
      addCriterion("status not between", value1, value2, "status");
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

    public Criteria andUpdateTimeIsNull() {
      addCriterion("update_time is null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIsNotNull() {
      addCriterion("update_time is not null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeEqualTo(Date value) {
      addCriterion("update_time =", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotEqualTo(Date value) {
      addCriterion("update_time <>", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThan(Date value) {
      addCriterion("update_time >", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("update_time >=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThan(Date value) {
      addCriterion("update_time <", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
      addCriterion("update_time <=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIn(List<Date> values) {
      addCriterion("update_time in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotIn(List<Date> values) {
      addCriterion("update_time not in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeBetween(Date value1, Date value2) {
      addCriterion("update_time between", value1, value2, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
      addCriterion("update_time not between", value1, value2, "updateTime");
      return (Criteria) this;
    }

    public Criteria andIsDeleteIsNull() {
      addCriterion("is_delete is null");
      return (Criteria) this;
    }

    public Criteria andIsDeleteIsNotNull() {
      addCriterion("is_delete is not null");
      return (Criteria) this;
    }

    public Criteria andIsDeleteEqualTo(Byte value) {
      addCriterion("is_delete =", value, "isDelete");
      return (Criteria) this;
    }

    public Criteria andIsDeleteNotEqualTo(Byte value) {
      addCriterion("is_delete <>", value, "isDelete");
      return (Criteria) this;
    }

    public Criteria andIsDeleteGreaterThan(Byte value) {
      addCriterion("is_delete >", value, "isDelete");
      return (Criteria) this;
    }

    public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
      addCriterion("is_delete >=", value, "isDelete");
      return (Criteria) this;
    }

    public Criteria andIsDeleteLessThan(Byte value) {
      addCriterion("is_delete <", value, "isDelete");
      return (Criteria) this;
    }

    public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
      addCriterion("is_delete <=", value, "isDelete");
      return (Criteria) this;
    }

    public Criteria andIsDeleteIn(List<Byte> values) {
      addCriterion("is_delete in", values, "isDelete");
      return (Criteria) this;
    }

    public Criteria andIsDeleteNotIn(List<Byte> values) {
      addCriterion("is_delete not in", values, "isDelete");
      return (Criteria) this;
    }

    public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
      addCriterion("is_delete between", value1, value2, "isDelete");
      return (Criteria) this;
    }

    public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
      addCriterion("is_delete not between", value1, value2, "isDelete");
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