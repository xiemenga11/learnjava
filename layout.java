import java.awt.*;

public class layout{
	public static void main(String[] args) {
		Frame f = new Frame("leoxie");
		f.setLayout(new FlowLayout());
		f.setSize(300,200);
		f.add(new Button("btn1"));
		f.add(new Button("btn2"));
		f.setVisible(true);
	}
}