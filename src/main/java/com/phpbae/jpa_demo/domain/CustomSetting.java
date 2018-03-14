package com.phpbae.jpa_demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("CUST")
public class CustomSetting extends MenuSetting{

    private String contents;
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "custom_setting_image_path", joinColumns = @JoinColumn(name = "menu_setting_idx"))
    private List<String> originalResourcePath;
}
