/**
 * @(#)FunColor.java
 *
 *
 * @author
 * @version 1.00 2018/3/3
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.ArrayList;

public class FunColor extends JFrame implements ActionListener{

	private JTextField nameTxt5 = new JTextField(5);
    private JLabel nameLbl4 = new JLabel("TextField");


//Student panel
	private JTextField idTxt = new JTextField(10);
    private JLabel idLbl = new JLabel("ID: ");
    private JTextField nameTxt = new JTextField(10);
    private JLabel nameLbl = new JLabel("Surname: \t ");

    //Graduate panel
    private JTextField qualTxt = new JTextField(10);
    private JLabel qualLbl = new JLabel("Qualification: \t");
    private JTextField feTxt = new JTextField(10);
    private JLabel feLbl = new JLabel("Fee: \t ");

    //Operations panel
    private JButton addBtn = new JButton("ADD");
    private JButton sortBtn = new JButton("SORT");
    private JButton displayBtn = new JButton("DISPLAY");


	ArrayList<Graduate> myGrade = new ArrayList<>();


    /**declare radio buttons*/
	 private JLabel nameLb7 = new JLabel("\n RadioButton");
    private JRadioButton greenRadio = new JRadioButton("Green");
    private JRadioButton yellowRadio = new JRadioButton("Yellow");

    /**group for radio buttons*/
    private ButtonGroup group = new ButtonGroup();

    /**declare text area*/
    private JTextArea messagetxt = new JTextArea(30,40);

    /**declare panels */
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JPanel leftPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    JPanel middlePanel = new JPanel();
    JPanel bottomPanel1 = new JPanel();
    JPanel bottomPanel2 = new JPanel();
    JPanel middlePanel1 = new JPanel();
    JPanel middlePanel2 = new JPanel();
    JPanel bottomPanel3 = new JPanel();
    JPanel middlePanel3 = new JPanel();


    TitledBorder title;
    /**
     * Constructor for objects of class GuiExample
     */



    public FunColor() {

    	//**call parent class constructor
//        super();
      super("Fun with Colors");

        /**layout of the frame */
        setLayout(new FlowLayout());
        //setLayout(new GridLayout(5,3));
        setLayout(new BorderLayout());

        /**set layout of each panel*/


        topPanel.setLayout(new FlowLayout());
       bottomPanel.setLayout(new GridLayout(2,1));
        leftPanel.setLayout(new GridLayout(5,1));
        rightPanel.setLayout(new GridLayout(3,1));
        middlePanel.setLayout(new GridLayout(2,1));
        bottomPanel1.setLayout(new FlowLayout());
        bottomPanel2.setLayout(new GridLayout(4,1));
        middlePanel1.setLayout(new FlowLayout());
        middlePanel2.setLayout(new FlowLayout());
        //middlePanel3.setLayout(new flowLayout());
        bottomPanel3.setLayout(new FlowLayout());


//headings or tittles of panels
		title = BorderFactory.createTitledBorder(" ");
        middlePanel3.setBorder(title);

         title = BorderFactory.createTitledBorder("STUDENT");
        middlePanel1.setBorder(title);

        title = BorderFactory.createTitledBorder("GRADUATE");
        middlePanel2.setBorder(title);

        title = BorderFactory.createTitledBorder("OPERATIONS");
        bottomPanel3.setBorder(title);



  //Student text and label
		middlePanel1.add(idLbl);
		middlePanel1.add(idTxt);
		idTxt.addActionListener(this);
		middlePanel1.add(nameLbl);
		middlePanel1.add(nameTxt);
		nameTxt.addActionListener(this);


  	//Graduation text and label
		 middlePanel2.add(qualLbl);
		 middlePanel2.add(qualTxt);
		 qualTxt.addActionListener(this);
		 middlePanel2.add(feLbl);
		 middlePanel2.add(feTxt);
		 feTxt.addActionListener(this);

	//panels color
		middlePanel3.add(nameLbl4);
		middlePanel3.add(nameTxt5);
		nameTxt5.addActionListener(this);




 	//Operations buttons and labels
 		bottomPanel3.add(addBtn);
 		bottomPanel3.add(sortBtn);
 		bottomPanel3.add(displayBtn);


	//Operation buttons with listener
		addBtn.addActionListener(this);
		sortBtn.addActionListener(this);
		displayBtn.addActionListener(this);



	//Structure of panels and what inside
        middlePanel.add(middlePanel1);
        middlePanel.add(middlePanel2);
        bottomPanel.add(bottomPanel3);


        /**adding radio buttons group and to Frame*/
        leftPanel.add(nameLb7);
        group.add(yellowRadio);
        group.add(greenRadio);
        leftPanel.add(yellowRadio);
        leftPanel.add(greenRadio);

        /**register components with listener*/
        yellowRadio.addActionListener(this);
        greenRadio.addActionListener(this);

        /**adding textfield and label to Frame*/
        leftPanel.add(nameLbl4);
        leftPanel.add(nameTxt5);

        /**register components with listener*/
        nameTxt5.addActionListener(this);

//***************Populating a JTable with data from an Arraylist************************************


        middlePanel2.add(messagetxt);
        middlePanel.add(middlePanel1);
        middlePanel.add(middlePanel2);



        bottomPanel.add(bottomPanel1);
        bottomPanel.add(bottomPanel2);
//*************************************************************************************
        /**Now that all the panels are populated we can add each panel to the frame
         **/

       	add(topPanel,BorderLayout.NORTH);
        add(middlePanel,BorderLayout.CENTER);
        add(bottomPanel,BorderLayout.SOUTH);
        add(leftPanel,BorderLayout.WEST);
       	add(rightPanel,BorderLayout.EAST);

        }

    public void actionPerformed(ActionEvent e)
    {
        /*if (e.getSource()==redBtn)
            messagetxt.setBackground(Color.red);
        else if (e.getSource()==blueBtn){
                messagetxt.setBackground(Color.blue);
                messagetxt.setForeground(Color.white);
            }
            else if (e.getSource()==yellowRadio){
                messagetxt.setBackground(Color.yellow);
                messagetxt.setForeground(Color.white);
            }

             else if (e.getSource()==greenRadio){
                messagetxt.setBackground(Color.green);
                messagetxt.setForeground(Color.white);
            }

        if (e.getSource()== nameTxt){

            messagetxt.append(nameTxt.getText()+"\n");
       }
       else if (e.getSource()== readBtn){
            messagetxt.setBackground(Color.white);
            messagetxt.setForeground(Color.black);
            messagetxt.append(nameTxt.getText()+ "\n");
       }
            else if (e.getSource()==exitBtn)
           		{
          			System.exit(0);

       			}*/

		if(e.getSource()== addBtn){
			String id=idTxt.getText();
  		String name=nameTxt.getText();
  		String qualification=qualTxt.getText();
  		double fees=Double.parseDouble(feTxt.getText());

  		myGrade.add(new Graduate(id,name,qualification,fees));

  		idTxt.setText("");
  		nameTxt.setText("");
  		qualTxt.setText("");
  		feTxt.setText("");

  		JOptionPane.showMessageDialog(null,"Student is added");
  	}

  	else if(e.getSource()== displayBtn)
  	{
  		String nawo="";

  		for(int i=0; i<myGrade.size();i++)
  		{
  			nawo=myGrade.get(i).toString();

  		}
  		JOptionPane.showMessageDialog(null,nawo);
  	}


        }


    }


