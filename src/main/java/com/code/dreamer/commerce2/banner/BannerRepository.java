package com.code.dreamer.commerce2.banner;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends MongoRepository<Banner, String> {
}
