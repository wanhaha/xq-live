package com.xq.live.vo.in;

/**
 * sku 入参
 *
 * @author zhangpeng32
 * @date 2018-02-09 10:39
 * @copyright:hbxq
 **/
public class SkuInVo extends BaseInVo {

    private Long id;

    private String skuCode;

    private String skuName;

    private String picUrl;

    private Integer skuType;   //sku类型 1 券 2 特色菜 3 其他

    private Long shopId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getSkuType() {
        return skuType;
    }

    public void setSkuType(Integer skuType) {
        this.skuType = skuType;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}
