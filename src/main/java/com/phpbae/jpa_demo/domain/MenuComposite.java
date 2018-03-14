package com.phpbae.jpa_demo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = "getChild")
@EqualsAndHashCode(exclude = "getChild")
@DiscriminatorValue("FOLD")
public class MenuComposite extends Menu implements Serializable {

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, targetEntity = MenuLeaf.class, fetch = FetchType.LAZY)
    private List<Menu> child = new ArrayList<>();

    public List<Menu> getChild() {
        return child;
    }
}
