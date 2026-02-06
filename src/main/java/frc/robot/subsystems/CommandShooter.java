package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class CommandShooter extends SubsystemBase {
  TalonFX x44_motor_1 = new TalonFX(Constants.Shooter.Motor_ID_1);
  TalonFX x44_motor_2 = new TalonFX(Constants.Shooter.Motor_ID_2);


  public void setSpeed(double speed) {
    x44_motor_1.set(speed);
    x44_motor_2.set(-speed);
  }


}
