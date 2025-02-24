package item;

public class StarGame {
	
	Unit[] units = new Unit[100];
	int cnt;
	
	public void newUnit(Unit u) {
		
	}
	
	public void move(int x, int y) {
		for(int i=0; i<cnt; i++) {
			units[i].setX(x);
			units[i].setY(y);
			units[i].move();
		}
	}
	
	public void stop() {
		for(int i=0; i<cnt; i++) {
			units[i].stop();
		}
	}
	
	public void attckMarine() {
		for(int i=0; i<cnt; i++) {
			if(units[i] instanceof Marine) {
				Marine marine = (Marine)units[i];
				marine.stimPack();
			}
		}
	}
	
	public void attckTank() {
		for(int i=0; i<cnt; i++) {
			if(units[i] instanceof Tank) {
				Tank tank = (Tank)units[i];
				tank.changeMode();
				//((Tank).units[i]).changeMode();
			}
		}
	}
	
	public void UnLoadDropship() {
		for(int i=0; i<cnt; i++) {
			if(units[i] instanceof Dropship) {
				Dropship ds = (Dropship)units[i];
				ds.unload();
				//((Dropship).units[i]).unload();
			}
		}
	}
	
	public void LoadDropship() {
		for(int i=0; i<cnt; i++) {
			if(units[i] instanceof Dropship) {
				Dropship ds = (Dropship)units[i];
				ds.load();
				//((Dropship).units[i]).load();
			}
		}
	}	

	public static void main(String[] args) {
		Marine marine1 = new Marine();
		Tank tank1 = new Tank();
		Dropship dropship1 = new Dropship();
		Tank tank2 = new Tank();
		Marine marine2 = new Marine();
		Tank tank3 = new Tank();
		SCV scv1 = new SCV();
		Dropship dropship2 = new Dropship();
		SCV scv2 = new SCV();
		
		
		StarGame sg = new StarGame();
		sg.newUnit(marine1);
		sg.newUnit(tank1);
		sg.newUnit(dropship1);
		sg.newUnit(tank2);
		sg.newUnit(marine2);
		sg.newUnit(tank3);
		sg.newUnit(scv1);
		sg.newUnit(dropship2);
		sg.newUnit(scv2);
		
		sg.move(100, 200);
		sg.stop();
		
		sg.attckMarine();
		sg.attckTank();
		sg.LoadDropship();
		sg.UnLoadDropship();
	
//		scv1.repair(marine1); marine은 repair가 불가하도록 함;
		scv1.repair(tank1);
		scv1.repair(dropship1);
		scv1.repair(scv2);
	}
}
//걸어서 이동하고 있다.
//바퀴로 굴러서 이동하고 있다.
//날아서 이동하고 있다.
//걸어서 이동하고 있다.
//Marine : (100,200)에 멈추다
//Tank : (100,200)에 멈추다
//DropShip : (100,200)에 멈추다
//Marine : (100,200)에 멈추다
