package com.songqingchao.entity;

import java.math.BigDecimal;

/**
 * @user candy
 * 2021/6/1317:15
 */
public class PingFen {
    private Integer uId = 0;
    private Integer nId = 0;
    private BigDecimal pingFen= BigDecimal.ZERO;
    private String studentName = "";

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public BigDecimal getPingFen() {
        return pingFen;
    }

    public void setPingFen(BigDecimal pingFen) {
        this.pingFen = pingFen;
    }
}
