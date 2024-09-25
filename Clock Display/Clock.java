import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

class ClockGUI extends JFrame{
    private ClockDisplay clockDisplay;
    private JLabel timeLabel;
    private Timer timer;

    public ClockGUI(){
        LocalTime curTime = LocalTime.now();
        clockDisplay = new ClockDisplay(curTime.getHour(), curTime.getMinute(), curTime.getSecond());

        setTitle("Clock Display");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeLabel = new JLabel(clockDisplay.getTime(), SwingConstants.CENTER);
        timeLabel.setFont(new Font("Helvetica", Font.BOLD, 100));
        add(timeLabel, BorderLayout.CENTER);

        startClock();
        setVisible(true);
    }

    private void startClock(){
        timer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clockDisplay.timeTick();
                timeLabel.setText(clockDisplay.getTime());
            }
        });
        timer.start();
    }

    public static void main(String[] args){
        new ClockGUI();
    }
}
