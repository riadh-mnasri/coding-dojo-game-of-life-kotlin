package com.codingdojo.kotlin

import org.assertj.core.api.Assertions
import org.junit.Test

class GameOfLifeTest {

    @Test
    fun `should cell with fewer than 2 neighbour die`(){
        val gameOfLife = GameOfLife()
        Assertions.assertThat(gameOfLife.nexGeneration(arrayOf("*", ".", "."))).isEqualTo(arrayOf(".", ".", "."))
    }

}
