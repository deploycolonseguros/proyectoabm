import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.sql.*;


public class TablaMoto extends JFrame {
	 private static final long serialVersionUID = 1L;
	 private JTextField marcodinf;
	 private JTextField modcodinf;
	 private JTextField marca;
	 private JTextField modelo;
	 private JTextField codigo;
	 private JTextField grupo;
	 private JTextField codigorea;
	 private JTextField anio;
	 private JTextField val;
	 private JTextField valanio;
	 private JTextField val01;
	 private JTextField val02;
	 private JTextField val03;
	 private JTextField val04;
	 private JTextField val05;
	 private JTextField val06;
	 private JTextField val07;
	 private JTextField val08;
	 private JTextField val09;
	 private JTextField val10;	 
	 private JTextField val11;
	 private JTextField val12;
	 private JTextField val13;
	 private JTextField val14;
	 private JTextField val15;
	 private JTextField val16;
	 private JTextField val17;
	 private JTextField val18;
	 private JTextField val19;
	 private JLabel labelResultado;
	private JTextField dato2;
	private JTextField dato1;
	 
	 
	 
	  public static void main(String[] args) {
		    EventQueue.invokeLater(new Runnable() {
		      public void run() {
		        try {
		        	TablaMoto frame = new TablaMoto();
		        	frame.setVisible(true);
		        } catch (Exception e) {
		          e.printStackTrace();
		        }
		      }
		    });
		  }
	  		public TablaMoto() {
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setBounds(100, 100, 800, 900);
		    JPanel contentPane = new JPanel();
		    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		    setContentPane(contentPane);
		    contentPane.setLayout(null);
		    
		    JLabel label1 = new JLabel("Codigo de Marca");
		    label1.setBounds(23, 30, 150, 14);
		    contentPane.add(label1);
		    
		    JLabel label2 = new JLabel("Codigo de Modelo");
		    label2.setBounds(23, 50, 150, 14);
		    contentPane.add(label2);
		    
		    JLabel label3 = new JLabel("Marca");
		    label3.setBounds(23, 70, 150, 14);
		    contentPane.add(label3);
		    
		    JLabel label4 = new JLabel("Modelo");
		    label4.setBounds(23, 90, 150, 14);
		    contentPane.add(label4);
		    
		    JLabel label5 = new JLabel("Codigo");
		    label5.setBounds(23, 110, 150, 14);
		    contentPane.add(label5);
		    
		    JLabel label6 = new JLabel("Grupo");
		    label6.setBounds(23, 130, 150, 14);
		    contentPane.add(label6);
		    
		    JLabel label7 = new JLabel("Codigo Rea");
		    label7.setBounds(23, 150, 150, 14);
		    contentPane.add(label7);
		    
		    JLabel label8 = new JLabel("Codigo de Modelo");
		    label8.setBounds(23, 170, 150, 14);
		    contentPane.add(label8);

		    JLabel label9 = new JLabel("Codigo de Modelo000000");
		    label9.setBounds(23, 190, 150, 14);
		    contentPane.add(label9);
		    
		    JLabel label10 = new JLabel("Codigo de Modelo");
		    label10.setBounds(23, 210, 150, 14);
		    contentPane.add(label10);
		    
		    JLabel label11 = new JLabel("Codigo de Modelo");
		    label11.setBounds(23, 230, 150, 14);
		    contentPane.add(label11);
		    
		    JLabel label12 = new JLabel("Codigo de Modelo");
		    label12.setBounds(23, 250, 150, 14);
		    contentPane.add(label12);
		    
		    JLabel label13 = new JLabel("Codigo de Modelo");
		    label13.setBounds(23, 270, 150, 14);
		    contentPane.add(label13);
		    
		    JLabel label14 = new JLabel("Codigo de Modelo");
		    label14.setBounds(23, 290, 150, 14);
		    contentPane.add(label14);
		    
		    JLabel label15 = new JLabel("Codigo de Modelo");
		    label15.setBounds(23, 310, 150, 14);
		    contentPane.add(label15);
		    
		    JLabel label16 = new JLabel("Codigo de Modelo");
		    label16.setBounds(23, 330, 150, 14);
		    contentPane.add(label16);
		    
		    JLabel label17 = new JLabel("Codigo de Modelo");
		    label17.setBounds(23, 350, 150, 14);
		    contentPane.add(label17);
		    
		    JLabel label18 = new JLabel("Codigo de Modelo");
		    label18.setBounds(23, 370, 150, 14);
		    contentPane.add(label18);
		    
		    JLabel label19 = new JLabel("Codigo de Modelo");
		    label19.setBounds(23, 390, 150, 14);
		    contentPane.add(label19);
		    
		    JLabel label20 = new JLabel("Codigo de Modelo");
		    label20.setBounds(23, 410, 150, 14);
		    contentPane.add(label20);
		    
		    JLabel label21 = new JLabel("Codigo de Modelo");
		    label21.setBounds(23, 430, 150, 14);
		    contentPane.add(label21);
		    
		    JLabel label22 = new JLabel("Codigo de Modelo");
		    label22.setBounds(23, 450, 150, 14);
		    contentPane.add(label22);
		    
		    JLabel label23 = new JLabel("Codigo de Modelo");
		    label23.setBounds(23, 470, 150, 14);
		    contentPane.add(label23);
		    
		    JLabel label24 = new JLabel("Codigo de Modelo");
		    label24.setBounds(23, 490, 150, 14);
		    contentPane.add(label24);
		    
		    JLabel label25 = new JLabel("Codigo de Modelo");
		    label25.setBounds(23, 510, 150, 14);
		    contentPane.add(label25);
		    
		    JLabel label26 = new JLabel("Codigo de Modelo");
		    label26.setBounds(23, 530, 150, 14);
		    contentPane.add(label26);
		    
		    JLabel label27 = new JLabel("Codigo de Modelo");
		    label27.setBounds(23, 550, 150, 14);
		    contentPane.add(label27);
		    
		    JLabel label28 = new JLabel("Codigo de Modelo");
		    label28.setBounds(23, 570, 150, 14);
		    contentPane.add(label28);
		    
		    JLabel label29 = new JLabel("Codigo de Modelo");
		    label29.setBounds(23, 590, 150, 14);
		    contentPane.add(label29);
		    
		    dato1 = new JTextField();
		    dato1 .setBounds(450, 150, 150, 14);
		    contentPane.add(dato1);
		    dato1 .setColumns(10);
		    
		    dato2 = new JTextField();
		    dato2 .setBounds(450, 170, 150, 14);
		    contentPane.add(dato2);
		    dato2 .setColumns(10);
		    
		    marcodinf = new JTextField();
		    marcodinf .setBounds(247, 30, 193, 20);
		    contentPane.add(marcodinf);
		    marcodinf .setColumns(10);
		    
		    modcodinf = new JTextField();
		    modcodinf .setBounds(247, 50, 193, 20);
		    contentPane.add(modcodinf);
		    modcodinf .setColumns(10);
		    
		    marca = new JTextField();
		    marca .setBounds(247, 70, 193, 20);
		    contentPane.add(marca);
		    marca .setColumns(10);
		    
		    modelo = new JTextField();
		    modelo .setBounds(247, 90, 193, 20);
		    contentPane.add(modelo);
		    modelo .setColumns(10);
		    
		    codigo = new JTextField();
		    codigo .setBounds(247, 110, 193, 20);
		    contentPane.add(codigo);
		    codigo .setColumns(10);
		    
		    grupo = new JTextField();
		    grupo .setBounds(247, 130, 193, 20);
		    contentPane.add(grupo);
		    grupo .setColumns(10);
		    
		    codigorea = new JTextField();
		    codigorea .setBounds(247, 150, 193, 20);
		    contentPane.add(codigorea);
		    codigorea .setColumns(10);
		    
		    anio = new JTextField();
		    anio .setBounds(247, 170, 193, 20);
		    contentPane.add(anio);
		    anio .setColumns(10);
		    
		    val = new JTextField();
		    val .setBounds(247, 190, 193, 20);
		    contentPane.add(val);
		    val .setColumns(10);
		    
		    valanio = new JTextField();
		    valanio .setBounds(247, 210, 193, 20);
		    contentPane.add(valanio);
		    valanio .setColumns(10);
		    
		    val01 = new JTextField();
		    val01 .setBounds(247, 230, 193, 20);
		    contentPane.add(val01);
		    val01 .setColumns(10);
		    
		    val02 = new JTextField();
		    val02 .setBounds(247, 250, 193, 20);
		    contentPane.add(val02);
		    val02 .setColumns(10);
		    
		    val03 = new JTextField();
		    val03 .setBounds(247, 270, 193, 20);
		    contentPane.add(val03);
		    val03 .setColumns(10);
		    
		    val04 = new JTextField();
		    val04 .setBounds(247, 290, 193, 20);
		    contentPane.add(val04);
		    val04 .setColumns(10);
		    
		    val05 = new JTextField();
		    val05 .setBounds(247, 310, 193, 20);
		    contentPane.add(val05);
		    val05 .setColumns(10);
		    
		    val06 = new JTextField();
		    val06 .setBounds(247, 330, 193, 20);
		    contentPane.add(val06);
		    val06 .setColumns(10);
		    
		    val07 = new JTextField();
		    val07 .setBounds(247, 350, 193, 20);
		    contentPane.add(val07);
		    val07 .setColumns(10);
		    
		    val08 = new JTextField();
		    val08 .setBounds(247, 370, 193, 20);
		    contentPane.add(val08);
		    val08 .setColumns(10);
		    
		    val09 = new JTextField();
		    val09 .setBounds(247, 390, 193, 20);
		    contentPane.add(val09);
		    val09 .setColumns(10);
		    
		    val10 = new JTextField();
		    val10 .setBounds(247, 410, 193, 20);
		    contentPane.add(val10);
		    val10 .setColumns(10);
		    
		    val11 = new JTextField();
		    val11 .setBounds(247, 430, 193, 20);
		    contentPane.add(val11);
		    val11 .setColumns(10);
		    
		    val12 = new JTextField();
		    val12 .setBounds(247, 450, 193, 20);
		    contentPane.add(val12);
		    val12 .setColumns(10);
		    
		    val13 = new JTextField();
		    val13 .setBounds(247, 470, 193, 20);
		    contentPane.add(val13);
		    val13 .setColumns(10);
		    
		    val14 = new JTextField();
		    val14 .setBounds(247, 490, 193, 20);
		    contentPane.add(val14);
		    val14 .setColumns(10);
		    
		    val15 = new JTextField();
		    val15 .setBounds(247, 510, 193, 20);
		    contentPane.add(val15);
		    val15 .setColumns(10);
		    
		    val16 = new JTextField();
		    val16 .setBounds(247, 530, 193, 20);
		    contentPane.add(val16);
		    val16 .setColumns(10);
		    
		    val17 = new JTextField();
		    val17 .setBounds(247, 550, 193, 20);
		    contentPane.add(val17);
		    val17 .setColumns(10);
		    
		    val18 = new JTextField();
		    val18 .setBounds(247, 570, 193, 20);
		    contentPane.add(val18);
		    val18 .setColumns(10);
		    
		    val19 = new JTextField();
		    val19 .setBounds(247, 590, 193, 20);
		    contentPane.add(val19);
		    val19 .setColumns(10);
		    
		    labelResultado = new JLabel("resultado");
		    labelResultado.setBounds(450, 50, 150, 14);
		    contentPane.add(labelResultado);
		    
		    JButton btnAlta = new JButton("Alta");
		    btnAlta.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent arg0) {
		        labelResultado.setText("");        
		        try {
		          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/pruaba","root" ,"password");
		          Statement comando=conexion.createStatement();
		          comando.executeUpdate("insert into Datos(MarCodInf,ModCodInf,MarDesInf,ModDesInf,InfCodigo,InfGroup,InfCodRea,InfAnio00,InfVal00,infValAnio00,InfVal01,InfVal02,InfVal03,InfVal04,InfVal05,InfVal06,InfVal07,InfVal08,InfVal09,InfVal10,InfVal11,InfVal12,InfVal13,InfVal14,InfVal15,InfVal16,InfVal17,InfVal18,InfVal19) values ('"+marcodinf.getText()+"','"+modcodinf.getText()+"','"+marca.getText()+"','"+modelo.getText()+"','"+codigo.getText()+"','"+grupo.getText()+"','"+codigorea.getText()+"','"+anio.getText()+"','"+val.getText()+"','"+valanio.getText()+"','"+val01.getText()+"','"+val02.getText()+"','"+val03.getText()+"','"+val04.getText()+"','"+val05.getText()+"','"+val06.getText()+"','"+val07.getText()+"','"+val08.getText()+"','"+val09.getText()+"','"+val10.getText()+"','"+val11.getText()+"','"+val12.getText()+"','"+val13.getText()+"','"+val14.getText()+"','"+val15.getText()+"','"+val16.getText()+"','"+val17.getText()+"','"+val18.getText()+"','"+val19.getText()+"')");
		          conexion.close();
		          labelResultado.setText("se registraron los datos");
		          marcodinf.setText("");
		          modcodinf.setText("");
		          marca.setText("");
		          modelo.setText("");
		          codigo.setText("");
		          grupo.setText("");
		          codigorea.setText("");
		          anio.setText("");
		          val.setText("");
		          valanio.setText("");
		          val01.setText("");
		          val02.setText("");
		          val03.setText("");
		          val04.setText("");
		          val05.setText("");
		          val06.setText("");
		          val07.setText("");
		          val08.setText("");
		          val09.setText("");
		          val10.setText("");
		          val11.setText("");
		          val12.setText("");
		          val13.setText("");
		          val14.setText("");
		          val15.setText("");
		          val16.setText("");
		          val17.setText("");
		          val18.setText("");
		          val19.setText("");
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }
		      }
		    });
		    btnAlta.setBounds(450, 30, 150, 14);
		    contentPane.add(btnAlta);	    
		    
		    JButton borrar = new JButton("Borrar");
		    borrar.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        labelResultado.setText("");
		        try {
		        	Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/pruaba","root" ,"password");
			          Statement comando=conexion.createStatement();
			          int cantidad = comando.executeUpdate("delete from Datos where MarCodInf= '"+marcodinf.getText()+"' AND ModCodInf= '"+modcodinf.getText()+"'  ");			          conexion.close();
		          if (cantidad==1) {      
		        	  
		        	  
		            labelResultado.setText("Se borro el artículo con dicho código");
		              marcodinf.setText("");
			          modcodinf.setText("");
			          marca.setText("");
			          modelo.setText("");
			          codigo.setText("");
			          grupo.setText("");
			          codigorea.setText("");
			          anio.setText("");
			          val.setText("");
			          valanio.setText("");
			          val01.setText("");
			          val02.setText("");
			          val03.setText("");
			          val04.setText("");
			          val05.setText("");
			          val06.setText("");
			          val07.setText("");
			          val08.setText("");
			          val09.setText("");
			          val10.setText("");
			          val11.setText("");
			          val12.setText("");
			          val13.setText("");
			          val14.setText("");
			          val15.setText("");
			          val16.setText("");
			          val17.setText("");
			          val18.setText("");
			          val19.setText("");
		          } else {
		            labelResultado.setText("No existe un artículo con dicho código");
			          
		          }
		          conexion.close();
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }                
		      }
		    });
		    borrar.setBounds(450, 70, 150, 14);
		    contentPane.add(borrar);
		    cargarDriver();
		    
		    
		    JButton modificar = new JButton("Modificar");
		    modificar.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        labelResultado.setText("");
		        try {
			          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/pruaba","root" ,"password");
		          Statement comando=conexion.createStatement();
		          int cantidad = comando.executeUpdate("update Datos set MarDesInf='"+marca.getText()+"',"+"ModDesInf="+modelo.getText()+","+"InfCodigo="+codigo.getText()+","+"InfGroup="+grupo.getText()+" where MarCodInf= '"+marcodinf.getText()+"' AND ModCodInf= '"+modcodinf.getText()+"' ");
		          conexion.close();
		          if (cantidad==1) {
		            labelResultado.setText("Se modifico la descripcion y el precio del artículo con dicho código");
		          } else {
		            labelResultado.setText("No existe un artículo con dicho código");
		          }
		          conexion.close();
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }                
		      }
		    });
		    modificar.setBounds(450, 90, 150, 14);
		    contentPane.add(modificar);
		    cargarDriver();
		  
		    JButton btnConsulta = new JButton("Consulta CodMarca y ModModelo");
		    btnConsulta.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent arg0) {
		        labelResultado.setText("");
		        marcodinf.setText("");
		        modcodinf.setText("");      
		        try {
			          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/pruaba","root" ,"password");
		          Statement comando=conexion.createStatement();
		          ResultSet registro = comando.executeQuery("select * from Datos where MarCodInf= '"+dato1.getText()+"' AND ModCodInf= '"+dato2.getText()+"'  ");
		          if (registro.next()==true) {
		        	  marcodinf.setText(registro.getString("MarCodInf"));
		        	  modcodinf.setText(registro.getString("ModCodInf"));
			          marca.setText(registro.getString("MarDesInf"));
			          modelo.setText(registro.getString("ModDesInf"));
			          codigo.setText(registro.getString("InfCodigo"));
			          grupo.setText(registro.getString("InfGroup"));
			          codigorea.setText(registro.getString("InfCodRea"));
			          anio.setText(registro.getString("InfAnio00"));
			          val.setText(registro.getString("InfVal00"));
			          valanio.setText(registro.getString("InfValAnio00"));
			          val01.setText(registro.getString("InfVal01"));
			          val02.setText(registro.getString("InfVal02"));
			          val03.setText(registro.getString("InfVal03"));
			          val04.setText(registro.getString("InfVal04"));
			          val05.setText(registro.getString("InfVal05"));
			          val06.setText(registro.getString("InfVal06"));
			          val07.setText(registro.getString("InfVal07"));
			          val08.setText(registro.getString("InfVal08"));
			          val09.setText(registro.getString("InfVal09"));
			          val10.setText(registro.getString("InfVal10"));
			          val11.setText(registro.getString("InfVal11"));
			          val12.setText(registro.getString("InfVal12"));
			          val13.setText(registro.getString("InfVal13"));
			          val14.setText(registro.getString("InfVal14"));
			          val15.setText(registro.getString("InfVal15"));
			          val16.setText(registro.getString("InfVal16"));
			          val17.setText(registro.getString("InfVal17"));
			          val18.setText(registro.getString("InfVal18"));
			          val19.setText(registro.getString("InfVal19"));
		          } else {
		            labelResultado.setText("No existe un artículo con dicho código");
		          }
		          conexion.close();
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }
		      }
		    });
		    btnConsulta.setBounds(450, 120, 300, 14);
		    contentPane.add(btnConsulta);
		    
		    
	  		}
	  		private void cargarDriver() {
			    try {
			      Class.forName("com.mysql.cj.jdbc.Driver");
			    }catch(Exception ex) {
			      setTitle(ex.toString());
			    }
			  }
	

}
