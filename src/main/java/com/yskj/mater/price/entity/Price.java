package com.yskj.mater.price.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author nc
 * 用水性质bean
 */
public class Price implements Serializable{
    /**
     * 主键 编号
     */
    private Integer prjid;
    /**
     * 名称
     */
    private String prjname;
    /**
     * 单价(基础)
     */
    private BigDecimal basicprice;
    /**
     *附加费1单价（默认是污水处理费）
     */
    private BigDecimal add1price;
    /**
     * 附加费2单价
     */
    private BigDecimal add2price;
    /**
     * 附加费3单价
     */
    private BigDecimal add3price;
    /**
     * 附加费4单价
     */
    private BigDecimal add4price;
    /**
     * 附加费5单价
     */
    private BigDecimal add5price;
    /**
     * 分类（某些用水性质属于同一类）
     */
    private Integer typeid;
    /**
     * 一阶上限增量（每超出一口人增加的水量）
     */
    private Integer waterincrement;
    /**
     * 一阶上限（水量或百分数）
     */
    private Integer waterjh1;
    /**
     * 二阶单价
     */
    private BigDecimal price2;
    /**
     * 二阶止限（水量或百分数）
     */
    private Integer waterjh2;
    /**
     * 三阶单价
     */
    private BigDecimal price3;
    /**
     * （暂时未用）
     */
    private BigDecimal price0;
    /**
     * 简名（简写的用水性质名称）
     */
    private String shortname;
    /**
     * 计划类型（1按水量，2按百分数）
     */
    private Integer planmode;
    /**
     * 计划用水周期（0无计划，1每月，3每季度，12每年）
     */
    private Integer period;
    /**
     * 修改时间
     */
    private Date modificationtime;
    /**
     * 备注
     */
    private String remarks;

    /**
     * 无参构造方法
     */
    public Price() {
    }

    /**
     * 有参构造方法
     * @param prjid
     * @param prjname
     * @param basicprice
     * @param add1price
     * @param add2price
     * @param add3price
     * @param add4price
     * @param add5price
     * @param typeid
     * @param waterincrement
     * @param waterjh1
     * @param price2
     * @param waterjh2
     * @param price3
     * @param price0
     * @param shortname
     * @param planmode
     * @param period
     * @param modificationtime
     * @param remarks
     */
    public Price(Integer prjid, String prjname, BigDecimal basicprice, BigDecimal add1price, BigDecimal add2price, BigDecimal add3price, BigDecimal add4price, BigDecimal add5price, Integer typeid, Integer waterincrement, Integer waterjh1, BigDecimal price2, Integer waterjh2, BigDecimal price3, BigDecimal price0, String shortname, Integer planmode, Integer period, Date modificationtime, String remarks) {
        this.prjid = prjid;
        this.prjname = prjname;
        this.basicprice = basicprice;
        this.add1price = add1price;
        this.add2price = add2price;
        this.add3price = add3price;
        this.add4price = add4price;
        this.add5price = add5price;
        this.typeid = typeid;
        this.waterincrement = waterincrement;
        this.waterjh1 = waterjh1;
        this.price2 = price2;
        this.waterjh2 = waterjh2;
        this.price3 = price3;
        this.price0 = price0;
        this.shortname = shortname;
        this.planmode = planmode;
        this.period = period;
        this.modificationtime = modificationtime;
        this.remarks = remarks;
    }

    /**
     * 重写toString()
     * @return
     */
    @Override
    public String toString() {
        return "Price{" +
                "prjid=" + prjid +
                ", prjname='" + prjname + '\'' +
                ", basicprice=" + basicprice +
                ", add1price=" + add1price +
                ", add2price=" + add2price +
                ", add3price=" + add3price +
                ", add4price=" + add4price +
                ", add5price=" + add5price +
                ", typeid=" + typeid +
                ", waterincrement=" + waterincrement +
                ", waterjh1=" + waterjh1 +
                ", price2=" + price2 +
                ", waterjh2=" + waterjh2 +
                ", price3=" + price3 +
                ", price0=" + price0 +
                ", shortname='" + shortname + '\'' +
                ", planmode=" + planmode +
                ", period=" + period +
                ", modificationtime=" + modificationtime +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Integer getPrjid() {
        return prjid;
    }

    public void setPrjid(Integer prjid) {
        this.prjid = prjid;
    }

    public String getPrjname() {
        return prjname;
    }

    public void setPrjname(String prjname) {
        this.prjname = prjname == null ? null : prjname.trim();
    }

    public BigDecimal getBasicprice() {
        return basicprice;
    }

    public void setBasicprice(BigDecimal basicprice) {
        this.basicprice = basicprice;
    }

    public BigDecimal getAdd1price() {
        return add1price;
    }

    public void setAdd1price(BigDecimal add1price) {
        this.add1price = add1price;
    }

    public BigDecimal getAdd2price() {
        return add2price;
    }

    public void setAdd2price(BigDecimal add2price) {
        this.add2price = add2price;
    }

    public BigDecimal getAdd3price() {
        return add3price;
    }

    public void setAdd3price(BigDecimal add3price) {
        this.add3price = add3price;
    }

    public BigDecimal getAdd4price() {
        return add4price;
    }

    public void setAdd4price(BigDecimal add4price) {
        this.add4price = add4price;
    }

    public BigDecimal getAdd5price() {
        return add5price;
    }

    public void setAdd5price(BigDecimal add5price) {
        this.add5price = add5price;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getWaterincrement() {
        return waterincrement;
    }

    public void setWaterincrement(Integer waterincrement) {
        this.waterincrement = waterincrement;
    }

    public Integer getWaterjh1() {
        return waterjh1;
    }

    public void setWaterjh1(Integer waterjh1) {
        this.waterjh1 = waterjh1;
    }

    public BigDecimal getPrice2() {
        return price2;
    }

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
    }

    public Integer getWaterjh2() {
        return waterjh2;
    }

    public void setWaterjh2(Integer waterjh2) {
        this.waterjh2 = waterjh2;
    }

    public BigDecimal getPrice3() {
        return price3;
    }

    public void setPrice3(BigDecimal price3) {
        this.price3 = price3;
    }

    public BigDecimal getPrice0() {
        return price0;
    }

    public void setPrice0(BigDecimal price0) {
        this.price0 = price0;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public Integer getPlanmode() {
        return planmode;
    }

    public void setPlanmode(Integer planmode) {
        this.planmode = planmode;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Date getModificationtime() {
        return modificationtime;
    }

    public void setModificationtime(Date modificationtime) {
        this.modificationtime = modificationtime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}