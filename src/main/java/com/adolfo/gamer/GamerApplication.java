package com.adolfo.gamer;

import com.adolfo.gamer.game.GameRunner;
import com.adolfo.gamer.game.MarioGame;
import com.adolfo.gamer.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GamerApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(GamerApplication.class, args);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.runGame();
	}

}
