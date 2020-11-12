package org.firstinspires.ftc.sevenxmachine.sensors

interface Sensor {
    fun retornaLeitura(): String // Vai retornar o valor cujo o sensor vai ler.

    fun trata(value: Double) // Vai tentar tratar a leitura do sensor, para algo mais agradavel.

}