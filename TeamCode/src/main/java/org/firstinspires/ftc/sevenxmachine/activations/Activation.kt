package org.firstinspires.ftc.sevenxmachine.activations

interface Activation {

    fun setaAtivacao(activated: Boolean, curva: Boolean) // Passa informaçoes ao hardware.

    fun retornaAtivacao(): Boolean // Retorna se o hardware, esta ativado ou nao.

    fun ativa(curva: Boolean) // Tenta ativar o hardware.

    fun desativa() // Tenta desativar o hardware




}