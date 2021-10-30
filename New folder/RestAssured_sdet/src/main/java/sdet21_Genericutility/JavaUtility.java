package sdet21_Genericutility;

import java.util.Random;

/**
   * This class has generic methods related java library
   * @author Mani Prasad Sahu
   *
   */
public class JavaUtility {
	
	public int getRandomNumber()
	{
		Random ran=new Random();
		int random=ran.nextInt(100);
		return random;
	}

}
