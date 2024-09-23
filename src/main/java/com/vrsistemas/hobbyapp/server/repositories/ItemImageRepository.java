package com.vrsistemas.hobbyapp.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vrsistemas.hobbyapp.server.domain.ItemImage;

@Repository
public interface ItemImageRepository extends JpaRepository<ItemImage, Integer>{

}
