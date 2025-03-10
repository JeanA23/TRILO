package com.trotti.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trotti.api.models.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long>{

}
