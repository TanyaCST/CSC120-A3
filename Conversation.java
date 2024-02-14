import java.util.*;

class Conversation {
  public static String[] canned_responses = {
    "Mmmhmmm",
    "Interesting. Tell me more.",
    "Nah, I don't understand what you are talking about.",
    "I'm gonna go! Jerry is coming.",
    "Wow. That's hilarious."
  };

  public static void main(String[] arguments) {
    // You will start the conversation here.

    // Let users input the number of rounds.
    Scanner sc = new Scanner(System.in);

    // Declare an variable for greeting
    String instruction = "Please enter the number of conversation rounds you want to go through:";
    System.out.println(instruction);

    // Create an array to store transcript
    List<String> transcript = new ArrayList<>();
    //String[]transcript = new String[]{"TRANSCRIPT"};
    transcript.add("TRANSCRIPT");

    int num_rounds = sc.nextInt();

    String greeting = "Hi! I'm chatbox 8546797. You can call me Tom. What's in your mind?";
    System.out.println(greeting);
    String user_input = sc.nextLine();

    for (int i = 1; i <= num_rounds; i++) {
      // Let users input things they want to ask.
      user_input = sc.nextLine();

      transcript.add(user_input);
  
      String response = user_input;
  
      // Check mirror words 

      if(user_input.contains("I") ||
         user_input.contains("You") ||
         user_input.contains("am") ||
         user_input.contains("are") ||
         user_input.contains("me") ||
         user_input.contains("you") ||
         user_input.contains("my") ||
         user_input.contains("your")) {

          if(user_input.contains("I")){
            response = response.replaceAll("\\bI\\b", "you");
          }

          if(user_input.contains("You")){ 
            response = response.replaceAll("\\bYou\\b", "I");
          }
    
          if(user_input.contains("am")){
            response = response.replaceAll("\\bam\\b", "are");
          }
    
          if(user_input.contains("are")){
            response = response.replaceAll("\\bare\\b", "am");
          } 
    
          if(user_input.contains("me")){
            response = response.replaceAll("\\bme\\b", "you");
          }
    
          if(user_input.contains("you")){ 
            response = response.replaceAll("\\byou\\b", "me");
          }
    
          if(user_input.contains("my")){ 
            response = response.replaceAll("\\bmy\\b", "your");
          }
    
          if(user_input.contains("your")){
            response = response.replaceAll("\\byour\\b", "my");
          }
        
      }

      else{
        // output canned responses
        Random rand = new Random();
        int indexCR = rand.nextInt(0,6);
        response = canned_responses[indexCR];
  
      }

      System.out.println(response);

      transcript.add(response);
  
      }

      //Print out transcript.
      for(String line: transcript){
        System.out.println(line);
      }

    sc.close();
  }
  
}
