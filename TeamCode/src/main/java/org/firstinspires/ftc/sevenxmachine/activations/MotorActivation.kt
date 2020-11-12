package org.firstinspires.ftc.sevenxmachine.activations

import com.qualcomm.robotcore.hardware.DcMotor
import kotlin.properties.Delegates


public class MotorActivation : Activation{

    private var motorAtivo: Boolean = false // Define se o motor vai iniciar ativo ou nao.
    public lateinit var motor: DcMotor // Motor que vai ser ativado.
    public lateinit var motor2: DcMotor // Segundo motor
    private var forcaAtivada by Delegates.notNull<Double>() // Força que sera aplicada ao motor, quando ele for ativado.
    private var forcaCurva by Delegates.notNull<Double>()

    fun recebeMotor(motor: DcMotor, motor2: DcMotor, forcaAtivada: Double, curva: Boolean) {
        // Recebe força do motor
        if (curva == true) {
            this.motor = motor
            this.motor2 = motor2
            this.forcaAtivada = forcaAtivada
            this.forcaCurva = forcaAtivada * -1
        } else {
            this.motor = motor
            this.motor2 = motor2
            this.forcaAtivada = forcaAtivada
        }


        // log
    }

    override fun setaAtivacao(ativado: Boolean, curva: Boolean) { // Envia as informaçoes da ativaçao para o motor.
        this.motorAtivo = ativado
        if (ativado == true) {
            if (curva == true) {
                motor.power = forcaAtivada
                motor2.power = forcaCurva
            } else {
                motor.power = forcaAtivada
                motor2.power = forcaAtivada
            }
        } else {
            motor.power = 0.0
            motor2.power = 0.0
        }


        // log
    }

    override fun retornaAtivacao(): Boolean { // Retorna se o motor esta ativo ou nao.

        // log
        return motorAtivo
    }

    override fun ativa(curva: Boolean) { // Ativa motor
        setaAtivacao(true, curva)
        // log
    }

    override fun desativa() { // Desativa motor
        setaAtivacao(false, false)
        // log
    }




}