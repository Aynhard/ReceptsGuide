package Coocking;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class FrameReceptionsGuide extends JFrame {
	
	public ChoiceRecepe choiceRecepe = new ChoiceRecepe();
	int step =-1;
	int nowrecepe = 0;
    Image img;
	
	private JPanel panel_CoverClose;
		private JButton button_Open;
		
	private JPanel panel_CoverOpen;
	
	private JPanel panel_RecepeSpaghetti;
		private JButton btnSpaghetti;
		
	private JPanel panel_RecepeSouffle;
		private JButton btnSouffle;
	
	private JPanel panel_Left; 
		private JTextArea text_StepsLeft;
		private JLabel label_ImgLeft;
		private JList<String> list_Spaghetti;
		
	private JPanel panel_Center;
	
	private JPanel panel_Right; 
		private JTextArea text_StepsRight;
		private JLabel label_ImgRight;
		private JList<String> list_Souffle;

	private JButton buttonBack;
	private JButton buttonNext;
	private JButton buttonRecepeBack;
	
	DefaultListModel<String> spaghettiModel;
	ArrayList<String> spaghettiRecept =(choiceRecepe = new ChoiceRecepe(new SpaghettiRecepe())).recipe.getListWithProducts();
	
	DefaultListModel<String> souffleModel;
	ArrayList<String> souffleRecept =(choiceRecepe = new ChoiceRecepe(new SouffleRecepe())).recipe.getListWithProducts();

	public FrameReceptionsGuide() {
		getContentPane().setBackground(SystemColor.menu);
		setBackground(SystemColor.control);
	
		this.setResizable(false);
		this.setTitle("Cooking Guide");
		this.setSize(1400,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	
// PANEL COVER CLOSE
		panel_CoverClose = new JPanel();
		panel_CoverClose.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panel_CoverClose.setBackground(new Color(128, 0, 0));
		panel_CoverClose.setBounds(410, 13, 575, 739);
		getContentPane().add(panel_CoverClose);
		panel_CoverClose.setLayout(null);
						
		JLabel lblTitle = new JLabel(" Õ»√¿ «¿ –≈÷≈œ“»",SwingConstants.CENTER);
		lblTitle.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 42));
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBounds(12, 293, 551, 103);
		panel_CoverClose.add(lblTitle);
						
		JLabel lblMe = new JLabel(" / √ÂÌ‡‰Ë  ‡ˆ‡Ó‚ / ",SwingConstants.CENTER);
		lblMe.setForeground(new Color(0, 0, 0));
		lblMe.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
		lblMe.setBounds(12, 676, 551, 37);
		panel_CoverClose.add(lblMe);
						
		button_Open = new JButton("ŒÚ‚ÓË");
		button_Open.setForeground(new Color(255, 0, 0));
		button_Open.setFont(new Font("Tahoma", Font.ITALIC, 18));
		button_Open.setBounds(234, 421, 112, 32);
		panel_CoverClose.add(button_Open);
				
			button_Open.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_CoverClose.setVisible(false);
					panel_CoverOpen.setVisible(true);
					panel_RecepeSpaghetti.setVisible(true);
					panel_Center.setVisible(true);
					panel_RecepeSouffle.setVisible(true);										
			  }
		    });
		
// PANEL COVER OPEN
		panel_CoverOpen = new JPanel();
		panel_CoverOpen.setVisible(false);
		panel_CoverOpen.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, null, Color.DARK_GRAY, null));
		panel_CoverOpen.setBackground(new Color(128, 0, 0));
		panel_CoverOpen.setBounds(116, 13, 1161, 739);
		getContentPane().add(panel_CoverOpen);
		panel_CoverOpen.setLayout(null);
		
		// PANEL CENTER
				panel_Center = new JPanel();
				panel_Center.setVisible(false);
				panel_Center.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				panel_Center.setBackground(SystemColor.controlDkShadow);
				panel_Center.setBounds(575, 16, 10, 705);
				panel_CoverOpen.add(panel_Center);
				
