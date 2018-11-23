import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.sql.*;
	
	public class Laboratoria1 extends JFrame {
		 private static final long serialVersionUID = 1L;
		  private JPanel contentPane;
		  private JTextField tf1;
		  private JTextField tf2;
		  private JLabel labelResultado;
		  private JButton btnConsultaPorCdigo;
		  private JLabel lblIngreseCdigoDe;
		  private JTextField tf3;
		  private JTextField tf11;
		  private JTextField tf22;
		  private JLabel labelResultado2;
		  private JButton btnConsultaPorCdigo2;
		  private JTextField tf33;


		  public static void main(String[] args) {
		    EventQueue.invokeLater(new Runnable() {
		      public void run() {
		        try {
		        	Laboratoria1 frame = new Laboratoria1();
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
		  public Laboratoria1() {
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setBounds(100, 100, 606, 600);
		    contentPane = new JPanel();
		    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		    setContentPane(contentPane);
		    contentPane.setLayout(null);
		    
		    JLabel lblDescripcinDelArtculo = new JLabel("Descripción del artículo:");
		    lblDescripcinDelArtculo.setBounds(23, 38, 193, 14);
		    //lblDescripcinDelArtculo.setForeground(Color.white);
		    contentPane.add(lblDescripcinDelArtculo);
		    
		    tf1 = new JTextField();
		    tf1.setBounds(247, 35, 193, 20);
		    contentPane.add(tf1);
		    tf1.setColumns(10);
		    
		    JLabel lblPrecio = new JLabel("Precio:");
		    lblPrecio.setBounds(23, 74, 95, 14);
		    contentPane.add(lblPrecio);
		    
		    tf2 = new JTextField();
		    tf2.setBounds(247, 71, 107, 20);
		    contentPane.add(tf2);
		    tf2.setColumns(10);
		    
		    JButton btnAlta = new JButton("Alta");
		    btnAlta.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent arg0) {
		        labelResultado.setText("");        
		        try {
		          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/App","root" ,"password");
		          Statement comando=conexion.createStatement();
		          comando.executeUpdate("insert into laboratorio1(articulos,precio) values ('"+tf1.getText()+"',"+tf2.getText()+")");
		          conexion.close();
		          labelResultado.setText("se registraron los datos");
		          tf1.setText("");
		          tf2.setText("");
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }
		      }
		    });
		    btnAlta.setBounds(247, 118, 89, 23);
		    contentPane.add(btnAlta);
		    
		    labelResultado = new JLabel("resultado");
		    labelResultado.setBounds(361, 122, 229, 14);
		    contentPane.add(labelResultado);
		    
		    btnConsultaPorCdigo = new JButton("Consulta por código");
		    btnConsultaPorCdigo.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent arg0) {
		        labelResultado.setText("");
		        tf1.setText("");
		        tf2.setText("");        
		        try {
			          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/App","root" ,"password");
		          Statement comando=conexion.createStatement();
		          ResultSet registro = comando.executeQuery("select articulos,precio from laboratorio1 where idlaboratorio1="+tf3.getText());
		          if (registro.next()==true) {
		            tf1.setText(registro.getString("articulos"));
		            tf2.setText(registro.getString("precio"));
		          } else {
		            labelResultado.setText("No existe un artículo con dicho código");
		          }
		          conexion.close();
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }
		      }
		    });
		    btnConsultaPorCdigo.setBounds(23, 212, 177, 23);
		    contentPane.add(btnConsultaPorCdigo);
		    
		    lblIngreseCdigoDe = new JLabel("Ingrese código de articulo a consultar:");
		    lblIngreseCdigoDe.setBounds(23, 179, 243, 14);
		    contentPane.add(lblIngreseCdigoDe);
		    
		    tf3 = new JTextField();
		    tf3.setBounds(247, 176, 86, 20);
		    contentPane.add(tf3);
		    tf3.setColumns(10);
		    /*BLOQUE DE CLASE FORMULARIO INTERFACE*/
		    JLabel lblDescripcinDelArtculo2 = new JLabel("Descripción del artículo:");
		    lblDescripcinDelArtculo2.setBounds(23, 300, 193, 14);
		    contentPane.add(lblDescripcinDelArtculo2);
		    
		    tf11 = new JTextField();
		    tf11.setBounds(247, 297, 193, 20);
		    contentPane.add(tf11);
		    tf11.setColumns(10);
		    
		    JLabel lblPrecio2 = new JLabel("Precio:");
		    lblPrecio2.setBounds(23, 336, 95, 14);
		    contentPane.add(lblPrecio2);
		    
		    tf22 = new JTextField();
		    tf22.setBounds(247, 333, 107, 20);
		    contentPane.add(tf22);
		    tf22.setColumns(10);
		    
		    labelResultado2 = new JLabel("resultado");
		    labelResultado2.setBounds(361, 374, 229, 14);
		    contentPane.add(labelResultado2);
		    
		    btnConsultaPorCdigo2 = new JButton("Consulta por código");
		    btnConsultaPorCdigo2.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent arg0) {
		        labelResultado2.setText("");
		        tf11.setText("");
		        tf22.setText("");        
		        try {
			          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/App","root" ,"password");
		          Statement comando=conexion.createStatement();
		          ResultSet registro = comando.executeQuery("select articulos,precio from laboratorio1 where idlaboratorio1="+tf33.getText());
		          if (registro.next()==true) {
		            tf11.setText(registro.getString("articulos"));
		            tf22.setText(registro.getString("precio"));
		          } else {
		            labelResultado2.setText("No existe un artículo con dicho código");
		          }
		          conexion.close();
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }
		      }
		    });
		    btnConsultaPorCdigo2.setBounds(25, 374, 177, 23);
		    contentPane.add(btnConsultaPorCdigo2);
		    
		    tf33 = new JTextField();
		    tf33.setBounds(247, 375, 86, 20);
		    contentPane.add(tf33);
		    tf33.setColumns(10);
		    
		    JButton btnNewButton2 = new JButton("Borrar");
		    btnNewButton2.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent arg0) {
		        labelResultado2.setText("");
		        try {
			          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/App","root" ,"password");
		          Statement comando=conexion.createStatement();
		          int cantidad = comando.executeUpdate("delete from laboratorio1 where idlaboratorio1="+tf33.getText());
		          if (cantidad==1) {
		            tf11.setText("");
		            tf22.setText("");        
		            labelResultado2.setText("Se borro el artículo con dicho código");
		          } else {
		            labelResultado2.setText("No existe un artículo con dicho código");
		          }
		          conexion.close();
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }        
		      }
		    });
		    btnNewButton2.setBounds(24, 408, 177, 23);
		    contentPane.add(btnNewButton2);
		    
		    JButton btnNewButton_2 = new JButton("Modificar");
		    btnNewButton_2.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        labelResultado2.setText("");
		        try {
			          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/App","root" ,"password");
		          Statement comando=conexion.createStatement();
		          int cantidad = comando.executeUpdate("update laboratorio1 set articulos='"+tf11.getText()+"',"+
		                                           "precio="+tf22.getText()+" where idlaboratorio1="+tf33.getText());
		          if (cantidad==1) {
		            labelResultado2.setText("Se modifico la descripcion y el precio del artículo con dicho código");
		          } else {
		            labelResultado2.setText("No existe un artículo con dicho código");
		          }
		          conexion.close();
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }                
		      }
		    });
		    btnNewButton_2.setBounds(21, 441, 179, 23);
		    contentPane.add(btnNewButton_2);
		    cargarDriver();
		    
		  }
		  
		  public void paint(Graphics g){
			    super.paint(g);
			    g.setColor(Color.blue);
			    g.drawRoundRect(15, 50, 500, 140, 50, 50);
			    g.drawRoundRect(15, 200, 500, 90, 50, 50);
			    g.drawRoundRect(15, 300, 500, 210, 50, 50);
			   // g.fillRoundRect(15, 50, 500, 145, 6, 6);
			    
		  }
		  
		  private void cargarDriver() {
		    try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		    }catch(Exception ex) {
		      setTitle(ex.toString());
		    }
		  }
		}
		    
