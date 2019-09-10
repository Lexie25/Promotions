package com.br.zup.Controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.zup.Models.Campaign;
import com.br.zup.Service.CampaignService;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

	@Autowired
	private CampaignService campaignService;

	@GetMapping("/campaign")
	public ResponseEntity<?> getCampaign(){
		if(campaignService.numberOfCampaign()>0) {
			return ResponseEntity.ok(campaignService.numberOfCampaign());
		}
		return ResponseEntity.noContent().build();
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> getCampaign(@PathVariable int id){
		try {
			Campaign campaign = campaignService.getCampaingById(id);
			return ResponseEntity.ok(campaign);
		}
		catch(Exception e){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	@PostMapping
	public ResponseEntity<?> addCamapign(@Valid @RequestBody Campaign campaign){
		try {
			campaignService.savecampaign(campaign);
			return ResponseEntity.status(HttpStatus.CREATED).body(campaign);
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?>updateEstablishment(@PathVariable int id,@Valid @RequestBody Campaign campaign){

		campaignService.updateCampaign(id, campaign);
		return ResponseEntity.ok(campaign);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCampaign(@PathVariable int id){
		campaignService.deleteCampaign(id);
		return ResponseEntity.ok().build();
	}
}