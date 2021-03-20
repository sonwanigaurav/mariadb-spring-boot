package com.mariadb.mariadbspringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "igm_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IGMUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "email_id")
    String emailId;

    @Column(name = "iso_country_code")
    String isoCountryCode;

    @Builder.Default
    @Column(name = "createdAt")
    Date createdAt = new Date();

    @UpdateTimestamp
    @Builder.Default
    @Column(name = "updatedAt")
    Date updatedAt = new Date();
}
