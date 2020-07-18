package com.imc;

import com.imc.players.Computer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Simulation {

    @Test
    void simulationTest() {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        Game.playGame(computer1, computer2, 100);
    }

}