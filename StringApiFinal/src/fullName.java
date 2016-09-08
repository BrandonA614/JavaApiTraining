import java.util.Scanner;

public class fullName
	{
			static int vowelCounter;
			static int i;
			final static String vowels = "aeiouy";
			
		public static void main(String[] args)
			{
				
				System.out.println("Please input a name!");
				Scanner nextInput = new Scanner(System.in);
				String word = nextInput.nextLine();
				boolean findVowel = true;
				
				while(findVowel == true){
					
					System.out.println(word.indexOf('a'));
					break;
				
					
					
					
					 for(int i=0;i <word.length();i++){
				          if((word.indexOf('a'))
				           ||(word.indexOf('e'))
				           ||(word.indexOf('i'))
				           ||(word.indexOf('o'))
				           ||(word.indexOf('u'))){
				        	   
				        	   System.out.println(word.indexOf(i));
				            	findVowel = false;

					
			
				            }										
					 }
				}
			}
	}
		
	