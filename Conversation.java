import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    List<String> transcript = new ArrayList<String>();

    int num_rounds = sc.nextInt();

    String greeting = "Hi! I'm chatbox 8546797. What's in your mind?";
    System.out.println(greeting);

    for (int i =1; i <= num_rounds; i++) {
      // Let users input things they want to ask.
      String user_input = sc.nextLine();
      System.out.println(user_input);
  
      String response;
  
      // Check mirror words 
      if(user_input.contains("I")) {
        response = user_input.replace("I", "you");
        System.out.println(response);
      }
  
      else if(user_input.contains("me")){
        response =  user_input.replace("me", "you");
        System.out.println(response);
      }
  
      else if(user_input.contains("my")){
        response = user_input.replace("my", "your");
        System.out.println(response);
      }
  
      else if(user_input.contains("am")){
        response = user_input.replace("am", "are");
        System.out.println(response);
      }
  
      else if(user_input.contains("You")){
        response = user_input.replace("You", "I");
        System.out.println(response);
      }
  
      else if(user_input.contains("you")){
        response = user_input.replace("you", "me");
        System.out.println(response);
      }
  
      else if(user_input.contains("your")){
        response = user_input.replace("your", "my");
        System.out.println(response);
      }
  
      else if(user_input.contains("are")){
        response = user_input.replace("are", "am");
        System.out.println(response);
      }
  
      else{
        // output canned responses
        Random rand = new Random();
        int indexCR = rand.nextInt();
        response = canned_responses[indexCR];
        System.out.println(response);
  
      }
      transcript.add(response);
        
        // After each loop store everything? 
  
      }

      for(int j = 0; j <= transcript.size(); j++){
        System.out.println(transcript.get(j));
      }

    sc.close();
  }
  
}
