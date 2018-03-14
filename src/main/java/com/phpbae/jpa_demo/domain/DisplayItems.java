package com.phpbae.jpa_demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DisplayItems {

    private boolean isName = false;
    private boolean isGrade = false;
    private boolean isPhone = false;
    private boolean isBirth = false;
    private boolean isGroup = false;
    private boolean isAddress = false;
    private boolean isFamily = false;
    private boolean isCarType = false;
    private boolean isCarNum = false;
    private boolean isEtc1 = false;
    private boolean isEtc2 = false;
    private boolean isEtc3 = false;
    private boolean isEtc4 = false;
    private boolean isEtc5 = false;
    private boolean isEtc6 = false;
    private boolean isEtc7 = false;
    private boolean isEtc8 = false;
    private boolean isEtc9 = false;


    public DisplayItems(boolean isName, boolean isGrade, boolean isPhone) {
        this.isName = isName;
        this.isGrade = isGrade;
        this.isPhone = isPhone;
    }

    public void setIsName(boolean isName) {
        this.isName = isName;
    }

    public void setIsGrade(boolean isGrade) {
        this.isGrade = isGrade;
    }

    public void setIsPhone(boolean isPhone) {
        this.isPhone = isPhone;
    }

    public void setIsBirth(boolean isBirth) {
        this.isBirth = isBirth;
    }

    public void setIsGroup(boolean isGroup) {
        this.isGroup = isGroup;
    }

    public void setIsAddress(boolean isAddress) {
        this.isAddress = isAddress;
    }

    public void setIsFamily(boolean isFamily) {
        this.isFamily = isFamily;
    }

    public void setIsCarType(boolean isCarType) {
        this.isCarType = isCarType;
    }

    public void setIsCarNum(boolean isCarNum) {
        this.isCarNum = isCarNum;
    }

    public void setIsEtc1(boolean isEtc1) {
        this.isEtc1 = isEtc1;
    }

    public void setIsEtc2(boolean isEtc2) {
        this.isEtc2 = isEtc2;
    }

    public void setIsEtc3(boolean isEtc3) {
        this.isEtc3 = isEtc3;
    }

    public void setIsEtc4(boolean isEtc4) {
        this.isEtc4 = isEtc4;
    }

    public void setIsEtc5(boolean isEtc5) {
        this.isEtc5 = isEtc5;
    }

    public void setIsEtc6(boolean isEtc6) {
        this.isEtc6 = isEtc6;
    }

    public void setIsEtc7(boolean isEtc7) {
        this.isEtc7 = isEtc7;
    }

    public void setIsEtc8(boolean isEtc8) {
        this.isEtc8 = isEtc8;
    }

    public void setIsEtc9(boolean isEtc9) {
        this.isEtc9 = isEtc9;
    }

}
