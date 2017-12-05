package io.github.teammatrix.model;

import java.util.HashMap;
import java.util.Map;

public class Device {

	Map<String, String> attributes = new HashMap<String, String>();
	private String deviceId;

	private String lattitude;

	private String longitude;

	private String name;

	public Device() {
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public String getLattitude() {
		return lattitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getName() {
		return name;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setName(String name) {
		this.name = name;
	}
}