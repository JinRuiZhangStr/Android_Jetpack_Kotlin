package com.eflagcomm.android_jetpack_kotlin.sndemo;

import java.io.Serializable;

public class PcAttributeBean implements Serializable {

    /**
     * 标题
     */
    private String pc_title;

    /**
     * PC型号
     */
    private String model;
    /**
     * 操作系统
     */
    private String system;
    /**
     * 浏览器
     */
    private String  browser;
    /**
     * 版本
     */
    private String version;

    public String getPc_title() {
        return pc_title;
    }

    public void setPc_title(String pc_title) {
        this.pc_title = pc_title;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
