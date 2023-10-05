class App 
{ 
	public static void main(String a[]) throws java.awt.HeadlessException
{
	java.awt.Frame f1=new java.awt.Frame();
	java.awt.GridLayout b=new java.awt.GridLayout();
	java.awt.Button b1=new java.awt.Button("Click me"),b2=new java.awt.Button("second button");
	f1.setSize(1200,1000);
	f1.setLayout(b);
	b1.setSize(50,50);
	f1.setTitle("This is our first awt program");
	
	b.setColumns(2);
	b.setRows(2);
	f1.add(b1);
	f1.add(b2);
	f1.setLayout(null);
	b1.setBounds(100,100,100,100);
	b2.setBounds(200,200,100,100);
	System.out.println(b.getColumns());
	System.out.println(b.getRows());
	f1.setVisible(true);
	
}
}