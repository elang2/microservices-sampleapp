package org.elan.micro.review.service.impl;

import java.awt.List;

import org.elan.micro.common.proto.review.ReviewProtoBuff;
import org.elan.micro.review.repository.ReviewRepository;
import org.elan.micro.review.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	ReviewRepository reviewRepo;
	
	
	@Override
	public List getReviewsByItemId(Long itemId) {
		return reviewRepo.findReviewsByItemId(itemId);
	}


	@Override
	public void saveReview(ReviewProtoBuff review) {
		// TODO Auto-generated method stub
		
	}

}
