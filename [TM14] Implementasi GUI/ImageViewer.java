import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ImageViewer {
    private JFrame frame;
    private JLabel imageLabel;
    private JButton openButton;

    public ImageViewer(){
        frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLayout(new BorderLayout());

        imageLabel = new JLabel("No image selected", SwingConstants.CENTER);
        imageLabel.setFont(new Font("Arial", Font.ITALIC, 20));
        imageLabel.setBackground(Color.LIGHT_GRAY);
        imageLabel.setOpaque(true);
        frame.add(imageLabel, BorderLayout.CENTER);

        openButton = new JButton("Open Image");
        openButton.setFont(new Font("Arial", Font.PLAIN, 16));
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openImage();
            }
        });

        frame.add(openButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private void openImage(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Image Files", "jpg", "png", "jpeg", "gif"));

        int result = fileChooser.showOpenDialog(frame);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());

            Image image = imageIcon.getImage().getScaledInstance(
                    imageLabel.getWidth(),
                    imageLabel.getHeight(),
                    Image.SCALE_SMOOTH);

            imageLabel.setIcon(new ImageIcon(image));
            imageLabel.setText(null);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageViewer());
    }
}
