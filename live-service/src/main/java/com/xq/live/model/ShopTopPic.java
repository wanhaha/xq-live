package com.xq.live.model;

import java.util.Date;

public class ShopTopPic {
    private Long id;

    private Long shopId;

    private Long attachementId;

    private Integer isDeleted;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getAttachementId() {
        return attachementId;
    }

    public void setAttachementId(Long attachementId) {
        this.attachementId = attachementId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}