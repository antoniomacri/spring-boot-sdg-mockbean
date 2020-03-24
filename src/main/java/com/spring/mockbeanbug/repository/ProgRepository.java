package com.spring.mockbeanbug.repository;

import com.spring.mockbeanbug.entity.Prog;
import org.springframework.data.gemfire.mapping.annotation.Region;
import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.stereotype.Repository;

@Repository
@Region("/prog")
public interface ProgRepository extends GemfireRepository<Prog, String> {
}
