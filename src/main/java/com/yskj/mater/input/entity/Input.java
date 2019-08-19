package com.yskj.mater.input.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * @author nc
 * 抄表数据bean
 */
public class Input implements Serializable{
    /**
     * 主键 客户编号
     */
    private Integer userid;
    /**
     * 水费年份
     */
    private Integer cyear;
    /**
     * 水费月份
     */
    private Integer cmonth;
    /**
     * 抄表频率（每多少个月一抄，当按月阶梯时，多月一抄需要累加各阶梯上限）
     */
    private Integer frequency;
    /**
     * 人口数（人口数会增加一阶上限）
     */
    private Integer population;
    /**
     * 客户名称
     */
    private String name;
    /**
     * 客户地址
     */
    private String useraddr;
    /**
     * 用水性质1编号
     */
    private Byte prjid1;
    /**
     * 用水性质2编号
     */
    private Byte prjid2;
    /**
     * 用水性质3编号
     */
    private Byte prjid3;
    /**
     * 用水性质4编号
     */
    private Byte prjid4;
    /**
     * 用水性质5编号
     */
    private Byte prjid5;
    /**
     * 水量分配字串（用于显示）
     */
    private String prjlv;
    /**
     * 附加费1收取标志
     */
    private Byte add1flag;
    /**
     * 附加费2收取标志
     */
    private Byte add2flag;
    /**
     * 附加费3收取标志
     */
    private Byte add3flag;
    /**
     * 附加费4收取标志
     */
    private Byte add4flag;
    /**
     * 附加费5收取标志
     */
    private Byte add5flag;
    /**
     * 计划水量
     */
    private Integer planwater;
    /**
     * 区段号
     */
    private Integer duanno;
    /**
     * 区段内序号
     */
    private Integer orderno;
    /**
     * 起度（上月读数）
     */
    private Integer waterbegin;
    /**
     * 止度（本月读数）
     */
    private Integer waterend;
    /**
     * 前三月平均水量
     */
    private Integer wateravg;
    /**
     * 本月计费水量
     */
    private Integer waterreal;
    /**
     * 本月水量（直接计算所得）
     */
    private Integer wateramount0;
    /**
     * 上一累计水量
     */
    private Integer priorwatersum;
    /**
     * 上一累计水量（调整后）
     */
    private Integer priorwatersumadjusted;
    /**
     * 本月累计水量
     */
    private Integer currentwatersum;
    /**
     * 本月累计水量（调整后）
     */
    private Integer currentwatersumadjusted;
    /**
     * * 用水性质1对应计费水量
     */
    private Integer waterprj1;
    /**
     * * 用水性质2对应计费水量
     */
    private Integer waterprj2;
    /**
     * * 用水性质3对应计费水量
     */
    private Integer waterprj3;
    /**
     * * 用水性质4对应计费水量
     */
    private Integer waterprj4;
    /**
     * * 用水性质5对应计费水量
     */
    private Integer waterprj5;
    /**
     * 超计划水量
     */
    private Integer watercjh;
    /**
     * 超计划百分率
     */
    private Short watercjhlv;
    /**
     * 超计划用水性质单价编号
     */
    private Byte prjflag;
    /**
     * 抄表类型（正常、估抄等）
     */
    private Short waterflag;
    /**
     * 标志（0未提交，1已提）
     */
    private Integer audi;
    /**
     * 水表口径
     */
    private Short sbkj;
    /**
     * 缴费类型
     */
    private Byte paytype;
    /**
     * 抄表员编号
     */
    private Integer copyId;
    /**
     * 审核员编号
     */
    private Integer audiId;
    /**
     * 警告标志（旧）
     */
    private Byte warnFlag;
    /**
     * 抄表备注
     */
    private String copyremark;
    /**
     * 打印抄表备注（0-不打印，1-需要打印）
     */
    private Byte printremarkflag;
    /**
     * 预存标志（已不再使用）
     */
    private Byte imprestflag;
    /**
     * 用水性质1对应水费
     */
    private BigDecimal payprj1;
    /**
     * 用水性质2对应水费
     */
    private BigDecimal payprj2;
    /**
     * 用水性质3对应水费
     */
    private BigDecimal payprj3;
    /**
     * 用水性质4对应水费
     */
    private BigDecimal payprj4;
    /**
     * 用水性质5对应水费
     */
    private BigDecimal payprj5;
    /**
     * 附加费1合计金额
     */
    private BigDecimal payadd1;
    /**
     * 附加费2合计金额
     */
    private BigDecimal payadd2;
    /**
     * 附加费3合计金额
     */
    private BigDecimal payadd3;
    /**
     * 附加费4合计金额
     */
    private BigDecimal payadd4;
    /**
     * 附加费5合计金额
     */
    private BigDecimal payadd5;
    /**
     * 超计划用水水费金额
     */
    private BigDecimal paycjh;
    /**
     * 合计金额
     */
    private BigDecimal paytotal;
    /**
     * 合计金额大写
     */
    private String payup;
    /**
     * 已弃用字段
     */
    private Integer basicamt;
    /**
     * 已弃用字段
     */
    private Integer copyamt;
    /**
     * 已弃用字段
     */
    private Integer byamt;
    /**
     * 已弃用字段
     */
    private Integer guamt;
    /**
     * 已弃用字段
     */
    private Integer jbamt;
    /**
     * 上月水量
     */
    private Integer upwaterreal;
    /**
     * 上月余额（未使用）
     */
    private BigDecimal prerest;
    /**
     * 本月余额（未使用）
     */
    private BigDecimal nextrest;
    /**
     * 合计金额（首次金额，暂未使用）
     */
    private BigDecimal paytotal0;
    /**
     * 预存抵扣金额（暂未使用）
     */
    private BigDecimal paybyimprest;
    /**
     * 预存扣费所属年月（暂未使用）
     */
    private BigDecimal imprestym;
    /**
     * 二阶水量
     */
    private Integer water2;
    /**
     * 二阶水费
     */
    private BigDecimal pay2;
    /**
     * 三阶水量
     */
    private Integer water3;
    /**
     * 三阶水费
     */
    private BigDecimal pay3;
    /**
     * 旧表止度（旧表换表读数）
     */
    private Integer oldend;
    /**
     * 新表起度（新表始抄读数）
     */
    private Integer newbegin;
    /**
     * 锁定标志（用于部分提交）
     */
    private Integer locked;
    /**
     * 初始化日期
     */
    private Date createdtime;
    /**
     * 预存余额
     */
    private BigDecimal imprestbalance;
    /**
     * 未缴费月数
     */
    private Integer latemonths;
    /**
     * 未缴费金额（不含违约金）
     */
    private BigDecimal latefee0;
    /**
     * 应缴费金额（未缴费金额减去预存余额的不含违约金）
     */
    private BigDecimal latefee;
    /**
     * 未知1
     */
    private Integer waterbranch10;
    /**
     * 未知2
     */
    private Integer waterbranch1derated;
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCyear() {
        return cyear;
    }

