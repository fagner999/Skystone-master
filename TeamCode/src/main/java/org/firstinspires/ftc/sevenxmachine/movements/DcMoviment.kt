package org.firstinspires.ftc.sevenxmachine.movements

import com.qualcomm.robotcore.hardware.DcMotor
import java.lang.Thread.sleep


public class DcMoviment {

    private var classeMotor: org.firstinspires.ftc.sevenxmachine.activations.MotorActivation = org.firstinspires.ftc.sevenxmachine.activations.MotorActivation()

    public fun frente(motor: DcMotor, motor2: DcMotor, power: Double, tempo: Long) {
        classeMotor.recebeMotor(motor, motor2, power, false) // Passa os dados para o motor
        classeMotor.ativa(false) // Confirma a ativação do motor
        sleep(tempo)
        classeMotor.desativa()
    }
    public fun tras(motor: DcMotor, motor2: DcMotor, power: Double, tempo: Long, curva: Boolean) {
        classeMotor.recebeMotor(motor, motor2, -power, false)
        classeMotor.ativa(false)
        sleep(tempo)
        classeMotor.desativa()
    }
    public fun esquerda(motor: DcMotor, motor2: DcMotor, power: Double, tempo: Long) {
        classeMotor.recebeMotor(motor, motor2, -power, true)
        classeMotor.ativa(true)
        sleep(tempo)
        classeMotor.desativa()
    }
    public fun direita(motor: DcMotor, motor2: DcMotor, power: Double, tempo: Long) {
        classeMotor.recebeMotor(motor, motor2, power, true)
        classeMotor.ativa(true)
        sleep(tempo)
        classeMotor.desativa()
    }

}