package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name; //회원명

    @Embedded
    private Address address; //주소

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
