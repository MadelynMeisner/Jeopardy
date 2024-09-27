
public class Question
	{
			
				  private String category;
				  private String question;
				  private String answer;
				  private int value;

				public Question(String c,String q, String a, int v)
				{ 
				    category = c;
				    question = q;
				    answer = a;
				    value = v;
				  }

				public String getCategory()
				    {
				      return category;
				    }

				public void setCategory(String c)
				    {
				     category = c;
				    }

				public String getQuestion()
				    {
				      return question;
				    }

				public void setQuestion(String q)
				    {
				      question = q;
				    }

				  public String getAnswer()
				      {
				        return answer;
				      }

				  public void setAnswer(String a)
				      {
				       answer = a;
				      }

				public int getValue()
				  {
				    return value;
				  }

				public void setValue(int v)
				  {
				    value = v;
				  }
				}
	}