    public void setCyear(Integer cyear) {
        this.cyear = cyear;
    }

    public Integer getCmonth() {
        return cmonth;
    }

    public void setCmonth(Integer cmonth) {
        this.cmonth = cmonth;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr == null ? null : useraddr.trim();
    }

    public Byte getPrjid1() {
        return prjid1;
    }

    public void setPrjid1(Byte prjid1) {
        this.prjid1 = prjid1;
    }

    public Byte getPrjid2() {
        return prjid2;
    }

    public void setPrjid2(Byte prjid2) {
        this.prjid2 = prjid2;
    }

    public Byte getPrjid3() {
        return prjid3;
    }

    public void setPrjid3(Byte prjid3) {
        this.prjid3 = prjid3;
    }

    public Byte getPrjid4() {
        return prjid4;
    }

    public void setPrjid4(Byte prjid4) {
        this.prjid4 = prjid4;
    }

    public Byte getPrjid5() {
        return prjid5;
    }

    public void setPrjid5(Byte prjid5) {
        this.prjid5 = prjid5;
    }

    public String getPrjlv() {
        return prjlv;
    }

    public void setPrjlv(String prjlv) {
        this.prjlv = prjlv == null ? null : prjlv.trim();
    }

    public Byte getAdd1flag() {
        return add1flag;
    }

