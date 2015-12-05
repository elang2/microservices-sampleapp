package org.elan.micro.review.service;

import java.awt.List;

public interface ResourceService {
	
	List getReviewsByItemId(Long itemId);
	
}
