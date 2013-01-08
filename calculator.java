/*
 * Copyright (c) <2013> <Tim Cheng>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class calculator extends Frame implements ActionListener {

	static calculator frm = new calculator(); // 宣告static型態calculator類別(繼承Frame)變數物件
	
	static Panel pnl_num = new Panel(new GridLayout(4, 3)); // 建立static型態之Panel(面板)物件pnl_num
															// 並設定版面為4行3列之方格版面(計算機數字)
	static Panel pnl_opt = new Panel(new GridLayout(5, 1)); // 建立static型態之Panel(面板)物件pnl_opt
															// 並設定版面為5行1列之方格版面(計算機運算元)
	static Label lab = new Label("0", Label.RIGHT); // 建立static型態之Label類別(標籤)物件lab
													// 並設定文字為0
													// 標籤內文字靠右對齊(計算機數值顯示)

	static Button clr = new Button("Clear"); 	// 建立static型態之Button類別(按鈕)物件clr
												// 並設定按鈕文字為Clear(計算機歸零按鍵)
	
	static Button btn0 = new Button("0"); 		// 建立static型態之Button類別(按鈕)物件btn0
												// 並設定按鈕文字為0(數字0按鍵)
	
	static Button btn1 = new Button("1"); 		// 建立static型態之Button類別(按鈕)物件btn1
												// 並設定按鈕文字為1(數字1按鍵)
	
	static Button btn2 = new Button("2"); 		// 建立static型態之Button類別(按鈕)物件btn2
												// 並設定按鈕文字為2(數字2按鍵)
	
	static Button btn3 = new Button("3"); 		// 建立static型態之Button類別(按鈕)物件btn3
												// 並設定按鈕文字為3(數字3按鍵)
	
	static Button btn4 = new Button("4"); 		// 建立static型態之Button類別(按鈕)物件btn4
												// 並設定按鈕文字為4(數字4按鍵)
	
	static Button btn5 = new Button("5"); 		// 建立static型態之Button類別(按鈕)物件btn5
												// 並設定按鈕文字為5(數字5按鍵)
	
	static Button btn6 = new Button("6"); 		// 建立static型態之Button類別(按鈕)物件btn6
												// 並設定按鈕文字為6(數字6按鍵)
	
	static Button btn7 = new Button("7"); 		// 建立static型態之Button類別(按鈕)物件btn7
												// 並設定按鈕文字為7(數字7按鍵)
	
	static Button btn8 = new Button("8");		// 建立static型態之Button類別(按鈕)物件btn8
												// 並設定按鈕文字為8(數字8按鍵)
	
	static Button btn9 = new Button("9"); 		// 建立static型態之Button類別(按鈕)物件btn9
												// 並設定按鈕文字為9(數字9按鍵)
	
	static Button add = new Button("+"); 		// 建立static型態之Button類別(按鈕)物件add
												// 並設定按鈕文字為+(加法按鍵)
	
	static Button subtract = new Button("-"); 	// 建立static型態之Button類別(按鈕)物件subtract
												// 並設定按鈕文字為-(減法按鍵)
	
	static Button multiply = new Button("*"); 	// 建立static型態之Button類別(按鈕)物件multiply
												// 並設定按鈕文字為*(乘法按鍵)
	
	static Button divide = new Button("/"); 	// 建立static型態之Button類別(按鈕)物件divide
												// 並設定按鈕文字為/(除法按鍵)
	
	static Button equal = new Button("="); 		// 建立static型態之Button類別(按鈕)物件equal
												// 並設定按鈕文字為=(等於按鍵)

	int current;				// 宣告int 變數 current (用來儲存被加數)
	char opt = 'X'; 			// 宣告char 變數 opt 設定初值為x (用來儲存運算元)
	boolean opt_press = false; 	// 宣告boolean 變數 opt_press (記錄運算元按下與否)
	boolean opt_count = false;	// 宣告boolean 變數 opt_count (記錄運算元是否被重複按下)

	public static void main(String args[]) {

		clr.addActionListener(frm); 		// frm註冊至clr按鈕
		btn0.addActionListener(frm); 		// frm註冊至btn0按鈕
		btn1.addActionListener(frm); 		// frm註冊至btn1按鈕
		btn2.addActionListener(frm); 		// frm註冊至btn2按鈕
		btn3.addActionListener(frm);	 	// frm註冊至btn3按鈕
		btn4.addActionListener(frm); 		// frm註冊至btn4按鈕
		btn5.addActionListener(frm);	 	// frm註冊至btn5按鈕
		btn6.addActionListener(frm); 		// frm註冊至btn6按鈕
		btn7.addActionListener(frm);	 	// frm註冊至btn7按鈕
		btn8.addActionListener(frm);	 	// frm註冊至btn8按鈕
		btn9.addActionListener(frm); 		// frm註冊至btn9按鈕
		add.addActionListener(frm); 		// frm註冊至add按鈕
		subtract.addActionListener(frm);	// frm註冊至subtract按鈕
		multiply.addActionListener(frm);	// frm註冊至multiply按鈕
		divide.addActionListener(frm);		// frm註冊至divide按鈕
		equal.addActionListener(frm);		// frm註冊至equal按鈕

		frm.setLayout(null); 				// 取消frm視窗之原始版面配置
		frm.setSize(200, 250); 				// 設定frm視窗之大小為 200x250
		frm.setResizable(false); 			// 設定frm視窗不可讓使用者自行調整大小
		frm.setTitle("Calculator");			// 設定frm視窗之標題為Calculator

		lab.setBounds(20, 30, 120, 20); 	// 設定lab標籤座標為(20, 30) 大小為120x20
		lab.setBackground(Color.white); 	// 設定frm視窗的底色為白色

		pnl_opt.setBounds(150, 60, 30, 150); 	// 設定pnl_opt面板座標為(150, 60)
												// 大小為30x150
		pnl_opt.add(add); 		// 在pnl_opt面板裡加入按鈕add
		pnl_opt.add(subtract); 	// 在pnl_opt面板裡加入按鈕subtract
		pnl_opt.add(multiply); 	// 在pnl_opt面板裡加入按鈕multiply
		pnl_opt.add(divide); 	// 在pnl_opt面板裡加入按鈕divide
		pnl_opt.add(equal); 	// 在pnl_opt面板裡加入按鈕equal

		pnl_num.setBounds(20, 60, 120, 100); 	// 設定pnl_num面板座標為(20, 60)
												// 大小為120x100
		pnl_num.add(btn1); 		// 在pnl_num面板裡加入按鈕btn1
		pnl_num.add(btn2); 		// 在pnl_num面板裡加入按鈕btn2
		pnl_num.add(btn3); 		// 在pnl_num面板裡加入按鈕btn3
		pnl_num.add(btn4); 		// 在pnl_num面板裡加入按鈕btn4
		pnl_num.add(btn5); 		// 在pnl_num面板裡加入按鈕btn5
		pnl_num.add(btn6); 		// 在pnl_num面板裡加入按鈕btn6
		pnl_num.add(btn7); 		// 在pnl_num面板裡加入按鈕btn7
		pnl_num.add(btn8); 		// 在pnl_num面板裡加入按鈕btn8
		pnl_num.add(btn9); 		// 在pnl_num面板裡加入按鈕btn9
		pnl_num.add(new Button(" "));	// 在pnl_num面板裡加入按鈕 按鈕名稱設定為空白(排版美觀用)
		pnl_num.add(btn0);				// 在pnl_num面板裡加入按鈕btn0
		pnl_num.add(new Button(" "));	// 在pnl_num面板裡加入按鈕 按鈕名稱設定為空白(排版美觀用)

		clr.setBounds(45, 180, 70, 20); // 設定clr按鈕座標為(40, 170) 大小為80x30

		frm.add(pnl_opt);	// 將pnl_opt面板加入frm視窗
		frm.add(lab); 		// 將lab標籤加入frm視窗
		frm.add(pnl_num);	// 將pnl_num面板加入frm視窗
		frm.add(clr);		// 將clr按鈕加入frm視窗

		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
								// 使frm視窗右上角之關閉按鈕產生作用
		frm.setVisible(true);	// 設定frm視窗為顯示
	}

	private void num_opt(int input) {	// 定義private 不回傳num_opt method 引數為按下之按鈕數字
										// 顯示數字與面板上
		opt_count = false;
									// 上一個按下之按鈕是數字鍵 所以記錄是否按了兩次運算元按鈕之記錄變數關閉
		if (opt_press == true) {	// 如果已有運算元存在(表示現在執行num_opt時 正在輸入運算數)
			lab.setText("0"); 		// 將顯示面板之數歸零
			opt_press = false; 		// 表示目前正在輸入運算數
		}
		if (lab.getText() == "ERROR" || lab.getText() == "0")	// 如果面板數字為0或是ERROR時
																// 代表現在正在輸入第一個數字
			lab.setText(Integer.toString(input)); // 顯示剛按下之數字鍵

		else
			// 表示正在輸入第二個以上之數字
			lab.setText(lab.getText() + Integer.toString(input)); // 顯示剛下之數字鍵於原本數字之後
	}

	private void compute() { // 定義private不回傳 compute() method(計算函數)
		if (opt == '+') 											// 如果運算元為+
			current = current + Integer.parseInt(lab.getText());	// 將被運算數加上目前面板之運算數
		
		if (opt == '-')												// 如果運算元為-
			current = current - Integer.parseInt(lab.getText());	// 將被運算數減去目前面板之運算數
		
		if (opt == '*')												// 如果運算元為*
			current = current * Integer.parseInt(lab.getText());	// 將被運算數乘以目前面板之運算數
		
		if (opt == '/')												// 如果運算元為/
			current = current / Integer.parseInt(lab.getText());	// 將被運算數除以目前面板之運算數
		
		lab.setText(String.valueOf(current));						// 顯示計算結果至面板上
	}

	private void error_check() {	// 定義private不回傳 error_check() method(錯誤檢查)
		if (opt_count == true) {	// 如果運算元按鈕被按下兩次 兩次中沒有輸入任何數字時
			lab.setText("ERROR");	// 在面板上顯示錯誤
			current = 0; 			// 將被運算數清為0
			opt = 'X';				// 將運算元清空(沒有此運算元 代表清空)
			opt_press = true;		// 讓下一次按下數字鍵時面板為0
			opt_count = false;		// 將運算元連續按下兩次之記錄變數關閉
		}
	}

	public void actionPerformed(ActionEvent e) {	// 用來事件發生時的處理函數
		Button btn = (Button) e.getSource();		// 將發生事件來源之物件設定為Button型態之物件btn
													// 因getSource()可能會傳回父類別物件，所以先將其強制轉換為Button型態物件
		if (btn == btn0)	// 如果是按下數字鍵0
			num_opt(0);		// 呼叫num_opt() 引數為0(在面板顯示輸入0)
		if (btn == btn1)	// 如果是按下數字鍵1
			num_opt(1);		// 呼叫num_opt() 引數為1(在面板顯示輸入1)
		if (btn == btn2) 	// 如果是按下數字鍵2
			num_opt(2); 	// 呼叫num_opt() 引數為2(在面板顯示輸入2)
		if (btn == btn3) 	// 如果是按下數字鍵3
			num_opt(3); 	// 呼叫num_opt() 引數為3(在面板顯示輸入3)
		if (btn == btn4) 	// 如果是按下數字鍵4
			num_opt(4); 	// 呼叫num_opt() 引數為4(在面板顯示輸入4)
		if (btn == btn5) 	// 如果是按下數字鍵5
			num_opt(5); 	// 呼叫num_opt() 引數為5(在面板顯示輸入5)
		if (btn == btn6) 	// 如果是按下數字鍵6
			num_opt(6); 	// 呼叫num_opt() 引數為6(在面板顯示輸入6)
		if (btn == btn7) 	// 如果是按下數字鍵7
			num_opt(7); 	// 呼叫num_opt() 引數為7(在面板顯示輸入7)
		if (btn == btn8) 	// 如果是按下數字鍵8
			num_opt(8); 	// 呼叫num_opt() 引數為8(在面板顯示輸入8)
		if (btn == btn9) 	// 如果是按下數字鍵9
			num_opt(9); 	// 呼叫num_opt() 引數為9(在面板顯示輸入9)

		if (btn == add || btn == subtract || btn == multiply || btn == divide) { // 如果式按下加減乘除按鈕
			
			error_check(); 									// 呼叫error_check() 檢查與處理是否連續按下兩次運算元按鈕
			if (current != 0 && opt != 'X') 				// 如果被運算數與運算元均不為0時
				compute(); 									// 呼叫computer() (執行運算)
			else											// 如果上面if條件不成立(即表示現在僅以輸入完被運算數)
				current = Integer.parseInt(lab.getText()); 	// 將面板上之被運算數儲存至current變數裡
			opt_press = true; 		// 讓下一次按下數字鍵時面板為0
			if (btn == add) 		// 如果按下的是+按鈕
				opt = '+'; 			// 設定運算元為+
			if (btn == subtract)	// 如果按下的是-按鈕
				opt = '-'; 			// 設定運算元為-
			if (btn == multiply) 	// 如果按下的是*按鈕
				opt = '*'; 			// 設定運算元為*
			if (btn == divide) 		// 如果按下的是/按鈕
				opt = '/'; 			// 設定運算元為/
			opt_count = true; 		// 表示剛才以按下一次運算元按鈕
		}
		if (btn == clr) { // 如果是按下歸零按鍵

			lab.setText("0"); // 面板數字歸零
			current = 0; // 將被運算數清為0
			opt = 'X'; // 將運算元清空(沒有此運算元 代表清空)
			opt_press = false; // 表示現在沒有任何運算元被按下過
			opt_count = false; // 將運算元連續按下兩次之記錄變數關閉
		}
		if (btn == equal) {						// 如果是按下等於按鍵
			error_check(); 						// 呼叫error_check() 檢查與處理是否連續按下兩次運算元按鈕
			if (opt == 'X' && current == 0);	// 如果沒有運算元 被運算數也為0時 甚麼事情都不做
			else if (lab.getText() != "ERROR") {	// 當error_check()執行完畢後
													// 如果面板中之字非ERROR時(代表沒有錯誤)
													// 執行下列敘述
				compute();			// 呼叫computer() (執行運算)
				opt_count = false;	// 將運算元連續按下兩次之記錄變數關閉
				opt_press = true;	// 表示以按下過運算元 下次輸入數字時將面板將歸零
				opt = 'X';			// 將運算元清空(沒有此運算元 代表清空)
			}
		}
	}
}