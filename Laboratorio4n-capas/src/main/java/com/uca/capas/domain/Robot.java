package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {

	
	@AssertTrue(message="UPS no puedes agregar tu producto porque eres un robot, favor hacer click en regresar")
	private Boolean soyRobot;

	
	
	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Robot(Boolean soyRobot) {
		super();
		this.soyRobot = soyRobot;
	}



	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	
}
