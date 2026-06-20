import java.util.Scanner;

public class AIChatBot {

    public static String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you today?";
        } 
        else if (input.contains("name")) {
            return "I am a Java AI Chatbot.";
        } 
        else if (input.contains("how are you")) {
            return "I am doing great. Thanks for asking!";
        } 
        else if (input.contains("bye")) {
            return "Goodbye! Have a nice day.";
        } 
        else {
            return "Sorry, I don't understand that question.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== AI Chatbot ===");
        System.out.println("Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            String response = getResponse(userInput);
            System.out.println("Bot: " + response);

            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }

        sc.close();
    }
}
