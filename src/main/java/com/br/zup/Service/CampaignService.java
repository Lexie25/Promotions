package com.br.zup.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.br.zup.Models.Campaign;
import com.br.zup.Models.Establishment;
import com.br.zup.Repositories.CampaignRepository;
import com.br.zup.exceptions.CampaignNoFoundException;
import com.br.zup.exceptions.EstablishmentNoFoundException;

@Service

public class CampaignService {
	@Autowired
	private CampaignRepository campaignRepository;

	public  Iterable<Campaign> showAllCampaign() {
		return campaignRepository.findAll();
	}
	public Campaign getCampaingById (int id) {
		return campaignRepository.findById(id).get();

	}

	public void saveCampaign(Campaign campaign) {
		campaignRepository.save(campaign);
	}
	public void updateCampaign(int id,Campaign campaign) {
		
		Optional<Campaign> opitonalCampaign = campaignRepository.findById(id);
		
		if(!opitonalCampaign.isPresent()) {
			throw new CampaignNoFoundException("There are no messages with this id");
		
		}
		
		campaign.setId(id);
		campaignRepository.save(campaign);
	}
	
	public void deleteCampaign(int id) {
	
		try {
			campaignRepository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new CampaignNoFoundException("There are no messages with this id");
		}
	}
	
	public long numberOfCampaign() {
		return campaignRepository.count();
	}
}