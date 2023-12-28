package com.smart.system;

public class SmartLight extends SmartHomeDevice{
	
	// SmartLight의 생성자
	public SmartLight(String deviceName) {
		super(deviceName);
	}
	@Override // 상속받은 SmartHomeDevice 의 추상메서드 구현
	public void connectToWifi(String wifiName) {
		System.out.println("wifiName : " + wifiName);
	}
	// SmartLight의 메소드
	public void adjustBrightness(int level) {
		System.out.println("setting Bright : " + level);
	}

}
