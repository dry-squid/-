package com.smart.system;


public class Main {

	public static void main(String[] args) {
		// 생성자에게 전달될 값을 정의함
		String ligth = "전등";
		String thermostat = "보일러";
		String wifiName = "301_wifi";
		
		// SmartLight의 객체 를 생성
		SmartLight sl1 = new SmartLight(ligth);
		
		sl1.turnOn(); // 인터페이스
		sl1.connectToWifi(wifiName); // 추상메서드
		sl1.adjustBrightness(1); // 자체메서드
		sl1.turnOff(); // 인터페이스
		
		// SmartThermostat의 객체를 생성
		SmartThermostat st1 = new SmartThermostat(thermostat);
		
		st1.turnOn(); //인터페이스
		st1.connectToWifi(wifiName); // 추상메서드
		st1.setTemperature(30); // 자체메서드
		st1.turnOff(); // 인터페이스
		
		
	}

}
