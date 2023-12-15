package com.ll.medium.domain.member.role.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.medium.domain.member.role.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
