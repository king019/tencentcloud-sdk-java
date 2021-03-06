package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeJobSubmitInfoResponse  extends AbstractModel{


    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;
    

    /**
    * 作业名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;
    

    /**
    * 作业描述
    */
    @SerializedName("JobDescription")
    @Expose
    private String JobDescription;
    

    /**
    * 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
    */
    @SerializedName("Priority")
    @Expose
    private Integer Priority;
    

    /**
    * 任务信息
    */
    @SerializedName("Tasks")
    @Expose
    private Task [] Tasks;
    

    /**
    * 依赖信息
    */
    @SerializedName("Dependences")
    @Expose
    private Dependence [] Dependences;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取作业ID
     * @return JobId 作业ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * 设置作业ID
     * @param JobId 作业ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * 获取作业名称
     * @return JobName 作业名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * 设置作业名称
     * @param JobName 作业名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * 获取作业描述
     * @return JobDescription 作业描述
     */
    public String getJobDescription() {
        return this.JobDescription;
    }

    /**
     * 设置作业描述
     * @param JobDescription 作业描述
     */
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * 获取作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     * @return Priority 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     */
    public Integer getPriority() {
        return this.Priority;
    }

    /**
     * 设置作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     * @param Priority 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     */
    public void setPriority(Integer Priority) {
        this.Priority = Priority;
    }

    /**
     * 获取任务信息
     * @return Tasks 任务信息
     */
    public Task [] getTasks() {
        return this.Tasks;
    }

    /**
     * 设置任务信息
     * @param Tasks 任务信息
     */
    public void setTasks(Task [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * 获取依赖信息
     * @return Dependences 依赖信息
     */
    public Dependence [] getDependences() {
        return this.Dependences;
    }

    /**
     * 设置依赖信息
     * @param Dependences 依赖信息
     */
    public void setDependences(Dependence [] Dependences) {
        this.Dependences = Dependences;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobDescription", this.JobDescription);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArrayObj(map, prefix + "Dependences.", this.Dependences);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

