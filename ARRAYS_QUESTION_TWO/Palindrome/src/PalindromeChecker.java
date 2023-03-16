import javax.swing.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a JFrame to hold the components of the interface
        JFrame frame = new JFrame("Palindrome Checker");

        // Create a JPanel to hold the input and output components
        JPanel panel = new JPanel();

        // Create a JLabel and JTextField for the input
        JLabel inputLabel = new JLabel("Enter a number:");
        JTextField inputField = new JTextField(10);

        // Create a JButton for the user to submit their input
        JButton submitButton = new JButton("Check");

        // Create a JLabel to display the output
        JLabel outputLabel = new JLabel();

        // Add the input and output components to the panel
        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(submitButton);
        panel.add(outputLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame size and make it visible
        frame.setSize(300, 150);
        frame.setVisible(true);

        // Add an ActionListener to the submit button
        submitButton.addActionListener(e -> {
            // Get the user's input from the input field
            String inputStr = inputField.getText();

            // Check if the input is a palindrome
            if (isPalindrome(inputStr)) {
                outputLabel.setText("Yes, " + inputStr + " is a palindrome!");
            } else {
                outputLabel.setText("No, " + inputStr + " is not a palindrome.");
            }
        });
    }

    public static boolean isPalindrome(String str) {
        // Loop through the characters of the string, comparing the first and last characters
        for (int i = 0; i < str.length()  / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        // If we've made it through the loop without returning false, the string is a palindrome
        return true;
    }
}
