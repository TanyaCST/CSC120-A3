import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;

class Conversation {
  public static String[] canned_responses = {
    "Mmmhmmm",
    "Interesting. Tell me more.",
    "Nah, I don't understand what you are talking about.",
    "I'm gonna go! Tom is coming.",
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
    //List<String> transcript = new ArrayList<String>();

    int num_rounds = sc.nextInt();

    String greeting = "Hi! I'm chatbox 8546797. You can call me Jerry. What's in your mind?";
    System.out.println(greeting);

    for (int i = 0; i < num_rounds; i++) {
      // Let users input things they want to ask.
      String user_input;
      user_input = sc.nextLine();
  
      String response = user_input;
  
      // Check mirror words 
      if(user_input.contains("I")) {
        response = response.replaceAll("\\bI\\b", "you");
      }

      if(user_input.contains("am")){
        response = response.replaceAll("\\bam\\b", "are");
      }

      if(user_input.contains("me")){
        response =  response.replaceAll("\\bme\\b", "you");
      }

      if(user_input.contains("my")){ 
        response = response.replaceAll("\\bmy\\b", "your");
      }
  
      if(user_input.contains("You")){ 
        response = response.replaceAll("\\bYou\\b", "I");
      }

      if(user_input.contains("you")){ 
        response = response.replaceAll("\\byou\\b", "me");
      }

      if(user_input.contains("your")){
        response = response.replaceAll("\\byour\\b", "my");
      }

      if(user_input.contains("are")){
        response = response.replaceAll("\\bare\\b", "am");
      } 
  
      else{
        // output canned responses
        //Random rand = new Random();
        //int indexCR = rand.nextInt(1,4);
        //response = canned_responses[indexCR];
  
      }

      System.out.println(response);

      //transcript.add(response);
  
      }

      //for(int j = 0; j <= transcript.size(); j++){
        //System.out.println(transcript.get(j));
      //}

    sc.close();
  }
  
}
