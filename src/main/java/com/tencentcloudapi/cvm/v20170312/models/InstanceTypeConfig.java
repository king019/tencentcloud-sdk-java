package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InstanceTypeConfig  extends AbstractModel{


    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;
    

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;
    

    /**
    * 实例机型系列。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;
    

    /**
    * GPU核数，单位：核。
    */
    @SerializedName("GPU")
    @Expose
    private Integer GPU;
    

    /**
    * CPU核数，单位：核。
    */
    @SerializedName("CPU")
    @Expose
    private Integer CPU;
    

    /**
    * 内存容量，单位：`GB`。
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;
    

    /**
    * 是否支持云硬盘。取值范围：<br><li>`TRUE`：表示支持云硬盘；<br><li>`FALSE`：表示不支持云硬盘。
    */
    @SerializedName("CbsSupport")
    @Expose
    private String CbsSupport;
    

    /**
    * 机型状态。取值范围：<br><li>`AVAILABLE`：表示机型可用；<br><li>`UNAVAILABLE`：表示机型不可用。
    */
    @SerializedName("InstanceTypeState")
    @Expose
    private String InstanceTypeState;
    

    /**
     * 获取可用区。
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取实例机型。
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取实例机型系列。
     * @return InstanceFamily 实例机型系列。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * 设置实例机型系列。
     * @param InstanceFamily 实例机型系列。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * 获取GPU核数，单位：核。
     * @return GPU GPU核数，单位：核。
     */
    public Integer getGPU() {
        return this.GPU;
    }

    /**
     * 设置GPU核数，单位：核。
     * @param GPU GPU核数，单位：核。
     */
    public void setGPU(Integer GPU) {
        this.GPU = GPU;
    }

    /**
     * 获取CPU核数，单位：核。
     * @return CPU CPU核数，单位：核。
     */
    public Integer getCPU() {
        return this.CPU;
    }

    /**
     * 设置CPU核数，单位：核。
     * @param CPU CPU核数，单位：核。
     */
    public void setCPU(Integer CPU) {
        this.CPU = CPU;
    }

    /**
     * 获取内存容量，单位：`GB`。
     * @return Memory 内存容量，单位：`GB`。
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存容量，单位：`GB`。
     * @param Memory 内存容量，单位：`GB`。
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取是否支持云硬盘。取值范围：<br><li>`TRUE`：表示支持云硬盘；<br><li>`FALSE`：表示不支持云硬盘。
     * @return CbsSupport 是否支持云硬盘。取值范围：<br><li>`TRUE`：表示支持云硬盘；<br><li>`FALSE`：表示不支持云硬盘。
     */
    public String getCbsSupport() {
        return this.CbsSupport;
    }

    /**
     * 设置是否支持云硬盘。取值范围：<br><li>`TRUE`：表示支持云硬盘；<br><li>`FALSE`：表示不支持云硬盘。
     * @param CbsSupport 是否支持云硬盘。取值范围：<br><li>`TRUE`：表示支持云硬盘；<br><li>`FALSE`：表示不支持云硬盘。
     */
    public void setCbsSupport(String CbsSupport) {
        this.CbsSupport = CbsSupport;
    }

    /**
     * 获取机型状态。取值范围：<br><li>`AVAILABLE`：表示机型可用；<br><li>`UNAVAILABLE`：表示机型不可用。
     * @return InstanceTypeState 机型状态。取值范围：<br><li>`AVAILABLE`：表示机型可用；<br><li>`UNAVAILABLE`：表示机型不可用。
     */
    public String getInstanceTypeState() {
        return this.InstanceTypeState;
    }

    /**
     * 设置机型状态。取值范围：<br><li>`AVAILABLE`：表示机型可用；<br><li>`UNAVAILABLE`：表示机型不可用。
     * @param InstanceTypeState 机型状态。取值范围：<br><li>`AVAILABLE`：表示机型可用；<br><li>`UNAVAILABLE`：表示机型不可用。
     */
    public void setInstanceTypeState(String InstanceTypeState) {
        this.InstanceTypeState = InstanceTypeState;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "GPU", this.GPU);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CbsSupport", this.CbsSupport);
        this.setParamSimple(map, prefix + "InstanceTypeState", this.InstanceTypeState);

    }
}

