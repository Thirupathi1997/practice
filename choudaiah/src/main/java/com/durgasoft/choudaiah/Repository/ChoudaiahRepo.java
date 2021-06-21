package com.durgasoft.choudaiah.Repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durgasoft.choudaiah.entity.Choudaiah;

public interface ChoudaiahRepo extends JpaRepository<Choudaiah,Long> {

}
