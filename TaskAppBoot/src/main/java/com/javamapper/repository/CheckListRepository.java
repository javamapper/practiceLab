package com.javamapper.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javamapper.beans.CheckList;
import com.javamapper.beans.CheckListID;

@Repository
public interface CheckListRepository extends JpaRepository<CheckList, CheckListID> {
	  Optional<CheckList> findByTodoId(Long taskId); 
}
