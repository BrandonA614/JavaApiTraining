import java.util.Scanner;
import java.util.*;
public class fullName
	{
			static int vowelCounter;
			static int i;
			final static String vowels = "aeiouy";
			
		public static void main(String[] args)
			{
			
				findFirstVowel();
				
//				System.out.println("Please input a name!");
//				Scanner nextInput = new Scanner(System.in);
//				String word = nextInput.nextLine();
//				boolean findVowel = true;
//				
//				while(findVowel == true){										
//				
//					
//					//A Parameters
//				          if((word.indexOf('a') <= word.indexOf('e') || word.indexOf('a') <= word.indexOf('i') || word.indexOf('a') <=
//				        		  word.indexOf('o') || word.indexOf('a') <= word.indexOf('u')  )){
//					        	System.out.println(word.lastIndexOf('a'));
//					        	
//				    //E Parameters	        	
//				          }else if((word.indexOf('e') <= word.indexOf('a') || word.indexOf('e') <= word.indexOf('i') || word.indexOf('a') <=
//				        		  word.indexOf('o') || word.indexOf('a') <= word.indexOf('u')  )){
//				        	  	System.out.println(word.lastIndexOf('e'));
//				        	  	
//				   //I Parameters
//				          }else if((word.indexOf('i') <= word.indexOf('a') || word.indexOf('i') <= word.indexOf('e') || word.indexOf('i') <=
//				        		  word.indexOf('o') || word.indexOf('i') <= word.indexOf('u')  )){
//				        	  	System.out.println(word.lastIndexOf('i'));
//				        	  	
//				     //O Parameters
//				          }else if((word.indexOf('o') <= word.indexOf('e') || word.indexOf('o') <= word.indexOf('i') || word.indexOf('o') <=
//				        		  word.indexOf('a') || word.indexOf('i') <= word.indexOf('u')  )){
//				        	  	System.out.println(word.lastIndexOf('o'));
//				        	  	
//				        	  	
//				    //U Parameters
//				          }else if((word.indexOf('u') <= word.indexOf('e') || word.indexOf('u') <= word.indexOf('i') || word.indexOf('u') <=
//				        		  word.indexOf('o') || word.indexOf('u') <= word.indexOf('a')  )){
//				        	  	System.out.println(word.lastIndexOf('u'));
//				        	  	
//				          }
//				        	
//				        	
//				        	}										
					 }
		
		public static String findFirstVowel()
		{
			System.out.println("Please input a name!");
			Scanner nextInput = new Scanner(System.in);
			String word = nextInput.nextLine();
			String firstVowel = word.substring(i,i+1);
			
			for(int i = 0; i < word.length(); i++)
				{
					switch(word.substring(i,i+1)){
						case "a":
						case "e":
						case "i":
						case "o":
						case "u":
						case "y":
					}
							
								
					
					
				}
			return firstVowel;
			
			System.out.println(lastIndexOf(firstVowel));
		}
				}
		
	