package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class VerifySitesResponse  extends AbstractModel{


    /**
    * 验证成功的根域名数量。
    */
    @SerializedName("SuccessNumber")
    @Expose
    private Integer SuccessNumber;
    

    /**
    * 验证失败的根域名数量。
    */
    @SerializedName("FailNumber")
    @Expose
    private Integer FailNumber;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取验证成功的根域名数量。
     * @return SuccessNumber 验证成功的根域名数量。
     */
    public Integer getSuccessNumber() {
        return this.SuccessNumber;
    }

    /**
     * 设置验证成功的根域名数量。
     * @param SuccessNumber 验证成功的根域名数量。
     */
    public void setSuccessNumber(Integer SuccessNumber) {
        this.SuccessNumber = SuccessNumber;
    }

    /**
     * 获取验证失败的根域名数量。
     * @return FailNumber 验证失败的根域名数量。
     */
    public Integer getFailNumber() {
        return this.FailNumber;
    }

    /**
     * 设置验证失败的根域名数量。
     * @param FailNumber 验证失败的根域名数量。
     */
    public void setFailNumber(Integer FailNumber) {
        this.FailNumber = FailNumber;
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
        this.setParamSimple(map, prefix + "SuccessNumber", this.SuccessNumber);
        this.setParamSimple(map, prefix + "FailNumber", this.FailNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

