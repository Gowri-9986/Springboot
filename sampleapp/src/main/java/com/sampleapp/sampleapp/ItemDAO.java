package com.sampleapp.sampleapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ItemDAO extends JpaRepository<Item,Integer>{

}