    public void setAdd1flag(Byte add1flag) {
        this.add1flag = add1flag;
    }

    public Byte getAdd2flag() {
        return add2flag;
    }

    public void setAdd2flag(Byte add2flag) {
        this.add2flag = add2flag;
    }

    public Byte getAdd3flag() {
        return add3flag;
    }

    public void setAdd3flag(Byte add3flag) {
        this.add3flag = add3flag;
    }

    public Byte getAdd4flag() {
        return add4flag;
    }

    public void setAdd4flag(Byte add4flag) {
        this.add4flag = add4flag;
    }

    public Byte getAdd5flag() {
        return add5flag;
    }

    public void setAdd5flag(Byte add5flag) {
        this.add5flag = add5flag;
    }

    public Integer getPlanwater() {
        return planwater;
    }

    public void setPlanwater(Integer planwater) {
        this.planwater = planwater;
    }

    public Integer getDuanno() {
        return duanno;
    }

    public void setDuanno(Integer duanno) {
        this.duanno = duanno;
    }

    public Integer getOrderno() {
        return orderno;
    }

    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    public Integer getWaterbegin() {
        return waterbegin;
    }

    public void setWaterbegin(Integer waterbegin) {
        this.waterbegin = waterbegin;
    }

    public Integer getWaterend() {
        return waterend;
    }

    public void setWaterend(Integer waterend) {
        this.waterend = waterend;
    }

    public Integer getWateravg() {
        return wateravg;
    }

    public void setWateravg(Integer wateravg) {
        this.wateravg = wateravg;
    }

    public Integer getPriorwatersum() {
        return priorwatersum;
    }

    public void setPriorwatersum(Integer priorwatersum) {
        this.priorwatersum = priorwatersum;
    }

    public Integer getPriorwatersumadjusted() {
        return priorwatersumadjusted;
    }

    public void setPriorwatersumadjusted(Integer priorwatersumadjusted) {
        this.priorwatersumadjusted = priorwatersumadjusted;
    }

    public Integer getWateramount0() {
        return wateramount0;
    }

    public void setWateramount0(Integer wateramount0) {
        this.wateramount0 = wateramount0;
    }

    public Integer getWaterreal() {
        return waterreal;
    }

    public void setWaterreal(Integer waterreal) {
        this.waterreal = waterreal;
    }

    public Integer getCurrentwatersum() {
        return currentwatersum;
    }

    public void setCurrentwatersum(Integer currentwatersum) {
        this.currentwatersum = currentwatersum;
    }

    public Integer getCurrentwatersumadjusted() {
        return currentwatersumadjusted;
    }

    public void setCurrentwatersumadjusted(Integer currentwatersumadjusted) {
        this.currentwatersumadjusted = currentwatersumadjusted;
    }

    public Integer getWaterbranch10() {
        return waterbranch10;
    }

    public void setWaterbranch10(Integer waterbranch10) {
        this.waterbranch10 = waterbranch10;
    }

    public Integer getWaterprj1() {
        return waterprj1;
    }

    public void setWaterprj1(Integer waterprj1) {
        this.waterprj1 = waterprj1;
    }

    public Integer getWaterbranch1derated() {
        return waterbranch1derated;
    }

    public void setWaterbranch1derated(Integer waterbranch1derated) {
        this.waterbranch1derated = waterbranch1derated;
    }

    public Integer getWaterprj2() {
        return waterprj2;
    }

    public void setWaterprj2(Integer waterprj2) {
        this.waterprj2 = waterprj2;
    }

    public Integer getWaterprj3() {
        return waterprj3;
    }

    public void setWaterprj3(Integer waterprj3) {
        this.waterprj3 = waterprj3;
    }

