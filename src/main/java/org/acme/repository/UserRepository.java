package org.acme.repository;

import org.acme.domain.user.UserEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

public class UserRepository implements PanacheRepositoryBase<UserEntity, Long> {

}
