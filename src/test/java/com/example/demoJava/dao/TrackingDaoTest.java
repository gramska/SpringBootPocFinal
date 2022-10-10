//package com.example.demoJava.dao;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.demoJava.models.TrackingModel;
//import com.google.cloud.firestore.Firestore;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
////@RunWith(MockitoJUnitRunner.class)
////@ExtendWith(MockitoExtension.class)
//class TrackingDaoTest {
//
//	@Autowired
//	TrackingDao trackingDao;
//
//	@Autowired
//	Firestore firestore;
//
//	@Test
//	void testGetAll() {
//		List<TrackingModel> response;
//		try {
//			response = trackingDao.getAll();
//			Assert.assertNotNull(response);
//		} catch (final Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test
//	void testsaveTracking() throws Exception {
//		final TrackingModel model = new TrackingModel();
//		model.setId("MbFyixxbHETremTEy5bH");
//		model.setAppointmentId("1234567900");
//		model.setName("Magno");
//		model.setLastName("Perez Perez");
//		model.setMail("magno@gmail.com");
//		final String response = trackingDao.save(model);
//		Assert.assertNotNull(response);
//
//	}
//
//	@Test
//	void testUpdateTracking() throws Exception {
//		final TrackingModel model = new TrackingModel();
//		model.setId("MbFyixxbHETremTEy5bH");
//		model.setAppointmentId("1234567900");
//		model.setName("Magno malo");
//		model.setLastName("Perez Perez");
//		model.setMail("magno@gmail.com");
//		final String response = trackingDao.save(model, model.getId());
//		Assert.assertNotNull(response);
//
//	}
//
//}
