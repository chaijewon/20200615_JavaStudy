package com.sist.client;
// ������ => ���� 
// GridLayout 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
// ������â => JFrame
/*
 *    break
 *    continue
 *    ========= �ݺ��� �Ѱ��� ���� 
 *    for(int i=1;i<=5;i++)
 *    {
 *       for(int j=1;j<=5;j++)
 *       {
 *           if(j==2)
 *              break;
 *       }
 *       break;
 *    }
 *    i=1 => j=1
 *    i=2 => j=1
 */
public class PuzzleGame extends JFrame implements ActionListener{
    JButton b1,b2;
    JButton[][] pan=new JButton[3][3];
    int[][] panCount=new int[3][3];
    int brow=0;
    int bcol=0;
    // 0~8 ���� �߻� 
    public void getRand()
    {
    	int[] com=new int[9];// �ߺ����� �������� ���� 
    	int su=0;// �����߻��� ������ ���� 
    	boolean bCheck=false;//�ߺ����� Ȯ�� 
    	for(int i=0;i<9;i++)
    	{
    		// ���� �߻� 
    		bCheck=true;
    		while(bCheck)
    		{
    			su=(int)(Math.random()*9); //0~8
    			bCheck=false;
    			// �˻� => ����� �����Ͱ� �ߺ����� Ȯ�� 
    			for(int j=0;j<i;j++)
    			{
    				if(su==com[j])// ���� ���� ���� 
    				{
    					// while�� �ٽ� ���� 
    					bCheck=true;
    					break;
    				}
    				
    			}
    		}
    		com[i]=su;
    		
    		panCount[i/3][i%3]=su;
    		
    		if(su==8)
    		{
    			brow=i/3;
    			bcol=i%3;
    		}
    	}
    }
    // ��ġ �Լ� 
    public void display()
    {
    	for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++)
    		{
    			if(i==brow && j==bcol)
    			{
    				pan[i][j].setText("");
    				pan[i][j].setEnabled(false);
    			}
    			else
    			{
    			   pan[i][j].setText(String.valueOf(panCount[i][j]+1));
    			   pan[i][j].setEnabled(true);
    			}
    		}
    	}
    }
    // ��ư Ŭ�� 
    public PuzzleGame() // ������ => Ŭ������ �޸𸮿� �����Ҷ� ���� ���� ȣ��Ǵ� �޼ҵ�
    {
    	// ��ġ
    	b1=new JButton("����");
    	b2=new JButton("����");
    	JPanel p=new JPanel();
    	p.add(b1);p.add(b2);
    	add("South",p);
    	
    	
    	JPanel p2=new JPanel();
    	p2.setLayout(new GridLayout(3,3,5,5));
    	int k=1;
    	for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++)
    		{
    			pan[i][j]=new JButton(String.valueOf(k));
    			pan[i][j].setFont(new Font("����ü",Font.BOLD,50));
    			p2.add(pan[i][j]);
    			pan[i][j].addActionListener(this);
    			k++;
    		}
    	}
    	
    	add("Center",p2);
    	
    	getRand();
    	display();
    	
    	setSize(350, 400);
    	setVisible(true);
    	
    	b1.addActionListener(this);//�̺�Ʈ ��� 
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new PuzzleGame();
        // ������ ȣ��ÿ��� �ݵ�� �տ� new 
	}
	// ���Ῡ�� Ȯ��
	public boolean isEnd()
	{
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
		return true;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			display();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(e.getSource()==pan[i][j])
				{
					panCount[brow][bcol]=panCount[i][j];
					panCount[i][j]=8;
					brow=i;
					bcol=j;
					
					display();
					if(isEnd())
					{
						JOptionPane.showMessageDialog(this, "Game Over!!");
						System.exit(0);
					}
				}
			}
		}
	}

}





