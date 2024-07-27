package com.example.blogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {
}
