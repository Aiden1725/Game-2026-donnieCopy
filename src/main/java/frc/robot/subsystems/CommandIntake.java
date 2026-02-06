package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class CommandIntake extends SubsystemBase {
  TalonFX m_motor = new TalonFX(Constants.Intake.Motor_ID);

  public void setSpeed(double speed) {
    m_motor.set(speed);
  }

}
