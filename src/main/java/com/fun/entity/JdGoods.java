package com.fun.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "jd_goods")
public class JdGoods {
    /**
     * 商品编号
     */
    @Id
    @Column(name = "GOODS_ID")
    private String goodsId;

    /**
     * 商品名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 店铺名称
     */
    @Column(name = "SHOP_NAME")
    private String shopName;

    /**
     * 评论数
     */
    @Column(name = "COMMENTS_NUM")
    private Integer commentsNum;

    /**
     * 价格
     */
    @Column(name = "PRICE")
    private BigDecimal price;

    /**
     * 是否自营
     */
    @Column(name = "SELF_OPERATED")
    private String selfOperated;

    /**
     * 商品链接
     */
    @Column(name = "LINK")
    private String link;

    /**
     * 好评率
     */
    @Column(name = "GOOD_RATE")
    private BigDecimal goodRate;

    /**
     * 商品类型编号
     */
    @Column(name = "CATEGORY")
    private String category;

    /**
     * 销量排序
     */
    @Column(name = "SALE_ORDER")
    private Integer saleOrder;

    /**
     * 获取商品编号
     *
     * @return GOODS_ID - 商品编号
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品编号
     *
     * @param goodsId 商品编号
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品名称
     *
     * @return NAME - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取店铺名称
     *
     * @return SHOP_NAME - 店铺名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 设置店铺名称
     *
     * @param shopName 店铺名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 获取评论数
     *
     * @return COMMENTS_NUM - 评论数
     */
    public Integer getCommentsNum() {
        return commentsNum;
    }

    /**
     * 设置评论数
     *
     * @param commentsNum 评论数
     */
    public void setCommentsNum(Integer commentsNum) {
        this.commentsNum = commentsNum;
    }

    /**
     * 获取价格
     *
     * @return PRICE - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取是否自营
     *
     * @return SELF_OPERATED - 是否自营
     */
    public String getSelfOperated() {
        return selfOperated;
    }

    /**
     * 设置是否自营
     *
     * @param selfOperated 是否自营
     */
    public void setSelfOperated(String selfOperated) {
        this.selfOperated = selfOperated;
    }

    /**
     * 获取商品链接
     *
     * @return LINK - 商品链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置商品链接
     *
     * @param link 商品链接
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取好评率
     *
     * @return GOOD_RATE - 好评率
     */
    public BigDecimal getGoodRate() {
        return goodRate;
    }

    /**
     * 设置好评率
     *
     * @param goodRate 好评率
     */
    public void setGoodRate(BigDecimal goodRate) {
        this.goodRate = goodRate;
    }

    /**
     * 获取商品类型编号
     *
     * @return CATEGORY - 商品类型编号
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置商品类型编号
     *
     * @param category 商品类型编号
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取销量排序
     *
     * @return SALE_ORDER - 销量排序
     */
    public Integer getSaleOrder() {
        return saleOrder;
    }

    /**
     * 设置销量排序
     *
     * @param saleOrder 销量排序
     */
    public void setSaleOrder(Integer saleOrder) {
        this.saleOrder = saleOrder;
    }
}