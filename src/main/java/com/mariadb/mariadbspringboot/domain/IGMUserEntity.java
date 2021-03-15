package com.mariadb.mariadbspringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "igm_user_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IGMUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "email_id")
    Long emailId;

    String country;

    @Builder.Default
    @Column(name = "created_at")
    Date createdAt = new Date();

    @UpdateTimestamp
    @Builder.Default
    @Column(name = "updated_at")
    Date updatedAt = new Date();
}
