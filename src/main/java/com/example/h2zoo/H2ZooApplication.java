package com.example.h2zoo;

import com.example.h2zoo.model.*;
import com.example.h2zoo.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);
		BirdRepository birdRepository =
				configurableApplicationContext.getBean(BirdRepository.class);
		FishRepository fishRepository =
				configurableApplicationContext.getBean(FishRepository.class);

		Reptile kingCobra = new Reptile("Slither", "Snake", "Black & Yellow", "Carnivore");
		Reptile iguana = new Reptile("Lia", "Lizard", "Green", "Omnivore");
		Reptile boxTurtle = new Reptile("Kelly", "Turtle", "Brown", "Herbivore");
		reptileRepository.saveAll(List.of(kingCobra, iguana, boxTurtle));

		Bird parakeet = new Bird("Jill", "Parrot", true, "Vertical Straight");
		Bird goldFinch = new Bird("Sunny", "Finch", true, "Horizontal Straight");
		Bird fairyPenguin = new Bird("Max", "Penguin", false, "Horizontal Straight");
		birdRepository.saveAll(List.of(parakeet, goldFinch, fairyPenguin));

		Fish dogFish = new Fish("Pal", "Shark", "Saltwater", 35.0);
		Fish atlanticSalmon = new Fish("Gary", "Salmon", "Freshwater", 13.0);
		Fish seahorse = new Fish("Spots", "Seahorse", "Saltwater", 5);
		fishRepository.saveAll(List.of(dogFish, atlanticSalmon, seahorse));
	}

}
