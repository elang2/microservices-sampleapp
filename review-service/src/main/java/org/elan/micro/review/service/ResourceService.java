package org.elan.micro.review.service;

import java.awt.List;

import org.elan.micro.common.proto.review.ReviewProtoBuff;

public interface ResourceService {
	
	List getReviewsByItemId(Long itemId);
	
	void saveReview(ReviewProtoBuff review);
}