// PANEL RECEPE SPAGHETTI		
				panel_RecepeSpaghetti = new JPanel();
				panel_RecepeSpaghetti.setBackground(new Color(255, 240, 245));
				panel_RecepeSpaghetti.setBounds(25, 23, 550, 691);
				panel_CoverOpen.add(panel_RecepeSpaghetti);
				panel_RecepeSpaghetti.setLayout(null);
				
				JLabel lblNameRecepe1 = new JLabel("–ÂˆÂÔÚ‡ Á‡ —Ô‡„ÂÚË ¡ÓÎÓÌÂÁÂ",SwingConstants.CENTER);
				lblNameRecepe1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblNameRecepe1.setBounds(12, 29, 526, 31);
				panel_RecepeSpaghetti.add(lblNameRecepe1);
				
				spaghettiModel = new DefaultListModel<String>();
				for(int i=0;i<spaghettiRecept.size();i++){
					spaghettiModel.addElement(spaghettiRecept.get(i));
				}
				
				list_Spaghetti = new JList<String>(spaghettiModel);
				list_Spaghetti.setFont(new Font("Tahoma", Font.ITALIC, 18));
				list_Spaghetti.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				list_Spaghetti.setBounds(127, 300, 310, 300);
				
				panel_RecepeSpaghetti.add(list_Spaghetti);
				
				JLabel label = new JLabel("–ÂˆÂÔÚ‡ :");
				label.setFont(new Font("Tahoma", Font.ITALIC, 16));
				label.setBounds(249, 271, 93, 16);
				panel_RecepeSpaghetti.add(label);
				
				JButton btnSortSpaghetti1 = new JButton("\u0410 --> \u042F");
				btnSortSpaghetti1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
                  
                    Collections.sort(spaghettiRecept);
                     spaghettiModel.clear();
                 	for(int i=0;i<spaghettiRecept.size();i++){
    					spaghettiModel.addElement(spaghettiRecept.get(i));
    				}
				   }       
				});
				btnSortSpaghetti1.setBounds(149, 613, 97, 25);
				panel_RecepeSpaghetti.add(btnSortSpaghetti1);
				
				JButton btnSortSpaghetti2 = new JButton("\u042F --> \u0410");
				btnSortSpaghetti2.setBounds(321, 613, 97, 25);
				panel_RecepeSpaghetti.add(btnSortSpaghetti2);
				btnSortSpaghetti2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						 Collections.sort(spaghettiRecept,Collections.reverseOrder());
		                     spaghettiModel.clear();
		                 for(int i=0;i<spaghettiRecept.size();i++){
		                	 spaghettiModel.addElement(spaghettiRecept.get(i));
		    			}
					}
				});
				
				btnSpaghetti = new JButton("");
				btnSpaghetti.setBackground(Color.DARK_GRAY);
				btnSpaghetti.setIcon(new ImageIcon("C:\\Users\\Ginadi\\Desktop\\Java project\\spaghetti\\spagetButton.jpg"));
				btnSpaghetti.setBounds(216, 100, 126, 129);
				panel_RecepeSpaghetti.add(btnSpaghetti);
				
				btnSpaghetti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						choiceRecepe = new ChoiceRecepe(new SpaghettiRecepe());
						nowrecepe = 1;
						step=-1;
						text_StepsLeft.setText("—“⁄œ » «¿ œ–»√Œ“¬ﬂÕ≈ Õ¿ —œ¿√≈“» ¡ŒÀŒÕ≈«≈");
						text_StepsRight.setText("");
						label_ImgRight.setIcon(null);
						
						panel_RecepeSpaghetti.setVisible(false);
						panel_RecepeSouffle.setVisible(false);
						panel_Left.setVisible(true);
						panel_Right.setVisible(true);
						buttonNext.setVisible(true);
						buttonBack.setVisible(true);
					}
				});
				
