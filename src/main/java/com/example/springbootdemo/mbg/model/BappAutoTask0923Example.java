package com.example.springbootdemo.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class BappAutoTask0923Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BappAutoTask0923Example() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("TASK_TYPE =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("TASK_TYPE <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("TASK_TYPE >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("TASK_TYPE <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("TASK_TYPE like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("TASK_TYPE not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("TASK_TYPE in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("TASK_TYPE not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("TASK_TYPE between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("TASK_TYPE not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceIsNull() {
            addCriterion("TASK_INSTANCE is null");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceIsNotNull() {
            addCriterion("TASK_INSTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceEqualTo(String value) {
            addCriterion("TASK_INSTANCE =", value, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceNotEqualTo(String value) {
            addCriterion("TASK_INSTANCE <>", value, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceGreaterThan(String value) {
            addCriterion("TASK_INSTANCE >", value, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_INSTANCE >=", value, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceLessThan(String value) {
            addCriterion("TASK_INSTANCE <", value, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceLessThanOrEqualTo(String value) {
            addCriterion("TASK_INSTANCE <=", value, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceLike(String value) {
            addCriterion("TASK_INSTANCE like", value, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceNotLike(String value) {
            addCriterion("TASK_INSTANCE not like", value, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceIn(List<String> values) {
            addCriterion("TASK_INSTANCE in", values, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceNotIn(List<String> values) {
            addCriterion("TASK_INSTANCE not in", values, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceBetween(String value1, String value2) {
            addCriterion("TASK_INSTANCE between", value1, value2, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskInstanceNotBetween(String value1, String value2) {
            addCriterion("TASK_INSTANCE not between", value1, value2, "taskInstance");
            return (Criteria) this;
        }

        public Criteria andTaskConfigIsNull() {
            addCriterion("TASK_CONFIG is null");
            return (Criteria) this;
        }

        public Criteria andTaskConfigIsNotNull() {
            addCriterion("TASK_CONFIG is not null");
            return (Criteria) this;
        }

        public Criteria andTaskConfigEqualTo(String value) {
            addCriterion("TASK_CONFIG =", value, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigNotEqualTo(String value) {
            addCriterion("TASK_CONFIG <>", value, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigGreaterThan(String value) {
            addCriterion("TASK_CONFIG >", value, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIG >=", value, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigLessThan(String value) {
            addCriterion("TASK_CONFIG <", value, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigLessThanOrEqualTo(String value) {
            addCriterion("TASK_CONFIG <=", value, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigLike(String value) {
            addCriterion("TASK_CONFIG like", value, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigNotLike(String value) {
            addCriterion("TASK_CONFIG not like", value, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigIn(List<String> values) {
            addCriterion("TASK_CONFIG in", values, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigNotIn(List<String> values) {
            addCriterion("TASK_CONFIG not in", values, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigBetween(String value1, String value2) {
            addCriterion("TASK_CONFIG between", value1, value2, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskConfigNotBetween(String value1, String value2) {
            addCriterion("TASK_CONFIG not between", value1, value2, "taskConfig");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerIsNull() {
            addCriterion("TASK_RUNNER is null");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerIsNotNull() {
            addCriterion("TASK_RUNNER is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerEqualTo(String value) {
            addCriterion("TASK_RUNNER =", value, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerNotEqualTo(String value) {
            addCriterion("TASK_RUNNER <>", value, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerGreaterThan(String value) {
            addCriterion("TASK_RUNNER >", value, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_RUNNER >=", value, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerLessThan(String value) {
            addCriterion("TASK_RUNNER <", value, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerLessThanOrEqualTo(String value) {
            addCriterion("TASK_RUNNER <=", value, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerLike(String value) {
            addCriterion("TASK_RUNNER like", value, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerNotLike(String value) {
            addCriterion("TASK_RUNNER not like", value, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerIn(List<String> values) {
            addCriterion("TASK_RUNNER in", values, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerNotIn(List<String> values) {
            addCriterion("TASK_RUNNER not in", values, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerBetween(String value1, String value2) {
            addCriterion("TASK_RUNNER between", value1, value2, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andTaskRunnerNotBetween(String value1, String value2) {
            addCriterion("TASK_RUNNER not between", value1, value2, "taskRunner");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeIsNull() {
            addCriterion("LAST_RUN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeIsNotNull() {
            addCriterion("LAST_RUN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeEqualTo(String value) {
            addCriterion("LAST_RUN_TIME =", value, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeNotEqualTo(String value) {
            addCriterion("LAST_RUN_TIME <>", value, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeGreaterThan(String value) {
            addCriterion("LAST_RUN_TIME >", value, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_RUN_TIME >=", value, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeLessThan(String value) {
            addCriterion("LAST_RUN_TIME <", value, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_RUN_TIME <=", value, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeLike(String value) {
            addCriterion("LAST_RUN_TIME like", value, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeNotLike(String value) {
            addCriterion("LAST_RUN_TIME not like", value, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeIn(List<String> values) {
            addCriterion("LAST_RUN_TIME in", values, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeNotIn(List<String> values) {
            addCriterion("LAST_RUN_TIME not in", values, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeBetween(String value1, String value2) {
            addCriterion("LAST_RUN_TIME between", value1, value2, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andLastRunTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_RUN_TIME not between", value1, value2, "lastRunTime");
            return (Criteria) this;
        }

        public Criteria andRunLockIsNull() {
            addCriterion("RUN_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andRunLockIsNotNull() {
            addCriterion("RUN_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andRunLockEqualTo(String value) {
            addCriterion("RUN_LOCK =", value, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockNotEqualTo(String value) {
            addCriterion("RUN_LOCK <>", value, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockGreaterThan(String value) {
            addCriterion("RUN_LOCK >", value, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_LOCK >=", value, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockLessThan(String value) {
            addCriterion("RUN_LOCK <", value, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockLessThanOrEqualTo(String value) {
            addCriterion("RUN_LOCK <=", value, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockLike(String value) {
            addCriterion("RUN_LOCK like", value, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockNotLike(String value) {
            addCriterion("RUN_LOCK not like", value, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockIn(List<String> values) {
            addCriterion("RUN_LOCK in", values, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockNotIn(List<String> values) {
            addCriterion("RUN_LOCK not in", values, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockBetween(String value1, String value2) {
            addCriterion("RUN_LOCK between", value1, value2, "runLock");
            return (Criteria) this;
        }

        public Criteria andRunLockNotBetween(String value1, String value2) {
            addCriterion("RUN_LOCK not between", value1, value2, "runLock");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNull() {
            addCriterion("SERVER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNotNull() {
            addCriterion("SERVER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServerNameEqualTo(String value) {
            addCriterion("SERVER_NAME =", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotEqualTo(String value) {
            addCriterion("SERVER_NAME <>", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThan(String value) {
            addCriterion("SERVER_NAME >", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_NAME >=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThan(String value) {
            addCriterion("SERVER_NAME <", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThanOrEqualTo(String value) {
            addCriterion("SERVER_NAME <=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLike(String value) {
            addCriterion("SERVER_NAME like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotLike(String value) {
            addCriterion("SERVER_NAME not like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameIn(List<String> values) {
            addCriterion("SERVER_NAME in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotIn(List<String> values) {
            addCriterion("SERVER_NAME not in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameBetween(String value1, String value2) {
            addCriterion("SERVER_NAME between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotBetween(String value1, String value2) {
            addCriterion("SERVER_NAME not between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNull() {
            addCriterion("ENABLE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNotNull() {
            addCriterion("ENABLE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagEqualTo(String value) {
            addCriterion("ENABLE_FLAG =", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotEqualTo(String value) {
            addCriterion("ENABLE_FLAG <>", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThan(String value) {
            addCriterion("ENABLE_FLAG >", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_FLAG >=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThan(String value) {
            addCriterion("ENABLE_FLAG <", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_FLAG <=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLike(String value) {
            addCriterion("ENABLE_FLAG like", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotLike(String value) {
            addCriterion("ENABLE_FLAG not like", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIn(List<String> values) {
            addCriterion("ENABLE_FLAG in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotIn(List<String> values) {
            addCriterion("ENABLE_FLAG not in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagBetween(String value1, String value2) {
            addCriterion("ENABLE_FLAG between", value1, value2, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotBetween(String value1, String value2) {
            addCriterion("ENABLE_FLAG not between", value1, value2, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andTaskDescIsNull() {
            addCriterion("TASK_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTaskDescIsNotNull() {
            addCriterion("TASK_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDescEqualTo(String value) {
            addCriterion("TASK_DESC =", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotEqualTo(String value) {
            addCriterion("TASK_DESC <>", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescGreaterThan(String value) {
            addCriterion("TASK_DESC >", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_DESC >=", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLessThan(String value) {
            addCriterion("TASK_DESC <", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLessThanOrEqualTo(String value) {
            addCriterion("TASK_DESC <=", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLike(String value) {
            addCriterion("TASK_DESC like", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotLike(String value) {
            addCriterion("TASK_DESC not like", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescIn(List<String> values) {
            addCriterion("TASK_DESC in", values, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotIn(List<String> values) {
            addCriterion("TASK_DESC not in", values, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescBetween(String value1, String value2) {
            addCriterion("TASK_DESC between", value1, value2, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotBetween(String value1, String value2) {
            addCriterion("TASK_DESC not between", value1, value2, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andSsIdIsNull() {
            addCriterion("SS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSsIdIsNotNull() {
            addCriterion("SS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSsIdEqualTo(String value) {
            addCriterion("SS_ID =", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotEqualTo(String value) {
            addCriterion("SS_ID <>", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThan(String value) {
            addCriterion("SS_ID >", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThanOrEqualTo(String value) {
            addCriterion("SS_ID >=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThan(String value) {
            addCriterion("SS_ID <", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThanOrEqualTo(String value) {
            addCriterion("SS_ID <=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLike(String value) {
            addCriterion("SS_ID like", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotLike(String value) {
            addCriterion("SS_ID not like", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdIn(List<String> values) {
            addCriterion("SS_ID in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotIn(List<String> values) {
            addCriterion("SS_ID not in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdBetween(String value1, String value2) {
            addCriterion("SS_ID between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotBetween(String value1, String value2) {
            addCriterion("SS_ID not between", value1, value2, "ssId");
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