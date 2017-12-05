package io.github.teammatrix.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.github.teammatrix.model.Device;
import io.github.teammatrix.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService {

	private static final List<Device> devices = new ArrayList<>();

	static {
		Device device1 = new Device();
		device1.setDeviceId("deviceId1");
		device1.setLongitude("77.59456269999998");
		device1.setLattitude("12.9715987");
		device1.setName("MahendraRedmi");
		devices.add(device1);
		Device device2 = new Device();
		device2.setDeviceId("deviceId2");
		device2.setLongitude("75.59456269999998");
		device2.setLattitude("22.9715987");
		device2.setName("SurajMoto");
		devices.add(device2);
	}

	@Override
	public List<Device> getDevices() {
		return devices;
	}

}