// PANEL RECEPE SOUFFLE
				panel_RecepeSouffle = new JPanel();
				panel_RecepeSouffle.setBounds(585, 23, 550, 691);
				panel_CoverOpen.add(panel_RecepeSouffle);
				panel_RecepeSouffle.setBackground(new Color(240, 255, 240));
				panel_RecepeSouffle.setLayout(null);
				
				JLabel lblNameRecepe2 = new JLabel("–ÂˆÂÔÚ‡ Á‡ ÿÓÍÓÎ‡‰Ó‚Ó —ÛÙÎÂ",SwingConstants.CENTER);
				lblNameRecepe2.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblNameRecepe2.setBounds(12, 29, 526, 31);
				panel_RecepeSouffle.add(lblNameRecepe2);
				
				souffleModel = new DefaultListModel<String>();
				for(int i=0;i<souffleRecept.size();i++){
					souffleModel.addElement(souffleRecept.get(i));
				}
							    
				list_Souffle = new JList<String>(souffleModel);
				list_Souffle.setFont(new Font("Tahoma", Font.ITALIC, 18));
				list_Souffle.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				list_Souffle.setBounds(127, 300, 310, 300);
				panel_RecepeSouffle.add(list_Souffle);
				
				JLabel label_1 = new JLabel("–ÂˆÂÔÚ‡:");
				label_1.setFont(new Font("Tahoma", Font.ITALIC, 16));
				label_1.setBounds(250, 271, 92, 16);
				panel_RecepeSouffle.add(label_1);
				
				JButton btnSortSouffle1 = new JButton("\u0410 --> \u042F");
				btnSortSouffle1.setBounds(156, 613, 97, 25);
				panel_RecepeSouffle.add(btnSortSouffle1);
				btnSortSouffle1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
	                    Collections.sort(souffleRecept);
	                     souffleModel.clear();
	                 	for(int i=0;i<souffleRecept.size();i++){
	    					souffleModel.addElement(souffleRecept.get(i));
	    				}	
					}
				});
				
				JButton btnSortSouffle2 = new JButton("\u042F --> \u0410");
				btnSortSouffle2.setBounds(319, 613, 97, 25);
				panel_RecepeSouffle.add(btnSortSouffle2);
				btnSortSouffle2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					 Collections.sort(souffleRecept,Collections.reverseOrder());
	                     souffleModel.clear();
	                 for(int i=0;i<souffleRecept.size();i++){
	                	 souffleModel.addElement(souffleRecept.get(i));
	    			}
				   }
				});
				
				btnSouffle = new JButton("");
				btnSouffle.setBackground(Color.DARK_GRAY);
				btnSouffle.setIcon(new ImageIcon("C:\\Users\\Ginadi\\Desktop\\Java project\\souffle\\soufleButton.jpg"));
				btnSouffle.setBounds(216, 100, 126, 129);
				panel_RecepeSouffle.add(btnSouffle);
				
				btnSouffle.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						choiceRecepe = new ChoiceRecepe(new SouffleRecepe());
						step=-1;
						text_StepsLeft.setText("—“⁄œ » «¿ œ–»√Œ“¬ﬂÕ≈ Õ¿ ÿŒ ŒÀ¿ƒŒ¬Œ —”‘À≈");
						text_StepsRight.setText("");
						label_ImgRight.setIcon(null);
						
						panel_RecepeSpaghetti.setVisible(false);
						panel_RecepeSouffle.setVisible(false);
						panel_Left.setVisible(true);
						panel_Right.setVisible(true);
						buttonNext.setVisible(true);
						buttonBack.setVisible(true);	
					}
				});
	
// PANEL LIST LEFT	
		panel_Left = new JPanel();
		panel_Left.setVisible(false);
		panel_Left.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_Left.setBackground(Color.WHITE);
		panel_Left.setBounds(25, 23, 550, 691);
		panel_CoverOpen.add(panel_Left);
		panel_Left.setLayout(null);
		
		text_StepsLeft = new JTextArea("");
		text_StepsLeft.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text_StepsLeft.setBounds(39, 150, 469, 50);
		panel_Left.add(text_StepsLeft);
		
		label_ImgLeft = new JLabel("");
		label_ImgLeft.setBounds(70, 280, 410, 300);
		panel_Left.add(label_ImgLeft);
		
		buttonRecepeBack = new JButton("»Á·ÂÂÚÂ ‰Û„‡ ÂˆÂÔÚ‡ !");
		buttonRecepeBack.setForeground(Color.RED);
		buttonRecepeBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		buttonRecepeBack.setBounds(139, 329, 257, 35);
		panel_Left.add(buttonRecepeBack);
		
		buttonRecepeBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_RecepeSpaghetti.setVisible(true);
				panel_RecepeSouffle.setVisible(true);
				panel_Left.setVisible(false);
				panel_Right.setVisible(false);
				buttonNext.setVisible(false);
				buttonBack.setVisible(false);
			}
		});
		
		
