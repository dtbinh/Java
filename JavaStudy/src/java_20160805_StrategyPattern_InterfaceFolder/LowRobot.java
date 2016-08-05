package java_20160805_StrategyPattern_InterfaceFolder;

public class LowRobot extends Robot{

	// constructor
	public LowRobot() {

		this.fly = new FlyNo();
		this.missile = new MissileNo();
		this.knife = new KnifeNo();
		
	}

	@Override
	public void shape() {
		System.out.println("싼로봇임");
		
	}
	
}
