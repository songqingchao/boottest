package com.songqingchao.entity;

import java.math.BigDecimal;

/**
 * @user candy
 * 2021/6/1317:15
 */
public class PingFen {
    private Integer uid = 0;
    private Integer nid = 0;
    private BigDecimal pingFen= BigDecimal.ZERO;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public BigDecimal getPingFen() {
        return pingFen;
    }

    public void setPingFen(BigDecimal pingFen) {
        this.pingFen = pingFen;
    }
}
