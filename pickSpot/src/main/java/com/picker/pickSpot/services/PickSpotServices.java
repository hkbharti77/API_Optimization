package com.picker.pickSpot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.picker.pickSpot.dto.Container;
import com.picker.pickSpot.dto.PickRequest;
import com.picker.pickSpot.dto.PickResponse;
import com.picker.pickSpot.dto.YardSlot;


@Service
public class PickSpotServices {
	
	public static final int INVALID =  10_000;
	
	public PickResponse pickBestSpot(PickRequest request) {
		
		Container c = request.getContainer();
		
		List<YardSlot> map = request.getYardMap();
		
		int minScore = Integer.MAX_VALUE;
		YardSlot bestSlot = null;
		
		for(YardSlot  ys : map) {
			
			int distance = Math.abs(c.getX() - ys.getX()) + Math.abs(c.getY() - ys.getY());
			int sizePenality = (c.getSize().equals("big") && ys.getSizeCap().equals("small")) ? INVALID : 0;
			int coldPanelity = (c.isNeedsCold() && !ys.isHasColdUnit()) ? INVALID : 0;
			int occPalelty = ys.isHasOccupied() ? INVALID : 0;
			
			int score = distance + sizePenality + coldPanelity + occPalelty;
			
			if(score < minScore) {
				minScore = score;
				bestSlot = ys;
			}
			
		}
		
		if(minScore >= INVALID) {
			return new PickResponse("no suitable slot");
		}
		
		
		return new PickResponse(c.getId(), bestSlot.getX(), bestSlot.getY());
		
	}

}
