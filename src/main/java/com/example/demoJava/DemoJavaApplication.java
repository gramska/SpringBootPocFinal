package com.example.demoJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demoJava.dao.TrackingDao;
import com.example.demoJava.dao.UserRepo;
import com.example.demoJava.models.TrackingModel;
import com.example.demoJava.models.User;


@SpringBootApplication
public class DemoJavaApplication implements ApplicationRunner {

	@Autowired
	TrackingDao trackingDao;

	@Autowired
	private UserRepo userRepo;

	@Autowired
	PasswordEncoder encoder;

	public static void main(final String[] args) {
		SpringApplication.run(DemoJavaApplication.class, args);
	}

	@Override
	public void run(final ApplicationArguments args) throws Exception {
		final TrackingModel model = new TrackingModel();

		model.setAppointmentId("1234567900");
		model.setName("Magno");
		model.setLastName("Perez Perez");
		model.setMail("magno@gmail.com");
		model.setPhoneNumber("5555555555");
		model.setTransportType("torton");
		model.setCompanyName("tres guerras");
		model.setState("OK");
		model.setLatitude("19.4183168");
		model.setLongitude("-99.155968");
		trackingDao.save(model);

	}

}
