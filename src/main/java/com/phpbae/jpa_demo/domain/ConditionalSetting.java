package com.phpbae.jpa_demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ConditionalSetting extends MenuSetting {

    private Integer year;
    private Integer kPartIdx;
    private Integer pNo;
    private Integer pNoDepth;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "conditional_setting_grade", joinColumns = @JoinColumn(name = "menu_setting_idx"))
    private List<String> gradeIdx;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "conditional_setting_christening", joinColumns = @JoinColumn(name = "menu_setting_idx"))
    private List<String> christeningIdx;
    private String gender;
    private Integer minAge;
    private Integer maxAge;
    private String etc1;
    private String etc2;
    private String etc3;
    private String etc4;
    private String etc5;
    private String etc6;
    private String etc7;
    private String etc8;
    private String etc9;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "isName", column = @Column(name = "list_is_name")),
            @AttributeOverride(name = "isGrade", column = @Column(name = "list_is_grade")),
            @AttributeOverride(name = "isPhone", column = @Column(name = "list_is_phone")),
            @AttributeOverride(name = "isBirth", column = @Column(name = "list_is_birth")),
            @AttributeOverride(name = "isGroup", column = @Column(name = "list_is_group")),
            @AttributeOverride(name = "isAddress", column = @Column(name = "list_is_address")),
            @AttributeOverride(name = "isFamily", column = @Column(name = "list_is_family")),
            @AttributeOverride(name = "isCarType", column = @Column(name = "list_is_car_type")),
            @AttributeOverride(name = "isCarNum", column = @Column(name = "list_is_car_num")),
            @AttributeOverride(name = "isEtc1", column = @Column(name = "list_is_etc1")),
            @AttributeOverride(name = "isEtc2", column = @Column(name = "list_is_etc2")),
            @AttributeOverride(name = "isEtc3", column = @Column(name = "list_is_etc3")),
            @AttributeOverride(name = "isEtc4", column = @Column(name = "list_is_etc4")),
            @AttributeOverride(name = "isEtc5", column = @Column(name = "list_is_etc5")),
            @AttributeOverride(name = "isEtc6", column = @Column(name = "list_is_etc6")),
            @AttributeOverride(name = "isEtc7", column = @Column(name = "list_is_etc7")),
            @AttributeOverride(name = "isEtc8", column = @Column(name = "list_is_etc8")),
            @AttributeOverride(name = "isEtc9", column = @Column(name = "list_is_etc9"))
    })
    private DisplayItems listDisplayItems;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "isName", column = @Column(name = "detail_is_name")),
            @AttributeOverride(name = "isGrade", column = @Column(name = "detail_is_grade")),
            @AttributeOverride(name = "isPhone", column = @Column(name = "detail_is_phone")),
            @AttributeOverride(name = "isBirth", column = @Column(name = "detail_is_birth")),
            @AttributeOverride(name = "isGroup", column = @Column(name = "detail_is_group")),
            @AttributeOverride(name = "isAddress", column = @Column(name = "detail_is_address")),
            @AttributeOverride(name = "isFamily", column = @Column(name = "detail_is_family")),
            @AttributeOverride(name = "isCarType", column = @Column(name = "detail_is_car_type")),
            @AttributeOverride(name = "isCarNum", column = @Column(name = "detail_is_car_num")),
            @AttributeOverride(name = "isEtc1", column = @Column(name = "detail_is_etc1")),
            @AttributeOverride(name = "isEtc2", column = @Column(name = "detail_is_etc2")),
            @AttributeOverride(name = "isEtc3", column = @Column(name = "detail_is_etc3")),
            @AttributeOverride(name = "isEtc4", column = @Column(name = "detail_is_etc4")),
            @AttributeOverride(name = "isEtc5", column = @Column(name = "detail_is_etc5")),
            @AttributeOverride(name = "isEtc6", column = @Column(name = "detail_is_etc6")),
            @AttributeOverride(name = "isEtc7", column = @Column(name = "detail_is_etc7")),
            @AttributeOverride(name = "isEtc8", column = @Column(name = "detail_is_etc8")),
            @AttributeOverride(name = "isEtc9", column = @Column(name = "detail_is_etc9"))
    })
    private DisplayItems detailDisplayItems;

    @Enumerated(EnumType.STRING)
    private Ordering ordering;

    @Enumerated(EnumType.STRING)
    private Ordering ordering2;

    @Enumerated(EnumType.STRING)
    private Grouping grouping;

    private boolean isDisplayCouple = false;
}
