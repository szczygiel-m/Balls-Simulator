import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class ActionListener implements java.awt.event.ActionListener {
    JButton button;

    public ActionListener(JButton button) {
        this.button = button;
    }

    @Override

    public void actionPerformed(ActionEvent actionEvent) {
        if (button.getText().equals("Speed Up")) {
            Starter.setThreadSleep(Starter.getThreadSleep() - 1);
        }

        if (button.getText().equals("Slow Down")) {
            Starter.setThreadSleep(Starter.getThreadSleep() + 1);
        }

        if (button.getText().equals("Add Ball")) {
            MyJPanel.makeBall(1);
        }

        if (button.getText().equals("Remove Ball")) {
            MyJPanel.removeBall();
        }

        if (button.getText().equals("Pause")) {
            for (int i = 0; i < MyJPanel.balls.size(); i++) {
                MyJPanel.balls.get(i).setAdderX(0);
                MyJPanel.balls.get(i).setAdderY(0);

            }
        }

        if (button.getText().equals("Resume")) {
            Random random = new Random();
            for (int i = 0; i < MyJPanel.balls.size(); i++) {
                MyJPanel.balls.get(i).setAdderX(1 - ((random.nextBoolean()) ? 2 : 0));
                MyJPanel.balls.get(i).setAdderY(1 - ((random.nextBoolean()) ? 2 : 0));
            }
        }

    }
}
