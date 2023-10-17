package com.br.mscourse.hrworker.repositories;

import com.br.mscourse.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
