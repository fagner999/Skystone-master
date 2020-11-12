package org.firstinspires.ftc.sevenxmachine.storeExecute

class guardaMovimentos {
    private var array = arrayOf<Array<Int>>() // Inicializa uma array bi-dimensional

    fun zeraArray(): Array<Array<Int>> { // Preenche todos os valores da array para "0"
        for (i in 0..9) { // Percorre, definindo tamanho dela.
            var subarray = arrayOf<Int>()
            for (j in 0..3) {
                subarray += 0
            }
            array += subarray
        }
        
        return array // Retorna a array, zerada
    }

    fun preencheArray(m: Array<Array<Int>>, p1: Int, p2: Int, p3: Int, p4: Int) { // p1 e p3 = motor, p2 e p4 = força.
        for (i in m.indices) { // Percorre a array via indices
            for (j in m[i].indices) {
                if (m[i][j] == 0) { // Se a o 1° valor da linha é vazia, o resto também vai ser.
                    m[i][j] = p1
                    m[i][1] = p2
                    m[i][2] = p3
                    m[i][3] = p4
                    break // Sai do loop
                }
            }
        }
    }
}