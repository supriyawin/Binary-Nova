package application.rest.patient;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.rest.doctor.Doctor;
import io.swagger.annotations.ApiModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApiModel(description="Apis Related to Patients")
@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientservice;

	@PostMapping("/savepatient")
	public void savePatient(@RequestBody Patient c) {
		patientservice.savePatient(c);
	}
	
	@PutMapping("/editPatient")
	public Patient editPatient(@RequestBody Patient p) {
		return patientservice.editPatient(p);
	}

	@GetMapping("/getallpatient")
	public List<Patient> getAllPatient()
	// TODO change return type
	{
		return patientservice.getAllPatient();

	}
	
	@RequestMapping(path = "/getmyToken/{phone}", method = RequestMethod.GET)
	public int getAvailableDoctors(@PathVariable String phone) {
		log.info("Request to login get token by patiend..."+phone);
		return patientservice.getMyToken(phone);
	}
	
	
	
	@PostMapping("/loginPatient")
	public String loginCon(@RequestBody Patient c) {
		log.info("Request to login API... \n ph number" + c.getPhoneNumber() + " \n name" + c.getName());
		String st = patientservice.getPatient(c.getName(), c.getPhoneNumber());
		return st;

	}
}
