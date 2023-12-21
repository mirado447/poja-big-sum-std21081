package com.poja.bigSum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.poja.bigSum.PojaGenerated;
import com.poja.bigSum.repository.model.Dummy;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

    @Override
    List<Dummy> findAll();
}
