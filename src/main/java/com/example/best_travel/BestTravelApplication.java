package com.example.best_travel;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestTravelApplication {

	public static void main(String[] args) {
		//Dotenv dotenv = Dotenv.configure().load();
		// Cargar archivo .env manualmente
		Dotenv dotenv = Dotenv.configure().filename(".env").load();

		// Opcional: Imprime para verificar si las variables están cargadas
		System.out.println("DB_USERNAME: " + dotenv.get("DB_USERNAME"));
		System.out.println("DB_PASSWORD: " + dotenv.get("DB_PASSWORD"));

		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

		SpringApplication.run(BestTravelApplication.class, args);
		System.out.println("Best travel application is running");
	}

}
