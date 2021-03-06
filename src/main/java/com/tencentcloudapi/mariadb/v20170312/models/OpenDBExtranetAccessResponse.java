package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class OpenDBExtranetAccessResponse  extends AbstractModel{


    /**
    * 异步任务Id，可通过 DescribeFlow 查询任务状态。
    */
    @SerializedName("FlowId")
    @Expose
    private Integer FlowId;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取异步任务Id，可通过 DescribeFlow 查询任务状态。
     * @return FlowId 异步任务Id，可通过 DescribeFlow 查询任务状态。
     */
    public Integer getFlowId() {
        return this.FlowId;
    }

    /**
     * 设置异步任务Id，可通过 DescribeFlow 查询任务状态。
     * @param FlowId 异步任务Id，可通过 DescribeFlow 查询任务状态。
     */
    public void setFlowId(Integer FlowId) {
        this.FlowId = FlowId;
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
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

