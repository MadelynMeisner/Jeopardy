import java.util.ArrayList;
		import java.util.Collections;
public class Data
	{


	
		  static ArrayList<Question> jeopardyOne = new ArrayList<Question>();
		    static ArrayList<Question> jeopardyTwo = new ArrayList<Question>();

		  public static void fillJeopardyOne ()
		    {
		        jeopardyOne.add(new Question("Geography", "How many time zones does Russia have? ", "11" , 500 ));
		        jeopardyOne.add(new Question("Geography", "What country does the Rhine River run through? ", "GERMANY" , 400)); 
		        jeopardyOne.add(new Question("Geography", "What is the name of the smallest country in the world? ", "VATICAN CITY" , 300)); 
		        jeopardyOne.add(new Question("Geography", "What country are the Great Pyramids of Giza located in?  ", "EGYPT" ,200 )); 
		        jeopardyOne.add(new Question("Geography", "What is the name of the tallest mountain in the world? ", "MOUNT EVEREST" ,100 )); 
		        jeopardyOne.add(new Question("Movies", "Name the movie that this iconic quote comes from: “You’re gonna need a bigger boat.” ", "JAWS" , 500 )); 
		        jeopardyOne.add(new Question("Movies", "What year was the first “Star Wars” released? ", "1977" , 400)); 
		        jeopardyOne.add(new Question("Movies", "Where does the film “Avatar” take place? ", "PANDORA" ,300 )); 
		        jeopardyOne.add(new Question("Movies", "What animal is Harry Potter’s Patronus? ", "STAG" ,200 )); 
		        jeopardyOne.add(new Question("Movies", "Which movie has the character, Maui played by Dwayne Johnson? ", "MOANA" ,100 )); 
		        jeopardyOne.add(new Question("Scramble", "Unscramble this word - GIMOPRMNARG", "PROGRAMMING" , 500)); 
		        jeopardyOne.add(new Question("Scramble", "Unscramble this word - ALEERBCT ", "BRACELET" ,400 )); 
		        jeopardyOne.add(new Question("Scramble", "Unscramble this word - PETOMCUR (hint: School)", "COMPUTER" ,300 )); 
		        jeopardyOne.add(new Question("Scramble", "Unscramble this word - OIDPNLH (hint: animal)", "DOLPHIN" ,200 )); 
		        jeopardyOne.add(new Question("Scramble", "Unscramble this word - AASPT (hint: food) ", "PASTA" ,100 )); 
		        jeopardyOne.add(new Question("US capitals", "What is the capital of Vermont? ", "MONTPELIER" , 500));
		        jeopardyOne.add(new Question("US capitals", "What is the capital of South Dakota? ", "PIERRE" , 400)); 
		        jeopardyOne.add(new Question("US capitals", "What is the capital of New York? ", "ALBANY" , 300));
		        jeopardyOne.add(new Question("US capitals", "What is the capital of FLORIDA? ", "TALLAHASSEE" ,200 ));
		        jeopardyOne.add(new Question("US capitals", "What is the capital of Colorado? ", "DENVER" ,100 ));
		        jeopardyOne.add(new Question("Animals", "What is a group of camels called? ", "CARAVAN" , 500)); 
		        jeopardyOne.add(new Question("Animals", "What is the closest living relative to the T-rex?", "CHICKEN" ,400 )); 
		        jeopardyOne.add(new Question("Animals", "What is the deadliest creature in the world? ", "MOSQUITO" , 300)); 
		        jeopardyOne.add(new Question("Animals", "What mammal has the most powerful bite? ", "HIPPOPOTAMUS" , 200)); 
		        jeopardyOne.add(new Question("Animals", "What is the biggest animal in the world? ", "BLUE WHALE" , 100)); 

		    }

		  public static void fillJeopardyTwo ()

		    {
		        jeopardyTwo.add(new Question("music", "What was Freddie Mercury's real name? ", "FARROKH BULSARA" , 1000 ));
		        jeopardyTwo.add(new Question("music", "What was Elvis Presley's first No. 1 hit in the United States? ", "HEARTBREAK HOTEL" , 800 ));
		        jeopardyTwo.add(new Question("music", "Which singer has the most grammys of all time? ", "BEYONCE" , 600 )); 
		        jeopardyTwo.add(new Question("music", "Which band has the members, Nick, Joe, and Kevin? ", "JONAS BROTHERS" , 400 )); 
		        jeopardyTwo.add(new Question("music", "Who is the Queen of Christmas? ", "MARIAH CAREY" , 200 )); 
		        jeopardyTwo.add(new Question("sports", " What retired basketball player tried out for the Chicago White Sox in 1994? ", "MICHAEL JORDAN" , 1000 )); 
		        jeopardyTwo.add(new Question("sports", "Who was the youngest player to score 10,000 points in the NBA? ", "LEBRON JAMES" , 800 )); 
		        jeopardyTwo.add(new Question("sports", "How many players are on a baseball team? ", "9" , 600)); 
		        jeopardyTwo.add(new Question("sports", "What does NBA stand for? ", "NATIONAL BASKETBALL ASSOCIATION" , 400 )); 
		        jeopardyTwo.add(new Question("sports", "The Olympics are held every how many years? ", "4" , 200 )); 
		        jeopardyTwo.add(new Question("World capitals ", "What is the capital of Senegal? ", "DAKAR" , 1000 ));
		        jeopardyTwo.add(new Question("World capitals", "What is the capital of Thailand?", "BANGKOK" , 800)); 
		        jeopardyTwo.add(new Question("World capitals", "What is the capital of Germany? ", "BERLIN" , 600 )); 
		        jeopardyTwo.add(new Question("World capitals", "What is the capital of Canada? ", "OTTAWA" ,400 )); 
		        jeopardyTwo.add(new Question("World capitals", " What is the capital of Mexico? ", "MEXICO CITY" ,200 ));
		        jeopardyTwo.add(new Question("american history", "Who was the Confederate General in the Amercian Civil War?", "ROBERT EDWARD LEE" , 1000 )); 
		        jeopardyTwo.add(new Question("american history", "What city was the first capital of the United States?", "NEW YORK CITY" , 800 ));
		        jeopardyTwo.add(new Question("american history", "What year was the Declaration of Independence signed?", "1776" , 600)); 
		        jeopardyTwo.add(new Question("american history", "How many colonies were there?", "13" , 400)); 
		        jeopardyTwo.add(new Question("american history", "Who gifted us the Statue of Liberty?", "FRANCE" , 200));  
		        jeopardyTwo.add(new Question("football teams", "Swoop is the mascot for which team? ", "PHILADELPHIA EAGLES" ,1000 )); 
		        jeopardyTwo.add(new Question("football teams", "Who has thrown for the most passing yards of all time? ", "TOM BRADY" , 800));
		        jeopardyTwo.add(new Question("football teams", "What is the only team in the NFL to neither host nor play in the Super Bowl?", "CLEVELAND BROWNS" ,600 )); 
		        jeopardyTwo.add(new Question("football teams", "What animal represents the mascot for the Titans? ", "RACOON" ,400 ));
		        jeopardyTwo.add(new Question("football teams", "What does the NFL stand for? ", "NATIONAL FOOTBALL LEAGUE" , 200));
		    }



		  }
	}
