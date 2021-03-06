package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AppInfo  extends AbstractModel{


    /**
    * app的url，必须保证不用权限校验就可以下载
    */
    @SerializedName("AppUrl")
    @Expose
    private String AppUrl;
    

    /**
    * app的md5
    */
    @SerializedName("AppMd5")
    @Expose
    private String AppMd5;
    

    /**
    * app的大小
    */
    @SerializedName("AppSize")
    @Expose
    private Integer AppSize;
    

    /**
    * app的文件名，指定后加固后的文件名是{FileName}_legu.apk
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;
    

    /**
    * app的包名
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;
    

    /**
    * app的版本号
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;
    

    /**
    * app的图标url
    */
    @SerializedName("AppIconUrl")
    @Expose
    private String AppIconUrl;
    

    /**
    * app的名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;
    

    /**
     * 获取app的url，必须保证不用权限校验就可以下载
     * @return AppUrl app的url，必须保证不用权限校验就可以下载
     */
    public String getAppUrl() {
        return this.AppUrl;
    }

    /**
     * 设置app的url，必须保证不用权限校验就可以下载
     * @param AppUrl app的url，必须保证不用权限校验就可以下载
     */
    public void setAppUrl(String AppUrl) {
        this.AppUrl = AppUrl;
    }

    /**
     * 获取app的md5
     * @return AppMd5 app的md5
     */
    public String getAppMd5() {
        return this.AppMd5;
    }

    /**
     * 设置app的md5
     * @param AppMd5 app的md5
     */
    public void setAppMd5(String AppMd5) {
        this.AppMd5 = AppMd5;
    }

    /**
     * 获取app的大小
     * @return AppSize app的大小
     */
    public Integer getAppSize() {
        return this.AppSize;
    }

    /**
     * 设置app的大小
     * @param AppSize app的大小
     */
    public void setAppSize(Integer AppSize) {
        this.AppSize = AppSize;
    }

    /**
     * 获取app的文件名，指定后加固后的文件名是{FileName}_legu.apk
     * @return FileName app的文件名，指定后加固后的文件名是{FileName}_legu.apk
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置app的文件名，指定后加固后的文件名是{FileName}_legu.apk
     * @param FileName app的文件名，指定后加固后的文件名是{FileName}_legu.apk
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取app的包名
     * @return AppPkgName app的包名
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * 设置app的包名
     * @param AppPkgName app的包名
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * 获取app的版本号
     * @return AppVersion app的版本号
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * 设置app的版本号
     * @param AppVersion app的版本号
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * 获取app的图标url
     * @return AppIconUrl app的图标url
     */
    public String getAppIconUrl() {
        return this.AppIconUrl;
    }

    /**
     * 设置app的图标url
     * @param AppIconUrl app的图标url
     */
    public void setAppIconUrl(String AppIconUrl) {
        this.AppIconUrl = AppIconUrl;
    }

    /**
     * 获取app的名称
     * @return AppName app的名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置app的名称
     * @param AppName app的名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppUrl", this.AppUrl);
        this.setParamSimple(map, prefix + "AppMd5", this.AppMd5);
        this.setParamSimple(map, prefix + "AppSize", this.AppSize);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "AppIconUrl", this.AppIconUrl);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

