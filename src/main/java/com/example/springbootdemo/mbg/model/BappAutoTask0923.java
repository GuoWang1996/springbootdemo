package com.example.springbootdemo.mbg.model;

import java.io.Serializable;

public class BappAutoTask0923 implements Serializable {
    private String taskId;

    private String taskName;

    private String taskType;

    private String taskInstance;

    private String taskConfig;

    private String taskRunner;

    private String lastRunTime;

    private String runLock;

    private String serverName;

    private String enableFlag;

    private String taskDesc;

    private String ssId;

    private static final long serialVersionUID = 1L;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskInstance() {
        return taskInstance;
    }

    public void setTaskInstance(String taskInstance) {
        this.taskInstance = taskInstance;
    }

    public String getTaskConfig() {
        return taskConfig;
    }

    public void setTaskConfig(String taskConfig) {
        this.taskConfig = taskConfig;
    }

    public String getTaskRunner() {
        return taskRunner;
    }

    public void setTaskRunner(String taskRunner) {
        this.taskRunner = taskRunner;
    }

    public String getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(String lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public String getRunLock() {
        return runLock;
    }

    public void setRunLock(String runLock) {
        this.runLock = runLock;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getSsId() {
        return ssId;
    }

    public void setSsId(String ssId) {
        this.ssId = ssId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskId=").append(taskId);
        sb.append(", taskName=").append(taskName);
        sb.append(", taskType=").append(taskType);
        sb.append(", taskInstance=").append(taskInstance);
        sb.append(", taskConfig=").append(taskConfig);
        sb.append(", taskRunner=").append(taskRunner);
        sb.append(", lastRunTime=").append(lastRunTime);
        sb.append(", runLock=").append(runLock);
        sb.append(", serverName=").append(serverName);
        sb.append(", enableFlag=").append(enableFlag);
        sb.append(", taskDesc=").append(taskDesc);
        sb.append(", ssId=").append(ssId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}