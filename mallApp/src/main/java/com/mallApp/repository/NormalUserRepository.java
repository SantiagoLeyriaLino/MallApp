package com.mallApp.repository;

import com.mallApp.entity.NormalUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NormalUserRepository extends JpaRepository<NormalUser, Long> {
}
