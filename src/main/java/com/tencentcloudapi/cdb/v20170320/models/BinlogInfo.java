package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class BinlogInfo  extends AbstractModel{


    /**
    * 备份文件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;
    

    /**
    * 备份文件大小，单位：Byte
    */
    @SerializedName("Size")
    @Expose
    private Integer Size;
    

    /**
    * 备份快照时间，时间格式：2016-03-17 02:10:37
    */
    @SerializedName("Date")
    @Expose
    private String Date;
    

    /**
    * 内网下载地址
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;
    

    /**
    * 外网下载地址
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;
    

    /**
    * 日志具体类型，可能的值有：binlog - 二进制日志
    */
    @SerializedName("Type")
    @Expose
    private String Type;
    

    /**
     * 获取备份文件名
     * @return Name 备份文件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置备份文件名
     * @param Name 备份文件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取备份文件大小，单位：Byte
     * @return Size 备份文件大小，单位：Byte
     */
    public Integer getSize() {
        return this.Size;
    }

    /**
     * 设置备份文件大小，单位：Byte
     * @param Size 备份文件大小，单位：Byte
     */
    public void setSize(Integer Size) {
        this.Size = Size;
    }

    /**
     * 获取备份快照时间，时间格式：2016-03-17 02:10:37
     * @return Date 备份快照时间，时间格式：2016-03-17 02:10:37
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置备份快照时间，时间格式：2016-03-17 02:10:37
     * @param Date 备份快照时间，时间格式：2016-03-17 02:10:37
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取内网下载地址
     * @return IntranetUrl 内网下载地址
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * 设置内网下载地址
     * @param IntranetUrl 内网下载地址
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * 获取外网下载地址
     * @return InternetUrl 外网下载地址
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * 设置外网下载地址
     * @param InternetUrl 外网下载地址
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * 获取日志具体类型，可能的值有：binlog - 二进制日志
     * @return Type 日志具体类型，可能的值有：binlog - 二进制日志
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置日志具体类型，可能的值有：binlog - 二进制日志
     * @param Type 日志具体类型，可能的值有：binlog - 二进制日志
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "IntranetUrl", this.IntranetUrl);
        this.setParamSimple(map, prefix + "InternetUrl", this.InternetUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

