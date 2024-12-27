import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;

public class MovieManagementApp extends JFrame {
    private JTextField titleField, directorField, yearField;
    private JTextArea descriptionArea;
    private JLabel imageLabel;
    private JTable movieTable;
    private JButton addButton, updateButton, deleteButton, clearButton, uploadButton;
    private File selectedImage;

    public MovieManagementApp() {
        setTitle("Movie Management Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // North Panel for Form
        JPanel formPanel = new JPanel(new GridLayout(5, 2));
        formPanel.add(new JLabel("Title:"));
        titleField = new JTextField();
        formPanel.add(titleField);

        formPanel.add(new JLabel("Director:"));
        directorField = new JTextField();
        formPanel.add(directorField);

        formPanel.add(new JLabel("Year:"));
        yearField = new JTextField();
        formPanel.add(yearField);

        formPanel.add(new JLabel("Description:"));
        descriptionArea = new JTextArea();
        formPanel.add(new JScrollPane(descriptionArea));

        formPanel.add(new JLabel("Poster:"));
        imageLabel = new JLabel("No Image", SwingConstants.CENTER);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        uploadButton = new JButton("Upload");
        uploadButton.addActionListener(e -> uploadImage());
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.add(imageLabel, BorderLayout.CENTER);
        imagePanel.add(uploadButton, BorderLayout.SOUTH);
        formPanel.add(imagePanel);

        add(formPanel, BorderLayout.NORTH);

        // Center Panel for Table
        movieTable = new JTable(); // Placeholder for table model
        add(new JScrollPane(movieTable), BorderLayout.CENTER);

        // South Panel for Buttons
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Add");
        addButton.addActionListener(e -> addMovie());
        buttonPanel.add(addButton);

        updateButton = new JButton("Update");
        updateButton.addActionListener(e -> updateMovie());
        buttonPanel.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(e -> deleteMovie());
        buttonPanel.add(deleteButton);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> clearForm());
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void uploadImage() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedImage = fileChooser.getSelectedFile();
            try {
                ImageIcon icon = new ImageIcon(ImageIO.read(selectedImage));
                imageLabel.setIcon(icon);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Failed to load image!");
            }
        }
    }

    private void addMovie() {
        String title = titleField.getText();
        String director = directorField.getText();
        String year = yearField.getText();
        String description = descriptionArea.getText();

        // Validate inputs
        if (title.isEmpty() || director.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled!");
            return;
        }

        // Database insertion logic (Placeholder)
        JOptionPane.showMessageDialog(this, "Movie added successfully!");
    }

    private void updateMovie() {
        // Update logic
    }

    private void deleteMovie() {
        // Delete logic
    }

    private void clearForm() {
        titleField.setText("");
        directorField.setText("");
        yearField.setText("");
        descriptionArea.setText("");
        imageLabel.setIcon(null);
        selectedImage = null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MovieManagementApp::new);
    }
}