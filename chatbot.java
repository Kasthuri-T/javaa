import java.util.Scanner;

public class SimpleChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Hello! I'm a simple chatbot. How can I assist you today?");
        
        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("hi") || userInput.contains("hello")) {
                System.out.println("Chatbot: Hello! How can I help you?");
            } else if (userInput.contains("how are you")) {
                System.out.println("Chatbot: I'm just a program, but I'm functioning as expected. How about you?");
            } else if (userInput.contains("what is your name")) {
                System.out.println("Chatbot: I'm a simple chatbot created by a Java program.");
            } else if (userInput.contains("bye") || userInput.contains("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day.");
                break;
            } else {
                System.out.println("Chatbot: I'm sorry, I don't understand that. Can you please rephrase?");
            }
        }
        
        scanner.close();
    }
}