package com.team766.frc2020.procedures;
import com.team766.framework.Procedure;
import com.team766.framework.Context;

public class DriveSquare extends Procedure {

	public void run(Context context){

		for(int i = 0; i < 4; i++){

			new DriveStraight().run(context);
			
			new TurnRight().run(context);
		}
	}
	
}