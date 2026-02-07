package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class CommandIntake extends SubsystemBase {
  TalonFX m_hinge_motor = new TalonFX(Constants.Intake.Moter_ID);
  TalonFX m_intake_motor = new TalonFX(Constants.Intake.Hinge_Moter_ID);

  public void setSpeed(double speed) {
    m_intake_motor.set(speed);
  }

  // public void runIntake() {
  //   m_motor.set(0.8);
  // }

  // public void stopIntake() {
  //   m_motor.set(0.0);
  // }
}
