package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetDeviceLogRequest  extends AbstractModel{


    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;
    

    /**
    * 设备名称列表，最大支持100台
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;
    

    /**
    * 查询开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;
    

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;
    

    /**
    * 查询数据量
    */
    @SerializedName("Size")
    @Expose
    private Integer Size;
    

    /**
    * 时间排序（desc/asc）
    */
    @SerializedName("Order")
    @Expose
    private String Order;
    

    /**
    * 查询游标
    */
    @SerializedName("ScrollId")
    @Expose
    private String ScrollId;
    

    /**
    * 日志类型（comm/status）
    */
    @SerializedName("Type")
    @Expose
    private String Type;
    

    /**
     * 获取产品Id
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取设备名称列表，最大支持100台
     * @return DeviceNames 设备名称列表，最大支持100台
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * 设置设备名称列表，最大支持100台
     * @param DeviceNames 设备名称列表，最大支持100台
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * 获取查询开始时间
     * @return StartTime 查询开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置查询开始时间
     * @param StartTime 查询开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取查询结束时间
     * @return EndTime 查询结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取查询数据量
     * @return Size 查询数据量
     */
    public Integer getSize() {
        return this.Size;
    }

    /**
     * 设置查询数据量
     * @param Size 查询数据量
     */
    public void setSize(Integer Size) {
        this.Size = Size;
    }

    /**
     * 获取时间排序（desc/asc）
     * @return Order 时间排序（desc/asc）
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * 设置时间排序（desc/asc）
     * @param Order 时间排序（desc/asc）
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * 获取查询游标
     * @return ScrollId 查询游标
     */
    public String getScrollId() {
        return this.ScrollId;
    }

    /**
     * 设置查询游标
     * @param ScrollId 查询游标
     */
    public void setScrollId(String ScrollId) {
        this.ScrollId = ScrollId;
    }

    /**
     * 获取日志类型（comm/status）
     * @return Type 日志类型（comm/status）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置日志类型（comm/status）
     * @param Type 日志类型（comm/status）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "ScrollId", this.ScrollId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

