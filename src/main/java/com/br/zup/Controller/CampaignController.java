package com.br.zup.Controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Api rest campaign")
//@CrossOrigin("*")
@RestController
@RequestMapping("admin/campaign")
public class CampaignController {

	@Autowired
	private CampaignService campaignService;
	
	@GetMapping
	public ResponseEntity showAllCampign() {
		return ResponseEntity.ok(campaignService.showAllCampaign());
	}

	@ApiOperation(value="get a campaign by Id")
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

	@ApiOperation(value="add a campaign")
	@PostMapping
	public ResponseEntity<?> addCamapign(@Valid @RequestBody Campaign campaign){
			campaignService.saveCampaign(campaign);
			return ResponseEntity.status(HttpStatus.CREATED).body(campaign);
	}
	@ApiOperation(value="update a campaign")
	@PutMapping("/{id}")
	public ResponseEntity<?>updateEstablishment(@PathVariable int id,@Valid @RequestBody Campaign campaign){

		campaignService.updateCampaign(id, campaign);
		return ResponseEntity.ok(campaign);
	}
	@ApiOperation(value="delete a campaign")
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCampaign(@PathVariable int id){
		campaignService.deleteCampaign(id);
		return ResponseEntity.ok().build();
	}
}