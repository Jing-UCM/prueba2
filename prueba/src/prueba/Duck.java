package prueba;

import FlyBehaviour.IFlyBehaviour;
import QuackBehaviour.IQuackBehaviour;

public abstract class Duck {
	
	IFlyBehaviour flyBehaviour;
	IQuackBehaviour quackBehaviour;

	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	

}
