package com.phpbae.jpa_demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "parent")
@Entity
@DiscriminatorValue("MENU")
public class MenuLeaf extends Menu implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private MenuComposite parent;
}
