package com.smart.system;

public abstract class SmartHomeDevice implements SmartDevice{
	
	private String deviceName; // device 이름 필드

	// SmartHomeDevice 생성자
	public SmartHomeDevice(String deviceName){
		System.out.println("device Name : " + deviceName);
	}
	
	// device 필드의 캡슐화
	public String getDeviceName() {
		return deviceName;
	}
	// device 필드의 캡슐화
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	@Override // 인터페이스 SmartDeviec 구현 
	public void turnOn() {
		System.out.println("device ON");
	}
	@Override // 인터페이스 SmartDeviec 구현
	public void turnOff() {
		System.out.println("device Off");
	}
	// 추상메서드 정의
	public abstract void connectToWifi(String wifiName);
	
	
}
