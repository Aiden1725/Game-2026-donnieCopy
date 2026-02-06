package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class CommandClimber extends SubsystemBase {
    private final TalonFX climberMotor = new TalonFX(Constants.Climber.Motor_ID);

    public void setSpeed(double speed) {
        climberMotor.set(speed * Constants.Climber.GEARBOX_RATIO);
    }
}