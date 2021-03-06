package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class VpnConnection  extends AbstractModel{


    /**
    * 通道实例ID。
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;
    

    /**
    * 通道名称。
    */
    @SerializedName("VpnConnectionName")
    @Expose
    private String VpnConnectionName;
    

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;
    

    /**
    * VPN网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;
    

    /**
    * 对端网关实例ID。
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;
    

    /**
    * 预共享密钥。
    */
    @SerializedName("PreShareKey")
    @Expose
    private String PreShareKey;
    

    /**
    * 通道传输协议。
    */
    @SerializedName("VpnProto")
    @Expose
    private String VpnProto;
    

    /**
    * 通道加密协议。
    */
    @SerializedName("EncryptProto")
    @Expose
    private String EncryptProto;
    

    /**
    * 路由类型。
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;
    

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;
    

    /**
    * 通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。
    */
    @SerializedName("State")
    @Expose
    private String State;
    

    /**
    * 通道连接状态，AVAILABLE：已连接。
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;
    

    /**
    * SPD。
    */
    @SerializedName("SecurityPolicyDatabaseSet")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabaseSet;
    

    /**
    * IKE选项。
    */
    @SerializedName("IKEOptionsSpecification")
    @Expose
    private IKEOptionsSpecification IKEOptionsSpecification;
    

    /**
    * IPSEC选择。
    */
    @SerializedName("IPSECOptionsSpecification")
    @Expose
    private IPSECOptionsSpecification IPSECOptionsSpecification;
    

    /**
     * 获取通道实例ID。
     * @return VpnConnectionId 通道实例ID。
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * 设置通道实例ID。
     * @param VpnConnectionId 通道实例ID。
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * 获取通道名称。
     * @return VpnConnectionName 通道名称。
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * 设置通道名称。
     * @param VpnConnectionName 通道名称。
     */
    public void setVpnConnectionName(String VpnConnectionName) {
        this.VpnConnectionName = VpnConnectionName;
    }

    /**
     * 获取VPC实例ID。
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取VPN网关实例ID。
     * @return VpnGatewayId VPN网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * 设置VPN网关实例ID。
     * @param VpnGatewayId VPN网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * 获取对端网关实例ID。
     * @return CustomerGatewayId 对端网关实例ID。
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * 设置对端网关实例ID。
     * @param CustomerGatewayId 对端网关实例ID。
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * 获取预共享密钥。
     * @return PreShareKey 预共享密钥。
     */
    public String getPreShareKey() {
        return this.PreShareKey;
    }

    /**
     * 设置预共享密钥。
     * @param PreShareKey 预共享密钥。
     */
    public void setPreShareKey(String PreShareKey) {
        this.PreShareKey = PreShareKey;
    }

    /**
     * 获取通道传输协议。
     * @return VpnProto 通道传输协议。
     */
    public String getVpnProto() {
        return this.VpnProto;
    }

    /**
     * 设置通道传输协议。
     * @param VpnProto 通道传输协议。
     */
    public void setVpnProto(String VpnProto) {
        this.VpnProto = VpnProto;
    }

    /**
     * 获取通道加密协议。
     * @return EncryptProto 通道加密协议。
     */
    public String getEncryptProto() {
        return this.EncryptProto;
    }

    /**
     * 设置通道加密协议。
     * @param EncryptProto 通道加密协议。
     */
    public void setEncryptProto(String EncryptProto) {
        this.EncryptProto = EncryptProto;
    }

    /**
     * 获取路由类型。
     * @return RouteType 路由类型。
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * 设置路由类型。
     * @param RouteType 路由类型。
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * 获取创建时间。
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。
     * @return State 通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。
     * @param State 通道的生产状态，PENDING：生产中，AVAILABLE：运行中，DELETING：删除中。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取通道连接状态，AVAILABLE：已连接。
     * @return NetStatus 通道连接状态，AVAILABLE：已连接。
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * 设置通道连接状态，AVAILABLE：已连接。
     * @param NetStatus 通道连接状态，AVAILABLE：已连接。
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * 获取SPD。
     * @return SecurityPolicyDatabaseSet SPD。
     */
    public SecurityPolicyDatabase [] getSecurityPolicyDatabaseSet() {
        return this.SecurityPolicyDatabaseSet;
    }

    /**
     * 设置SPD。
     * @param SecurityPolicyDatabaseSet SPD。
     */
    public void setSecurityPolicyDatabaseSet(SecurityPolicyDatabase [] SecurityPolicyDatabaseSet) {
        this.SecurityPolicyDatabaseSet = SecurityPolicyDatabaseSet;
    }

    /**
     * 获取IKE选项。
     * @return IKEOptionsSpecification IKE选项。
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * 设置IKE选项。
     * @param IKEOptionsSpecification IKE选项。
     */
    public void setIKEOptionsSpecification(IKEOptionsSpecification IKEOptionsSpecification) {
        this.IKEOptionsSpecification = IKEOptionsSpecification;
    }

    /**
     * 获取IPSEC选择。
     * @return IPSECOptionsSpecification IPSEC选择。
     */
    public IPSECOptionsSpecification getIPSECOptionsSpecification() {
        return this.IPSECOptionsSpecification;
    }

    /**
     * 设置IPSEC选择。
     * @param IPSECOptionsSpecification IPSEC选择。
     */
    public void setIPSECOptionsSpecification(IPSECOptionsSpecification IPSECOptionsSpecification) {
        this.IPSECOptionsSpecification = IPSECOptionsSpecification;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamSimple(map, prefix + "VpnConnectionName", this.VpnConnectionName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "PreShareKey", this.PreShareKey);
        this.setParamSimple(map, prefix + "VpnProto", this.VpnProto);
        this.setParamSimple(map, prefix + "EncryptProto", this.EncryptProto);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);
        this.setParamArrayObj(map, prefix + "SecurityPolicyDatabaseSet.", this.SecurityPolicyDatabaseSet);
        this.setParamObj(map, prefix + "IKEOptionsSpecification.", this.IKEOptionsSpecification);
        this.setParamObj(map, prefix + "IPSECOptionsSpecification.", this.IPSECOptionsSpecification);

    }
}

