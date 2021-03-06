/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.ms.v20180408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ms.v20180408.models.*;

public class MsClient extends AbstractClient{
    private static String endpoint = "ms.tencentcloudapi.com";
    private static String version = "2018-04-08";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public MsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public MsClient(Credential credential, String region, ClientProfile profile) {
        super(MsClient.endpoint, MsClient.version, credential, region, profile);
    }

    /**
     *用户通过该接口批量提交应用进行应用扫描，扫描后需通过DescribeScanResults接口查询扫描结果
     * @param req CreateScanInstancesRequest
     * @return CreateScanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanInstancesResponse  CreateScanInstances(CreateScanInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScanInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScanInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateScanInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口提交应用进行应用加固，加固后需通过DescribeShieldResult接口查询加固结果
     * @param req CreateShieldInstanceRequest
     * @return CreateShieldInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateShieldInstanceResponse  CreateShieldInstance(CreateShieldInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateShieldInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateShieldInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateShieldInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个或者多个app扫描信息
     * @param req DeleteScanInstancesRequest
     * @return DeleteScanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScanInstancesResponse  DeleteScanInstances(DeleteScanInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScanInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScanInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteScanInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个或者多个app加固信息
     * @param req DeleteShieldInstancesRequest
     * @return DeleteShieldInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShieldInstancesResponse  DeleteShieldInstances(DeleteShieldInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteShieldInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteShieldInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteShieldInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查看app列表。
可以通过指定任务唯一标识ItemId来查询指定app的详细信息，或通过设定过滤器来查询满足过滤条件的app的详细信息。 指定偏移(Offset)和限制(Limit)来选择结果中的一部分，默认返回满足条件的前20个app信息。
     * @param req DescribeScanInstancesRequest
     * @return DescribeScanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanInstancesResponse  DescribeScanInstances(DescribeScanInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeScanInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过CreateScanInstances接口提交应用进行风险批量扫描后，用此接口批量获取风险详细信息,包含漏洞信息，广告信息，插件信息和病毒信息
     * @param req DescribeScanResultsRequest
     * @return DescribeScanResultsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanResultsResponse  DescribeScanResults(DescribeScanResultsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanResultsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanResultsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeScanResults"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查看app列表。
可以通过指定任务唯一标识ItemId来查询指定app的详细信息，或通过设定过滤器来查询满足过滤条件的app的详细信息。 指定偏移(Offset)和限制(Limit)来选择结果中的一部分，默认返回满足条件的前20个app信息。

     * @param req DescribeShieldInstancesRequest
     * @return DescribeShieldInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShieldInstancesResponse  DescribeShieldInstances(DescribeShieldInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShieldInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShieldInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeShieldInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过唯一标识获取加固的结果
     * @param req DescribeShieldResultRequest
     * @return DescribeShieldResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShieldResultResponse  DescribeShieldResult(DescribeShieldResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShieldResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShieldResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeShieldResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
