package com.acessibilityguide.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acessibilityguide.api.dto.VoteDTO;
import com.acessibilityguide.api.model.GuideUser;
import com.acessibilityguide.api.model.Marker;
import com.acessibilityguide.api.model.MarkerVote;
import com.acessibilityguide.api.model.VoteType;
import com.acessibilityguide.api.model.query.QGuideUser;
import com.acessibilityguide.api.model.query.QMarker;
import com.acessibilityguide.api.model.query.QMarkerVote;

@Service
public class MarkerService extends AbstractCRUDService<Marker> {

	@Autowired
	private GeoLocationService geoLocationService;
	
	@Override
	public Marker save(Marker marker) {
		String fullAddress = geoLocationService.findFullAddress(marker.getLatitude(), marker.getLongitude());
		marker.setCompleteAddress(fullAddress);
		marker.setVotes(0);
		return super.save(marker);
	}
	
	@Override
	public Marker findById(Long id) {
		return new QMarker().id.eq(id).findUnique();
	}

	@Override
	public List<Marker> findAll() {
		return new QMarker().findList();
	}

	public Marker applyVote(VoteDTO vote) {
		MarkerVote markerVote = new QMarkerVote().and()
					.marker.id.eq(vote.getMarkerId())
					.user.username.eq(vote.getUsername())
				.endAnd().findUnique();
		if(markerVote == null){
			GuideUser user = new QGuideUser().username.eq(vote.getUsername()).findUnique();
			Marker marker = new QMarker().id.eq(vote.getMarkerId()).findUnique();
			markerVote = new MarkerVote();
			markerVote.setUser(user);
			markerVote.setMarker(marker);
			markerVote.setVoteType(vote.getVoteType());
			markerVote.save();
			addVote(marker, vote.getVoteType(), 1);
		}else{
			if(!markerVote.getVoteType().equals(vote.getVoteType())){
				markerVote.setVoteType(vote.getVoteType());
				markerVote.update();
				addVote(markerVote.getMarker(), vote.getVoteType(), 2);
			}
		}
		return markerVote.getMarker();
	}

	private void addVote(Marker marker, VoteType voteType, Integer count) {
		if(voteType.equals(VoteType.UP)){
			marker.sumVote(count);
		}else{
			marker.sumVote(-count);
		}
		marker.update();
	}

}
