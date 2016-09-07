import java.util.Scanner;

public class fullName
	{
			static int vowelCounter;
			static int i;
			
		public static void main(String[] args)
			{
				
				System.out.println("Please input a name!");
				Scanner nextInput = new Scanner(System.in);
				String word = nextInput.nextLine();
				boolean findVowel = false;
				
				while(findVowel){
					
					 for(int i=0;i <word.length();i++){
				          if((word.indexOf(word) == 'a')
				           ||(word.indexOf(word) == 'e')
				           ||(word.indexOf(word) == 'i')
				           ||(word.indexOf(word) == 'o')
				           ||(word.indexOf(word) == 'u')){
				        	   
//				        	   System.out.println(word.indexOf(i));
				            	findVowel = true;

					
			
				            }
				            
				            
				 }
					
				}
				System.out.println(word.indexOf());
			
			 }
		}