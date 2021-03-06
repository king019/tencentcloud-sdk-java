package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Disk  extends AbstractModel{


    /**
    * 云硬盘ID。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;
    

    /**
    * 云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;
    

    /**
    * 付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;
    

    /**
    * 是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。
    */
    @SerializedName("Portable")
    @Expose
    private Boolean Portable;
    

    /**
    * 云硬盘所在的位置。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;
    

    /**
    * 云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。
    */
    @SerializedName("SnapshotAbility")
    @Expose
    private Boolean SnapshotAbility;
    

    /**
    * 云硬盘名称。
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;
    

    /**
    * 云硬盘大小。
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;
    

    /**
    * 云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中。
    */
    @SerializedName("DiskState")
    @Expose
    private String DiskState;
    

    /**
    * 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;
    

    /**
    * 云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。
    */
    @SerializedName("Attached")
    @Expose
    private Boolean Attached;
    

    /**
    * 云硬盘挂载的云主机ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 云硬盘的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;
    

    /**
    * 云硬盘的到期时间。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;
    

    /**
    * 云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。
    */
    @SerializedName("Rollbacking")
    @Expose
    private Boolean Rollbacking;
    

    /**
    * 云盘快照回滚的进度。
    */
    @SerializedName("RollbackPercent")
    @Expose
    private Integer RollbackPercent;
    

    /**
    * 云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;
    

    /**
    * 云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
    */
    @SerializedName("AutoRenewFlagError")
    @Expose
    private Boolean AutoRenewFlagError;
    

    /**
    * 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;
    

    /**
    * 在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
    */
    @SerializedName("DeadlineError")
    @Expose
    private Boolean DeadlineError;
    

    /**
    * 判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
    */
    @SerializedName("IsReturnable")
    @Expose
    private Boolean IsReturnable;
    

    /**
    * 预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
    */
    @SerializedName("ReturnFailCode")
    @Expose
    private Integer ReturnFailCode;
    

    /**
    * 云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
    */
    @SerializedName("AutoSnapshotPolicyIds")
    @Expose
    private String [] AutoSnapshotPolicyIds;
    

    /**
    * 与云盘绑定的标签，云盘未绑定标签则取值为空。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;
    

    /**
     * 获取云硬盘ID。
     * @return DiskId 云硬盘ID。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * 设置云硬盘ID。
     * @param DiskId 云硬盘ID。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * 获取云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     * @return DiskUsage 云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * 设置云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     * @param DiskUsage 云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * 获取付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。
     * @return DiskChargeType 付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * 设置付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。
     * @param DiskChargeType 付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * 获取是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。
     * @return Portable 是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。
     */
    public Boolean getPortable() {
        return this.Portable;
    }

    /**
     * 设置是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。
     * @param Portable 是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。
     */
    public void setPortable(Boolean Portable) {
        this.Portable = Portable;
    }

    /**
     * 获取云硬盘所在的位置。
     * @return Placement 云硬盘所在的位置。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * 设置云硬盘所在的位置。
     * @param Placement 云硬盘所在的位置。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * 获取云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。
     * @return SnapshotAbility 云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。
     */
    public Boolean getSnapshotAbility() {
        return this.SnapshotAbility;
    }

    /**
     * 设置云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。
     * @param SnapshotAbility 云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。
     */
    public void setSnapshotAbility(Boolean SnapshotAbility) {
        this.SnapshotAbility = SnapshotAbility;
    }

    /**
     * 获取云硬盘名称。
     * @return DiskName 云硬盘名称。
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * 设置云硬盘名称。
     * @param DiskName 云硬盘名称。
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * 获取云硬盘大小。
     * @return DiskSize 云硬盘大小。
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置云硬盘大小。
     * @param DiskSize 云硬盘大小。
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 获取云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中。
     * @return DiskState 云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中。
     */
    public String getDiskState() {
        return this.DiskState;
    }

    /**
     * 设置云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中。
     * @param DiskState 云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中。
     */
    public void setDiskState(String DiskState) {
        this.DiskState = DiskState;
    }

    /**
     * 获取云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     * @return DiskType 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * 设置云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     * @param DiskType 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * 获取云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。
     * @return Attached 云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。
     */
    public Boolean getAttached() {
        return this.Attached;
    }

    /**
     * 设置云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。
     * @param Attached 云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。
     */
    public void setAttached(Boolean Attached) {
        this.Attached = Attached;
    }

    /**
     * 获取云硬盘挂载的云主机ID。
     * @return InstanceId 云硬盘挂载的云主机ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置云硬盘挂载的云主机ID。
     * @param InstanceId 云硬盘挂载的云主机ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取云硬盘的创建时间。
     * @return CreateTime 云硬盘的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置云硬盘的创建时间。
     * @param CreateTime 云硬盘的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取云硬盘的到期时间。
     * @return DeadlineTime 云硬盘的到期时间。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * 设置云硬盘的到期时间。
     * @param DeadlineTime 云硬盘的到期时间。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * 获取云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。
     * @return Rollbacking 云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。
     */
    public Boolean getRollbacking() {
        return this.Rollbacking;
    }

    /**
     * 设置云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。
     * @param Rollbacking 云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。
     */
    public void setRollbacking(Boolean Rollbacking) {
        this.Rollbacking = Rollbacking;
    }

    /**
     * 获取云盘快照回滚的进度。
     * @return RollbackPercent 云盘快照回滚的进度。
     */
    public Integer getRollbackPercent() {
        return this.RollbackPercent;
    }

    /**
     * 设置云盘快照回滚的进度。
     * @param RollbackPercent 云盘快照回滚的进度。
     */
    public void setRollbackPercent(Integer RollbackPercent) {
        this.RollbackPercent = RollbackPercent;
    }

    /**
     * 获取云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。
     * @return Encrypt 云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * 设置云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。
     * @param Encrypt 云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * 获取云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
     * @return AutoRenewFlagError 云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
     */
    public Boolean getAutoRenewFlagError() {
        return this.AutoRenewFlagError;
    }

    /**
     * 设置云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
     * @param AutoRenewFlagError 云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
     */
    public void setAutoRenewFlagError(Boolean AutoRenewFlagError) {
        this.AutoRenewFlagError = AutoRenewFlagError;
    }

    /**
     * 获取自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
     * @return RenewFlag 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * 设置自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
     * @param RenewFlag 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * 获取在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
     * @return DeadlineError 在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
     */
    public Boolean getDeadlineError() {
        return this.DeadlineError;
    }

    /**
     * 设置在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
     * @param DeadlineError 在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
     */
    public void setDeadlineError(Boolean DeadlineError) {
        this.DeadlineError = DeadlineError;
    }

    /**
     * 获取判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
     * @return IsReturnable 判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
     */
    public Boolean getIsReturnable() {
        return this.IsReturnable;
    }

    /**
     * 设置判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
     * @param IsReturnable 判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
     */
    public void setIsReturnable(Boolean IsReturnable) {
        this.IsReturnable = IsReturnable;
    }

    /**
     * 获取预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
     * @return ReturnFailCode 预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
     */
    public Integer getReturnFailCode() {
        return this.ReturnFailCode;
    }

    /**
     * 设置预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
     * @param ReturnFailCode 预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
     */
    public void setReturnFailCode(Integer ReturnFailCode) {
        this.ReturnFailCode = ReturnFailCode;
    }

    /**
     * 获取云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
     * @return AutoSnapshotPolicyIds 云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
     */
    public String [] getAutoSnapshotPolicyIds() {
        return this.AutoSnapshotPolicyIds;
    }

    /**
     * 设置云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
     * @param AutoSnapshotPolicyIds 云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
     */
    public void setAutoSnapshotPolicyIds(String [] AutoSnapshotPolicyIds) {
        this.AutoSnapshotPolicyIds = AutoSnapshotPolicyIds;
    }

    /**
     * 获取与云盘绑定的标签，云盘未绑定标签则取值为空。
     * @return Tags 与云盘绑定的标签，云盘未绑定标签则取值为空。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置与云盘绑定的标签，云盘未绑定标签则取值为空。
     * @param Tags 与云盘绑定的标签，云盘未绑定标签则取值为空。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "Portable", this.Portable);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "SnapshotAbility", this.SnapshotAbility);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskState", this.DiskState);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Attached", this.Attached);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Rollbacking", this.Rollbacking);
        this.setParamSimple(map, prefix + "RollbackPercent", this.RollbackPercent);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "AutoRenewFlagError", this.AutoRenewFlagError);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DeadlineError", this.DeadlineError);
        this.setParamSimple(map, prefix + "IsReturnable", this.IsReturnable);
        this.setParamSimple(map, prefix + "ReturnFailCode", this.ReturnFailCode);
        this.setParamArraySimple(map, prefix + "AutoSnapshotPolicyIds.", this.AutoSnapshotPolicyIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

