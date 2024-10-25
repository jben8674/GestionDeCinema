package com.bengonohugues.auth_service.repository;

import com.bengonohugues.auth_service.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}