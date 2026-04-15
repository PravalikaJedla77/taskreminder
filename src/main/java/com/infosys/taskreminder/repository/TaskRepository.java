package com.infosys.taskreminder.repository;

import com.infosys.taskreminder.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}