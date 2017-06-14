package com.taotao.pojo;

import java.util.Date;

public class ItemParamItem {
    /**
     * 
     */
    private Long id;

    /**
     * 商品ID
     */
    private Long itemId;

    /**
     * 
     */
    private Date created;

    /**
     * 
     */
    private Date updated;

    /**
     * 参数数据，格式为json格式
     */
    private String paramData;

    /**
     *
     * @mbggenerated 2017-06-13
     */
    public ItemParamItem(Long id, Long itemId, Date created, Date updated, String paramData) {
        this.id = id;
        this.itemId = itemId;
        this.created = created;
        this.updated = updated;
        this.paramData = paramData;
    }

    /**
     *
     * @mbggenerated 2017-06-13
     */
    public ItemParamItem() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}