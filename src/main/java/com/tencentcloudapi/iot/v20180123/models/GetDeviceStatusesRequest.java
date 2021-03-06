package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetDeviceStatusesRequest  extends AbstractModel{


    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;
    

    /**
    * 设备名称列表（单次限制1000个设备）
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;
    

    /**
     * 获取产品ID
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取设备名称列表（单次限制1000个设备）
     * @return DeviceNames 设备名称列表（单次限制1000个设备）
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * 设置设备名称列表（单次限制1000个设备）
     * @param DeviceNames 设备名称列表（单次限制1000个设备）
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);

    }
}

