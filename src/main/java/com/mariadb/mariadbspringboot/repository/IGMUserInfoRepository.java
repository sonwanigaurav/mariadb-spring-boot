package com.mariadb.mariadbspringboot.repository;


import com.mariadb.mariadbspringboot.domain.IGMUserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGMUserInfoRepository extends CrudRepository<IGMUserEntity, Long> {
}
