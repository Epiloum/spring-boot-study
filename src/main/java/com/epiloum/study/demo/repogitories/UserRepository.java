package com.epiloum.study.demo.repogitories;

import com.epiloum.study.demo.entities.UserEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<UserEntity, Long> {
}
