package io.github.teammatrix.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.teammatrix.model.Device;
import io.github.teammatrix.service.DeviceService;

@RestController
@RequestMapping("/rest/v1/api")
public class DeviceController {
	@Autowired
	private DeviceService deviceService;

	@GetMapping(value = "/device")
	public List<Device> getEmployeeNames() {
		return deviceService.getDevices();
	}
}
