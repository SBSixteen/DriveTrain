import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class ManSelect extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int speed = 16;
	double old = speed * 1;
	int sel = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManSelect frame = new ManSelect();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	Timer tm = new Timer(16, this);
	JLabel Reading = new JLabel("---.--");
	JLabel Top_1 = new JLabel("DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN .     ");
	JLabel Top_2 = new JLabel("DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN      ");
	JLabel Top_3 = new JLabel("DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN . DRIVETRAIN .     ");
	Canvas block = new Canvas();
	
	boolean reverse = false;
	boolean reached = false;
	
    public void actionPerformed(ActionEvent e) {
    	if(!reached) {
    		block.setBounds(block.getX()+speed, block.getY(), block.getWidth(), block.getHeight());
    		if(block.getX() >1380) {
        		block.setBounds(-140,700, block.getWidth(), block.getHeight());
        		double X = Math.random()*20 + Math.random()*10;
        		Reading.setText(new DecimalFormat("###.##").format(old*10) + " km/h");
        		
        		speed = (int) (X);
        		old = X;
    		}
    	}
    	
    	
		if(!reverse) {
		Top_1.setBounds(Top_1.getX()+1, Top_1.getY(), 1766, 14);
		Top_3.setBounds(Top_3.getX()+1, Top_3.getY(), 1766, 14);
		Top_2.setBounds(Top_2.getX()-1, Top_2.getY(), 1766, 14);
		    if(Top_1.getX() == -10) {
			reverse = true;
		    }
		}else {
			
			Top_1.setBounds(Top_1.getX()-1, Top_1.getY(), 1766, 14);
			Top_3.setBounds(Top_3.getX()-1, Top_3.getY(), 1766, 14);
			Top_2.setBounds(Top_2.getX()+1, Top_2.getY(), 1766, 14);
		    if(Top_1.getX() == -400) {
			reverse = false;
		    }
		    
		}
		
	}
	
	public ManSelect() {
		
		setResizable(false);
		
		ImageIcon[] A = new ImageIcon[20];
		
		String[] Adr = (new File("C:\\DriveTrain\\LOGOS\\").list());
		tm.start();
		
		for (int i = 0; i < Adr.length; i++) {
		    A[i] = new ImageIcon("C:\\DriveTrain\\LOGOS\\"+Adr[i]);	
		    Adr[i] = Adr[i].substring(0, Adr[i].indexOf(".png"));
		}
		
		
		setTitle("Manufacturer Select | DriveTrain");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 00, 1280, 720);
		
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		char[] yolo = Adr[0].toCharArray();
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(new Color(220, 20, 60));
		canvas_2.setBounds(1272, 595, 33, 115);
		contentPane.add(canvas_2);
		Canvas canvas_3 = new Canvas();
		canvas_3.setBackground(Color.WHITE);
		contentPane.add(canvas_3);
		canvas_3.setBounds((1265)-((yolo.length)*17), 623, (yolo.length+1)*17, 2);
		
		JLabel Title = new JLabel("DriveTrain");
		Title.setForeground(Color.WHITE);
		Title.setBackground(Color.WHITE);
		Title.setFont(new Font("Exo 2 Medium", Font.PLAIN, 56));
		Title.setBounds(20, 636, 268, 51);
		contentPane.add(Title);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.RED);
		canvas.setBounds(24, 693, 196, 8);
		contentPane.add(canvas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.WHITE);
		canvas_1.setBounds(240, 693, 8, 8);
		contentPane.add(canvas_1);
		
		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setBackground(Color.WHITE);
		canvas_1_1.setBounds(254, 693, 8, 8);
		contentPane.add(canvas_1_1);
		
		Canvas canvas_1_2 = new Canvas();
		canvas_1_2.setBackground(Color.WHITE);
		canvas_1_2.setBounds(268, 693, 8, 8);
		contentPane.add(canvas_1_2);
		
		Canvas canvas_1_3 = new Canvas();
		canvas_1_3.setBackground(Color.WHITE);
		canvas_1_3.setBounds(282, 693, 8, 8);
		contentPane.add(canvas_1_3);
		
		Canvas canvas_1_4 = new Canvas();
		canvas_1_4.setBackground(Color.WHITE);
		canvas_1_4.setBounds(226, 693, 8, 8);
		contentPane.add(canvas_1_4);
		
		Top_1.setFont(new Font("Exo 2 Light", Font.ITALIC, 14));
		Top_1.setForeground(Color.WHITE);
		Top_1.setBounds(-475, 11, 1766, 14);
		contentPane.add(Top_1);
		
		Top_2.setForeground(new Color(220, 20, 60));
		Top_2.setFont(new Font("Exo 2 Light", Font.ITALIC, 14));
		Top_2.setBounds(-29, 27, 2259, 14);
		contentPane.add(Top_2);
		
		Top_3.setForeground(Color.WHITE);
		Top_3.setFont(new Font("Exo 2 Light", Font.ITALIC, 14));
		Top_3.setBounds(-475, 44, 1766, 14);
		contentPane.add(Top_3);
		
		block.setBackground(Color.WHITE);
		block.setBounds(24, 702, 196, 8);
		contentPane.add(block);
		
		JLabel cars = new JLabel("Cars : ");
		cars.setHorizontalAlignment(SwingConstants.TRAILING);
		cars.setForeground(Color.WHITE);
		cars.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		cars.setBackground(Color.WHITE);
		cars.setBounds(1168, 620, 98, 37);
		contentPane.add(cars);
		
		Reading.setHorizontalAlignment(SwingConstants.TRAILING);
		Reading.setForeground(Color.WHITE);
		Reading.setFont(new Font("Exo 2 Medium", Font.PLAIN, 36));
		Reading.setBackground(Color.WHITE);
		Reading.setBounds(1052, 642, 214, 51);
		contentPane.add(Reading);
		
		JPanel prevp = new JPanel();
		prevp.setBackground(Color.BLACK);
		prevp.setBounds(20, 339, 25, 75);
		contentPane.add(prevp);
		prevp.setLayout(null);
		
		JLabel prev = new JLabel("[");
		prev.setForeground(Color.WHITE);
		prev.setFont(new Font("Exo 2 Thin", Font.PLAIN, 64));
		prev.setBounds(0, -11, 25, 86);
		prevp.add(prev);
		
		JLabel Logo = new JLabel("");
		Logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(Adr[sel]);
				System.exit(0);
			}
		});
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setIcon(A[0]);
		Logo.setBackground(new Color(0, 0, 0));
		Logo.setBounds(129, 69, 1101, 515);
		contentPane.add(Logo);
		
		JPanel nextp = new JPanel();
		nextp.setLayout(null);
		nextp.setBackground(Color.BLACK);
		nextp.setBounds(1240, 339, 25, 75);
		contentPane.add(nextp);
		
		JLabel next = new JLabel("]");
		next.setHorizontalAlignment(SwingConstants.TRAILING);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Exo 2 Thin", Font.PLAIN, 64));
		next.setBounds(0, -11, 25, 86);
		nextp.add(next);
		
		JLabel name = new JLabel(Adr[0]);
		name.setHorizontalAlignment(SwingConstants.TRAILING);
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Exo 2 Medium", Font.PLAIN, 30));
		name.setBounds(1005, 589, 261, 37);
		contentPane.add(name);
		
		Canvas canvas_2_1 = new Canvas();
		canvas_2_1.setBackground(new Color(220, 20, 60));
		canvas_2_1.setBounds(10, 500, 1, 210);
		contentPane.add(canvas_2_1);

	    String[] temp = new File("C:\\DriveTrain\\CARS\\"+Adr[sel]+"\\").list();				    
	    if(temp == null) {
	    	cars.setText("Cars : 0");
	    }else {	    
		cars.setText("Cars : " + temp.length);
	    }
		
		prev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				prevp.setBackground(Color.RED);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(sel>0) {
					sel--;
					Logo.setIcon(A[sel]);
					char[] toptop = Adr[sel].toCharArray();
					name.setText(Adr[sel]);
					canvas_3.setBounds((1265)-((toptop.length)*17), 623, (toptop.length+1)*17, 2);
				    String[] temp = new File("C:\\DriveTrain\\CARS\\"+Adr[sel]+"\\").list();				    
				    if(temp == null) {
				    	cars.setText("Cars : 0");
				    }else {	    
					cars.setText("Cars : " + temp.length);
				    }
					toptop = null;
				}else {
					sel = Adr.length-1;
					Logo.setIcon(A[sel]);
					char[] toptop = Adr[sel].toCharArray();
					name.setText(Adr[sel]);
					canvas_3.setBounds((1265)-((toptop.length)*17), 623, (toptop.length+1)*17, 2);
				    String[] temp = new File("C:\\DriveTrain\\CARS\\"+Adr[sel]+"\\").list();				    
				    if(temp == null) {
				    	cars.setText("Cars : 0");
				    }else {	    
					cars.setText("Cars : " + temp.length);
				    }
					toptop = null;
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				prevp.setBackground(Color.BLACK);
			}
		});
		
		next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextp.setBackground(Color.RED);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(sel<Adr.length-1) {
					sel++;
					Logo.setIcon(A[sel]);
					char[] toptop = Adr[sel].toCharArray();
					name.setText(Adr[sel]);
					canvas_3.setBounds((1265)-((toptop.length)*17), 623, (toptop.length+1)*17, 2);
				    String[] temp = new File("C:\\DriveTrain\\CARS\\"+Adr[sel]+"\\").list();				    
				    if(temp == null) {
				    	cars.setText("Cars : 0");
				    }else {	    
					cars.setText("Cars : " + temp.length);
				    }
					toptop = null;
				}else {
					sel = 0;
					Logo.setIcon(A[sel]);
					char[] toptop = Adr[sel].toCharArray();
					name.setText(Adr[sel]);
					canvas_3.setBounds((1265)-((toptop.length)*17), 623, (toptop.length+1)*17, 2);
				    String[] temp = new File("C:\\DriveTrain\\CARS\\"+Adr[sel]+"\\").list();				    
				    if(temp == null) {
				    	cars.setText("Cars : 0");
				    }else {	    
					cars.setText("Cars : " + temp.length);
				    }
					toptop = null;
				}
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextp.setBackground(Color.BLACK);
			}
		});
		
	}
}
