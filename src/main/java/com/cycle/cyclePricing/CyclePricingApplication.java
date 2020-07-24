package com.cycle.cyclePricing;

import com.cycle.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.concurrent.*;

@SpringBootApplication
public class CyclePricingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyclePricingApplication.class, args);
		BlockingQueue<Bicycle> sharedQueue = new LinkedBlockingQueue<>();

		ExecutorService pes = Executors.newFixedThreadPool(10);
		ExecutorService ces = Executors.newFixedThreadPool(10);
        for(int i = 1; i <= 10; i++) {
			pes.submit(new Producer(sharedQueue, i));
			ces.submit(new Consumer(sharedQueue, i));
		}
        pes.shutdown();
        ces.shutdown();
	}
}
