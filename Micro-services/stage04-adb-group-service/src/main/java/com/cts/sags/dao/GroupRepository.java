package com.cts.sags.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.sags.entity.GroupEntity;
@Repository
public interface GroupRepository extends JpaRepository<GroupEntity,String> {

}
