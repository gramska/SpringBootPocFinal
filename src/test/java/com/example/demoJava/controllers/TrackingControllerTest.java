package com.example.demoJava.controllers;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demoJava.models.TrackingModel;
import com.example.demoJava.service.TrackingService;

@RunWith(MockitoJUnitRunner.Silent.class)
@ExtendWith(MockitoExtension.class)
class TrackingControllerTest {

	@InjectMocks
	TrackingController trackingController;

	@Mock
	TrackingService trackingService;

	@Test
	void testGetAllService() {
		try {
			final List<TrackingModel> responseService = new ArrayList<>();
			final TrackingModel model = new TrackingModel();
			model.setId("MbFyixxbHETremTEy5bH");
			model.setAppointmentId("1234567900");
			model.setName("Magno");
			model.setLastName("Perez Perez");
			model.setMail("magno@gmail.com");
			responseService.add(model);
			Mockito.when(trackingService.listTracking()).thenReturn(responseService);
			final List<TrackingModel> response = trackingController.listTracking();
			Assert.assertNotNull(response);

		} catch (final Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	void testGetService() {
		try {
			final TrackingModel model = new TrackingModel();
			model.setId("MbFyixxbHETremTEy5bH");
			model.setAppointmentId("1234567900");
			model.setName("Magno");
			model.setLastName("Perez Perez");
			model.setMail("magno@gmail.com");
			Mockito.when(trackingService.getTracking(Mockito.anyString())).thenReturn(model);
			final TrackingModel response = trackingController.getTracking(Mockito.anyString());
			Assert.assertNotNull(response);

		} catch (final Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	void testCreaateService() {
		try {
			final TrackingModel model = new TrackingModel();
			model.setId("MbFyixxbHETremTEy5bH");
			model.setAppointmentId("1234567900");
			model.setName("Magno");
			model.setLastName("Perez Perez");
			model.setMail("magno@gmail.com");
			Mockito.when(trackingService.saveTracking(model)).thenReturn(model);
			final TrackingModel response = trackingController.saveTracking(model);
			Assert.assertNotNull(response);

		} catch (final Exception e) {
			e.printStackTrace();
		}

	}
}
