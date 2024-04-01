package com.mallApp.repository;

import com.mallApp.entity.Valuation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValuationRepository extends JpaRepository<Valuation, Long> {
}
