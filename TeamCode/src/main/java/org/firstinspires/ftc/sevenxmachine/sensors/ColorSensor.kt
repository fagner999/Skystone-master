package org.firstinspires.ftc.sevenxmachine.sensors

import com.qualcomm.robotcore.hardware.NormalizedColorSensor

class ColorSensor : Sensor{
    private lateinit var valorTratado: String
    public lateinit var sensorColor: NormalizedColorSensor // Sensor que vai ser utilizado.
    private lateinit var rgb: Array<Double>

    fun recebeLeitura(sensorColor: NormalizedColorSensor, rgb: Array<Double>) { // Recebe a leitura do sensor.
        this.sensorColor = sensorColor
        this.rgb = rgb

        // log
    }

    override fun retornaLeitura(): String { // Retorna a leitura do sensor
        return valorTratado
    }

    override fun trata(valorDestratado: Double) {
        if (rgb[0] > rgb[1] && rgb[0] > rgb[2]) { // Se vermelho for maior do que azul e verde
            this.valorTratado =  "vermelho"
        } else if (rgb[1] > rgb[0] && rgb[1] > rgb[2]) { // Se o verde for maior do que o vermelho e azul
            this.valorTratado = "verde"
        } else { // Caso contrario
            this.valorTratado = "azul"
        }

        // log
    }


}