    public Integer getWaterprj4() {
        return waterprj4;
    }

    public void setWaterprj4(Integer waterprj4) {
        this.waterprj4 = waterprj4;
    }

    public Integer getWaterprj5() {
        return waterprj5;
    }

    public void setWaterprj5(Integer waterprj5) {
        this.waterprj5 = waterprj5;
    }

    public Integer getWatercjh() {
        return watercjh;
    }

    public void setWatercjh(Integer watercjh) {
        this.watercjh = watercjh;
    }

    public Short getWatercjhlv() {
        return watercjhlv;
    }

    public void setWatercjhlv(Short watercjhlv) {
        this.watercjhlv = watercjhlv;
    }

    public Byte getPrjflag() {
        return prjflag;
    }

    public void setPrjflag(Byte prjflag) {
        this.prjflag = prjflag;
    }

    public Short getWaterflag() {
        return waterflag;
    }

    public void setWaterflag(Short waterflag) {
        this.waterflag = waterflag;
    }

    public Integer getAudi() {
        return audi;
    }

    public void setAudi(Integer audi) {
        this.audi = audi;
    }

    public Short getSbkj() {
        return sbkj;
    }

    public void setSbkj(Short sbkj) {
        this.sbkj = sbkj;
    }

    public Byte getPaytype() {
        return paytype;
    }

    public void setPaytype(Byte paytype) {
        this.paytype = paytype;
    }

    public Integer getCopyId() {
        return copyId;
    }

    public void setCopyId(Integer copyId) {
        this.copyId = copyId;
    }

    public Integer getAudiId() {
        return audiId;
    }

    public void setAudiId(Integer audiId) {
        this.audiId = audiId;
    }

    public Byte getWarnFlag() {
        return warnFlag;
    }

    public void setWarnFlag(Byte warnFlag) {
        this.warnFlag = warnFlag;
    }

    public String getCopyremark() {
        return copyremark;
    }

    public void setCopyremark(String copyremark) {
        this.copyremark = copyremark == null ? null : copyremark.trim();
    }

    public Byte getPrintremarkflag() {
        return printremarkflag;
    }

    public void setPrintremarkflag(Byte printremarkflag) {
        this.printremarkflag = printremarkflag;
    }

    public Byte getImprestflag() {
        return imprestflag;
    }

    public void setImprestflag(Byte imprestflag) {
        this.imprestflag = imprestflag;
    }

    public BigDecimal getPayprj1() {
        return payprj1;
    }

    public void setPayprj1(BigDecimal payprj1) {
        this.payprj1 = payprj1;
    }

    public BigDecimal getPayprj2() {
        return payprj2;
    }

    public void setPayprj2(BigDecimal payprj2) {
        this.payprj2 = payprj2;
    }

    public BigDecimal getPayprj3() {
        return payprj3;
    }

    public void setPayprj3(BigDecimal payprj3) {
        this.payprj3 = payprj3;
    }

    public BigDecimal getPayprj4() {
        return payprj4;
    }

    public void setPayprj4(BigDecimal payprj4) {
        this.payprj4 = payprj4;
    }

    public BigDecimal getPayprj5() {
        return payprj5;
    }

    public void setPayprj5(BigDecimal payprj5) {
        this.payprj5 = payprj5;
    }

    public BigDecimal getPayadd1() {
        return payadd1;
    }

    public void setPayadd1(BigDecimal payadd1) {
        this.payadd1 = payadd1;
    }

    public BigDecimal getPayadd2() {
        return payadd2;
    }

    public void setPayadd2(BigDecimal payadd2) {
        this.payadd2 = payadd2;
    }

    public BigDecimal getPayadd3() {
        return payadd3;
    }

    public void setPayadd3(BigDecimal payadd3) {
        this.payadd3 = payadd3;
    }

    public BigDecimal getPayadd4() {
        return payadd4;
    }

    public void setPayadd4(BigDecimal payadd4) {
        this.payadd4 = payadd4;
    }

