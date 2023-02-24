package com.educandoweb.course.repositories;

import com.educandoweb.course.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.educandoweb.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
