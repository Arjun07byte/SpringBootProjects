package com.arjun.FirstSpringWeb.repository;

import com.arjun.FirstSpringWeb.models.SomeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<SomeData, Integer> { }
