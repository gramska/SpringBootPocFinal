package com.example.demoJava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJava.dao.TrackingDao;
import com.example.demoJava.models.TrackingModel;

@Service
public class TrackingService {

	@Autowired
	TrackingDao trackingDao;

	public List<TrackingModel> listTracking() {
		final List<TrackingModel> response = trackingDao.findAll();
		return response;

	}

	public TrackingModel getTracking(final String id) {
		return trackingDao.findById(id).get();
	}

	public TrackingModel saveTracking(final TrackingModel trackingModel) throws Exception {
		final TrackingModel model = trackingDao.save(trackingModel);
		return model;
	}

	public TrackingModel updateTracking(final TrackingModel trackingModel, final String id) throws Exception {
		if (trackingDao.findById(id).isPresent()) {
			return trackingDao.save(trackingModel);
		} else {
			throw new Exception();
		}

	}

	public void deleteTracking(final String id) throws Exception {
		trackingDao.delete(trackingDao.findById(id).get());
	}

}