// PANEL LIST RIGHT
		panel_Right = new JPanel();
		panel_Right.setVisible(false);
		panel_Right.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_Right.setBackground(Color.WHITE);
		panel_Right.setBounds(585, 23, 550, 691);
		panel_CoverOpen.add(panel_Right);
		panel_Right.setLayout(null);
		
		text_StepsRight = new JTextArea("");
		text_StepsRight.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text_StepsRight.setBounds(39, 150, 474, 50);
		panel_Right.add(text_StepsRight);
		
		label_ImgRight = new JLabel("");
		label_ImgRight.setBounds(70, 280, 410, 300);
		panel_Right.add(label_ImgRight);
		
// NAVIGATION BUTTONS
		
		buttonBack = new JButton("");
		buttonBack.setBackground(SystemColor.menu);
		buttonBack.setIcon(new ImageIcon("C:\\Users\\Ginadi\\Desktop\\Java project\\back.png"));
		buttonBack.setForeground(new Color(165, 42, 42));
		buttonBack.setVisible(false);
		buttonBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		buttonBack.setBounds(23, 343, 86, 81);
		getContentPane().add(buttonBack);
		
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(choiceRecepe.recipe!=null){
					
					if(step==0){
						step=1;
					}
                if(step >= 1 ){ 
				step--;
				text_StepsRight.setText(choiceRecepe.getStep(step));
				img = new ImageIcon(this.getClass().getResource(choiceRecepe.getImagePath(step))).getImage();
				label_ImgRight.setIcon(new ImageIcon(img));
				buttonRecepeBack.setVisible(false);
                }
				}
					
					if(step==0){
						if(nowrecepe == 1 ){
						text_StepsLeft.setText("—“⁄œ » «¿ œ–»√Œ“¬ﬂÕ≈ Õ¿ —œ¿√≈“» ¡ŒÀŒÕ≈«≈");
						label_ImgLeft.setIcon(null);
						buttonRecepeBack.setVisible(true);
						
						}else{
							text_StepsLeft.setText("—“⁄œ » «¿ œ–»√Œ“¬ﬂÕ≈ Õ¿ ÿŒ ŒÀ¿ƒŒ¬Œ —”‘À≈");
							label_ImgLeft.setIcon(null);
							buttonRecepeBack.setVisible(true);
						}
					 }
                if(step >= 1 ){    
				step--;
				text_StepsLeft.setText(choiceRecepe.getStep(step));
				img = new ImageIcon(this.getClass().getResource(choiceRecepe.getImagePath(step))).getImage();
				label_ImgLeft.setIcon(new ImageIcon(img));
				buttonRecepeBack.setVisible(false);
                }
				}
		});
		
		buttonNext = new JButton("");
		buttonNext.setBackground(SystemColor.menu);
		buttonNext.setIcon(new ImageIcon("C:\\Users\\Ginadi\\Desktop\\Java project\\next.png"));
		buttonNext.setForeground(new Color(0, 128, 0));
		buttonNext.setVisible(false);
		buttonNext.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		buttonNext.setBounds(1285, 343, 86, 81);
		getContentPane().add(buttonNext);
		
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				if(choiceRecepe.recipe!=null){
					
					if(step==choiceRecepe.recipe.getStrps().size()-1){
						step=choiceRecepe.recipe.getStrps().size()-2;
					}
				if(step!=-1&&step<choiceRecepe.recipe.getStrps().size()-2){
				step++;
				text_StepsLeft.setText(choiceRecepe.getStep(step));
				img = new ImageIcon(this.getClass().getResource(choiceRecepe.getImagePath(step))).getImage();
				label_ImgLeft.setIcon(new ImageIcon(img));
				buttonRecepeBack.setVisible(false);
				}
					
					
				step++;
				if(step<=choiceRecepe.recipe.getStrps().size()-1){
				text_StepsRight.setText(choiceRecepe.getStep(step));
				img = new ImageIcon(this.getClass().getResource(choiceRecepe.getImagePath(step))).getImage();
				label_ImgRight.setIcon(new ImageIcon(img));
				buttonRecepeBack.setVisible(false);
				}else{
					text_StepsRight.setText("");
					label_ImgRight.setIcon(null);
					buttonRecepeBack.setVisible(true);
					step--;
				}
				
				}
			}
		});
		
		
		this.setVisible(true);
	}
}
