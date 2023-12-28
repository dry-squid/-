package com.smart.system;

public class SmartThermostat extends SmartHomeDevice{

	// SmartThermostat의 생성자
	public SmartThermostat(String deviceName) {
		super(deviceName);
	}
	@Override // 상속받은 SmartHomeDevice 의 구현
	public void connectToWifi(String wifiName) {
		System.out.println("wifiName : " + wifiName);
	}
	// SmartThermostat의 메소드
	public void setTemperature(int temperature) {
		System.out.println("setting Temperature : " + temperature);
	}

	
	
	

}
