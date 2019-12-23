package com.br.zup.Controller;

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
import com.br.zup.Models.RegisterEstablishmentRequest;
import com.br.zup.Models.UserAdmin;
import com.br.zup.Service.CampaignService;
import com.br.zup.Service.UserAdminService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Api rest campaign")
@RestController
@RequestMapping("establishment/campaign")
public class CampaignController {

	@Autowired
	private CampaignService campaignService;
	@Autowired
	private UserAdminService userAdminService;

	@GetMapping
	public ResponseEntity showAllCampign() {
		return ResponseEntity.ok(campaignService.showAllCampaign());
	}

	@ApiOperation(value="get a campaign by Id")
	@GetMapping("/{id}")
	public ResponseEntity<?> getCampaign(@PathVariable int id,@RequestBody RegisterEstablishmentRequest registerEstablishmentRequest){
		UserAdmin userAuthorized = userAdminService.getUserAdminById(registerEstablishmentRequest.user.getIdUser());
		if(userAuthorized.isAdmin()) {
			try {
				Campaign campaign = campaignService.getCampaingById(id);
				return ResponseEntity.ok(campaign);
			}
			catch(Exception e){
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}	

	@ApiOperation(value="add a campaign")
	@PostMapping
	public ResponseEntity<?> addCamapign( @RequestBody RegisterEstablishmentRequest registerEstablishmentRequest){
		UserAdmin userAuthorized = userAdminService.getUserAdminById(registerEstablishmentRequest.user.getIdUser());
		if(userAuthorized.isAdmin()) {
			campaignService.saveCampaign(registerEstablishmentRequest.campaign);
			return ResponseEntity.status(HttpStatus.CREATED).body(registerEstablishmentRequest.campaign);
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}	
	@ApiOperation(value="update a campaign")
	@PutMapping("/{id}")
	public ResponseEntity<?>updateEstablishment(@PathVariable int id,@RequestBody RegisterEstablishmentRequest registerEstablishmentRequest){
		UserAdmin userAuthorized = userAdminService.getUserAdminById(registerEstablishmentRequest.user.getIdUser());
		if(userAuthorized.isAdmin()) {

			campaignService.updateCampaign(id,registerEstablishmentRequest.campaign);
			return ResponseEntity.ok(registerEstablishmentRequest.campaign);
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}

	@ApiOperation(value="delete a campaign")
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCampaign(@PathVariable int id ,@RequestBody RegisterEstablishmentRequest registerEstablishmentRequest){
		UserAdmin userAuthorized = userAdminService.getUserAdminById(registerEstablishmentRequest.user.getIdUser());
		if(userAuthorized.isAdmin()) {
			campaignService.deleteCampaign(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}
}