    public BigDecimal getPayadd5() {
        return payadd5;
    }

    public void setPayadd5(BigDecimal payadd5) {
        this.payadd5 = payadd5;
    }

    public BigDecimal getPaycjh() {
        return paycjh;
    }

    public void setPaycjh(BigDecimal paycjh) {
        this.paycjh = paycjh;
    }

    public BigDecimal getPaytotal() {
        return paytotal;
    }

    public void setPaytotal(BigDecimal paytotal) {
        this.paytotal = paytotal;
    }

    public String getPayup() {
        return payup;
    }

    public void setPayup(String payup) {
        this.payup = payup == null ? null : payup.trim();
    }

    public Integer getBasicamt() {
        return basicamt;
    }

    public void setBasicamt(Integer basicamt) {
        this.basicamt = basicamt;
    }

    public Integer getCopyamt() {
        return copyamt;
    }

    public void setCopyamt(Integer copyamt) {
        this.copyamt = copyamt;
    }

    public Integer getByamt() {
        return byamt;
    }

    public void setByamt(Integer byamt) {
        this.byamt = byamt;
    }

    public Integer getGuamt() {
        return guamt;
    }

    public void setGuamt(Integer guamt) {
        this.guamt = guamt;
    }

    public Integer getJbamt() {
        return jbamt;
    }

    public void setJbamt(Integer jbamt) {
        this.jbamt = jbamt;
    }

    public Integer getUpwaterreal() {
        return upwaterreal;
    }

    public void setUpwaterreal(Integer upwaterreal) {
        this.upwaterreal = upwaterreal;
    }

    public BigDecimal getPrerest() {
        return prerest;
    }

    public void setPrerest(BigDecimal prerest) {
        this.prerest = prerest;
    }

    public BigDecimal getNextrest() {
        return nextrest;
    }

    public void setNextrest(BigDecimal nextrest) {
        this.nextrest = nextrest;
    }

    public BigDecimal getPaytotal0() {
        return paytotal0;
    }

    public void setPaytotal0(BigDecimal paytotal0) {
        this.paytotal0 = paytotal0;
    }

    public BigDecimal getPaybyimprest() {
        return paybyimprest;
    }

    public void setPaybyimprest(BigDecimal paybyimprest) {
        this.paybyimprest = paybyimprest;
    }

    public BigDecimal getImprestym() {
        return imprestym;
    }

    public void setImprestym(BigDecimal imprestym) {
        this.imprestym = imprestym;
    }

    public Integer getWater2() {
        return water2;
    }

    public void setWater2(Integer water2) {
        this.water2 = water2;
    }

    public BigDecimal getPay2() {
        return pay2;
    }

    public void setPay2(BigDecimal pay2) {
        this.pay2 = pay2;
    }

    public Integer getWater3() {
        return water3;
    }

    public void setWater3(Integer water3) {
        this.water3 = water3;
    }

    public BigDecimal getPay3() {
        return pay3;
    }

    public void setPay3(BigDecimal pay3) {
        this.pay3 = pay3;
    }

    public Integer getOldend() {
        return oldend;
    }

    public void setOldend(Integer oldend) {
        this.oldend = oldend;
    }

    public Integer getNewbegin() {
        return newbegin;
    }

    public void setNewbegin(Integer newbegin) {
        this.newbegin = newbegin;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public BigDecimal getImprestbalance() {
        return imprestbalance;
    }

    public void setImprestbalance(BigDecimal imprestbalance) {
        this.imprestbalance = imprestbalance;
    }

    public Integer getLatemonths() {
        return latemonths;
    }

    public void setLatemonths(Integer latemonths) {
        this.latemonths = latemonths;
    }

    public BigDecimal getLatefee0() {
        return latefee0;
    }

    public void setLatefee0(BigDecimal latefee0) {
        this.latefee0 = latefee0;
    }

    public BigDecimal getLatefee() {
        return latefee;
    }

    public void setLatefee(BigDecimal latefee) {
        this.latefee = latefee;
    }
}