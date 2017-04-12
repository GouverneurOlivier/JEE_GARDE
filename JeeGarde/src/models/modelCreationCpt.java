package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import beans.beanCpt;
import beans.beanCreation;

public class modelCreationCpt {

	
	public void creationCptFamille(beanCpt famille ) { 

		char[] chars = "abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString();
		
		try {
			PreparedStatement preparedStatement = modelConnectionBDD.loadDataBase().prepareStatement
					("insert into cpt_famille(User_famille,famille) values (?,?);");
			preparedStatement.setString(1,output);
			preparedStatement.setString(2,famille.getFamille());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void CreationCptUser(beanCreation modelCrea,beanCpt famille){
		
		
		char[] chars = "abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 15; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String usertemp = sb.toString();
		
		StringBuilder sb1 = new StringBuilder();
		Random random1 = new Random();
		for (int i = 0; i < 15; i++) {
		    char c = chars[random1.nextInt(chars.length)];
		    sb1.append(c);
		}
		String passtemp = sb1.toString();
		
		try {

			PreparedStatement preparedStatement = modelConnectionBDD.loadDataBase().prepareStatement
					("insert into users(id_famille,user,password,Nom,Prenom,Email,CodePostal) values"
							+ " ((select cpt_famille.id_famille from garde_alterne.cpt_famille where cpt_famille.famille=?),?,?,?,?,?,? )");
			
			preparedStatement.setString(1,famille.getFamille());
			preparedStatement.setString(2,usertemp);
			preparedStatement.setString(3,passtemp);
			preparedStatement.setString(4,modelCrea.getNom());
			preparedStatement.setString(5,modelCrea.getPrenom());
			preparedStatement.setString(6,modelCrea.getEmail());
			preparedStatement.setString(7,modelCrea.getCodePostal());
			
			preparedStatement.executeUpdate();

			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}


