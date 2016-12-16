import java.awt.*;
public class layout2{
	public static void main(String[] args) {
		Frame f = new Frame("grid");
		f.setLayout(new GridLayout(4,2));
		f.setSize(400,200);
		for(int i = 0 ; i < 5 ; i++){
			String j = "btn"+i;
			f.add(new Button(j));
		}
		f.setVisible(true);
	}
}