package com.diudiustudio.failureproductmanagementsystem.repository.user;

import com.diudiustudio.failureproductmanagementsystem.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Created by sakya on 2015/10/29.
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<User, Long> {
    Collection<User> findByName(@Param("name") String name);
}
