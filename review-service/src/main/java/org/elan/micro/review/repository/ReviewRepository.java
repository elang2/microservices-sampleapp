package org.elan.micro.review.repository;

import java.awt.List;

import org.elan.micro.review.model.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review,Long> {
	
	@Query("from Review r where r.itemId = ?")
	List findReviewsByItemId(Long itemId);
	
}
