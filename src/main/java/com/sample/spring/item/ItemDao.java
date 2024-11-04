package com.sample.spring.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {

}
