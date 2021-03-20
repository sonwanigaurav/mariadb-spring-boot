package com.mariadb.mariadbspringboot.application;

import com.mariadb.mariadbspringboot.domain.IGMUserEntity;
import com.mariadb.mariadbspringboot.repository.IGMUserInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final IGMUserInfoRepository igmUserInfoRepository;

    public UserService(IGMUserInfoRepository igmUserInfoRepository) {
        this.igmUserInfoRepository = igmUserInfoRepository;
    }

    public IGMUserEntity createOrUpdateIGMUser(final IGMUserEntity igmUserEntity) {
        try {
            return igmUserInfoRepository.save(igmUserEntity);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public IGMUserEntity getUserById(final Long id) {
        try {
            Optional<IGMUserEntity> optionalIGMUserEntity = igmUserInfoRepository.findById(id);
            return optionalIGMUserEntity.get();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
