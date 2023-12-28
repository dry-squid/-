추상화에대해 이해하는 과제 해결

문제: 추상화

문제 설명
당신은 스마트 홈 제어 시스템을 위한 소프트웨어를 개발하고 있습니다. 이 시스템은 다양한 유형의 스마트 기기들을 제어할 수 있어야 합니다. 각 기기는 고유한 기능을 가지고 있지만, 일부 공통된 기능들도 있습니다.



요구 사항
- 인터페이스 SmartDevice 생성:
모든 스마트 기기가 구현해야 할 기본 메서드 turnOn()과 turnOff()를 정의합니다.
- 추상 클래스 SmartHomeDevice 구현:
SmartDevice 인터페이스를 구현합니다.
공통 필드로 deviceName (문자열)을 가집니다.
추상 메서드 connectToWifi(String wifiName)를 정의합니다.
- 서브클래스 SmartLight와 SmartThermostat 구현:
SmartLight 클래스는 SmartHomeDevice를 상속받고, 추가 메서드 adjustBrightness(int level)을 가집니다.
SmartThermostat 클래스는 SmartHomeDevice를 상속받고, 추가 메서드 setTemperature(int temperature)을 가집니다.
각 서브클래스는 모든 추상 메서드를 구현합니다.
- 메인 메서드 구현:
Main 클래스에 public static void main(String[] args) 메서드를 구현합니다.
이 메서드 내에서 SmartLight와 SmartThermostat 객체를 생성하고, 각각의 메서드를 호출합니다.



퀴즈 목표

이 퀴즈의 목적은 추상 클래스와 인터페이스를 사용하여 복잡한 상속 구조를 구현하고, 다형성 및 캡슐화 원칙을 적용하는 것입니다. 또한, 클래스 간의 관계를 설계하고 구현하는 능력을 평가하는 데에도 도움이 됩니다. 
