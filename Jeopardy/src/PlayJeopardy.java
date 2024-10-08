import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PlayJeopardy
	{
		
		   static int playerScore = 0;
		   static  boolean playingTwo = true;
		   static  boolean playingOne = true;
		   static String[][]values ={{"100","100","100","100","100","200","200","200","200","200","300","300","300","300","300","400","400","400","400","400","500","500","500","500","500"}};
		   static String[][]values2 ={{"200","200","200","200","200","400","400","400","400","400","600","600","600","600","600","800","800","800","800","800","1000","1000","1000","1000","1000"}};
		   static int counter = 0;
		  
		  public static void main(String[] args) 
		  {
		  
		    Data.fillJeopardyOne();
		    Data.fillJeopardyTwo();
		    
		    introduceOne();
		    prepareBoardOne();
		    while(playingOne)
		      {
		        displayBoardOne();
		        playerMoveOne();
		      }
		    
		    introduceTwo();
		    prepareBoardTwo();
		    while(playingTwo)
		       {
		         displayBoardTwo();
		         playerMoveTwo();
		       }
		    wonGame();
		    
		  
		  //  gtweu grqe3rt
		  }

		  public static void introduceOne()
		  {
		      Scanner userStringInput = new Scanner (System.in); 
		      Scanner userIntInput = new Scanner (System.in); 
		      System.out.println ("Lets play jeopardy, all answers must be fully typed out, all capitalized. Have Fun! ");
		      System.out.println("Your first five categories are : Geography, Movies, Scramble, US Capitals, and Animals!");
		      System.out.println("whats your name?");
		      String name = userStringInput.nextLine();  
		      System.out.println("Hello " +name+ ", press enter to see the jeopardy board, then pick your first question by inputting where it is on the board! Ex. (B3 or C2)");
		      String playerGuessOne = userStringInput.nextLine();
		      System.out.println();
		    }

		  public static void prepareBoardOne()
		  {
		       String[][]boardOne = new String[5][5];
		       for(int row = 0; row<boardOne.length;row++)
		        {
		          for(int col = 0; col< boardOne[0].length; col++)
		            {
		            boardOne[row][col] = " ";  
		            }
		        }
		  }
		 
		  public static void  displayBoardOne()
		  {
		          String[][]boardOne = new String[5][5];
		          System.out.println("   Geography   Movies    Scramble   US Capitals   Animals  ");
		          System.out.println("       1         2          3           4            5");
		          System.out.println("  --------------------------------------------------------");
		          System.out.println(" A |  "+values[0][0]+"    |   "+values[0][1]+"    |   "+values[0][2]+"    |   "+values[0][3]+"    |   "+values[0][4]+"    |  ");
		          System.out.println("  --------------------------------------------------------");
		          System.out.println(" B |  "+values[0][5]+"    |   "+values[0][6]+"    |   "+values[0][7]+"    |   "+values[0][8]+"    |   "+values[0][9]+"    |  ");
		          System.out.println("  --------------------------------------------------------");
		          System.out.println(" C |  "+values[0][10]+"    |   "+values[0][11]+"    |   "+values[0][12]+"    |   "+values[0][13]+"    |   "+values[0][14]+"    |  ");
		          System.out.println("  --------------------------------------------------------");
		          System.out.println(" D |  "+values[0][15]+"    |   "+values[0][16]+"    |   "+values[0][17]+"    |   "+values[0][18]+"    |   "+values[0][19]+"    |  ");
		          System.out.println("  --------------------------------------------------------");
		          System.out.println(" E |  "+values[0][20]+"    |   "+values[0][21]+"    |   "+values[0][22]+"    |   "+values[0][23]+"    |   "+values[0][24]+"    |  ");
		          System.out.println("  --------------------------------------------------------");
		          System.out.println("                ");

		  }  
		  
		  public static void playerMoveOne()
		  {  
		    
		    Scanner userStringInput = new Scanner (System.in); 
		    String playerGuessOne = userStringInput.nextLine();
		    
		    if(playerGuessOne.equalsIgnoreCase ("A1"))
		    {
		           System.out.println("For " + Data.jeopardyOne.get(4).getValue() + " points, " + Data.jeopardyOne.get(4).getQuestion());
		           playerGuessOne = userStringInput.nextLine();
		             counter++;
		      if(playerGuessOne.equals(Data.jeopardyOne.get(4).getAnswer()))
		        {
		           System.out.println("Great! thats the answer, 100 points will be added to your current score of " + playerScore + "!"); 
		            System.out.println();
		            playerScore += 100;
		        
		        }
		            
		        else if(!playerGuessOne.equals(Data.jeopardyOne.get(4).getAnswer()))
		          {
		            System.out.println("nope! the correct answer was " + Data.jeopardyOne.get(4).getAnswer() + ". No points will be added to your current score of " + playerScore +".");
		            System.out.println();
		          }
		             values[0][0] = " X ";    
		    }    
		    if(playerGuessOne.equalsIgnoreCase ("B1"))
		    {
		         System.out.println("For " + Data.jeopardyOne.get(3).getValue() + " points, " + Data.jeopardyOne.get(3).getQuestion());
		         counter++;
		         playerGuessOne = userStringInput.nextLine();
		      
		      if(playerGuessOne.equals(Data.jeopardyOne.get(3).getAnswer()))
		      {
		        System.out.println("Great! thats the answer, 200 points will be added to your current score of " + playerScore + "!"); 
		        System.out.println();
		        playerScore += 200;
		      }

		      else if(!playerGuessOne.equals(Data.jeopardyOne.get(3).getAnswer()))
		         {
		           System.out.println("nope! the correct answer was " + Data.jeopardyOne.get(3).getAnswer() + ". No points will be added to your current score of " + playerScore +".");
		           System.out.println();
		         }
		      
		          values[0][5] = " X ";
		    }    
		    if(playerGuessOne.equalsIgnoreCase ("C1"))
		    {
		       System.out.println("For " + Data.jeopardyOne.get(2).getValue() + " points, " + Data.jeopardyOne.get(2).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      
		    if(playerGuessOne.equals(Data.jeopardyOne.get(2).getAnswer()))
		      {
		        System.out.println("Great! thats the answer, 300 points will be added to your current score of " + playerScore + "!"); 
		        System.out.println();
		        playerScore += 300;
		      }

		      else if(!playerGuessOne.equals(Data.jeopardyOne.get(2).getAnswer()))
		         {
		           System.out.println("nope! the correct answer was " + Data.jeopardyOne.get(2).getAnswer() + ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		       values[0][10] = " X ";
		    }    
		    if(playerGuessOne.equalsIgnoreCase ("D1"))
		    {
		       System.out.println("For " + Data.jeopardyOne.get(1).getValue() + " points, " + Data.jeopardyOne.get(1).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      
		    if(playerGuessOne.equals(Data.jeopardyOne.get(1).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 400 points will be added to your current score of " + playerScore + "!"); 
		        System.out.println();
		        playerScore += 400;
		      }

		      else if(!playerGuessOne.equals(Data.jeopardyOne.get(1).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " + Data.jeopardyOne.get(1).getAnswer() + ". No points will be added to your current score of " + playerScore +".");
		           System.out.println();
		         }
		      values[0][15] = " X ";

		    }
		    if(playerGuessOne.equalsIgnoreCase ("E1"))
		    {
		       System.out.println("For " + Data.jeopardyOne.get(0).getValue() + " points, " +Data.jeopardyOne.get(0).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		    if(playerGuessOne.equals(Data.jeopardyOne.get(0).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 500 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=500;
		      }       
		    else if(!playerGuessOne.equals(Data.jeopardyOne.get(0).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(0).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][20] = " X ";
		    } 
		    if(playerGuessOne.equalsIgnoreCase ("A2"))
		    {
		             System.out.println("For " +Data.jeopardyOne.get(9).getValue()+ " points, " +Data.jeopardyOne.get(9).getQuestion());
		       counter++;
		             playerGuessOne = userStringInput.nextLine();
		            if(playerGuessOne.equals(Data.jeopardyOne.get(9).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 100 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=100;
		            }

		             else if(!playerGuessOne.equals(Data.jeopardyOne.get(4).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(9).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		       values[0][1] = " X ";
		  }  
		    if(playerGuessOne.equalsIgnoreCase ("B2"))
		    {
		             System.out.println("For " +Data.jeopardyOne.get(8).getValue()+ " points, " +Data.jeopardyOne.get(8).getQuestion());
		       counter++;
		             playerGuessOne = userStringInput.nextLine();
		            if(playerGuessOne.equals(Data.jeopardyOne.get(8).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 200 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=200;
		            }

		             else if(!playerGuessOne.equals(Data.jeopardyOne.get(8).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(8).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values[0][6] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("C2"))
		    {
		               System.out.println("For " +Data.jeopardyOne.get(7).getValue()+ " points, " +Data.jeopardyOne.get(7).getQuestion());
		       counter++;
		               playerGuessOne = userStringInput.nextLine();
		              if(playerGuessOne.equals(Data.jeopardyOne.get(7).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 300 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=300;
		              }

		               else if(!playerGuessOne.equals(Data.jeopardyOne.get(7).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(7).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		      values[0][11] = " X ";
		        }
		    if(playerGuessOne.equalsIgnoreCase ("D2"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(6).getValue()+ " points, " +Data.jeopardyOne.get(6).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(6).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 400 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=400;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(6).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(6).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][16] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("E2"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(5).getValue()+ " points, " +Data.jeopardyOne.get(5).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(5).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 500 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=500;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(5).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(5).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][21] = " X ";

		    }
		    if(playerGuessOne.equalsIgnoreCase ("A3"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(14).getValue()+ " points, " +Data.jeopardyOne.get(14).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(14).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 100 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=100;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(14).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(14).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][2] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("B3"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(13).getValue()+ " points, " +Data.jeopardyOne.get(13).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(13).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 200 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=200;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(13).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(13).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][7] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("C3"))
		    {
		             System.out.println("For " +Data.jeopardyOne.get(12).getValue()+ " points, " +Data.jeopardyOne.get(12).getQuestion());
		       counter++;
		             playerGuessOne = userStringInput.nextLine();
		            if(playerGuessOne.equals(Data.jeopardyOne.get(12).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 300 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=300;
		            }

		             else if(!playerGuessOne.equals(Data.jeopardyOne.get(12).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(12).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values[0][12] = " X ";
		          }
		    if(playerGuessOne.equalsIgnoreCase ("D3"))
		    {
		         System.out.println("For " +Data.jeopardyOne.get(11).getValue()+ " points, " +Data.jeopardyOne.get(11).getQuestion());
		       counter++;
		         playerGuessOne = userStringInput.nextLine();
		        if(playerGuessOne.equals(Data.jeopardyOne.get(11).getAnswer()))
		        {
		         System.out.println("Great! thats the answer, 400 points will be added to your current score of " +playerScore+ "!"); 
		          System.out.println();
		          playerScore+= 400;
		        }

		         else if(!playerGuessOne.equals(Data.jeopardyOne.get(11).getAnswer()))
		           {
		           System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(11).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		             System.out.println();
		           }
		      values[0][17] = " X ";
		      }
		    if(playerGuessOne.equalsIgnoreCase ("E3"))
		    {
		         System.out.println("For " +Data.jeopardyOne.get(10).getValue()+ " points, " +Data.jeopardyOne.get(10).getQuestion());
		       counter++;
		         playerGuessOne = userStringInput.nextLine();
		        if(playerGuessOne.equals(Data.jeopardyOne.get(10).getAnswer()))
		        {
		         System.out.println("Great! thats the answer, 500 points will be added to your current score of " +playerScore+ "!"); 
		          System.out.println();
		          playerScore+= 500;
		        }

		         else if(!playerGuessOne.equals(Data.jeopardyOne.get(10).getAnswer()))
		           {
		           System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(10).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		             System.out.println();
		           }
		      values[0][22] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("A4"))
		    {
		         System.out.println("For " +Data.jeopardyOne.get(19).getValue()+ " points, " +Data.jeopardyOne.get(19).getQuestion());
		       counter++;
		         playerGuessOne = userStringInput.nextLine();
		        if(playerGuessOne.equals(Data.jeopardyOne.get(19).getAnswer()))
		        {
		         System.out.println("Great! thats the answer, 100 points will be added to your current score of " +playerScore+ "!"); 
		          System.out.println();
		          playerScore+= 100;
		        }

		         else if(!playerGuessOne.equals(Data.jeopardyOne.get(19).getAnswer()))
		           {
		           System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(19).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		             System.out.println();
		           }
		      values[0][3] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("B4"))
		    {
		         System.out.println("For " +Data.jeopardyOne.get(18).getValue()+ " points, " +Data.jeopardyOne.get(18).getQuestion());
		         counter++;
		         playerGuessOne = userStringInput.nextLine();
		        if(playerGuessOne.equals(Data.jeopardyOne.get(18).getAnswer()))
		        {
		         System.out.println("Great! thats the answer, 200 points will be added to your current score of " +playerScore+ "!"); 
		          System.out.println();
		          playerScore += 200;
		        }

		         else if(!playerGuessOne.equals(Data.jeopardyOne.get(18).getAnswer()))
		           {
		           System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(18).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		             System.out.println();
		           }
		      values[0][8] = " X ";
		      }
		    if(playerGuessOne.equalsIgnoreCase ("C4"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(17).getValue()+ " points, " +Data.jeopardyOne.get(17).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(17).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 300 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=300;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(17).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(17).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][13] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("D4"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(16).getValue()+ " points, " +Data.jeopardyOne.get(16).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(16).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 400 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=400;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(16).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(16).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][18] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("E4"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(15).getValue()+ " points, " +Data.jeopardyOne.get(15).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(15).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 500 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=500;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(15).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(15).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][23] = " X ";

		    }
		    if(playerGuessOne.equalsIgnoreCase ("A5"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(24).getValue()+ " points, " +Data.jeopardyOne.get(24).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(24).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 100 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=100;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(24).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(24).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][4] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("B5"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(23).getValue()+ " points, " +Data.jeopardyOne.get(23).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(23).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 200 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=200;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(23).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(23).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][9] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("C5"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(22).getValue()+ " points, " +Data.jeopardyOne.get(22).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(22).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 300 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=300;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(22).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(22).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][14] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("D5"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(21).getValue()+ " points, " +Data.jeopardyOne.get(21).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(21).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 400 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=400;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(21).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(21).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][19] = " X ";
		    }
		    if(playerGuessOne.equalsIgnoreCase ("E5"))
		    {
		       System.out.println("For " +Data.jeopardyOne.get(20).getValue()+ " points, " +Data.jeopardyOne.get(20).getQuestion());
		       counter++;
		       playerGuessOne = userStringInput.nextLine();
		      if(playerGuessOne.equals(Data.jeopardyOne.get(20).getAnswer()))
		      {
		       System.out.println("Great! thats the answer, 500 points will be added to your current score of " +playerScore+ "!"); 
		        System.out.println();
		        playerScore+=500;
		      }

		       else if(!playerGuessOne.equals(Data.jeopardyOne.get(20).getAnswer()))
		         {
		         System.out.println("nope! the correct answer was " +Data.jeopardyOne.get(20).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		           System.out.println();
		         }
		      values[0][25] = " X ";
		    }

		    if(counter == 4)
		    {
		     playingOne = false;
		    }
		    
		  }



		  
		  public static void introduceTwo()
		  {
		    System.out.println("You ended round one with " +playerScore+ " points. Lets play Jeopardy round 2. Just a reminder all answers must be in ALL CAPS and spelled correctly. Good luck!");
		    System.out.println();
		    System.out.println();
		     
		  }
		  
		  public static void prepareBoardTwo()
		  {
		       String[][]boardTwo = new String[5][5];
		       for(int row =0; row<boardTwo.length;row++)
		        {
		          for(int col = 0; col< boardTwo[0].length; col++)
		            {
		            boardTwo[row][col]= " ";  
		            }
		        }
		  }
		  
		  public static void displayBoardTwo()
		  {   
		    String[][]boardTwo = new String[5][5];
		    System.out.println("    Music    Sports   W. Capitals  A. History  Football  ");
		    System.out.println("      1         2          3           4          5");  
		    System.out.println("  -----------------------------------------------------");
		    System.out.println(" A |  "+values2[0][0]+"   |  "+values2[0][1]+"   |   "+values2[0][2]+"    |   "+values2[0][3]+"    |   "+values2[0][4]+"    |   ");
		    System.out.println("  -----------------------------------------------------");
		    System.out.println(" B |  "+values2[0][5]+"   |  "+values2[0][6]+"   |   "+values2[0][7]+"    |   "+values2[0][8]+"    |   "+values2[0][9]+"    |   ");
		    System.out.println("  -----------------------------------------------------");
		    System.out.println(" C |  "+values2[0][10]+"   |  "+values2[0][11]+"   |   "+values2[0][12]+"    |   "+values2[0][13]+"    |   "+values2[0][14]+"    | ");
		    System.out.println("  -----------------------------------------------------");
		    System.out.println(" D |  "+values2[0][15]+"   |  "+values2[0][16]+"   |   "+values2[0][17]+"    |   "+values2[0][18]+"    |   "+values2[0][19]+"    | ");
		    System.out.println("  -----------------------------------------------------");
		    System.out.println(" E |  "+values2[0][20]+"  |  "+values2[0][21]+"  |   "+values2[0][22]+"   |   "+values2[0][23]+"   |   "+values2[0][24]+"   | ");
		    System.out.println("  -----------------------------------------------------");
		    System.out.println("                ");
		  }
		  
		  public static void playerMoveTwo()
		  {
		    int counter2 = 0;
		    Scanner userStringInput = new Scanner (System.in); 
		    String playerGuessTwo = userStringInput.nextLine();

		    if(playerGuessTwo.equalsIgnoreCase ("A1"))
		    {
		           System.out.println("For " +Data.jeopardyTwo.get(4).getValue()+ " points, " +Data.jeopardyTwo.get(4).getQuestion());
		          counter2++;
		           playerGuessTwo = userStringInput.nextLine();
		          if(playerGuessTwo.equals(Data.jeopardyTwo.get(4).getAnswer()))
		          {
		           System.out.println("Great! thats the answer, 200 points will be added to your current score of " +playerScore+ "!"); 
		            System.out.println();
		            playerScore+=200;
		          }

		           else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(4).getAnswer()))
		             {
		             System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(4).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		               System.out.println();
		             }
		           values2[0][0]=" X ";
		    }
		    if(playerGuessTwo.equalsIgnoreCase ("B1"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(3).getValue()+ " points, " +Data.jeopardyTwo.get(3).getQuestion());
		           counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(3).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 400 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=400;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(3).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(3).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		             values2[0][5]=" X ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("C1"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(2).getValue()+ " points, " +Data.jeopardyTwo.get(2).getQuestion());
		      counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(2).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 600 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=600;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(2).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(2).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		values2[0][10] = " X ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("D1"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(1).getValue()+ " points, " +Data.jeopardyTwo.get(1).getQuestion());
		      counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(1).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 800 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=800;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(1).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(1).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values2[0][15] = " X ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("E1"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(0).getValue()+ " points, " +Data.jeopardyTwo.get(0).getQuestion());
		      counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(0).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 1000 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=1000;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(0).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(0).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values2[0][20] = " X  ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("A2"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(9).getValue()+ " points, " +Data.jeopardyTwo.get(9).getQuestion());
		      counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(9).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 200 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=200;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(9).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(9).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values2[0][1]=" X ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("B2"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(8).getValue()+ " points, " +Data.jeopardyTwo.get(8).getQuestion());
		      counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(8).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 400 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=400;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(8).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(8).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values2[0][6]=" X ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("C2"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(7).getValue()+ " points, " +Data.jeopardyTwo.get(7).getQuestion());
		      counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(7).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 600 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=600;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(7).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(7).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values2[0][11] = " X ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("D2"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(6).getValue()+ " points, " +Data.jeopardyTwo.get(6).getQuestion());
		      counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(6).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 800 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=800;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(6).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(6).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values2[0][16] = " X ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("E2"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(5).getValue()+ " points, " +Data.jeopardyTwo.get(5).getQuestion());
		      counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(5).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 1000 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=1000;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(5).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(5).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values2[0][21] = " X  ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("A3"))
		    {
		             System.out.println("For " +Data.jeopardyTwo.get(14).getValue()+ " points, " +Data.jeopardyTwo.get(14).getQuestion());
		      counter2++;
		             playerGuessTwo = userStringInput.nextLine();
		            if(playerGuessTwo.equals(Data.jeopardyTwo.get(14).getAnswer()))
		            {
		             System.out.println("Great! thats the answer, 200 points will be added to your current score of " +playerScore+ "!"); 
		              System.out.println();
		              playerScore+=200;
		            }

		             else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(14).getAnswer()))
		               {
		               System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(14).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                 System.out.println();
		               }
		      values2[0][2]=" X ";
		          }
		    if(playerGuessTwo.equalsIgnoreCase ("B3"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(13).getValue()+ " points, " +Data.jeopardyTwo.get(13).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(13).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 400 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=400;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(13).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(13).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][7]=" X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("C3"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(12).getValue()+ " points, " +Data.jeopardyTwo.get(12).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(12).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 600 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=600;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(12).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(12).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][12] = " X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("D3"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(11).getValue()+ " points, " +Data.jeopardyTwo.get(11).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(11).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 800 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=800;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(11).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(11).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][17] = " X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("E3"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(10).getValue()+ " points, " +Data.jeopardyTwo.get(10).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(10).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 1000 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=1000;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(10).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(10).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][22] = " X  ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("A4"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(19).getValue()+ " points, " +Data.jeopardyTwo.get(19).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(19).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 200 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=200;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(19).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(19).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][3]=" X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("B4"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(18).getValue()+ " points, " +Data.jeopardyTwo.get(18).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(18).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 400 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=400;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(18).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(18).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][8]=" X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("C4"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(17).getValue()+ " points, " +Data.jeopardyTwo.get(17).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(17).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 600 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=600;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(17).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(17).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][13] = " X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("D4"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(16).getValue()+ " points, " +Data.jeopardyTwo.get(16).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(16).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 800 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=800;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(16).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(16).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][18] = " X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("E4"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(15).getValue()+ " points, " +Data.jeopardyTwo.get(15).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(15).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 1000 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=1000;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(15).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " +Data.jeopardyTwo.get(15).getAnswer()+ ". No points will be added to your current score of " +playerScore +".");
		                   System.out.println();
		                 }
		values2[0][23]= " X  ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("A5"))
		    {
		               System.out.println("For " +Data.jeopardyTwo.get(24).getValue()+ " points, " +Data.jeopardyTwo.get(24).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(24).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 200 points will be added to your current score of " +playerScore+ "!"); 
		                System.out.println();
		                playerScore+=200;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(24).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " + Data.jeopardyTwo.get(24).getAnswer() + ". No points will be added to your current score of " + playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][4]=" X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("B5"))
		    {
		               System.out.println("For " + Data.jeopardyTwo.get(23).getValue() + " points, " + Data.jeopardyTwo.get(23).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(23).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 400 points will be added to your current score of " + playerScore + "!"); 
		                System.out.println();
		                playerScore+=400;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(23).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " + Data.jeopardyTwo.get(23).getAnswer() + ". No points will be added to your current score of " + playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][9]=" X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("C5"))
		    {
		               System.out.println("For " + Data.jeopardyTwo.get(22).getValue() + " points, " + Data.jeopardyTwo.get(22).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(22).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 600 points will be added to your current score of " + playerScore + "!"); 
		                System.out.println();
		                playerScore+=600;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(22).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " + Data.jeopardyTwo.get(22).getAnswer() + ". No points will be added to your current score of " + playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][14] = " X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("D5"))
		    {
		               System.out.println("For " + Data.jeopardyTwo.get(21).getValue() + " points, " + Data.jeopardyTwo.get(21).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(21).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 800 points will be added to your current score of " + playerScore + "!"); 
		                System.out.println();
		                playerScore+=800;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(21).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " + Data.jeopardyTwo.get(21).getAnswer() + ". No points will be added to your current score of " + playerScore + ".");
		                   System.out.println();
		                 }
		      values2[0][19] = " X ";
		            }
		    if(playerGuessTwo.equalsIgnoreCase ("E5"))
		    {
		               System.out.println("For " + Data.jeopardyTwo.get(20).getValue() + " points, " + Data.jeopardyTwo.get(20).getQuestion());
		      counter2++;
		               playerGuessTwo = userStringInput.nextLine();
		              if(playerGuessTwo.equals(Data.jeopardyTwo.get(20).getAnswer()))
		              {
		               System.out.println("Great! thats the answer, 1000 points will be added to your current score of " + playerScore + "!"); 
		                System.out.println();
		                playerScore+=1000;
		              }

		               else if(!playerGuessTwo.equals(Data.jeopardyTwo.get(20).getAnswer()))
		                 {
		                 System.out.println("nope! the correct answer was " + Data.jeopardyTwo.get(20).getAnswer() + ". No points will be added to your current score of " + playerScore +".");
		                   System.out.println();
		                 }
		      values2[0][24] = " X  ";
		            }
		    if(counter2 == 4)
		    {
		      playingTwo = false;
		    }
		  }
		  
		  public static void wonGame()
		  {
		    System.out.println();
		    System.out.println("Yay! you've completed Jeopardy with " +playerScore+" points. Thanks for playing!");
		  }

		}

		    
		    

	}
