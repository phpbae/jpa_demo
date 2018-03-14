package com.phpbae.jpa_demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class MenuSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_setting_idx")
    private int menuSettingIdx;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_idx")
    private Menu menu;

}
