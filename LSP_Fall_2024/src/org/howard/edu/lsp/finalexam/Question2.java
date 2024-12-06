package org.howard.edu.lsp.finalexam;
import java.util.Random;

public class Question2 {
	
	public interface RandomNumberStrategy {
	    int generateRandomNumber();
	}
	
	public class RandomNumberUsingJavaRandom implements RandomNumberStrategy {
	    private Random random;
	    public RandomNumberUsingJavaRandom() {
	        this.random = new Random();
	    }
	    @Override
	    public int generateRandomNumber() {
	        return random.nextInt(Integer.MAX_VALUE); // Generates a positive integer
	    }
	}
	
	public class RandomNumberUsingLCG implements RandomNumberStrategy {
	    private long seed;
	    public RandomNumberUsingLCG(long seed) {
	        this.seed = seed;
	    }
	    @Override
	    public int generateRandomNumber() {
	        final long a = 1664525;
	        final long c = 1013904223;
	        final long m = (1L << 32); // 2^32
	        seed = (a * seed + c) % m;
	        return (int) (seed & Integer.MAX_VALUE); // Generate a positive integer
	    }
	}
	
	
	public class RandomNumberService {
	    private static RandomNumberService instance;
	    private RandomNumberStrategy strategy;
	    private RandomNumberService() {
	        this.strategy = new RandomNumberUsingJavaRandom();
	    }
	    public static RandomNumberService getInstance() {
	        if (instance == null) {
	            instance = new RandomNumberService();
	        }
	        return instance;
	    }
	    public void setStrategy(RandomNumberStrategy strategy) {
	        this.strategy = strategy;
	    }
	    public int generateRandomNumber() {
	        return strategy.generateRandomNumber();
	    }
	}
	
	public class RandomNumberClient {
	    public static void main(String[] args) {
	        RandomNumberService service = RandomNumberService.getInstance();
	        service.setStrategy(new RandomNumberUsingJavaRandom());
	        System.out.println("Random number using Java's Random: " + service.generateRandomNumber());
	        service.setStrategy(new RandomNumberUsingLCG(System.currentTimeMillis()));
	        System.out.println("Random number using LCG: " + service.generateRandomNumber());
	    }
	}

}
